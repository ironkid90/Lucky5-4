const API = '';
let token = sessionStorage.getItem('lucky5_token') || null;
let balance = 0;
let currentBet = 5000;
let machineId = 1;
let roundId = null;
let cards = [];
let holdIndexes = new Set();
let gameState = 'idle';
let winAmount = 0;
let machines = [];
let paytable = {};
let pressSound = null;
let duSwitchesRemaining = 0;
let duIsNoLoseActive = false;
let duSessionStarted = false;
let duDealerCard = null;
let jackpots = null;
let shuffleInterval = null;
let takeScoreAnimating = false;
let handsPlayed = 0;
let currentHandRank = null;
let jackpotRank = 14;
let active4kSlot = 0;
let machineSerial = 0;
let machineSerie = 1;
let machineKent = 1;
let hubConnection = null;
let machineJoined = false;

const MACHINE_CREDIT_LIMIT = 50000000;

const RANK_NAMES = {
    2: '2', 3: '3', 4: '4', 5: '5', 6: '6', 7: '7', 8: '8', 9: '9', 10: '10',
    11: 'J', 12: 'Q', 13: 'K', 14: 'A'
};

const JACKPOT_HANDS = ['FourOfAKind', 'FullHouse', 'StraightFlush'];

const HAND_DISPLAY = {
    'RoyalFlush': 'ROYAL FLUSH',
    'StraightFlush': 'STRAIGHT FLUSH',
    'FourOfAKind': '4 OF A KIND',
    'FullHouse': 'FULL HOUSE',
    'Flush': 'FLUSH',
    'Straight': 'STRAIGHT',
    'ThreeOfAKind': '3 OF A KIND',
    'TwoPair': '2 PAIR',
    'Nothing': 'NO WIN'
};

const CARD_BACK_SRC = '/assets/images/cards/bside.png';

const ALL_CARD_CODES = [];
(function buildCardCodes() {
    const suits = ['H','D','C','S'];
    const ranks = ['2','3','4','5','6','7','8','9','10','J','Q','K','A'];
    for (const r of ranks) {
        for (const s of suits) {
            ALL_CARD_CODES.push(r + s);
        }
    }
})();

const preloadedImages = {};

function preloadAllAssets() {
    return new Promise((resolve) => {
        const allPaths = [];

        ALL_CARD_CODES.forEach(code => {
            allPaths.push(`/assets/images/cards/${code}.png`);
        });
        allPaths.push(CARD_BACK_SRC);

        const buttonFiles = [
            'bet.png', 'bet_on.png', 'big.png', 'big_on.png',
            'small.png', 'small_on.png', 'deal_draw.png', 'deal_draw_on.png',
            'cancel_hold.png', 'cancel_hold_on.png', 'hold_off.png', 'hold_on.png',
            'take_half.png', 'take_half_on.png', 'take_score.png', 'take_score_on.png'
        ];
        buttonFiles.forEach(f => allPaths.push(`/assets/images/buttons/${f}`));

        allPaths.push('/assets/images/board.png');
        allPaths.push('/assets/images/lucky5.png');
        allPaths.push('/assets/images/coin.png');
        allPaths.push('/assets/images/splash.png');

        const total = allPaths.length;
        let loaded = 0;
        const fillEl = document.getElementById('loader-fill');
        const textEl = document.getElementById('loader-text');

        function onDone() {
            loaded++;
            const pct = Math.round((loaded / total) * 100);
            if (fillEl) fillEl.style.width = pct + '%';
            if (textEl) textEl.textContent = `LOADING ${loaded}/${total}`;
            if (loaded >= total) {
                const loader = document.getElementById('asset-loader');
                if (loader) {
                    loader.classList.add('done');
                    setTimeout(() => { loader.style.display = 'none'; }, 500);
                }
                resolve();
            }
        }

        allPaths.forEach(src => {
            const img = new Image();
            img.onload = onDone;
            img.onerror = onDone;
            img.src = src;
            preloadedImages[src] = img;
        });
    });
}

function randomCardSrc() {
    const code = ALL_CARD_CODES[Math.floor(Math.random() * ALL_CARD_CODES.length)];
    return `/assets/images/cards/${code}.png`;
}

function $(sel) { return document.querySelector(sel); }
function $$(sel) { return document.querySelectorAll(sel); }

async function apiCall(method, path, body) {
    const opts = {
        method,
        headers: { 'Content-Type': 'application/json' }
    };
    if (token) opts.headers['Authorization'] = `Bearer ${token}`;
    if (body) opts.body = JSON.stringify(body);
    const res = await fetch(`${API}${path}`, opts);
    const json = await res.json();
    if (!res.ok || json.status === 'error') {
        throw new Error(json.message || json.errors?.[0] || 'Request failed');
    }
    return json.data;
}

function playPress() {
    if (!pressSound) {
        pressSound = new Audio('/assets/sounds/press.mp3');
        pressSound.volume = 0.3;
    }
    pressSound.currentTime = 0;
    pressSound.play().catch(() => {});
}

function formatNum(n) {
    return Math.floor(n).toLocaleString();
}

function updateCredits() {
    $('#credits span').textContent = formatNum(balance);
}

function updateStakeDisplay() {
    $('#stake-display span').textContent = formatNum(currentBet);
}

function showMessage(text, type) {
    const msg = $('#game-message');
    msg.textContent = text;
    msg.className = type || '';
}

function updateWinIndicator(amount) {
    const el = $('#win-indicator');
    if (!el) return;
    if (amount > 0) {
        el.textContent = `WIN ${formatNum(amount)}`;
        el.classList.add('growing');
        setTimeout(() => el.classList.remove('growing'), 500);
    } else {
        el.textContent = '';
    }
}

function updatePaytable(activeHand) {
    $$('.pay-row').forEach(row => {
        const hand = row.dataset.hand;
        const mult = parseInt(row.querySelector('.pay-amount').dataset.mult) || 0;
        row.querySelector('.pay-amount').textContent = formatNum(mult * currentBet);
        row.classList.remove('active', 'du-highlight');
        if (activeHand && hand === activeHand) {
            row.classList.add('active');
        }
    });
}

