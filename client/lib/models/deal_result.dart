import "poker_card.dart";

class DealResult {
  DealResult({
    required this.roundId,
    required this.cards,
    required this.betAmount,
    required this.walletBalanceAfterBet,
  });

  final String roundId;
  final List<PokerCard> cards;
  final double betAmount;
  final double walletBalanceAfterBet;

  factory DealResult.fromJson(Map<String, dynamic> json) {
    return DealResult(
      roundId: json["roundId"] as String,
      cards: ((json["cards"] as List<dynamic>?) ?? const [])
          .map((e) => PokerCard.fromJson(e as Map<String, dynamic>))
          .toList(),
      betAmount: (json["betAmount"] as num).toDouble(),
      walletBalanceAfterBet: (json["walletBalanceAfterBet"] as num).toDouble(),
    );
  }
}
