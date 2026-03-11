namespace Lucky5.Api.Controllers;

using Lucky5.Api.Models;
using Lucky5.Application.Contracts;
using Lucky5.Application.Dtos;
using Lucky5.Application.Requests;
using Microsoft.AspNetCore.Mvc;

[ApiController]
[Route("api/[controller]")]
public sealed class AuthController(IAuthService authService) : ControllerBase
{
    [HttpPost("login")]
    public async Task<ActionResult<ApiResponse<object>>> Login([FromBody] LoginRequest request, CancellationToken cancellationToken)
    {
        var (tokens, profile) = await authService.LoginAsync(request, cancellationToken);
        return Ok(ApiResponse<object>.Ok(new { tokens, profile }, "Login successful", HttpContext.TraceIdentifier));
    }

    [HttpPost("signup")]
    public async Task<ActionResult<ApiResponse<MemberProfileDto>>> Signup([FromBody] SignupRequest request, CancellationToken cancellationToken)
    {
        var profile = await authService.SignupAsync(request, cancellationToken);
        return Ok(ApiResponse<MemberProfileDto>.Ok(profile, "Signup successful, verify OTP", HttpContext.TraceIdentifier));
    }

    [HttpPost("verify-otp")]
    public async Task<ActionResult<ApiResponse<object>>> VerifyOtp([FromBody] VerifyOtpRequest request, CancellationToken cancellationToken)
    {
        var ok = await authService.VerifyOtpAsync(request, cancellationToken);
        if (!ok)
        {
            return BadRequest(ApiResponse<object>.Fail("Invalid OTP", traceId: HttpContext.TraceIdentifier));
        }

        return Ok(ApiResponse<object>.Ok(new { verified = true }, "OTP verified", HttpContext.TraceIdentifier));
    }

    [HttpPost("resend-otp")]
    public async Task<ActionResult<ApiResponse<object>>> ResendOtp([FromBody] ResendOtpRequest request, CancellationToken cancellationToken)
    {
        var ok = await authService.ResendOtpAsync(request, cancellationToken);
        if (!ok)
        {
            return NotFound(ApiResponse<object>.Fail("User not found", traceId: HttpContext.TraceIdentifier));
        }

        return Ok(ApiResponse<object>.Ok(new { resent = true }, "OTP resent", HttpContext.TraceIdentifier));
    }

    [HttpGet("GetUserById")]
    public async Task<ActionResult<ApiResponse<MemberProfileDto>>> GetUserById(CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var profile = await authService.GetUserByIdAsync(userId, cancellationToken);
        return Ok(ApiResponse<MemberProfileDto>.Ok(profile, traceId: HttpContext.TraceIdentifier));
    }

    [HttpGet("MemberHistory")]
    public async Task<ActionResult<ApiResponse<IReadOnlyList<WalletLedgerEntryDto>>>> MemberHistory(CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var history = await authService.GetMemberHistoryAsync(userId, cancellationToken);
        return Ok(ApiResponse<IReadOnlyList<WalletLedgerEntryDto>>.Ok(history, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("TransferBalance")]
    public async Task<ActionResult<ApiResponse<WalletLedgerEntryDto>>> TransferBalance([FromBody] TransferRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var row = await authService.TransferBalanceAsync(userId, request, cancellationToken);
        return Ok(ApiResponse<WalletLedgerEntryDto>.Ok(row, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("MoveWinToBalance")]
    public async Task<ActionResult<ApiResponse<WalletLedgerEntryDto>>> MoveWinToBalance([FromBody] TransferRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var row = await authService.MoveWinToBalanceAsync(userId, request, cancellationToken);
        return Ok(ApiResponse<WalletLedgerEntryDto>.Ok(row, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("UpdateCredit")]
    public async Task<ActionResult<ApiResponse<WalletLedgerEntryDto>>> UpdateCredit([FromBody] TransferRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var row = await authService.UpdateCreditAsync(userId, request, cancellationToken);
        return Ok(ApiResponse<WalletLedgerEntryDto>.Ok(row, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("logout")]
    public async Task<ActionResult<ApiResponse<object>>> Logout(CancellationToken cancellationToken)
    {
        var token = HttpContext.Items["access_token"]?.ToString() ?? string.Empty;
        await authService.LogoutAsync(token, cancellationToken);
        return Ok(ApiResponse<object>.Ok(new { loggedOut = true }, traceId: HttpContext.TraceIdentifier));
    }
}
