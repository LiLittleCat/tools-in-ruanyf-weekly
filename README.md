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
<!-- <currentVersion>405</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 405 期）：资源，社会公平与算力](https://github.com/ruanyf/weekly/blob/master/docs/issue-405.md)
### 工具


1、[Satteri](https://github.com/bruits/satteri)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026071606.webp)

一个 JS 的 Markdown 引擎，使用 Rust 语言开发，可以快速把 Markdown 语法转为 HTML，提供众多插件。

2、[AsteroidOS](https://asteroidos.org/)

![](https://cdn.beekka.com/blogimg/asset/202602/bg2026021801.webp)

智能手表的开源操作系统，不基于安卓，而是基于 Linux。

3、[GNU TeXmacs](https://www.texmacs.org)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026072313.webp)

一个跨平台的桌面编辑器，主要用于编写科技文档，提供数学内容的“所见即所得”。

4、[Elysia](https://elysiajs.com)

![](https://cdn.beekka.com/blogimg/asset/202602/bg2026021614.webp)

一个基于 TypeScript 的轻量级 Web 框架，号称以简单易用的方式构建 Web 服务。

5、[CloudFlare-ImgBed](https://github.com/MarSeventh/CloudFlare-ImgBed)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026072202.webp)

基于 Cloudflare 的零成本图床系统及配套桌面端，支持 Docker 和无服务器部署。（[@MarSeventh](https://github.com/ruanyf/weekly/issues/10733) 投稿）

6、[DetectRadar](https://github.com/harrisonwang/detect-radar)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026072203.webp)

这个工具核对当前出口 IP 地址与浏览器的时区、语言和环境特征，同时检查 WebRTC、DNS 和 IPv6 泄露，用来确认 IP 地址与你的其他网络特征一致，[在线试用](https://detectradar.com/)。（[@harrisonwang](https://github.com/ruanyf/weekly/issues/10746) 投稿）

7、[Véspero](https://github.com/tianrking/Vespero)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026072204.webp)

一个代理网关，将各种出口流量放到一个 Web 控制台下管理。（[@tianrking](https://github.com/ruanyf/weekly/issues/10757) 投稿）

8、[Foursmith VR](https://github.com/foursmith/vr)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026072205.webp)

为手机和平面显示器打造的 VR 视频播放器。（[@ourongxing](https://github.com/ruanyf/weekly/issues/10760) 投稿）

9、[Codia](https://github.com/AaronConlon/codia)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026072208.webp)

开源的代码片段美化工具，[在线试用](https://codia.i5lin.top/try-it)。（[@AaronConlon](https://github.com/ruanyf/weekly/issues/10763) 投稿）

10、[Email Builder](https://github.com/heiheihoho1213/monto-email-builder)

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026072210.webp)

邮件模板的 React 拖拽编辑器，[在线试用](https://heiheihoho1213.github.io/monto-email-builder/)。（[@akira0912](https://github.com/ruanyf/weekly/issues/10807) 投稿）


### 资源
，社会公平与算力

分享一个有趣的观点：**资源太多，会造成社会不公平**。我谈不上同意这个观点，就是觉得思路很奇特。

![](https://cdn.beekka.com/blogimg/asset/202607/bg2026072314.webp)

这是奥地利哲学家[伊万·伊里奇](https://caolan.uk/notes/2026-07-02_a_speed_limit_for_computers.cm)（Ivan Illich）在1973年的著作《能源与公平》（Energy and Equity ）中提出的，他认为用电量与社会公平有关。

> “能源和公平只能在一定程度上同时增长。人均用电量低于某个阈值时，增加用电量能够改善社会公平。高于这个阈值，能源增长就会以牺牲公平为代价。”

他的意思是，让大家都能用上电，确实有助于社会公平。但是一旦电太多了，就会加剧社会的不公平。

为了证明自己的观点，他举了一个更奇怪的例子：车速太快，也会加剧社会不公平。

> “车辆速度超过一定限度后，会造成人与人之间的距离感。它们会拉开所有人之间的距离，却只缩短少数人之间的距离。”
>
> “速度的提升不可避免地使得少数人拥有更大的马力，加剧大多数通勤者日益增长的时间紧迫感，并让他们更加感到自己落后于人。”

就是说，车速快会拉开人与人的距离，但只有少数人能掌握高速交通工具，车速越快只会帮助这些人越加领先。

而且，车速变快以后，时间的计量单位就缩小了。以前，时间按天计量，有了汽车以后，开始按小时计量，以后可能会按分钟计量。

> "似乎在世界各地，当一些车辆的速度突破 15 英里/小时（25 公里/小时）的障碍后，与交通相关的时间紧迫性就开始加剧。"

时间变得紧迫，也是对富有的人更有利。对于底层的人，当然也让人生变得更有价值，但也变得更累。

因此，他的建议就是，**应该限制车速，避免无限制地变快，不是为了交通安全，而是为了防止某些人领先太多**。同理，也应该限制用电量，防止某些人掌握太多的能源。

他的理论可以这样总结：一种资源发展到不再那么稀缺以后，就会落入少数人手中，这些人就会利用这种资源拉大人与人的差距，加剧社会不公平。

按照这种理论，算力也是如此。开始的时候，普及算力会提高所有人的福利，改善社会公平。但是，到了一定限度之后，算力不再那么稀缺，算力越多，只会让少数人掌握更多的算力优势，加大社会不公平。

所以，到了那个时候，政府有必要设置算力限制，防止少数人拥有过多的算力。

我觉得，这个理论就是在说资源的分配问题，如何让每个人都能获取资源，同时防止少数人获取过多的资源。

老实说，我有点悲观，觉得做不到，为了提高经济效率，就不可能保证资源的平均分配。


### 言论


1、

一加公司成立时表示：“我们将剔除手机的运营商功能、广告和无用软件，直接为科技爱好者打造终极、廉价、无预装软件的手机。”

它现在说：“极客们买的手机数量不足以维持我们的生存，一旦其他手机的价格便宜10美元，他们就会立刻离开。我们必须把手机卖给普通消费者。”

-- 著名美国科技网红 [Marques](https://news.ycombinator.com/item?id=48945748)的评论，一加手机本周宣布退出欧美市场

2、

AI 的真正风险不在于使人懒惰，而在于让“懒惰”看起来像“高效”。花十分钟读一篇摘要，把它发到社交媒体上，你感觉自己很高效，但实际上什么都没记住。

-- [Hacker News 读者](https://news.ycombinator.com/item?id=47555081)

3、

有人为了争夺某些原本简单明了的概念的命名权，发明了一堆新词。

这样一来，在向外行解释时，根本无法清晰地传达概念，但通过这些晦涩难懂的词语，这些人就可以树立权威。

-- [《一个 SRE 工程师的 AI 观点》](https://alienchow.dev/post/ai_takeaways_mar_2026/)

4、

建造房屋时，需要很多人参与：建筑师、土木工程师、水管工、电工、泥瓦匠、室内设计师、屋顶工、测量员、铺路工，等等。你不会指望一个人，甚至一家公司，完成所有这些工作。

但是，很多公司现在招聘程序员，往往希望一个人完成所有开发工作，比如全栈程序员。

-- [《做一个软件工程师的疯狂》](https://0x1.pt/2025/04/06/the-insanity-of-being-a-software-engineer/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
