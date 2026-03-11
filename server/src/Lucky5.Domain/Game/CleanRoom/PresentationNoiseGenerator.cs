namespace Lucky5.Domain.Game.CleanRoom;

public static class PresentationNoiseGenerator
{
    public static PresentationNoisePlan Build(ulong noiseSeed, int roundIndex)
    {
        var derivedSeed = DeterministicSeed.Derive(noiseSeed, "presentation-noise", roundIndex);
        var rng = new SplitMix64Rng(derivedSeed);

        return new PresentationNoisePlan(
            SuspenseMs: 250 + rng.NextInt(551),
            RevealMs: 90 + rng.NextInt(241),
            FlipFrames: 8 + rng.NextInt(9),
            PulseFrames: 4 + rng.NextInt(7),
            DecoySwaps: rng.NextInt(4));
    }
}
