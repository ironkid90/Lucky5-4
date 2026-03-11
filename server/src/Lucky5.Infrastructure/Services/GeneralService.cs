namespace Lucky5.Infrastructure.Services;

using Lucky5.Application.Contracts;
using Lucky5.Application.Dtos;
using Lucky5.Application.Requests;
using Lucky5.Domain.Entities;

public sealed class GeneralService(InMemoryDataStore store) : IGeneralService
{
    public Task<IReadOnlyDictionary<string, string>> GetAppSettingsAsync(CancellationToken cancellationToken)
        => Task.FromResult<IReadOnlyDictionary<string, string>>(store.AppSettings);

    public Task<IReadOnlyDictionary<string, string>> GetContactInfoAsync(CancellationToken cancellationToken)
        => Task.FromResult<IReadOnlyDictionary<string, string>>(store.ContactInfo);

    public Task<IReadOnlyList<ContactTypeDto>> GetContactTypesAsync(CancellationToken cancellationToken)
        => Task.FromResult<IReadOnlyList<ContactTypeDto>>(store.ContactTypes.Select(x => new ContactTypeDto(x.Id, x.Name)).ToArray());

    public Task SubmitContactReportAsync(Guid userId, ContactReportRequest request, CancellationToken cancellationToken)
    {
        store.ContactReports.Add(new ContactReport
        {
            UserId = userId,
            ContactTypeId = request.ContactTypeId,
            Subject = request.Subject,
            Message = request.Message,
            CreatedUtc = DateTime.UtcNow
        });

        return Task.CompletedTask;
    }

    public Task<TermsResponseDto> GetTermsAsync(CancellationToken cancellationToken)
        => Task.FromResult(new TermsResponseDto(store.Terms.Version, store.Terms.BodyMarkdown, store.Terms.UpdatedUtc));
}
