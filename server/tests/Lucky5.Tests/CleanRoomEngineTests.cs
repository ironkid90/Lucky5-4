namespace Lucky5.Tests;

using Lucky5.Domain.Game.CleanRoom;

public static class CleanRoomEngineTests
{
    public static Task RunAsync(List<string> failures)
    {
        var seed = DeterministicSeed.FromString("cedar-chip-foundation");

        Assert(
            failures,
            "Shuffle should replay deterministically for identical seeds",
            Codes(FiveCardDrawEngine.ShuffleDeck(seed, "shuffle-a")) == Codes(FiveCardDrawEngine.ShuffleDeck(seed, "shuffle-a")));

        Assert(
            failures,
            "Different shuffle streams should diverge",
            Codes(FiveCardDrawEngine.ShuffleDeck(seed, "shuffle-a")) != Codes(FiveCardDrawEngine.ShuffleDeck(seed, "shuffle-b")));

        var initial = FiveCardDrawEngine.DealFiveCardDraw(seed, "opening-hand");
        var heldState = FiveCardDrawEngine.Reduce(initial, new RoundAction(RoundActionKind.SetHoldMask, HoldMask: [true, false, true, false, false]));
        var drawnState = FiveCardDrawEngine.Reduce(heldState, new RoundAction(RoundActionKind.Draw));

        Assert(failures, "Held card 0 should survive draw", drawnState.Hand[0].Equals(initial.Hand[0]));
        Assert(failures, "Held card 2 should survive draw", drawnState.Hand[2].Equals(initial.Hand[2]));
        Assert(failures, "Discarded card 1 should be replaced", !drawnState.Hand[1].Equals(initial.Hand[1]));
        Assert(failures, "Discarded card 3 should be replaced", !drawnState.Hand[3].Equals(initial.Hand[3]));
        Assert(failures, "Discarded card 4 should be replaced", !drawnState.Hand[4].Equals(initial.Hand[4]));

        var royal = FiveCardDrawEngine.EvaluateHand(FiveCardDrawEngine.ParseCards(["TH", "JH", "QH", "KH", "AH"]));
        Assert(failures, "Royal flush should evaluate correctly", royal.Category == HandCategory.RoyalFlush);

        var wheel = FiveCardDrawEngine.EvaluateHand(FiveCardDrawEngine.ParseCards(["AS", "2D", "3C", "4H", "5S"]));
        Assert(failures, "Wheel straight should evaluate as straight", wheel.Category == HandCategory.Straight);
        Assert(failures, "Wheel straight high card should be 5", wheel.Tiebreak.SequenceEqual([5]));

        var highPair = FiveCardDrawEngine.EvaluateHand(FiveCardDrawEngine.ParseCards(["QH", "QS", "7C", "4D", "2S"]));
        Assert(
            failures,
            "Jacks-or-Better should pay qualifying high pairs",
            FiveCardDrawEngine.ResolvePayout(highPair, 5, PaytableProfile.JacksOrBetter) == 5);
        Assert(
            failures,
            "Two-pair-minimum should reject lone high pairs",
            FiveCardDrawEngine.ResolvePayout(highPair, 5, PaytableProfile.TwoPairMinimum) == 0);

        var aceSafetySession = Lucky5DoubleUpEngine.CreateSessionFromDeck(
            seedRoot: seed,
            deck: FiveCardDrawEngine.ParseCards(["9H", "AS", "4C", "2D"]),
            openingAmount: 20);
        var aceSafetyResolution = Lucky5DoubleUpEngine.ResolveGuess(aceSafetySession, BigSmallGuess.Small);
        Assert(failures, "Ace challenger should auto-win even on the wrong side when ace safety is enabled", aceSafetyResolution.Outcome == Lucky5DoubleUpOutcome.Win);
        Assert(failures, "Ace auto-win should double the amount", aceSafetyResolution.NextAmount == 40);

        var luckySwitchSession = Lucky5DoubleUpEngine.CreateSessionFromDeck(
            seedRoot: seed,
            deck: FiveCardDrawEngine.ParseCards(["9H", "5S", "KC", "2D"]),
            openingAmount: 10);
        var switchedLuckySession = Lucky5DoubleUpEngine.SwitchDealer(luckySwitchSession);
        Assert(failures, "First 5S switch should activate no-lose mode", switchedLuckySession.IsNoLoseActive);
        Assert(failures, "First 5S switch should apply 4x multiplier", switchedLuckySession.CurrentAmount == 40);

        var safeFailSession = Lucky5DoubleUpEngine.CreateSessionFromDeck(
            seedRoot: seed,
            deck: FiveCardDrawEngine.ParseCards(["9H", "5S", "9C", "2D"]),
            openingAmount: 10);
        var afterLuckySwitch = Lucky5DoubleUpEngine.SwitchDealer(safeFailSession);
        var safeFailResolution = Lucky5DoubleUpEngine.ResolveGuess(afterLuckySwitch, BigSmallGuess.Small);
        Assert(failures, "Wrong guess under no-lose mode should safe-fail", safeFailResolution.Outcome == Lucky5DoubleUpOutcome.SafeFail);
        Assert(failures, "Safe fail should bank the protected winnings", safeFailResolution.CashoutCredits == 40);

        var repeatedLuckySession = Lucky5DoubleUpEngine.CreateSessionFromDeck(
            seedRoot: seed,
            deck: FiveCardDrawEngine.ParseCards(["9H", "5S", "5S", "KD"]),
            openingAmount: 10);
        var firstLuckySwitch = Lucky5DoubleUpEngine.SwitchDealer(repeatedLuckySession);
        var secondLuckySwitch = Lucky5DoubleUpEngine.SwitchDealer(firstLuckySwitch);
        Assert(failures, "Repeated 5S in the same streak should apply the repeat multiplier", secondLuckySwitch.CurrentAmount == 80);

        var machineCloseSession = Lucky5DoubleUpEngine.CreateSessionFromDeck(
            seedRoot: seed,
            deck: FiveCardDrawEngine.ParseCards(["9H", "AS", "4C", "2D"]),
            openingAmount: 20,
            machineCreditBaseline: 70,
            options: new Lucky5DoubleUpOptions(MaxCreditLimit: 100));
        var machineCloseResolution = Lucky5DoubleUpEngine.ResolveGuess(machineCloseSession, BigSmallGuess.Big);
        Assert(failures, "Credit ceiling should close the machine immediately after a winning double-up", machineCloseResolution.Outcome == Lucky5DoubleUpOutcome.MachineClosed);
        Assert(failures, "Machine close should cash out the post-win amount", machineCloseResolution.CashoutCredits == 40);

        var noiseA = PresentationNoiseGenerator.Build(seed, 4);
        var noiseB = PresentationNoiseGenerator.Build(seed, 4);
        var noiseC = PresentationNoiseGenerator.Build(seed, 5);
        Assert(failures, "Presentation noise should replay deterministically", noiseA == noiseB);
        Assert(failures, "Presentation noise should vary by round index", noiseA != noiseC);

        Assert(failures, "Bonanza reference should preserve next-card BIG/SMALL double-up style", CabinetReferences.BonanzaGoldenPoker.SupportsBonanzaBigSmall);
        Assert(failures, "Bonanza reference should preserve 10-credit max bet", CabinetReferences.BonanzaGoldenPoker.OperatorSettings?.MaxBetCredits == 10);
        Assert(failures, "Bonanza reference should preserve 5,000-credit auto-collect threshold", CabinetReferences.BonanzaGoldenPoker.OperatorSettings?.AutoCollectThreshold == 5000);
        Assert(failures, "Bonus Poker reference should flag four-of-a-kind jackpot lineage", CabinetReferences.BonusPoker.GetJackpotFeature(HandCategory.FourOfAKind) is not null);
        Assert(failures, "Bonus Poker reference should flag straight-flush jackpot lineage", CabinetReferences.BonusPoker.GetJackpotFeature(HandCategory.StraightFlush) is not null);

        var fhKingsTrips = FiveCardDrawEngine.EvaluateHand(FiveCardDrawEngine.ParseCards(["KH", "KD", "KC", "JH", "JS"]));
        Assert(failures, "Full House K-K-K-J-J should have Tiebreak[0] == 13 (Kings trips)", fhKingsTrips.Category == HandCategory.FullHouse && fhKingsTrips.Tiebreak[0] == 13);

        var fhJacksTrips = FiveCardDrawEngine.EvaluateHand(FiveCardDrawEngine.ParseCards(["JH", "JD", "JC", "KH", "KS"]));
        Assert(failures, "Full House J-J-J-K-K should have Tiebreak[0] == 11 (Jacks trips)", fhJacksTrips.Category == HandCategory.FullHouse && fhJacksTrips.Tiebreak[0] == 11);

        const int jackpotFullHouseRankKings = 13;
        Assert(failures, "Full House K-K-K-J-J should trigger jackpot when JackpotFullHouseRank is Kings",
            fhKingsTrips.Tiebreak[0] == jackpotFullHouseRankKings);
        Assert(failures, "Full House J-J-J-K-K should NOT trigger jackpot when JackpotFullHouseRank is Kings",
            fhJacksTrips.Tiebreak[0] != jackpotFullHouseRankKings);

        var advisedQuads = FiveCardDrawEngine.ComputeAdvisedHolds(FiveCardDrawEngine.ParseCards(["KH", "KD", "KC", "KS", "2H"]));
        Assert(failures, "Advised holds for quads should hold the four matching cards", advisedQuads.SequenceEqual([0, 1, 2, 3]));

        var advisedPair = FiveCardDrawEngine.ComputeAdvisedHolds(FiveCardDrawEngine.ParseCards(["AH", "AD", "3C", "7S", "9H"]));
        Assert(failures, "Advised holds for a pair should hold the pair", advisedPair.SequenceEqual([0, 1]));

        var advisedNothing = FiveCardDrawEngine.ComputeAdvisedHolds(FiveCardDrawEngine.ParseCards(["2H", "4D", "6C", "8S", "KH"]));
        Assert(failures, "Advised holds for no pattern should return empty", advisedNothing.Length == 0);

        return Task.CompletedTask;
    }

    private static void Assert(List<string> failures, string message, bool condition)
    {
        if (!condition)
        {
            failures.Add(message);
        }
    }

    private static string Codes(IEnumerable<CleanRoomCard> cards)
        => string.Join(",", cards.Select(card => card.Code));
}
