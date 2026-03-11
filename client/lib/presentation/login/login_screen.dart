import "package:flutter/material.dart";

import "../../core/api/auth_api.dart";
import "../machine/machine_selection_screen.dart";

class LoginScreen extends StatefulWidget {
  const LoginScreen({super.key, required this.authApi});

  final AuthApi authApi;

  @override
  State<LoginScreen> createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  final _usernameController = TextEditingController(text: "tester");
  final _passwordController = TextEditingController(text: "password");
  final _otpController = TextEditingController(text: "123456");
  bool _loading = false;
  String _message = "";

  @override
  void dispose() {
    _usernameController.dispose();
    _passwordController.dispose();
    _otpController.dispose();
    super.dispose();
  }

  Future<void> _signupThenLogin() async {
    setState(() {
      _loading = true;
      _message = "";
    });

    final username = _usernameController.text.trim();
    final password = _passwordController.text;

    try {
      await widget.authApi.signup(
        username: username,
        password: password,
        phoneNumber: "+96101000000",
      );
    } catch (_) {
      // Existing user is acceptable for local bootstrap.
    }

    try {
      await widget.authApi.verifyOtp(
        username: username,
        otpCode: _otpController.text.trim(),
      );
    } catch (_) {
      // If already verified, continue.
    }

    try {
      final login = await widget.authApi.login(
        username: username,
        password: password,
      );
      if (!mounted) {
        return;
      }

      Navigator.of(context).pushNamed(
        "/machines",
        arguments: MachineSelectionArgs(accessToken: login.tokens.accessToken),
      );
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
      appBar: AppBar(title: const Text("Lucky5 Login")),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            TextField(
              controller: _usernameController,
              decoration: const InputDecoration(labelText: "Username"),
            ),
            const SizedBox(height: 12),
            TextField(
              controller: _passwordController,
              obscureText: true,
              decoration: const InputDecoration(labelText: "Password"),
            ),
            const SizedBox(height: 12),
            TextField(
              controller: _otpController,
              decoration: const InputDecoration(labelText: "OTP"),
            ),
            const SizedBox(height: 16),
            ElevatedButton(
              onPressed: _loading ? null : _signupThenLogin,
              child: Text(_loading ? "Loading..." : "Sign up / Login"),
            ),
            const SizedBox(height: 12),
            Text(
              _message,
              style: TextStyle(color: Theme.of(context).colorScheme.error),
            ),
          ],
        ),
      ),
    );
  }
}
