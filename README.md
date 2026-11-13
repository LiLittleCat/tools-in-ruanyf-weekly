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
<!-- <currentVersion>419</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 419 期）：机房来了，写字楼走了](https://github.com/ruanyf/weekly/blob/master/docs/issue-419.md)
### 工具


1、[Window Sweaters for macOS](https://github.com/saragordic/window-sweaters)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111017.webp)

一个 Mac 应用，为常见应用的窗口穿上毛衣。

2、[dnsglobe](https://github.com/514-labs/dnsglobe)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026070702.webp)

一个命令行工具，对全球34个公共 DNS 进行测速，找出到你速度最快的 DNS 服务器。

3、[kan.ban](https://github.com/kanbn/kan)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025060312.webp)

基于 JS 的开源看板应用，Trello 替代品。

4、[Procexp-Mac](https://github.com/microsoft/Procexp-Mac)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111102.webp)

一个 macOS 桌面应用，可以查看每个进程的详细信息，相当于把 Process Explorer 移植到 Mac。

5、[rVPN](https://rvpn.org/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111101.webp)

一种开源的加密通信协议，可以让加密通信与 HTTPS 无法区分，提供服务端与各种客户端。

6、[BoopFace](https://github.com/CX-ArtLab/BoopFace)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110902.webp)

一个 Web 组件，可以在网页插入 SVG 机器人脸组件，适用于 AI 聊天机器人和 Agent 界面，提供18种表情和互动。（[@CX-ArtLab](https://github.com/ruanyf/weekly/issues/13144) 投稿）

7、[Melarka](https://github.com/aaronsuns/melarka)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111001.webp)

一个本地的音乐流媒体服务器，可以播放本地和 YouTube 音乐，支持多账号，提供安卓和 iOS 客户端。（[@aaronsuns](https://github.com/ruanyf/weekly/issues/13226) 投稿）

8、[Cyber API](https://github.com/vicanso/cyberapi)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111002.webp)

用于 API 调试的桌面客户端，使用 Rust + GPUI 构建，由于通过 GPU 直接绘制，没有了 Electron 的内存占用与卡顿。（[@vicanso](https://github.com/ruanyf/weekly/issues/13233) 投稿）

9、[Beamlynx](https://beamlynx.com/zh)

一个桌面的数据库客户端，在数据库里删一行数据，它会找出所有指向这行数据的表，删除时不会留下指向已删除行的外键，非商业使用免费。（[@ahmadnazir](https://github.com/ruanyf/weekly/issues/13271) 投稿）

10、[MD-Vault](https://github.com/xiangc579/md-vault)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111201.webp)

一个 Web 应用，使用 Markdown 格式保存 2FA 双因素认证的动态时间码，通过网页看板查看。（[@xiangc579](https://github.com/ruanyf/weekly/issues/13295) 投稿）

11、[zlib](https://github.com/heartleo/zlib)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111202.webp)

Z-Library 的命令行客户端，可以搜索、下载图书。（[@heartleo](https://github.com/ruanyf/weekly/issues/13316) 投稿）


### 资源


1、[temp-api](https://www.temp-api.com/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026110901.webp)

这个网站提供免费的 JSON API 的 Mock 服务。（[@sunjian-github](https://github.com/ruanyf/weekly/issues/13211) 投稿）

2、[MCP 详解](https://mcp-explained.com/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111105.webp)

这个网站提供 MCP 教程，把相关概念都用图形解释。看上去是用 AI 生成的，但对于了解 MCP 还是有帮助。

3、[Rail Cube](https://owenlacey.dev/railcube-optimisation/post)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026111015.webp)

这个网站演示使用类似于乐高积木的火车积木 Rail Cube，可以搭建的约2700万个轨道布局。

4、[Hacker News 未公开的特性](https://github.com/minimaxir/hacker-news-undocumented)

这个仓库收集 Hacker News 网站没有公开的各种特性和功能。


### 言论


1、

很多人以为，AI 编程很轻松。其实，完全不是这样，它让人精疲力尽，因为你需要不停做出决策。

空中交通管理员和卡车司机都有强制休息时间，但是没有人会强制要求 AI 编程的使用者休息，你只有一块智能手表提醒自己站起来活动活动。

-- [《为什么 AI 编程令人如此疲惫》](https://constantin.glez.de/posts/2026-07-16-why-working-with-ai-agents-is-so-tiring-and-what-to-do-about-it/)

2、

实体的文字，尤其是书籍，比一切都长久。它们比书架更长久，比房子更长久，比购买它们的人和银行账户更长久。

二十年前，我在一家如今已不复存在的书店里，从一位现已退休的书商手中，在一座我已不再居住的城市里，买了一本书，它至今仍在，也必将比我活得更久。这是电子文档比拟不了的。

-- [《我拥有28000本书》](https://www.shelvd.org/blog/28000-books)

3、

学校教育的真正目标是，技能掌握、知识积累和思维方式的形成。

-- [Russ Cox](https://www.acm.org/articles/people-of-acm/2026/russ-cox)，Go 语言创造者

4、

以前为变量和文件起名很伤脑筋，现在有了 AI，变得轻而易举了。

-- [《我的 AI 编程》](https://www.minid.net/2026/7/10/ai-works-for-me)

5、

如果你观察过程序员，可能会发现他们发呆的时间远比敲击键盘的时间多。不，他们（可能）并没有偷懒，程序员大部分工作都是在脑子里完成的。

-- [《AI 编码陷阱》](https://chrisloy.dev/post/2025/09/28/the-ai-coding-trap)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
