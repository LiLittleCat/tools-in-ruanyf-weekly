package com.lilittlecat;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.StrUtil;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author LiLittleCat
 * @link <a href="https://github.com/LiLittleCat">https://github.com/LiLittleCat</a>
 * @since 2022/8/25
 */
public class App {
    public static final String URL = "https://raw.githubusercontent.com/ruanyf/weekly/master/docs/issue-NUMBER.md";
    public static final String README_URL = "https://raw.githubusercontent.com/ruanyf/weekly/master/README.md";
    public static final String GITHUB_URL = "https://github.com/ruanyf/weekly/blob/master/docs/issue-NUMBER.md";

    public static void main(String[] args) {
        App app = new App();
        app.addContent();
    }

    private void addNewContentToFile(String path, String content) throws IOException {
        Path filePath = Paths.get(path);
        // Read all lines from the file
        List<String> lines = Files.readAllLines(filePath);
        // Insert new content at the third line
        List<String> newLines = new ArrayList<>();
        newLines.add(lines.get(0));
        newLines.add(lines.get(1));
        newLines.add(content);
        newLines.addAll(lines.subList(2, lines.size()));
        // Write the modified content back to the file
        Files.write(filePath, newLines);
    }

    public void addContent() {
        String dir = System.getProperty("user.dir");
        try (
                RandomAccessFile thisReadme = new RandomAccessFile(dir + "/README.md", "rw")
        ) {
            // Get current publish number
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            Response response = client.newCall(
                            new Request.Builder()
                                    .url(README_URL)
                                    .method("GET", null)
                                    .build())
                    .execute();
            if (!response.isSuccessful()) {
                return;
            }
            String readme = Objects.requireNonNull(response.body()).string();
            String currentPublishNumberString = StrUtil.subBetween(readme, "- 第", "期").trim();
            if (StrUtil.isBlank(currentPublishNumberString)) {
                return;
            }
            int currentPublishNumber = Integer.parseInt(currentPublishNumberString);
//            int currentPublishNumber = 336;
            // Get current handled number
            FileChannel thisReadmeChannel = thisReadme.getChannel();
            ByteBuffer thisReadmeBuffer = ByteBuffer.allocate((int) (thisReadme.length()));
            thisReadmeChannel.read(thisReadmeBuffer);
            String oldReadme = new String(thisReadmeBuffer.array(), StandardCharsets.UTF_8);
            int oldNumber = Integer.parseInt(StrUtil.subBetween(oldReadme, "<currentVersion>", "</currentVersion>"));
            if (oldNumber == currentPublishNumber) {
                return;
            }
            StringBuilder currentToolsContent = new StringBuilder();
            StringBuilder currentResourcesContent = new StringBuilder();
            StringBuilder currentReadmeContent = new StringBuilder();
            Request request = new Request.Builder()
                    .url(StrUtil.replace(URL, "NUMBER", String.valueOf(currentPublishNumber)))
                    .method("GET", null)
                    .build();
            Response contentResponse = client.newCall(request).execute();
            if (contentResponse.isSuccessful()) {
                String body = Objects.requireNonNull(contentResponse.body()).string();
                String title =
                        "# ["
                                + body.split("\n")[0].replace("# ", "")
                                + "]("
                                + StrUtil.replace(GITHUB_URL, "NUMBER", String.valueOf(currentPublishNumber))
                                + ")";
                String toolsTitle =
                        "## ["
                                + body.split("\n")[0].replace("# ", "")
                                + "]("
                                + StrUtil.replace(GITHUB_URL, "NUMBER", String.valueOf(currentPublishNumber))
                                + "#工具)";
                String resourcesTitle =
                        "## ["
                                + body.split("\n")[0].replace("# ", "")
                                + "]("
                                + StrUtil.replace(GITHUB_URL, "NUMBER", String.valueOf(currentPublishNumber))
                                + "#资源)";
                final String toolsContent = StrUtil.subBetween(body, "## 工具", "## ");
                final String resourceContent = StrUtil.subBetween(body, "## 资源", "## ");
                currentReadmeContent.append(title).append("\n");
                if (StrUtil.isNotBlank(toolsContent)) {
                    currentToolsContent.insert(0, toolsTitle + "\n" + toolsContent);
                    currentReadmeContent.append("### 工具\n").append(toolsContent).append("\n");
                }
                if (StrUtil.isNotBlank(resourceContent)) {
                    currentResourcesContent.insert(0, resourcesTitle + "\n" + resourceContent);
                    currentReadmeContent.append("### 资源\n").append(resourceContent).append("\n");
                }
                addNewContentToFile(dir + "/docs/tools.md", currentToolsContent.toString());
                addNewContentToFile(dir + "/docs/resources.md", currentResourcesContent.toString());

                // Update README.md
                String begin = "<!-- Begin -->";
                String end = "<!-- End -->";
                oldReadme = oldReadme.replace("<currentVersion>" + oldNumber + "</currentVersion>",
                        "<currentVersion>" + currentPublishNumber + "</currentVersion>");
                File readmeFile = new File(dir + "/README.md");
                File indexFile = new File(dir + "/docs/index.md");
                FileWriter fileWriter = FileWriter.create(readmeFile);
                fileWriter.write(oldReadme.split(begin)[0] + begin + "\n" +
                        currentReadmeContent + end + oldReadme.split(end)[1]);
                FileUtil.copy(readmeFile, indexFile, true);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
