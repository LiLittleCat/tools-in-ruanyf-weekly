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
<!-- <currentVersion>421</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 421 期）：AI 的疯狂造富](https://github.com/ruanyf/weekly/blob/master/docs/issue-421.md)
### 工具


1、[Ladybird](https://ladybird.org/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112403.webp)

Ladybird 是一个全新的开源浏览器，它的底层引擎是从头写的，跟市场上所有浏览器都不一样，是一个真正的独立替代方案。

本周，它发布了 alpha 版，也就是第一个可用版本（下图）。我推荐大家关注，它很可能将来会取代 Firefox 的位置。

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112404.webp)

2、[PenGPT](https://greydanus.github.io/2026/11/12/pengpt/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112517.webp)

一个小型转换器（transformer），可以将英文输入转成手写字体，或者生成手绘草图。

3、[ScreenPlay](https://gitlab.com/kelteseth/ScreenPlay)

![](https://cdn.beekka.com/blogimg/asset/202408/bg2024082203.webp)

一款适用于 Windows 和 OSX 的开源动态壁纸应用。

4、[Plasmo](https://github.com/PlasmoHQ/plasmo)

![](https://cdn.beekka.com/blogimg/asset/202408/bg2024082205.webp)

一个开发 Chrome 浏览器插件的框架。

5、[Trace](https://github.com/lxyeternal/Trace)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112202.webp)

一个 macOS 菜单栏应用，自动记录你打开的应用、窗口、文件、网页，以及停留了多久，不需要手动计时。（[@lxyeternal](https://github.com/ruanyf/weekly/issues/13610) 投稿）

6、[Uptime Polaris](https://github.com/XingLingQAQ/UptimePolaris)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112201.webp)

开源的服务监控系统，检查网站是否在线，采集服务器指标，在状态变化时发送通知，可以部署在 Cloudflare Worker。（[@XingLingQAQ](https://github.com/ruanyf/weekly/issues/13628) 投稿）

7、[GuestPass](https://github.com/fengyiqicoder/guestpass)

这个工具可以把 Claude Code、Codex、Gemini CLI 的会话，变成一个链接，通过 Cloudflare tunnel 分享出去。访问该链接，就能实时访问/操作该会话，不需要安装 Agent 软件。（[@fengyiqicoder](https://github.com/ruanyf/weekly/issues/13613) 投稿）

8、[vl](https://github.com/foursmith/vl)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112302.webp)

一个终端环境，将 VS Code 的体验搬到终端里面。（[@ourongxing](https://github.com/ruanyf/weekly/issues/13633) 投稿）

9、[Locus](https://github.com/sao-coding/locus)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112303.webp)

开源的 Windows 数据库客户端，单个 exe，不用安装，支持 MySQL/MariaDB、PostgreSQL、SQLite、Redis、Oracle。最大特点是 Rust + GPUI 编写，不会出现卡顿，查询结果边传输边显示。（[@sao-coding](https://github.com/ruanyf/weekly/issues/13646) 投稿）

10、[TabRetake](https://github.com/gnawbit/tabretake)

根据设置，自动操作网页、录制演示视频的工具。（[@gnawbit](https://github.com/ruanyf/weekly/issues/13728) 投稿）

11、[AllInOneIME](https://github.com/MicroZ-LLC/AllInOneIME)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112516.webp)

macOS 的开源输入法，平时可用作拼音输入，句子开头打 @ 可以在输入框中调用 AI 结果。（[@melatonin98034](https://github.com/ruanyf/weekly/issues/13764) 投稿）


### 资源


1、[圆明园数字复原计划](https://github.com/Ivan666jjj/yuanmingyuan-restoration)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112101.webp)

数字还原圆明园，目前完成了15景的还原图，其中2景可以三维浏览。（[@Ivan666jjj](https://github.com/ruanyf/weekly/issues/13579) 投稿）

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112102.webp)

2、[Ohmwork](https://github.com/linjiejim/ohmwork)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112515.webp)

学习电路知识的零基础互动式教程，每个概念配一个互动小实验，从电压电流讲到传感器、射频和 PCB 设计。（[@linjiejim](https://github.com/ruanyf/weekly/issues/13751) 投稿）

3、[deflate x-ray](https://hrih.si/projects/deflate-xray/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112523.webp)

这个网站可以将文件的压缩过程，用动画表示出来，让你了解到底是怎么压缩的。

4、[小旧金山](https://smallsf.com/)

![](https://cdn.beekka.com/blogimg/asset/202611/bg2026112524.webp)

一个互动式地图，用像素图呈现真实的旧金山。


### 言论


1、

如果 AI 生成了一个经 Lean 语言验证的黎曼猜想证明，而这个证明对人类来说是无法理解的，数学家会作何感想？

-- [3Blue1Brown](https://www.youtube.com/watch?v=zqzk43bSdDI)，著名的数学 Youtuber

2、

在旧金山，你可以率先看到未来。 

-- [一个 OpenAI 前员工](https://situational-awareness.ai/)

3、

大模型的使用者分成两种。一种人充满了好奇心和责任心，将大模型用来放大自身的能力，提升自己的工作效率和理解深度。

另一种人比较懒惰，只充当“人肉代理”，把收到的需求放到输入框里，然后点击“生成”按钮进行处理。

-- [《聪明人怎样使用工具》](https://www.iankduncan.com/engineering/2026-11-19-smart-people-who-give-a-shit-use-tools)

4、

由于 AI 降低了制造业的智能成本，长期来看，原材料将在制成品成本中占据更大的份额。这使得采矿业在 AI 时代成为一个极其重要的行业。

-- [《硬件即软件》](https://unchartedterritories.tomaspueyo.com/p/hardware-is-software)

5、

你把 AI 生成的代码称为“AI 垃圾”，通常只是表明你根本没读过它。只有当你止步于此，这种侮辱才成立。

如果你愿意投入大量精力，不断完善这些代码，它可以成为值得信赖的东西。

-- [《AI 作为一种生活方式的选择》](https://grahamdumpleton.me/posts/2026/11/ai-as-a-lifestyle-choice/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
