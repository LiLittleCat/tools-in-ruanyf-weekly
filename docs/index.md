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
<!-- <currentVersion>400</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 400 期）：rsync 的争论](https://github.com/ruanyf/weekly/blob/master/docs/issue-400.md)
### 工具


1、[ffmpeg webCLI](https://github.com/tejaswigowda/ffmpeg-webCLI)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026060601.webp)

一个基于网页的视频编辑器，全部离线操作，底层是 ffmpeg.wasm。

2、[oproxy](https://github.com/sauravrao637/oproxy)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026061103.webp)

一个开源的本地中间人代理，用来拦截本地流量，查看通信细节，有网页操作界面。

3、[performative-ui](https://vorpus.github.io/performativeUI/#/)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026060903.webp)

一个 React 组件库，提供 AI 应用开发所需的各种组件。 

4、[ALTCHA](https://altcha.org/captcha/)

![](https://cdn.beekka.com/blogimg/asset/202505/bg2025051702.webp)

开源的 Captcha 替代品，用来过滤掉机器人，有[开源版](https://github.com/altcha-org/altcha)。

5、[oak-keyring](https://github.com/OpenKeyring/oak-keyring)

基于终端的开源密码管理器，所有密码都保存在本地。（[@p1024k](https://github.com/ruanyf/weekly/issues/10203) 投稿）

6、[smctl](https://github.com/leaperone/smctl)

开源的 Mac 命令行工具，用于硬件控制，可以控制 Mac 没有开放的风扇曲线、电池充电限制、温度/功耗遥测。（[@harryisfish](https://github.com/ruanyf/weekly/issues/10233) 投稿）

7、[@webc.site/math](https://github.com/webc-site/math)

一个 Markdown 数学公式的渲染库，使用浏览器原生支持的 MathML Core，体积很小，渲染速度快，可以替代 KaTeX / MathJax。（[@xtco3o](https://github.com/ruanyf/weekly/issues/10241) 投稿）

8、[office-open-xml-viewer](https://github.com/yukiyokotani/office-open-xml-viewer)

一个前端 JS 组件，用于渲染 Office 文件。

9、[SnackBase](https://github.com/lalitgehani/SnackBase)

![](https://cdn.beekka.com/blogimg/asset/202601/bg2026011402.webp)

一个通用的 Python 项目网页管理后端。

10、[MBCompass](https://github.com/CompassMB/MBCompass)

![](https://cdn.beekka.com/blogimg/asset/202601/bg2026011405.webp)

开源的安卓指南针应用。


### 资源


1、[中文诗词 API](https://github.com/palemoky/chinese-poetry-api)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026060603.webp)

Go 语言开发的高性能中国古诗词 API 服务，有部署到 Cloudflare 的现成版本。（[@palemoky](https://github.com/ruanyf/weekly/issues/10216) 投稿）

2、[生产验证的编程模式](https://totoro-jam.github.io/battle-tested-patterns/zh/patterns/)（Battle-Tested Patterns）

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026060901.webp)

一个资料网站，介绍46种常用的编程模式，配有真实项目的代码实例。（[@Totoro-jam](https://github.com/ruanyf/weekly/issues/10257) 投稿）

3、[WorldIP.io](https://worldip.io/)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026060802.webp)

免费查询 IP 地址详细情况的网站。


### 言论


1、

如果生命是一个箱子，任何试图让箱子变得更大一些的人，最后都会发现必须冲破箱子的四边才行。

-- 查理·芒格，美国著名投资家

2、

程序员愿意为 AI 编写详细的文档，却不愿意为其他程序员写文档。

-- [plover.com](https://blog.plover.com/2026/03/09/#documentation-wins-2)

3、

AI 的速度太快，很烦人。我心想“让 AI 干活，我去睡个午觉”，结果还没等我离开电脑，它就已经把代码写完了。

-- [Hacker News](https://news.ycombinator.com/item?id=48447699) 读者

4、

传统的软件开发流程正在瓦解，设计、测试、代码审查都不需要了，AI 能够同时生成代码、测试、部署。

新的技能是上下文工程，新的安全保障是可观测性。

-- [《软件开发生命周期已死》](https://boristane.com/blog/the-software-development-lifecycle-is-dead/)

5、

我始终相信，制造比人类更智能的 AI 有风险。它对我们人类的危害，可能不亚于人类对黑猩猩和渡渡鸟的危害。

-- [《AI 时代的软件设计》](https://self-service.mirdin.com/software-design-in-the-age-of-ai)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
