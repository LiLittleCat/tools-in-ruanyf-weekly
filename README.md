# 阮一峰老师科技爱好者周刊汇总

## 前言

很喜欢阮一峰老师的 [科技爱好者周刊](https://github.com/ruanyf/weekly)，尤其是「工具」和「资源」部分内容，非常有趣且实用。

但是到目前为止周刊已经太多期，苦于查找困难，特将其汇总于此，方便查阅。

## 新版站点（推荐）

**在线访问：[https://ruanyf-weekly.yl.do](https://ruanyf-weekly.yl.do)**

基于 [Fumadocs](https://fumadocs.dev)（Astro）重新搭建的栏目汇总站，代码在 [`fumadocs`](https://github.com/LiLittleCat/tools-in-ruanyf-weekly/tree/fumadocs) 分支：

- **栏目汇总**：话题、科技动态、文章、教程、工具、资源、AI 相关、图片、文摘、言论 —— 每个栏目把所有期数的内容集中在一起，按年份分册浏览
- **期刊归档**：每一期的完整原文，按年份归类
- **全文搜索**：支持中文，覆盖所有期数的正文
- 每周五自动同步最新一期，由 Cloudflare Pages 构建发布

## 旧版汇总（mkdocs）

由于汇总内容太多图片，使用 GitHub 打开 Markdown 文件时会造成加载缓慢，建议使用静态页面查看，或者下载到本地查看。

静态页面：
[https://lilittlecat.github.io/tools-in-ruanyf-weekly/](https://lilittlecat.github.io/tools-in-ruanyf-weekly/)

源文件地址：
- [工具](https://cdn.jsdelivr.net/gh/LiLittleCat/tools-in-ruanyf-weekly/docs/tools.md)
- [资源](https://cdn.jsdelivr.net/gh/LiLittleCat/tools-in-ruanyf-weekly/docs/resources.md)

## 最新一期
<!-- <currentVersion>416</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 416 期）：编程已经面目全非](https://github.com/ruanyf/weekly/blob/master/docs/issue-416.md)
### 工具


1、[sslx](https://github.com/glincker/sslx)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101806.webp)

一个检测、查看 HTTPS 证书信息的命令行工具。

2、[Mac.apk](https://github.com/kksimp/Mac.apk)

这个应用可以让 Mac 运行安卓软件，不是虚拟机，也不是模拟器，原理是模拟安卓的系统 API。

3、[siltop](https://github.com/CLoaKY233/siltop)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102110.webp)

一个 macOS 命令行工具，在终端显示各种实时的系统信息：CPU、GPU、内存、电力、温度、存储、网络等。

4、[Little Snitch Mini](https://obdev.at/products/littlesnitch-mini/index.html)

![](https://cdn.beekka.com/blogimg/asset/202307/bg2023071301.webp)

一个 macOS 软件，显示正在运行的所有应用的互联网连接，并可以阻断指定的单个连接。

5、[Pines](https://github.com/thedevdojo/pines)

![](https://cdn.beekka.com/blogimg/asset/202307/bg2023071307.webp)

一个基于 Tailwind 的 UI 组件库。

6、[silkpulse](https://github.com/2234839/silkpulse)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101901.webp)

前端的远程页面调试工具。在页面插入一个脚本，就可以远程打开该网页的控制台，查看各种信息，接收实时报错，适合调试手机端页面。（[@2234839](https://github.com/ruanyf/weekly/issues/12383) 投稿）

7、[TaskbarLyrics](https://github.com/ANYNC/TaskbarLyrics)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101903.webp)

Windows 任务栏实时显示歌词，支持国内主要音乐服务。（[@ANYNC](https://github.com/ruanyf/weekly/issues/12408) 投稿）

8、[Archify](https://github.com/tt-a1i/archify)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101905.webp)

一个 Skill 项目，将一段话、一个计划、一个代码仓库变成互动式网页流程图。（[@zhengxin-wang](https://github.com/ruanyf/weekly/issues/12423) 投稿）

9、[html-to-video](https://github.com/wx4766/html-to-video)

一个把 HTML 网页动画逐帧渲染成 MP4 视频的命令行工具。（[@wx4766](https://github.com/ruanyf/weekly/issues/12486) 投稿）

10、[Parcel](https://github.com/hyphy-void/Parcel)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102101.webp)

基于 Cloudflare Worker 环境的临时文件分享应用，上传文件后生成加密的分享链接，到期自动清理。（[@hyphy-void](https://github.com/ruanyf/weekly/issues/12598) 投稿）

11、[douban-cli](https://github.com/Marvae/douban-cli)

豆瓣的非官方命令行客户端，可以用来获取电影、剧集、图书的数据。（[@Marvae](https://github.com/ruanyf/weekly/issues/12616) 投稿）

12、[wol](https://github.com/Trugamr/wol)

![](https://cdn.beekka.com/blogimg/asset/202501/bg2025012509.webp)

一个命令行工具，可以通过命令行或 Web 界面，唤醒当前局域网里面某台正在休眠的计算机。


### 资源


1、[大鹏书法](https://zidian.dapengshufa.com/)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101902.webp)

查看某个字的各种书法。（[@gengdapeng-beep](https://github.com/ruanyf/weekly/issues/12402) 投稿）

2、[学习 Vim](https://github.com/iggredible/Learn-Vim)（Learn Vim the Smart Way）

![](https://cdn.beekka.com/blogimg/asset/202311/bg2023110605.webp)

一个开源的 Vim 编辑器教程，这是英文版。另有[中文版](https://gitlab.com/wsdjeg/Learn-Vim_zh_cn)。

3、[编译器和语言设计导论](https://dthain.github.io/books/compiler/)（Introduction to Compilers and Language Design）

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026070703.webp)

一本免费的英语教材，面向初学者，介绍编译器的概念，以及如何写一个 C 语言的编译器。


### 言论


1、

有人问，AI 编写的代码，我根本不理解，公司却要我发布它，怎么办？

我的回答是，不要让 AI 设计代码，而要让它实现你已经设计好的代码。

-- [Hacker News 读者](https://news.ycombinator.com/item?id=50157475)

2、

大多数建议对于给出建议的人都是正确的，对于别人就不一定了。

-- [coached.com](https://coached.com/essays/most-advice-is-right-for-the-person-giving-it/)

3、

AI 让单人创业变得容易，创业失败的主要原因以后将是孤独。

身边没有人对你的想法提出异议，没有人注意到你遇到的困难，或者鼓励你坚持到底。AI 或许可以帮助你更快地前进，但它无法完全取代与人倾诉或分享喜悦。

-- [《自动化之后，单人创业将成为主流》](https://every.to/thesis-statements/julian-weisser)

4、

美国政府的主要关注，现在已经变成了如何保持对中国的技术领先优势，以及设法维持美国股市的高股价。

-- [《经济学家》杂志](https://www.economist.com/business/2026/09/30/the-era-of-speedball-capitalism-has-dawned)

5、

过去几个月，OpenAI 公司发布了 AI 做出的数百项数学证明。这震惊了数学界，一位数学家说他不禁哭了，感到 AI 毁灭了自己的研究领域。

技术乐观主义者可能不会这样想，他会劝这位数学家振作起来。

数学不会在意你的感受，科学现实对你的眼泪漠不关心。你感到自己的圣殿被毁灭了，可是这种事以前也发生在别人身上。接受现实吧。

-- [《我知道数学家为何哭泣》](https://www.derekthompson.org/p/i-know-why-the-mathematicians-weep)



<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