function highlightPaytableDU(handRank, amount) {
    $$('.pay-row').forEach(row => {
        row.classList.remove('active', 'du-highlight');
        if (handRank && row.dataset.hand === handRank) {
            row.classList.add('du-highlight');
            row.querySelector('.pay-amount').textContent = formatNum(amount);
        }
    });
}

function updateJackpotDisplay(jp) {
    if (jp) {
        jackpots = jp;
        if (jp.fullHouseRank) jackpotRank = jp.fullHouseRank;
        if (jp.activeFourOfAKindSlot !== undefined) active4kSlot = jp.activeFourOfAKindSlot;
    }
    if (!jackpots) return;

    // New machine-info-block jackpot counters
    const jpA = document.querySelector('#jp-counter-a .jp-cval');
    const jpCenter = document.querySelector('#jp-counter-center .jp-cval');
    const jpB = document.querySelector('#jp-counter-b .jp-cval');
    if (jpA) jpA.textContent = formatNum(jackpots.fourOfAKindA || 0);
    if (jpCenter) jpCenter.textContent = formatNum(jackpots.fullHouse || 0);
    if (jpB) jpB.textContent = formatNum(jackpots.straightFlush || 0);

    // Machine serial (sum of jackpots as stand-in)
    const serialEl = document.getElementById('mi-serial');
    if (serialEl) {
        machineSerial = (jackpots.fourOfAKindA || 0) + (jackpots.fourOfAKindB || 0);
        serialEl.textContent = formatNum(machineSerial);
    }

    // Update Full House rank display (jackpot-selected highlight on paytable)
    const rankEl = document.getElementById('jp-fh-rank');
    if (rankEl) rankEl.textContent = RANK_NAMES[jackpotRank] || 'A';
    updateJackpotSelectedRow();
    updateActive4kHighlight();
    updateBonusHandText();

    // Legacy jackpot bar (if elements exist)
    const el4kA = document.getElementById('jp-4k-a-val');
    const el4kB = document.getElementById('jp-4k-b-val');
    const elFh = document.getElementById('jp-fh-val');
    const elSf = document.getElementById('jp-sf-val');
    if (el4kA) el4kA.textContent = formatNum(jackpots.fourOfAKindA || 0);
    if (el4kB) el4kB.textContent = formatNum(jackpots.fourOfAKindB || 0);
    if (elFh) elFh.textContent = formatNum(jackpots.fullHouse || 0);
    if (elSf) elSf.textContent = formatNum(jackpots.straightFlush || 0);
}

function updateActive4kHighlight() {
    const slots = $$('.jackpot-slot.jp-4k');
    slots.forEach((slot, i) => {
        if (i === active4kSlot) {
            slot.classList.add('jp-active');
        } else {
            slot.classList.remove('jp-active');
        }
    });
}

function updateJackpotSelectedRow() {
    // Show solid box around the active jackpot hand in paytable (like clone's FULL HOUSE highlight)
    document.querySelectorAll('.pay-row').forEach(row => row.classList.remove('jackpot-selected'));
    const fhRow = document.querySelector('.pay-row.fh');
    if (fhRow) fhRow.classList.add('jackpot-selected');
}

function updateBonusHandText() {
    const el = document.getElementById('bonus-hand-text');
    if (!el) return;
    if (active4kSlot === 0 || active4kSlot === 1) {
        el.textContent = '4  OF  A  KIND    WINS  BONUS';
    } else {
        el.textContent = '';
    }
}

function updateWinAmountDisplay(amount, slotTag) {
    const valEl = document.getElementById('win-amount-value');
    const tagEl = document.getElementById('win-slot-tag');
    const container = document.getElementById('win-amount-display');
    if (!valEl || !container) return;
    if (amount > 0) {
        valEl.textContent = formatNum(amount);
        if (tagEl) tagEl.textContent = slotTag || '';
        container.classList.add('visible');
    } else {
        valEl.textContent = '';
        if (tagEl) tagEl.textContent = '';
        container.classList.remove('visible');
    }
}

function updateBonusBar(handRank, jackpotWon) {
    const el = document.getElementById('bonus-text');
    const handTextEl = document.getElementById('bonus-hand-text');
    if (jackpotWon > 0) {
        if (el) el.textContent = `JACKPOT WON! +${formatNum(jackpotWon)}`;
        if (handTextEl) handTextEl.textContent = `JACKPOT WON! +${formatNum(jackpotWon)}`;
    } else if (handRank && JACKPOT_HANDS.includes(handRank)) {
        const msg = handRank === 'FullHouse'
            ? `FH ${RANK_NAMES[jackpotRank]} JACKPOT`
            : `${HAND_DISPLAY[handRank]} JACKPOT`;
        if (el) el.textContent = msg;
    } else {
        if (el) el.textContent = '';
        updateBonusHandText();
    }
}

function cardImagePath(card) {
    if (!card || !card.code) return CARD_BACK_SRC;
    return `/assets/images/cards/${card.code}.png`;
}

function showIdleTitle() {
    const area = $('#card-area');
    area.innerHTML = '';
    area.classList.remove('du-mode');
    const title = document.createElement('div');
    title.className = 'idle-title';
    title.innerHTML = '<span class="idle-lucky">LUCKY</span><span class="idle-poker">POKER</span>';
    area.appendChild(title);
}

function hideIdleTitle() {
    const area = $('#card-area');
    const title = area.querySelector('.idle-title');
    if (title) title.remove();
}

function renderCards(cardData, animate) {
    const area = $('#card-area');
    area.innerHTML = '';
    area.classList.remove('du-mode');
    for (let i = 0; i < 5; i++) {
        const slot = document.createElement('div');
        slot.className = 'card-slot';
        if (holdIndexes.has(i)) slot.classList.add('held');

        if (animate) {
            slot.classList.add('deal-in');
        }

        const badge = document.createElement('div');
        badge.className = 'hold-badge';
        badge.textContent = 'HOLD';

        const cardImg = document.createElement('div');
        cardImg.className = 'card-face';
        cardImg.innerHTML = `<img src="${cardImagePath(cardData[i])}" alt="card">`;

        slot.appendChild(cardImg);
        slot.appendChild(badge);

        slot.addEventListener('click', () => toggleHold(i));
        area.appendChild(slot);

        if (animate) {
            setTimeout(() => {
                slot.classList.remove('deal-in');
                slot.classList.add('deal-in-done');
            }, 100 + i * 180);
        } else {
            slot.classList.add('deal-in-done');
        }
    }
}

