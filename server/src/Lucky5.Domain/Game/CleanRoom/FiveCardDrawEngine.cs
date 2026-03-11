namespace Lucky5.Domain.Game.CleanRoom;

public static class FiveCardDrawEngine
{
    public static CleanRoomCard[] BuildStandardDeck()
    {
        var deck = new List<CleanRoomCard>(52);
        var suits = new[] { 'C', 'D', 'H', 'S' };

        foreach (var suit in suits)
        {
            for (var rank = 2; rank <= 14; rank++)
            {
                deck.Add(new CleanRoomCard(rank, suit));
            }
        }

        return deck.ToArray();
    }

    public static CleanRoomCard[] ShuffleDeck(ulong seed, string stream = "deck", IEnumerable<CleanRoomCard>? deck = null)
    {
        var derivedSeed = DeterministicSeed.Derive(seed, "shuffle", stream);
        var rng = new SplitMix64Rng(derivedSeed);
        var workingDeck = (deck ?? BuildStandardDeck()).ToList();
        rng.Shuffle(workingDeck);
        return workingDeck.ToArray();
    }

    public static FiveCardDrawState DealFiveCardDraw(ulong seed, string stream = "hand")
    {
        var roundSeed = DeterministicSeed.Derive(seed, "five-card-draw", stream);
        var deck = ShuffleDeck(roundSeed, "opening");
        var hand = deck.Take(5).ToArray();
        return FiveCardDrawState.Create(roundSeed, deck, hand);
    }

    public static FiveCardDrawState Reduce(FiveCardDrawState state, RoundAction action)
    {
        ArgumentNullException.ThrowIfNull(state);
        ArgumentNullException.ThrowIfNull(action);

        return action.Kind switch
        {
            RoundActionKind.ToggleHold => ToggleHold(state, action.CardIndex),
            RoundActionKind.SetHoldMask => SetHoldMask(state, action.HoldMask),
            RoundActionKind.Draw => Draw(state),
            _ => throw new ArgumentOutOfRangeException(nameof(action), action.Kind, "Unsupported round action.")
        };
    }

    public static CleanRoomCard[] ParseCards(IEnumerable<string> codes)
    {
        ArgumentNullException.ThrowIfNull(codes);
        return codes.Select(CleanRoomCard.FromCode).ToArray();
    }

    public static HandEvaluation EvaluateHand(IReadOnlyList<CleanRoomCard> cards)
    {
        if (cards.Count != 5)
        {
            throw new ArgumentException("Exactly five cards are required.", nameof(cards));
        }

        var orderedRanks = cards
            .Select(card => card.Rank)
            .OrderByDescending(rank => rank)
            .ToArray();

        var groups = cards
            .GroupBy(card => card.Rank)
            .Select(group => new { Rank = group.Key, Count = group.Count() })
            .OrderByDescending(group => group.Count)
            .ThenByDescending(group => group.Rank)
            .ToArray();

        var isFlush = cards.All(card => card.Suit == cards[0].Suit);
        var (isStraight, straightHigh) = DetectStraight(cards.Select(card => card.Rank));

        if (isStraight && isFlush)
        {
            if (straightHigh == 14)
            {
                return new HandEvaluation(HandCategory.RoyalFlush, "Royal Flush", [14]);
            }

            return new HandEvaluation(HandCategory.StraightFlush, "Straight Flush", [straightHigh]);
        }

        if (groups[0].Count == 4)
        {
            return new HandEvaluation(
                HandCategory.FourOfAKind,
                "Four of a Kind",
                [groups[0].Rank, groups[1].Rank]);
        }

        if (groups[0].Count == 3 && groups[1].Count == 2)
        {
            return new HandEvaluation(
                HandCategory.FullHouse,
                "Full House",
                [groups[0].Rank, groups[1].Rank]);
        }

        if (isFlush)
        {
            return new HandEvaluation(HandCategory.Flush, "Flush", orderedRanks);
        }

        if (isStraight)
        {
            return new HandEvaluation(HandCategory.Straight, "Straight", [straightHigh]);
        }

        if (groups[0].Count == 3)
        {
            var kickers = groups
                .Where(group => group.Count == 1)
                .Select(group => group.Rank)
                .OrderByDescending(rank => rank);

            return new HandEvaluation(
                HandCategory.ThreeOfAKind,
                "Three of a Kind",
                [groups[0].Rank, .. kickers]);
        }

        if (groups[0].Count == 2 && groups[1].Count == 2)
        {
            var pairRanks = groups
                .Where(group => group.Count == 2)
                .Select(group => group.Rank)
                .OrderByDescending(rank => rank)
                .ToArray();

            var kicker = groups.Single(group => group.Count == 1).Rank;
            return new HandEvaluation(HandCategory.TwoPair, "Two Pair", [pairRanks[0], pairRanks[1], kicker]);
        }

        if (groups[0].Count == 2)
        {
            var pairRank = groups[0].Rank;
            var kickers = groups
                .Where(group => group.Count == 1)
                .Select(group => group.Rank)
                .OrderByDescending(rank => rank);

            return new HandEvaluation(
                HandCategory.OnePair,
                "One Pair",
                [pairRank, .. kickers],
                pairRank);
        }

        return new HandEvaluation(HandCategory.HighCard, "High Card", orderedRanks);
    }

