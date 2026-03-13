import { useState, useCallback } from 'react'
import './App.css'

const SUITS = ['♠', '♥', '♦', '♣']
const RANKS = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A']

const PAYTABLE = [
  { name: '5 OF A KIND', label: 'LUCKY 5 / SUPER BONUS', mult: 500, color: '#FF00FF' },
  { name: 'ROYAL FLUSH', label: 'ROYAL FLUSH', mult: 100, color: '#FF3333' },
  { name: 'STRAIGHT FLUSH', label: 'STRAIGHT FLUSH', mult: 75, color: '#3399FF' },
  { name: '4 OF A KIND', label: '4 OF A KIND', mult: 20, color: '#FFFF00' },
  { name: 'FULL HOUSE', label: 'FULL HOUSE', mult: 12, color: '#FFFFFF' },
  { name: 'FLUSH', label: 'FLUSH', mult: 7, color: '#00CCCC' },
  { name: 'STRAIGHT', label: 'STRAIGHT', mult: 5, color: '#33CC33' },
  { name: '3 OF A KIND', label: '3 OF A KIND', mult: 3, color: '#6699FF' },
  { name: '2 PAIR', label: '2 PAIR', mult: 1, color: '#CC99FF' },
]

const STAKES = [1, 2, 5, 10, 20, 50]

const PHASES = {
  IDLE: 'IDLE',
  DEAL: 'DEAL',
  HOLD: 'HOLD',
  DRAW: 'DRAW',
  PAYOUT: 'PAYOUT',
  DOUBLE_UP: 'DOUBLE_UP',
}

const CARDS_PER_PAGE = 5

function rankValue(card) {
  return RANKS.indexOf(card.rank) + 2 // 2..14, Ace=14
}

