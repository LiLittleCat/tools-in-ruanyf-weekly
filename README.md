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
<!-- <currentVersion>352</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 352 期）：Bug 追踪系统的正确样子](https://github.com/ruanyf/weekly/blob/master/docs/issue-352.md)
### 工具


1、[Cap.js](https://github.com/tiagorangel1/cap)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025060116.webp)

一个网页上的机器人识别工具，用作 CAPTCHA 方案，采用 SHA-256 工作量证明算法。

2、[Quartz](https://github.com/jackyzha0/quartz)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025060803.webp)

Markdown 文档的静态站点发布器，适合用作收费服务 Obsidian Publish 的替代品。

3、[somo](https://github.com/theopfr/somo)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025061001.webp)

在 Linux 终端查看端口占用情况的工具。

4、[OOMOL Studio](https://github.com/ruanyf/weekly/issues/7029)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025061108.webp)

一款创新的桌面 IDE，把自己编写的函数设成节点，然后通过图形界面，把节点编排成工作流。（[@BlackHole1](https://github.com/ruanyf/weekly/issues/7029) 投稿）

5、[极测](https://www.jicesys.com/)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025061109.webp)

免费的通信调试助手，模拟 UDP、TCP、串口、WebSocket、ZeroMQ 等常见协议，进行通信测试。（[@seasonlaw](https://github.com/ruanyf/weekly/issues/7032) 投稿）

6、[container](https://github.com/apple/container)

苹果官方发布的 Mac 电脑运行 Linux 容器的工具。也就是说，Mac 电脑可以不装 Docker，就运行 Docker 容器。

7、[DarkFlare](https://github.com/doxx/darkflare)

一个命令行工具，在 CDN 上，将 TCP 流量伪装成 HTTPS 流量传输。

8、[JDownloader](https://jdownloader.org/)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025060901.webp)

开源的全平台下载工具，参考[这篇教程](https://www.xda-developers.com/raspberry-pi-downloading-device-entire-network/)，用树莓派搭建下载服务器。

9、[Pydoll](https://github.com/autoscrape-labs/pydoll)

一个操作浏览器的 Python 库，通过 Chrome DevTools Protocol，实现脚本操作本机的 Chrome 浏览器。

10、[Chili3D](https://github.com/xiangechen/chili3d)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025061103.webp)

基于浏览器的 3D CAD 软件，代码开源。


### 资源


1、[高等院校三千所](https://laosheng.top/fuwu/yuanxiao)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025061201.webp)

这个网站收录中国大学网址全集。（[@DiamonWoo](https://github.com/ruanyf/weekly/issues/7047) 投稿）

2、[Mullvad Leta](https://leta.mullvad.net/)

![](https://cdn.beekka.com/blogimg/asset/202505/bg2025053003.webp)

Mullvad 公司推出的一个搜索引擎。它从谷歌和 Brave 获取搜索结果，但是提供隐私保护，防止搜索引擎识别用户。

我试用感觉不错，速度很快，没有广告。

3、[DNS4EU](https://www.joindns4.eu/)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025060902.webp)

欧盟推出的公共 DNS，自带过滤广告功能。


### 言论


1、

很多人总是拖拖拉拉，抱怨自己没有做事的动力。但是，动力恰恰源自行动，只要你开始做一些事情，只要能朝着目标前进，你就会发现动力随之而来。

所以，当我遇到一个很艰巨的任务时，我会把问题分解成若干更简单的部分，此时我的目标不是完成任务，而只是让自己能够行动起来，向前迈出一小步。

-- [《摆脱拖延症》](https://spectrum.ieee.org/getting-past-procastination)

2、

最安全的代码并非优美、巧妙或优雅的代码，而是枯燥乏味的代码。

Go 语言就奉行这种理念，故意去除了那些富有表现力或优雅的写法，只保留简洁和可读的写法。这使得代码易于审查、难于滥用，不容易发生安全漏洞。

-- [《无聊胜过美丽》](https://blog.asymmetric.re/boredom-over-beauty-why-code-quality-is-code-security/)

3、

人们总是喜欢新东西，读书喜欢读新出版的书，听歌喜欢听新歌。

据统计，美国2024年流媒体音乐一共播放了1.4万亿次，其中近50%是2020年至2024年期间发行的歌曲，近80%是2010年或之后发行的歌曲。歌越老，听的人越少。

-- [美联社](https://apnews.com/article/taylor-swift-sabrina-carpenter-luminate-2024-report-9d3436e71d481a07d88aa13940a68c76)

4、

新 API 的采用速度将会大大减缓。因为大模型的学习内容仅限于已有的内容，新的 API 出现时，可供学习的内容必然很少。

另外，那些依赖大模型的人也会犹豫是否采用新 API，因为大模型使用旧 API 可以更快地完成相同的工作。

-- [Hacker News 读者](https://news.ycombinator.com/item?id=43953957)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
