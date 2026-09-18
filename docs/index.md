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
<!-- <currentVersion>413</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 413 期）：再见了，React Native](https://github.com/ruanyf/weekly/blob/master/docs/issue-413.md)
### 工具


1、[Great Tables](https://github.com/posit-dev/great-tables)

![](https://cdn.beekka.com/blogimg/asset/202404/bg2024040402.webp)

一个可以生成复杂表格的 Python 库。

2、[ghostty-web](https://github.com/coder/ghostty-web)

![](https://cdn.beekka.com/blogimg/asset/202512/bg2025120214.webp)

这个项目将终端模拟器 [Ghostty](https://ghostty.org/) 编译成 WASM 代码，从而可以在网页里面使用一个全功能的终端。

3、[Infat](https://github.com/philocalyst/infat)

一个命令行工具，在 Mac 电脑上设置不同后缀名文件的默认打开方法。

4、[mini-img-editor](https://github.com/xdadda/mini-photo-editor)

![](https://cdn.beekka.com/blogimg/asset/202504/bg2025042901.webp)

一个使用 WebGL 的在线图片编辑器，作为原型演示，界面非常简洁。

5、[CryptPad](https://cryptpad.fr/)

![](https://cdn.beekka.com/blogimg/asset/202505/bg2025050101.webp)

免费使用的线上 Office 办公套件，支持端对端加密，参见[介绍文章](https://www.xda-developers.com/reasons-why-use-cryptpad-instead-google-docs/)。

6、[Lyrimuse](https://github.com/Yudaotor/lyrimuse)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091308.webp)

macOS 桌面歌词工具，实时查找显示正在播放的歌曲的歌词。（[@Yudaotor](https://github.com/ruanyf/weekly/issues/11551) 投稿）

7、[capcut-cli](https://github.com/renezander030/capcut-cli)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091619.webp)

剪映（capcut）的非官方命令行工具，在终端里面创建/编辑视频。（[@renezander030](https://github.com/ruanyf/weekly/issues/11634) 投稿）

8、[mailez](https://github.com/mailez-hq/mailez)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091621.webp)

一个 Go 语言的二进制文件，实现自托管邮件系统，网页收发邮件，支持 SMTP / IMAP / POP3 / ManageSieve 四个协议。（[@lianguan](https://github.com/ruanyf/weekly/issues/11680) 投稿）

9、[Status Trio](https://github.com/lingyired/status-trio)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091622.webp)

一款借鉴 iPhone Duo 设计的三合一 Mac 状态栏图标，集成 Wi‑Fi 、电池与音量。（[@lingyired](https://github.com/ruanyf/weekly/issues/11670) 投稿）

10、[Polycompiler](https://github.com/EvanZhouDev/polycompiler)

一个有意思的项目，可以把 JS 脚本和 Python 脚本打包成一个脚本，同时能在 JS 环境和 Python 环境运行。


### 资源


1、[gpcb.net](https://gpcb.net/net/)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091620.webp)

网络设备拓扑图的网页设计工具。（[@abpyu](https://github.com/ruanyf/weekly/issues/11622) 投稿）

2、[视觉风格图鉴](https://ruanyf.github.io/squoosh/editor)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091309.webp)

用一颗苹果，展示100多种视觉风格，比如上图是霓虹风格的苹果。（[@jerrymakes](https://github.com/ruanyf/weekly/issues/11555) 投稿）

3、[AI IP 检测](https://store.xiu.ai/zh/ai-ip/)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091407.webp)

这个网站显示你连接 Claude、ChatGPT、Grok、Perplexity、Cloudflare 时，实际连接的 IP 地址。（[@MuduiClaw](https://github.com/ruanyf/weekly/issues/11571) 投稿）

4、[引力](https://qunabu.github.io/Gravity/#what-is-gravity)（Gravity）

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062007.webp)

一个网页的多媒体教程，向观众介绍万有引力的相关知识。


### 言论


1、

卫星会消耗行星的自转能量，从而加速行星的毁灭。

-- [《金星吞噬了自己的卫星吗》](https://www.space.com/astronomy/venus/did-venus-eat-its-own-moon)

2、

想象两家非常相似的软件公司，收入相似，软件产品也相似。它们唯一的区别是，A 公司使用了 100 万行代码，而 B 公司使用了 10 万行代码。哪家公司会表现更好 ？

显然，代码行数只有别人十分之一的公司会表现更好。代码行数越少，就能更快地理解和修改代码。

-- [《代码就是债务》](https://tornikeo.com/code-is-debt/)

3、

大模型会将你从一个编写代码的程序员，转变为一个管理上下文、剔除无关信息、编写详细提示词的程序员。

-- [Liz Fong-Jones](https://simonwillison.net/2025/Dec/30/liz-fong-jones/)

4、

一位创始人，如果在2024年组建了合适的团队却打造了错误的产品，那么坚持到2027年，他的团队就会变成久经沙场的团队，很可能打造出正确的产品。

失败带来的经验，就像根系中的养分被储存起来，等待下一个春天的到来，而不是白白浪费。

-- [《AI 不会崩溃，但会经历一场风暴》](https://ceodinner.substack.com/p/the-ai-wildfire-is-coming-its-going)

5、

很多技术出错，并不是太大的问题。GPS 出错，我很快会发现地点不对；Netflix 推荐的电影不好看，我就不看了。

但 AI 就不同了，它越先进，就越难知道它是否出错，因为我们会用 AI 去完成那些我们自己无法完成、也无法验证的任务。

一旦 AI 出错，我们只能不停召唤更强大 的 AI，希望咒语能够奏效。欢迎来到魔法师时代。

-- [《AI 就是与魔法师合作》](https://www.oneusefulthing.org/p/on-working-with-wizards)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
