class AppConfig {
  const AppConfig({
    required this.apiBaseUrl,
    required this.hubUrl,
    required this.appEnv,
    required this.enableVerboseLogging,
    required this.requestTimeoutMs,
  });

  final String apiBaseUrl;
  final String hubUrl;
  final String appEnv;
  final bool enableVerboseLogging;
  final int requestTimeoutMs;

  Duration get requestTimeout => Duration(milliseconds: requestTimeoutMs);

  static AppConfig fromEnvironment() {
    const apiBaseUrl = String.fromEnvironment(
      "API_BASE_URL",
      defaultValue: "http://localhost:5051",
    );
    const hubUrl = String.fromEnvironment(
      "HUB_URL",
      defaultValue: "http://localhost:5051/CarrePokerGameHub",
    );
    const appEnv = String.fromEnvironment("APP_ENV", defaultValue: "local");
    const verboseRaw = String.fromEnvironment(
      "ENABLE_VERBOSE_LOGGING",
      defaultValue: "false",
    );
    const timeoutRaw = String.fromEnvironment(
      "REQUEST_TIMEOUT_MS",
      defaultValue: "15000",
    );

    final parsedTimeout = int.tryParse(timeoutRaw) ?? 15000;
    return AppConfig(
      apiBaseUrl: apiBaseUrl,
      hubUrl: hubUrl,
      appEnv: appEnv,
      enableVerboseLogging: verboseRaw.toLowerCase() == "true",
      requestTimeoutMs: parsedTimeout,
    );
  }
}
