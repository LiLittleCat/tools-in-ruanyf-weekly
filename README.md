# 阮一峰老师科技爱好者周刊「工具」和「资源」汇总

## 前言
很喜欢阮一峰老师的 [科技爱好者周刊](https://github.com/ruanyf/weekly)，尤其是「工具」和「资源」部分内容，非常有趣且实用。 

但是到目前为止周刊已经两百多期，苦于查找困难，特将其汇总于此，方便查阅。

## 汇总
- [工具](doc/工具.md)
- [资源](doc/资源.md)

## 最新一期
<!-- <currentVersion>232</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 232 期）：好用的平面设计软件](https://github.com/ruanyf/weekly/blob/master/docs/issue-232.md)
### 工具


1、[Stable Diffusion](https://github.com/Stability-AI/stablediffusion)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022112410.webp)

这是眼下最热门的 AI 作图模型，本周发布了[2.0版](https://stability.ai/blog/stable-diffusion-v2-release)。图片质量得到了提高，性能进行了优化。更重要的是，它只需要一个 GPU，家用 PC 就能运行。

2、[Diffusion Bee](https://diffusionbee.com/)

![](https://cdn.beekka.com/blogimg/asset/202209/bg2022091301.webp)

一个 MacOS 应用，将 Stable Diffusion 模型做成一个安装包，带有图形界面，号称是苹果电脑使用该模型的最容易方法。另有一个同类应用 [CHARL-E](https://www.charl-e.com/)，以及一个命令行应用 [ImaginAIry](https://github.com/brycedrennan/imaginAIry)。

3、[SkyWater SKY130 PDK](https://github.com/google/skywater-pdk)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022112413.webp)

谷歌发起的一个项目，任何人都可以提交芯片设计，由代工厂以130纳米制程做出来。它的主要目的是建立开源的芯片设计生态，取代目前的封闭生态，参见[介绍文章](https://asianometry.substack.com/p/googles-open-source-hardware-dreams)。

4、[Grape](https://www.grape.codes/)

![](https://cdn.beekka.com/blogimg/asset/202209/bg2022091004.webp)

这个工具提供一个 Web IDE，用于让用户演示代码操作。它可以把操作过程录制下来，像视频一样播放，但实际是一个小体积的脚本，便于分享和传播。

5、[Tipi](https://github.com/meienberger/runtipi)

![](https://cdn.beekka.com/blogimg/asset/202209/bg2022091101.webp)

一个家庭服务器的管理界面，集成了许多服务（比如流媒体、代码托管、BT 下载等等）。只要点击一个服务，就会启动一个容器来运行它。

6、[中科大测速网站](https://test.ustc.edu.cn/)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022112402.webp)

检测你的网速，代码[开源](https://github.com/bg6cq/speedtest)。（[@xcuYao](https://github.com/ruanyf/weekly/issues/2755) 投稿）

7、[PicHoro](https://github.com/Kuingsmile/PicHoro)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022112403.webp)

手机端的图床管理和文件上传下载工具，用于将手机照片和文件上传到各种云存储服务，基于 Flutter。（[@Kuingsmile](https://github.com/ruanyf/weekly/issues/2756) 投稿）

8、[ContainerSSH](https://github.com/ContainerSSH/ContainerSSH)

![](https://cdn.beekka.com/blogimg/asset/202209/bg2022091109.webp)

一个 SSH 服务器。用户使用 ssh 登陆时，它会自动启动一个容器，让用户登陆到这个容器里面，而不是登陆到底层机器，用户不会觉察。

9、[Ebook Reader](https://github.com/ttu-ttu/ebook-reader)

![](https://cdn.beekka.com/blogimg/asset/202209/bg2022091110.webp)

一个开源的网页阅读器，用来阅读 EPUB 电子书。

10、[wtf](https://github.com/dlenski/wtf)

一个 Python 命令行脚本，用来处理文本文件各种多余的空行空格，提供多种配置项。


### 资源
 

1、[Lexica](https://lexica.art/)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022112409.webp)

Stable Diffusion 模型的搜索引擎，可以搜索这个 AI 作图模型所生成的各种图片。

2、[INS](https://github.com/zhaoolee/ins)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022112411.webp)

这个仓库收集各种有用有趣的工具，并且每天用 GitHub Actions 检查链接的可用性。（[@zhaoolee](https://github.com/ruanyf/weekly/issues/2759) 投稿）

3、[如何配置 NeoVim](https://mattermost.com/blog/how-to-install-and-set-up-neovim-for-code-editing/)

![](https://cdn.beekka.com/blogimg/asset/220204/bg2022041706.webp)

一篇详细的教程，教你如何配置 NeoVim 编辑器（Vim 编辑器的重构，使用 Lua 语言作为脚本引擎）。这是第一部分，还有[第二部分](https://mattermost.com/blog/turning-neovim-into-a-full-fledged-code-editor-with-lua/)。

4、[CodeGuessr](https://codeguessr.vercel.app/)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022112401.webp)

一个代码小游戏。它从 GitHub 排名前100的仓库，随机返回一个文件，让你猜是哪一个仓库，参见[介绍文章](https://healeycodes.com/codeguessr)。（[@jerrylususu](https://github.com/ruanyf/weekly/issues/2754) 投稿）

5、[物联网开发板模拟器](https://wokwi.com/)

![](https://cdn.beekka.com/blogimg/asset/202211/bg2022112404.webp)

这个网站模拟各种物联网开发板，比如树莓派 Pico、Arduino、ESP32等。你在网页上输入项目代码，可以看到硬件的模拟执行结果。（[@mingpepe](https://github.com/ruanyf/weekly/issues/2757) 投稿）


<!-- End -->
