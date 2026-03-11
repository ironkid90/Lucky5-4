namespace Lucky5.Domain.Game;

using Lucky5.Domain.Entities;

public static class PokerHandEvaluator
{
    private static readonly Dictionary<string, int> RankMap = new()
    {
        ["2"] = 2,
        ["3"] = 3,
        ["4"] = 4,
        ["5"] = 5,
        ["6"] = 6,
        ["7"] = 7,
        ["8"] = 8,
        ["9"] = 9,
        ["10"] = 10,
        ["J"] = 11,
        ["Q"] = 12,
        ["K"] = 13,
        ["A"] = 14,
        ["Joker"] = 15 // High wildcard
    };

    public static (string Rank, decimal Multiplier) Evaluate(IReadOnlyList<PokerCard> cards)
    {
        if (cards.Count != 5)
        {
            return ("Invalid", 0m);
        }

        var jokerCount = cards.Count(c => c.Rank == "Joker");
        var nonJokers = cards.Where(c => c.Rank != "Joker").ToList();

        // Handle 5 of a Kind (Lucky 5)
        if (jokerCount > 0)
        {
            var maxRankCount = nonJokers.GroupBy(c => c.Rank).Max(g => g.Count());
            if (maxRankCount + jokerCount >= 5)
            {
                return ("FiveOfAKind", 500m); // Highest payout
            }
        }

        // Standard evaluation (ignoring Joker for complex wild logic for now, except 5-of-a-kind)
        // If Joker is present but not 5-of-a-kind, treat as highest kicker or simple wild?
        // For MVP, if Joker is present, we simply count it towards the highest group if possible.
        // Or simpler: Just treat Joker as an Ace for non-5-of-a-kind hands to avoid complex logic bugs.
        // But that breaks "Wild" promise.
        // Let's implement basic Wild logic: Replace Joker with card that maximizes hand.

        if (jokerCount > 0)
        {
            return EvaluateBestWildHand(cards);
        }

        var values = cards.Select(c => RankMap[c.Rank]).OrderBy(v => v).ToArray();
        var suits = cards.Select(c => c.Suit).Distinct().Count();
        var groups = values.GroupBy(v => v).Select(g => g.Count()).OrderByDescending(c => c).ToArray();

        var isFlush = suits == 1;
        var isStraight = values.SequenceEqual([2, 3, 4, 5, 14]) || values.Zip(values.Skip(1), (a, b) => b - a).All(diff => diff == 1);

        if (isFlush && isStraight && values.Max() == 14)
        {
            return ("RoyalFlush", 250m);
        }

        if (isFlush && isStraight)
        {
            return ("StraightFlush", 50m);
        }

        if (groups.SequenceEqual([4, 1]))
        {
            return ("FourOfAKind", 25m);
        }

        if (groups.SequenceEqual([3, 2]))
        {
            return ("FullHouse", 9m);
        }

        if (isFlush)
        {
            return ("Flush", 6m);
        }

        if (isStraight)
        {
            return ("Straight", 4m);
        }

        if (groups.SequenceEqual([3, 1, 1]))
        {
            return ("ThreeOfAKind", 3m);
        }

        if (groups.SequenceEqual([2, 2, 1]))
        {
            return ("TwoPair", 2m);
        }

        if (groups.SequenceEqual([2, 1, 1, 1]))
        {
            var pairValue = values.GroupBy(v => v).Single(g => g.Count() == 2).Key;
            if (pairValue >= 11 || pairValue == 14)
            {
                return ("JacksOrBetter", 1m);
            }

            return ("OnePair", 0m);
        }

        return ("NoWin", 0m);
    }

    private static (string Rank, decimal Multiplier) EvaluateBestWildHand(IReadOnlyList<PokerCard> cards)
    {
        // Brute force: Try replacing Joker with every possible card (rank+suit) and evaluate.
        // Since we only have 1 Joker, this is 52 iterations. Very fast.

        var bestRank = "NoWin";
        var bestMultiplier = 0m;

        var nonJokers = cards.Where(c => c.Rank != "Joker").ToList();
        var suits = new[] { "C", "D", "H", "S" };
        var ranks = new[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

        // Optimization: Try to match suits of existing cards for Flush/Straight Flush
        // And ranks of existing cards for Quads/FullHouse

        foreach (var suit in suits)
        {
            foreach (var rank in ranks)
            {
                var testHand = nonJokers.Select(c => c).ToList();
                testHand.Add(new PokerCard(rank, suit));

                // Recursive call to Evaluate (which will hit the non-joker path)
                var result = Evaluate(testHand);
                if (result.Multiplier > bestMultiplier)
                {
                    bestMultiplier = result.Multiplier;
                    bestRank = result.Rank;
                }
            }
        }

        return (bestRank, bestMultiplier);
    }
}
