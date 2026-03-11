namespace Lucky5.Domain.Game.CleanRoom;

using System.Buffers.Binary;
using System.Globalization;
using System.Security.Cryptography;
using System.Text;

public sealed class SplitMix64Rng
{
    private ulong _state;

    public SplitMix64Rng(ulong seed)
    {
        _state = seed;
    }

    public ulong NextUInt64()
    {
        _state += 0x9E3779B97F4A7C15UL;
        var value = _state;
        value = (value ^ (value >> 30)) * 0xBF58476D1CE4E5B9UL;
        value = (value ^ (value >> 27)) * 0x94D049BB133111EBUL;
        return value ^ (value >> 31);
    }

    public int NextInt(int maxExclusive)
    {
        if (maxExclusive <= 0)
        {
            throw new ArgumentOutOfRangeException(nameof(maxExclusive), maxExclusive, "Bound must be positive.");
        }

        if (maxExclusive == 1)
        {
            return 0;
        }

        var bound = (ulong)maxExclusive;
        var threshold = unchecked(0UL - bound) % bound;

        while (true)
        {
            var value = NextUInt64();
            if (value >= threshold)
            {
                return (int)(value % bound);
            }
        }
    }

    public double NextUnit() => (NextUInt64() >> 11) * (1.0 / (1UL << 53));

    public void Shuffle<T>(IList<T> values)
    {
        ArgumentNullException.ThrowIfNull(values);

        for (var index = values.Count - 1; index > 0; index--)
        {
            var swapIndex = NextInt(index + 1);
            (values[index], values[swapIndex]) = (values[swapIndex], values[index]);
        }
    }
}

public static class DeterministicSeed
{
    public static ulong FromString(string value)
    {
        if (string.IsNullOrWhiteSpace(value))
        {
            throw new ArgumentException("Seed text is required.", nameof(value));
        }

        var digest = SHA256.HashData(Encoding.UTF8.GetBytes(value));
        return BinaryPrimitives.ReadUInt64BigEndian(digest.AsSpan(0, 8));
    }

    public static ulong Derive(ulong seed, params string[] parts)
    {
        using var stream = new MemoryStream();
        WriteUInt64(stream, seed);

        foreach (var part in parts)
        {
            stream.WriteByte(0);
            var bytes = Encoding.UTF8.GetBytes(part ?? string.Empty);
            stream.Write(bytes, 0, bytes.Length);
        }

        var digest = SHA256.HashData(stream.ToArray());
        return BinaryPrimitives.ReadUInt64BigEndian(digest.AsSpan(0, 8));
    }

    public static ulong Derive(ulong seed, params ulong[] parts)
    {
        using var stream = new MemoryStream();
        WriteUInt64(stream, seed);

        foreach (var part in parts)
        {
            stream.WriteByte(0);
            WriteUInt64(stream, part);
        }

        var digest = SHA256.HashData(stream.ToArray());
        return BinaryPrimitives.ReadUInt64BigEndian(digest.AsSpan(0, 8));
    }

    public static ulong Derive(ulong seed, string purpose, int roundIndex)
        => Derive(seed, purpose, roundIndex.ToString(CultureInfo.InvariantCulture));

    private static void WriteUInt64(Stream stream, ulong value)
    {
        Span<byte> buffer = stackalloc byte[8];
        BinaryPrimitives.WriteUInt64BigEndian(buffer, value);
        stream.Write(buffer);
    }
}
