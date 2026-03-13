"use client";

import { startTransition, useEffect, useEffectEvent, useState } from "react";

import {
  cashoutDoubleUp,
  deal,
  draw,
  getDefaultRules,
  getMachineState,
  getMemberHistory,
  getProfile,
  guessDoubleUp,
  listMachines,
  login,
  signup,
  startDoubleUp,
  switchDealer,
  takeHalf,
  verifyOtp,
} from "@/lib/api";
import type {
  DealResult,
  DefaultRules,
  DoubleUpResult,
  DrawResult,
  MachineListing,
  MachineState,
  MemberProfile,
  PokerCard,
  WalletLedgerEntry,
} from "@/lib/types";

const DEFAULT_USERNAME = "tester";
const DEFAULT_PASSWORD = "password";
const DEFAULT_OTP = "123456";

const PAYTABLE_COLORS = [
  "#ffffff",  // Royal Flush
  "#ffd447",  // Straight Flush
  "#84ff55",  // Four of a Kind
  "#9ce6ff",  // Full House
  "#c8d8ff",  // Flush
  "#88aaff",  // Straight
  "#dddddd",  // Three of a Kind
  "#cc99ff",  // Two Pair
  "#a89880",  // Jacks or Better / others
];

type MessageTone = "ready" | "warning" | "danger";

function formatMoney(value: number) {
  return new Intl.NumberFormat("en-US", { maximumFractionDigits: 0 }).format(value);
}

function formatPercent(value: number) {
  return `${(value * 100).toFixed(1)}%`;
}

function cardSuitGlyph(suit: string) {
  switch (suit.toUpperCase()) {
    case "H":
      return "♥";
    case "D":
      return "♦";
    case "C":
      return "♣";
    default:
      return "♠";
  }
}

function cardSuitClass(suit: string) {
  switch (suit.toUpperCase()) {
    case "H":
      return "hearts";
    case "D":
      return "diamonds";
    case "C":
      return "clubs";
    default:
      return "spades";
  }
}

function toneForStatus(status: string): MessageTone {
  const normalized = status.toLowerCase();
  if (normalized.includes("lose")) {
    return "danger";
  }

  if (normalized.includes("machine")) {
    return "warning";
  }

  return "ready";
}

function PlayingCard({ card, label }: { card?: PokerCard | null; label: string }) {
  if (!card) {
    return (
      <div className="playing-card">
        <div className="card-corner">--</div>
        <div className="card-center">?</div>
        <div className="card-corner" style={{ textAlign: "right" }}>
          {label}
        </div>
      </div>
    );
  }

  const glyph = cardSuitGlyph(card.suit);

  return (
    <div className={`playing-card ${cardSuitClass(card.suit)}`}>
      <div className="card-corner">
        {card.rank}
        <br />
        {glyph}
      </div>
      <div className="card-center">{glyph}</div>
      <div className="card-corner" style={{ textAlign: "right" }}>
        {card.rank}
        <br />
        {glyph}
      </div>
    </div>
  );
}