function flashWinCards() {
    $$('.card-slot').forEach(slot => slot.classList.add('winning'));
}

function toggleHold(index) {
    if (gameState !== 'hold') return;
    playPress();
    if (holdIndexes.has(index)) {
        holdIndexes.delete(index);
    } else {
        holdIndexes.add(index);
    }
    const slots = $$('.card-slot');
    slots[index].classList.toggle('held', holdIndexes.has(index));

    const holdBtns = $$('.cab-hold');
    holdBtns[index].classList.toggle('active', holdIndexes.has(index));
}

function cycleJackpotRank() {
    jackpotRank = jackpotRank >= 14 ? 2 : jackpotRank + 1;

    apiCall('POST', '/api/Game/jackpot/rank', { machineId, rank: jackpotRank })
        .then(jp => updateJackpotDisplay(jp))
        .catch(() => {});

    const elRank = $('#jp-fh-rank');
    if (elRank) elRank.textContent = RANK_NAMES[jackpotRank] || 'A';
}

function setButtonStates() {
    const betBtn = $('#btn-bet');
    const dealBtn = $('#btn-deal');
    const cancelBtn = $('#btn-cancel');
    const holdBtns = $$('.cab-hold');
    const bigBtn = $('#btn-big');
    const smallBtn = $('#btn-small');
    const takeScoreBtn = $('#btn-take-score');
    const takeHalfBtn = $('#btn-take-half');

    if (takeScoreAnimating) {
        betBtn.disabled = true;
        dealBtn.disabled = true;
        cancelBtn.disabled = true;
        bigBtn.disabled = true;
        smallBtn.disabled = true;
        takeScoreBtn.disabled = true;
        takeHalfBtn.disabled = true;
        holdBtns.forEach(btn => btn.disabled = true);
        return;
    }

    betBtn.disabled = !(gameState === 'idle' || gameState === 'doubleup');
    dealBtn.disabled = !(gameState === 'idle' || gameState === 'hold');
    cancelBtn.disabled = gameState !== 'hold';
    bigBtn.disabled = !(gameState === 'doubleup' || gameState === 'win');
    smallBtn.disabled = !(gameState === 'doubleup' || gameState === 'win');
    takeScoreBtn.disabled = !(gameState === 'win' || gameState === 'doubleup');
    takeHalfBtn.disabled = !(gameState === 'win' || gameState === 'doubleup');

    holdBtns.forEach((btn, i) => {
        if (gameState === 'idle' && betResetPending && i === 0) {
            btn.disabled = false;
        } else {
            btn.disabled = gameState !== 'hold';
        }
    });
}

let betResetPending = false;

async function doBet() {
    if (gameState === 'doubleup') {
        await doSwitchDealer();
        return;
    }
    if (gameState !== 'idle') return;
    playPress();
    const machine = machines.find(m => m.id === machineId);
    if (!machine) return;
    if (betResetPending) {
        currentBet = machine.minBet;
        betResetPending = false;
    } else if (currentBet >= machine.maxBet) {
        currentBet = machine.maxBet;
    } else {
        currentBet = Math.min(currentBet + 100, machine.maxBet);
    }
    updateStakeDisplay();
    updatePaytable();
}

async function doSwitchDealer() {
    if (gameState !== 'doubleup' || duSwitchesRemaining <= 0) return;
    playPress();
    stopShuffle();

    try {
        const result = await apiCall('POST', '/api/Game/double-up/switch', { roundId });
        duSwitchesRemaining = result.switchesRemaining;
        duIsNoLoseActive = result.isNoLoseActive;
        winAmount = result.currentAmount;
        duDealerCard = result.dealerCard;

        const isLucky5 = result.status === 'Lucky5';
        if (isLucky5) {
            triggerLucky5Flash();
        }

        renderDoubleUpCards(duDealerCard, true, null);
        if (isLucky5) {
            showMessage(`5\u2660 LUCKY 5 ACTIVE! WIN: ${formatNum(result.currentAmount)}`, 'win');
        } else {
            showMessage(`SWITCHED - WIN: ${formatNum(result.currentAmount)} (${duSwitchesRemaining} left)`, 'win');
        }
        setButtonStates();
    } catch (e) {
        showMessage(e.message, 'lose');
    }
}

function triggerLucky5Flash() {
    const banner = document.getElementById('lucky5-banner');
    if (banner) banner.classList.add('active');
    const flash = document.getElementById('lucky5-flash');
    if (flash) {
        flash.classList.remove('active');
        void flash.offsetWidth;
        flash.classList.add('active');
    }
}

