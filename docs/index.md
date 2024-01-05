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
<!-- <currentVersion>285</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 285 期）：为什么 PPT 不如备忘录](https://github.com/ruanyf/weekly/blob/master/docs/issue-285.md)
### 工具


1、[vx.dev](https://github.com/Yuyz0112/vx.dev)

![](https://cdn.beekka.com/blogimg/asset/202312/bg2023123001.webp)

Vercel 的 [v0.dev](https://v0.dev/) 可以通过输入需求，直接生成网站。这里是它的一个开源仿制品，通过逆向工程进行模仿，详见[介绍文章](https://step-saga-examples.pages.dev/v0-dev-reverse-engineer/)。([@Yuyz0112](https://github.com/ruanyf/weekly/issues/3813) 投稿)

2、[Triangle Patterns](https://sinqi.tools/triangle)

![](https://cdn.beekka.com/blogimg/asset/202312/bg2023123002.webp)

三角渐变图案的生成工具。（[@zerosoul](https://github.com/ruanyf/weekly/issues/3815) 投稿）

3、[Copilot-GPT4-service](https://github.com/aaamoon/copilot-gpt4-service)

![](https://cdn.beekka.com/blogimg/asset/202312/bg2023123003.webp)

作者发现 Github Copilot Chat 的底层是调用 ChatGPT 接口，因此做了这个工具。

它可以将 ChatGPT 请求转换为 Github Copilot Chat 的请求。只要拥有 Github Copilot 账号，就能无限制使用 ChatGPT 的 GPT-4 模型。（[@aaamoon](https://github.com/ruanyf/weekly/issues/3820) 投稿）

4、[Bluestone Markdown](https://www.bluemd.me/)（青石）

![](https://cdn.beekka.com/blogimg/asset/202312/bg2023123004.webp)

一个所见即所得的 Markdown 桌面编辑器，集成了 Mermaid 图形与 Katex 公式，支持明亮和暗黑风格。（[@1943time](https://github.com/ruanyf/weekly/issues/3821) 投稿）

5、[resume-json-pdf](https://github.com/RylanBot/resume-json-pdf)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010301.webp)

通过 JSON 文件，在线生成 PDF 简历。（[@RylanBot](https://github.com/ruanyf/weekly/issues/3826) 投稿）

这里还有一个类似的工具 [Faultier-CV](https://github.com/i5heu/Faultier-CV)，通过 Markdown 格式编写简历，并能[实时预览](https://i5heu.github.io/Faultier-CV/dist/index.html)。

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010302.webp)

6、[schedule-x](https://schedule-x.dev/demos/calendar)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010303.webp)

谷歌日历的[开源](https://github.com/schedule-x/schedule-x)模仿品。

7、[fabritor](https://github.com/sleepy-zone/fabritor-web)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010308.webp)

一款基于 fabric.js 的创意图片编辑器，支持自己部署。（[@sleepy-zone](https://github.com/ruanyf/weekly/issues/3831) 投稿）

8、[Nostalgist.js](https://github.com/arianrhodsandlot/nostalgist)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010310.webp)

一个在浏览器中运行怀旧游戏主机模拟器的 JavaScript 库，比如运行任天堂FC 模拟器、世嘉 MD 模拟器、街机模拟器等等。（[@arianrhodsandlot](https://github.com/ruanyf/weekly/issues/3830) 投稿）

9、[stt](https://github.com/jianchang512/stt)

离线运行的本地语音识别转文字工具，基于 fast-whipser 模型。（[@jianchang512](https://github.com/ruanyf/weekly/issues/3829) 投稿）

10、[Vue TSX Admin](https://github.com/manyuemeiquqi/vue-tsx-admin)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010311.webp)

一款开源的后台管理系统的前端模版，基于 Vue3 + TSX。（[@manyuemeiquqi](https://github.com/ruanyf/weekly/issues/3833) 投稿）

11、[HTTPS Certification generator](https://selfcertificationhub.github.io/selfcertificationhub/generate)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010317.webp)

这个在线工具可以一键生成 IP 地址的自签名 HTTPS 证书，适合用于开发环境。（[@selfcertificationhub](https://github.com/ruanyf/weekly/issues/3839) 投稿）

12、[cmd-wrapped](https://github.com/YiNNx/cmd-wrapped)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010318.webp)

这个工具可以读取你的命令行操作的历史记录，生成一份年度总结。支持 Zsh 和 Bash，并可指定年份。（[@YiNNx](https://github.com/ruanyf/weekly/issues/3840) 投稿）

13、[mainonly](https://github.com/jerrylususu/mainonly)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010320.webp)

一个浏览器 Bookmarklet（书签工具），用户选中一个页面元素，它可以隐藏其他元素，适合用来专注阅读。（[@jerrylususu](https://github.com/ruanyf/weekly/issues/3845) 投稿）


### 资源


1、[中国历朝代视频讲解](https://www.historyline.online/)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010309.webp)

一个[开源](https://github.com/liujuntao123/chines-history-video)网站，将 BiliBili 上面综合数据最高的一些中国历史视频，以时间轴的方式呈现。（[@liujuntao123](https://github.com/ruanyf/weekly/issues/3836) 投稿）

2、[YUERGS](https://hougiser.gitee.io/music-score/)

![](https://cdn.beekka.com/blogimg/asset/202401/bg2024010312.webp)

作者为了解决自学吉他过程遇到的痛点，开发了这个网站，支持吉他谱滚动播放、吉他调音、查和弦、节拍器、扒歌等相关功能。（[@ly15927086342](https://github.com/ruanyf/weekly/issues/3834) 投稿）

3、[文本编辑器实时协同的原理和实现](https://www.aadhav.me/posts/collaborative-editor)（英文）

![](https://cdn.beekka.com/blogimg/asset/202308/bg2023081302.webp)

文本编辑器如何支持多人实时编辑？本文以示例讲解原理。

4、[世界上最大的纽约市照片](https://www.earthcam.net/projects/empirestatebuilding/gigapixelpanorama/2021/)

![](https://cdn.beekka.com/blogimg/asset/202311/bg2023111314.webp)

360 度的纽约全景照片，达到了800亿像素，支持移动和缩放。

5、[Beej 的网络概念指南](https://beej.us/guide/bgnet0/html/split/)（Beej's Guide to Network Concepts）

![](https://cdn.beekka.com/blogimg/asset/202311/bg2023110901.webp)

著名技术作者 Beej 新发布的计算机网络底层概念的英文教程。


<!-- End -->
