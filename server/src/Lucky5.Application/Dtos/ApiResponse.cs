namespace Lucky5.Application.Dtos;

public sealed record ApiResponse<T>(bool Success, string Message, T? Data, string[] Errors, string TraceId)
{
    public static ApiResponse<T> Ok(T data, string message = "OK", string traceId = "") => new(true, message, data, [], traceId);
    public static ApiResponse<T> Fail(string message, string[]? errors = null, string traceId = "") => new(false, message, default, errors ?? [], traceId);
}
