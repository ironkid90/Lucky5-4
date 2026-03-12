import { useState, useCallback, useEffect } from 'react'

const SUITS = ['♠', '♥', '♦', '♣']
const RANKS = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A']
const SUIT_COLORS = { '♠': '#e0e0e0', '♥': '#ff3355', '♦': '#ff3355', '♣': '#e0e0e0' }

const PAYTABLE = [
  { name: '5 OF A KIND', label: 'LUCKY 5 / SUPER BONUS', mult: 500 },
  { name: 'ROYAL FLUSH', label: 'ROYAL FLUSH', mult: 100 },
  { name: 'STRAIGHT FLUSH', label: 'STRAIGHT FLUSH', mult: 75 },
  { name: '4 OF A KIND', label: '4 OF A KIND', mult: 20 },
  { name: 'FULL HOUSE', label: 'FULL HOUSE', mult: 12 },
  { name: 'FLUSH', label: 'FLUSH', mult: 7 },
  { name: 'STRAIGHT', label: 'STRAIGHT', mult: 5 },
  { name: '3 OF A KIND', label: '3 OF A KIND', mult: 3 },
  { name: '2 PAIR', label: '2 PAIR', mult: 1 },
]

const STAKES = [1, 2, 5, 10, 20, 50]

const PHASES = {
  IDLE: 'IDLE',
  DEAL: 'DEAL',
  HOLD: 'HOLD',
  DRAW: 'DRAW',
  PAYOUT: 'PAYOUT',
}

function createDeck() {
  const deck = []
  for (const suit of SUITS) {
    for (const rank of RANKS) {
      deck.push({ rank, suit })
    }
  }
  return deck
}

function shuffleDeck(deck) {
  const d = [...deck]
  for (let i = d.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [d[i], d[j]] = [d[j], d[i]]
  }
  return d
}

function evaluateHand(cards) {
  const rankCounts = {}
  const suitCounts = {}
  const rankValues = cards.map(c => RANKS.indexOf(c.rank))

  cards.forEach(c => {
    rankCounts[c.rank] = (rankCounts[c.rank] || 0) + 1
    suitCounts[c.suit] = (suitCounts[c.suit] || 0) + 1
  })

  const counts = Object.values(rankCounts).sort((a, b) => b - a)
  const isFlush = Object.values(suitCounts).some(c => c === 5)
  const sorted = [...rankValues].sort((a, b) => a - b)
  const isSequential = sorted.every((v, i) => i === 0 || v === sorted[i - 1] + 1)
  const isAceHighStraight = sorted.join(',') === '0,1,2,3,12'
  const isStraight = isSequential || isAceHighStraight
  const isRoyal = isFlush && sorted.join(',') === '8,9,10,11,12'

  if (counts[0] === 5) return PAYTABLE[0]
  if (isRoyal) return PAYTABLE[1]
  if (isStraight && isFlush) return PAYTABLE[2]
  if (counts[0] === 4) return PAYTABLE[3]
  if (counts[0] === 3 && counts[1] === 2) return PAYTABLE[4]
  if (isFlush) return PAYTABLE[5]
  if (isStraight) return PAYTABLE[6]
  if (counts[0] === 3) return PAYTABLE[7]
  if (counts[0] === 2 && counts[1] === 2) return PAYTABLE[8]

  return null
}

