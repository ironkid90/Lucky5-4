import unittest

from poker_engine import (
    BigSmallGuess,
    Card,
    DoubleUpOutcome,
    DoubleUpRules,
    TiePolicy,
    build_double_up_noise,
    deal_five_card_draw,
    evaluate_hand,
    parse_cards,
    play_double_up,
    play_double_up_from_cards,
    reduce_round,
    resolve_payout,
    shuffle_deck,
    RoundAction,
    RoundActionKind,
)


class PokerEngineTests(unittest.TestCase):
    def test_shuffle_is_replayable(self) -> None:
        left = [card.code for card in shuffle_deck("session-1")[:10]]
        right = [card.code for card in shuffle_deck("session-1")[:10]]
        self.assertEqual(left, right)

    def test_shuffle_streams_can_be_split(self) -> None:
        deck_a = [card.code for card in shuffle_deck("session-1", "hand-a")[:5]]
        deck_b = [card.code for card in shuffle_deck("session-1", "hand-b")[:5]]
        self.assertNotEqual(deck_a, deck_b)

    def test_draw_preserves_held_cards(self) -> None:
        state = deal_five_card_draw("demo-round")
        original = state.hand
        state = reduce_round(state, RoundAction(RoundActionKind.SET_HOLD_MASK, hold_mask=(True, False, True, False, False)))
        drawn = reduce_round(state, RoundAction(RoundActionKind.DRAW))
        self.assertEqual(drawn.hand[0], original[0])
        self.assertEqual(drawn.hand[2], original[2])
        self.assertNotEqual(drawn.hand[1], original[1])
        self.assertNotEqual(drawn.hand[3], original[3])
        self.assertNotEqual(drawn.hand[4], original[4])

    def test_evaluator_handles_key_hands(self) -> None:
        royal = evaluate_hand(parse_cards(["AS", "KS", "QS", "JS", "TS"]))
        self.assertEqual(royal.payout_key, "royal_flush")

        wheel = evaluate_hand(parse_cards(["AC", "2D", "3H", "4S", "5C"]))
        self.assertEqual(wheel.payout_key, "straight")
        self.assertEqual(wheel.tiebreak, (5,))

        high_pair = evaluate_hand(parse_cards(["JD", "JH", "4C", "7S", "9D"]))
        self.assertEqual(high_pair.payout_key, "jacks_or_better")

        low_pair = evaluate_hand(parse_cards(["9D", "9H", "4C", "7S", "JD"]))
        self.assertEqual(low_pair.payout_key, "high_card")

    def test_payout_uses_standard_jacks_or_better_defaults(self) -> None:
        royal = evaluate_hand(parse_cards(["AS", "KS", "QS", "JS", "TS"]))
        two_pair = evaluate_hand(parse_cards(["AH", "AD", "KC", "KD", "2S"]))
        self.assertEqual(resolve_payout(royal, 1), 250)
        self.assertEqual(resolve_payout(royal, 5), 4000)
        self.assertEqual(resolve_payout(two_pair, 3), 6)

    def test_double_up_is_replayable(self) -> None:
        first = play_double_up("double-up-seed", 0, BigSmallGuess.BIG, 20)
        second = play_double_up("double-up-seed", 0, BigSmallGuess.BIG, 20)
        self.assertEqual(first, second)

    def test_double_up_tie_policy_push(self) -> None:
        cards = [Card.from_code("9S"), Card.from_code("9D")]
        result = play_double_up_from_cards(
            cards=cards,
            guess=BigSmallGuess.BIG,
            previous_amount=20,
            rules=DoubleUpRules(tie_policy=TiePolicy.PUSH),
        )
        self.assertEqual(result.outcome, DoubleUpOutcome.PUSH)
        self.assertEqual(result.next_amount, 20)

    def test_double_up_tie_policy_redeal_uses_next_pair(self) -> None:
        cards = [
            Card.from_code("9S"),
            Card.from_code("9D"),
            Card.from_code("5C"),
            Card.from_code("KH"),
        ]
        result = play_double_up_from_cards(
            cards=cards,
            guess=BigSmallGuess.BIG,
            previous_amount=10,
            rules=DoubleUpRules(tie_policy=TiePolicy.REDEAL),
        )
        self.assertEqual(result.tie_count, 1)
        self.assertEqual(result.dealer_card.code, "5C")
        self.assertEqual(result.challenger_card.code, "KH")
        self.assertEqual(result.outcome, DoubleUpOutcome.WIN)
        self.assertEqual(result.next_amount, 20)

    def test_noise_plan_is_replayable(self) -> None:
        left = build_double_up_noise("noise-seed", 2)
        right = build_double_up_noise("noise-seed", 2)
        self.assertEqual(left, right)


if __name__ == "__main__":
    unittest.main()
