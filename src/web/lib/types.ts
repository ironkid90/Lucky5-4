export type ApiEnvelope<T> = {
  success: boolean;
  message: string;
  errors: string[];
  traceId: string;
  data: T;
};

export type AuthTokens = {
  accessToken: string;
  refreshToken: string;
  expiresAt: string;
};

export type MemberProfile = {
  userId: string;
  username: string;
  displayName: string;
  email: string | null;
  phoneNumber: string;
  walletBalance: number;
  lastSeenUtc: string;
};

export type MachineListing = {
  id: number;
  name: string;
  isOpen: boolean;
  minBet: number;
  maxBet: number;
};

export type PokerCard = {
  rank: string;
  suit: string;
  code: string;
};

export type JackpotInfo = {
  fullHouse: number;
  fullHouseRank: number;
  fourOfAKindA: number;
  fourOfAKindB: number;
  activeFourOfAKindSlot: number;
  straightFlush: number;
};

export type DealResult = {
  roundId: string;
  cards: PokerCard[];
  betAmount: number;
  walletBalanceAfterBet: number;
  jackpots?: JackpotInfo;
};

export type DrawResult = {
  roundId: string;
  cards: PokerCard[];
  handRank: string;
  winAmount: number;
  walletBalanceAfterRound: number;
  jackpotWon: number;
  jackpots?: JackpotInfo;
};

export type PresentationNoise = {
  suspenseMs: number;
  revealMs: number;
  flipFrames: number;
  pulseFrames: number;
};

export type DoubleUpResult = {
  roundId: string;
  status: string;
  currentAmount: number;
  walletBalance: number;
  dealerCard?: PokerCard | null;
  challengerCard?: PokerCard | null;
  switchesRemaining: number;
  isNoLoseActive: boolean;
  luckyMultiplier: number;
  noise?: PresentationNoise | null;
};

export type MachineState = {
  machineId: number;
  activeRounds: number;
  observedRtp: number;
  targetRtp: number;
  baseRtp: number;
  phase: string;
  lastPayoutScale: number;
  consecutiveLosses: number;
  roundsSinceMediumWin: number;
  cooldownRemaining: number;
  jackpots: JackpotInfo;
  timestampUtc: string;
};

export type WalletLedgerEntry = {
  id: string;
  amount: number;
  balanceAfter: number;
  type: string;
  reference: string;
  createdUtc: string;
};

export type DefaultRules = {
  payoutMultipliers: Record<string, number>;
};
