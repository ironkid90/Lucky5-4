#!/usr/bin/env node

/**
 * sync-web.mjs
 * -----------
 * Copies the web frontend from server/src/Lucky5.Api/wwwroot/ into mobile/www/
 * and patches asset paths so they work inside the Capacitor Android WebView.
 *
 * Usage:  node scripts/sync-web.mjs [--api-url <url>]
 *
 * When no --api-url is supplied the default comes from mobile/env.json (if present)
 * or falls back to '' (same-origin, for local dev).
 */

import { cpSync, mkdirSync, readFileSync, writeFileSync, existsSync } from 'node:fs';
import { resolve, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';

const __dirname = dirname(fileURLToPath(import.meta.url));
const MOBILE_ROOT = resolve(__dirname, '..');
const REPO_ROOT   = resolve(MOBILE_ROOT, '..');
const SRC_DIR     = resolve(REPO_ROOT, 'server', 'src', 'Lucky5.Api', 'wwwroot');
const DEST_DIR    = resolve(MOBILE_ROOT, 'www');

// ---------- resolve API base URL ----------
let apiUrl = '';

// CLI flag takes priority
const apiIdx = process.argv.indexOf('--api-url');
if (apiIdx !== -1 && process.argv[apiIdx + 1]) {
  apiUrl = process.argv[apiIdx + 1];
}

// Fallback: mobile/env.json
if (!apiUrl) {
  const envPath = resolve(MOBILE_ROOT, 'env.json');
  if (existsSync(envPath)) {
    try {
      const env = JSON.parse(readFileSync(envPath, 'utf8'));
      apiUrl = env.apiUrl || '';
    } catch { /* ignore parse errors */ }
  }
}

// ---------- copy web assets ----------
console.log(`[sync-web] source : ${SRC_DIR}`);
console.log(`[sync-web] dest   : ${DEST_DIR}`);
console.log(`[sync-web] apiUrl : ${apiUrl || '(same-origin)'}`);

mkdirSync(DEST_DIR, { recursive: true });
cpSync(SRC_DIR, DEST_DIR, { recursive: true, force: true });

// ---------- patch index.html ----------
// Convert absolute asset paths (/css/..., /js/..., /assets/...) to relative
// so that Capacitor's local file:// or https://localhost scheme resolves them.
const indexPath = resolve(DEST_DIR, 'index.html');
let html = readFileSync(indexPath, 'utf8');
html = html
  .replace(/href="\//g, 'href="./')
  .replace(/src="\//g,  'src="./');
writeFileSync(indexPath, html, 'utf8');
console.log('[sync-web] patched index.html (absolute → relative paths)');

// ---------- patch game.js ----------
// Inject the API base URL at the top of game.js so the app can reach the
// remote server when running inside the Android WebView.
const jsPath = resolve(DEST_DIR, 'js', 'game.js');
let js = readFileSync(jsPath, 'utf8');
js = js.replace(
  /^const API\s*=\s*['"][^'"]*['"];?/m,
  `const API = '${apiUrl}';`
);
// Convert absolute asset paths in JS strings to relative (e.g. '/assets/...' → '../assets/...')
js = js.replace(/(['"`])\/(assets\/)/g, '$1../$2');
writeFileSync(jsPath, js, 'utf8');
console.log(`[sync-web] patched game.js  API = '${apiUrl}'`);

// ---------- patch game.css ----------
// Convert any absolute url() references to relative paths
// Handles both url(/path) and url('/path') and url("/path")
const cssPath = resolve(DEST_DIR, 'css', 'game.css');
if (existsSync(cssPath)) {
  let css = readFileSync(cssPath, 'utf8');
  css = css.replace(/url\(\s*(['"]?)\//g, 'url($1../');
  writeFileSync(cssPath, css, 'utf8');
  console.log('[sync-web] patched game.css (absolute → relative url() paths)');
}

console.log('[sync-web] done ✓');
