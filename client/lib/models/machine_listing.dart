class MachineListing {
  MachineListing({
    required this.id,
    required this.name,
    required this.isOpen,
    required this.minBet,
    required this.maxBet,
  });

  final int id;
  final String name;
  final bool isOpen;
  final double minBet;
  final double maxBet;

  factory MachineListing.fromJson(Map<String, dynamic> json) {
    return MachineListing(
      id: json["id"] as int,
      name: json["name"] as String,
      isOpen: json["isOpen"] as bool,
      minBet: (json["minBet"] as num).toDouble(),
      maxBet: (json["maxBet"] as num).toDouble(),
    );
  }
}