export function Lucky5Cabinet() {
  const [username, setUsername] = useState(DEFAULT_USERNAME);
  const [password, setPassword] = useState(DEFAULT_PASSWORD);
  const [otpCode, setOtpCode] = useState(DEFAULT_OTP);
  const [profile, setProfile] = useState<MemberProfile | null>(null);
  const [accessToken, setAccessToken] = useState<string | null>(null);
  const [machines, setMachines] = useState<MachineListing[]>([]);
  const [machineId, setMachineId] = useState<number | null>(null);
  const [machineState, setMachineState] = useState<MachineState | null>(null);
  const [rules, setRules] = useState<DefaultRules | null>(null);
  const [history, setHistory] = useState<WalletLedgerEntry[]>([]);
  const [betAmount, setBetAmount] = useState("5000");
  const [holdIndexes, setHoldIndexes] = useState<number[]>([]);
  const [dealResult, setDealResult] = useState<DealResult | null>(null);
  const [drawResult, setDrawResult] = useState<DrawResult | null>(null);
  const [doubleUpResult, setDoubleUpResult] = useState<DoubleUpResult | null>(null);
  const [message, setMessage] = useState("Boot the cabinet, then choose a machine.");
  const [messageTone, setMessageTone] = useState<MessageTone>("ready");
  const [busy, setBusy] = useState(false);

  const selectedMachine = machines.find((machine) => machine.id === machineId) ?? null;
  const activeCards = drawResult?.cards ?? dealResult?.cards ?? [];
  const openRoundId = dealResult?.roundId ?? null;
  const hasWin = (drawResult?.winAmount ?? 0) > 0;
  const payoutRows = Object.entries(rules?.payoutMultipliers ?? {}).sort(
    (left, right) => right[1] - left[1],
  );

  const refreshBootstrap = useEffectEvent(async () => {
    if (!accessToken) {
      return;
    }

    const [nextProfile, nextMachines, nextRules, nextHistory] = await Promise.all([
      getProfile(accessToken),
      listMachines(accessToken),
      getDefaultRules(),
      getMemberHistory(accessToken),
    ]);

    setProfile(nextProfile);
    setMachines(nextMachines);
    setRules(nextRules);
    setHistory(nextHistory);

    if (!machineId && nextMachines.length > 0) {
      startTransition(() => {
        setMachineId(nextMachines[0].id);
        setBetAmount(String(nextMachines[0].minBet));
      });
    }
  });

  const refreshHistory = useEffectEvent(async () => {
    if (!accessToken) {
      return;
    }

    setHistory(await getMemberHistory(accessToken));
  });

  const refreshMachineState = useEffectEvent(async () => {
    if (!accessToken || !machineId) {
      return;
    }

    setMachineState(await getMachineState(machineId, accessToken));
  });

  useEffect(() => {
    if (!accessToken) {
      return;
    }

    void refreshBootstrap();
  }, [accessToken, refreshBootstrap]);

  useEffect(() => {
    if (!accessToken || !machineId) {
      return;
    }

    void refreshMachineState();
    const timer = window.setInterval(() => void refreshMachineState(), 5000);
    return () => window.clearInterval(timer);
  }, [accessToken, machineId, refreshMachineState]);

  async function runAction(action: () => Promise<void>) {
    setBusy(true);
    try {
      await action();
    } catch (error) {
      setMessage(error instanceof Error ? error.message : "Unexpected Lucky5 failure.");
      setMessageTone("danger");
    } finally {
      setBusy(false);
    }
  }

  function syncWallet(walletBalance: number) {
    setProfile((current) => (current ? { ...current, walletBalance } : current));
  }

  async function handleBoot() {
    await runAction(async () => {
      try {
        await signup(username, password, "+96101000000");
      } catch {
        // Existing user is acceptable.
      }

      try {
        await verifyOtp(username, otpCode);
      } catch {
        // Already-verified users are fine.
      }

      const authenticated = await login(username, password);
      setAccessToken(authenticated.tokens.accessToken);
      setProfile(authenticated.profile);
      setMessage("Cabinet synced. Pick a machine and press DEAL.");
      setMessageTone("ready");
    });
  }

  async function handleMachineSelection(machine: MachineListing) {
    startTransition(() => {
      setMachineId(machine.id);
      setBetAmount(String(machine.minBet));
      setDealResult(null);
      setDrawResult(null);
      setDoubleUpResult(null);
      setHoldIndexes([]);
    });

    setMessage(`${machine.name} linked. Set your wager and deal.`);
    setMessageTone("ready");

    if (accessToken) {
      await runAction(async () => {
        setMachineState(await getMachineState(machine.id, accessToken));
      });
    }
  }

  async function handleDealOrDraw() {
    if (!accessToken || !machineId) {
      setMessage("Boot the cabinet and select a machine first.");
      setMessageTone("warning");
      return;
    }

    if (dealResult && !drawResult) {
      await runAction(async () => {
        const result = await draw(
          dealResult.roundId,
          [...holdIndexes].sort((a, b) => a - b),
          accessToken,
        );
        setDrawResult(result);
        setDoubleUpResult(null);
        syncWallet(result.walletBalanceAfterRound);
        setMessage(
          result.winAmount > 0
            ? `${result.handRank} paid ${formatMoney(result.winAmount)}. Take score or enter DOUBLE-UP.`
            : `${result.handRank}. Round settled, ready for the next deal.`,
        );
        setMessageTone(result.winAmount > 0 ? "ready" : "warning");
        await Promise.all([refreshHistory(), refreshMachineState()]);
      });
      return;
    }

    await runAction(async () => {
      const result = await deal(machineId, Number(betAmount || "5000"), accessToken);
      setDealResult(result);
      setDrawResult(null);
      setDoubleUpResult(null);
      setHoldIndexes([]);
      syncWallet(result.walletBalanceAfterBet);
      setMessage("Choose the cards to HOLD, then press DRAW.");
      setMessageTone("ready");
      await Promise.all([refreshHistory(), refreshMachineState()]);
    });
  }

  async function handleStartDoubleUp() {
    if (!accessToken || !drawResult || !hasWin) {
      return;
    }

    await runAction(async () => {
      const result = await startDoubleUp(drawResult.roundId, accessToken);
      setDoubleUpResult(result);
      setMessage(`DOUBLE-UP armed. Dealer shows ${result.dealerCard?.code ?? "--"}. Big or small?`);
      setMessageTone(toneForStatus(result.status));
    });
  }

  async function handleSwitch() {
    if (!accessToken || !openRoundId) {
      return;
    }

    await runAction(async () => {
      const result = await switchDealer(openRoundId, accessToken);
      setDoubleUpResult(result);
      syncWallet(result.walletBalance);
      setMessage(`Dealer switched. Status: ${result.status}.`);
      setMessageTone(toneForStatus(result.status));
      await Promise.all([refreshHistory(), refreshMachineState()]);
    });
  }

  async function handleGuess(guess: "big" | "small") {
    if (!accessToken || !openRoundId) {
      return;
    }

    await runAction(async () => {
      const result = await guessDoubleUp(openRoundId, guess, accessToken);
      setDoubleUpResult(result);
      syncWallet(result.walletBalance);
      setMessage(`${guess.toUpperCase()} resolved: ${result.status}. Current amount ${formatMoney(result.currentAmount)}.`);
      setMessageTone(toneForStatus(result.status));
      await Promise.all([refreshHistory(), refreshMachineState()]);
    });
  }

  async function handleCashout() {
    if (!accessToken || !openRoundId) {
      return;
    }

    if (!doubleUpResult) {
      setMessage("Score taken. The wallet already reflects the round payout.");
      setMessageTone("ready");
      return;
    }

    await runAction(async () => {
      const result = await cashoutDoubleUp(openRoundId, accessToken);
      setDoubleUpResult(result);
      syncWallet(result.walletBalance);
      setMessage(`Score taken: ${formatMoney(result.currentAmount)}.`);
      setMessageTone("ready");
      await Promise.all([refreshHistory(), refreshMachineState()]);
    });
  }

  async function handleTakeHalf() {
    if (!accessToken || !openRoundId) {
      return;
    }

    await runAction(async () => {
      const result = await takeHalf(openRoundId, accessToken);
      setDoubleUpResult(result);
      syncWallet(result.walletBalance);
      setMessage(`Half banked. ${formatMoney(result.currentAmount)} stays in play.`);
      setMessageTone("warning");
      await Promise.all([refreshHistory(), refreshMachineState()]);
    });
  }

  function toggleHold(index: number) {
    if (!dealResult || drawResult) {
      return;
    }

    setHoldIndexes((current) =>
      current.includes(index)
        ? current.filter((value) => value !== index)
        : [...current, index].sort((a, b) => a - b),
    );
  }

  return (
    <div className="cabinet-shell">
      <section className="cabinet">
        <div className="screen">
          <div className="screen-header">
            <div className="paytable">
              <div className="paytable-title">Lucky5 payout glass</div>
              <div className="paytable-grid">
                {payoutRows.map(([hand, payout], rowIndex) => {
                  const rowColor = PAYTABLE_COLORS[rowIndex] ?? "#a89880";
                  return (
                    <div
                      className="paytable-row"
                      key={hand}
                      style={{ color: rowColor, borderBottomColor: `${rowColor}22` }}
                    >
                      <span>{hand.replace(/([A-Z])/g, " $1").trim()}</span>
                      <strong style={{ color: rowColor }}>x{payout}</strong>
                    </div>
                  );
                })}
              </div>
            </div>

            <div className="status-stack">
              <div className="status-box">
                <div className="status-title">Machine ledger</div>
                <div className="status-grid">
                  <div className="status-chip ledger">
                    <span>Credit</span>
                    <strong>{formatMoney(profile?.walletBalance ?? 0)}</strong>
                  </div>
                  <div className="status-chip ledger">
                    <span>Stake</span>
                    <strong>{betAmount || "5000"}</strong>
                  </div>
                  <div className="status-chip">
                    <span>Hand</span>
                    <strong>{drawResult?.handRank ?? (dealResult ? "Open" : "Idle")}</strong>
                  </div>
                  <div className="status-chip">
                    <span>Machine</span>
                    <strong>{selectedMachine?.name ?? "Not linked"}</strong>
                  </div>
                </div>
              </div>

              <div className="status-box machine-bar">
                <div className="status-title">Cabinet line-up</div>
                <div className="machine-buttons">
                  {machines.map((machine) => (
                    <button
                      className={`machine-button ${machine.id === machineId ? "active" : ""}`}
                      key={machine.id}
                      onClick={() => void handleMachineSelection(machine)}
                      type="button"
                      disabled={!machine.isOpen || busy}
                    >
                      <strong>{machine.name}</strong>
                      <small>
                        {formatMoney(machine.minBet)} - {formatMoney(machine.maxBet)}
                      </small>
                    </button>
                  ))}
                </div>
              </div>
            </div>
          </div>

          <div className="message-box">
            <span>{message}</span>
            <span className="message-pill">
              {messageTone === "danger" ? "Fault" : messageTone === "warning" ? "Alert" : "Ready"}
            </span>
          </div>

          <div className="card-stage">
            <div className="deal-banner">
              <div>
                <div className="label-kicker">Round monitor</div>
                <strong>{openRoundId ? `Round ${openRoundId.slice(0, 8)}` : "No active round"}</strong>
              </div>
              <span className="hint">
                {dealResult && !drawResult ? "Tap HOLD under each card, then DRAW." : "DEAL opens a new five-card round."}
              </span>
            </div>

            <div className="card-row">
              {Array.from({ length: 5 }, (_, index) => activeCards[index] ?? null).map((card, index) => (
                <PlayingCard key={`card-${index}`} card={card} label={`Card ${index + 1}`} />
              ))}
            </div>
          </div>

          <div className="control-deck">
            {!profile ? (
              <div className="auth-panel">
                <div className="section-title">Boot the cabinet</div>
                <div className="auth-hint">
                  This follows the Flutter bootstrap: sign up if needed, verify OTP `123456`, then log in.
                </div>
                <div className="auth-grid">
                  <label>
                    Username
                    <input value={username} onChange={(event) => setUsername(event.target.value)} />
                  </label>
                  <label>
                    Password
                    <input type="password" value={password} onChange={(event) => setPassword(event.target.value)} />
                  </label>
                  <label>
                    OTP
                    <input value={otpCode} onChange={(event) => setOtpCode(event.target.value)} />
                  </label>
                </div>
                <button className="auth-button" type="button" onClick={() => void handleBoot()} disabled={busy}>
                  {busy ? "BOOTING" : "SIGN UP / LOGIN"}
                </button>
              </div>
            ) : (
              <>
                <div className="hold-row">
                  {Array.from({ length: 5 }, (_, index) => (
                    <button
                      key={index}
                      className={`hold-button ${holdIndexes.includes(index) ? "active" : ""}`}
                      type="button"
                      onClick={() => toggleHold(index)}
                      disabled={!dealResult || !!drawResult || busy}
                    >
                      {holdIndexes.includes(index) ? "HELD" : "HOLD"}
                    </button>
                  ))}
                </div>

                <div className="control-row primary">
                  <div className="bet-input">
                    <label>
                      Bet amount
                      <input
                        inputMode="numeric"
                        value={betAmount}
                        onChange={(event) => setBetAmount(event.target.value.replace(/[^\d]/g, ""))}
                      />
                    </label>
                  </div>
                  <button className="action-button main" type="button" onClick={() => void handleDealOrDraw()} disabled={busy || !machineId}>
                    {busy ? "WORKING" : dealResult && !drawResult ? "DRAW" : "DEAL"}
                  </button>
                </div>

                <div className="control-row secondary">
                  <button className="action-button warning" type="button" onClick={() => void handleStartDoubleUp()} disabled={busy || !hasWin || !!doubleUpResult}>
                    DOUBLE UP
                  </button>
                  <button className="action-button success" type="button" onClick={() => void handleTakeHalf()} disabled={busy || !openRoundId || (!hasWin && !doubleUpResult)}>
                    TAKE HALF
                  </button>
                  <button className="action-button ghost" type="button" onClick={() => void handleCashout()} disabled={busy || !openRoundId || (!hasWin && !doubleUpResult)}>
                    TAKE SCORE
                  </button>
                </div>

                <div className="double-up-panel">
                  <div className="section-title">Double-up deck</div>
                  <div className="double-up-cards">
                    <PlayingCard card={doubleUpResult?.dealerCard} label="Dealer" />
                    <PlayingCard card={doubleUpResult?.challengerCard} label="Challenger" />
                  </div>
                  <div className="double-up-meta">
                    <div className="status-chip">
                      <span>Status</span>
                      <strong>{doubleUpResult?.status ?? "Standby"}</strong>
                    </div>
                    <div className="status-chip">
                      <span>Amount</span>
                      <strong>{formatMoney(doubleUpResult?.currentAmount ?? drawResult?.winAmount ?? 0)}</strong>
                    </div>
                    <div className="status-chip">
                      <span>Switches</span>
                      <strong>{doubleUpResult?.switchesRemaining ?? 0}</strong>
                    </div>
                  </div>
                  <div className="control-row tertiary">
                    <button className="action-button ghost" type="button" onClick={() => void handleSwitch()} disabled={busy || !doubleUpResult}>
                      SWITCH
                    </button>
                    <button className="guess-button small" type="button" onClick={() => void handleGuess("small")} disabled={busy || !doubleUpResult}>
                      SMALL
                    </button>
                    <button className="guess-button big" type="button" onClick={() => void handleGuess("big")} disabled={busy || !doubleUpResult}>
                      BIG
                    </button>
                  </div>
                </div>
              </>
            )}
          </div>
        </div>
      </section>

      <aside className="side-column">
        <section className="diagnostics">
          <div className="section-title">Machine telemetry</div>
          <div className="section-subtitle">Pulled from the authoritative backend state.</div>
          <div className="diagnostic-grid">
            <div className="diagnostic-card">
              <span>Observed RTP</span>
              <strong>{machineState ? formatPercent(machineState.observedRtp) : "--"}</strong>
            </div>
            <div className="diagnostic-card">
              <span>Target RTP</span>
              <strong>{machineState ? formatPercent(machineState.targetRtp) : "--"}</strong>
            </div>
            <div className="diagnostic-card">
              <span>Phase</span>
              <strong>{machineState?.phase ?? "--"}</strong>
            </div>
            <div className="diagnostic-card">
              <span>Active rounds</span>
              <strong>{machineState?.activeRounds ?? 0}</strong>
            </div>
            <div className="diagnostic-card">
              <span>Loss streak</span>
              <strong>{machineState?.consecutiveLosses ?? 0}</strong>
            </div>
            <div className="diagnostic-card">
              <span>Cooldown</span>
              <strong>{machineState?.cooldownRemaining ?? 0}</strong>
            </div>
            <div className="diagnostic-card">
              <span>Full house pot</span>
              <strong>{machineState ? formatMoney(machineState.jackpots.fullHouse) : "--"}</strong>
            </div>
            <div className="diagnostic-card">
              <span>Straight flush</span>
              <strong>{machineState ? formatMoney(machineState.jackpots.straightFlush) : "--"}</strong>
            </div>
          </div>
        </section>

        <section className="history-panel">
          <div className="section-title">Wallet trail</div>
          <div className="history-list">
            {history.length === 0 ? <div className="hint">No wallet activity yet.</div> : null}
            {history.slice(0, 8).map((entry) => (
              <div className="history-item" key={entry.id}>
                <strong>{entry.type}</strong>
                <span>{entry.reference.slice(0, 8)}</span>
                <strong className={`history-amount ${entry.amount >= 0 ? "positive" : "negative"}`}>
                  {entry.amount >= 0 ? "+" : ""}
                  {formatMoney(entry.amount)}
                </strong>
              </div>
            ))}
          </div>
        </section>
      </aside>
    </div>
  );
}
