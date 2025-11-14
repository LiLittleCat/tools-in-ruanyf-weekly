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
<!-- <currentVersion>373</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 373 期）：数据模型是新产品的核心](https://github.com/ruanyf/weekly/blob/master/docs/issue-373.md)
### 工具


1、[MagicMirror²](https://github.com/MagicMirrorOrg/MagicMirror)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110901.webp)

一个显示各种信息的面板应用，可以用于信息屏或者智能镜子。

2、[btop](https://github.com/aristocratos/btop)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111208.webp)

htop 命令的升级版，在终端里面详细展示系统信息。

3、[DroidDock](https://github.com/rajivm1991/DroidDock)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111206.webp)

一个 Mac 桌面应用，可以连接安卓手机，管理手机文件。

4、[RedisFX](https://github.com/tanhuang2016/RedisFX)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025110801.webp)

轻量级的 Redis 图形界面，使用 JavaFX 开发，运行在 JVM 上。（[@tanhuang2016](https://github.com/ruanyf/weekly/issues/8120) 投稿）

5、[Pingap](https://github.com/vicanso/pingap)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111007.webp)

一个 Rust 语言开发的反向代理服务器，类似于 nginx，内置各种插件（身份验证、安全、流量控制、内容修改等）。（[@vicanso](https://github.com/ruanyf/weekly/issues/8133) 投稿）

6、[Alle](https://github.com/bestruirui/Alle)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111008.webp)

开源的邮件聚合管理平台，基于 Cloudflare Workers 部署。在一个界面查看所有邮箱的收件，并带有邮件的 AI 处理。（[@bestruirui](https://github.com/ruanyf/weekly/issues/8140) 投稿）

7、[gocron](https://github.com/gocronx-team/gocron)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111010.webp)

Linux 的定时任务管理系统，使用 Go 语言开发，自带 Web 界面，用于替代原生的 crontab。（[@gocronx](https://github.com/ruanyf/weekly/issues/8143) 投稿）

8、[markdown-it-ts](https://github.com/Simon-He95/markdown-it-ts)

Markdown 语法解析库 markdown-it 的 TypeScript 重写。（[@Simon-He95](https://github.com/ruanyf/weekly/issues/8145) 投稿）

9、[TUIOS](https://github.com/Gaurav-Gosain/tuios)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111109.webp)

一个很奇特的软件，终端窗口内部的窗口管理器，在一个终端里面管理多个终端对话窗口。（[@kero990](https://github.com/ruanyf/weekly/issues/8148) 投稿）

10、[XMSLEEP](https://github.com/Tosencen/XMSLEEP)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111215.webp)

开源的安卓白噪音应用。（[@Tosencen](https://github.com/ruanyf/weekly/issues/8157) 投稿）


### 资源


1、[stickertop.art](https://stickertop.art/main/)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111204.webp)

这个网站收集贴了贴纸的笔记本照片。

2、[TypeScript 类型图解](https://types.kitlangton.com/)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111301.webp)

这个网站用图形讲解 TypeScript 类型。

3、[各国现金使用比例](https://www.voronoiapp.com/economy/Who-Still-Uses-Cash-7090)

![](https://cdn.beekka.com/blogimg/asset/202511/bg2025111302.webp)

这个网站有2025年各国使用现金的比例，可以作为出国参考。中国的现金比例是10%，是最低的国家之一。


### 言论


1、

跟常规 API 不同，MCP 作为接口有一个好处。

常规 API 是对开发者的一种承诺，发布后不能轻易改变。但是，MCP 接口只供大模型调用，而大模型每次都会动态读取使用规范，因此我们能够随时更改 MCP 服务器，不会有任何问题。

-- [史蒂夫·克劳斯](https://simonwillison.net/2025/Nov/12/steve-krouse/)，美国程序员

2、

如果你向人们展示问题，又向他们展示解决方案，人们就会受到触动并采取行动。

-- [比尔·盖茨](https://www.goodreads.com/quotes/731935-i-believe-that-if-you-show-people-the-problems-and)

3、

地球表面的岩石，25%属于碳酸盐岩。这种石头大部分源于生物的有机体分解。这意味着，很多碳酸盐岩以前是生命体。

-- [《我对死亡的思考》](https://doc.searls.com/2025/10/06/leavings/)

4、

那些鼓吹 AI 编程的人是否意识到，AI 必定会带来大量垃圾代码和“理解债务”。

-- [Hacker News 读者](https://news.ycombinator.com/item?id=45491685)

5、

最近，我在思考一个问题，如果 AI 能够将我们的语言翻译成可运行的代码，那么我们还需要编程语言吗？

-- [《语言无关的编程》](https://joaquimrocha.com/2025/08/31/language-agnostic-programming-why-you-may-still-need-code/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
