param(
  [string]$BaseUrl = "http://localhost:5051"
)

$ErrorActionPreference = "Stop"
Set-StrictMode -Version Latest

function Invoke-JsonPost {
  param(
    [string]$Url,
    [hashtable]$Body,
    [hashtable]$Headers = @{}
  )
  return Invoke-RestMethod -Method Post -Uri $Url -Headers $Headers -ContentType "application/json" -Body ($Body | ConvertTo-Json -Depth 8)
}

Write-Host "Running Lucky5 API smoke flow against $BaseUrl"

$username = "smoke_$(Get-Random -Maximum 99999)"

$signup = Invoke-JsonPost -Url "$BaseUrl/api/Auth/signup" -Body @{
  username = $username
  password = "password"
  phoneNumber = "+96101000000"
}

$verify = Invoke-JsonPost -Url "$BaseUrl/api/Auth/verify-otp" -Body @{
  username = $username
  otpCode = "123456"
}

$login = Invoke-JsonPost -Url "$BaseUrl/api/Auth/login" -Body @{
  username = $username
  password = "password"
}

$token = $login.data.tokens.accessToken
$authHeaders = @{ Authorization = "Bearer $token" }

$machines = Invoke-RestMethod -Method Get -Uri "$BaseUrl/api/Game/games/machines" -Headers $authHeaders
$machineId = $machines.data[0].id

$deal = Invoke-JsonPost -Url "$BaseUrl/api/Game/cards/deal" -Headers $authHeaders -Body @{
  machineId = $machineId
  betAmount = 1
}

$draw = Invoke-JsonPost -Url "$BaseUrl/api/Game/cards/draw" -Headers $authHeaders -Body @{
  roundId = $deal.data.roundId
  holdIndexes = @(0, 1, 2, 3, 4)
}

$history = Invoke-RestMethod -Method Get -Uri "$BaseUrl/api/Auth/MemberHistory" -Headers $authHeaders

Write-Host "Smoke flow complete:"
Write-Host "  user       : $username"
Write-Host "  roundId    : $($deal.data.roundId)"
Write-Host "  handRank   : $($draw.data.handRank)"
Write-Host "  historyRows: $($history.data.Count)"