function computeAutoHold(cardList) {
    if (!cardList || cardList.length !== 5) return new Set();

    const parsed = cardList.map((c, i) => {
        if (!c || !c.code) return null;
        const code = c.code;
        let rankStr, suit;
        if (code.length === 3) {
            rankStr = code.substring(0, 2);
            suit = code[2];
        } else {
            rankStr = code[0];
            suit = code[1];
        }
        const rankMap = { 'A': 14, 'K': 13, 'Q': 12, 'J': 11 };
        const rank = rankMap[rankStr] || parseInt(rankStr);
        return { rank, suit, index: i };
    }).filter(Boolean);

    if (parsed.length !== 5) return new Set();

    const rankGroups = {};
    parsed.forEach(c => {
        if (!rankGroups[c.rank]) rankGroups[c.rank] = [];
        rankGroups[c.rank].push(c.index);
    });

    const suitGroups = {};
    parsed.forEach(c => {
        if (!suitGroups[c.suit]) suitGroups[c.suit] = [];
        suitGroups[c.suit].push(c);
    });

    const pairs = Object.entries(rankGroups).filter(([, v]) => v.length === 2);
    const trips = Object.entries(rankGroups).filter(([, v]) => v.length === 3);
    const quads = Object.entries(rankGroups).filter(([, v]) => v.length === 4);

    if (quads.length > 0) {
        const hold = new Set(quads[0][1]);
        return hold;
    }

    if (trips.length > 0 && pairs.length > 0) {
        const hold = new Set([...trips[0][1], ...pairs[0][1]]);
        return hold;
    }

    const flushSuit = Object.entries(suitGroups).find(([, v]) => v.length === 5);
    if (flushSuit) {
        return new Set([0, 1, 2, 3, 4]);
    }

    const sortedRanks = parsed.map(c => c.rank).sort((a, b) => a - b);
    const uniqueRanks = [...new Set(sortedRanks)];
    if (uniqueRanks.length === 5) {
        const isStraight = (uniqueRanks[4] - uniqueRanks[0] === 4) ||
            (uniqueRanks[0] === 2 && uniqueRanks[3] === 5 && uniqueRanks[4] === 14);
        if (isStraight) {
            return new Set([0, 1, 2, 3, 4]);
        }
    }

    if (trips.length > 0) {
        return new Set(trips[0][1]);
    }

    if (pairs.length >= 2) {
        const hold = new Set([...pairs[0][1], ...pairs[1][1]]);
        return hold;
    }

    const flush4 = Object.entries(suitGroups).find(([, v]) => v.length === 4);
    if (flush4) {
        return new Set(flush4[1].map(c => c.index));
    }

    function findStraight4(cards) {
        const sorted = [...cards].sort((a, b) => a.rank - b.rank);
        for (let i = 0; i <= sorted.length - 4; i++) {
            const window4 = sorted.slice(i, i + 4);
            const uRanks = [...new Set(window4.map(c => c.rank))];
            if (uRanks.length === 4 && (uRanks[3] - uRanks[0] <= 4)) {
                return new Set(window4.map(c => c.index));
            }
        }
        const hasAce = sorted.find(c => c.rank === 14);
        if (hasAce) {
            const lowCards = sorted.filter(c => c.rank >= 2 && c.rank <= 5);
            if (lowCards.length >= 3) {
                const combo = [hasAce, ...lowCards.slice(0, 3)];
                const uRanks = [...new Set(combo.map(c => c.rank))];
                if (uRanks.length === 4) {
                    return new Set(combo.map(c => c.index));
                }
            }
        }
        return null;
    }

    const straight4 = findStraight4(parsed);
    if (straight4) {
        return straight4;
    }

    if (pairs.length === 1) {
        return new Set(pairs[0][1]);
    }

    return new Set();
}

function applyAutoHold(cardList) {
    const autoHolds = computeAutoHold(cardList);
    if (autoHolds.size === 0) return;

    holdIndexes = autoHolds;
    const slots = $$('.card-slot');
    const holdBtns = $$('.cab-hold');
    autoHolds.forEach(i => {
        if (slots[i]) slots[i].classList.add('held');
        if (holdBtns[i]) holdBtns[i].classList.add('active');
    });
}

function applyServerAdvisedHolds(advisedArray) {
    if (!advisedArray || advisedArray.length === 0) return;

    holdIndexes = new Set(advisedArray);
    const slots = $$('.card-slot');
    const holdBtns = $$('.cab-hold');
    advisedArray.forEach(i => {
        if (slots[i]) slots[i].classList.add('held');
        if (holdBtns[i]) holdBtns[i].classList.add('active');
    });
}

async function doDeal() {
    if (gameState === 'idle') {
        if (!machineJoined) {
            await joinMachine(machineId);
            if (!machineJoined) {
                showMessage('MACHINE NOT READY - TRY AGAIN', 'lose');
                return;
            }
        }
        if (balance < currentBet) {
            showMessage('NOT ENOUGH CREDITS', 'lose');
            return;
        }
        playPress();
        gameState = 'dealing';
        setButtonStates();
        showMessage('DEALING...');
        updateBonusBar(null);
        updateWinIndicator(0);
        hideDuInfo();
        hideIdleTitle();

        try {
            const result = await apiCall('POST', '/api/Game/cards/deal', {
                machineId,
                betAmount: currentBet
            });
            roundId = result.roundId;
            cards = result.cards;
            balance = result.walletBalanceAfterBet;
            if (result.jackpots) updateJackpotDisplay(result.jackpots);
            updateCredits();
            updateWinAmountDisplay(0);
            holdIndexes.clear();
            renderCards(cards, true);
            $$('.cab-hold').forEach(btn => btn.classList.remove('active'));
            gameState = 'hold';

            const serverHolds = result.advisedHolds;

            setTimeout(() => {
                if (serverHolds && serverHolds.length > 0) {
                    applyServerAdvisedHolds(serverHolds);
                } else {
                    applyAutoHold(cards);
                }
                setButtonStates();
                if (holdIndexes.size > 0) {
                    showMessage('AUTO-HOLD SUGGESTED - DRAW OR ADJUST');
                } else {
                    showMessage('PRESS HOLDS TO KEEP CARD');
                }
            }, 80 + 5 * 100 + 150);
        } catch (e) {
            showMessage(e.message, 'lose');
            gameState = 'idle';
            setButtonStates();
            showIdleTitle();
        }
    } else if (gameState === 'hold') {
        if (balance < currentBet) {
            showMessage('NOT ENOUGH CREDITS FOR DRAW', 'lose');
            return;
        }
        playPress();
        gameState = 'drawing';
        setButtonStates();
        showMessage('DRAWING...');

        try {
            const result = await apiCall('POST', '/api/Game/cards/draw', {
                roundId,
                holdIndexes: Array.from(holdIndexes)
            });
            cards = result.cards;
            winAmount = result.winAmount;
            balance = result.walletBalanceAfterRound - winAmount;
            if (result.jackpots) updateJackpotDisplay(result.jackpots);
            updateCredits();

            renderCards(cards, false);
            setTimeout(() => {
                let dropDelay = 0;
                $$('.card-slot').forEach((slot, i) => {
                    if (!holdIndexes.has(i)) {
                        slot.classList.remove('deal-in-done');
                        slot.classList.add('deal-in');
                        setTimeout(() => {
                            const face = slot.querySelector('.card-face img');
                            if (face) face.src = cardImagePath(cards[i]);
                            slot.classList.remove('deal-in');
                            slot.classList.add('deal-in-done');
                        }, 100 + dropDelay);
                        dropDelay += 180;
                    }
                });
            }, 60);

            setTimeout(() => {
                const handName = result.handRank || 'Nothing';
                currentHandRank = handName !== 'Nothing' ? handName : null;
                updatePaytable(currentHandRank);
                handsPlayed++;
                betResetPending = true;

                if (winAmount > 0) {
                    const jackpotWon = result.jackpotWon || 0;
                    let msg = `${HAND_DISPLAY[handName] || handName} - WIN ${formatNum(winAmount)}!`;
                    if (jackpotWon > 0) {
                        msg += ` JACKPOT +${formatNum(jackpotWon)}!`;
                    }
                    showMessage(msg, 'win');
                    flashWinCards();
                    updateBonusBar(handName, result.jackpotWon);
                    updateWinIndicator(winAmount);
                    updateWinAmountDisplay(winAmount, active4kSlot === 0 ? 'A' : 'B');
                    gameState = 'win';
                    setButtonStates();

                    setTimeout(() => {
                        if (gameState === 'win') {
                            startDoubleUpFlow();
                        }
                    }, 1000);
                } else {
                    showMessage(HAND_DISPLAY[handName] || 'NO WIN', 'lose');
                    gameState = 'idle';
                    setButtonStates();
                    updatePaytable();
                    updateWinAmountDisplay(0);
                    setTimeout(() => {
                        if (gameState === 'idle') showIdleTitle();
                    }, 2000);
                }
            }, 500);
        } catch (e) {
            showMessage(e.message, 'lose');
            gameState = 'idle';
            setButtonStates();
        }
    }
}

