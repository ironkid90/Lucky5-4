typedef FromJson<T> = T Function(Object? json);

class ApiResponse<T> {
  ApiResponse({
    required this.success,
    required this.message,
    required this.data,
    required this.errors,
    required this.traceId,
  });

  final bool success;
  final String message;
  final T? data;
  final List<String> errors;
  final String traceId;

  factory ApiResponse.fromJson(
    Map<String, dynamic> json,
    FromJson<T> fromJson,
  ) {
    final dataRaw = json["data"];
    return ApiResponse<T>(
      success: json["success"] as bool? ?? false,
      message: json["message"] as String? ?? "",
      data: dataRaw == null ? null : fromJson(dataRaw),
      errors: ((json["errors"] as List<dynamic>?) ?? const [])
          .map((e) => e.toString())
          .toList(),
      traceId: json["traceId"] as String? ?? "",
    );
  }
}
