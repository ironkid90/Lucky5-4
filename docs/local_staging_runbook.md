# Local + Staging Runbook

## Local development

1. Build and run tests:
   - `pwsh ./scripts/run-tests.ps1`
2. Start API directly:
   - `dotnet run --project server/src/Lucky5.Api/Lucky5.Api.csproj`
3. Optional full local stack:
   - `docker compose -f infra/docker-compose.yml --env-file infra/.env.local.example up -d --build`
4. Run API smoke flow:
   - `pwsh ./scripts/smoke-api.ps1 -BaseUrl http://localhost:5051`

## Staging baseline

1. Copy `infra/.env.staging.example` to real secure env file.
2. Inject secrets from secret store:
   - `POSTGRES_PASSWORD`
   - `JWT_SIGNING_KEY`
3. Enforce TLS termination at reverse proxy.
4. Confirm WebSocket upgrade path for `/CarrePokerGameHub`.
5. Restrict CORS to staging client origin only.
6. Run smoke test against staging URL.

## Required env variables

Server:

- `ASPNETCORE_ENVIRONMENT`
- `CONNECTIONSTRINGS__POSTGRES`
- `REDIS__CONNECTION`
- `JWT__ISSUER`
- `JWT__AUDIENCE`
- `JWT__SIGNING_KEY`
- `SIGNALR__HEARTBEAT_SECONDS`
- `GAME__HOUSE_RULESET_VERSION`
- `CORS__ALLOWED_ORIGINS`

Client (`--dart-define`):

- `API_BASE_URL`
- `HUB_URL`
- `APP_ENV`
- `ENABLE_VERBOSE_LOGGING`
- `REQUEST_TIMEOUT_MS`
