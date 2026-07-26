# 科技爱好者周刊 · 栏目汇总站

把阮一峰老师的[《科技爱好者周刊》](https://github.com/ruanyf/weekly)按栏目跨期串联的静态站点，基于 [Fumadocs](https://fumadocs.dev)（Astro 模板）搭建。

- **栏目汇总**：话题、科技动态、文章、教程、工具、资源、AI 相关、图片、文摘、言论 —— 每个栏目把所有期数的内容集中在一起，按年份分册浏览。
- **期刊归档**：每一期的完整原文，按年份归类。
- 内容在构建时从 [ruanyf/weekly](https://github.com/ruanyf/weekly) 拉取并自动生成，仓库本身不存储周刊内容。

## 本地开发

```bash
pnpm install
pnpm dev        # 自动克隆/更新周刊源 + 生成内容 + 启动开发服务器
```

## 构建

```bash
pnpm build      # 输出到 dist/
pnpm preview
```

## 部署（Cloudflare Pages）

站点由 Cloudflare Pages 发布，生产分支为 **master**：

- **Build command**：`pnpm build`
- **Build output directory**：`dist`

每周更新不需要额外配置：master 上的旧版 Java CI（ci.yml）每周五 09:00（北京时间）会推送 "Update contents" 提交，这个 push 自动触发 Cloudflare 重新构建，构建时克隆最新周刊源，新站即同步到最新一期。平时开发在 `fumadocs` 分支（push 会跑构建检查），合并到 master 即发布。

如需部署到带子路径的地址，构建时设置 `BASE_PATH=/子路径`（Cloudflare 根域名部署不需要）。

## 工作原理

```
scripts/sync-content.mjs      浅克隆 ruanyf/weekly 到 vendor/weekly（已 gitignore）
scripts/generate-content.mjs  解析每期 Markdown，按 `##` 标题切分栏目，生成：
                              content/docs/issues/<年份>/issue-<期号>.md   每期完整内容
                              content/docs/columns/<栏目>/<年份>.md        栏目跨期聚合
```

各期的栏目标题历年有变化（如“科技动态/资讯/新闻”），脚本里维护了别名映射；每期开篇的话题文章标题是当期专属的，按“出现在常规栏目之前的第一个未知标题”识别。

## 版权

周刊内容版权归原作者阮一峰所有。本仓库仅包含站点代码。
