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
<!-- <currentVersion>408</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 408 期）：你需要知道的 AI 缓存知识](https://github.com/ruanyf/weekly/blob/master/docs/issue-408.md)
### 工具


1、[Docker 沙箱](https://www.docker.com/products/docker-sandboxes/)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081307.webp)

Docker 官方推出的沙箱工具，把 Docker 容器当作沙箱，让 AI Agent 在里面运行，跟底层系统隔离。

2、[CertMate](https://github.com/fabriziosalmi/certmate)

![](https://cdn.beekka.com/blogimg/asset/202507/bg2025070101.webp)

一个自搭建的 SSL 证书管理系统，可以自动申请证书，支持多家云服务商。

3、[crontab guru Dashboard](https://crontab.guru/dashboard.html)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025063001.webp)

这个工具让你用图形界面，来管理 Cron 任务。

4、[trash-cli](https://github.com/andreafrancia/trash-cli)

一个 Linux 命令行程序，提供回收箱功能，保存已删除的文件，以备将来恢复，参考[介绍文章](https://ittavern.com/adding-a-trash-can-to-linux-with-trash-cli/)。

5、[LeePanel](https://github.com/gna1280072/LeePanel)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081001.webp)

安装在本地计算机的远程服务器管理面板，所有操作都由 SSH 操作完成，不需要在服务器安装任何东西。（[@gna1280072](https://github.com/ruanyf/weekly/issues/11083) 投稿）

6、[MarkCard Studio](https://github.com/pangxiaobin/MarkCardStudio)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081002.webp)

将 Markdown 文本转成分享卡片，提供16套内置主题，可以自动分页、排版，一次导出整套图片或 PDF。（[@pangxiaobin](https://github.com/ruanyf/weekly/issues/11097) 投稿）

7、[日全食 3D 模拟器](https://github.com/DophinL/solar-eclipse-2026-simulator)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081301.webp)

在地图上模拟2026年8月12日的日全食，查看指定地点什么时候开始日食、食甚和结束，以及天空的样子。（[@DophinL](https://github.com/ruanyf/weekly/issues/11136) 投稿）

8、[DBX](https://github.com/t8y2/dbx)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081302.webp)

轻量级跨平台的数据库管理工具，支持79余种数据库，并且可以接入 AI 与 MCP。（[@t8y2](https://github.com/ruanyf/weekly/issues/11143) 投稿）


### 资源


1、[昆虫世界](https://github.com/xr843/insect-world)

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081303.webp)

60 种昆虫的 3D 图鉴，可以旋转、缩放、点击标注点，介绍昆虫的身体构造、生活史与生态角色。（[@xr843](https://github.com/ruanyf/weekly/issues/11135) 投稿）

2、[图解分布式系统原理](https://github.com/ruanyf/weekly/issues/11121)（中文）

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081204.webp)

本系列采用图示和直观解释的方式，深入探讨分布式系统背后的核心思想。（[@lichuang](https://github.com/ruanyf/weekly/issues/11121) 投稿）

3、[吹口哨练习器](https://howtowhistle.org/zh)（HowToWhistle）

![](https://cdn.beekka.com/blogimg/asset/202608/bg2026081205.webp)

练习吹口哨的在线工具，实时检测你吹出的音高，显示当前音符以及与目标音的偏差。（[@0647-cyber](https://github.com/ruanyf/weekly/issues/11127) 投稿）


### 言论


1、

AI 省下的时间，不是用来休假的，而是应该用来开发更多产品。你们正在做这个星球上最令人兴奋的事情。

-- [Andrew Bosworth](https://finance.sina.cn/7x24/2026-08-09/detail-inimsssr1991323.d.html)，Meta 公司 CTO 回答员工的提问，关于 AI 带来的生产力提升是否可以转化为更多的休假时间的。

2、

一些人试图将蒸馏描述为有害行为，但我认为，应当保护“可以从任何能够观察到的事物中学习”这一原则。

-- [扎克伯格](https://finance.sina.cn/7x24/2026-08-11/detail-inimxrnq5879406.d.html)，Meta 公司创始人

3、

有很多理由在本地运行大模型，但省钱不在其中。

目前，OpenCode Go 套餐的用户，平均每天花费1.14美元，来运行 DeepSeek Flash v4。同样的功能在本地运行，你需要使用双 DGX 架构，即使每天费用翻上10倍，也需要 24 年才能收回成本。

-- [Dax Raad](https://x.com/thdxr/status/2086599224674681242)，OpenCode 创始人

4、

你不接受某种想法，但仍然愿意对其进行思考，这是受过良好教育的标志。

-- [亚里士多德](https://www.campion.edu.au/blog/top-25-aristotle-quotes-on-virtue-knowledge-and-happiness/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
