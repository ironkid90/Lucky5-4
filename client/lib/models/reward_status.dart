class RewardStatus {
  RewardStatus({
    required this.roundId,
    required this.status,
    required this.payoutAmount,
    required this.walletBalance,
  });

  final String roundId;
  final String status;
  final double payoutAmount;
  final double walletBalance;

  factory RewardStatus.fromJson(Map<String, dynamic> json) {
    return RewardStatus(
      roundId: json["roundId"] as String,
      status: json["status"] as String,
      payoutAmount: (json["payoutAmount"] as num).toDouble(),
      walletBalance: (json["walletBalance"] as num).toDouble(),
    );
  }
}
