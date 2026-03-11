import "package:flutter/material.dart";

import "core/api/auth_api.dart";
import "core/api/game_api.dart";
import "core/config/app_config.dart";
import "core/network/api_client.dart";
import "routes/app_routes.dart";

void main() {
  final config = AppConfig.fromEnvironment();
  final apiClient = ApiClient(config);

  runApp(
    Lucky5App(
      authApi: AuthApi(apiClient),
      gameApi: GameApi(apiClient),
    ),
  );
}

class Lucky5App extends StatelessWidget {
  const Lucky5App({
    super.key,
    required this.authApi,
    required this.gameApi,
  });

  final AuthApi authApi;
  final GameApi gameApi;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Lucky5",
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: const Color(0xFF0B6E4F)),
        useMaterial3: true,
      ),
      initialRoute: AppRoutes.login,
      onGenerateRoute: (settings) => AppRoutes.onGenerateRoute(
        settings,
        authApi: authApi,
        gameApi: gameApi,
      ),
    );
  }
}
