#!/bin/bash
set -e

cd server && dotnet restore Lucky5.sln --verbosity quiet

if [ -d "../web" ] && [ -f "../web/package.json" ]; then
  cd ../web && npm install --silent 2>/dev/null || true
fi