function cancelHold() {
    if (gameState !== 'hold') return;
    playPress();
    holdIndexes.clear();
    $$('.card-slot').forEach(s => s.classList.remove('held'));
    $$('.cab-hold').forEach(btn => btn.classList.remove('active'));
}

function showDuInfo() {
    $('#du-info-panel').classList.add('visible');
}

function hideDuInfo() {
    $('#du-info-panel').classList.remove('visible');
}

function renderDoubleUpCards(dealerCard, showShuffle, challengerCard) {
    const area = $('#card-area');
    area.innerHTML = '';
    area.classList.add('du-mode');

    stopShuffle();

    const dealerSlot = document.createElement('div');
    dealerSlot.className = 'du-card-slot';
    const dealerLabel = document.createElement('div');
    dealerLabel.className = 'du-card-label';
    dealerLabel.textContent = 'DEALER';
    const dealerFrame = document.createElement('div');
    dealerFrame.className = 'du-card-frame dealer-card';
    const isLucky = dealerCard && dealerCard.code === '5S';
    if (isLucky) dealerFrame.classList.add('lucky5-glow');
    dealerFrame.innerHTML = `<img src="${cardImagePath(dealerCard)}" alt="dealer">`;
    dealerSlot.appendChild(dealerLabel);
    dealerSlot.appendChild(dealerFrame);
    area.appendChild(dealerSlot);

    const spacer = document.createElement('div');
    spacer.className = 'du-spacer';
    area.appendChild(spacer);

    if (challengerCard) {
        const challSlot = document.createElement('div');
        challSlot.className = 'du-card-slot slide-in-done';
        const challLabel = document.createElement('div');
        challLabel.className = 'du-card-label';
        challLabel.textContent = '';
        const challFrame = document.createElement('div');
        challFrame.className = 'du-card-frame';
        const challLucky = challengerCard.code === '5S';
        if (challLucky) challFrame.classList.add('lucky5-glow');
        challFrame.innerHTML = `<img src="${cardImagePath(challengerCard)}" alt="result">`;
        challSlot.appendChild(challLabel);
        challSlot.appendChild(challFrame);
        area.appendChild(challSlot);
    } else if (showShuffle) {
        const challSlot = document.createElement('div');
        challSlot.className = 'du-card-slot';
        challSlot.id = 'du-shuffle-slot';
        const challLabel = document.createElement('div');
        challLabel.className = 'du-card-label';
        challLabel.textContent = 'BIG / SMALL ?';
        const challFrame = document.createElement('div');
        challFrame.className = 'du-card-frame';
        challFrame.id = 'du-shuffle-frame';
        challFrame.innerHTML = `<img src="${CARD_BACK_SRC}" alt="card">`;
        challSlot.appendChild(challLabel);
        challSlot.appendChild(challFrame);
        area.appendChild(challSlot);
        startShuffle();
    }
}

let shuffleRAF = null;
let shuffleLastTime = 0;

function startShuffle() {
    stopShuffle();
    shuffleLastTime = 0;
    const frame = document.getElementById('du-shuffle-frame');
    if (frame) frame.classList.add('du-flip-in');

    function tick(ts) {
        if (ts - shuffleLastTime >= 120) {
            shuffleLastTime = ts;
            const f = document.querySelector('#du-shuffle-frame img');
            if (f) {
                const frame = document.getElementById('du-shuffle-frame');
                if (frame) {
                    frame.classList.remove('du-flip-in');
                    frame.classList.add('du-flip-out');
                    setTimeout(() => {
                        f.src = randomCardSrc();
                        frame.classList.remove('du-flip-out');
                        frame.classList.add('du-flip-in');
                    }, 60);
                }
            }
        }
        shuffleRAF = requestAnimationFrame(tick);
    }
    shuffleRAF = requestAnimationFrame(tick);
}

function stopShuffle() {
    if (shuffleRAF) {
        cancelAnimationFrame(shuffleRAF);
        shuffleRAF = null;
    }
    if (shuffleInterval) {
        clearInterval(shuffleInterval);
        shuffleInterval = null;
    }
}

