namespace Lucky5.Application.Dtos;

public sealed record TermsResponseDto(string Version, string BodyMarkdown, DateTime UpdatedUtc);
