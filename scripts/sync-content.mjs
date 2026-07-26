#!/usr/bin/env node
/**
 * 同步阮一峰《科技爱好者周刊》源仓库到 vendor/weekly。
 * 首次运行浅克隆；之后运行时尝试拉取更新（离线时静默跳过）。
 */
import { execSync } from 'node:child_process';
import { existsSync } from 'node:fs';
import path from 'node:path';

const REPO = 'https://github.com/ruanyf/weekly';
const DEST = path.resolve('vendor/weekly');

if (!existsSync(DEST)) {
  console.log(`[sync] cloning ${REPO} ...`);
  execSync(`git clone --depth 1 ${REPO} "${DEST}"`, { stdio: 'inherit' });
} else {
  try {
    console.log('[sync] updating vendor/weekly ...');
    execSync('git pull --depth 1 --rebase', { cwd: DEST, stdio: 'inherit', timeout: 60_000 });
  } catch {
    console.warn('[sync] pull failed (offline?), using existing copy.');
  }
}
