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
<!-- <currentVersion>387</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 387 期）：你是领先的](https://github.com/ruanyf/weekly/blob/master/docs/issue-387.md)
### 工具


1、[yj_nearbyglasses](https://github.com/yjeanrenaud/yj_nearbyglasses)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030402.webp)

开源的安卓应用，检查你的周围有没有智能眼镜。

2、[explain-my-curl](https://github.com/akgitrepos/explain-my-curl)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030403.webp)

curl 命令的一个终端界面，可以解释命令的运行结果。

3、[Pocket ID](https://github.com/pocket-id/pocket-id)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030501.webp)

一个需要自搭建的 OIDC 身份认证服务，支持 Passkey 无密码登录，设置参考[这篇文章](https://runtimeterror.dev/pocket-id-easy-passkey-authentication/)。

4、[R2 Web](https://github.com/vikiboss/r2-web)

![](https://cdn.beekka.com/blogimg/asset/202602/bg2026022703.webp)

文件存储服务 Cloudflare R2 的 Web 客户端，可以上传/管理文件。（[@vikiboss](https://github.com/ruanyf/weekly/issues/9081) 投稿）

5、[Voxt](https://github.com/hehehai/voxt)

macOS 应用，用于语音转文本、语音的实时翻译。（[@hehehai](https://github.com/ruanyf/weekly/issues/9091) 投稿）

6、[Cutia](https://github.com/msgbyte/cutia)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030103.webp)

开源的网页视频编辑器，网页版的 [CapCut](https://www.capcut.com/) 替代品，试用 [Demo](https://cutia.msgbyte.com/)。（[@moonrailgun](https://github.com/ruanyf/weekly/issues/9092) 投稿）

7、[Gorse](https://github.com/gorse-io/gorse)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030201.webp)

开源的推荐引擎，会自动对数据进行训练，为每个用户生成推荐，方便接入各种在线服务。（[@zhenghaoz](https://github.com/ruanyf/weekly/issues/9098) 投稿）

8、[vscode-stylelint-plus](https://github.com/hex-ci/vscode-stylelint-plus)

一个 VSCode 插件，对 CSS、SCSS、Less 等进行代码检查。（[@hex-ci](https://github.com/ruanyf/weekly/issues/9111) 投稿）

9、[OneDroid](https://qingge.tech/onedroid/web/)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030401.webp)

开源的安卓应用，提供多种实用工具，来管理你的安卓设备。（[@QingGeTech](https://github.com/ruanyf/weekly/issues/9126) 投稿）

10、[NoteCalc](https://github.com/2234839/TsFullStack)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030502.webp)

所见即所得实时计算笔记本。（[@2234839](https://github.com/ruanyf/weekly/issues/9139) 投稿）


### 资源


1、[MicroGPT 交互式讲解](https://growingswe.com/blog/microgpt)（英文）

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030203.webp)

MicroGPT 是一个200行的 Python 脚本 ，用来解释 ChatGPT 的原理。本文使用互动式动画分析 MicroGPT，适合初学者了解大模型算法。

2、[2026年全国樱花花期预测](https://rogerzhu.github.io/yinghua-map/)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030305.webp)

预报全国各地樱花开花的日期。（[@rogerzhu](https://github.com/ruanyf/weekly/issues/9114) 投稿）

3、[Now I Get It!](https://nowigetit.us/)

![](https://cdn.beekka.com/blogimg/asset/202603/bg2026030101.webp)

上传一个科学论文 PDF 文件，该网站将其转成一个互动式网页（上图），用浅显英语来解释论文，目前是免费服务。


### 言论


1、

让我非常惊讶的是，人们最近突然开始做一些早就应该做的事情：

（1）撰写简洁、直截了当的文档，把它放在 AGENTS.md 文件里。

（2）实现非常有价值的工作流程，以技能或 MCP 服务器的形式暴露出来。

（3）改进测试和命令行工具的输出，使其带有更多信息。

-- [《AI=true 是反模式》](https://keleshev.com/ai-equals-true-is-an-anti-pattern)

2、

GitHub 最近频繁宕机，我认为原因并不是他们在运行 AI 生成的代码，而是用户在提交 AI 生成的代码，导致提交内容和频率远超以往，GitHub 不堪重负。

-- [Hacker News 读者](https://news.ycombinator.com/item?id=47238176)

3、

GitHub Star 曾经是一个很好的指标，直到人们逐渐意识到它确实是一个很好的指标。

-- [Hacker News 读者](https://news.ycombinator.com/item?id=47220006)

4、

有了 AI，工程师一个迭代可以做七个功能，晋升毫无难度。

-- [《当代码生成速度超过理解速度》](https://www.rockoder.com/beyondthecode/cognitive-debt-when-velocity-exceeds-comprehension/)

5、

吃掉大象只有一种方法：一口一口地吃。

-- [南非主教图图](https://www.huddleupgroup.com/post/one-bite-at-a-time)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
