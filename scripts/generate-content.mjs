#!/usr/bin/env node
/**
 * 从 vendor/weekly（阮一峰《科技爱好者周刊》源仓库）生成 Fumadocs 内容：
 *
 *   content/docs/issues/<年份>/issue-<期号>.md   每一期的完整内容
 *   content/docs/columns/<栏目>/<年份>.md        某个栏目跨期聚合（按年份分册）
 *
 * 生成的文件不入库（见 .gitignore），构建前运行本脚本即可。
 */
import fs from 'node:fs';
import path from 'node:path';

const DOCS_DIR = path.resolve('vendor/weekly/docs');
const README_PATH = path.resolve('vendor/weekly/README.md');
const OUT_DIR = path.resolve('content/docs');

/** 跨期聚合的栏目。aliases 是历年出现过的同义标题。 */
const COLUMNS = [
  { slug: 'topic', name: '话题', desc: '每期开篇的深度话题文章', aliases: ['本周话题', '刊首语'] },
  { slug: 'news', name: '科技动态', desc: '每周值得关注的科技新闻', aliases: ['科技动态', '资讯', '新闻', '新奇'] },
  { slug: 'articles', name: '文章', desc: '值得阅读的中英文文章', aliases: ['文章'] },
  { slug: 'tutorials', name: '教程', desc: '早期周刊的教程栏目', aliases: ['教程'] },
  { slug: 'tools', name: '工具', desc: '实用的软件、网站与开发工具', aliases: ['工具'] },
  { slug: 'resources', name: '资源', desc: '教程、书籍与学习资料', aliases: ['资源'] },
  { slug: 'ai', name: 'AI 相关', desc: 'AI 模型、产品与应用', aliases: ['AI 相关'] },
  { slug: 'photos', name: '图片', desc: '有意思的图片与摄影', aliases: ['图片', '本周图片'] },
  { slug: 'excerpts', name: '文摘', desc: '书摘与长文摘录', aliases: ['文摘'] },
  { slug: 'quotes', name: '言论', desc: '每周言论与金句', aliases: ['言论', '言论与数字', '本周金句'] },
];

/** 不参与聚合、也不作为“话题”识别的杂项标题 */
const IGNORED_HEADINGS = new Set([
  '封面图', '订阅', '欢迎订阅', '鸣谢', '往年回顾', '回顾',
  '历史上的本周', '招聘信息', '活动', '谁在招人', '资料', '通知',
]);

const aliasToColumn = new Map();
for (const col of COLUMNS) for (const a of col.aliases) aliasToColumn.set(a, col.slug);

/* ---------------- 解析 ---------------- */

