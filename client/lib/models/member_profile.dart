class MemberProfile {
  MemberProfile({
    required this.userId,
    required this.username,
    required this.displayName,
    required this.phoneNumber,
    required this.walletBalance,
  });

  final String userId;
  final String username;
  final String displayName;
  final String phoneNumber;
  final double walletBalance;

  factory MemberProfile.fromJson(Map<String, dynamic> json) {
    return MemberProfile(
      userId: json["userId"] as String,
      username: json["username"] as String,
      displayName: json["displayName"] as String,
      phoneNumber: json["phoneNumber"] as String,
      walletBalance: (json["walletBalance"] as num).toDouble(),
    );
  }
}
