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
<!-- <currentVersion>395</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 395 期）：软件开发的第三种方式](https://github.com/ruanyf/weekly/blob/master/docs/issue-395.md)
### 工具


1、[auge](https://auge.franzai.com)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026042701.webp)

基于 macOS 系统内置视觉框架 Apple Vision 的命令行工具，可以在命令行完成图像的视觉分析。

2、[BleachBit](https://github.com/bleachbit/bleachbit)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026042702.webp)

著名的跨平台桌面应用，用来清理各种浏览器的垃圾文件。

3、[Cicada](https://asong56.github.io/Cicada)

一个网页白板，不需要服务器，只是单个 13KB 的 HTML 文件，没有任何依赖，绘制的图形保存在 URL 里面。（[@Bennet7291](https://github.com/ruanyf/weekly/issues/9737) 投稿）

4、[ASS Subsetter](https://subs.js.org/ass-subset/)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026042401.webp)

ASS 字幕字体嵌入的网页工具，可以减少字幕文件的体积。（[@mtsubs](https://github.com/ruanyf/weekly/issues/9739) 投稿）

5、[Infinitum](https://github.com/shawnxie94/infinitum)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026042912.webp)

开源的 RSS 服务器，需要自己架设，支持正文补取、AI 分析、事件归组等功能，自带前端阅读器。（[@shawnxie94](https://github.com/ruanyf/weekly/issues/9773) 投稿）

6、[tunnix](https://github.com/aeroxy/tunnix)

加密的 SOCKS5/HTTP 隧道，需要安装服务器端和本地命令行客户端。（[@aeroxy](https://github.com/ruanyf/weekly/issues/9779) 投稿）

7、[curve-arrow](https://github.com/YYsuni/curve-arrow)

![](https://cdn.beekka.com/blogimg/asset/202605/bg2026050102.webp)

弧形箭头的 SVG 格式生成器。（[@YYsuni](https://github.com/ruanyf/weekly/issues/9801) 投稿）

8、[LynxDB](https://github.com/lynxbase/lynxdb)

![](https://cdn.beekka.com/blogimg/asset/202605/bg2026050303.webp)

单个二进制文件的日志分析引擎，可以设定各种条件，从多种服务器日志提取信息。（[@OrlovEvgeny](https://github.com/ruanyf/weekly/issues/9821) 投稿）

9、[Chrome DevTools CLI](https://github.com/aeroxy/chrome-devtools-cli)

一个 Rust 命令行工具，通过 DevTools 协议连接到系列里的 Chrome 浏览器，进行网页操作，默认自动连接，可供 AI Agent 调用。（[@aeroxy](https://github.com/ruanyf/weekly/issues/9833) 投稿）

10、[LaunchNext](https://github.com/RoversX/LaunchNext)

![](https://cdn.beekka.com/blogimg/asset/202605/bg2026050701.webp)

macOS 的新版移除了 Launchpad，新的界面很难用，这是它的开源替代品。（[@meichiny](https://github.com/ruanyf/weekly/issues/9862) 投稿）


### 资源


1、[大模型运行原理](https://ynarwal.github.io/how-llms-work/)（英文）

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026042703.webp)

大模型原理的长篇讲解，带有可互动的图形解释，针对初学者，基于 Andrej Karpathy 的技术深度分析文章。

2、[现代 C++ 编程](https://github.com/federico-busato/Modern-CPP-Programming)（Modern C++ Programming）

![](https://cdn.beekka.com/blogimg/asset/202605/bg2026050408.webp)

开源英文教程，通过详细的 PPT，帮助学过 C 语言的程序员掌握 C++。


### 言论


1、

门罗币的挖矿与比特币完全不同，它的设计思路是，尽量让所有人都能参与挖矿，防止那些拥有矿机的人占优势。

它的挖矿程序会模拟一个通用 CPU，使得矿机的专用 CPU 失效，也就是说它的挖矿只适合家用电脑的普通 CPU。

-- [《门罗币的工作量证明机制》](https://blog.alcazarsec.com/tech/posts/how-moneros-proof-of-work-works)

2、

以后没有初级工程师了，机器能做他们现在做的事，而且更便宜。但是，初级工程师的价值不在于他们能做的事，而在于他们未来会成为什么样的人。也许几年后，我们会纳闷，那些高级工程师都去哪儿了？

-- [stvn.sh](https://www.stvn.sh/writing/programming-still-sucks-fqffhyp)

3、

AI 加速了编码，创业公司现在面临的主要挑战是产品管理。

如果原型开发只需要一天，而推广和用户反馈需要一周，团队就只能依赖直觉来更快地做出决策。

-- [吴恩达](https://www.businessinsider.com/andrew-ng-product-management-bottleneck-coding-ai-startups-2025-8)，著名 AI 计算机科学家

4、

你的职业规划就是三步：（1）让自己擅长某事，（2）设法从中赚钱，（3）尽可能久地做下去。

-- [《我如何进入游戏行业》](https://garry.net/posts/how-do-i-get-into-the-game-industry)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
