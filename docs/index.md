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
<!-- <currentVersion>409</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 409 期）：程序员的职业未来](https://github.com/ruanyf/weekly/blob/master/docs/issue-409.md)
### 工具


1、[Beszel](https://github.com/henrygd/beszel)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081501.webp)

轻量级服务器监控工具，包含 Docker 统计信息、历史数据和警报功能，支持自动备份、多用户、OAuth 身份验证和 API 访问。

2、[microlighter](https://davatron5000.github.io/microlighter/)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082002.webp)

一个轻量级的代码高亮 JS 库，压缩后只有 2KB，使用了 CSS 的 [Custom Highlight API](https://drafts.csswg.org/css-highlight-api-1/)。

3、[dgit](https://github.com/littledivy/dgit)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082006.webp)

为个人的 Git 仓库添加网页界面。

4、[Bython](https://pypi.org/project/Bython/)

这个工具使用大括号替代 Python 代码的缩进，适合那些不喜欢每一行开头都要按 Tab 键的程序员。

5、[LibreDB Studio](https://github.com/libredb/libredb-studio)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081901.webp)

在浏览器里面使用的开源 SQL IDE，可以连接各种数据库。（[@yusuf-gundogdu](https://github.com/ruanyf/weekly/issues/11212) 投稿）

6、[shotsync](https://github.com/Defiabell/shotsync)

部署在 Cloudflare 的免费图片/文字中转池，方便在不同设备之间分享内容。（[@Defiabell](https://github.com/ruanyf/weekly/issues/11227) 投稿）

7、[悟空图片转 SVG 工具](https://github.com/goku-open/goku-image-to-svg-tool)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081903.webp)

开源的各种图像转 SVG 矢量图的网页工具。（[@gokuscraper](https://github.com/ruanyf/weekly/issues/11249) 投稿）

8、[Gitu](https://github.com/altsem/gitu)

![](https://cdn.beekka.com/blogimg/asset/202406/bg2024061705.webp)

一个基于终端的 Git 图形客户端，比较清晰简单。

9、[Dbmate](https://github.com/amacneil/dbmate)

一个轻量级的数据库迁移工具，支持各种主流数据库。

10、[lnav](https://lnav.org/)

![](https://cdn.beekka.com/blogimg/asset/202406/bg2024061901.webp)

一个基于终端的日志文件查看器，支持搜索、过滤和查询日志文件。


### 资源


1、[midipiano.app](https://midipiano.app/zh/)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081902.webp)

免费的网页版练钢琴应用，电脑连接 MIDI 键盘直接弹，网页显示实时反馈。（[@noxss](https://github.com/ruanyf/weekly/issues/11225) 投稿）

2、[线性代数应该这样学](https://linear.axler.net/)（Linear Algebra Done Right）

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026082008.webp)

免费的中文版线性代数教程。

3、[Flexport Atlas](https://atlas.flexport.com/)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030205.webp)

这个网站在地图上实时显示大型货轮的位置。

4、[插头和插座博物馆](https://plugsocketmuseum.nl)

![](https://cdn.beekka.com/blogimg/asset/202602/bg2026022701.webp)

这个网站收集世界各地的插头和插座资料。

5、[Cure Dolly](https://kellenok.github.io/cure-script/1-the-basic-types-of-sentences.html)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025061601.webp)

一个英文的日语教程。


### 言论


1、

红皇后是小说《爱丽丝镜中奇遇记》的虚构人物，她说过一句名言：“你拼命奔跑，也只能留在原地。”

这被称为“红皇后效应”，用来描述进化生物学的一种假说：物种必须时刻保持进化，才能在物种的竞争中生存下来。

现在，AI 领域似乎也出现了“红皇后效应”，每一种大模型都必须保持进化，一刻也不能停，才能在激烈竞争中生存下来。

-- [《AI 的红皇后效应》](https://www.cst.cam.ac.uk/news/red-queen-hypothesis-new-way-forward-self-improving-ai)

2、

我之前读到过，动物（包括人类）的群体行为可以用两个非常简单的规则来解释：1）每个个体尽量跟上群体，2）个体之间尽量避免碰撞。

-- [《模拟群体行为》](https://community.wolfram.com/groups/-/m/t/122095)

3、

互联网最初的设想，只是 `/var/ww/html`目录里面几个 HTML 文件，谁能想到后来竟变成了如今这样复杂的软件和内容管理系统。

-- [《网站管理员的宣言》](https://brennan.day/webmaster-a-manifesto-for-everyone/)

4、

拖延症患者安慰自己的方法：如果拖延解决问题的时间足够长，或许别人就会帮你解决了。

-- [claytonwramsey.com](https://claytonwramsey.com/blog/mvt/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