function CardFace({ card, held, onClick, index, phase }) {
  const isEmpty = !card
  const isBack = phase === PHASES.IDLE

  if (isEmpty || isBack) {
    return (
      <div
        onClick={onClick}
        className="relative w-[60px] h-[88px] sm:w-[72px] sm:h-[104px] md:w-[90px] md:h-[130px] rounded-md border-2 border-cyan-800 flex items-center justify-center cursor-pointer select-none overflow-hidden"
        style={{
          background: 'linear-gradient(135deg, #0c1a2e 0%, #0a0e1a 50%, #0c1a2e 100%)',
          boxShadow: '0 0 8px rgba(0,255,255,0.15), inset 0 0 15px rgba(0,0,0,0.5)',
        }}
      >
        <div className="absolute inset-1 border border-cyan-900/50 rounded-sm" />
        <div className="text-cyan-700 text-lg md:text-2xl font-bold opacity-60">★</div>
        {held && (
          <div className="absolute -bottom-0 left-0 right-0 bg-yellow-400 text-black text-[7px] sm:text-[8px] md:text-[9px] text-center font-bold py-0.5 tracking-wider">
            HELD
          </div>
        )}
      </div>
    )
  }

  const color = SUIT_COLORS[card.suit]
  const isRed = card.suit === '♥' || card.suit === '♦'

  return (
    <div
      onClick={onClick}
      className={`relative w-[60px] h-[88px] sm:w-[72px] sm:h-[104px] md:w-[90px] md:h-[130px] rounded-md border-2 flex flex-col items-center justify-between p-1 sm:p-1.5 md:p-2 cursor-pointer select-none transition-all duration-150 ${
        held
          ? 'border-yellow-400 shadow-[0_0_12px_rgba(250,204,21,0.5)]'
          : 'border-gray-500 hover:border-cyan-400'
      }`}
      style={{
        background: held
          ? 'linear-gradient(180deg, #1a1a0a 0%, #111108 100%)'
          : 'linear-gradient(180deg, #1a1a2e 0%, #0f0f1a 100%)',
        boxShadow: held
          ? '0 0 15px rgba(250,204,21,0.3), inset 0 1px 0 rgba(255,255,255,0.05)'
          : '0 4px 12px rgba(0,0,0,0.5), inset 0 1px 0 rgba(255,255,255,0.05)',
      }}
    >
      <div className="self-start leading-none">
        <div className="text-xs sm:text-sm md:text-base font-bold" style={{ color, textShadow: `0 0 6px ${color}40` }}>
          {card.rank}
        </div>
        <div className="text-[10px] sm:text-xs md:text-sm" style={{ color }}>{card.suit}</div>
      </div>

      <div
        className="text-xl sm:text-2xl md:text-4xl"
        style={{ color, textShadow: `0 0 10px ${color}60`, filter: isRed ? 'saturate(1.3)' : 'none' }}
      >
        {card.suit}
      </div>

      <div className="self-end leading-none rotate-180">
        <div className="text-xs sm:text-sm md:text-base font-bold" style={{ color, textShadow: `0 0 6px ${color}40` }}>
          {card.rank}
        </div>
        <div className="text-[10px] sm:text-xs md:text-sm" style={{ color }}>{card.suit}</div>
      </div>

      {held && (
        <div className="absolute -bottom-0 left-0 right-0 bg-yellow-400 text-black text-[7px] sm:text-[8px] md:text-[9px] text-center font-bold py-0.5 tracking-wider">
          HELD
        </div>
      )}
    </div>
  )
}

function ArcadeButton({ label, color, onClick, disabled, className = '', circular = false }) {
  const colorMap = {
    yellow: {
      bg: 'linear-gradient(180deg, #fbbf24 0%, #b45309 100%)',
      border: '#92400e',
      text: '#1c1917',
      glow: 'rgba(251,191,36,0.4)',
      highlight: '#fde68a',
    },
    orange: {
      bg: 'linear-gradient(180deg, #fb923c 0%, #c2410c 100%)',
      border: '#9a3412',
      text: '#fff',
      glow: 'rgba(251,146,60,0.4)',
      highlight: '#fed7aa',
    },
    red: {
      bg: 'linear-gradient(180deg, #ef4444 0%, #991b1b 100%)',
      border: '#7f1d1d',
      text: '#fff',
      glow: 'rgba(239,68,68,0.4)',
      highlight: '#fca5a5',
    },
    green: {
      bg: 'linear-gradient(180deg, #22c55e 0%, #15803d 100%)',
      border: '#14532d',
      text: '#fff',
      glow: 'rgba(34,197,94,0.4)',
      highlight: '#86efac',
    },
    white: {
      bg: 'linear-gradient(180deg, #e5e7eb 0%, #9ca3af 100%)',
      border: '#6b7280',
      text: '#1f2937',
      glow: 'rgba(229,231,235,0.3)',
      highlight: '#f9fafb',
    },
    black: {
      bg: 'linear-gradient(180deg, #374151 0%, #111827 100%)',
      border: '#030712',
      text: '#d1d5db',
      glow: 'rgba(55,65,81,0.4)',
      highlight: '#6b7280',
    },
  }

  const scheme = colorMap[color] || colorMap.white

  return (
    <button
      onClick={onClick}
      disabled={disabled}
      className={`relative font-bold tracking-wider select-none transition-all duration-75 active:translate-y-0.5 active:scale-[0.97] ${
        disabled ? 'opacity-40 cursor-not-allowed' : 'cursor-pointer hover:brightness-110'
      } ${circular ? 'rounded-full w-10 h-10 sm:w-12 sm:h-12 md:w-14 md:h-14' : 'rounded-md'} ${className}`}
      style={{
        background: scheme.bg,
        border: `3px solid ${scheme.border}`,
        color: scheme.text,
        boxShadow: `0 4px 0 ${scheme.border}, 0 6px 12px rgba(0,0,0,0.5), inset 0 1px 0 ${scheme.highlight}`,
        textShadow: color === 'black' || color === 'white' ? 'none' : '0 1px 2px rgba(0,0,0,0.3)',
        fontSize: 'inherit',
      }}
    >
      {label}
    </button>
  )
}

