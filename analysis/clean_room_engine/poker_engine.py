from __future__ import annotations

from collections import Counter
from dataclasses import dataclass, replace
from enum import Enum
import hashlib
from typing import Iterable, Sequence

MASK64 = (1 << 64) - 1
SUITS = ("C", "D", "H", "S")
DEFAULT_HOLD_MASK = (False, False, False, False, False)

RANK_CHAR_TO_VALUE = {
    "2": 2,
    "3": 3,
    "4": 4,
    "5": 5,
    "6": 6,
    "7": 7,
    "8": 8,
    "9": 9,
    "T": 10,
    "J": 11,
    "Q": 12,
    "K": 13,
    "A": 14,
}

RANK_VALUE_TO_CHAR = {value: key for key, value in RANK_CHAR_TO_VALUE.items()}

HAND_NAMES = {
    "royal_flush": "Royal Flush",
    "straight_flush": "Straight Flush",
    "four_of_a_kind": "4 of a Kind",
    "full_house": "Full House",
    "flush": "Flush",
    "straight": "Straight",
    "three_of_a_kind": "3 of a Kind",
    "two_pair": "2 Pair",
    "jacks_or_better": "Jacks or Better",
    "high_card": "High Card",
}

DEFAULT_JACKS_OR_BETTER_PAYTABLE = {
    "royal_flush": 250,
    "straight_flush": 50,
    "four_of_a_kind": 25,
    "full_house": 9,
    "flush": 6,
    "straight": 4,
    "three_of_a_kind": 3,
    "two_pair": 2,
    "jacks_or_better": 1,
}


SeedInput = int | str | bytes


class RoundPhase(str, Enum):
    DEALT = "dealt"
    DRAWN = "drawn"


class RoundActionKind(str, Enum):
    TOGGLE_HOLD = "toggle_hold"
    SET_HOLD_MASK = "set_hold_mask"
    DRAW = "draw"


class BigSmallGuess(str, Enum):
    BIG = "big"
    SMALL = "small"


class TiePolicy(str, Enum):
    LOSE = "lose"
    PUSH = "push"
    REDEAL = "redeal"


class DoubleUpOutcome(str, Enum):
    WIN = "win"
    LOSE = "lose"
    PUSH = "push"


@dataclass(frozen=True, order=True)
class Card:
    rank: int
    suit: str

    def __post_init__(self) -> None:
        if self.rank not in RANK_VALUE_TO_CHAR:
            raise ValueError(f"unsupported rank: {self.rank}")
        if self.suit not in SUITS:
            raise ValueError(f"unsupported suit: {self.suit}")

    @property
    def code(self) -> str:
        return f"{RANK_VALUE_TO_CHAR[self.rank]}{self.suit}"

    @classmethod
    def from_code(cls, code: str) -> "Card":
        normalized = code.strip().upper().replace("10", "T")
        if len(normalized) != 2:
            raise ValueError(f"invalid card code: {code}")
        rank = RANK_CHAR_TO_VALUE[normalized[0]]
        return cls(rank=rank, suit=normalized[1])


@dataclass(frozen=True)
class RoundAction:
    kind: RoundActionKind
    card_index: int | None = None
    hold_mask: tuple[bool, bool, bool, bool, bool] | None = None


@dataclass(frozen=True)
class FiveCardDrawState:
    seed_token: int
    deck: tuple[Card, ...]
    hand: tuple[Card, Card, Card, Card, Card]
    draw_index: int = 5
    held: tuple[bool, bool, bool, bool, bool] = DEFAULT_HOLD_MASK
    phase: RoundPhase = RoundPhase.DEALT


@dataclass(frozen=True)
class EvaluatedHand:
    category: str
    name: str
    payout_key: str
    tiebreak: tuple[int, ...]

    @property
    def is_winner(self) -> bool:
        return self.payout_key in DEFAULT_JACKS_OR_BETTER_PAYTABLE


@dataclass(frozen=True)
class DoubleUpRules:
    tie_policy: TiePolicy = TiePolicy.LOSE
    ace_high: bool = True


@dataclass(frozen=True)
class PresentationNoisePlan:
    suspense_ms: int
    reveal_ms: int
    flip_frames: int
    pulse_frames: int
    decoy_swaps: int


@dataclass(frozen=True)
class DoubleUpRound:
    round_index: int
    seed_token: int | None
    dealer_card: Card
    challenger_card: Card
    guess: BigSmallGuess
    outcome: DoubleUpOutcome
    previous_amount: int
    next_amount: int
    tie_count: int


