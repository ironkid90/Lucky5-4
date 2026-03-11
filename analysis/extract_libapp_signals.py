from __future__ import annotations

import argparse
import json
import re
from pathlib import Path


CATEGORIES = {
    "routes_and_modules": [
        "package:Ai9Poker/",
        "_screen",
        "_controller.dart",
        "_binding.dart",
        "app_routes.dart",
    ],
    "realtime": [
        "SignalR",
        "JoinMachine",
        "JoinedMachine",
        "LeaveMachine",
        "machine_game_state",
        "member_balance_change",
        "MachineStatusChanged",
        "BetPlaced",
        "updateDealtCardsFromSignalR",
        "handleDoubleUpFromSignalR",
        "addDoubleUpCardFromSignalR",
        "swapDoubleUpCardFromSignalR",
        "resetDoubleUpCardsFromSignalR",
        "subscribeToMessage",
    ],
    "rules": [
        "PokerRule",
        "RuleSet",
        "RuleID",
        "RuleName",
        "startRuleEvaluation",
        "processRule",
        "_holdOnePair",
        "_holdTwoPair",
        "_holdThreeOfKind",
        "_holdFourOfKind",
        "_holdStraight",
        "_holdFlush",
        "_holdFullHouse",
        "_holdThreeCardFlush",
        "_holdFourCardFlush",
        "_holdFourCardStraight",
        "royal flush",
        "straight flush",
        "full house",
        "4 of a kind",
        "3 of a kind",
        "2 pair",
    ],
    "economy": [
        "wallet",
        "Balance",
        "stake",
        "currentStake",
        "maxBetAmount",
        "minBetAmount",
        "lostAmount",
        "bonusAmount",
        "rewardAmount",
        "winBonusAmount",
        "TransferBalance",
        "MoveWinToWallet",
        "CashIn",
        "CashOut",
        "CurrentUserAmount",
        "MemberBalance",
    ],
    "actions": [
        "onBetPressed",
        "onBetLongPressStart",
        "onDealDrawPressed",
        "toggleHold",
        "onCancelHoldPressed",
        "onTakeScorePressed",
        "onBigPressed",
        "onSmallPressed",
        "onWithdrawPressed",
        "onMoveWinToWalletPressed",
        "onLeaveMachinePressed",
    ],
    "artifacts": [
        "assets/images/",
        "coin.png",
        "deal_draw",
        "hold_on",
        "hold_off",
        "take_score",
        "take_half",
        "cancel_hold",
        "lucky5",
        "cards/",
    ],
}


def extract_strings(binary: bytes, min_len: int = 3) -> list[str]:
    pattern = rb"[ -~]{" + str(min_len).encode("ascii") + rb",}"
    return [m.group().decode("utf-8", "ignore") for m in re.finditer(pattern, binary)]


def dedupe(items: list[str]) -> list[str]:
    seen = set()
    out = []
    for item in items:
        if item not in seen:
            seen.add(item)
            out.append(item)
    return out


def categorize(strings: list[str]) -> dict[str, list[str]]:
    output: dict[str, list[str]] = {}
    for category, needles in CATEGORIES.items():
        matches = []
        for item in strings:
            lowered = item.lower()
            if any(needle.lower() in lowered for needle in needles):
                matches.append(item)
        output[category] = dedupe(matches)
    return output


def main() -> None:
    parser = argparse.ArgumentParser(description="Extract categorized signals from a Flutter libapp.so binary.")
    parser.add_argument("libapp", type=Path, help="Path to libapp.so")
    parser.add_argument(
        "--json-out",
        type=Path,
        default=None,
        help="Optional path to write categorized output as JSON",
    )
    args = parser.parse_args()

    binary = args.libapp.read_bytes()
    strings = extract_strings(binary)
    categorized = categorize(strings)

    if args.json_out:
        args.json_out.write_text(json.dumps(categorized, indent=2), encoding="utf-8")

    for category, values in categorized.items():
        print(f"## {category} ({len(values)})")
        for value in values[:120]:
            print(value)
        print()


if __name__ == "__main__":
    main()