function App() {
  const [phase, setPhase] = useState(PHASES.IDLE)
  const [credit, setCredit] = useState(1000)
  const [stakeIndex, setStakeIndex] = useState(0)
  const [cards, setCards] = useState([null, null, null, null, null])
  const [held, setHeld] = useState([false, false, false, false, false])
  const [deck, setDeck] = useState([])
  const [deckCursor, setDeckCursor] = useState(0)
  const [result, setResult] = useState(null)
  const [winAmount, setWinAmount] = useState(0)
  const [highlightRow, setHighlightRow] = useState(null)
  const [message, setMessage] = useState('INSERT COIN — PRESS BET TO SET STAKE')

  const stake = STAKES[stakeIndex]

  const resetToIdle = useCallback(() => {
    setPhase(PHASES.IDLE)
    setCards([null, null, null, null, null])
    setHeld([false, false, false, false, false])
    setResult(null)
    setWinAmount(0)
    setHighlightRow(null)
    setMessage('INSERT COIN — PRESS BET TO SET STAKE')
  }, [])

  const handleBet = useCallback(() => {
    if (phase !== PHASES.IDLE) return
    setStakeIndex(i => (i + 1) % STAKES.length)
  }, [phase])

  const handleDeal = useCallback(() => {
    if (phase === PHASES.PAYOUT) {
      resetToIdle()
      return
    }

    if (phase === PHASES.IDLE) {
      if (credit < stake) {
        setMessage('NOT ENOUGH CREDIT')
        return
      }
      setCredit(c => c - stake)
      const newDeck = shuffleDeck(createDeck())
      const dealt = newDeck.slice(0, 5)
      setDeck(newDeck)
      setDeckCursor(5)
      setCards(dealt)
      setHeld([false, false, false, false, false])
      setResult(null)
      setWinAmount(0)
      setHighlightRow(null)
      setPhase(PHASES.HOLD)
      setMessage('PRESS HOLDS TO KEEP CARD — THEN PRESS DRAW')
      return
    }

    if (phase === PHASES.HOLD) {
      const newCards = [...cards]
      let cursor = deckCursor
      for (let i = 0; i < 5; i++) {
        if (!held[i]) {
          newCards[i] = deck[cursor]
          cursor++
        }
      }
      setCards(newCards)
      setDeckCursor(cursor)
      setPhase(PHASES.DRAW)

      const hand = evaluateHand(newCards)
      if (hand) {
        const win = hand.mult * stake
        setResult(hand)
        setWinAmount(win)
        setCredit(c => c + win)
        const rowIdx = PAYTABLE.findIndex(p => p.name === hand.name)
        setHighlightRow(rowIdx)
        setMessage(`★ ${hand.name} ★ WIN ${win} CREDITS!`)
      } else {
        setMessage('NO WIN — PRESS DEAL TO PLAY AGAIN')
      }
      setPhase(PHASES.PAYOUT)
      return
    }
  }, [phase, credit, stake, cards, held, deck, deckCursor, resetToIdle])

  const handleHold = useCallback((index) => {
    if (phase !== PHASES.HOLD) return
    setHeld(h => {
      const next = [...h]
      next[index] = !next[index]
      return next
    })
  }, [phase])

  const handleCancelHold = useCallback(() => {
    if (phase !== PHASES.HOLD) return
    setHeld([false, false, false, false, false])
  }, [phase])

  const handleTakeScore = useCallback(() => {
    if (phase !== PHASES.PAYOUT || !result) return
    resetToIdle()
  }, [phase, result, resetToIdle])

  const handleTakeHalf = useCallback(() => {
    if (phase !== PHASES.PAYOUT || !result) return
    const halfToReturn = Math.floor(winAmount / 2)
    setCredit(c => c - halfToReturn)
    const kept = winAmount - halfToReturn
    setMessage(`TOOK HALF — ${kept} CREDITS KEPT`)
    resetToIdle()
  }, [phase, result, winAmount, resetToIdle])

  const dealLabel = phase === PHASES.HOLD ? 'DRAW' : 'DEAL'

  return (
    <div
      className="min-h-screen min-h-[100dvh] flex flex-col items-center bg-black text-white overflow-hidden relative"
      style={{
        backgroundImage: 'radial-gradient(ellipse at center, #0a0a1a 0%, #000000 70%)',
      }}
    >
      <div
        className="pointer-events-none fixed inset-0 z-50 opacity-[0.03]"
        style={{
          backgroundImage: 'repeating-linear-gradient(0deg, transparent, transparent 2px, rgba(0,255,255,0.03) 2px, rgba(0,255,255,0.03) 4px)',
        }}
      />

      <div className="w-full max-w-2xl mx-auto flex flex-col h-screen h-[100dvh] px-2 sm:px-3 md:px-4 py-2 sm:py-3">

        <div className="flex gap-2 sm:gap-3 mb-2 sm:mb-3 flex-shrink-0">

          <div className="flex-1 border border-cyan-800/60 rounded-md p-1.5 sm:p-2 md:p-3 bg-black/80 overflow-hidden">
            <div className="text-[7px] sm:text-[8px] md:text-[9px] text-cyan-400 tracking-[0.2em] mb-1 sm:mb-1.5 border-b border-cyan-900/50 pb-1"
              style={{ textShadow: '0 0 8px rgba(0,255,255,0.5)' }}>
              ★ PAYTABLE ★
            </div>
            <div className="space-y-0">
              {PAYTABLE.map((row, i) => (
                <div
                  key={row.name}
                  className={`flex justify-between items-center py-[1px] sm:py-[2px] transition-all duration-300 px-0.5 rounded-sm ${
                    highlightRow === i
                      ? 'bg-yellow-400/20 scale-[1.02]'
                      : ''
                  }`}
                >
                  <span
                    className={`text-[6px] sm:text-[7px] md:text-[8px] tracking-wide truncate mr-1 ${
                      highlightRow === i ? 'text-yellow-300' : 'text-cyan-300'
                    }`}
                    style={highlightRow === i ? { textShadow: '0 0 8px rgba(250,204,21,0.6)' } : {}}
                  >
                    {row.label}
                  </span>
                  <span
                    className={`text-[6px] sm:text-[7px] md:text-[8px] font-bold tabular-nums whitespace-nowrap ${
                      highlightRow === i ? 'text-yellow-200' : 'text-white/90'
                    }`}
                  >
                    {row.mult * stake}
                  </span>
                </div>
              ))}
            </div>
          </div>

          <div className="w-24 sm:w-28 md:w-32 flex flex-col gap-1.5 sm:gap-2 flex-shrink-0">
            <div className="border border-blue-700/60 rounded-md p-1.5 sm:p-2 md:p-3 bg-black/80 text-center">
              <div className="text-[7px] sm:text-[8px] md:text-[9px] text-blue-400 tracking-[0.2em] mb-0.5"
                style={{ textShadow: '0 0 8px rgba(59,130,246,0.5)' }}>
                CREDIT
              </div>
              <div className="text-sm sm:text-lg md:text-xl text-white font-bold tabular-nums"
                style={{ textShadow: '0 0 10px rgba(255,255,255,0.3)' }}>
                {credit}
              </div>
            </div>
            <div className="border border-blue-700/60 rounded-md p-1.5 sm:p-2 md:p-3 bg-black/80 text-center">
              <div className="text-[7px] sm:text-[8px] md:text-[9px] text-blue-400 tracking-[0.2em] mb-0.5"
                style={{ textShadow: '0 0 8px rgba(59,130,246,0.5)' }}>
                STAKE
              </div>
              <div className="text-sm sm:text-lg md:text-xl text-white font-bold tabular-nums"
                style={{ textShadow: '0 0 10px rgba(255,255,255,0.3)' }}>
                {stake}
              </div>
            </div>
          </div>
        </div>

        <div className="flex-1 flex flex-col items-center justify-center min-h-0">

          <div className="flex gap-1.5 sm:gap-2 md:gap-3 justify-center mb-1 sm:mb-2">
            {cards.map((card, i) => (
              <CardFace
                key={i}
                card={card}
                held={held[i]}
                index={i}
                phase={phase}
                onClick={() => handleHold(i)}
              />
            ))}
          </div>

          <div
            className={`text-[7px] sm:text-[8px] md:text-[10px] tracking-[0.15em] text-center px-2 py-1.5 sm:py-2 rounded-md transition-all duration-300 min-h-[24px] flex items-center justify-center ${
              result
                ? 'text-yellow-300 animate-pulse'
                : 'text-cyan-400'
            }`}
            style={{
              textShadow: result
                ? '0 0 12px rgba(250,204,21,0.6)'
                : '0 0 8px rgba(0,255,255,0.4)',
            }}
          >
            {message}
          </div>
        </div>

        <div className="flex flex-col gap-1.5 sm:gap-2 flex-shrink-0 pb-1 sm:pb-2">

          <div className="flex gap-1 sm:gap-1.5 md:gap-2 justify-center text-[7px] sm:text-[8px] md:text-[9px]">
            {[0, 1, 2, 3, 4].map(i => (
              <ArcadeButton
                key={i}
                label={held[i] ? 'HELD' : 'HOLD'}
                color="yellow"
                onClick={() => handleHold(i)}
                disabled={phase !== PHASES.HOLD}
                className="w-[60px] h-[30px] sm:w-[72px] sm:h-[34px] md:w-[90px] md:h-[38px] text-[7px] sm:text-[8px] md:text-[9px]"
              />
            ))}
          </div>

          <div className="flex gap-1 sm:gap-1.5 md:gap-2 justify-center text-[7px] sm:text-[8px] md:text-[9px]">
            <ArcadeButton
              label="BIG"
              color="orange"
              onClick={() => {}}
              disabled={phase !== PHASES.PAYOUT}
              className="flex-1 h-[32px] sm:h-[36px] md:h-[40px] max-w-[80px] sm:max-w-[90px] md:max-w-[100px]"
            />
            <ArcadeButton
              label="SMALL"
              color="orange"
              onClick={() => {}}
              disabled={phase !== PHASES.PAYOUT}
              className="flex-1 h-[32px] sm:h-[36px] md:h-[40px] max-w-[80px] sm:max-w-[90px] md:max-w-[100px]"
            />
            <ArcadeButton
              label="CANCEL"
              color="white"
              onClick={handleCancelHold}
              disabled={phase !== PHASES.HOLD}
              className="flex-1 h-[32px] sm:h-[36px] md:h-[40px] max-w-[80px] sm:max-w-[90px] md:max-w-[100px]"
            />
            <ArcadeButton
              label={dealLabel}
              color="red"
              onClick={handleDeal}
              disabled={false}
              className="flex-1 h-[32px] sm:h-[36px] md:h-[40px] max-w-[80px] sm:max-w-[90px] md:max-w-[100px]"
            />
            <ArcadeButton
              label="BET"
              color="green"
              onClick={handleBet}
              disabled={phase !== PHASES.IDLE}
              className="flex-1 h-[32px] sm:h-[36px] md:h-[40px] max-w-[80px] sm:max-w-[90px] md:max-w-[100px]"
            />
          </div>

          <div className="flex gap-1.5 sm:gap-2 md:gap-3 justify-center items-center text-[7px] sm:text-[8px] md:text-[9px]">
            <ArcadeButton
              label="TAKE HALF"
              color="red"
              onClick={handleTakeHalf}
              disabled={phase !== PHASES.PAYOUT || !result}
              className="h-[32px] sm:h-[36px] md:h-[40px] px-3 sm:px-4 md:px-5"
            />
            <ArcadeButton
              label="☰"
              color="black"
              onClick={() => {}}
              disabled={false}
              circular
              className="text-base sm:text-lg md:text-xl"
            />
            <ArcadeButton
              label="TAKE SCORE"
              color="orange"
              onClick={handleTakeScore}
              disabled={phase !== PHASES.PAYOUT || !result}
              className="h-[32px] sm:h-[36px] md:h-[40px] px-3 sm:px-4 md:px-5"
            />
          </div>
        </div>
      </div>
    </div>
  )
}

export default App
