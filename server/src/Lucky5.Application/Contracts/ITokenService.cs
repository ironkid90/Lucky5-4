namespace Lucky5.Application.Contracts;

public interface ITokenService
{
    string IssueToken(Guid userId, TimeSpan lifetime);
    bool TryValidate(string token, out Guid userId);
    void Revoke(string token);
}
