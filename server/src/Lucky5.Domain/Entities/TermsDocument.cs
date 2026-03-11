namespace Lucky5.Domain.Entities;

public sealed class TermsDocument
{
    public string Version { get; init; } = "1.0";
    public string BodyMarkdown { get; init; } = string.Empty;
    public DateTime UpdatedUtc { get; init; } = DateTime.UtcNow;
}
