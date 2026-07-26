'use client';
import {
  SearchDialog,
  SearchDialogClose,
  SearchDialogContent,
  SearchDialogHeader,
  SearchDialogIcon,
  SearchDialogInput,
  SearchDialogList,
  SearchDialogOverlay,
  type SharedProps,
} from 'fumadocs-ui/components/dialog/search';
import type { SortedResult } from 'fumadocs-core/search';
import { useEffect, useState } from 'react';

/**
 * 基于 Pagefind 的全文搜索（支持中文）。
 * 索引在 `pnpm build` 时由 pagefind 扫描 dist/ 生成、按需分片加载。
 * 注意：dev 模式下没有索引，搜索仅在构建产物（pnpm preview / 线上）可用。
 */

interface PagefindSubResult {
  url: string;
  title: string;
  excerpt: string;
}

interface PagefindDocument {
  url: string;
  meta?: { title?: string };
  sub_results: PagefindSubResult[];
}

interface PagefindResult {
  id: string;
  data: () => Promise<PagefindDocument>;
}

interface Pagefind {
  init?: () => Promise<void>;
  options?: (opts: { baseUrl: string }) => Promise<void>;
  debouncedSearch: (query: string) => Promise<{ results: PagefindResult[] } | null>;
}

// 子路径部署时（astro base），pagefind 资源和返回的结果链接都要带前缀
const BASE = import.meta.env.BASE_URL.replace(/\/+$/, '');

let pagefindPromise: Promise<Pagefind> | null = null;

function loadPagefind(): Promise<Pagefind> {
  pagefindPromise ??= import(/* @vite-ignore */ `${BASE}/pagefind/pagefind.js`).then(
    async (pf: Pagefind) => {
      await pf.options?.({ baseUrl: `${BASE}/` });
      await pf.init?.();
      return pf;
    },
  );
  return pagefindPromise;
}

const stripHtml = (html: string) => html.replace(/<[^>]+>/g, '');

export default function DefaultSearchDialog(props: SharedProps) {
  const [search, setSearch] = useState('');
  const [results, setResults] = useState<SortedResult[] | null>(null);
  const [isLoading, setIsLoading] = useState(false);

  useEffect(() => {
    if (!search.trim()) {
      setResults(null);
      return;
    }
    let cancelled = false;
    setIsLoading(true);

    void (async () => {
      try {
        const pagefind = await loadPagefind();
        const res = await pagefind.debouncedSearch(search);
        if (!res || cancelled) return; // 被更新的输入取代

        const items: SortedResult[] = [];
        for (const result of res.results.slice(0, 12)) {
          const doc = await result.data();
          if (cancelled) return;
          items.push({
            id: result.id,
            type: 'page',
            url: doc.url,
            content: doc.meta?.title ?? doc.url,
          });
          for (const sub of doc.sub_results.slice(0, 3)) {
            items.push({
              id: `${result.id}:${sub.url}`,
              type: 'text',
              url: sub.url,
              content: stripHtml(sub.excerpt),
            });
          }
        }
        setResults(items);
      } catch {
        // dev 模式没有索引，或索引加载失败
        if (!cancelled) setResults([]);
      } finally {
        if (!cancelled) setIsLoading(false);
      }
    })();

    return () => {
      cancelled = true;
    };
  }, [search]);

  return (
    <SearchDialog search={search} onSearchChange={setSearch} isLoading={isLoading} {...props}>
      <SearchDialogOverlay />
      <SearchDialogContent>
        <SearchDialogHeader>
          <SearchDialogIcon />
          <SearchDialogInput placeholder="搜索全部期刊内容…" />
          <SearchDialogClose />
        </SearchDialogHeader>
        <SearchDialogList items={results} />
      </SearchDialogContent>
    </SearchDialog>
  );
}
