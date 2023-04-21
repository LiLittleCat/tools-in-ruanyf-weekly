# 阮一峰老师科技爱好者周刊「工具」和「资源」汇总

## 前言
很喜欢阮一峰老师的 [科技爱好者周刊](https://github.com/ruanyf/weekly)，尤其是「工具」和「资源」部分内容，非常有趣且实用。 

但是到目前为止周刊已经太多期，苦于查找困难，特将其汇总于此，方便查阅。

## 汇总
由于汇总内容太多图片，使用 GitHub 打开 Markdown 文件时会造成加载缓慢，建议使用静态页面查看，或者下载到本地查看。

静态页面：
[https://lilittlecat.github.io/tools-in-ruanyf-weekly/](https://lilittlecat.github.io/tools-in-ruanyf-weekly/)

源文件地址：
- [工具](https://cdn.jsdelivr.net/gh/LiLittleCat/tools-in-ruanyf-weekly/docs/tools.md)
- [资源](https://cdn.jsdelivr.net/gh/LiLittleCat/tools-in-ruanyf-weekly/docs/resources.md)

## 最新一期
<!-- <currentVersion>251</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 251 期）：国产单板机值得推荐](https://github.com/ruanyf/weekly/blob/master/docs/issue-251.md)
### 工具


1、[nango](https://www.nango.dev/)

![](https://cdn.beekka.com/blogimg/asset/202302/bg2023020804.webp)

一个[开源](https://github.com/NangoHQ/nango)的 Web 服务，自动获取和管理各种 OAuth 认证的 token，可以自己架设。

2、[docker-rollout](https://github.com/Wowu/docker-rollout)

这个工具可以不停机更新 Docker Compose 里面的某个服务。原理是同时新建两个实例，用已更新的实例替换未更新的实例。

3、[Web LLM](https://mlc.ai/web-llm/)

![](https://cdn.beekka.com/blogimg/asset/202304/bg2023041601.webp)

这个软件通过 WebGPU API，在浏览器里面运行 LLM 模型，可以离线运行，并且不限定模型。

当然，它不能用来训练大模型，而且表现肯定不如 ChatGPT，但是能在浏览器里面运行，大大降低了自己架设 LLM 的门槛，而且非常适合一些离线任务（比如总结文档），详见这篇[测评](https://simonwillison.net/2023/Apr/16/web-llm/)。 

4、[OpenAI 接口应用](https://github.com/KiritoCheng/openai-public)

![](https://cdn.beekka.com/blogimg/asset/202304/bg2023041802.webp)

使用 Express 搭建的 Node.js 应用，用来连接 OpenAI API 进行聊天。代码开源。这是前端代码，另有[后端代码](https://github.com/KiritoCheng/openai-server)。（[@KiritoCheng](https://github.com/ruanyf/weekly/issues/3055) 投稿）

5、[Animated Drawings](https://github.com/facebookresearch/AnimatedDrawings)

![](https://cdn.beekka.com/blogimg/asset/202304/bg2023041402.webp)

这个工具使用 AI 模型，将手绘的人物草图变成一段动画。

6、[scrutiny](https://github.com/AnalogJ/scrutiny)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111403.webp)

实时检查硬盘 S.M.A.R.T 健康状态的工具，Docker 安装，自带 Web UI。

7、[browsertunnel](https://github.com/veggiedefender/browsertunnel)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111405.webp)

这个软件可以将用户信息，通过网页的 DNS 请求传回服务器。注意，不是 HTTP 请求，而是使用查询域名的 DNS 请求夹带额外信息。这种监视用户的方法，很难发现，也很难阻止。

8、[Upbase](https://upbase.io/)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111406.webp)

一个网页应用，将项目管理、日程安排、聊天、文档等功能做到了一起，目标是成为团队协作的一站式工具。

9、[Bot Aquarium](https://github.com/fafrd/aquarium)

一个 Linux 系统运行的虚拟机，特点是完全交给 OpenAI 控制。

你描述想用虚拟机完成的任务，它把这段描述传给 OpenAI，并且自动执行返回的命令。等到虚拟机出来了执行结果（比如报错），它再自动把执行结果提交给 OpenAI，不断重复这个过程，直到任务完成。

10、[Autodoc](https://github.com/context-labs/autodoc)

使用 LLM 模型自动生成代码文档。作者的想法是将它加入持续构建，每次代码变更，就会同时自动更新文档。

11、[SceneXplain](https://scenex.jina.ai/)

![](https://cdn.beekka.com/blogimg/asset/202304/bg2023040613.webp)

用户上传一张图片，它会给出图片的详细文字描述，号称比其他模型效果好。


### 资源


1、[计算机程序的构造和解释（JavaScript 版）](https://sourceacademy.org/sicpjs/index)

![](https://cdn.beekka.com/blogimg/asset/202302/bg2023020807.webp)

这是名著《SICP》（计算机程序的构造和解释）一书的官方 JavaScript 版，并且是麻省理工学院的官方版本，可以免费阅读，参见[介绍](https://mitpress.mit.edu/9780262543231/structure-and-interpretation-of-computer-programs/)。

2、[WebGPU 基础知识](https://webgpufundamentals.org/)

![](https://cdn.beekka.com/blogimg/asset/202304/bg2023041603.webp)

这个网站提供 WebGPU 开发知识的英文教程。

3、[GPT Unicorn](https://gpt-unicorn.adamkdean.co.uk/)

![](https://cdn.beekka.com/blogimg/asset/202304/bg2023041404.webp)

这个网站每天让 GPT-4 画一只独角兽（SVG 格式），放上网页，从而记录下模型的进化。

可以看到，即使是同一个模型处理同一个问题，每天返回的结果都是不一样的，上图是4月13日的结果。

4、[Vercel AI Playground](https://play.vercel.ai/)

![](https://cdn.beekka.com/blogimg/asset/202304/bg2023041903.webp)

Vercel 公司架设的 AI 实验页面，用户可以方便地选择不同的模型，比较它们的生成结果。

5、[Playlist Genius](https://www.playlistgeniusai.com/)

![](https://cdn.beekka.com/blogimg/asset/202304/bg2023040201.webp)

描述一下你想听的音乐，该网站会自动生成一张 Spotify 的歌单。


<!-- End -->
