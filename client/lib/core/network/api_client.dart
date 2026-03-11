import "dart:convert";

import "package:http/http.dart" as http;

import "../config/app_config.dart";

class ApiClient {
  ApiClient(this._config);

  final AppConfig _config;

  Future<Map<String, dynamic>> get(
    String path, {
    String? accessToken,
  }) async {
    final uri = Uri.parse("${_config.apiBaseUrl}$path");
    final response = await http
        .get(uri, headers: _headers(accessToken))
        .timeout(_config.requestTimeout);
    return _decode(response);
  }

  Future<Map<String, dynamic>> post(
    String path, {
    Map<String, dynamic>? body,
    String? accessToken,
  }) async {
    final uri = Uri.parse("${_config.apiBaseUrl}$path");
    final response = await http
        .post(
          uri,
          headers: _headers(accessToken),
          body: jsonEncode(body ?? const <String, dynamic>{}),
        )
        .timeout(_config.requestTimeout);
    return _decode(response);
  }

  Map<String, String> _headers(String? accessToken) {
    final headers = <String, String>{
      "Content-Type": "application/json",
      "Accept": "application/json",
    };
    if (accessToken != null && accessToken.isNotEmpty) {
      headers["Authorization"] = "Bearer $accessToken";
    }
    return headers;
  }

  Map<String, dynamic> _decode(http.Response response) {
    final payload = jsonDecode(response.body) as Map<String, dynamic>;
    if (response.statusCode >= 400) {
      final message = payload["message"]?.toString() ?? "Request failed";
      throw StateError(message);
    }
    return payload;
  }
}
