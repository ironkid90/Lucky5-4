class PokerCard {
  PokerCard({
    required this.rank,
    required this.suit,
    required this.code,
  });

  final String rank;
  final String suit;
  final String code;

  factory PokerCard.fromJson(Map<String, dynamic> json) {
    return PokerCard(
      rank: json["rank"] as String,
      suit: json["suit"] as String,
      code: json["code"] as String,
    );
  }
}
