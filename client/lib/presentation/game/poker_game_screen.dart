import "dart:async";
import "dart:convert";

import "package:flutter/material.dart";

import "../../core/api/game_api.dart";
import "../../core/config/app_config.dart";
import "../../core/network/hub_client.dart";
import "../../models/deal_result.dart";
import "../../models/draw_result.dart";
import "../../models/poker_card.dart";

class PokerGameArgs {
  PokerGameArgs({
    required this.accessToken,
    required this.machineId,
  });

  final String accessToken;
  final int machineId;
}

class PokerGameScreen extends StatefulWidget {
  const PokerGameScreen({
    super.key,
    required this.gameApi,
    required this.accessToken,
    required this.machineId,
  });

  final GameApi gameApi;
  final String accessToken;
  final int machineId;

  @override
  State<PokerGameScreen> createState() => _PokerGameScreenState();
}

class _PokerGameScreenState extends State<PokerGameScreen>
    with WidgetsBindingObserver {
  final _betController = TextEditingController(text: "5000");
  final Set<int> _holds = <int>{};

  late final HubClient _hubClient;

  Timer? _heartbeatTimer;
  DealResult? _dealResult;
  DrawResult? _drawResult;
  _MachineSnapshot? _machineSnapshot;

  bool _loading = false;
  bool _hubReady = false;
  bool _hubHandlersBound = false;
  String _message = "Connecting to machine...";
  double _walletBalance = 0;

  bool get _hasOpenHand => _dealResult != null && _drawResult == null;
  String get _dealDrawLabel => _hasOpenHand ? "DRAW" : "DEAL";

  @override
  void initState() {
    super.initState();
    WidgetsBinding.instance.addObserver(this);
    _hubClient = HubClient(AppConfig.fromEnvironment());
    unawaited(_bootstrapRealtime());
  }

  @override
  void dispose() {
    WidgetsBinding.instance.removeObserver(this);
    _heartbeatTimer?.cancel();
    _betController.dispose();
    unawaited(_hubClient.invoke(
      "LeaveMachine",
      args: <Object>[widget.machineId],
    ).catchError((_) {}));
    unawaited(_hubClient.disconnect().catchError((_) {}));
    super.dispose();
  }

  @override
  void didChangeAppLifecycleState(AppLifecycleState state) {
    if (state == AppLifecycleState.resumed) {
      unawaited(_restoreRealtimeSession());
    }
  }

  Future<void> _bootstrapRealtime() async {
    await _restoreRealtimeSession();
    _heartbeatTimer ??= Timer.periodic(
      const Duration(seconds: 12),
      (_) => unawaited(_pulseHeartbeat()),
    );
  }

  Future<void> _restoreRealtimeSession() async {
    try {
      await _hubClient.connect(widget.accessToken);
      _bindHubHandlers();
      await _hubClient.invoke(
        "JoinMachine",
        args: <Object>[widget.machineId],
      );
      await _hubClient.invoke(
        "ReconnectSync",
        args: <Object>[widget.machineId],
      );

      if (!mounted) {
        return;
      }

      setState(() {
        _hubReady = true;
        if (_message == "Connecting to machine...") {
          _message = "Pick your hold cards, then press DEAL.";
        }
      });
    } catch (error) {
      if (!mounted) {
        return;
      }

      setState(() {
        _hubReady = false;
        _message =
            "Realtime link unavailable. Cabinet will continue with HTTP fallback.";
      });
    }
  }

  Future<void> _pulseHeartbeat() async {
    try {
      await _hubClient.connect(widget.accessToken);
      await _hubClient.invoke(
        "JoinMachine",
        args: <Object>[widget.machineId],
      );
      await _hubClient.invoke("Heartbeat");

      if (!mounted || _hubReady) {
        return;
      }

      setState(() => _hubReady = true);
    } catch (_) {
      if (!mounted) {
        return;
      }

      setState(() => _hubReady = false);
    }
  }

  void _bindHubHandlers() {
    if (_hubHandlersBound) {
      return;
    }

    _hubHandlersBound = true;

    _hubClient.on("MachineStateUpdated", (args) {
      final payload = _decodePayload(args);
      if (!mounted || payload.isEmpty) {
        return;
      }

      setState(() {
        _machineSnapshot = _MachineSnapshot.fromJson(payload);
      });
    });

    _hubClient.on("CardsDealt", (args) {
      final payload = _decodePayload(args);
      if (!mounted || payload.isEmpty) {
        return;
      }

      final result = DealResult.fromJson(payload);
      setState(() {
        _dealResult = result;
        _drawResult = null;
        _holds.clear();
        _walletBalance = result.walletBalanceAfterBet;
        _loading = false;
        _message = "Choose the cards to HOLD, then press DRAW.";
      });
    });

    _hubClient.on("CardRevealed", (args) {
      final payload = _decodePayload(args);
      if (!mounted || payload.isEmpty) {
        return;
      }

      final result = DrawResult.fromJson(payload);
      setState(() {
        _drawResult = result;
        _walletBalance = result.walletBalanceAfterRound;
        _loading = false;
        _message = result.winAmount > 0
            ? "${result.handRank} pays ${result.winAmount.toStringAsFixed(0)} credits."
            : "No win this hand.";
      });
    });

    _hubClient.on("WalletUpdated", (args) {
      final payload = _decodePayload(args);
      if (!mounted || payload.isEmpty) {
        return;
      }

      final nextBalance = (payload["walletBalanceAfterRound"] as num?)?.toDouble();
      if (nextBalance == null) {
        return;
      }

      setState(() => _walletBalance = nextBalance);
    });

    _hubClient.on("Error", (args) {
      final payload = _decodePayload(args);
      if (!mounted || payload.isEmpty) {
        return;
      }

      final code = payload["code"]?.toString() ?? "ERROR";
      final message = payload["message"]?.toString() ?? "Unknown hub error.";
      setState(() {
        _loading = false;
        _message = "$code: $message";
      });
    });
  }

  Future<void> _onDealDrawPressed() async {
    FocusScope.of(context).unfocus();
    if (_loading) {
      return;
    }

    if (_hasOpenHand) {
      await _draw();
    } else {
      await _deal();
    }
  }

  Future<void> _deal() async {
    final betAmount = double.tryParse(_betController.text.trim()) ?? 5000;

    setState(() {
      _loading = true;
      _message = "Dealing cards...";
      _dealResult = null;
      _drawResult = null;
      _holds.clear();
    });

    if (_hubReady) {
      try {
        await _hubClient.invoke(
          "Deal",
          args: <Object>[widget.machineId, betAmount],
        );
        return;
      } catch (_) {
        if (mounted) {
          setState(() {
            _hubReady = false;
            _message = "Realtime deal failed. Switching to HTTP fallback...";
          });
        }
      }
    }

    try {
      final result = await widget.gameApi.deal(
        accessToken: widget.accessToken,
        machineId: widget.machineId,
        betAmount: betAmount,
      );

      if (!mounted) {
        return;
      }

      setState(() {
        _dealResult = result;
        _walletBalance = result.walletBalanceAfterBet;
        _loading = false;
        _message = "Choose the cards to HOLD, then press DRAW.";
      });
      unawaited(_restoreRealtimeSession());
    } catch (error) {
      if (!mounted) {
        return;
      }

      setState(() {
        _loading = false;
        _message = _friendlyError(error);
      });
    }
  }

  Future<void> _draw() async {
    final deal = _dealResult;
    if (deal == null) {
      return;
    }

    final holdIndexes = _holds.toList()..sort();

    setState(() {
      _loading = true;
      _message = "Drawing final cards...";
    });

    if (_hubReady) {
      try {
        await _hubClient.invoke(
          "Draw",
          args: <Object>[deal.roundId, holdIndexes],
        );
        return;
      } catch (_) {
        if (mounted) {
          setState(() {
            _hubReady = false;
            _message = "Realtime draw failed. Switching to HTTP fallback...";
          });
        }
      }
    }

    try {
      final result = await widget.gameApi.draw(
        accessToken: widget.accessToken,
        roundId: deal.roundId,
        holdIndexes: holdIndexes,
      );

      if (!mounted) {
        return;
      }

      setState(() {
        _drawResult = result;
        _walletBalance = result.walletBalanceAfterRound;
        _loading = false;
        _message = result.winAmount > 0
            ? "${result.handRank} pays ${result.winAmount.toStringAsFixed(0)} credits."
            : "No win this hand.";
      });
      unawaited(_restoreRealtimeSession());
    } catch (error) {
      if (!mounted) {
        return;
      }

      setState(() {
        _loading = false;
        _message = _friendlyError(error);
      });
    }
  }

  void _toggleHold(int index) {
    if (!_hasOpenHand || _loading) {
      return;
    }

    setState(() {
      if (_holds.contains(index)) {
        _holds.remove(index);
      } else {
        _holds.add(index);
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);
    final cards = _visibleCards;

    return Scaffold(
      backgroundColor: const Color(0xFF0C0C0F),
      body: SafeArea(
        child: Column(
          children: [
            Padding(
              padding: const EdgeInsets.fromLTRB(12, 12, 12, 8),
              child: _ScoreboardPanel(
                machineId: widget.machineId,
                walletBalance: _walletBalance,
                currentBetText: _betController.text.trim().isEmpty
                    ? "0"
                    : _betController.text.trim(),
                isLive: _hubReady,
                snapshot: _machineSnapshot,
              ),
            ),
            Expanded(
              child: Padding(
                padding: const EdgeInsets.symmetric(horizontal: 12),
                child: Column(
                  children: [
                    Expanded(
                      child: Container(
                        width: double.infinity,
                        padding: const EdgeInsets.fromLTRB(12, 18, 12, 16),
                        decoration: BoxDecoration(
                          color: const Color(0xFF131417),
                          borderRadius: BorderRadius.circular(22),
                          border: Border.all(
                            color: const Color(0xFF655E34),
                            width: 2,
                          ),
                          boxShadow: const [
                            BoxShadow(
                              color: Color(0x66000000),
                              blurRadius: 24,
                              offset: Offset(0, 12),
                            ),
                          ],
                        ),
                        child: Column(
                          children: [
                            Text(
                              "LUCKY 5",
                              style: theme.textTheme.headlineSmall?.copyWith(
                                color: const Color(0xFFF7D15C),
                                fontWeight: FontWeight.w900,
                                letterSpacing: 3,
                              ),
                            ),
                            const SizedBox(height: 8),
                            Text(
                              _drawResult?.handRank ??
                                  (_hasOpenHand ? "SELECT HOLDS" : "READY"),
                              style: theme.textTheme.titleMedium?.copyWith(
                                color: const Color(0xFFF0F0F0),
                                letterSpacing: 1.5,
                                fontWeight: FontWeight.w700,
                              ),
                            ),
                            const SizedBox(height: 18),
                            Expanded(
                              child: Row(
                                crossAxisAlignment: CrossAxisAlignment.stretch,
                                children: List.generate(cards.length, (index) {
                                  final card = cards[index];
                                  final held = _holds.contains(index);
                                  return Expanded(
                                    child: Padding(
                                      padding: EdgeInsets.only(
                                        right: index == cards.length - 1 ? 0 : 6,
                                      ),
                                      child: Column(
                                        children: [
                                          Expanded(
                                            child: _CabinetCard(
                                              card: card,
                                              held: held,
                                            ),
                                          ),
                                          const SizedBox(height: 8),
                                          SizedBox(
                                            width: double.infinity,
                                            child: FilledButton(
                                              onPressed: !_hasOpenHand || _loading
                                                  ? null
                                                  : () => _toggleHold(index),
                                              style: FilledButton.styleFrom(
                                                backgroundColor: held
                                                    ? const Color(0xFFF4CF58)
                                                    : const Color(0xFF3F3620),
                                                foregroundColor: held
                                                    ? const Color(0xFF111111)
                                                    : const Color(0xFFF8E5A8),
                                                padding:
                                                    const EdgeInsets.symmetric(
                                                  vertical: 12,
                                                ),
                                                shape: RoundedRectangleBorder(
                                                  borderRadius:
                                                      BorderRadius.circular(14),
                                                ),
                                              ),
                                              child: Text(
                                                held ? "HELD" : "HOLD",
                                                style: const TextStyle(
                                                  fontWeight: FontWeight.w900,
                                                  letterSpacing: 1,
                                                ),
                                              ),
                                            ),
                                          ),
                                        ],
                                      ),
                                    ),
                                  );
                                }),
                              ),
                            ),
                          ],
                        ),
                      ),
                    ),
                    const SizedBox(height: 10),
                    Container(
                      width: double.infinity,
                      padding: const EdgeInsets.fromLTRB(14, 16, 14, 18),
                      decoration: const BoxDecoration(
                        color: Color(0xFF6A482F),
                        borderRadius: BorderRadius.vertical(
                          top: Radius.circular(28),
                        ),
                        boxShadow: [
                          BoxShadow(
                            color: Color(0x55000000),
                            blurRadius: 18,
                            offset: Offset(0, -4),
                          ),
                        ],
                      ),
                      child: Column(
                        children: [
                          Row(
                            children: [
                              Expanded(
                                child: TextField(
                                  controller: _betController,
                                  keyboardType: const TextInputType.numberWithOptions(
                                    decimal: true,
                                  ),
                                  style: const TextStyle(
                                    color: Colors.white,
                                    fontWeight: FontWeight.w800,
                                    letterSpacing: 1,
                                  ),
                                  decoration: InputDecoration(
                                    labelText: "BET",
                                    labelStyle: const TextStyle(
                                      color: Color(0xFFF4D58A),
                                      fontWeight: FontWeight.w700,
                                    ),
                                    filled: true,
                                    fillColor: const Color(0xFF372317),
                                    border: OutlineInputBorder(
                                      borderRadius: BorderRadius.circular(16),
                                      borderSide: BorderSide.none,
                                    ),
                                  ),
                                ),
                              ),
                              const SizedBox(width: 12),
                              Expanded(
                                child: SizedBox(
                                  height: 58,
                                  child: FilledButton(
                                    onPressed: _loading ? null : _onDealDrawPressed,
                                    style: FilledButton.styleFrom(
                                      backgroundColor: const Color(0xFFC33B2F),
                                      foregroundColor: Colors.white,
                                      shape: RoundedRectangleBorder(
                                        borderRadius: BorderRadius.circular(18),
                                      ),
                                      textStyle:
                                          theme.textTheme.titleMedium?.copyWith(
                                        fontWeight: FontWeight.w900,
                                        letterSpacing: 2,
                                      ),
                                    ),
                                    child: _loading
                                        ? const SizedBox(
                                            width: 24,
                                            height: 24,
                                            child: CircularProgressIndicator(
                                              strokeWidth: 2.5,
                                              color: Colors.white,
                                            ),
                                          )
                                        : Text(_dealDrawLabel),
                                  ),
                                ),
                              ),
                            ],
                          ),
                          const SizedBox(height: 12),
                          Row(
                            children: [
                              Expanded(
                                child: _MiniReadout(
                                  label: "ACTIVE",
                                  value:
                                      "${_machineSnapshot?.activeRounds ?? 0}",
                                ),
                              ),
                              const SizedBox(width: 8),
                              Expanded(
                                child: _MiniReadout(
                                  label: "PHASE",
                                  value: _machineSnapshot?.phase ?? "-",
                                ),
                              ),
                              const SizedBox(width: 8),
                              Expanded(
                                child: _MiniReadout(
                                  label: "RTP",
                                  value: _machineSnapshot == null
                                      ? "-"
                                      : _machineSnapshot!.observedRtpLabel,
                                ),
                              ),
                            ],
                          ),
                          const SizedBox(height: 12),
                          Container(
                            width: double.infinity,
                            padding: const EdgeInsets.symmetric(
                              horizontal: 14,
                              vertical: 12,
                            ),
                            decoration: BoxDecoration(
                              color: const Color(0xFF2E1D13),
                              borderRadius: BorderRadius.circular(16),
                            ),
                            child: Text(
                              _message,
                              style: theme.textTheme.bodyMedium?.copyWith(
                                color: const Color(0xFFF4E3C2),
                                fontWeight: FontWeight.w700,
                              ),
                              textAlign: TextAlign.center,
                            ),
                          ),
                        ],
                      ),
                    ),
                  ],
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }

  List<PokerCard?> get _visibleCards {
    final current = _drawResult?.cards ?? _dealResult?.cards ?? const <PokerCard>[];
    return List<PokerCard?>.generate(
      5,
      (index) => index < current.length ? current[index] : null,
    );
  }

  Map<String, dynamic> _decodePayload(List<Object?>? args) {
    if (args == null || args.isEmpty) {
      return const <String, dynamic>{};
    }

    try {
      final raw = args.first;
      if (raw is Map<String, dynamic>) {
        return raw;
      }

      if (raw is Map) {
        return raw.map(
          (key, value) => MapEntry(key.toString(), value),
        );
      }

      if (raw is String) {
        final decoded = jsonDecode(raw);
        if (decoded is Map<String, dynamic>) {
          return decoded;
        }
        if (decoded is Map) {
          return decoded.map(
            (key, value) => MapEntry(key.toString(), value),
          );
        }
      }
    } catch (_) {
      return const <String, dynamic>{};
    }

    return const <String, dynamic>{};
  }

  String _friendlyError(Object error) {
    final text = error.toString();
    return text.startsWith("Bad state:")
        ? text.replaceFirst("Bad state:", "").trim()
        : text;
  }
}

class _ScoreboardPanel extends StatelessWidget {
  const _ScoreboardPanel({
    required this.machineId,
    required this.walletBalance,
    required this.currentBetText,
    required this.isLive,
    required this.snapshot,
  });

  final int machineId;
  final double walletBalance;
  final String currentBetText;
  final bool isLive;
  final _MachineSnapshot? snapshot;

  @override
  Widget build(BuildContext context) {
    return Container(
      width: double.infinity,
      padding: const EdgeInsets.all(14),
      decoration: BoxDecoration(
        color: const Color(0xFF17181C),
        borderRadius: BorderRadius.circular(22),
        border: Border.all(color: const Color(0xFF60562F), width: 2),
      ),
      child: Column(
        children: [
          Row(
            children: [
              Expanded(
                child: Text(
                  "MACHINE $machineId",
                  style: Theme.of(context).textTheme.titleMedium?.copyWith(
                        color: const Color(0xFFF2D05C),
                        fontWeight: FontWeight.w900,
                        letterSpacing: 1.5,
                      ),
                ),
              ),
              Container(
                padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 6),
                decoration: BoxDecoration(
                  color: isLive
                      ? const Color(0xFF0F5A31)
                      : const Color(0xFF5A2A1A),
                  borderRadius: BorderRadius.circular(999),
                ),
                child: Text(
                  isLive ? "LIVE" : "HTTP",
                  style: const TextStyle(
                    color: Colors.white,
                    fontWeight: FontWeight.w800,
                    letterSpacing: 1,
                  ),
                ),
              ),
            ],
          ),
          const SizedBox(height: 12),
          Row(
            children: [
              Expanded(
                child: _ReadoutTile(
                  label: "CREDITS",
                  value: walletBalance.toStringAsFixed(0),
                ),
              ),
              const SizedBox(width: 8),
              Expanded(
                child: _ReadoutTile(
                  label: "BET",
                  value: currentBetText,
                ),
              ),
              const SizedBox(width: 8),
              Expanded(
                child: _ReadoutTile(
                  label: "TARGET",
                  value: snapshot?.targetRtpLabel ?? "90.0%",
                ),
              ),
            ],
          ),
          const SizedBox(height: 10),
          Row(
            children: const [
              Expanded(child: _PaytableChip(label: "RF", value: "1000")),
              SizedBox(width: 6),
              Expanded(child: _PaytableChip(label: "SF", value: "75")),
              SizedBox(width: 6),
              Expanded(child: _PaytableChip(label: "4K", value: "15")),
              SizedBox(width: 6),
              Expanded(child: _PaytableChip(label: "FH", value: "12")),
              SizedBox(width: 6),
              Expanded(child: _PaytableChip(label: "FL", value: "10")),
            ],
          ),
        ],
      ),
    );
  }
}

class _CabinetCard extends StatelessWidget {
  const _CabinetCard({
    required this.card,
    required this.held,
  });

  final PokerCard? card;
  final bool held;

  @override
  Widget build(BuildContext context) {
    final suit = _cardSuitSymbol(card?.suit);
    final redSuit = card != null && (card!.suit == "H" || card!.suit == "D");

    return AnimatedContainer(
      duration: const Duration(milliseconds: 180),
      decoration: BoxDecoration(
        color: card == null ? const Color(0xFF1D2330) : Colors.white,
        borderRadius: BorderRadius.circular(16),
        border: Border.all(
          color: held ? const Color(0xFFF6D768) : const Color(0xFFCEC8B8),
          width: held ? 3 : 2,
        ),
        boxShadow: [
          BoxShadow(
            color: held ? const Color(0x66F6D768) : const Color(0x22000000),
            blurRadius: held ? 18 : 10,
            offset: const Offset(0, 6),
          ),
        ],
      ),
      child: card == null
          ? const Center(
              child: Text(
                "?",
                style: TextStyle(
                  color: Color(0xFF7081A8),
                  fontSize: 34,
                  fontWeight: FontWeight.w900,
                ),
              ),
            )
          : Stack(
              children: [
                Positioned(
                  top: 10,
                  left: 10,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(
                        card!.rank,
                        style: TextStyle(
                          color: redSuit ? const Color(0xFFC62C2C) : Colors.black,
                          fontSize: 20,
                          fontWeight: FontWeight.w900,
                        ),
                      ),
                      Text(
                        suit,
                        style: TextStyle(
                          color: redSuit ? const Color(0xFFC62C2C) : Colors.black,
                          fontSize: 18,
                          fontWeight: FontWeight.w700,
                        ),
                      ),
                    ],
                  ),
                ),
                Center(
                  child: Text(
                    suit,
                    style: TextStyle(
                      color: redSuit ? const Color(0xFFD94242) : const Color(0xFF1F1F1F),
                      fontSize: 42,
                      fontWeight: FontWeight.w700,
                    ),
                  ),
                ),
                if (held)
                  Positioned(
                    right: 8,
                    bottom: 8,
                    child: Container(
                      padding: const EdgeInsets.symmetric(
                        horizontal: 8,
                        vertical: 4,
                      ),
                      decoration: BoxDecoration(
                        color: const Color(0xFFF6D768),
                        borderRadius: BorderRadius.circular(999),
                      ),
                      child: const Text(
                        "HELD",
                        style: TextStyle(
                          color: Color(0xFF1C1C1C),
                          fontSize: 11,
                          fontWeight: FontWeight.w900,
                        ),
                      ),
                    ),
                  ),
              ],
            ),
    );
  }

  static String _cardSuitSymbol(String? suit) {
    return switch (suit) {
      "H" => "♥",
      "D" => "♦",
      "C" => "♣",
      _ => "♠",
    };
  }
}

class _ReadoutTile extends StatelessWidget {
  const _ReadoutTile({required this.label, required this.value});

  final String label;
  final String value;

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 10),
      decoration: BoxDecoration(
        color: const Color(0xFF090A0D),
        borderRadius: BorderRadius.circular(14),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            label,
            style: const TextStyle(
              color: Color(0xFFAEA46D),
              fontSize: 11,
              fontWeight: FontWeight.w700,
              letterSpacing: 1,
            ),
          ),
          const SizedBox(height: 4),
          Text(
            value,
            overflow: TextOverflow.ellipsis,
            style: const TextStyle(
              color: Color(0xFFF8F1D1),
              fontSize: 20,
              fontWeight: FontWeight.w900,
            ),
          ),
        ],
      ),
    );
  }
}

class _MiniReadout extends StatelessWidget {
  const _MiniReadout({required this.label, required this.value});

  final String label;
  final String value;

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 10),
      decoration: BoxDecoration(
        color: const Color(0xFF2A1A12),
        borderRadius: BorderRadius.circular(14),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            label,
            style: const TextStyle(
              color: Color(0xFFC3A97C),
              fontSize: 11,
              fontWeight: FontWeight.w800,
              letterSpacing: 1,
            ),
          ),
          const SizedBox(height: 4),
          Text(
            value,
            overflow: TextOverflow.ellipsis,
            style: const TextStyle(
              color: Colors.white,
              fontSize: 16,
              fontWeight: FontWeight.w900,
            ),
          ),
        ],
      ),
    );
  }
}