function resolveDoubleUp(dealerCard, challengerCard, guess) {
  const dv = rankValue(dealerCard)
  const cv = rankValue(challengerCard)
  // Ace always wins for the player
  if (cv === 14) return 'win'
  if (dv === 14) return 'lose'
  if (guess === 'BIG') return cv > dv ? 'win' : 'lose'
  return cv < dv ? 'win' : 'lose'
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

function CardFace({ card, held, onClick, phase, doubleUpLabel }) {
  const isEmpty = !card
  const isBack = phase === PHASES.IDLE

  if (isEmpty || isBack) {
    return (
      <div className="flex flex-col items-center gap-0.5">
        <div
          onClick={onClick}
          className="card-back relative cursor-pointer select-none overflow-hidden"
        >
          <div className="absolute inset-[3px] border border-blue-400/20 rounded-sm" />
          <div className="flex items-center justify-center h-full">
            <div className="text-blue-300 text-2xl font-bold opacity-40">★</div>
          </div>
          {held && (
            <div className="absolute bottom-0 left-0 right-0 bg-yellow-400 text-black text-[8px] text-center font-bold py-0.5 tracking-wider led-text">
              HELD
            </div>
          )}
        </div>
        {doubleUpLabel && (
          <div className="text-[10px] led-text tracking-wider font-bold" style={{ color: '#00FF00', textShadow: '0 0 6px #00FF00' }}>
            {doubleUpLabel}
          </div>
        )}
      </div>
    )
  }

  const isRed = card.suit === '♥' || card.suit === '♦'
  const suitColor = isRed ? '#CC0000' : '#000000'

  return (
    <div className="flex flex-col items-center gap-0.5">
      <div
        onClick={onClick}
        className={`card-traditional relative cursor-pointer select-none overflow-hidden ${held ? 'card-held-ring' : ''}`}
      >
        <div className="flex flex-col h-full p-1.5">
          <div className="leading-none">
            <div className="text-base font-bold" style={{ color: suitColor }}>{card.rank}</div>
            <div className="text-sm -mt-0.5" style={{ color: suitColor }}>{card.suit}</div>
          </div>
          <div className="flex-1 flex items-center justify-center">
            <div className="text-4xl" style={{ color: suitColor }}>{card.suit}</div>
          </div>
          <div className="self-end leading-none rotate-180">
            <div className="text-base font-bold" style={{ color: suitColor }}>{card.rank}</div>
            <div className="text-sm -mt-0.5" style={{ color: suitColor }}>{card.suit}</div>
          </div>
        </div>
        {held && (
          <div className="absolute bottom-0 left-0 right-0 bg-yellow-400 text-black text-[9px] text-center font-bold py-0.5 tracking-wider led-text">
            HELD
          </div>
        )}
      </div>
      {doubleUpLabel && (
        <div className="text-[10px] led-text tracking-wider font-bold" style={{ color: '#00FF00', textShadow: '0 0 6px #00FF00' }}>
          {doubleUpLabel}
        </div>
      )}
    </div>
  )
}

function ArcadeButton({ label, color, onClick, disabled, className = '', circular = false }) {
  const colorMap = {
    yellow: {
      bg: 'linear-gradient(180deg, #FFD700 0%, #CC8800 50%, #AA6600 100%)',
      border: '#885500',
      text: '#1a1000',
      shadow: '#664400',
      highlight: 'rgba(255,255,200,0.4)',
    },
    red: {
      bg: 'linear-gradient(180deg, #FF4422 0%, #CC2200 50%, #991100 100%)',
      border: '#771100',
      text: '#FFFFFF',
      shadow: '#550000',
      highlight: 'rgba(255,150,130,0.3)',
    },
    green: {
      bg: 'linear-gradient(180deg, #33CC33 0%, #228B22 50%, #116611 100%)',
      border: '#004400',
      text: '#FFFFFF',
      shadow: '#003300',
      highlight: 'rgba(150,255,150,0.3)',
    },
    black: {
      bg: 'linear-gradient(180deg, #444 0%, #222 50%, #111 100%)',
      border: '#000',
      text: '#CCC',
      shadow: '#000',
      highlight: 'rgba(100,100,100,0.3)',
    },
  }

  const scheme = colorMap[color] || colorMap.yellow

  return (
    <button
      onClick={onClick}
      disabled={disabled}
      className={`arcade-btn ${circular ? 'circular' : ''} ${className}`}
      style={{
        '--btn-border': scheme.border,
        background: scheme.bg,
        border: `3px solid ${scheme.border}`,
        color: scheme.text,
        boxShadow: `0 4px 0 ${scheme.shadow}, 0 6px 10px rgba(0,0,0,0.6), inset 0 1px 0 ${scheme.highlight}`,
        textShadow: color !== 'black' ? '0 1px 2px rgba(0,0,0,0.4)' : 'none',
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

  // Double-up state
  const [duTrail, setDuTrail] = useState([])         // array of {card, role:'dealer'|'challenger', guess?, won?}
  const [duDealer, setDuDealer] = useState(null)      // current dealer card
  const [duAmount, setDuAmount] = useState(0)          // amount at risk
  const [duDeck, setDuDeck] = useState([])             // shuffled deck for DU rounds
  const [duCursor, setDuCursor] = useState(0)          // index into duDeck
  const [duPage, setDuPage] = useState(0)              // pagination page
  const [duLastResult, setDuLastResult] = useState(null) // 'win' | 'lose' | null
  const [duRevealed, setDuRevealed] = useState(false)  // whether challenger is face-up

  const stake = STAKES[stakeIndex]

  const resetDoubleUp = useCallback(() => {
    setDuTrail([])
    setDuDealer(null)
    setDuAmount(0)
    setDuDeck([])
    setDuCursor(0)
    setDuPage(0)
    setDuLastResult(null)
    setDuRevealed(false)
  }, [])

  const resetToIdle = useCallback(() => {
    setPhase(PHASES.IDLE)
    setCards([null, null, null, null, null])
    setHeld([false, false, false, false, false])
    setResult(null)
    setWinAmount(0)
    setHighlightRow(null)
    setMessage('INSERT COIN — PRESS BET TO SET STAKE')
    resetDoubleUp()
  }, [resetDoubleUp])

  const handleBet = useCallback(() => {
    if (phase !== PHASES.IDLE) return
    setStakeIndex(i => (i + 1) % STAKES.length)
  }, [phase])

  const handleDeal = useCallback(() => {
    if (phase === PHASES.PAYOUT) {
      resetToIdle()
      return
    }

    if (phase === PHASES.DOUBLE_UP && duLastResult === 'lose') {
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
  }, [phase, credit, stake, cards, held, deck, deckCursor, resetToIdle, duLastResult])

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
    if (phase === PHASES.DOUBLE_UP && duLastResult === 'win') {
      // Already credited on win, just exit
      resetToIdle()
      return
    }
    if (phase !== PHASES.PAYOUT || !result) return
    resetToIdle()
  }, [phase, result, resetToIdle, duLastResult])

  const handleTakeHalf = useCallback(() => {
    if (phase === PHASES.DOUBLE_UP && duLastResult === 'win') {
      const halfToReturn = Math.floor(duAmount / 2)
      setCredit(c => c - halfToReturn)
      setMessage(`TOOK HALF — ${duAmount - halfToReturn} CREDITS KEPT`)
      resetToIdle()
      return
    }
    if (phase !== PHASES.PAYOUT || !result) return
    const halfToReturn = Math.floor(winAmount / 2)
    setCredit(c => c - halfToReturn)
    const kept = winAmount - halfToReturn
    setMessage(`TOOK HALF — ${kept} CREDITS KEPT`)
    resetToIdle()
  }, [phase, result, winAmount, resetToIdle, duLastResult, duAmount])

  // ── Double-up logic ──

  const startDoubleUp = useCallback((amount) => {
    const freshDeck = shuffleDeck(createDeck())
    const dealer = freshDeck[0]
    setDuDeck(freshDeck)
    setDuCursor(1)
    setDuDealer(dealer)
    setDuAmount(amount)
    setDuTrail([{ card: dealer, role: 'dealer' }])
    setDuLastResult(null)
    setDuRevealed(false)
    setDuPage(0)
    setPhase(PHASES.DOUBLE_UP)
    setMessage('HI LO GAMBLE — ACE ALWAYS WINS')
  }, [])

  const handleDoubleUpGuess = useCallback((guess) => {
    if (phase !== PHASES.DOUBLE_UP || duRevealed) return
    const challenger = duDeck[duCursor]
    const outcome = resolveDoubleUp(duDealer, challenger, guess)
    const newTrail = [...duTrail, { card: challenger, role: 'challenger', guess, won: outcome === 'win' }]
    setDuTrail(newTrail)
    setDuCursor(c => c + 1)
    setDuRevealed(true)
    setDuLastResult(outcome)

    // Auto-scroll to last page
    const totalCards = newTrail.length + 1 // +1 for the "next" placeholder
    const maxPage = Math.max(0, Math.ceil(totalCards / CARDS_PER_PAGE) - 1)
    setDuPage(maxPage)

    if (outcome === 'win') {
      const newAmount = duAmount * 2
      setDuAmount(newAmount)
      setCredit(c => c + duAmount) // net gain = duAmount (double minus original)
      setMessage(`★ WIN ★ ${newAmount} CREDITS — AGAIN / TAKE SCORE`)
    } else {
      setCredit(c => c - duAmount)
      setMessage(`LOSE — ${duAmount} CREDITS LOST`)
    }
  }, [phase, duRevealed, duDeck, duCursor, duDealer, duTrail, duAmount])

  const handleDoubleUpContinue = useCallback(() => {
    if (phase !== PHASES.DOUBLE_UP || duLastResult !== 'win') return
    // The last winning challenger becomes the new dealer
    const lastChallenger = duTrail[duTrail.length - 1].card
    setDuDealer(lastChallenger)
    const newTrail = [...duTrail, { card: lastChallenger, role: 'dealer' }]
    setDuTrail(newTrail)
    setDuRevealed(false)
    setDuLastResult(null)

    // If deck is running low, reshuffle
    if (duCursor >= duDeck.length - 2) {
      const freshDeck = shuffleDeck(createDeck())
      setDuDeck(freshDeck)
      setDuCursor(0)
    }

    // Auto-scroll to last page
    const totalCards = newTrail.length + 1
    const maxPage = Math.max(0, Math.ceil(totalCards / CARDS_PER_PAGE) - 1)
    setDuPage(maxPage)

    setMessage('HI LO GAMBLE — ACE ALWAYS WINS')
  }, [phase, duLastResult, duTrail, duCursor, duDeck])

  const handleDuPagePrev = useCallback(() => {
    setDuPage(p => Math.max(0, p - 1))
  }, [])

  const handleDuPageNext = useCallback(() => {
    const totalCards = duTrail.length + 1
    const maxPage = Math.max(0, Math.ceil(totalCards / CARDS_PER_PAGE) - 1)
    setDuPage(p => Math.min(maxPage, p + 1))
  }, [duTrail])

  const dealLabel = phase === PHASES.HOLD ? 'DRAW' : 'DEAL'

  return (
    <div className="arcade-cabinet">

      <div className="crt-screen crt-area">
        <div className="crt-content">

          {phase === PHASES.DOUBLE_UP ? (
            /* ── DOUBLE-UP MODE ── */
            <>
              <div className="du-header">
                <div className="du-title led-text">HI LO GAMBLE</div>
                <div className="du-ace-note led-text">ACE ALWAYS WINS</div>
                <div className="du-amount-row">
                  <span className="led-text" style={{ color: '#3399FF', fontSize: '10px' }}>CREDIT {credit}</span>
                  <span className="led-text" style={{ color: '#FFD700', fontSize: '12px' }}>GAMBLE {duAmount}</span>
                </div>
              </div>

              <div className="du-trail-section">
                {duPage > 0 && (
                  <button className="du-page-arrow" onClick={handleDuPagePrev}>◀</button>
                )}

                <div className="du-trail-cards">
                  {(() => {
                    // Build display items: trail cards + a "next" placeholder
                    const items = duTrail.map((entry, i) => ({ ...entry, idx: i }))
                    if (duLastResult !== 'lose') {
                      items.push({ role: 'next', idx: items.length })
                    }
                    const start = duPage * CARDS_PER_PAGE
                    const visible = items.slice(start, start + CARDS_PER_PAGE)

                    return visible.map((entry, vi) => (
                      <div key={entry.idx} className="du-trail-slot">
                        {vi > 0 && <span className="du-trail-arrow">→</span>}
                        {entry.role === 'next' ? (
                          <div className="card-back du-next-card">
                            <div className="flex items-center justify-center h-full">
                              <div className="text-yellow-300 text-2xl font-bold led-text">?</div>
                            </div>
                          </div>
                        ) : entry.role === 'dealer' && entry.idx === duTrail.length - 1 && !duRevealed ? (
                          /* Active dealer card */
                          <CardFace card={entry.card} phase={PHASES.PAYOUT} className="du-active-dealer" />
                        ) : (
                          <div className={
                            entry.role === 'dealer' && entry.idx === duTrail.length - 1 ? 'du-active-dealer' :
                            entry.role === 'challenger' && entry.won === true ? 'du-card-win' :
                            entry.role === 'challenger' && entry.won === false ? 'du-card-lose' : ''
                          }>
                            <CardFace card={entry.card} phase={PHASES.PAYOUT} />
                          </div>
                        )}
                      </div>
                    ))
                  })()}
                </div>

                {(() => {
                  const totalItems = duTrail.length + (duLastResult !== 'lose' ? 1 : 0)
                  const maxPage = Math.max(0, Math.ceil(totalItems / CARDS_PER_PAGE) - 1)
                  return duPage < maxPage ? (
                    <button className="du-page-arrow" onClick={handleDuPageNext}>▶</button>
                  ) : <div style={{ width: 28 }} />
                })()}
              </div>

              {(() => {
                const totalItems = duTrail.length + (duLastResult !== 'lose' ? 1 : 0)
                const maxPage = Math.max(0, Math.ceil(totalItems / CARDS_PER_PAGE) - 1)
                return maxPage > 0 ? (
                  <div className="du-page-indicator led-text">PAGE {duPage + 1} / {maxPage + 1}</div>
                ) : null
              })()}

              <div className="info-section">
                <div
                  className={`result-message led-text ${duLastResult === 'win' ? 'result-flash' : ''}`}
                  style={{
                    color: duLastResult === 'win' ? '#00FF00' : duLastResult === 'lose' ? '#FF3333' : '#FFD700',
                    textShadow: duLastResult === 'win'
                      ? '0 0 10px #00FF00, 0 0 20px #00FF00'
                      : duLastResult === 'lose'
                        ? '0 0 10px #FF3333'
                        : '0 0 6px #FFD700',
                  }}
                >
                  {message}
                </div>
              </div>
            </>
          ) : (
            /* ── NORMAL PLAY MODE ── */
            <>
              <div className="paytable-section">
                <div className="paytable-hands">
                  {PAYTABLE.map((row, i) => (
                    <div
                      key={row.name}
                      className={`paytable-row ${highlightRow === i ? 'highlighted' : ''}`}
                    >
                      <span
                        className="paytable-label led-text"
                        style={{
                          color: highlightRow === i ? '#FFFF00' : row.color,
                          textShadow: highlightRow === i ? '0 0 8px #FFFF00' : `0 0 4px ${row.color}60`,
                        }}
                      >
                        {row.label}
                      </span>
                      <span
                        className="paytable-value led-text"
                        style={{
                          color: highlightRow === i ? '#FFFF00' : '#CCCCCC',
                          textShadow: highlightRow === i ? '0 0 8px #FFFF00' : 'none',
                        }}
                      >
                        {row.mult * stake}
                      </span>
                    </div>
                  ))}
                </div>

            <div className="credit-stake-panel">
              <div className="credit-display">
                <div className="cs-label led-text" style={{ color: '#3399FF', textShadow: '0 0 6px #3399FF' }}>
                  CREDIT
                </div>
                <div className="cs-value led-text" style={{ color: '#00FF00', textShadow: '0 0 8px #00FF00' }}>
                  {credit}
                </div>
              </div>
              <div className="stake-display">
                <div className="cs-label led-text" style={{ color: '#FF3333', textShadow: '0 0 6px #FF3333' }}>
                  STAKE
                </div>
                <div className="cs-value led-text" style={{ color: '#00FF00', textShadow: '0 0 8px #00FF00' }}>
                  {stake}
                </div>
              </div>
            </div>
          </div>

          <div className="cards-section">
            <div className="cards-row">
              {cards.map((card, i) => (
                <CardFace
                  key={i}
                  card={card}
                  held={held[i]}
                  phase={phase}
                  onClick={() => handleHold(i)}
                />
              ))}
            </div>
          </div>

          <div className="info-section">
            <div className="info-stats led-text">
              <span>DOUBLE UP</span>
              <span>SERIE</span>
            </div>
            <div className="info-numbers led-text">
              <span>{credit}</span>
              <span>×</span>
              <span>{stake}</span>
            </div>
            <div
              className={`result-message led-text ${result ? 'result-flash' : ''}`}
              style={{
                color: result ? (result.color || '#FFFF00') : '#00FF00',
                textShadow: result
                  ? `0 0 10px ${result.color || '#FFFF00'}, 0 0 20px ${result.color || '#FFFF00'}`
                  : '0 0 6px #00FF00',
              }}
            >
              {result ? (
                <>
                  <span className="result-hand">{result.name}</span>
                  <span className="result-bonus">WINS BONUS</span>
                </>
              ) : (
                message
              )}
            </div>
          </div>
            </>
          )}
        </div>
      </div>

      <div className="wood-panel button-area">
        <div className="button-row hold-row">
          {[0, 1, 2, 3, 4].map(i => (
            <ArcadeButton
              key={i}
              label={held[i] ? 'HELD' : 'HOLD'}
              color="yellow"
              onClick={() => handleHold(i)}
              disabled={phase !== PHASES.HOLD}
              className="hold-btn"
            />
          ))}
        </div>

        <div className="button-row action-row">
          <ArcadeButton
            label="BIG"
            color="yellow"
            onClick={() => {
              if (phase === PHASES.DOUBLE_UP) handleDoubleUpGuess('BIG')
              else if (phase === PHASES.PAYOUT && result) startDoubleUp(winAmount)
            }}
            disabled={!(phase === PHASES.PAYOUT && result) && !(phase === PHASES.DOUBLE_UP && !duRevealed)}
            className="action-btn"
          />
          <ArcadeButton
            label="SMALL"
            color="yellow"
            onClick={() => {
              if (phase === PHASES.DOUBLE_UP) handleDoubleUpGuess('SMALL')
              else if (phase === PHASES.PAYOUT && result) startDoubleUp(winAmount)
            }}
            disabled={!(phase === PHASES.PAYOUT && result) && !(phase === PHASES.DOUBLE_UP && !duRevealed)}
            className="action-btn"
          />
          <ArcadeButton
            label={phase === PHASES.DOUBLE_UP && duLastResult === 'win' ? <>↓ AGAIN</> : <>CANCEL<br/>HOLD</>}
            color="yellow"
            onClick={phase === PHASES.DOUBLE_UP && duLastResult === 'win' ? handleDoubleUpContinue : handleCancelHold}
            disabled={
              !(phase === PHASES.HOLD) &&
              !(phase === PHASES.DOUBLE_UP && duLastResult === 'win')
            }
            className="action-btn action-btn-text-sm"
          />
          <ArcadeButton
            label={<>DEAL<br/>DRAW</>}
            color="red"
            onClick={handleDeal}
            disabled={phase === PHASES.DOUBLE_UP && duLastResult !== 'lose'}
            className="action-btn action-btn-text-sm"
          />
          <ArcadeButton
            label="BET"
            color="green"
            onClick={handleBet}
            disabled={phase !== PHASES.IDLE}
            className="action-btn"
          />
        </div>

        <div className="button-row bottom-row">
          <ArcadeButton
            label={<>TAKE<br/>HALF</>}
            color="red"
            onClick={handleTakeHalf}
            disabled={
              !((phase === PHASES.PAYOUT && result) ||
                (phase === PHASES.DOUBLE_UP && duLastResult === 'win'))
            }
            className="bottom-btn action-btn-text-sm"
          />
          <ArcadeButton
            label="☰"
            color="black"
            onClick={() => {}}
            disabled={false}
            circular
            className="menu-btn"
          />
          <ArcadeButton
            label={<>TAKE<br/>SCORE</>}
            color="red"
            onClick={handleTakeScore}
            disabled={
              !((phase === PHASES.PAYOUT && result) ||
                (phase === PHASES.DOUBLE_UP && duLastResult === 'win'))
            }
            className="bottom-btn action-btn-text-sm"
          />
        </div>
      </div>
    </div>
  )
}

export default App