async function startDoubleUpFlow() {
    if (gameState !== 'win') return;

    try {
        const result = await apiCall('POST', '/api/Game/double-up/start', { roundId });
        duSessionStarted = true;
        duSwitchesRemaining = result.switchesRemaining;
        duIsNoLoseActive = result.isNoLoseActive;
        duDealerCard = result.dealerCard;
        gameState = 'doubleup';

        showDuInfo();
        if (result.isNoLoseActive) {
            triggerLucky5Flash();
            showMessage(`5\u2660 LUCKY 5 ACTIVE! DOUBLE UP: ${formatNum(result.currentAmount)}`, 'win');
        } else {
            showMessage(`DOUBLE UP - WIN: ${formatNum(result.currentAmount)}`, 'win');
        }
        updateWinAmountDisplay(result.currentAmount, active4kSlot === 0 ? 'A' : 'B');
        updateWinIndicator(result.currentAmount);
        if (currentHandRank) highlightPaytableDU(currentHandRank, result.currentAmount);
        renderDoubleUpCards(duDealerCard, true, null);
        setButtonStates();
    } catch (e) {
        showMessage(e.message, 'lose');
    }
}

async function doDoubleUp(guess) {
    if (gameState !== 'doubleup') return;
    playPress();
    gameState = 'du-waiting';
    setButtonStates();
    showMessage('FLIPPING...', '');

    stopShuffle();

    try {
        const result = await apiCall('POST', '/api/Game/double-up/guess', { roundId, guess });

        setTimeout(() => {
            renderDoubleUpCards(duDealerCard, false, result.challengerCard);

            if (result.status === 'Win') {
                winAmount = result.currentAmount;
                updateCredits();
                updateWinIndicator(winAmount);
                updateWinAmountDisplay(winAmount, active4kSlot === 0 ? 'A' : 'B');
                if (currentHandRank) highlightPaytableDU(currentHandRank, winAmount);
                showMessage(`WIN! ${formatNum(winAmount)} - DOUBLE AGAIN?`, 'win');
                gameState = 'doubleup';

                setTimeout(() => {
                    if (gameState === 'doubleup') {
                        duDealerCard = result.dealerCard;
                        renderDoubleUpCards(duDealerCard, true, null);
                        duSwitchesRemaining = result.switchesRemaining;
                        duIsNoLoseActive = false;
                        setButtonStates();
                    }
                }, 900);
            } else if (result.status === 'SafeFail') {
                triggerLucky5Flash();
                winAmount = result.currentAmount;
                balance = result.walletBalance - winAmount;
                updateCredits();
                updateWinIndicator(winAmount);
                updateWinAmountDisplay(winAmount, active4kSlot === 0 ? 'A' : 'B');
                showMessage(`SAFE! 5\u2660 SAVED ${formatNum(winAmount)}`, 'win');
                gameState = 'win';
                setTimeout(() => exitDoubleUp(), 1200);
            } else if (result.status === 'MachineClosed') {
                winAmount = result.currentAmount;
                balance = result.walletBalance - winAmount;
                updateCredits();
                updateWinIndicator(winAmount);
                updateWinAmountDisplay(winAmount, active4kSlot === 0 ? 'A' : 'B');
                showMessage('MACHINE CLOSED - MAX CREDITS!', 'win');
                gameState = 'win';
                setTimeout(() => exitDoubleUp(), 1200);
            } else {
                winAmount = 0;
                balance = result.walletBalance;
                updateCredits();
                updateWinIndicator(0);
                updateWinAmountDisplay(0);
                showMessage('YOU LOSE!', 'lose');
                setTimeout(() => exitDoubleUp(), 1000);
            }
            setButtonStates();
        }, 400);
    } catch (e) {
        showMessage(e.message, 'lose');
        setTimeout(() => exitDoubleUp(), 1500);
    }
}

function exitDoubleUp() {
    stopShuffle();
    hideDuInfo();
    duSessionStarted = false;
    duIsNoLoseActive = false;
    duDealerCard = null;
    $('#lucky5-flash').classList.remove('active');
    const banner = document.getElementById('lucky5-banner');
    if (banner) banner.classList.remove('active');
    updateWinAmountDisplay(0);

    if (winAmount > 0) {
        gameState = 'win';
        setButtonStates();
        showMessage(`WIN: ${formatNum(winAmount)} - TAKE OR DOUBLE`, 'win');
        showIdleTitle();
    } else {
        currentHandRank = null;
        gameState = 'idle';
        setButtonStates();
        updatePaytable();
        updateBonusBar(null);
        updateWinIndicator(0);
        showMessage('PLACE YOUR BET');
        showIdleTitle();
    }
}

function animateDrainToCredits(amount, startBalance) {
    return new Promise((resolve) => {
        takeScoreAnimating = true;
        setButtonStates();

        const totalDuration = Math.min(5000, Math.max(1500, amount / 500000 * 4000));
        const creditsEl = $('#credits');
        const creditsSpan = $('#credits span');
        const winEl = $('#win-indicator');
        const msgEl = $('#game-message');
        let startTime = null;

        let lastTickToggle = 0;

        function frame(ts) {
            if (!startTime) startTime = ts;
            const elapsed = ts - startTime;
            const progress = Math.min(elapsed / totalDuration, 1);
            const credited = Math.floor(amount * progress);
            const remaining = amount - credited;

            balance = startBalance + credited;
            creditsSpan.textContent = formatNum(balance);

            if (ts - lastTickToggle > 120) {
                lastTickToggle = ts;
                creditsEl.classList.toggle('credit-ticking');
            }

            if (remaining > 0) {
                winEl.textContent = `WIN ${formatNum(remaining)}`;
            } else {
                winEl.textContent = '';
            }

            if (msgEl) {
                msgEl.textContent = `COLLECTING... ${formatNum(credited)} / ${formatNum(amount)}`;
                msgEl.className = 'win';
            }

            if (progress < 1) {
                requestAnimationFrame(frame);
            } else {
                balance = startBalance + amount;
                updateCredits();
                winEl.textContent = '';
                creditsEl.classList.remove('credit-ticking');
                takeScoreAnimating = false;
                resolve();
            }
        }

        requestAnimationFrame(frame);
    });
}

