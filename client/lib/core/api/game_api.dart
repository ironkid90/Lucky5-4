import "../../models/api_response.dart";
import "../../models/deal_result.dart";
import "../../models/draw_result.dart";
import "../../models/machine_listing.dart";
import "../../models/reward_status.dart";
import "../network/api_client.dart";

class GameApi {
  GameApi(this._client);

  final ApiClient _client;

  Future<List<MachineListing>> listMachines(String accessToken) async {
    final json = await _client.get(
      "/api/Game/games/machines",
      accessToken: accessToken,
    );
    final envelope = ApiResponse.fromJson(
      json,
      (raw) => ((raw as List<dynamic>?) ?? const [])
          .map((e) => MachineListing.fromJson(e as Map<String, dynamic>))
          .toList(),
    );
    if (!envelope.success || envelope.data == null) {
      throw StateError(envelope.message);
    }
    return envelope.data!;
  }

  Future<DealResult> deal({
    required String accessToken,
    required int machineId,
    required double betAmount,
  }) async {
    final json = await _client.post(
      "/api/Game/cards/deal",
      accessToken: accessToken,
      body: {"machineId": machineId, "betAmount": betAmount},
    );
    final envelope = ApiResponse.fromJson(
      json,
      (raw) => DealResult.fromJson(raw as Map<String, dynamic>),
    );
    if (!envelope.success || envelope.data == null) {
      throw StateError(envelope.message);
    }
    return envelope.data!;
  }

  Future<DrawResult> draw({
    required String accessToken,
    required String roundId,
    required List<int> holdIndexes,
  }) async {
    final json = await _client.post(
      "/api/Game/cards/draw",
      accessToken: accessToken,
      body: {"roundId": roundId, "holdIndexes": holdIndexes},
    );
    final envelope = ApiResponse.fromJson(
      json,
      (raw) => DrawResult.fromJson(raw as Map<String, dynamic>),
    );
    if (!envelope.success || envelope.data == null) {
      throw StateError(envelope.message);
    }
    return envelope.data!;
  }

  Future<RewardStatus> doubleUp({
    required String accessToken,
    required String roundId,
    required String guess,
  }) async {
    final json = await _client.post(
      "/api/Game/double-up",
      accessToken: accessToken,
      body: {"roundId": roundId, "guess": guess},
    );
    final envelope = ApiResponse.fromJson(
      json,
      (raw) => RewardStatus.fromJson(raw as Map<String, dynamic>),
    );
    if (!envelope.success || envelope.data == null) {
      throw StateError(envelope.message);
    }
    return envelope.data!;
  }
}
