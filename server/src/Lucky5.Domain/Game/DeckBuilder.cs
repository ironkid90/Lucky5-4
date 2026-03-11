namespace Lucky5.Domain.Game;

using Lucky5.Domain.Entities;

public static class DeckBuilder
{
    private static readonly string[] Suits = ["C", "D", "H", "S"];
    private static readonly string[] Ranks = ["2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"];

    public static List<PokerCard> BuildDeck()
    {
        var deck = new List<PokerCard>(53);
        foreach (var suit in Suits)
        {
            foreach (var rank in Ranks)
            {
                deck.Add(new PokerCard(rank, suit));
            }
        }

        // Add one Joker for Lucky 5 mechanics
        deck.Add(new PokerCard("Joker", "W"));

        return deck;
    }
}
