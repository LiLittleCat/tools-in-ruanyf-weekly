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
<!-- <currentVersion>367</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 367 期）：Nano Banana 的几个妙用](https://github.com/ruanyf/weekly/blob/master/docs/issue-367.md)
### 工具


1、[gpu-kill](https://github.com/kagehq/gpu-kill)

![](https://cdn.beekka.com/blogimg/asset/202509/bg2025092201.webp)

显示 GPU 运行信息的一个工具，自带 Web 管理面板，支持 Nvidia/AMD/Intel/Apple 各种品牌。

另有一个在线 GPU 性能测试网站 [Volume Shader BM](https://www.volumeshader.dev/)。（[@BOS1980](https://github.com/ruanyf/weekly/issues/7804) 投稿）

![](https://cdn.beekka.com/blogimg/asset/202509/bg2025092410.webp)

2、[RustNet](https://github.com/domcyrus/rustnet)

![](https://cdn.beekka.com/blogimg/asset/202509/bg2025092011.webp)

监控网络流量的终端工具，会显示连接的详细信息，跨平台。

3、[PortNote](https://github.com/crocofied/PortNote)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025060114.webp)

一个自托管的仪表盘，列出被各种服务占用的本地端口。与 Compose 文件结合后，可以启动/停止 Docker 容器，参见[介绍文章](https://www.xda-developers.com/reasons-why-portnote-port-of-call-on-every-server/)。

4、[Atlas](https://github.com/karam-ajaj/atlas)

![](https://cdn.beekka.com/blogimg/asset/202509/bg2025092407.webp)

一个 Docker 容器，扫描当前网络，图形化显示网络节点信息。

5、[Midnight Commander](https://github.com/MidnightCommander/mc)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025060107.webp)

基于终端的文件管理器，支持 Linux 和 Mac。

另有一个类似的终端文件管理器 [Yazi](https://github.com/sxyazi/yazi)。

![](https://cdn.beekka.com/blogimg/asset/202509/bg2025092408.webp)

6、[frp-tunnel-cli](https://github.com/openapphub/frpc-cli)

内网穿透工具 [frp](https://gofrp.org/zh-cn/docs/overview/) 的一个客户端辅助 Bash 脚本，简化隧道的创建和管理。（[@openapphub](https://github.com/ruanyf/weekly/issues/7785) 投稿）

7、[Hamsterbase Tasks](https://github.com/hamsterbase/tasks)

![](https://cdn.beekka.com/blogimg/asset/202509/bg2025092101.webp)

开源的任务管理软件，支持 Web/手机/桌面各个平台，可以 Docker 部署。（[@CaryTrivett](https://github.com/ruanyf/weekly/issues/7792) 投稿）

8、[db-back-tool](https://github.com/iKeepLearn/db-back-tool)

网友自己写的 PostgreSQL/MySQL 数据库的备份工具，可以自动备份、加密、压缩数据库，并将备份文件上传至腾讯云 COS 或阿里云 OSS。（[@iKeepLearn](https://github.com/ruanyf/weekly/issues/7798) 投稿）

9、[X-CMD](https://github.com/x-cmd/x-cmd)

![](https://cdn.beekka.com/blogimg/asset/202509/bg2025092412.webp)

一个命令行工具集，一键启用 1000+ CLI 工具，跨平台，支持 AI 功能。（[@Zhengqbbb](https://github.com/ruanyf/weekly/issues/7806) 投稿）


### 资源


1、[99个物理小实验](https://interactivetextbooks.tudelft.nl/showthephysics/Introduction/About.html)

![](https://cdn.beekka.com/blogimg/asset/202509/bg2025092003.webp)

一本在线的英文书籍，精选了荷兰中学物理的99个小实验，涉及各个领域（力、光、磁、波等等）。

2、[NPM 安全最佳实践](https://github.com/bodadotsh/npm-security-best-practices)

最近爆出了一系列 npm 软件包投毒事件，这个仓库收录了各种 npm 安全措施，分为使用者和发布者两大部分。


### 言论


1、

AI 会一直扩展，一直到大部分太阳的能量都被用于计算。

-- [马斯克最新访谈](https://t.wangbase.com/0ZKey)

2、

我认为，火星可以在30年内自给自足。每两年，行星会排成一条直线，你就可以出发去火星。所以，30年内大约有10到15个左右的火星出发窗口。

每次出发，运往火星的货物吨位会呈指数级增长，那么30年内，我们可以让火星自给自足。

-- [马斯克最新访谈](https://t.wangbase.com/0ZKey)

3、

软件业悄然兴起一种新的工作“氛围清理”（Vibe Coding cleanup），专门解决“氛围编程”导致的问题。这真是 AI 时代最大的讽刺：人类被雇来清理 AI 的垃圾。

-- [《氛围清理即服务》](https://donado.co/en/articles/2025-09-16-vibe-coding-cleanup-as-a-service/)

4、

AI 泡沫是很有可能的，但对于 Meta 这样的公司来说，更大的风险是犹豫不决。

如果我们最终为 AI 浪费了数千亿美元，显然非常不幸，但我实际上认为错过 AI 的风险更高。对于我们来说，风险不是过于激进，而是不够激进。

-- [扎克伯格](https://finance.sina.cn/7x24/2025-09-19/detail-infqzkhk9726343.d.html)

5、

今天的计算机是响应者（responder）：你让它做某事，它就会去做。下一阶段的计算机是“代理”（agent），它就像一个盒子里的小人，开始预测你想要什么。它不是帮助你，而是引导你处理大量的信息，就像你在盒子里有一个小伙伴。

-- [乔布斯](https://simonwillison.net/2025/Sep/18/steve-jobs/)，1984年的采访


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
