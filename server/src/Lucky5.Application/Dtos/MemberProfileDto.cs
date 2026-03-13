namespace Lucky5.Application.Dtos;

public sealed record MemberProfileDto(
    Guid UserId,
    string Username,
    string DisplayName,
    string Email,
    string PhoneNumber,
    decimal WalletBalance,
    DateTime LastSeenUtc,
    string Role = "player");
