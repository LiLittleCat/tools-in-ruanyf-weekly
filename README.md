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
<!-- <currentVersion>392</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 392 期）：axios 投毒与好莱坞式骗术](https://github.com/ruanyf/weekly/blob/master/docs/issue-392.md)
### 工具


1、[Google AI Edge Gallery](https://apps.apple.com/nl/app/google-ai-edge-gallery/id6749645337)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040601.webp)

本周，谷歌官方推出了一款苹果手机 App，为手机提供离线使用的 Gemma 4 模型。不需要上网，手机也能使用大模型了。

2、[apfel](https://apfel.franzai.com/)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040401.webp)

Mac 电脑内置了一个本地大模型，可以离线使用。但是，默认只有苹果自家的 Siri 能调用，安装了这个工具以后，就可以自己在命令行调用它了。

3、[Docking](https://docking.cc/)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040701.webp)

为 Linux 桌面添加类似苹果桌面的程序坞。

4、[Tantivy](https://github.com/quickwit-oss/tantivy)

Rust 语言写的全文搜索引擎库，可以替代 Apache Lucene，参见[介绍文章](https://www.paradedb.com/blog/tantivy-interview)。

5、[Open Screen](https://github.com/siddharthvaddem/openscreen)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040501.webp)

跨平台的桌面应用，用来录屏后制作介绍视频，提供各种配套编辑功能。

6、[epub-tts](https://github.com/rafael1mc/epub-tts)

这个开源工具将 epub 文件转成音频文件，也就是电子书转成有声书。

7、[NVTOP](https://github.com/Syllo/nvtop)

![](https://cdn.beekka.com/blogimg/asset/202403/bg2024031301.webp)

一个 Linux 系统的命令行程序，用来监控 GPU 显卡的状态，等同于显卡专用的 top 命令。

8、[dmcheck](https://github.com/PlayerYK/dmcheck)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040812.webp)

检查某个主题词的域名占用情况。（[@PlayerYK](https://github.com/ruanyf/weekly/issues/9542) 投稿）

9、[Reze Studio](https://github.com/AmyangXYZ/reze-studio)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040901.webp)

开源的动画曲线编辑网站。（[@AmyangXYZ](https://github.com/ruanyf/weekly/issues/9555) 投稿）

10、[gitlogue](https://github.com/unhappychoice/gitlogue)

这个工具可以将 Git 仓库的提交历史，在终端里面以动画形式重现，甚至可以显示为屏保。


### 资源


1、[佛津](https://fojin.app/)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040301.webp)

全球佛教古籍数字化聚合平台。（[@xr843](https://github.com/ruanyf/weekly/issues/9507) 投稿）

2、[Flight Viz](https://flight-viz.com/)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040811.webp)

实时 3D 显示全球的航班。（[@haojiang99](https://github.com/ruanyf/weekly/issues/9538) 投稿）

3、[GPU 时间线](https://sheets.works/data-viz/every-gpu)

![](https://cdn.beekka.com/blogimg/asset/202604/bg2026040809.webp)

这个网站用图片展示了 GPU 显卡的发展历程，从1996年的 Voodoo 卡到2025年的 RTX 5090 显卡。


### 言论


1、

如果你认为编写代码的速度是你的问题，那你面临的问题更大。

-- [Andrew Murphy](https://andrewmurphy.io/blog/if-you-thought-the-speed-of-writing-code-was-your-problem-you-have-bigger-problems)，澳大利亚程序员

2、

有一种兴奋，叫做2017年才刚接触加密货币的人才有的兴奋。

-- [Andrew Murphy](https://andrewmurphy.io/blog/if-you-thought-the-speed-of-writing-code-was-your-problem-you-have-bigger-problems)，澳大利亚程序员

3、

一项民意调查发现，美国年轻人对于婚姻、子女、信仰的重视程度，远不及他们的父母，对于传统的价值观——爱国主义、宗教、社区和家庭也很冷淡。

年轻人把市场和金钱当作道德准则。在他们眼里，市场决定了事物的价值、事件的意义、谁是正确的、谁是赢家、谁举足轻重。

-- [《预测市场的最糟糕后果》](https://www.derekthompson.org/p/we-havent-seen-the-worst-of-what)

4、

对我来说，未来城市实际上是像阿姆斯特丹那样的地方，到处都是舒适的街道和自行车道，而不是像迪拜那样的地方，有16车道的高速公路，以及一群被压迫的劳工阶级在俗气的豪华购物中心里工作。

-- [Hacker News 读者](https://news.ycombinator.com/item?id=47643388)

5、

高校都要求博士生发表论文，至于你写什么、怎么写的、内容与研究方向有没有关系，系里其实都不在意。系里需要论文，因为论文能证明经费的合理性，而经费又能证明系的存在价值。学生只不过是达成这个目标的生产资料。

-- [《机器没问题，有问题的是我们自己》](https://ergosphere.blog/posts/the-machines-are-fine/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
