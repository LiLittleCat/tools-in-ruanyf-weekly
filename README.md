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
<!-- <currentVersion>372</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 372 期）：软件界面如何设计](https://github.com/ruanyf/weekly/blob/master/docs/issue-372.md)
### 工具


1、[Zensical](https://github.com/zensical/zensical)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110613.webp)

静态文档网站生成器 [Material for MkDocs](https://github.com/squidfunk/mkdocs-material/) 的作者，写的升级版，完全兼容 MkDocs，但是解决了它的很多痛点。

2、[Affinity](https://www.affinity.studio/)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110203.webp)

用于图像编辑的桌面软件，Photoshop 的替代品，被 Canva 公司收购后，现在可以免费下载使用。

3、[FileBrowser Quantum](https://github.com/gtsteffaniak/filebrowser)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025062610.webp)

一个自搭建的、基于 Web 的文件管理器，参见[介绍文章](https://www.xda-developers.com/self-hosted-free-open-source-web-based-file-browser/)。

4、[Texo](https://github.com/alephpi/Texo)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110202.webp)

开源的数学公式 OCR 引擎，通过前端加载模型，将数学公式的截图转成 LaTex 语法，[在线试用](https://texocr.netlify.app/ocr)。（[@alephpi](https://github.com/ruanyf/weekly/issues/8026) 投稿）

5、[TDesign uniapp](https://github.com/novlan1/tdesign-uniapp)

腾讯 TDesign 组件库的非官方 uniapp 适配，兼容 H5/微信小程序/支付宝小程序/APP 等。（[@novlan1](https://github.com/ruanyf/weekly/issues/8022) 投稿）

6、[GreenWall](https://github.com/zmrlft/GreenWall)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110201.webp)

这个工具可以在 GitHub 提交日历上绘出指定的图形。（[@zmrlft](https://github.com/ruanyf/weekly/issues/8024) 投稿）

7、[BakLab](https://github.com/biliqiqi/baklab-web)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110502.webp)

一个开源的社区平台，将论坛发现功能和实时聊天互动结合在一起，标题链接是前端仓库，参考[官网](https://baklab.app)。（[@oodzchen](https://github.com/ruanyf/weekly/issues/8050) 投稿）

8、[中国节假日](https://github.com/vsme/chinese-days)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110512.webp)

这个仓库提供一系列函数，方便你查询中国节假日、节气等等，每日通过 Action 自动更新数据，支持 iCal 日历订阅。（[@vsme](https://github.com/ruanyf/weekly/issues/8059) 投稿）

另有一个[类似的项目](https://github.com/tomandjerry136/hodiday)，提供中国节假日的 JSON 文件。（[@tomandjerry136](https://github.com/ruanyf/weekly/issues/8062) 投稿）

9、[QiLuo](https://github.com/chelunfu/qiluo_admin)（祺洛）

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110605.webp)

Rust 技术栈开发的网站管理后台，采用 Axum 框架 + Sea ORM。（[@chelunfu](https://github.com/ruanyf/weekly/issues/8106) 投稿）

10、[navsite](https://github.com/wubh2012/navsite)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110606.webp)

将飞书多维表格转成一个导航网站。（[@wubh2012](https://github.com/ruanyf/weekly/issues/8109) 投稿）


### 资源


1、[苹果应用商店（网页版）](https://apps.apple.com/)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110504.webp)

苹果本周终于推出了“应用商店”的网页版 apps.apple.com ，可以用浏览器访问。虽然无法从网站安装 App，但至少提供了一个 App 搜索和发现的 Web 入口。

网友扒了它的[前端代码](https://github.com/rxliuli/apps.apple.com)，发现用的是 Svelte 框架。

2、[ASCIIMoon](https://asciimoon.com/)

![](https://cdn.beekka.com/blogimg/asset/202507/bg2025070313.webp)

这个网站使用 ASCII 码展示当天的月相（新月、弯月、满月）。


### 言论


1、

我说过永远不会有 htmx 的第三版，但没说过不会有第四版。

-- [Carson Gross](https://htmx.org/essays/the-fetchening/)，htmx 项目创始人，曾经公开说不会有 htmx 3.0版，本周宣布直接发布4.0版。

2、

我们收到谷歌的报告，他们在我们的代码中发现了一个漏洞。

我们很重视安全，但是互联网巨头使用 AI 扫描志愿者维护的代码，然后提交安全漏洞，希望志愿者免费修复，这真的公平吗？

-- [FFmpeg 团队](https://x.com/FFmpeg/status/1984178359354483058)

3、

未来十年，全球将有超过70万亿美元的遗产财富直接交给继承人，这将加剧社会的不平等。

-- [英国《卫报》](https://www.theguardian.com/inequality/2025/nov/03/more-than-70tn-of-inherited-wealth-over-next-decade-will-widen-inequality-economists-warn)

4、

为什么运气很重要？因为它会缩短积累的时间，让你接触到更大的机会。这就像当你已经有钱的时候，赚更多的钱就容易得多。

-- [《人生是一场概率游戏》](https://zachholman.com/posts/money-off-the-table)

5、

AI 出现以后，程序员的发展方向彻底变了。

你必须专注于理解系统而非理解语法，你的技能必须从编写代码转移到架构、安全、人机协作等方面。

未来属于那些能够构想、开发和维护复杂系统的人。

-- [《软件开发的演变》](https://guptadeepak.com/the-evolution-of-software-development-from-machine-code-to-ai-orchestration/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
