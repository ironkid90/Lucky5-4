namespace Lucky5.Domain.Entities;

public sealed class MemberProfile
{
    public Guid UserId { get; init; }
    public string Username { get; init; } = string.Empty;
    public string DisplayName { get; set; } = string.Empty;
    public string Email { get; set; } = string.Empty;
    public string PhoneNumber { get; set; } = string.Empty;
    public decimal WalletBalance { get; set; }
    public decimal SessionNetLoss { get; set; } // Tracks cumulative loss for pity timer (SuperBonus)
    public DateTime LastSeenUtc { get; set; } = DateTime.UtcNow;
}
