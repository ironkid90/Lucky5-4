import "../../models/api_response.dart";
import "../network/api_client.dart";

class GeneralApi {
  GeneralApi(this._client);

  final ApiClient _client;

  Future<Map<String, String>> appSettings() async {
    final json = await _client.get("/api/General/app-settings");
    final envelope = ApiResponse.fromJson(
      json,
      (raw) => (raw as Map<String, dynamic>).map(
        (key, value) => MapEntry(key, value.toString()),
      ),
    );
    if (!envelope.success || envelope.data == null) {
      throw StateError(envelope.message);
    }
    return envelope.data!;
  }

  Future<String> termsBody() async {
    final json = await _client.get("/api/General/terms");
    final envelope = ApiResponse.fromJson(
      json,
      (raw) => (raw as Map<String, dynamic>)["bodyMarkdown"]?.toString() ?? "",
    );
    if (!envelope.success || envelope.data == null) {
      throw StateError(envelope.message);
    }
    return envelope.data!;
  }
}
