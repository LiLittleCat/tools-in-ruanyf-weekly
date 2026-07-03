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
<!-- <currentVersion>402</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 402 期）：我在智念 AI 的日子（小说）](https://github.com/ruanyf/weekly/blob/master/docs/issue-402.md)
### 工具


1、[Deno Desktop](https://deno.com/blog/v2.9#deno-desktop)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062702.webp)

Deno 宣布推出 Deno Desktop，可以直接将 Deno 网页应用，打包成桌面的二进制程序，UI 在 Webview 中运行，后端是一个 Deno 运行时。

这就是说，现在除了 Electron 和 Tauri，又多了一种制作跨平台桌面应用的方法。

2、[playCaptcha](https://github.com/mortspace/playcaptcha)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026061601.webp)

一个抓娃娃机的 Captcha 库，用来识别访问者是否机器人。

3、[Beer CSS](https://www.beercss.com/)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062901.webp)

一个 CSS 组件库，将材质化设计做成易用的 CSS 组件。

4、[Image Toolbox](https://github.com/T8RIN/ImageToolbox/)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062003.webp)

开源的安卓图像编辑 App，让你在手机上完成各种图像编辑。

5、[EdgeMirror](https://github.com/tianrking/EdgeMirror)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062703.webp)

面向开发者的软件源 CDN 边缘镜像网关，帮助下载各种源站软件包，支持 PyPI、Hugging Face、GitHub、Docker、Go 等。（[@tianrking](https://github.com/ruanyf/weekly/issues/10426) 投稿）

6、[Douzy](https://github.com/jiji262/douyin-downloader)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062704.webp)

开源桌面应用，批量下载抖音视频，支持 Windows 和 Mac。（[@jiji262](https://github.com/ruanyf/weekly/issues/10423) 投稿）

7、[涟漪鱼缸](https://seanwong17.github.io/RippleAquarium/)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062706.webp)

纯前端 WebGL 水族箱，鱼群会聚集、转向、互相避让，并有实时水面涟漪，[代码开源](https://github.com/SeanWong17/RippleAquarium)。（[@SeanWong17](https://github.com/ruanyf/weekly/issues/10471) 投稿）

8、[File Viewer](https://github.com/flyfish-dev/file-viewer)

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062903.webp)

前端的文件预览组件，无需服务端转码，在网页预览各种文件内容，支持200多种文件扩展名。（[@wybaby168](https://github.com/ruanyf/weekly/issues/10474) 投稿）

9、[podpull](https://github.com/xiaoleiy/podpull)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026070201.webp)

一个命令行工具，下载播客的音频文件。（[@xiaoleiy](https://github.com/ruanyf/weekly/issues/10526) 投稿）


### 资源


1、[Jest/Vitest 测试入门教程](https://howtotestfrontend.com/courses/jest-vitest-fundamentals)（英文）

![](https://cdn.beekka.com/blogimg/asset/202606/bg2026062902.webp)

网页互动式课程，通过实例学习 Jest 或 Vitest 进行测试的基础知识。

2、[C 语言小书](https://little-book-of.github.io/c/books/en-US/book.html)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026032701.webp)

一本面向初学者的 C 语言小教程。


### 言论


1、

跟大多数人想的不一样，互联网最重要的地方，不是那些公开的网站或社交平台，而私密的群聊。

无数最具影响力、最重要的事件，是在 Whatsapp、Telegram、Signal、Discord 的那些仅限邀请的小型群组里决定的。

-- [《私密群聊统治世界》](https://sriramk.com/group-chats-rule-the-world)

2、

大多数争论都是与自我意识有关，而非理念。

--[《我为什么不再与人争论》](https://wangcong.org/2026-06-30-why-i-stopped-arguing-with-people.html)

3、

大模型可以当做压缩工具，记住单个文件并预测下一个字节。

我训练了一个 Transformer 模型，可以把 100MB 的 CSV 文件压缩为 7MB。缺点是非常耗时，在我的家用电脑上，训练大约需要20-30分钟，压缩和解压缩各需要45分钟。

-- [Hacker News 读者](https://news.ycombinator.com/item?id=48644463)

4、

缓慢思考，快速行动，这就是成功的秘诀。

（Think slow, act fast: That’s the secret of success.）

-- [《如何完成大型项目》](https://www.goodreads.com/work/quotes/96704571-how-big-things-get-done-the-surprising-factors-that-determine-the-fate)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
