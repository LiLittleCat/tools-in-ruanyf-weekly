package com.lilittlecat;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.StrUtil;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
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
//        try {
//            app.createAllContent();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private void createAllContent() throws IOException {
        String dir = System.getProperty("user.dir");

        // 获取当前最新期数
        HttpResponse<String> response = Unirest.get(README_URL).asString();
        if (!response.isSuccess()) {
            return;
        }

        String readme = response.getBody();
        String currentPublishNumberString = StrUtil.subBetween(readme, "- 第", "期").trim();
        if (StrUtil.isBlank(currentPublishNumberString)) {
            return;
        }
        int currentPublishNumber = Integer.parseInt(currentPublishNumberString);

        // 创建quotes.md文件
        File quotesFile = new File(dir + "/docs/quotes.md");
        if (!quotesFile.exists()) {
            Files.createFile(quotesFile.toPath());
        }

        // 初始化quotes.md文件内容
        StringBuilder allQuotesContent = new StringBuilder();
        allQuotesContent.append("# 言论\n\n");

        // 遍历每一期，提取言论部分
        for (int i = currentPublishNumber; i >= 1; i--) {
            HttpResponse<String> contentResponse = Unirest.get(StrUtil.replace(URL, "NUMBER", String.valueOf(i)))
                    .asString();

            if (contentResponse.isSuccess()) {
                String body = contentResponse.getBody();
                String title = body.split("\n")[0].replace("# ", "");
                String quoteTitle = "## [" + title + "](" +
                        StrUtil.replace(GITHUB_URL, "NUMBER", String.valueOf(i)) + "#言论)";

                // 提取言论部分
                final String quotesContent = StrUtil.subBetween(body, "## 言论", "## ");

                if (StrUtil.isNotBlank(quotesContent)) {
                    allQuotesContent.append(quoteTitle).append("\n").append(quotesContent).append("\n");
                }

                System.out.println("已处理第 " + i + " 期，有言论：" + StrUtil.isNotBlank(quotesContent));
            }
            // 休眠一小段时间，避免请求过快
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // 写入quotes.md文件
        FileWriter quotesWriter = FileWriter.create(quotesFile);
        quotesWriter.write(allQuotesContent.toString());

        // 更新README.md和index.md
        updateReadmeAndIndex(dir, "quotes.md", "言论");

        System.out.println("所有言论已提取完成并写入 quotes.md 文件");
    }

    private void updateReadmeAndIndex(String dir, String fileName, String sectionName) throws IOException {
        // 读取README.md
        Path readmePath = Paths.get(dir + "/README.md");
        List<String> readmeLines = Files.readAllLines(readmePath);

        // 检查是否已有对应部分
        boolean hasSection = false;
        for (String line : readmeLines) {
            if (line.contains("docs/" + fileName) && line.contains(sectionName)) {
                hasSection = true;
                break;
            }
        }

        // 如果没有，添加新部分
        if (!hasSection) {
            List<String> newReadmeLines = new ArrayList<>();
            boolean navigationSectionFound = false;

            for (String line : readmeLines) {
                newReadmeLines.add(line);

                // 在导航部分之后添加新链接
                if (line.contains("## 导航") && !navigationSectionFound) {
                    navigationSectionFound = true;
                } else if (navigationSectionFound && line.startsWith("- [")) {
                    // 在第一个导航项后添加新链接
                    newReadmeLines.add("- [" + sectionName + "](docs/" + fileName + ")");
                    navigationSectionFound = false;
                }
            }

            // 写回README.md
            Files.write(readmePath, newReadmeLines);

            // 同步更新index.md
            File indexFile = new File(dir + "/docs/index.md");
            FileUtil.copy(new File(dir + "/README.md"), indexFile, true);
        }
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
//            int currentPublishNumber = 347;
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
            StringBuilder currentQuotesContent = new StringBuilder();
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
                String quotesTitle =
                        "## ["
                                + body.split("\n")[0].replace("# ", "")
                                + "]("
                                + StrUtil.replace(GITHUB_URL, "NUMBER", String.valueOf(currentPublishNumber))
                                + "#言论)";
                final String toolsContent = StrUtil.subBetween(body, "## 工具", "## ");
                final String resourceContent = StrUtil.subBetween(body, "## 资源", "## ");
                final String quotesContent = StrUtil.subBetween(body, "## 言论", "## ");
                currentReadmeContent.append(title).append("\n");
                if (StrUtil.isNotBlank(toolsContent)) {
                    currentToolsContent.insert(0, toolsTitle + "\n" + toolsContent);
                    currentReadmeContent.append("### 工具\n").append(toolsContent).append("\n");
                }
                if (StrUtil.isNotBlank(resourceContent)) {
                    currentResourcesContent.insert(0, resourcesTitle + "\n" + resourceContent);
                    currentReadmeContent.append("### 资源\n").append(resourceContent).append("\n");
                }
                if (StrUtil.isNotBlank(quotesContent)) {
                    currentQuotesContent.insert(0, quotesTitle + "\n" + quotesContent);
                    currentReadmeContent.append("### 言论\n").append(quotesContent).append("\n");
                }
                addNewContentToFile(dir + "/docs/tools.md", currentToolsContent.toString());
                addNewContentToFile(dir + "/docs/resources.md", currentResourcesContent.toString());
                addNewContentToFile(dir + "/docs/quotes.md", currentQuotesContent.toString());

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