class SplitMix64:
    def __init__(self, seed: int) -> None:
        self.state = seed & MASK64

    def next_u64(self) -> int:
        self.state = (self.state + 0x9E3779B97F4A7C15) & MASK64
        value = self.state
        value = (value ^ (value >> 30)) * 0xBF58476D1CE4E5B9 & MASK64
        value = (value ^ (value >> 27)) * 0x94D049BB133111EB & MASK64
        return value ^ (value >> 31)

    def randbelow(self, bound: int) -> int:
        if bound <= 0:
            raise ValueError("bound must be positive")
        limit = ((1 << 64) // bound) * bound
        while True:
            value = self.next_u64()
            if value < limit:
                return value % bound


def _seed_to_bytes(seed: SeedInput) -> bytes:
    if isinstance(seed, bytes):
        return seed
    if isinstance(seed, int):
        return str(seed).encode("ascii")
    return seed.encode("utf-8")


def derive_seed(seed: SeedInput, *parts: SeedInput) -> int:
    digest = hashlib.sha256()
    digest.update(_seed_to_bytes(seed))
    for part in parts:
        digest.update(b"\0")
        digest.update(_seed_to_bytes(part))
    return int.from_bytes(digest.digest()[:8], "big")


def build_standard_deck() -> list[Card]:
    return [Card(rank=rank, suit=suit) for suit in SUITS for rank in range(2, 15)]


def shuffle_deck(seed: SeedInput, stream: SeedInput = "deck", deck: Iterable[Card] | None = None) -> list[Card]:
    cards = list(deck or build_standard_deck())
    rng = SplitMix64(derive_seed(seed, stream))
    for index in range(len(cards) - 1, 0, -1):
        swap_index = rng.randbelow(index + 1)
        cards[index], cards[swap_index] = cards[swap_index], cards[index]
    return cards


def deal_five_card_draw(seed: SeedInput, stream: SeedInput = "hand") -> FiveCardDrawState:
    seed_token = derive_seed(seed, stream)
    deck = tuple(shuffle_deck(seed_token, "cards"))
    hand = tuple(deck[:5])
    return FiveCardDrawState(seed_token=seed_token, deck=deck, hand=hand)


def reduce_round(state: FiveCardDrawState, action: RoundAction) -> FiveCardDrawState:
    if action.kind == RoundActionKind.TOGGLE_HOLD:
        if state.phase != RoundPhase.DEALT:
            raise ValueError("hold state can only change before draw")
        if action.card_index is None or not 0 <= action.card_index < 5:
            raise ValueError("card_index must be between 0 and 4")
        held = list(state.held)
        held[action.card_index] = not held[action.card_index]
        return replace(state, held=tuple(held))

    if action.kind == RoundActionKind.SET_HOLD_MASK:
        if state.phase != RoundPhase.DEALT:
            raise ValueError("hold state can only change before draw")
        if action.hold_mask is None or len(action.hold_mask) != 5:
            raise ValueError("hold_mask must contain five values")
        return replace(state, held=tuple(bool(value) for value in action.hold_mask))

    if action.kind == RoundActionKind.DRAW:
        if state.phase != RoundPhase.DEALT:
            raise ValueError("draw can only happen once")
        hand = list(state.hand)
        draw_index = state.draw_index
        for index, is_held in enumerate(state.held):
            if is_held:
                continue
            hand[index] = state.deck[draw_index]
            draw_index += 1
        return replace(
            state,
            hand=tuple(hand),
            draw_index=draw_index,
            phase=RoundPhase.DRAWN,
        )

    raise ValueError(f"unsupported action: {action.kind}")


def parse_cards(codes: Sequence[str]) -> tuple[Card, Card, Card, Card, Card]:
    if len(codes) != 5:
        raise ValueError("exactly five cards are required")
    return tuple(Card.from_code(code) for code in codes)


def _straight_high(ranks: Sequence[int]) -> int | None:
    unique = sorted(set(ranks))
    if len(unique) != 5:
        return None
    if unique == [2, 3, 4, 5, 14]:
        return 5
    if unique[-1] - unique[0] == 4:
        return unique[-1]
    return None


def evaluate_hand(hand: Sequence[Card]) -> EvaluatedHand:
    if len(hand) != 5:
        raise ValueError("exactly five cards are required")

    ranks = [card.rank for card in hand]
    rank_counts = Counter(ranks)
    groups = sorted(((count, rank) for rank, count in rank_counts.items()), reverse=True)
    counts = sorted(rank_counts.values(), reverse=True)
    descending = tuple(sorted(ranks, reverse=True))
    flush = len({card.suit for card in hand}) == 1
    straight_high = _straight_high(ranks)

    if flush and straight_high == 14 and set(ranks) == {10, 11, 12, 13, 14}:
        return EvaluatedHand("royal_flush", HAND_NAMES["royal_flush"], "royal_flush", (14,))

    if flush and straight_high is not None:
        return EvaluatedHand("straight_flush", HAND_NAMES["straight_flush"], "straight_flush", (straight_high,))

    if counts == [4, 1]:
        quad_rank = groups[0][1]
        kicker = groups[1][1]
        return EvaluatedHand("four_of_a_kind", HAND_NAMES["four_of_a_kind"], "four_of_a_kind", (quad_rank, kicker))

    if counts == [3, 2]:
        trip_rank = groups[0][1]
        pair_rank = groups[1][1]
        return EvaluatedHand("full_house", HAND_NAMES["full_house"], "full_house", (trip_rank, pair_rank))

    if flush:
        return EvaluatedHand("flush", HAND_NAMES["flush"], "flush", descending)

    if straight_high is not None:
        return EvaluatedHand("straight", HAND_NAMES["straight"], "straight", (straight_high,))

    if counts == [3, 1, 1]:
        trip_rank = groups[0][1]
        kickers = tuple(sorted((rank for rank, count in rank_counts.items() if count == 1), reverse=True))
        return EvaluatedHand(
            "three_of_a_kind",
            HAND_NAMES["three_of_a_kind"],
            "three_of_a_kind",
            (trip_rank, *kickers),
        )

    if counts == [2, 2, 1]:
        pair_ranks = sorted((rank for rank, count in rank_counts.items() if count == 2), reverse=True)
        kicker = next(rank for rank, count in rank_counts.items() if count == 1)
        return EvaluatedHand("two_pair", HAND_NAMES["two_pair"], "two_pair", (*pair_ranks, kicker))

    if counts == [2, 1, 1, 1]:
        pair_rank = next(rank for rank, count in rank_counts.items() if count == 2)
        kickers = tuple(sorted((rank for rank, count in rank_counts.items() if count == 1), reverse=True))
        payout_key = "jacks_or_better" if pair_rank >= 11 else "high_card"
        name = HAND_NAMES[payout_key]
        return EvaluatedHand("one_pair", name, payout_key, (pair_rank, *kickers))

    return EvaluatedHand("high_card", HAND_NAMES["high_card"], "high_card", descending)


def resolve_payout(
    evaluated_hand: EvaluatedHand,
    bet: int,
    paytable: dict[str, int] | None = None,
) -> int:
    if bet <= 0:
        raise ValueError("bet must be positive")
    active_paytable = paytable or DEFAULT_JACKS_OR_BETTER_PAYTABLE
    if evaluated_hand.payout_key not in active_paytable:
        return 0
    if evaluated_hand.payout_key == "royal_flush" and bet == 5:
        return 4000
    return active_paytable[evaluated_hand.payout_key] * bet


def build_double_up_noise(seed: SeedInput, round_index: int) -> PresentationNoisePlan:
    rng = SplitMix64(derive_seed(seed, "double_up_noise", round_index))
    return PresentationNoisePlan(
        suspense_ms=650 + rng.randbelow(1200),
        reveal_ms=180 + rng.randbelow(320),
        flip_frames=3 + rng.randbelow(5),
        pulse_frames=4 + rng.randbelow(6),
        decoy_swaps=rng.randbelow(4),
    )


def _compare_for_double_up(dealer: Card, challenger: Card, ace_high: bool) -> int:
    dealer_rank = dealer.rank
    challenger_rank = challenger.rank
    if not ace_high:
        dealer_rank = 1 if dealer_rank == 14 else dealer_rank
        challenger_rank = 1 if challenger_rank == 14 else challenger_rank
    if challenger_rank > dealer_rank:
        return 1
    if challenger_rank < dealer_rank:
        return -1
    return 0


def play_double_up(
    seed: SeedInput,
    round_index: int,
    guess: BigSmallGuess,
    previous_amount: int,
    rules: DoubleUpRules | None = None,
) -> DoubleUpRound:
    seed_token = derive_seed(seed, "double_up", round_index)
    deck = shuffle_deck(seed_token, "cards")
    return play_double_up_from_cards(
        cards=deck,
        guess=guess,
        previous_amount=previous_amount,
        rules=rules,
        round_index=round_index,
        seed_token=seed_token,
    )


def play_double_up_from_cards(
    cards: Sequence[Card],
    guess: BigSmallGuess,
    previous_amount: int,
    rules: DoubleUpRules | None = None,
    round_index: int = 0,
    seed_token: int | None = None,
) -> DoubleUpRound:
    if previous_amount <= 0:
        raise ValueError("previous_amount must be positive")
    active_rules = rules or DoubleUpRules()
    if len(cards) < 2:
        raise ValueError("at least two cards are required")

    cursor = 0
    tie_count = 0
    while True:
        if cursor + 1 >= len(cards):
            raise ValueError("not enough cards for requested tie policy")
        dealer_card = cards[cursor]
        challenger_card = cards[cursor + 1]
        comparison = _compare_for_double_up(dealer_card, challenger_card, active_rules.ace_high)
        if comparison != 0 or active_rules.tie_policy != TiePolicy.REDEAL:
            break
        tie_count += 1
        cursor += 2

    if comparison == 0:
        if active_rules.tie_policy == TiePolicy.PUSH:
            outcome = DoubleUpOutcome.PUSH
            next_amount = previous_amount
        else:
            outcome = DoubleUpOutcome.LOSE
            next_amount = 0
    else:
        guess_wins = (
            guess == BigSmallGuess.BIG and comparison > 0
        ) or (
            guess == BigSmallGuess.SMALL and comparison < 0
        )
        outcome = DoubleUpOutcome.WIN if guess_wins else DoubleUpOutcome.LOSE
        next_amount = previous_amount * 2 if guess_wins else 0

    return DoubleUpRound(
        round_index=round_index,
        seed_token=seed_token,
        dealer_card=dealer_card,
        challenger_card=challenger_card,
        guess=guess,
        outcome=outcome,
        previous_amount=previous_amount,
        next_amount=next_amount,
        tie_count=tie_count,
    )
