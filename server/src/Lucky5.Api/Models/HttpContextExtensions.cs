namespace Lucky5.Api.Models;

public static class HttpContextExtensions
{
    public static Guid RequireUserId(this HttpContext context)
    {
        var claim = context.User.FindFirst(System.Security.Claims.ClaimTypes.NameIdentifier)?.Value;
        if (claim is null || !Guid.TryParse(claim, out var userId))
        {
            throw new UnauthorizedAccessException("Missing authentication context");
        }

        return userId;
    }
}