class _PaytableChip extends StatelessWidget {
  const _PaytableChip({required this.label, required this.value});

  final String label;
  final String value;

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.symmetric(horizontal: 8, vertical: 8),
      decoration: BoxDecoration(
        color: const Color(0xFF221D12),
        borderRadius: BorderRadius.circular(12),
        border: Border.all(color: const Color(0xFF4A4120)),
      ),
      child: Column(
        children: [
          Text(
            label,
            style: const TextStyle(
              color: Color(0xFFFFD761),
              fontSize: 11,
              fontWeight: FontWeight.w800,
            ),
          ),
          const SizedBox(height: 4),
          Text(
            value,
            style: const TextStyle(
              color: Colors.white,
              fontSize: 14,
              fontWeight: FontWeight.w900,
            ),
          ),
        ],
      ),
    );
  }
}

class _MachineSnapshot {
  const _MachineSnapshot({
    required this.machineId,
    required this.activeRounds,
    required this.observedRtp,
    required this.targetRtp,
    required this.phase,
  });

  final int machineId;
  final int activeRounds;
  final double observedRtp;
  final double targetRtp;
  final String phase;

  String get observedRtpLabel => "${(observedRtp * 100).toStringAsFixed(1)}%";
  String get targetRtpLabel => "${(targetRtp * 100).toStringAsFixed(1)}%";

  factory _MachineSnapshot.fromJson(Map<String, dynamic> json) {
    return _MachineSnapshot(
      machineId: (json["machineId"] as num?)?.toInt() ?? 0,
      activeRounds: (json["activeRounds"] as num?)?.toInt() ?? 0,
      observedRtp: (json["observedRtp"] as num?)?.toDouble() ?? 0,
      targetRtp: (json["targetRtp"] as num?)?.toDouble() ?? 0.9,
      phase: json["phase"]?.toString() ?? "Neutral",
    );
  }
}
