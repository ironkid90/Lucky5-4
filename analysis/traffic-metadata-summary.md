# Ai9Poker Traffic Metadata Summary

## Scope

This summary uses only:

- local `.txt` exports
- local `.pcap` files
- non-decrypted packet metadata

It does **not** rely on decrypting TLS payloads.

## Local Markdown Notes

Two notes were present in the folder:

- `mitm.md`
- `Inspect TLS encrypted traffic using mitmproxy and wireshark.md`

They describe generic MITM / proxy workflows and certificate-trust approaches. They do not add app-specific protocol details by themselves.

## What The Text Exports Confirm

The text exports contain raw TLS handshake material.

The most useful visible clue is the SNI / hostname:

- `www.ai9poker.com`

The handshake also shows standard TLS client hello structure and modern cipher offerings, which is consistent with normal HTTPS traffic from a mobile app.

## PCAP Summary

The parser output is stored in:

- `analysis/pcap-metadata.json`

The summarizer script is:

- `analysis/summarize_pcap_metadata.py`

### Capture 1

- file: `PCAPdroid_09_Mar_23_04_50.pcap`
- duration: about 270 seconds
- packets: 281,964
- dominant destination: `172.67.207.154:443`

### Capture 2

- file: `PCAPdroid_09_Mar_23_10_43.pcap`
- duration: about 24 seconds
- packets: 14,967
- dominant destinations:
  - `172.67.207.154:443`
  - `104.21.93.81:443`

### Smaller Captures

The smaller `.pcap` files are mostly DNS-only traffic to:

- `10.215.173.2:53`

## Interpretation

The two public IPs above are consistent with a Cloudflare-fronted origin.

Combined with the APK findings, the safest interpretation is:

- the app talks to `www.ai9poker.com` over HTTPS
- the REST API and SignalR hub are probably both fronted by the same public web edge
- there is enough network activity to support a server-authoritative session model
- packet captures alone, without decryption, are still useful for:
  - session timing
  - host inventory
  - reconnect patterns
  - burst size comparison during deal/draw/double-up actions

## What The Captures Do Not Give Us

Without legitimate plaintext visibility, these captures do **not** reveal:

- exact JSON payloads
- exact SignalR message schemas
- card values
- authoritative RNG decisions
- payout logic

## How This Helps The Rebuild

Even without payload decryption, the captures support the design choice that your clone should treat the backend as:

- realtime-capable
- session-aware
- authoritative over machine state and balance transitions

That matches the APK’s own string evidence around:

- `JoinMachine`
- `MachineGameState`
- `member_balance_change`
- `BetPlaced`
- `handleDoubleUpFromSignalR`

## Recommended Use

Use the captures for:

- estimating how chatty the client/server loop should feel
- deciding whether to use persistent realtime sessions
- comparing the relative traffic burst between:
  - idle state
  - machine join
  - deal
  - draw
  - double-up
  - cash in / cash out

Do **not** block the rebuild on recovering exact payloads. The current APK and capture metadata are already enough to start a clean-room engine and a clean backend contract.