async function mainTakeScore() {
    if (!(gameState === 'win' || gameState === 'doubleup') || takeScoreAnimating) return;
    playPress();
    stopShuffle();
    hideDuInfo();
    duSessionStarted = false;
    const bannerEl = document.getElementById('lucky5-banner');
    if (bannerEl) bannerEl.classList.remove('active');
    const flashEl = document.getElementById('lucky5-flash');
    if (flashEl) flashEl.classList.remove('active');

    const amount = winAmount;
    winAmount = 0;

    gameState = 'idle';
    updatePaytable();
    updateBonusBar(null);
    updateWinAmountDisplay(0);
    currentHandRank = null;
    showIdleTitle();

    try {
        const result = await apiCall('POST', '/api/Game/double-up/cashout', { roundId });
        const cashoutAmount = result.currentAmount;

        await animateDrainToCredits(cashoutAmount, balance);
        balance = result.walletBalance;
        updateCredits();
    } catch (e) {
        balance += amount;
        updateCredits();
    }

    setButtonStates();
    showMessage('PLACE YOUR BET');
}

async function mainTakeHalf() {
    if (!(gameState === 'win' || gameState === 'doubleup') || takeScoreAnimating) return;
    playPress();

    const wasInDoubleUp = gameState === 'doubleup';

    try {
        const result = await apiCall('POST', '/api/Game/double-up/take-half', { roundId });
        const half = Math.floor(winAmount / 2);
        const preBalance = balance;

        await animateDrainToCredits(half, preBalance);

        balance = result.walletBalance;
        updateCredits();
        winAmount = result.currentAmount;
        updateWinIndicator(winAmount);

        if (winAmount <= 0) {
            stopShuffle();
            hideDuInfo();
            duSessionStarted = false;
            const b = document.getElementById('lucky5-banner');
            if (b) b.classList.remove('active');
            const f = document.getElementById('lucky5-flash');
            if (f) f.classList.remove('active');
            currentHandRank = null;
            gameState = 'idle';
            setButtonStates();
            updatePaytable();
            updateBonusBar(null);
            updateWinAmountDisplay(0);
            showMessage('PLACE YOUR BET');
            showIdleTitle();
        } else {
            showMessage(`${formatNum(winAmount)} REMAINS - DOUBLE UP!`, 'win');
            if (currentHandRank) highlightPaytableDU(currentHandRank, winAmount);

            if (wasInDoubleUp && duSessionStarted) {
                gameState = 'doubleup';
                setButtonStates();
            } else {
                gameState = 'win';
                setButtonStates();
                setTimeout(() => {
                    if (gameState === 'win') {
                        startDoubleUpFlow();
                    }
                }, 800);
            }
        }
    } catch (e) {
        showMessage(e.message, 'lose');
    }
}

function duTakeScore() {
    mainTakeScore();
}

function duTakeHalf() {
    mainTakeHalf();
}

async function doLogin(username, password) {
    const res = await fetch(`${API}/api/Auth/login`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ username, password })
    });
    const json = await res.json();
    if (!res.ok || json.status === 'error') {
        throw new Error(json.message || 'Login failed');
    }
    return json.data;
}

async function doSignup(username, password) {
    const res = await fetch(`${API}/api/Auth/signup`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ username, password, phoneNumber: '0000000000' })
    });
    const json = await res.json();
    if (!res.ok || json.status === 'error') {
        throw new Error(json.message || 'Signup failed');
    }
    return json.data;
}

async function doVerifyOtp(username) {
    await fetch(`${API}/api/Auth/verify-otp`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ username, otpCode: '123456' })
    });
}

function storeToken(t) {
    token = t;
    sessionStorage.setItem('lucky5_token', t);
}

function clearToken() {
    token = null;
    sessionStorage.removeItem('lucky5_token');
}

async function setupSignalR() {
    if (!token) return;
    if (hubConnection) {
        try { await hubConnection.stop(); } catch (_) {}
    }
    hubConnection = new signalR.HubConnectionBuilder()
        .withUrl(`${API}/CarrePokerGameHub`, { accessTokenFactory: () => token })
        .withAutomaticReconnect()
        .build();

    hubConnection.on('MachineStateUpdated', (state) => {
        if (state && state.jackpots) {
            updateJackpotDisplay(state.jackpots);
        }
    });

    hubConnection.on('Error', (err) => {
        console.error('SignalR error:', err);
    });

    hubConnection.onreconnected(async () => {
        if (machineId > 0) {
            try { await hubConnection.invoke('JoinMachine', machineId); } catch (_) {}
        }
    });

    try {
        await hubConnection.start();
    } catch (e) {
        console.error('SignalR connection failed:', e);
    }
}

function isHubConnected() {
    if (!hubConnection) return false;
    if (typeof signalR !== 'undefined' && signalR.HubConnectionState) {
        return hubConnection.state === signalR.HubConnectionState.Connected;
    }
    return hubConnection.state === 'Connected';
}

async function joinMachine(id) {
    if (!isHubConnected()) return;
    try {
        await hubConnection.invoke('JoinMachine', id);
        machineJoined = true;
    } catch (e) {
        console.error('JoinMachine failed:', e);
        machineJoined = false;
    }
}

async function leaveMachine(id) {
    if (!isHubConnected()) return;
    try {
        await hubConnection.invoke('LeaveMachine', id);
        machineJoined = false;
    } catch (_) {}
}

async function doLogout() {
    if (machineJoined && machineId > 0) {
        await leaveMachine(machineId);
    }
    if (hubConnection) {
        try { await hubConnection.stop(); } catch (_) {}
        hubConnection = null;
    }
    machineJoined = false;
    clearToken();
    gameState = 'idle';
    balance = 0;
    winAmount = 0;
    roundId = null;
    $('#game-screen').classList.remove('active');
    $('#auth-screen').style.display = '';
    $('#auth-error').textContent = '';
}

async function addDemoCredits() {
    try {
        await apiCall('POST', '/api/Auth/UpdateCredit', {
            amount: 200000,
            reference: 'demo-deposit',
            direction: 'Credit'
        });
        const profile = await apiCall('GET', '/api/Auth/GetUserById');
        balance = profile.walletBalance;
        updateCredits();
    } catch (e) {
        console.error('Failed to add credits:', e);
    }
}

