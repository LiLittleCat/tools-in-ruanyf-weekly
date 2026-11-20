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
<!-- <currentVersion>420</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 420 期）：最分心的一年](https://github.com/ruanyf/weekly/blob/master/docs/issue-420.md)
### 工具


1、[sgrep](https://github.com/arunsupe/semantic-grep)

![](https://cdn.beekka.com/blogimg/asset/202407/bg2024072803.webp)

grep 的替代品，返回语义搜索的结果。

2、[Netdata](https://github.com/netdata/netdata)

![](https://cdn.beekka.com/blogimg/asset/202509/bg2025092707.webp)

开源仪表板，在一个地方显示所有服务器和服务的状态。

3、[FlowVision](https://github.com/netdcy/FlowVision)

![](https://cdn.beekka.com/blogimg/asset/202408/bg2024082008.webp)

macOS 的瀑布式图像浏览器。

4、[13ft](https://github.com/wasi-master/13ft)

![](https://cdn.beekka.com/blogimg/asset/202408/bg2024082009.webp)

一个开源网站，可以抓取付费墙后面的网页内容，需要自搭建。

5、[netboot.xyz](https://netboot.xyz/)

![](https://cdn.beekka.com/blogimg/asset/202408/bg2024082010.webp)

一个操作系统的启动盘，把 Windows、Linux、BSD 的安装文件都做在一个启动盘里面。

6、[Srcbook](https://github.com/srcbookdev/srcbook)

![](https://cdn.beekka.com/blogimg/asset/202408/bg2024082013.webp)

类似于 Jupyter Notebook 的网页互动式笔记本，但是适用于 TypeScript 和 JavaScript。

7、[Photoshot](https://github.com/Abraham721/photoshot)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111301.webp)

开源的基于浏览器的图片编辑器。（[@Abraham721](https://github.com/ruanyf/weekly/issues/13332) 投稿）

8、[XJY Editor](https://github.com/lizhaowu-79/xjyeditor)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111501.webp)

一个纯静态的网页应用，采用表格形式可视化编辑 XML / KML / JSON / YAML 文件。（[@lizhaowu-79](https://github.com/ruanyf/weekly/issues/13394) 投稿）

9、[GCS](https://github.com/aeroxy/google-cloud-shell-cli)

谷歌云的非官方命令行客户端，可以从命令行登录谷歌云的主机，进行各种操作。（[@aeroxy](https://github.com/ruanyf/weekly/issues/13399) 投稿）

10、[Waytrace](https://github.com/lxyeternal/PathTracker)（漫迹）

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111502.webp)

开源的 iOS 应用，不需要手动操作，在后台全天记录你当天的足迹动向。（[@lxyeternal](https://github.com/ruanyf/weekly/issues/13400) 投稿）

11、[Tomoru](https://github.com/ACAne0320/Tomoru)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111702.webp)

跨平台桌面应用，捕获电脑或指定应用播放的声音，实时识别，并在屏幕上显示双语悬浮字幕。（[@ACAne0320](https://github.com/ruanyf/weekly/issues/13457) 投稿）

12、[crFiles](https://github.com/libcr/crFiles/releases)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111703.webp)

跨平台的桌面文件管理器，最大特色是内置 Android Quick Share 协议，方便跟 Android 设备交换文件。（[@wuruxu](https://github.com/ruanyf/weekly/issues/13464) 投稿）

13、[Arke](https://github.com/Koimsurai/Arke)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111801.webp)

开源的 Windows 资源管理器替代品，特色是读取、排序、缩略图、搜索都不在界面线程上，因此打开巨大文件夹或网络共享断线，都不会卡住窗口。（[@Koimsurai](https://github.com/ruanyf/weekly/issues/13498) 投稿）


### 资源


1、[周刊导航站](https://ruanyf.cjai.site/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111701.webp)

网友做的周刊导航，共收入17,382个条目，可以检索。（[@mwhzwh](https://github.com/ruanyf/weekly/issues/13443) 投稿）

2、[tinybrain](https://github.com/cai114514114514/tinybrain)

从零开始做一个中文为主的小模型，包括数据清洗、分词器、模型、预训练、SFT、蒸馏、强化学习，每一步的代码都用 PyTorch 写出来。（[@cai114514114514](https://github.com/ruanyf/weekly/issues/13398) 投稿）

3、[Lean Init IDE](https://github.com/3y3y3y-huaiji/lean-init-ide)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111402.webp)

浏览器里的 Lean 4 语言练习环境，自带中英双语的[入门课](https://criticalthinking.de5.net/zh/learn/what-is-lean)，从基础逻辑一直讲到归纳、素数和插入排序验证。（[@3y3y3y-huaiji](https://github.com/ruanyf/weekly/issues/13372) 投稿）

4、[浏览器工程](https://browser.engineering/)（Web Browser Engineering）

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111905.webp)

免费阅读下载的英文电子书，介绍网络浏览器的工作原理，演示几千行 Python 代码构建一个简单的网络浏览器。

5、[生成式 AI 基础数学入门](https://arxiv.org/abs/2605.29713)（英文）

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111401.webp)

免费下载的 AI 数学入门教程。


### 言论


1、

AI 编码使得软件开发的瓶颈，从编写代码转移到了代码审查。

-- [哈佛大学研究团队](https://complexdiscovery.com/harvard-researchers-find-ai-coding-agents-shifted-the-bottleneck-to-code-review/)

2、

我们的公司 Iconfactory 依靠为用户设计图标谋生。AI 出现以后，我们的客户越来越少，我真的担心 Iconfactory 已经进入倒计时了。

-- [Ged Maheux](https://coyotetracks.org/blog/right-amount-of-ai/)，Iconfactory 共同创始人

3、

请记住，AI 并没有增加需要软件的人数，也没有增加软件维护的人员数量。它主要增加的是代码量和项目数量，其中有一些项目是有益的，但很多时候却分散了本应共享的资源。

-- [《用 Pi 构建 Pi》](https://lucumr.pocoo.org/2026/5/24/pi-oss/)

4、

软件公司的职位头衔一直在变。我曾是 Linux 系统管理工程师，后来改叫 SRE 工程师（Site Reliability Engineer），工作大同小异，只是名称变了。

接着，同样的工作又变成了 DevOps，现在的名字是平台工程（Platform Engineer）。

-- [《软件职位名称谱系图》](https://zwischenzugs.com/2026/11/03/a-family-tree-of-software-job-titles/)

5、

人与人的沟通是困难的，当你可以独自一人与机器为伴时，很容易就会选择不与人沟通。但是不要忘了，正是社区和人际交往，才会创造项目长久存在的价值。

-- [《用 Pi 构建 Pi》](https://lucumr.pocoo.org/2026/5/24/pi-oss/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
