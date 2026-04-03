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
<!-- <currentVersion>391</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 391 期）：AI 的贫富分化](https://github.com/ruanyf/weekly/blob/master/docs/issue-391.md)
### 工具


1、[EmDash](https://github.com/emdash-cms/emdash)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040202.webp)

AI 生成的 WordPress 复刻，基于 TypeScript 语言，支持插件，据说功能基本一样，参见[介绍文章](https://blog.cloudflare.com/emdash-wordpress/)。

2、[SubsTracker](https://github.com/wangwangit/SubsTracker)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026032706.webp)

基于 Cloudflare Workers 的订阅管理系统，可以发送各种订阅的到期通知，通过 Telegram、Webhook 等通知渠道。（[@wangwangit](https://github.com/ruanyf/weekly/issues/9411) 投稿）

3、[OpeniLink Hub](https://github.com/openilink/openilink-hub)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026032705.webp)

开源的微信机器人消息管理平台，自带应用市场，通过点击安装应用，给微信 Bot 加功能。（[@xixihhhh](https://github.com/ruanyf/weekly/issues/9404) 投稿）

另有一个类似项目 [wxWebHook](https://github.com/aristorechina/wxWebHook)，通过 WebHook 向微信用户发消息。（[@aristorechina](https://github.com/ruanyf/weekly/issues/9412) 投稿）

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026032707.webp)

4、[Lixian.Online](https://lixian.online/)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026033115.webp)

获取 VSCode 插件、Chrome 扩展和 Docker 镜像的离线安装包的工具，[代码开源](https://github.com/LiaoGuoYin/lixian.online)。（[@LiaoGuoYin](https://github.com/ruanyf/weekly/issues/9455) 投稿）

5、[Rename.Tools](https://rename.tools/zh/app)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026033116.webp)

浏览器端的批量文件重命名工具，支持各种规则设定，[代码开源](https://github.com/chenz24/rename.tools)。（[@chenz24](https://github.com/ruanyf/weekly/issues/9461) 投稿）

6、[FontInAss](https://github.com/Yuri-NagaSaki/FontInAss)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026033117.webp)

开源的字幕字体子集化工具，将所需的字体字形嵌入字幕文件。（[@Yuri-NagaSaki](https://github.com/ruanyf/weekly/issues/9466) 投稿）

7、[pretext.video](https://github.com/fifteen42/pretext-video)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040101.webp)

基于 [Pretext](https://github.com/chenglou/pretext)（文字排版计算库）的一个小应用，将摄像头捕捉的人体轮廓通过文字排版实时展示。（[@fifteen42](https://github.com/ruanyf/weekly/issues/9472) 投稿）

8、[OxideTerm](https://github.com/AnalyseDeCircuit/oxideterm)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040103.webp)

基于 Rust 语言的跨平台 SSH 终端，功能较多，使用 Tauri 桌面框架。（[@AnalyseDeCircuit](https://github.com/ruanyf/weekly/issues/9474) 投稿）

9、[wtree](https://github.com/FatDoge/wtree)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040104.webp)

git worktree 的图形化管理界面。（[@FatDoge](https://github.com/ruanyf/weekly/issues/9483) 投稿）


### 资源


1、[Claude Code 动手教程](https://claude.nagdy.me/)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026033102.webp)

Claude Code 的互动式教程，通过11个小练习，掌握这个 AI 编程工具。

2、[Claude Code Unpacked](https://ccunpacked.dev/)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040108.webp)

根据 Claude Code 泄漏的源码，一步步图解演示，输入提示词后软件内部如何处理。

3、[机器学习入门教程](https://github.com/dreddnafious/thereisnospoon/blob/main/ml-primer.md)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026033108.webp)

工程师的机器学习教程，解释基本概念。


### 言论


1、

源代码的 map 文件不小心发布到 npm，这种错误听起来似乎不可能，但当你意识到很大一部分代码库很可能是由你正在发布的 AI 编写的，一切就容易理解了。

-- [网友评论](https://alex000kim.com/posts/2026-03-31-claude-code-source-leak/) Claude Code 源码泄漏事件

2、

人工智能的蓬勃发展，使得某些办公室工作的需求可能并不大，而将创造大量电工、焊工和水管工的工作岗位。

以前，我们告诉所有年轻人去上大学，从事银行业、媒体或法律行业，现在需要平衡一下，有些人或许更适合做体力劳动者，在水暖工和电工这些领域，职业生涯同样可以很成功。

-- [拉里·芬克](https://www.bbc.com/news/articles/c9wqrdkx8ppo)，美国金融巨头贝莱德集团的老板

3、

写作的目的不在于写完，而在于增进你自己的理解，进而增进周围人的理解。

让 AI 为你写作，就像花钱请人为你健身一样。

-- [《别让 AI 替你写作》](https://alexhwoods.com/dont-let-ai-write-for-you/)

4、

程序员的工作不是编程，而是通过抽象，来管理软件的复杂性。如果你做到了这一点，那么编程就很容易了。

-- [《你的工作不是编程》](https://codeandcake.dev/posts/2025-12-12-your-job-isnt-programming)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
