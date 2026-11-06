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
<!-- <currentVersion>418</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 418 期）：如果科技停止在21世纪初](https://github.com/ruanyf/weekly/blob/master/docs/issue-418.md)
### 工具


1、[florilegium](https://github.com/kevinraymond/florilegium)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110302.webp)

LaTex 排版软件的插件，在页面空白处生成植物图案。

这个概念很棒，而且可以移植到网页。

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110303.webp)

2、[Disc Image Studio](https://github.com/JiaFeiMiao-K-Cat/DiscImageStudio)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110404.webp)

这个工具可以将指定的图片刻录到光碟上，使得图案在光碟表面上肉眼可见。

3、[OutCrap](https://outcrop.rocks/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110406.webp)

一个免费的手机 App（苹果和安卓），可以根据照片分析地质地貌，也可以根据 GPS 定位给出地质信息。

4、[SOML](https://github.com/soml-lang/soml)

一种可以取代 JSON 的数据文件格式，消除了 JSON 的大多数缺点，更容易使用，基本上是 YAML 的简化版，提供各种语言的实现。

5、[Casnode](https://github.com/casnode/casnode)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110419.webp)

开源的 Discourse 风格的论坛程序，采用 Go + Next.js 开发，数据库默认为 SQLite。（[@hsluoyz](https://github.com/ruanyf/weekly/issues/12933) 投稿）

6、[澜姿](https://github.com/wzc520pyfm/gen-ai-pose-image)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110418.webp)

这个开源工具提供一套可以微调的人体姿态/服装/表情模板，供 AI 模型套用到图片上面。（[@zc520pyfm](https://github.com/ruanyf/weekly/issues/12899) 投稿）

7、[Crossbow](https://github.com/Richard-Zhang1019/Crossbow)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110420.webp)

开源的代理桌面客户端，支持双内核一键切换。（[@Richard-Zhang1019](https://github.com/ruanyf/weekly/issues/12940) 投稿）

8、[WeRead Book Exporter](https://github.com/WANGXIN-567/weread-book-exporter)

微信读书全书无损导出工具，抓取微信读书 Web 端已购或会员书籍全文，一键导出为 PDF、EPUB 以及 Markdown 笔记。（[@WANGXIN-567](https://github.com/ruanyf/weekly/issues/12942) 投稿）

9、[Linkit](https://github.com/blue-idea/linkit)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110421.webp)

浏览器书签的桌面管理器，基于 Go + Wails + SQLite 构建，支持本地语义向量检索、404 死链检测与知识图谱。（[@blue-idea](https://github.com/ruanyf/weekly/issues/13018) 投稿）

10、[halfsize](https://github.com/YKLovePython/halfsize)

开源的命令行工具，将视频文件压缩到指定大小。（[@YKLovePython](https://github.com/ruanyf/weekly/issues/13072) 投稿）


### 资源


1、[HackerTube](https://hackertube.org/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110407.webp)

一个 Youtube 视频网站，汇集了“黑客新闻”论坛上提到的所有 Youtube 视频，可以用来寻找值得看的科技视频。

另有 [HackerBooks](https://hackerbooks.org/topic/fantasy) 和 [HackerPodcasts](https://www.hackerpodcasts.org/)，分别收集了“黑客新闻”提到过的各种书籍和播客。（[@qcrao](https://github.com/ruanyf/weekly/issues/13061) 投稿）

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110408.webp)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110422.webp)

2、[开始学习图论](https://vertex.degree/)（Start Doing Graph Theory）

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110301.webp)

一本面向初学者的图论入门教材（英文），免费阅读和下载。

3、[Python 数据科学手册](https://jakevdp.github.io/PythonDataScienceHandbook/)（英文）

![](https://cdn.beekka.com/blogimg/asset/202512/bg2025120404.webp)

该书向初学者介绍用于数据处理的一些 Python 基本工具（比如 NumPy、Pandas），出版于2016年，免费阅读。


### 言论


1、

真心，正义，无畏，同情。 

-- 电影《无问西东》

2、

民众在自己电脑上装内存，其实是一件很糟糕的事情。因为这些内存95％的时间都处于闲置状态，如果人们想要解决当前的内存供应问题，那就应该把内存都交给我们用在机房。

-- [山姆·奥特曼](https://www.kocpc.com.tw/archives/701674)，OpenAI 公司首席执行官

3、

人们还没有充分认识到，既然电动汽车配备了大容量电池，为什么还要买个小电池仅仅为了应急？

电动汽车其实是家庭的备用电源。

-- [《电网中断期间的双向充电》](https://www.jefftk.com/p/bidirectional-charging-during-grid-outages)

4、

AI 生成的内容就像沥青，看起来光鲜明亮，而且很容易随处涂抹。但如果你以后需要清除沥青，即使一切顺利，也需要数年时间。

-- [《AI 帕斯卡的赌注》](https://ploum.net/2026-10-01-pascal_wager.html)

5、

“说清楚你的需求”是21世纪的一项关键技能。

-- [robinsloan.com](https://www.robinsloan.com/lab/ask-for-what-you-want/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
