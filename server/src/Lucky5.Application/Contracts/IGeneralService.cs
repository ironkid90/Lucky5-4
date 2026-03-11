namespace Lucky5.Application.Contracts;

using Lucky5.Application.Dtos;
using Lucky5.Application.Requests;

public interface IGeneralService
{
    Task<IReadOnlyDictionary<string, string>> GetAppSettingsAsync(CancellationToken cancellationToken);
    Task<IReadOnlyDictionary<string, string>> GetContactInfoAsync(CancellationToken cancellationToken);
    Task<IReadOnlyList<ContactTypeDto>> GetContactTypesAsync(CancellationToken cancellationToken);
    Task SubmitContactReportAsync(Guid userId, ContactReportRequest request, CancellationToken cancellationToken);
    Task<TermsResponseDto> GetTermsAsync(CancellationToken cancellationToken);
}