/** README 按年份列出每一期：解出 期号 -> 年份 */
function parseYearMap() {
  const map = new Map();
  let year = null;
  const text = fs.readFileSync(README_PATH, 'utf8');
  for (const line of text.split('\n')) {
    const y = line.match(/^##\s+(\d{4})/);
    if (y) { year = Number(y[1]); continue; }
    const i = line.match(/第\s*(\d+)\s*期/);
    if (i && year) map.set(Number(i[1]), year);
  }
  return map;
}

function parseTitle(firstLine) {
  const raw = firstLine.replace(/^#\s*/, '').trim();
  const m = raw.match(/（第\s*\d+\s*期）[:：]\s*(.+)$/);
  return { full: raw, subtitle: m ? m[1].trim() : null };
}

/** 把正文按 `## ` 切成有序 section 列表 */
function splitSections(body) {
  const sections = [];
  let current = null;
  for (const line of body.split('\n')) {
    const h = /^##\s+(.+?)\s*$/.exec(line);
    if (h && !line.startsWith('###')) {
      current = { heading: h[1].trim(), lines: [] };
      sections.push(current);
    } else if (current) {
      current.lines.push(line);
    }
  }
  return sections.map((s) => ({ heading: s.heading, content: s.lines.join('\n').trim() }));
}

function parseIssueFile(file, yearMap) {
  const num = Number(/issue-(\d+)\.md$/.exec(file)[1]);
  const text = fs.readFileSync(path.join(DOCS_DIR, file), 'utf8');
  const nl = text.indexOf('\n');
  const firstLine = nl === -1 ? text : text.slice(0, nl);
  const body = nl === -1 ? '' : text.slice(nl + 1).trim();
  const { full, subtitle } = parseTitle(firstLine);

  const columns = {};
  let seenCanonical = false;
  for (const sec of splitSections(body)) {
    let slug = aliasToColumn.get(sec.heading);
    // 话题栏目的标题是当期专属的（如“稳定币的博弈”）：
    // 取第一个出现在常规栏目之前、又不属于杂项的未知标题。
    if (!slug && !seenCanonical && !IGNORED_HEADINGS.has(sec.heading) && !columns.topic) {
      slug = 'topic';
    }
    if (!slug) continue;
    if (slug !== 'topic') seenCanonical = true;
    if (columns[slug]) columns[slug].content += '\n\n' + sec.content;
    else columns[slug] = { heading: sec.heading, content: sec.content };
  }

  return { num, title: full, subtitle, body, columns, year: yearMap.get(num) ?? null };
}

/* ---------------- 生成 ---------------- */

const yamlStr = (s) => JSON.stringify(String(s)); // JSON 字符串是合法的 YAML 标量

function frontmatter(fields) {
  const lines = Object.entries(fields)
    .filter(([, v]) => v != null)
    .map(([k, v]) => `${k}: ${yamlStr(v)}`);
  return `---\n${lines.join('\n')}\n---\n\n`;
}

/** 站内互链：把各种形式的 issue-N.md 链接改写为生成后的路径 */
function rewriteIssueLinks(markdown, issueUrl) {
  return markdown.replace(
    /\((?:https?:\/\/github\.com\/ruanyf\/weekly\/blob\/master\/docs\/)?(?:\.\/)?issue-(\d+)\.md(#[^)]*)?\)/g,
    (m, num, hash) => {
      const url = issueUrl(Number(num));
      return url ? `(${url}${hash || ''})` : m;
    },
  );
}

function writeFile(rel, content) {
  const abs = path.join(OUT_DIR, rel);
  fs.mkdirSync(path.dirname(abs), { recursive: true });
  fs.writeFileSync(abs, content);
}

function main() {
  if (!fs.existsSync(DOCS_DIR)) {
    console.error('[generate] vendor/weekly 不存在，请先运行 scripts/sync-content.mjs');
    process.exit(1);
  }

  fs.rmSync(path.join(OUT_DIR, 'issues'), { recursive: true, force: true });
  fs.rmSync(path.join(OUT_DIR, 'columns'), { recursive: true, force: true });

  const yearMap = parseYearMap();
  const files = fs.readdirSync(DOCS_DIR).filter((f) => /^issue-\d+\.md$/.test(f));
  const issues = files.map((f) => parseIssueFile(f, yearMap)).sort((a, b) => b.num - a.num);

  const numToIssue = new Map(issues.map((i) => [i.num, i]));
  const issueUrl = (num) => {
    const it = numToIssue.get(num);
    return it && it.year ? `/issues/${it.year}/issue-${num}` : null;
  };

  /* ----- 每一期 ----- */
  const byYear = new Map(); // year -> issues desc
  for (const issue of issues) {
    if (!issue.year) {
      console.warn(`[generate] 第 ${issue.num} 期未在 README 中找到年份，跳过`);
      continue;
    }
    if (!byYear.has(issue.year)) byYear.set(issue.year, []);
    byYear.get(issue.year).push(issue);

    const label = issue.subtitle ? `第 ${issue.num} 期：${issue.subtitle}` : `第 ${issue.num} 期`;
    writeFile(
      `issues/${issue.year}/issue-${issue.num}.md`,
      frontmatter({ title: label, description: issue.title }) +
        rewriteIssueLinks(issue.body, issueUrl),
    );
  }

  const yearsDesc = [...byYear.keys()].sort((a, b) => b - a);
  writeFile('issues/meta.json', JSON.stringify({ title: '期刊归档', pages: yearsDesc.map(String) }, null, 2));
  for (const year of yearsDesc) {
    writeFile(
      `issues/${year}/meta.json`,
      JSON.stringify({ title: `${year} 年`, pages: byYear.get(year).map((i) => `issue-${i.num}`) }, null, 2),
    );
  }

  /* ----- 栏目聚合（按年份分册） ----- */
  const activeColumns = [];
  for (const col of COLUMNS) {
    const colYears = new Map(); // year -> [{issue, content}]
    for (const issue of issues) {
      const sec = issue.columns[col.slug];
      if (!sec?.content || !issue.year) continue;
      if (!colYears.has(issue.year)) colYears.set(issue.year, []);
      colYears.get(issue.year).push({ issue, sec });
    }
    if (colYears.size === 0) continue;

    const colYearsDesc = [...colYears.keys()].sort((a, b) => b - a);
    activeColumns.push({ ...col, latestYear: colYearsDesc[0] });
    let total = 0;
    for (const year of colYearsDesc) {
      const entries = colYears.get(year);
      total += entries.length;
      const parts = entries.map(({ issue, sec }) => {
        const label = issue.subtitle ? `第 ${issue.num} 期：${issue.subtitle}` : `第 ${issue.num} 期`;
        const topicNote = col.slug === 'topic' && sec.heading !== issue.subtitle ? `**${sec.heading}**\n\n` : '';
        return (
          `## ${label}\n\n` +
          topicNote +
          rewriteIssueLinks(sec.content, issueUrl) +
          `\n\n[→ 查看本期完整内容](/issues/${issue.year}/issue-${issue.num})`
        );
      });
      writeFile(
        `columns/${col.slug}/${year}.md`,
        frontmatter({
          title: `${col.name} · ${year}`,
          description: `「${col.name}」栏目 ${year} 年汇总，共 ${entries.length} 期`,
        }) + parts.join('\n\n'),
      );
    }
    writeFile(
      `columns/${col.slug}/meta.json`,
      JSON.stringify({ title: col.name, description: col.desc, pages: colYearsDesc.map(String) }, null, 2),
    );
    console.log(`[generate] 栏目「${col.name}」：${total} 期，${colYearsDesc.length} 个年份`);
  }
  writeFile(
    'columns/meta.json',
    JSON.stringify({ title: '栏目汇总', defaultOpen: true, pages: activeColumns.map((c) => c.slug) }, null, 2),
  );

  /* ----- 首页（每个栏目链接到其实际存在的最新年份） ----- */
  const latest = issues.find((i) => i.year);
  const latestLabel = latest.subtitle ? `第 ${latest.num} 期：${latest.subtitle}` : `第 ${latest.num} 期`;
  const esc = (s) => String(s).replace(/"/g, '&quot;');
  const cards = activeColumns
    .map((col) => {
      const y = col.latestYear;
      return `  <Card title="${esc(col.name)}" href="/columns/${col.slug}/${y}">${esc(col.desc)}</Card>`;
    })
    .join('\n');
  writeFile(
    'index.mdx',
    frontmatter({ title: '首页', description: '阮一峰《科技爱好者周刊》栏目汇总站' }) +
      `很喜欢阮一峰老师的[科技爱好者周刊](https://github.com/ruanyf/weekly)，但周刊已有数百期，想回头翻某个栏目的内容非常困难。

这个站点把每一期按栏目拆开、跨期串联：**同一个栏目的所有内容集中在一起，按年份分册浏览**；同时也保留了每一期的完整原文（见左侧「期刊归档」）。

最新一期：[${latestLabel}](/issues/${latest.year}/issue-${latest.num})

## 按栏目浏览

<Cards>
${cards}
</Cards>

---

内容版权归属原作者阮一峰。本站每次构建时从 [ruanyf/weekly](https://github.com/ruanyf/weekly) 拉取最新内容自动生成。
`,
  );

  console.log(`[generate] 共 ${issues.length} 期，${yearsDesc.length} 个年份，输出到 content/docs/`);
}

main();
