namespace Lucky5.Api.Middleware;

using System.Security.Claims;
using Lucky5.Application.Contracts;

public sealed class BearerTokenMiddleware(RequestDelegate next)
{
    public async Task InvokeAsync(HttpContext context, ITokenService tokenService)
    {
        var authHeader = context.Request.Headers.Authorization.ToString();
        var accessToken = string.Empty;
        if (authHeader.StartsWith("Bearer ", StringComparison.OrdinalIgnoreCase))
        {
            accessToken = authHeader[7..].Trim();
        }
        else if (context.Request.Query.TryGetValue("access_token", out var queryToken))
        {
            accessToken = queryToken.ToString();
        }

        if (!string.IsNullOrWhiteSpace(accessToken) && tokenService.TryValidate(accessToken, out var userId))
        {
            var claims = new[] { new Claim(ClaimTypes.NameIdentifier, userId.ToString()) };
            context.User = new ClaimsPrincipal(new ClaimsIdentity(claims, "Lucky5Bearer"));
            context.Items["access_token"] = accessToken;
        }

        await next(context);
    }
}
