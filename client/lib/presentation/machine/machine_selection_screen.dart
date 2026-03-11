import "package:flutter/material.dart";

import "../../core/api/game_api.dart";
import "../../models/machine_listing.dart";
import "../game/poker_game_screen.dart";

class MachineSelectionArgs {
  MachineSelectionArgs({required this.accessToken});

  final String accessToken;
}

class MachineSelectionScreen extends StatefulWidget {
  const MachineSelectionScreen({
    super.key,
    required this.gameApi,
    required this.accessToken,
  });

  final GameApi gameApi;
  final String accessToken;

  @override
  State<MachineSelectionScreen> createState() => _MachineSelectionScreenState();
}

class _MachineSelectionScreenState extends State<MachineSelectionScreen> {
  bool _loading = true;
  String _message = "";
  List<MachineListing> _machines = const [];

  @override
  void initState() {
    super.initState();
    _loadMachines();
  }

  Future<void> _loadMachines() async {
    setState(() {
      _loading = true;
      _message = "";
    });
    try {
      final machines = await widget.gameApi.listMachines(widget.accessToken);
      setState(() => _machines = machines);
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
    return Scaffold(
      appBar: AppBar(title: const Text("Select Machine")),
      body: _loading
          ? const Center(child: CircularProgressIndicator())
          : RefreshIndicator(
              onRefresh: _loadMachines,
              child: ListView(
                padding: const EdgeInsets.all(16),
                children: [
                  if (_message.isNotEmpty)
                    Text(
                      _message,
                      style: TextStyle(
                        color: Theme.of(context).colorScheme.error,
                      ),
                    ),
                  ..._machines.map(
                    (machine) => Card(
                      child: ListTile(
                        title: Text(machine.name),
                        subtitle: Text(
                          "Bet ${machine.minBet.toStringAsFixed(2)} - ${machine.maxBet.toStringAsFixed(2)}",
                        ),
                        trailing: Text(machine.isOpen ? "Open" : "Closed"),
                        onTap: machine.isOpen
                            ? () {
                                Navigator.of(context).pushNamed(
                                  "/game",
                                  arguments: PokerGameArgs(
                                    accessToken: widget.accessToken,
                                    machineId: machine.id,
                                  ),
                                );
                              }
                            : null,
                      ),
                    ),
                  ),
                ],
              ),
            ),
    );
  }
}
