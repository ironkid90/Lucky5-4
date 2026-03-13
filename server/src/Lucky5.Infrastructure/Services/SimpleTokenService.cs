namespace Lucky5.Infrastructure.Services;

using System.Security.Cryptography;
using System.Text;
using Lucky5.Application.Contracts;
using Microsoft.Extensions.Configuration;

public sealed class SimpleTokenService : ITokenService
{
    private readonly HashSet<string> _revoked = [];
    private readonly byte[] _secret;

    public SimpleTokenService(IConfiguration configuration)
    {
        var raw = configuration["JWT:SIGNING_KEY"] ?? "dev-signing-key-change-me";
        _secret = Encoding.UTF8.GetBytes(raw);
    }

    public string IssueToken(Guid userId, TimeSpan lifetime, string role = "player")
    {
        var expires = DateTimeOffset.UtcNow.Add(lifetime).ToUnixTimeSeconds();
        var payload = $"{userId:N}.{expires}.{role}";
        using var hmac = new HMACSHA256(_secret);
        var signature = Convert.ToBase64String(hmac.ComputeHash(Encoding.UTF8.GetBytes(payload)));
        return Convert.ToBase64String(Encoding.UTF8.GetBytes($"{payload}.{signature}"));
    }

    public bool TryValidate(string token, out Guid userId, out string role)
    {
        userId = Guid.Empty;
        role = "player";
        if (string.IsNullOrWhiteSpace(token) || _revoked.Contains(token))
        {
            return false;
        }

        try
        {
            var decoded = Encoding.UTF8.GetString(Convert.FromBase64String(token));
            var parts = decoded.Split('.', 4);
            if (parts.Length < 3 || !Guid.TryParseExact(parts[0], "N", out userId))
            {
                return false;
            }

            if (!long.TryParse(parts[1], out var expires) || DateTimeOffset.UtcNow.ToUnixTimeSeconds() > expires)
            {
                return false;
            }

            string payloadRole;
            string signature;
            string payload;
            if (parts.Length == 4)
            {
                payloadRole = parts[2];
                signature = parts[3];
                payload = $"{parts[0]}.{parts[1]}.{payloadRole}";
            }
            else
            {
                payloadRole = "player";
                signature = parts[2];
                payload = $"{parts[0]}.{parts[1]}";
            }

            using var hmac = new HMACSHA256(_secret);
            var expected = Convert.ToBase64String(hmac.ComputeHash(Encoding.UTF8.GetBytes(payload)));
            if (!CryptographicOperations.FixedTimeEquals(Encoding.UTF8.GetBytes(expected), Encoding.UTF8.GetBytes(signature)))
            {
                return false;
            }

            role = payloadRole;
            return true;
        }
        catch
        {
            return false;
        }
    }

    public void Revoke(string token)
    {
        if (!string.IsNullOrWhiteSpace(token))
        {
            _revoked.Add(token);
        }
    }
}
