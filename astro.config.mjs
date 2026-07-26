// @ts-check
import { defineConfig } from 'astro/config';
import react from '@astrojs/react';
import tailwindcss from '@tailwindcss/vite';
import mdx from '@astrojs/mdx';
import { unified } from '@astrojs/markdown-remark';
import {
  rehypeCode,
  remarkCodeTab,
  remarkHeading,
  remarkNpm,
  remarkStructure,
} from 'fumadocs-core/mdx-plugins';

const remarkPlugins = [
  remarkHeading,
  remarkCodeTab,
  remarkNpm,
  [remarkStructure, { exportAs: 'structuredData' }],
];

/**
 * 部署到 GitHub Pages 项目子路径时设置（如 BASE_PATH=/tools-in-ruanyf-weekly），
 * 本地开发/根路径部署留空即可。
 */
const base = process.env.BASE_PATH?.replace(/\/$/, '') || undefined;

/** 周刊图片量很大（全部在外部 CDN），统一懒加载 */
function rehypeLazyImages() {
  return (tree) => {
    const walk = (node) => {
      if (node.type === 'element' && node.tagName === 'img') {
        node.properties.loading = 'lazy';
        node.properties.decoding = 'async';
      }
      if (node.children) node.children.forEach(walk);
    };
    walk(tree);
  };
}

/**
 * 内容里的站内绝对链接（/issues/...、/columns/...）在子路径部署时补上 base 前缀。
 * 同时处理普通 markdown 链接和 MDX 组件属性（如首页的 <Card href>）。
 */
function rehypeBaseLinks() {
  return (tree) => {
    if (!base) return;
    const fix = (v) => (typeof v === 'string' && v.startsWith('/') && !v.startsWith('//') ? base + v : v);
    const walk = (node) => {
      if (node.type === 'element' && node.properties) {
        if (node.properties.href) node.properties.href = fix(node.properties.href);
        if (node.properties.src) node.properties.src = fix(node.properties.src);
      }
      if ((node.type === 'mdxJsxFlowElement' || node.type === 'mdxJsxTextElement') && node.attributes) {
        for (const attr of node.attributes) {
          if (attr.type === 'mdxJsxAttribute' && (attr.name === 'href' || attr.name === 'src')) {
            attr.value = fix(attr.value);
          }
        }
      }
      if (node.children) node.children.forEach(walk);
    };
    walk(tree);
  };
}

const rehypePlugins = [rehypeCode, rehypeLazyImages, rehypeBaseLinks];

export default defineConfig({
  site: process.env.SITE || undefined,
  base,
  markdown: {
    processor: unified({
      syntaxHighlight: false,
      remarkPlugins,
      rehypePlugins,
    }),
  },
  integrations: [
    react(),
    mdx({
      extendMarkdownConfig: true,
      syntaxHighlight: false,
    }),
  ],
  vite: {
    plugins: [tailwindcss()],
  },
});
