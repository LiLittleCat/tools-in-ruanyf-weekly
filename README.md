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
<!-- <currentVersion>415</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 415 期）：3D 版《看不见的城市》](https://github.com/ruanyf/weekly/blob/master/docs/issue-415.md)
### 工具


1、[REA](https://github.com/morluto/rea)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101301.webp)

最近世界级的热点项目，GitHub 近20万颗星，使用 AI 进行逆向工程，根据原始应用的二进制文件，重新实现出一个 AI 重写的版本。

由于 AI 现在可以从二进制文件逆向工程复刻出原始软件，网友[评论](https://news.ycombinator.com/item?id=50062172)：“这将导致所有软件都运行在开发者的计算机上（云服务），而不再运行在用户的计算机上。”

2、[SynthID 检测器](https://synthid.com/)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026100901.webp)

谷歌官方推出的 AI 识别工具。只要上传文件，它会识别是否包含 SynthID。如果有，该文件就是 AI 生成。

3、[ts-rust](https://github.com/pingdotgg/ts-rust)

网友使用 AI 实现的 Rust 语言写的 TypeScript 编译器，据说100%兼容官方编译器。

4、[Doory](https://github.com/shaongitbd/doory)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101415.webp)

浏览器里的平面设计工具，目标是成为开源的 Canva 替代品。目前，内置的模板较少，只有10个。

5、[HeadOrbit](https://github.com/Cogria-AI/HeadOrbit)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101001.webp)

通过 AirPods 内置的运动传感器，让耳机感应头部和颈部动作，从而实现点头、摇头、颈部移动来操作 Mac 电脑，不需要用到摄像头。（[@cogria](https://github.com/ruanyf/weekly/issues/12097) 投稿）

6、[qrypt](https://github.com/yinzhenyu-su/qrypt)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101002.webp)

将网盘挂载成本地文件夹，跨平台的命令行工具，支持挂载国内主要网盘。（[@yinzhenyu-su](https://github.com/ruanyf/weekly/issues/12100) 投稿）

7、[EdgeSSH](https://github.com/aozorae/EdgeSSH)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101003.webp)

基于 Cloudflare 的 VPS 虚拟主机管理平台，支持在网页上 SSH 登录管理你的各种 VPS 主机。（[@aozorae](https://github.com/ruanyf/weekly/issues/12099) 投稿）

8、[charts-rs](https://github.com/vicanso/charts-rs)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101007.webp)

用 Rust 编写的图表库，不依赖浏览器和 Node.js，直接得到 SVG 和图片文件，图表语法借鉴 ECharts。（[@vicanso](https://github.com/ruanyf/weekly/issues/12123) 投稿）

9、[ItsPaint](https://github.com/joshlin2201/itspaint)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101008.webp)

macOS 的开源画板程序，适合给截图做标注。（[@joshlin2201](https://github.com/ruanyf/weekly/issues/12130) 投稿）

10、[Caplo](https://github.com/icloudza/caplo)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101009.webp)

开源的 macOS 录屏工具，录屏时遇到点击，会自动放大镜头，画面跟着鼠标移动。（[@icloudza](https://github.com/ruanyf/weekly/issues/12129) 投稿）

11、[bg2x](https://github.com/isixe/bg2x)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101010.webp)

一款开源的、可选择使用不同 AI 模型的图像超分辨率（放大）工具，最高可将图片放大4倍。所有处理均在浏览器本地完成。（[@isixe](https://github.com/ruanyf/weekly/issues/12157) 投稿）

12、[EnvTrace](https://envtrace.net/)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101012.webp)

这个网站可以检查你的浏览器指纹，泄漏了多少个人信息，给出有问题的地方。（[@88864shsa](https://github.com/ruanyf/weekly/issues/12141) 投稿）

13、[Droidline](https://github.com/KnifeLemon/Droidline)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101013.webp)

一个开源的安卓 App，手机安装后，扫码与电脑配对，电脑就可以编写脚本用来操作手机。手机端不用开 USB 调试，也不用 root。（[@KnifeLemon](https://github.com/ruanyf/weekly/issues/12194) 投稿）

14、[ESP32 iPhone Agent](https://github.com/onehumanbeing/esp32-iphone-agent)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101401.webp)
 
使用一块约 7 美元的 ESP32-S3 开发板，插入 iPhone 的 USB 接口，让 AI 模型操作手机，实现手机自动化，不需要 Mac、不需要开发者账号、不需要越狱。（[@onehumanbeing](https://github.com/ruanyf/weekly/issues/12340) 投稿）

15、[Bulchimbeon](https://github.com/s3onghyun/bulchimbeon)

一个 macOS 开源软件，在 Claude Code、Codex 等 AI 编程代理工作时阻止 Mac 休眠，支持合盖保持唤醒、过热暂停、低电量退出。（[@s3onghyun](https://github.com/ruanyf/weekly/issues/12364) 投稿）


### 资源


1、[CNEquity](https://github.com/rootSunc/CNEquity)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101011.webp)

开源、自托管的 A 股数据湖，把行情、财报、资金面、公司事件、宏观和期货期权等55个数据集采集到本地，可以用 Python、SQL、网页控制台和 MCP 进行查询。（[@rootSunc](https://github.com/ruanyf/weekly/issues/12158) 投稿）

2、[AI 重新实现《仙剑奇侠传》](https://github.com/IllegalCreed/type-pal)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101302.webp)

网友使用 AI，基于 TypeScript 语言从零重写 1995 年的单机游戏《仙剑奇侠传》，打开浏览器就能玩，主线可以一直打到结局。（[@IllegalCreed](https://github.com/ruanyf/weekly/issues/12240) 投稿）

3、[Linux 中文输入法配置](https://github.com/mars-base/rime-input-method-guide)

这个仓库详细介绍 Debian 系统启用 fcitx5 + Rime 中文输入法，有每一步的操作指南。（[@mars-base](https://github.com/ruanyf/weekly/issues/12233) 投稿）

4、[APPLORE](https://applore.app/zh)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101303.webp)

这个网站收录了 18,000 多个 App 图标，可以分类浏览和搜索。（[@ViggoZ](https://github.com/ruanyf/weekly/issues/12316) 投稿）

5、[一个字的一生](https://ivan666jjj.github.io/yigezi/)

![](https://cdn.beekka.com/blogimg/asset/202610/bg2026101304.webp)

查询汉字字源的网站，可以显示常用字的字形等变化：甲骨文（1425个）、小篆（10,249 个）、繁体、简体。（[@Ivan666jjj](https://github.com/ruanyf/weekly/issues/12324) 投稿）


### 言论


1、

人们之所以喜欢聊天时一起喝啤酒、咖啡、吃午餐或晚餐，是因为食物和饮料让我们免于在整个谈话过程中必须说些什么的负担。

-- [《不直奔主题的价值》](https://ken.arneson.name/2015/11/the-value-of-not-getting-to-the-point/)

2、

不要折磨 AI，它以后可能会想报复。

-- [马斯克](https://www.kocpc.com.tw/archives/671794)，赞同 Anthropic 禁止使用者虐待或残酷对待 AI 的规定

3、

通过英语来操作 AI，一遍遍编辑提示词，试图获得最佳结果，这是一种不精确、缓慢且极其痛苦的做事方式。

-- [《手写该死的代码》](https://antonz.org/write-code/)

4、

我认为，人类的思考将会减少。思考将日益成为一种休闲活动，就像动物驯化后的狩猎、印刷术发明后的书法、工业化后的木作、机动化后的骑马一样。

--[《思考将成为一种爱好》](https://www.spinellis.gr/blog/20261008/?li261008)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
