# 阮一峰老师科技爱好者周刊「工具」和「资源」汇总

## 前言
很喜欢阮一峰老师的 [科技爱好者周刊](https://github.com/ruanyf/weekly)，尤其是「工具」和「资源」部分内容，非常有趣且实用。 

但是到目前为止周刊已经两百多期，苦于查找困难，特将其汇总于此，方便查阅。

## 汇总
- [工具](doc/工具.md)
- [资源](doc/资源.md)

## 最新一期
<!-- <currentVersion>231</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 231 期）：互联网公司需要多少员工？](https://github.com/ruanyf/weekly/blob/master/docs/issue-231.md)
### 工具


1、[VOCALOID 6](https://www.vocaloid.com/en/) 

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111108.webp)

雅马哈公司发布的一个 AI 工具，会根据配乐和歌词自动演唱，也就是说，不需要歌手了。

官方目前支持日文和英文，但是国内的公司已经开发出了中文声库，比如“星尘 infinity”声库。

下面就是这个软件演唱的中文歌曲（[B 站](https://www.bilibili.com/video/BV1uP4y1g7c3/)，[Youtube](https://www.youtube.com/watch?v=GYSJYs7Blp0)），根本听不出是软件在唱歌。

<iframe frameborder="0" src="https://v.qq.com/txp/iframe/player.html?vid=u336353v8te" allowFullScreen="true" width="600" height="400"></iframe>

2、[Aerial](https://aerialscreensaver.github.io/)

![](https://cdn.beekka.com/blogimg/asset/202209/bg2022090512.webp)

一款免费的开源 Mac 屏幕保护程序，可以在电脑上播放 Apple tvOS 的屏保视频。

3、[Sapling](https://sapling-scm.com/docs/introduction/getting-started/)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111710.webp)

Facebook（现在叫 Meta）内部使用的版本管理工具，最近[开源](https://engineering.fb.com/2022/11/15/open-source/sapling-source-control-scalable/)了。它兼容 Git 协议，可以替代 git 的命令行客户端，用起来更简单和合理。

4、[Draw Things: AI Generation](https://apps.apple.com/us/app/draw-things-ai-generation/id6444050820)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111112.webp)

一个 iOS App，在苹果手机上（最好是最新型号）运行 Stable Diffusion 模型，根据文本描述生成图像，参见作者的[说明文章](https://liuliu.me/eyes/stretch-iphone-to-its-limit-a-2gib-model-that-can-draw-everything-in-your-pocket/)。

5、[AutoCut](https://github.com/mli/autocut)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111727.webp)

这是一个视频编辑软件，通过编辑字幕文件，完成视频剪切，适合课程/讲座类视频的编辑。如果视频没有字幕，也可以自动生成。（[@jerrylususu](https://github.com/ruanyf/weekly/issues/2743) 投稿）

6、[Aurora](https://github.com/linhaojun857/aurora)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111724.webp)

一个在校大学生开源的博客系统，后端基于 Java 的 Spring Boot，前端基于 Vue，自带管理后台。（[@linhaojun857](https://github.com/ruanyf/weekly/issues/2737) 投稿）

7、[MindShow.fun](https://www.mindshow.fun/)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111728.webp)

免费的 Web 服务，根据大纲笔记的层级，自动生成幻灯片。可以选择主题和模板，直接在浏览器演示，也可以导出成 PDF。（[@huansixie6rj](https://github.com/ruanyf/weekly/issues/2744) 投稿）

8、[xfrpc](https://github.com/liudf0716/xfrpc)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111729.webp)

内网穿透工具 frp 的 C 语言客户端。原本的 frp 客户端使用 Go 语言，可执行文件较大，无法安装在路由器上，用 C 语言实现就可以了。（[@liudf0716](https://github.com/ruanyf/weekly/issues/2745) 投稿）

9、[Metaphor](https://metaphor.systems/)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111110.webp)

一个搜索引擎，特点是使用 AI 的方式处理问题，所以可以搜索一些很奇怪的问题，比如“19世纪有什么类似马斯克那样的人物”。

10、[Notesnook](https://notesnook.com/)

![](https://cdn.beekka.com/blogimg/asset/202209/bg2022090518.webp)

一个开源的端对端加密的笔记服务，保证内容完全私密，即使泄漏也无法破解。它有 Web 端、桌面端、手机端。你可以用官方服务器，也可以自己架设服务器。

11、**人生报告**

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111725.webp)

一个微信小程序（微信搜索“人生报告”），将周刊224期介绍的 life-stats 改造成中文版。用户输入生日，它返回一些统计数字，比如心跳了多少次，睡了多少小时。（[@jonsonox](https://github.com/ruanyf/weekly/issues/2740) 投稿）


### 资源


1、[QUIC 协议图解](https://quic.ulfheim.net/)

![](https://cdn.beekka.com/blogimg/asset/202206/bg2022062201.webp)

前不久，HTTP/3 协议正式定案，基本就是照搬了谷歌的 QUIC 协议。本文使用图解，详细解释了 QUIC 的每一步、每个字节的含义。

2、[Effective Shell](https://effective-shell.com/)

![](https://cdn.beekka.com/blogimg/asset/202206/bg2022062211.webp)

一本免费的英文电子书，讲解命令行 Shell 的用法。

3、[开源面对面](https://osf2f.net/)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022111726.webp)

一档介绍开源软件的播客访谈节目。（[@LinuxSuRen](https://github.com/ruanyf/weekly/issues/2742) 投稿）

4、[90年代鼠标效果](https://tholman.com/cursor-effects/)

这个仓库收集上个世纪90年代的各种鼠标效果，比如鼠标后面跟着一串小星星。


<!-- End -->
