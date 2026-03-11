import "package:signalr_netcore/http_connection_options.dart";
import "package:signalr_netcore/hub_connection.dart";
import "package:signalr_netcore/hub_connection_builder.dart";
import "package:signalr_netcore/itransport.dart";

import "../config/app_config.dart";

class HubClient {
  HubClient(this._config);

  final AppConfig _config;
  HubConnection? _connection;

  Future<void> connect(String accessToken) async {
    _connection ??= HubConnectionBuilder()
        .withUrl(
          _config.hubUrl,
          options: HttpConnectionOptions(
            transport: HttpTransportType.WebSockets,
            accessTokenFactory: () async => accessToken,
          ),
        )
        .withAutomaticReconnect(retryDelays: const [1000, 2000, 5000, 10000])
        .build();

    if (_connection?.state != HubConnectionState.Connected) {
      await _connection!.start();
    }
  }

  Future<void> disconnect() async {
    if (_connection != null) {
      await _connection!.stop();
    }
  }

  void on(String methodName, void Function(List<Object?>?) handler) {
    _connection?.on(methodName, handler);
  }

  Future<Object?> invoke(String methodName, {List<Object>? args}) {
    final conn = _connection;
    if (conn == null) {
      throw StateError("SignalR hub is not connected");
    }

    return conn.invoke(methodName, args: args ?? const []);
  }
}
