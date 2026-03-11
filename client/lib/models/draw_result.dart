import "poker_card.dart";

class DrawResult {
  DrawResult({
    required this.roundId,
    required this.cards,
    required this.handRank,
    required this.winAmount,
    required this.walletBalanceAfterRound,
  });

  final String roundId;
  final List<PokerCard> cards;
  final String handRank;
  final double winAmount;
  final double walletBalanceAfterRound;

  factory DrawResult.fromJson(Map<String, dynamic> json) {
    return DrawResult(
      roundId: json["roundId"] as String,
      cards: ((json["cards"] as List<dynamic>?) ?? const [])
          .map((e) => PokerCard.fromJson(e as Map<String, dynamic>))
          .toList(),
      handRank: json["handRank"] as String,
      winAmount: (json["winAmount"] as num).toDouble(),
      walletBalanceAfterRound: (json["walletBalanceAfterRound"] as num).toDouble(),
    );
  }
}
