# 阮一峰老师科技爱好者周刊汇总

## 前言

很喜欢阮一峰老师的 [科技爱好者周刊](https://github.com/ruanyf/weekly)，尤其是「工具」和「资源」部分内容，非常有趣且实用。

但是到目前为止周刊已经太多期，苦于查找困难，特将其汇总于此，方便查阅。

## 新版站点（推荐）

**在线访问：[https://ruanyf-weekly.yl.do](https://ruanyf-weekly.yl.do)**

基于 [Fumadocs](https://fumadocs.dev)（Astro）重新搭建的栏目汇总站，代码在 [`fumadocs`](https://github.com/LiLittleCat/tools-in-ruanyf-weekly/tree/fumadocs) 分支：

- **栏目汇总**：话题、科技动态、文章、教程、工具、资源、AI 相关、图片、文摘、言论 —— 每个栏目把所有期数的内容集中在一起，按年份分册浏览
- **期刊归档**：每一期的完整原文，按年份归类
- **全文搜索**：支持中文，覆盖所有期数的正文
- 每周五自动同步最新一期，由 Cloudflare Pages 构建发布

## 旧版汇总（mkdocs）

由于汇总内容太多图片，使用 GitHub 打开 Markdown 文件时会造成加载缓慢，建议使用静态页面查看，或者下载到本地查看。

静态页面：
[https://lilittlecat.github.io/tools-in-ruanyf-weekly/](https://lilittlecat.github.io/tools-in-ruanyf-weekly/)

源文件地址：
- [工具](https://cdn.jsdelivr.net/gh/LiLittleCat/tools-in-ruanyf-weekly/docs/tools.md)
- [资源](https://cdn.jsdelivr.net/gh/LiLittleCat/tools-in-ruanyf-weekly/docs/resources.md)

## 最新一期
<!-- <currentVersion>412</currentVersion> -->
<!-- Begin -->
# [科技爱好者周刊（第 412 期）：禁止 issue，只用 PR](https://github.com/ruanyf/weekly/blob/master/docs/issue-412.md)
### 工具


1、[FlyonUI](https://flyonui.com/)

![](https://cdn.beekka.com/blogimg/asset/202410/bg2024100504.webp)

一个基于 Tailwind CSS 的页面组件库。

2、[endlessh-go](https://github.com/shizunge/endlessh-go)

![](https://cdn.beekka.com/blogimg/asset/202403/bg2024032905.webp)

一个抵御恶意的 SSH 登陆的工具，它不会阻断那些请求，而是让它们一直处在等待状态，从而增加对方的成本。它支持 Grafana 面板。

3、[PuTTYgen](https://puttykeyinfo.com/)

![](https://cdn.beekka.com/blogimg/asset/202403/bg2024033001.webp)

Windows 平台生成密钥对的工具。

4、[gh gfm-preview](https://github.com/thiagokokada/gh-gfm-preview)

一个 Go 语言程序，用来新建一个服务，查看 Markdown 渲染结果。

5、[caddy-waf](https://github.com/fabriziosalmi/caddy-waf)

Web 服务器软件 Caddy 的应用防火墙（waf）插件，支持正则规则和 IP/DNS/ASN/国家黑名单来阻拦恶意请求。（[@abriziosalmi](https://github.com/ruanyf/weekly/issues/11486) 投稿）

6、[一息](https://github.com/Defiabell/yixi)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026090501.webp)

一个部署在 Cloudwork Worker 的网页应用，利用 iOS 的“快捷指令”，在打开某个 App 前自动跳转到该页面，10秒后再决定是否打开该 App。（[@Defiabell](https://github.com/ruanyf/weekly/issues/11509) 投稿）

7、[ctty](https://github.com/zsuroy/ctty)

![](https://cdn.beekka.com/blogimg/asset/202609/bg2026091001.webp)

一个开源的终端应用，在终端图形界面中，管理 SSH、串口、Telnet 等连接。（[@zsuroy](https://github.com/ruanyf/weekly/issues/11522) 投稿）

8、[vet](https://github.com/vet-run/vet)

![](https://cdn.beekka.com/blogimg/asset/202507/bg2025072420.webp)

一个 Bash 脚本检查工具，可以用它运行网上下载的脚本，它会告诉你脚本做了哪些变动，得到你的批准后才会实际运行。

9、[Krep](https://github.com/davidesantangelo/krep)

一个 grep 命令的替代品，用来在文本文件搜索指定字符串，据说比 grep 速度快50倍。

10、[Inbucket](https://inbucket.org/)

![](https://cdn.beekka.com/blogimg/asset/202407/bg2024070709.webp)

一个测试邮件发送功能的应用程序，嵌入你的应用，用它测试应用的邮件发送功能，自带 Web 后台。


### 资源


1、[黑客的 Linux 基础知识](https://github.com/ahegazy0/linux-basics-for-hackers-notes)（Linux Basics for Hackers）

一个英文教程，用通俗语言解释 Linux 基础概念，可以当做入门教材。

2、[DNSSEC 的工作原理](https://howdnssec.works/)

![](https://cdn.beekka.com/blogimg/asset/202506/bg2025062508.webp)

这个英文网站使用大量漫画，解释 DNS 安全扩展 (DNSSEC) 的机制，它可以防止 DNS 投毒。

3、[Gorgeous GRUB](https://github.com/Jacksaur/Gorgeous-GRUB)

![](https://cdn.beekka.com/blogimg/asset/202505/bg2025050406.webp)

这个仓库收集系统启动软件 Grub 的各种启动画面主题。


### 言论


1、

AI 替代作家，我没有出声，因为我不是作家。

然后，AI 替代艺术家，我没有出声，因为我不是艺术家。

现在，AI 替代程序员，已经没有人能为我说话了。

-- [《然后 AI 替代程序员了》](https://medium.com/@sebastiancarlos/the-tech-market-situation-is-crazy-ec49ea772903)

2、

目前，每五个新注册的顶级域名，就有一个是诈骗域名。

-- [《域名的恶意注册》](https://simonwillison.net/2026/Sep/6/the-purpose-of-dns-is-to-spread-scams/)

3、

人们让 AI 大量解决数学难题，但是数学难题是不可再生的，如今好的问题已经变得稀缺。

自动化工具解题，并没有增加人类的数学思维，损害了未来的数学发展。

-- [陶哲轩](https://mathstodon.xyz/@tao/117237320796901560)，著名数学家

4、

世界正在“电动化”，电池和电动机构成了生活的基础，再加上 AI 的飞速发展，意味着我们周围许多“无意识之物”将变得智能化，能够自主思考和移动。

-- [Noah Smith](https://www.noahpinion.blog/p/at-least-five-interesting-things-304)，美国经济分析师

5、

科学分成两种。“科学1”是一种理想化的追求真理，“科学2”是实际的科学实践，更多是一种社交活动，要考虑社会和政治现实。

如果你是一个博士生，你必须知道，你主要从事科学2，而不是科学1。

-- [《博士生不要试图改革科学》](https://maxwellforbes.com/posts/dont-try-to-reform-science/)


<!-- End -->


[![Powered by DartNode](https://dartnode.com/branding/DN-Open-Source-sm.png)](https://dartnode.com "Powered by DartNode - Free VPS for Open Source")
