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
<!-- <currentVersion>417</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 417 期）：不要让 AI 代表你](https://github.com/ruanyf/weekly/blob/master/docs/issue-417.md)
### 工具


1、[Everything](https://github.com/HeyPuter/everything)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102803.webp)

这个 Everything 项目致力于将全世界所有常用软件都用 AI 重写一遍，目前已经完成了几十种。

这些软件本身或许没什么亮点，但是这个项目的目标实在太惊人，难以想象如果实现了，会是怎样的结果。

2、[TitleArt](https://titleart.dvy.io/)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102917.webp)

这个 Web 应用将上个世纪的美术字编辑器，搬到了浏览器。

3、[Overgrown](https://github.com/charliegerard/Overgrown)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102918.webp)

这个浏览器插件会让闲置的网页长满藤蔓，再次浏览页面的时候，需要用鼠标砍断藤蔓，参见[介绍文章](https://charliegerard.dev/blog/overgrown-extension/)。

4、[make-look-scanned](https://github.com/overflowy/make-look-scanned)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062103.webp)

一个命令行工具，让 PDF 文件看起来像是通过纸张扫描生成的（上图）。

5、[What's Up Docker](https://getwud.github.io/wud/)

![](https://cdn.beekka.com/blogimg/asset/202505/bg2025051902.webp)

本地的容器管理应用，带有 Web 界面。

6、[OpenIDEA](https://github.com/l0ng-ai/openidea)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102903.webp)

一个开源的桌面 IDE，保留 IntelliJ IDEA 的使用习惯，底层用 Rust + Tauri 2 重写。（[@l0ng-ai](https://github.com/ruanyf/weekly/issues/12734) 投稿）

7、[Oleafly](https://github.com/Oleafly/Oleafly)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102904.webp)

开源的科研写作编辑器，支持 LaTeX、Typst 和 Markdown，不用单独安装 TeX 发行版。（[@prajwal-svm](https://github.com/ruanyf/weekly/issues/12750) 投稿）

8、[Weblink](https://github.com/99percentpeople/weblink)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102905.webp)

开源的 Windows 远程桌面工具，通过浏览器共享远程桌面，并可远程控制鼠标和键盘，支持文件传输、剪贴板共享、聊天及语音视频通话。（[@99percentpeople](https://github.com/ruanyf/weekly/issues/12765) 投稿）

9、[MenuBarMijia](https://github.com/jryang1997/MenuBarMijia)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102907.webp)

在 Mac 菜单栏与 Win11 托盘里控制米家和 Home Assistant 设备。（[@jryang1997](https://github.com/ruanyf/weekly/issues/12858) 投稿）

10、[无名大叔系统优化工具箱（3z9wOpt）](https://github.com/3z9w/3z9wopt)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102908.webp)

开源的 Windows 系统优化工具箱，包括清理垃圾、管理启动项与驱动等功能，技术栈是 Go + Wails v2 的桌面程序。（[@3z9w](https://github.com/ruanyf/weekly/issues/12876) 投稿）

11、[Cloud Mail](https://github.com/maillab/cloud-mail)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102909.webp)

基于 Cloudflare 的一站式邮箱服务平台。只需要一个域名，就可以搭建自己的邮箱服务，可部署到 Cloudflare Workers。（[@aslost](https://github.com/ruanyf/weekly/issues/12875) 投稿）

12、[晒窗 ShaiWin](https://github.com/19y/ShaiWin)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102910.webp)

把 Windows 窗口挂到屏幕顶端的一根晾衣绳上，点击后复原。（[@19y](https://github.com/ruanyf/weekly/issues/12871) 投稿）

13、[openhongguo](https://github.com/beilunyang/openhongguo)

红果短剧（Hongguo）的非官方匿名 SDK，提供 Go、Node.js、Android、iOS、React Native 和 Flutter 版本。（[@beilunyang](https://github.com/ruanyf/weekly/issues/12884) 投稿）

14、[FoldGit](https://github.com/dufu1991/foldgit)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102911.webp)

约 4 MB 的轻量级原生 macOS Git 客户端，集中管理多个仓库与工作树。（[@dufu1991](https://github.com/ruanyf/weekly/issues/12885) 投稿）


### 资源


1、[墨观 inkstone](https://github.com/Konata9/inkstone)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102906.webp)

代码编辑器的配色方案，共有六个变体，从 526 个中国传统颜色中提取。（[@Konata9](https://github.com/ruanyf/weekly/issues/12782) 投稿）

2、[《追忆似水年华》全七卷 AI 译本](https://github.com/QriDoki/in-search-of-lost-time-translation-project)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026102913.webp)

这个仓库是文学巨著《追忆似水年华》的 AI 翻译。（[@QriDoki](https://github.com/ruanyf/weekly/issues/12889) 投稿）

3、[吉卜力搜索](https://ghibli-search.anini.workers.dev/)

![](https://cdn.beekka.com/blogimg/asset/202601/bg2026012506.webp)

这个网站可以语意搜索吉卜力工作室的电影画面。


### 言论


1、

失败不重要，重要的是赢的时候赢多大。

-- [扎克伯格](https://www.threads.com/@tenten.co/post/De6SPPEE58e)，Facebook 创始人

2、

想象一下，在未来世界，AI 无处不在，而你突然被禁止使用 AI。

这意味着你失去了所有的经济价值。你周围的人都是超人，你无法跟他们竞争。别人的世界充满色彩，你的世界灰暗凄凉。当别人都在用机器人大军建造摩天大楼时，你却只能用勺子挖洞。这才是真正的末日灾难。

开源是保护你的自由、经济生存能力以及对这些公司说“滚蛋”的唯一途径。不能让 OpenAI 和 Anthropologie 控制我们的生活，在他们的平台上违反服务条款都会让你直接被封禁。

-- [X 用户](https://x.com/boneGPT/status/2114035719853265264)

3、

学生都用 AI 做作业，老师为什么还要批改作业？

-- [一个加州大学的教授](https://www.dailycal.org/news/campus/academics/ai-use-leads-uc-berkeley-math-professor-to-see-no-point-in-grading-homework/article_bdf1eae2-c08b-491f-b9f1-81a7cea177de.html)，宣布不再批改学生作业

4、

一个人的音乐品味，很大程度上是在青春期形成的，25岁之后很难喜欢上不一样的东西。

其他方面也是如此，你成年后喜欢的东西，往往都是青少年时期决定的。

-- 《人们的音乐爱好会随年龄发生怎样的变化？》

5、

AI 的用法属于那种几周就能学会，几个月后就会过时的技能，除了眼前的短暂价值之外，没有任何意义。

-- [《AI 技能将毫无价值》](https://fishbowl.pastiche.org/2026/10/26/ai-skills)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
