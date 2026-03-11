namespace Lucky5.Application.Dtos;

public sealed record AuthTokens(string AccessToken, string RefreshToken, DateTime ExpiresAtUtc);
