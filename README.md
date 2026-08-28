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
<!-- <currentVersion>410</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 410 期）：你需要知道的 AI 三种机制](https://github.com/ruanyf/weekly/blob/master/docs/issue-410.md)
### 工具


1、[Vanilla OS 3](https://vanillaos.org)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082601.webp)

一个基于 Debian 的 Linux 发行版，实现不可变（immutable）系统，所有操作都是原子化（atomic）操作。（[@NN708](https://github.com/ruanyf/weekly/issues/11356) 投稿）

2、[stock-tui](https://github.com/Folgerjun/stock-tui)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082602.webp)

终端查看 A 股 K 线图、市盈率、成交量的小工具。（[@Folgerjun](https://github.com/ruanyf/weekly/issues/11354) 投稿）

3、[Dark mode PDFs](https://veil.simoneamico.com/)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026032702.webp)

一个很有意思的小工具网站，将上传的 PDF 文件反转颜色，即白底黑字变成黑底白字。

4、[Termio](https://github.com/termio-sh/termio)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082410.webp)

mac 版的 AI 编程开发环境（ADE），有配套的 iPhone 版本。（[@jiweiyuan](https://github.com/ruanyf/weekly/issues/11273) 投稿）

5、[PicLite](https://github.com/amiaoapp/PicLite)（图轻）

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082411.webp)

跨平台的图片压缩工具，支持本地文件夹监控、图片格式转换、批量压缩、添加水印、上传图床等功能。（[@amiaoapp](https://github.com/ruanyf/weekly/issues/11290) 投稿）

6、[Multi-Row Tabs](https://github.com/hezhizheng/multi-row-tabs)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082412.webp)

这个 Chrome 插件以多行平铺的形式，显示当前窗口的所有标签页。（[@hezhizheng](https://github.com/ruanyf/weekly/issues/11310) 投稿）

7、[InvoiceFlowAI](https://github.com/EthanYoQ/Invoice-Downloader)

开源的电子发票整理与报销的桌面工具，连接用户自己的 QQ 或 163 邮箱，批量收集邮件中的发票，完成 OCR 识别、分类归档，并生成 Excel 汇总。（[@EthanYoQ](https://github.com/ruanyf/weekly/issues/11327) 投稿）

8、[CozyClay](https://github.com/NomaDamas/CozyClay)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082501.webp)

在浏览器中搭建场景框架、摆放角色姿势、编写镜头运动和剪辑，然后交给 AI 视频模型更准确生成视频。（[@HaD0Yun](https://github.com/ruanyf/weekly/issues/11329) 投稿）

9、[Email.md](https://www.emailmd.dev/templates)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026032801.webp)

这个网站提供电子邮件模板，用户只需填入 MarkDown 格式，就会生成一封格式化的电子邮件。

10、[Minimalytics](https://github.com/nafey/minimalytics)

![](https://cdn.beekka.com/blogimg/asset/202503/bg2025032101.webp)

一个统计服务器，记录和监控各种事件，基于 Go 语言和 SQLite 数据库，内置 Web 界面。


### 资源


1、[星舰基地](https://www.spacex.com/sites/starbase-la)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082603.webp)

SpaceX 公司要在路易斯安那州新建一个“星舰基地”，这是它的官网，看上去就像科幻电影一样。

2、[漫游旧金山](https://sf.thijs.gg/)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082503.webp)

一款网页游戏，让用户在实景的旧金山街景地图上漫游，可以指定地点，非常酷。

3、[城市道路](https://anvaka.github.io/city-roads/)（city road）

![](https://cdn.beekka.com/blogimg/asset/202412/bg2024122612.webp)

这个网站可以将某个城市的所有道路，变成一张线条图，支持缩放。


### 言论


1、

一个人有教养的表现，就是他可以享受最好的，也可以承受最差的。

--[唐师曾](https://news.pku.edu.cn/xwzh/129-116805.htm)，本周去世的著名记者

2、

我们的世界并不是一个常常设身处地为他人着想的世界。但是，如果你能够做到，向一个10岁的孩子解释世界，或者设计一个80岁的老人可以打开的罐子，有时会让你更好地完成最初想要做的事情。

-- [《请用10岁小孩都能听懂的方式向我解释》](https://timharford.com/2026/08/explain-it-to-me-like-im-ten/)

3、

有人写了一篇《值班已成往事》，提出应该让 AI 来值班。只有当 AI 无法解决问题时，才应该让人类接手，而且应该由 AI 来呼叫人类。

-- [《与 AI 相关的可靠性事故即将发生》](https://surfingcomplexity.blog/2026/08/22/wild-ai-related-reliability-incidents-are-coming/)

4、

人们逐渐意识到，如果使用 AI 学习新知识，学习速度比传统方法快得多，因为 AI 非常擅长概括大量不同的信息。

但是，通过 AI 学习，大脑没有积极参与学习过程，对知识的理解和记忆不如传统方法。人脑的运作方式决定了，螺旋式学习是记忆知识的最佳方法之一。AI 直接给出了结果，让我们省略了中间的反复思考的步骤。

-- [《AI 和司机式知识》](https://www.aaron-gray.com/ai-and-chauffeur-knowledge/)

5、

如果房价暴跌，我会遭受损失，但也又有好处：我的孩子能住上更便宜的房子。没错，他们继承的遗产会减少，但他们将终生享受更便宜的住房。

-- [《CD 与邻避效应》](https://www.betonit.ai/p/cds-vs-nimby)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
