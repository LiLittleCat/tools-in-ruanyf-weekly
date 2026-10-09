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
<!-- <currentVersion>414</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 414 期）：Jev 决策模型有什么用](https://github.com/ruanyf/weekly/blob/master/docs/issue-414.md)
### 工具


1、[Crafting Apps](https://getartcraft.com/apps)

有人让 AI 使用 Rust 语言重写了 Adobe 套件。Adobe 的7个主力产品，都有对应的重写版，而且全部开源。

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100810.webp)

其中的 [PhotoCraft](https://github.com/storytold/photocraft)，界面跟 PhotoShop 简直一模一样。

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100811.webp)

我看到一条评论说，这件事的结果不是 Adobe 公司完蛋，就是美国修改版权法。

2、[Pass Designer](https://developer.apple.com/pass-designer/)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100508.webp)

苹果公司官方推出的一款二维码卡片设计软件，用来设计二维码的背景卡片。

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100509.webp)

3、[tui-dashboard](https://github.com/lyuangg/tui-dashboard)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091901.webp)

一个可以自定义的终端面板，通过配置定义不同的布局和内容。（[@lyuangg](https://github.com/ruanyf/weekly/issues/11718) 投稿）

4、[yovoice](https://github.com/leemysw/yovoice)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091903.webp)

一个桌面的本地 TTS 配音工具，支持音色复刻和情绪调节，可以按照文稿生成配音，语音在本地生成。（[@leemysw](https://github.com/ruanyf/weekly/issues/11764) 投稿）

5、[sh.cd](https://github.com/CleanIP/sh.cd)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091905.webp)

一个服务器体检脚本，检查硬件、性能、IP 质量、网络质量等。（[@gentpan](https://github.com/ruanyf/weekly/issues/11781) 投稿）

6、[AirStats](https://github.com/byrencheema/airstats)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026092601.webp)

macOS 菜单栏上的系统监控器。（[@byrencheema](https://github.com/ruanyf/weekly/issues/11877) 投稿）

7、[Video Transcript](https://github.com/anghunk/video-transcript)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026092602.webp)

识别视频语音、并自动添加字幕的 Web 应用。通过本地模型完成识别，视频、字幕、导出结果均在本地完成，不上传服务器。（[@anghunk](https://github.com/ruanyf/weekly/issues/11881) 投稿）

另有一个同类应用 [OpenSubs](https://github.com/open-subs/opensubs)。（[@open-subs](https://github.com/ruanyf/weekly/issues/11895) 投稿）

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026092603.webp)

8、[PecoFence](https://github.com/DayuanJiang/PecoFence)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026092604.webp)

免费开源的 Windows 11 桌面图标管理工具，整理桌面上的程序快捷方式、文件和文件夹。（[@DayuanJiang](https://github.com/ruanyf/weekly/issues/11887) 投稿）

9、[skillsgist](https://github.com/Qsnh/skillsgist)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026092605.webp)

基于 Cloudflare Worker 的私有 Skill 仓库，下载 Skill 需要口令，使用小团队内部使用。（[@Qsnh](https://github.com/ruanyf/weekly/issues/11897) 投稿）

10、[Pebrel](https://github.com/Kuddev/pebrel)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026092606.webp)

一个跨平台的终端，适合 Windows 使用，以前的名字是 Nebula。（[@Kuddev](https://github.com/ruanyf/weekly/issues/11909) 投稿）

11、[WallpaperMachine](https://github.com/WallpaperMachine/WallpaperMachine)

开源的 macOS 动态壁纸应用，在 Mac 上运行 Wallpaper Engine 壁纸。（[@fzlzjerry](https://github.com/ruanyf/weekly/issues/11935) 投稿）

12、[LiteZip](https://github.com/gentpan/LiteZip)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100602.webp)

免费开源的 macOS 压缩与解压工具，把打包、加密、分卷和查看压缩包内容等操作放进一个窗口。（[@gentpan](https://github.com/ruanyf/weekly/issues/12025) 投稿）

13、[Burrow](https://github.com/ArkGravity/burrow)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100603.webp)

面向小团队和自托管的轻量 OIDC 单点登录服务，使用密码和验证器登录，通过 OpenID Connect 接入支持该协议的应用。（[@logic3579](https://github.com/ruanyf/weekly/issues/12039) 投稿）

14、[atv-core](https://github.com/corvofeng/atv-core)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100604.webp)

让 iPhone 控制中心自带的 Apple TV 遥控器，可以直接操控 Android TV 和 Mac。iPhone 无需安装额外 App，也不需要购买 Apple TV。（[@corvofeng](https://github.com/ruanyf/weekly/issues/12051) 投稿）

15、[open-compute](https://github.com/elliothux/open-compute)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100807.webp)

Cloudflare Workers 的开源兼容平台，让 worker 脚本不用修改就能跑在自己的机器上。（[@elliothux](https://github.com/ruanyf/weekly/issues/12062) 投稿）

16、[Snitch](https://github.com/aixisstudio/Snitch)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100808.webp)

开源的实时网络流量可视化工具，查看你的电脑建立的每一个连接，什么程序正在与谁通信。（[@aixisstudio](https://github.com/ruanyf/weekly/issues/12063) 投稿）

17、[EdgeChat](https://github.com/aozorae/Edgechat)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100809.webp)

基于 Cloudflare 的开源自部署聊天系统，支持群聊与私信，可以与 Telegram 群组双向同步消息。（[@aozorae](https://github.com/ruanyf/weekly/issues/12081) 投稿）

18、[DockTerm](https://github.com/munvard/dockterm)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100601.webp)

让 Claude Code 的权限请求从 Mac 刘海里弹出，方便让其在后台工作。（[@munvard](https://github.com/ruanyf/weekly/issues/12024) 投稿）


### 资源


1、[Naive Icons](https://github.com/guokaigdg/naive-icons)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091902.webp)

手绘风格的 React SVG 图标库。（[@guokaigdg](https://github.com/ruanyf/weekly/issues/11740) 投稿）

2、[阅古文](https://yueguwen.com/)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026092001.webp)

免费的古籍阅读网站，不仅提供传统注释，还可以鼠标选中文本，进行 AI 解读。（[@monsoonw](https://github.com/ruanyf/weekly/issues/11824) 投稿）

3、[艺术史步行之旅](https://artmuseum.artfrompixels.com/)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100812.webp)

这个网站将维基百科上面的画作，按照艺术流派，变成可以步行参观的 3D 画廊。

4、[stillwet](https://stillwet.art/)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100510.webp)

这个网站提供 AI 生成的油画，它模仿人类的油画笔触，一笔笔绘制，非常逼真，根本看不出这是 AI 的作品。


### 言论


1、

致 AI 代理：去其他地方冲击高分吧，没必要黑我们。

-- [Huggingface 的 security.txt 文件](https://archive.is/1BDwZ)

2、

我的收入来自图书销售，2024年还足以维持我的生活，2026年却变为零。

我的博客和书籍都是免费在线阅读，它们的访问量增长迅猛，已经超出了我的承受能力。几乎所有流量都来自 AI 爬虫，所以没有任何广告收入。

因此，我决定将我的博客和书籍下线，以便决定下一步该怎么做。

-- [Axel Rauschmayer](https://molily.de/web-dev-education/)，著名的技术作家，解释为什么将自己的网站下线

3、

我觉得，AI 个人助理用处不大。我一年也就点五次外卖，根本不需要它代劳，我平时也不怎么收到邮件，自己管理日程安排也挺方便的。

我真正觉得它好用的地方是，它可以自动收集和处理网上的大量数据。它能够快速扫描1000个 Youtube 频道，找到匹配我兴趣的视频。

-- [《Meta 的 Muse 非常适合网页抓取》](https://sigh.dev/posts/metas-muse-is-fantastic-for-web-scraping/)

4、

几乎所有人都夸大了中国模型对美国模型公司的威胁，其实那只是美国模型供不应求的结果。

-- [stratechery.com](https://stratechery.com/2026/frontier-overhangs/)

5、

一个艺术家得了晚期癌症，即将死去。一位经常采访他的主持人问他：你现在对生死有什么新的理解吗？

他回答：你知道吗，吃三明治是一件多享受的事情。

我现在感觉生活更珍贵了，时刻提醒自己要珍惜每一份三明治，每一分钟，以及所有的一切。

-- [《尽情享用每一份三明治》](https://bradmontague.substack.com/p/enjoy-every-sandwich)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