async function initGame() {
    try {
        const [machineData, rulesData] = await Promise.all([
            apiCall('GET', '/api/Game/games/machines'),
            apiCall('GET', '/api/Game/defaultRules')
        ]);
        machines = machineData;
        paytable = rulesData.payoutMultipliers;
        if (machines.length > 0) {
            machineId = machines[0].id;
            currentBet = machines[0].minBet;
        }

        const profile = await apiCall('GET', '/api/Auth/GetUserById');
        balance = profile.walletBalance;

        if (balance <= 0) {
            await addDemoCredits();
        }

        updateCredits();
        updateStakeDisplay();
        updatePaytable();
        updateJackpotSelectedRow();
        updateBonusHandText();
        showMessage('PLACE YOUR BET');
        gameState = 'idle';
        setButtonStates();

        showIdleTitle();

        try {
            const machineState = await apiCall('GET', `/api/Game/machine/${machineId}/state`);
            if (machineState && machineState.jackpots) {
                updateJackpotDisplay(machineState.jackpots);
            }
        } catch (e) {}

        await setupSignalR();
        await joinMachine(machineId);

    } catch (e) {
        showMessage('Error: ' + e.message, 'lose');
    }
}

document.addEventListener('DOMContentLoaded', () => {
    const authBtn = $('#auth-submit');
    authBtn.disabled = true;
    authBtn.textContent = 'LOADING...';

    let assetsReady = false;
    preloadAllAssets().then(() => {
        assetsReady = true;
        authBtn.disabled = false;
        authBtn.textContent = 'LOGIN';
    });

    const authScreen = $('#auth-screen');
    const authError = $('#auth-error');
    const authToggle = $('#auth-toggle');
    let isLogin = true;

    authToggle.addEventListener('click', () => {
        isLogin = !isLogin;
        $('#auth-title').textContent = isLogin ? 'LOGIN' : 'SIGN UP';
        authBtn.textContent = isLogin ? 'LOGIN' : 'SIGN UP';
        authToggle.innerHTML = isLogin
            ? '<span class="auth-toggle-label">NO ACCOUNT?</span> <span>SIGN UP</span>'
            : '<span class="auth-toggle-label">HAVE ACCOUNT?</span> <span>LOGIN</span>';
        authError.textContent = '';
    });

    authBtn.addEventListener('click', async () => {
        if (!assetsReady) {
            authError.textContent = 'Assets still loading, please wait';
            return;
        }
        const username = $('#auth-username').value.trim();
        const password = $('#auth-password').value.trim();
        if (!username || !password) {
            authError.textContent = 'Fill in all fields';
            return;
        }
        authError.textContent = '';
        authBtn.disabled = true;
        authBtn.textContent = 'LOADING...';

        try {
            if (isLogin) {
                const data = await doLogin(username, password);
                storeToken(data.tokens.accessToken);
                balance = data.profile.walletBalance;
            } else {
                await doSignup(username, password);
                await doVerifyOtp(username);
                const data = await doLogin(username, password);
                storeToken(data.tokens.accessToken);
                balance = data.profile.walletBalance;
            }
            authScreen.style.display = 'none';
            $('#game-screen').classList.add('active');
            await initGame();
        } catch (e) {
            authError.textContent = e.message;
            authBtn.disabled = false;
            authBtn.textContent = isLogin ? 'LOGIN' : 'SIGN UP';
        }
    });

    $('#btn-bet').addEventListener('click', doBet);
    $('#btn-deal').addEventListener('click', doDeal);
    $('#btn-cancel').addEventListener('click', cancelHold);
    $('#btn-take-score').addEventListener('click', () => {
        if (gameState === 'doubleup') duTakeScore();
        else mainTakeScore();
    });
    $('#btn-take-half').addEventListener('click', () => {
        if (gameState === 'doubleup') duTakeHalf();
        else mainTakeHalf();
    });

    $$('.cab-hold').forEach(btn => {
        btn.addEventListener('click', () => {
            const idx = parseInt(btn.dataset.index);
            if (gameState === 'idle' && idx === 0 && betResetPending) {
                cycleJackpotRank();
                return;
            }
            toggleHold(idx);
        });
    });

    $('#btn-big').addEventListener('click', () => {
        if (gameState === 'win') {
            startDoubleUpFlow();
        } else if (gameState === 'doubleup') {
            doDoubleUp('Big');
        }
    });
    $('#btn-small').addEventListener('click', () => {
        if (gameState === 'win') {
            startDoubleUpFlow();
        } else if (gameState === 'doubleup') {
            doDoubleUp('Small');
        }
    });

    const menuBtn = $('#btn-menu');
    const menuPanel = $('#menu-panel');
    if (menuBtn && menuPanel) {
        menuBtn.addEventListener('click', () => {
            if (gameState === 'idle' || gameState === 'win' || gameState === 'doubleup') {
                menuPanel.style.display = 'flex';
            }
        });
        $('#btn-close-menu').addEventListener('click', () => {
            menuPanel.style.display = 'none';
        });
        $('#btn-logout-menu').addEventListener('click', () => {
            menuPanel.style.display = 'none';
            doLogout();
        });
        $('#btn-reset-machine').addEventListener('click', async () => {
            if (!confirm('Reset machine? Your credits will be set back to 200,000 and the machine state will be cleared.')) return;
            try {
                await apiCall('POST', `/api/Game/machine/${machineId}/reset`);
                menuPanel.style.display = 'none';
                showMessage('MACHINE RESET - RELOADING...', 'win');
                setTimeout(() => location.reload(), 1000);
            } catch (e) {
                showMessage('RESET FAILED: ' + e.message, 'lose');
            }
        });
    }

    window.addEventListener('beforeunload', () => {
        if (machineJoined && isHubConnected() && machineId > 0) {
            hubConnection.invoke('LeaveMachine', machineId).catch(() => {});
        }
    });

    if (token) {
        authScreen.style.display = 'none';
        $('#game-screen').classList.add('active');
        initGame().catch(() => {
            clearToken();
            authScreen.style.display = '';
            $('#game-screen').classList.remove('active');
        });
    }
});
