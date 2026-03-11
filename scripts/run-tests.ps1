$ErrorActionPreference = "Stop"
Set-StrictMode -Version Latest

$root = Resolve-Path (Join-Path $PSScriptRoot "..")
Push-Location $root
try {
  dotnet build server/Lucky5.sln -v minimal
  dotnet run --project server/tests/Lucky5.Tests/Lucky5.Tests.csproj
}
finally {
  Pop-Location
}
