namespace Lucky5.Infrastructure.Services;

using Lucky5.Application.Contracts;
using Lucky5.Application.Dtos;
using Lucky5.Application.Requests;
using Lucky5.Domain.Entities;

public sealed class AuthService(InMemoryDataStore store, ITokenService tokenService) : IAuthService
{
    public Task<(AuthTokens Tokens, MemberProfileDto Profile)> LoginAsync(LoginRequest request, CancellationToken cancellationToken)
    {
        var user = store.Users.Values.FirstOrDefault(x => x.Username.Equals(request.Username, StringComparison.OrdinalIgnoreCase));
        if (user is null || user.PasswordHash != request.Password)
        {
            throw new InvalidOperationException("Invalid credentials");
        }

        if (!user.IsOtpVerified)
        {
            throw new InvalidOperationException("OTP not verified");
        }

        var access = tokenService.IssueToken(user.Id, TimeSpan.FromHours(8), user.Role);
        var refresh = tokenService.IssueToken(user.Id, TimeSpan.FromDays(30), user.Role);
        var profile = store.Profiles[user.Id];
        profile.LastSeenUtc = DateTime.UtcNow;

        return Task.FromResult((new AuthTokens(access, refresh, DateTime.UtcNow.AddHours(8)), ToDto(profile)));
    }

    public Task<MemberProfileDto> SignupAsync(SignupRequest request, CancellationToken cancellationToken)
    {
        if (store.Users.Values.Any(x => x.Username.Equals(request.Username, StringComparison.OrdinalIgnoreCase)))
        {
            throw new InvalidOperationException("Username already exists");
        }

        var user = new User
        {
            Username = request.Username,
            PasswordHash = request.Password,
            PhoneNumber = request.PhoneNumber,
            IsOtpVerified = false,
            PendingOtp = "123456",
            PendingOtpExpiresUtc = DateTime.UtcNow.AddMinutes(10),
            Role = "player"
        };

        store.Users[user.Id] = user;
        store.Profiles[user.Id] = new MemberProfile
        {
            UserId = user.Id,
            Username = user.Username,
            DisplayName = user.Username,
            PhoneNumber = user.PhoneNumber,
            WalletBalance = 200000m,
            LastSeenUtc = DateTime.UtcNow
        };

        return Task.FromResult(ToDto(store.Profiles[user.Id]));
    }

    public Task<bool> VerifyOtpAsync(VerifyOtpRequest request, CancellationToken cancellationToken)
    {
        var user = store.Users.Values.FirstOrDefault(x => x.Username.Equals(request.Username, StringComparison.OrdinalIgnoreCase));
        if (user is null || user.PendingOtpExpiresUtc is null || user.PendingOtp != request.OtpCode)
        {
            return Task.FromResult(false);
        }

        user.IsOtpVerified = true;
        user.PendingOtp = null;
        user.PendingOtpExpiresUtc = null;
        return Task.FromResult(true);
    }

    public Task<bool> ResendOtpAsync(ResendOtpRequest request, CancellationToken cancellationToken)
    {
        var user = store.Users.Values.FirstOrDefault(x => x.Username.Equals(request.Username, StringComparison.OrdinalIgnoreCase));
        if (user is null)
        {
            return Task.FromResult(false);
        }

        user.PendingOtp = "123456";
        user.PendingOtpExpiresUtc = DateTime.UtcNow.AddMinutes(10);
        return Task.FromResult(true);
    }

    public Task<MemberProfileDto> GetUserByIdAsync(Guid userId, CancellationToken cancellationToken)
    {
        if (!store.Profiles.TryGetValue(userId, out var profile))
        {
            throw new KeyNotFoundException("User not found");
        }

        return Task.FromResult(ToDto(profile));
    }

    public Task<IReadOnlyList<WalletLedgerEntryDto>> GetMemberHistoryAsync(Guid userId, CancellationToken cancellationToken)
    {
        var rows = store.Ledger
            .Where(x => x.UserId == userId)
            .OrderByDescending(x => x.CreatedUtc)
            .Select(x => new WalletLedgerEntryDto(x.Id, x.Amount, x.BalanceAfter, x.Type, x.Reference, x.CreatedUtc))
            .ToArray();

        return Task.FromResult<IReadOnlyList<WalletLedgerEntryDto>>(rows);
    }

    public Task<WalletLedgerEntryDto> TransferBalanceAsync(Guid userId, TransferRequest request, CancellationToken cancellationToken)
    {
        return Task.FromResult(AdjustBalance(userId, request.Amount, "TransferBalance", request.Reference));
    }

    public Task<WalletLedgerEntryDto> MoveWinToBalanceAsync(Guid userId, TransferRequest request, CancellationToken cancellationToken)
    {
        return Task.FromResult(AdjustBalance(userId, request.Amount, "MoveWinToBalance", request.Reference));
    }

    public Task<WalletLedgerEntryDto> UpdateCreditAsync(Guid userId, TransferRequest request, CancellationToken cancellationToken)
    {
        return Task.FromResult(AdjustBalance(userId, request.Amount, "UpdateCredit", request.Reference));
    }

    public Task LogoutAsync(string accessToken, CancellationToken cancellationToken)
    {
        tokenService.Revoke(accessToken);
        return Task.CompletedTask;
    }

    private WalletLedgerEntryDto AdjustBalance(Guid userId, decimal amount, string type, string reference)
    {
        if (!store.Profiles.TryGetValue(userId, out var profile))
        {
            throw new KeyNotFoundException("Profile not found");
        }

        profile.WalletBalance += amount;
        var row = new WalletLedgerEntry
        {
            UserId = userId,
            Amount = amount,
            Type = type,
            Reference = reference,
            BalanceAfter = profile.WalletBalance,
            CreatedUtc = DateTime.UtcNow
        };

        store.Ledger.Add(row);
        return new WalletLedgerEntryDto(row.Id, row.Amount, row.BalanceAfter, row.Type, row.Reference, row.CreatedUtc);
    }

    private MemberProfileDto ToDto(MemberProfile profile)
    {
        var role = "player";
        if (store.Users.TryGetValue(profile.UserId, out var user))
        {
            role = user.Role;
        }
        return new MemberProfileDto(profile.UserId, profile.Username, profile.DisplayName, profile.Email, profile.PhoneNumber, profile.WalletBalance, profile.LastSeenUtc, role);
    }
}
