param(
  [switch]$SkipDocker
)

$ErrorActionPreference = "Stop"
Set-StrictMode -Version Latest

$root = Resolve-Path (Join-Path $PSScriptRoot "..")
Push-Location $root
try {
  Write-Host "Restoring solution..."
  dotnet restore server/Lucky5.sln

  Write-Host "Building solution..."
  dotnet build server/Lucky5.sln -v minimal

  Write-Host "Running bootstrap tests..."
  dotnet run --project server/tests/Lucky5.Tests/Lucky5.Tests.csproj

  if (-not $SkipDocker) {
    if (-not (Get-Command docker -ErrorAction SilentlyContinue)) {
      throw "Docker not found. Re-run with -SkipDocker or install Docker."
    }

    Write-Host "Starting local stack with Docker Compose..."
    docker compose -f infra/docker-compose.yml --env-file infra/.env.local.example up -d --build
    Write-Host "Local stack started. API: http://localhost:5051 , Nginx: http://localhost:8080"
  }
}
finally {
  Pop-Location
}
