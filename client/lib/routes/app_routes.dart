import "package:flutter/material.dart";

import "../core/api/auth_api.dart";
import "../core/api/game_api.dart";
import "../presentation/game/poker_game_screen.dart";
import "../presentation/login/login_screen.dart";
import "../presentation/machine/machine_selection_screen.dart";

class AppRoutes {
  static const login = "/";
  static const machines = "/machines";
  static const game = "/game";

  static Route<dynamic> onGenerateRoute(
    RouteSettings settings, {
    required AuthApi authApi,
    required GameApi gameApi,
  }) {
    switch (settings.name) {
      case login:
        return MaterialPageRoute<void>(
          builder: (_) => LoginScreen(authApi: authApi),
        );
      case machines:
        final args = settings.arguments as MachineSelectionArgs;
        return MaterialPageRoute<void>(
          builder: (_) => MachineSelectionScreen(
            gameApi: gameApi,
            accessToken: args.accessToken,
          ),
        );
      case game:
        final args = settings.arguments as PokerGameArgs;
        return MaterialPageRoute<void>(
          builder: (_) => PokerGameScreen(
            gameApi: gameApi,
            accessToken: args.accessToken,
            machineId: args.machineId,
          ),
        );
      default:
        return MaterialPageRoute<void>(
          builder: (_) => Scaffold(
            body: Center(child: Text("Unknown route: ${settings.name}")),
          ),
        );
    }
  }
}