    public static int ResolvePayout(HandEvaluation evaluation, int bet, PaytableProfile? paytable = null)
        => (paytable ?? PaytableProfile.Lebanese).ResolvePayout(evaluation, bet);

    private static FiveCardDrawState ToggleHold(FiveCardDrawState state, int? cardIndex)
    {
        if (state.Phase != RoundPhase.Dealt)
        {
            throw new InvalidOperationException("Cards can only be held before the draw.");
        }

        if (cardIndex is null || cardIndex < 0 || cardIndex >= state.Held.Length)
        {
            throw new ArgumentOutOfRangeException(nameof(cardIndex), cardIndex, "Card index must address one of the five cards.");
        }

        var held = (bool[])state.Held.Clone();
        held[cardIndex.Value] = !held[cardIndex.Value];
        return state with { Held = held, State = RoundState.Hold };
    }

    private static FiveCardDrawState SetHoldMask(FiveCardDrawState state, bool[]? holdMask)
    {
        if (state.Phase != RoundPhase.Dealt)
        {
            throw new InvalidOperationException("Cards can only be held before the draw.");
        }

        if (holdMask is null || holdMask.Length != 5)
        {
            throw new ArgumentException("Hold mask must contain five entries.", nameof(holdMask));
        }

        return state with
        {
            Held = (bool[])holdMask.Clone(),
            State = RoundState.Hold
        };
    }

    private static FiveCardDrawState Draw(FiveCardDrawState state)
    {
        if (state.Phase != RoundPhase.Dealt)
        {
            throw new InvalidOperationException("The draw can only be executed once.");
        }

        var hand = (CleanRoomCard[])state.Hand.Clone();
        var drawIndex = state.DrawIndex;

        for (var index = 0; index < hand.Length; index++)
        {
            if (state.Held[index])
            {
                continue;
            }

            if (drawIndex >= state.Deck.Length)
            {
                throw new InvalidOperationException("Deck exhausted during draw.");
            }

            hand[index] = state.Deck[drawIndex];
            drawIndex++;
        }

        return state with
        {
            Hand = hand,
            DrawIndex = drawIndex,
            Phase = RoundPhase.Drawn,
            State = RoundState.Evaluate
        };
    }

    private static (bool IsStraight, int HighCard) DetectStraight(IEnumerable<int> ranks)
    {
        var uniqueRanks = ranks
            .Distinct()
            .OrderBy(rank => rank)
            .ToArray();

        if (uniqueRanks.Length != 5)
        {
            return (false, 0);
        }

        var isWheel = uniqueRanks.SequenceEqual(new[] { 2, 3, 4, 5, 14 });
        if (isWheel)
        {
            return (true, 5);
        }

        for (var index = 1; index < uniqueRanks.Length; index++)
        {
            if (uniqueRanks[index] != uniqueRanks[index - 1] + 1)
            {
                return (false, 0);
            }
        }

        return (true, uniqueRanks[^1]);
    }
}
