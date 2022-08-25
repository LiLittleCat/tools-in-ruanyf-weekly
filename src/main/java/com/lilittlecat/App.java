package com.lilittlecat;

import cn.hutool.core.util.StrUtil;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Properties;

/**
 * @author LiLittleCat
 * @link <a href="https://github.com/LiLittleCat">https://github.com/LiLittleCat</a>
 * @since 2022/8/25
 */
public class App {
    public static final String URL = "https://raw.fastgit.org/ruanyf/weekly/master/docs/issue-NUMBER.md";
    public static final String GITHUB_URL = "https://github.com/ruanyf/weekly/blob/master/docs/issue-NUMBER.md";

    public static void main(String[] args) {
        final App app = new App();
//        app.addContent();
        app.addAllContent();
    }

    public void addContent() {
        Properties props = new Properties();
        InputStreamReader inputStreamReader;
        final String dir = System.getProperty("user.dir");
        try (InputStream in = getClass().getResourceAsStream("/app.properties");
             RandomAccessFile tools = new RandomAccessFile(dir + "/doc/工具.md", "rw");
             RandomAccessFile resources = new RandomAccessFile(dir + "/doc/资源.md", "rw");
        ) {
            FileChannel toolsChannel = tools.getChannel();
            FileChannel resourcesChannel = resources.getChannel();
            assert in != null;
            inputStreamReader = new InputStreamReader(in, StandardCharsets.UTF_8);
            props.load(inputStreamReader);
            int currentNumber = Integer.parseInt((String) props.get("currentNumber"));

            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            StringBuilder t = new StringBuilder();
            StringBuilder r = new StringBuilder();
            Request request = new Request.Builder()
                    .url(StrUtil.replace(URL, "NUMBER", String.valueOf(currentNumber)))
                    .method("GET", null)
                    .build();
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String body = Objects.requireNonNull(response.body()).string();
                String toolsTitle =
                        "# ["
                                + body.split("\n")[0].replace("# ", "")
                                + "]("
                                + StrUtil.replace(GITHUB_URL, "NUMBER", String.valueOf(currentNumber))
                                + "#工具)";
                String resourcesTitle =
                        "# ["
                                + body.split("\n")[0].replace("# ", "")
                                + "]("
                                + StrUtil.replace(GITHUB_URL, "NUMBER", String.valueOf(currentNumber))
                                + "#资源)";
                final String toolsContent = StrUtil.subBetween(body, "## 工具", "## ");
                final String resourceContent = StrUtil.subBetween(body, "## 资源", "## ");
                if (StrUtil.isNotBlank(toolsContent)) {
                    t.insert(0, toolsTitle + "\n" + toolsContent);
                }
                if (StrUtil.isNotBlank(resourceContent)) {
                    r.insert(0, resourcesTitle + "\n" + resourceContent);
                }

            }
            byte[] toolsBytes = t.toString().getBytes(StandardCharsets.UTF_8);
            byte[] resourcesBytes = r.toString().getBytes(StandardCharsets.UTF_8);
            toolsChannel.write(new ByteBuffer[]{ByteBuffer.wrap(toolsBytes)}, 0, toolsBytes.length);
            resourcesChannel.write(new ByteBuffer[]{ByteBuffer.wrap(resourcesBytes)}, 0, resourcesBytes.length);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addAllContent() {
        Properties props = new Properties();
        InputStreamReader inputStreamReader;
        final String dir = System.getProperty("user.dir");
        try (InputStream in = getClass().getResourceAsStream("/app.properties");
             RandomAccessFile tools = new RandomAccessFile(dir + "/doc/工具.md", "rw");
             RandomAccessFile resources = new RandomAccessFile(dir + "/doc/资源.md", "rw");
        ) {
            FileChannel toolsChannel = tools.getChannel();
            FileChannel resourcesChannel = resources.getChannel();
            assert in != null;
            inputStreamReader = new InputStreamReader(in, StandardCharsets.UTF_8);
            props.load(inputStreamReader);
//            int currentNumber = Integer.parseInt((String) props.get("currentNumber"));
            int currentNumber = 218;


            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            StringBuilder t = new StringBuilder();
            StringBuilder r = new StringBuilder();
            for (int i = 1; i <= currentNumber; i++) {
                System.out.println("handing-" + i);
                MediaType mediaType = MediaType.parse("text/plain");
                Request request = new Request.Builder()
                        .url(StrUtil.replace(URL, "NUMBER", String.valueOf(i)))
//                        .url("https://raw.fastgit.org/ruanyf/weekly/master/docs/issue-218.md")
                        .method("GET", null)
                        .build();
                Response response = client.newCall(request).execute();
                if (response.isSuccessful()) {
                    String body = Objects.requireNonNull(response.body()).string();
                    String toolsTitle =
                            "# ["
                                    + body.split("\n")[0].replace("# ", "")
                                    + "]("
                                    + StrUtil.replace(GITHUB_URL, "NUMBER", String.valueOf(i))
                                    + "#工具)";
                    String resourcesTitle =
                            "# ["
                                    + body.split("\n")[0].replace("# ", "")
                                    + "]("
                                    + StrUtil.replace(GITHUB_URL, "NUMBER", String.valueOf(i))
                                    + "#资源)";
                    final String toolsContent = StrUtil.subBetween(body, "## 工具", "## ");
                    final String resourceContent = StrUtil.subBetween(body, "## 资源", "## ");
                    if (StrUtil.isNotBlank(toolsContent)) {
                        t.insert(0, toolsTitle + "\n" + toolsContent);
                    }
                    if (StrUtil.isNotBlank(resourceContent)) {
                        r.insert(0, resourcesTitle + "\n" + resourceContent);
                    }
                }
            }
            toolsChannel.write(ByteBuffer.wrap(t.toString().getBytes(StandardCharsets.UTF_8)));
            resourcesChannel.write(ByteBuffer.wrap(r.toString().getBytes(StandardCharsets.UTF_8)));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
