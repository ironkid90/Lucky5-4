import "package:flutter/material.dart";

import "../../core/api/game_api.dart";
import "../../models/deal_result.dart";
import "../../models/draw_result.dart";

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

class _PokerGameScreenState extends State<PokerGameScreen> {
  final _betController = TextEditingController(text: "1");
  DealResult? _dealResult;
  DrawResult? _drawResult;
  final Set<int> _holds = <int>{};
  String _message = "";
  bool _loading = false;

  @override
  void dispose() {
    _betController.dispose();
    super.dispose();
  }

  Future<void> _deal() async {
    final betAmount = double.tryParse(_betController.text) ?? 1;
    setState(() {
      _loading = true;
      _message = "";
      _drawResult = null;
      _holds.clear();
    });
    try {
      final deal = await widget.gameApi.deal(
        accessToken: widget.accessToken,
        machineId: widget.machineId,
        betAmount: betAmount,
      );
      setState(() => _dealResult = deal);
    } catch (e) {
      setState(() => _message = e.toString());
    } finally {
      if (mounted) {
        setState(() => _loading = false);
      }
    }
  }

  Future<void> _draw() async {
    final deal = _dealResult;
    if (deal == null) {
      return;
    }

    setState(() {
      _loading = true;
      _message = "";
    });
    try {
      final draw = await widget.gameApi.draw(
        accessToken: widget.accessToken,
        roundId: deal.roundId,
        holdIndexes: _holds.toList()..sort(),
      );
      setState(() => _drawResult = draw);
    } catch (e) {
      setState(() => _message = e.toString());
    } finally {
      if (mounted) {
        setState(() => _loading = false);
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    final cards = _drawResult?.cards ?? _dealResult?.cards ?? const [];

    return Scaffold(
      appBar: AppBar(title: Text("Machine ${widget.machineId}")),
      body: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          Row(
            children: [
              Expanded(
                child: TextField(
                  controller: _betController,
                  keyboardType: TextInputType.number,
                  decoration: const InputDecoration(labelText: "Bet Amount"),
                ),
              ),
              const SizedBox(width: 12),
              ElevatedButton(
                onPressed: _loading ? null : _deal,
                child: const Text("Deal"),
              ),
            ],
          ),
          const SizedBox(height: 16),
          if (cards.isNotEmpty) ...[
            Wrap(
              spacing: 8,
              runSpacing: 8,
              children: List.generate(cards.length, (index) {
                final card = cards[index];
                final held = _holds.contains(index);
                return FilterChip(
                  label: Text("${card.rank}${card.suit}"),
                  selected: held,
                  onSelected: _drawResult == null
                      ? (selected) {
                          setState(() {
                            if (selected) {
                              _holds.add(index);
                            } else {
                              _holds.remove(index);
                            }
                          });
                        }
                      : null,
                );
              }),
            ),
            const SizedBox(height: 12),
            ElevatedButton(
              onPressed: _loading || _drawResult != null ? null : _draw,
              child: const Text("Draw"),
            ),
          ],
          const SizedBox(height: 16),
          if (_dealResult != null)
            Text(
              "Balance After Bet: ${_dealResult!.walletBalanceAfterBet.toStringAsFixed(2)}",
            ),
          if (_drawResult != null) ...[
            Text("Hand Rank: ${_drawResult!.handRank}"),
            Text("Win: ${_drawResult!.winAmount.toStringAsFixed(2)}"),
            Text(
              "Balance After Round: ${_drawResult!.walletBalanceAfterRound.toStringAsFixed(2)}",
            ),
          ],
          if (_message.isNotEmpty)
            Text(
              _message,
              style: TextStyle(color: Theme.of(context).colorScheme.error),
            ),
        ],
      ),
    );
  }
}
