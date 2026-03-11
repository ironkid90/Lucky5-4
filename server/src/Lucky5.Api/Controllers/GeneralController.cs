namespace Lucky5.Api.Controllers;

using Lucky5.Api.Models;
using Lucky5.Application.Contracts;
using Lucky5.Application.Dtos;
using Lucky5.Application.Requests;
using Microsoft.AspNetCore.Mvc;

[ApiController]
[Route("api/[controller]")]
public sealed class GeneralController(IGeneralService generalService) : ControllerBase
{
    [HttpGet("app-settings")]
    public async Task<ActionResult<ApiResponse<IReadOnlyDictionary<string, string>>>> AppSettings(CancellationToken cancellationToken)
        => Ok(ApiResponse<IReadOnlyDictionary<string, string>>.Ok(await generalService.GetAppSettingsAsync(cancellationToken), traceId: HttpContext.TraceIdentifier));

    [HttpGet("contact-info")]
    public async Task<ActionResult<ApiResponse<IReadOnlyDictionary<string, string>>>> ContactInfo(CancellationToken cancellationToken)
        => Ok(ApiResponse<IReadOnlyDictionary<string, string>>.Ok(await generalService.GetContactInfoAsync(cancellationToken), traceId: HttpContext.TraceIdentifier));

    [HttpGet("contact-types")]
    public async Task<ActionResult<ApiResponse<IReadOnlyList<ContactTypeDto>>>> ContactTypes(CancellationToken cancellationToken)
        => Ok(ApiResponse<IReadOnlyList<ContactTypeDto>>.Ok(await generalService.GetContactTypesAsync(cancellationToken), traceId: HttpContext.TraceIdentifier));

    [HttpPost("contact-report")]
    public async Task<ActionResult<ApiResponse<object>>> ContactReport([FromBody] ContactReportRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        await generalService.SubmitContactReportAsync(userId, request, cancellationToken);
        return Ok(ApiResponse<object>.Ok(new { submitted = true }, traceId: HttpContext.TraceIdentifier));
    }

    [HttpGet("terms")]
    public async Task<ActionResult<ApiResponse<TermsResponseDto>>> Terms(CancellationToken cancellationToken)
        => Ok(ApiResponse<TermsResponseDto>.Ok(await generalService.GetTermsAsync(cancellationToken), traceId: HttpContext.TraceIdentifier));
}
