namespace Lucky5.Application.Requests;

public sealed record LoginRequest(string Username, string Password);
public sealed record SignupRequest(string Username, string Password, string PhoneNumber);
public sealed record VerifyOtpRequest(string Username, string OtpCode);
public sealed record ResendOtpRequest(string Username);
public sealed record TransferRequest(decimal Amount, string Reference, string Direction);
public sealed record ContactReportRequest(int ContactTypeId, string Subject, string Message);
public sealed record DealRequest(int MachineId, decimal BetAmount);
public sealed record DrawRequest(Guid RoundId, int[] HoldIndexes);
public sealed record DoubleUpRequest(Guid RoundId, string Guess);
