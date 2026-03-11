namespace Lucky5.Domain.Game;

using Lucky5.Domain.Entities;

public static class HandTensionAnalyzer
{
    private static readonly Dictionary<string, int> RankValues = new(StringComparer.Ordinal)
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
        ["A"] = 14
    };

    public static int ComputeNearMissScore(IReadOnlyList<PokerCard> cards)
    {
        if (cards.Count != 5)
        {
            return 0;
        }

        var (_, multiplier) = PokerHandEvaluator.Evaluate(cards);
        if (multiplier > 0m)
        {
            return 0;
        }

        var score = 0;
        var maxSuitCount = cards.GroupBy(c => c.Suit).Max(g => g.Count());
        if (maxSuitCount == 4)
        {
            score += 3;
        }
        else if (maxSuitCount == 3)
        {
            score += 1;
        }

        var rankValues = cards
            .Where(c => RankValues.ContainsKey(c.Rank))
            .Select(c => RankValues[c.Rank])
            .Distinct()
            .OrderBy(v => v)
            .ToList();

        if (rankValues.Count == 0)
        {
            return score;
        }

        if (rankValues.Contains(14))
        {
            rankValues.Insert(0, 1);
        }

        var longestSpan = 1;
        var span = 1;
        for (var i = 1; i < rankValues.Count; i++)
        {
            if (rankValues[i] == rankValues[i - 1] + 1)
            {
                span++;
            }
            else
            {
                longestSpan = Math.Max(longestSpan, span);
                span = 1;
            }
        }

        longestSpan = Math.Max(longestSpan, span);
        if (longestSpan >= 4)
        {
            score += 3;
        }
        else if (longestSpan == 3)
        {
            score += 1;
        }

        if (cards.GroupBy(c => c.Rank).Any(g => g.Count() == 2))
        {
            score += 1;
        }

        return score;
    }
}
