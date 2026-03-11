class AuthTokens {
  AuthTokens({
    required this.accessToken,
    required this.refreshToken,
    required this.expiresAt,
  });

  final String accessToken;
  final String refreshToken;
  final DateTime expiresAt;

  factory AuthTokens.fromJson(Map<String, dynamic> json) {
    return AuthTokens(
      accessToken: json["accessToken"] as String,
      refreshToken: json["refreshToken"] as String,
      expiresAt: DateTime.parse(json["expiresAt"] as String),
    );
  }
}
