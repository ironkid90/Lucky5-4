namespace Lucky5.Domain.Entities;

public sealed record PokerCard(string Rank, string Suit)
{
    public string Code => $"{Rank}{Suit}";
}
