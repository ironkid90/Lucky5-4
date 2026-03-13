import './_group.css';

function ArcadeCabinet() {
  return (
    <div style={{
      position: 'absolute',
      top: '50%',
      left: '50%',
      transform: 'translate(-50%, -50%)',
      width: 420,
      height: 700,
      pointerEvents: 'none',
      opacity: 0.12,
    }}>
      <div style={{
        position: 'absolute',
        top: 0,
        left: 30,
        right: 30,
        height: 40,
        background: 'linear-gradient(180deg, #8B6914 0%, #5a4410 100%)',
        borderRadius: '12px 12px 0 0',
        boxShadow: '0 0 20px rgba(139,105,20,0.3)',
      }} />

      <div style={{
        position: 'absolute',
        top: 38,
        left: 20,
        right: 20,
        height: 320,
        background: '#0a0a0a',
        border: '3px solid #8B6914',
        borderRadius: '4px',
        overflow: 'hidden',
      }}>
        <div style={{
          position: 'absolute',
          top: 8,
          left: 8,
          right: 8,
          display: 'flex',
          flexDirection: 'column',
          gap: 3,
        }}>
          {['ROYAL FLUSH', 'STRAIGHT FLUSH', '4 OF A KIND', 'FULL HOUSE', 'FLUSH', 'STRAIGHT', '3 OF A KIND', '2 PAIR'].map((hand, i) => (
            <div key={i} style={{
              display: 'flex',
              justifyContent: 'space-between',
              fontFamily: "'Arcade', monospace",
              fontSize: 7,
              color: ['#f44', '#f80', '#0c0', '#ff0', '#08f', '#0cc', '#0c0', '#0cc'][i],
              opacity: 0.9,
              letterSpacing: 0.5,
            }}>
              <span>{hand}</span>
              <span>{[5000000, 375000, 75000, 60000, 50000, 40000, 15000, 10000][i].toLocaleString()}</span>
            </div>
          ))}
        </div>

        <div style={{
          position: 'absolute',
          top: 100,
          left: 10,
          right: 10,
          display: 'flex',
          justifyContent: 'center',
          gap: 6,
        }}>
          {['♠','♥','♣','♦','♠'].map((suit, i) => (
            <div key={i} style={{
              width: 50,
              height: 70,
              background: '#fff',
              borderRadius: 3,
              display: 'flex',
              alignItems: 'center',
              justifyContent: 'center',
              fontSize: 22,
              color: suit === '♥' || suit === '♦' ? '#c00' : '#000',
              boxShadow: '0 2px 6px rgba(0,0,0,0.4)',
            }}>
              {suit}
            </div>
          ))}
        </div>

        <div style={{
          position: 'absolute',
          bottom: 10,
          left: 10,
          right: 10,
          display: 'flex',
          justifyContent: 'space-between',
          fontFamily: "'Arcade', monospace",
          fontSize: 8,
        }}>
          <span style={{ color: '#0f0' }}>CREDIT 121,200</span>
          <span style={{ color: '#ff0' }}>STAKE 5,000</span>
        </div>
      </div>

      <div style={{
        position: 'absolute',
        top: 365,
        left: 10,
        right: 10,
        height: 200,
        background: 'linear-gradient(180deg, #3d2815 0%, #2a1a0d 50%, #1f130a 100%)',
        borderRadius: '0 0 4px 4px',
        border: '2px solid #5a4410',
        borderTop: 'none',
      }}>
        <div style={{
          display: 'grid',
          gridTemplateColumns: 'repeat(5, 1fr)',
          gap: 8,
          padding: '20px 15px 10px',
        }}>
          {Array(5).fill(null).map((_, i) => (
            <div key={i} style={{
              height: 30,
              background: 'linear-gradient(180deg, #c9a227, #8B6914)',
              borderRadius: 4,
              boxShadow: '0 2px 4px rgba(0,0,0,0.4), inset 0 1px 0 rgba(255,255,255,0.2)',
            }} />
          ))}
        </div>

        <div style={{
          display: 'grid',
          gridTemplateColumns: 'repeat(5, 1fr)',
          gap: 8,
          padding: '0 15px 10px',
        }}>
          {[
            { bg: 'linear-gradient(180deg, #e44, #a22)', label: 'BIG' },
            { bg: 'linear-gradient(180deg, #e44, #a22)', label: 'SML' },
            { bg: 'linear-gradient(180deg, #c9a227, #8B6914)', label: '' },
            { bg: 'linear-gradient(180deg, #c9a227, #8B6914)', label: '' },
            { bg: 'linear-gradient(180deg, #4a4, #282)', label: 'BET' },
          ].map((btn, i) => (
            <div key={i} style={{
              height: 36,
              background: btn.bg,
              borderRadius: 4,
              display: 'flex',
              alignItems: 'center',
              justifyContent: 'center',
              fontFamily: "'Arcade', monospace",
              fontSize: 6,
              color: '#fff',
              boxShadow: '0 2px 4px rgba(0,0,0,0.4), inset 0 1px 0 rgba(255,255,255,0.15)',
              textShadow: '0 1px 2px rgba(0,0,0,0.5)',
            }}>
              {btn.label}
            </div>
          ))}
        </div>

        <div style={{
          display: 'flex',
          justifyContent: 'center',
          gap: 12,
          padding: '6px 15px',
        }}>
          {[
            { bg: 'linear-gradient(180deg, #e44, #a22)', w: 50 },
            { bg: 'linear-gradient(180deg, #333, #222)', w: 30 },
            { bg: 'linear-gradient(180deg, #e44, #a22)', w: 50 },
          ].map((btn, i) => (
            <div key={i} style={{
              width: btn.w,
              height: 30,
              background: btn.bg,
              borderRadius: i === 1 ? '50%' : 4,
              boxShadow: '0 2px 4px rgba(0,0,0,0.4)',
            }} />
          ))}
        </div>
      </div>

      <div style={{
        position: 'absolute',
        top: 565,
        left: 40,
        right: 40,
        height: 120,
        background: 'linear-gradient(180deg, #2a1a0d 0%, #1a0f06 100%)',
        borderRadius: '0 0 20px 20px',
        border: '2px solid #3d2815',
        borderTop: 'none',
      }}>
        <div style={{
          position: 'absolute',
          top: 20,
          left: '50%',
          transform: 'translateX(-50%)',
          width: 60,
          height: 8,
          background: '#111',
          borderRadius: 4,
          border: '1px solid #333',
        }} />
      </div>
    </div>
  );
}

export function Refined() {
  return (
    <div style={{
      width: '100%',
      minHeight: '100vh',
      background: '#000',
      display: 'flex',
      flexDirection: 'column',
      alignItems: 'center',
      justifyContent: 'center',
      fontFamily: "'Arcade', monospace",
      position: 'relative',
      overflow: 'hidden',
    }}>
      <style>{`
        @keyframes cardGlow {
          0%, 100% { filter: drop-shadow(0 0 12px rgba(255,215,0,0.25)); }
          50% { filter: drop-shadow(0 0 24px rgba(255,215,0,0.45)); }
        }
        @keyframes borderShimmer {
          0% { border-color: #8B6914; }
          50% { border-color: #c9a227; }
          100% { border-color: #8B6914; }
        }
        @keyframes cabinetGlow {
          0%, 100% { opacity: 0.10; }
          50% { opacity: 0.16; }
        }
        .refined-input {
          width: 100%;
          padding: 12px 0 10px 0;
          background: transparent;
          border: none;
          border-bottom: 2px solid #444;
          color: #d4af37;
          font-family: monospace;
          font-size: 14px;
          letter-spacing: 1px;
          outline: none;
          transition: border-color 0.3s, color 0.3s;
        }
        .refined-input::placeholder {
          color: #666;
          font-family: 'Arcade', monospace;
          font-size: 11px;
          letter-spacing: 2px;
        }
        .refined-input:focus {
          border-bottom-color: #FFD700;
          color: #FFD700;
        }
        .refined-btn {
          width: 100%;
          padding: 14px;
          background: linear-gradient(180deg, #FFD700 0%, #B8860B 100%);
          border: none;
          border-radius: 4px;
          color: #1a0f00;
          font-family: 'Arcade', monospace;
          font-size: 13px;
          cursor: pointer;
          letter-spacing: 3px;
          font-weight: bold;
          transition: all 0.2s;
          box-shadow: 0 2px 8px rgba(255,215,0,0.25), inset 0 1px 0 rgba(255,255,255,0.2);
          text-shadow: 0 1px 0 rgba(255,215,0,0.5);
        }
        .refined-btn:hover {
          filter: brightness(1.1);
          box-shadow: 0 4px 16px rgba(255,215,0,0.4), inset 0 1px 0 rgba(255,255,255,0.3);
          transform: translateY(-1px);
        }
      `}</style>

      <div style={{
        position: 'absolute',
        inset: 0,
        background: 'radial-gradient(ellipse at 50% 40%, rgba(139,105,20,0.08) 0%, transparent 55%)',
        pointerEvents: 'none',
      }} />

      <div style={{ animation: 'cabinetGlow 5s ease-in-out infinite' }}>
        <ArcadeCabinet />
      </div>

      <div style={{
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        position: 'relative',
        zIndex: 10,
      }}>
        <img
          src="/__mockup/images/lucky5.png"
          alt="Lucky 5"
          style={{
            width: 150,
            imageRendering: 'pixelated' as any,
            animation: 'cardGlow 3s ease-in-out infinite',
            marginBottom: -8,
            position: 'relative',
            zIndex: 2,
          }}
        />

        <div style={{
          width: 320,
          background: 'linear-gradient(180deg, rgba(45,28,12,0.97) 0%, rgba(15,8,2,0.99) 100%)',
          border: '2px solid #8B6914',
          borderRadius: 8,
          padding: '36px 32px 28px',
          textAlign: 'center',
          position: 'relative',
          boxShadow: '0 0 40px rgba(139,105,20,0.12), 0 0 80px rgba(0,0,0,0.8), inset 0 1px 0 rgba(255,215,0,0.08)',
          animation: 'borderShimmer 4s ease-in-out infinite',
          backdropFilter: 'blur(8px)',
        }}>
          <div style={{
            position: 'absolute',
            top: 6,
            left: 6,
            right: 6,
            bottom: 6,
            border: '1px solid rgba(139,105,20,0.15)',
            borderRadius: 4,
            pointerEvents: 'none',
          }} />

          <h2 style={{
            fontFamily: "'Arcade', monospace",
            fontSize: 15,
            color: '#FFD700',
            marginBottom: 28,
            textShadow: '0 0 12px rgba(255,215,0,0.4)',
            letterSpacing: 4,
          }}>
            LOGIN
          </h2>

          <div style={{ marginBottom: 20 }}>
            <input
              className="refined-input"
              type="text"
              placeholder="USERNAME"
              readOnly
            />
          </div>
          <div style={{ marginBottom: 28 }}>
            <input
              className="refined-input"
              type="password"
              placeholder="PASSWORD"
              readOnly
            />
          </div>

          <button className="refined-btn">
            LOGIN
          </button>

          <div style={{
            marginTop: 18,
            display: 'flex',
            alignItems: 'center',
            justifyContent: 'center',
            gap: 6,
          }}>
            <span style={{
              color: '#666',
              fontSize: 10,
              fontFamily: "'Arcade', monospace",
              letterSpacing: 1,
            }}>
              NO ACCOUNT?
            </span>
            <span style={{
              color: '#d4af37',
              fontSize: 10,
              fontFamily: "'Arcade', monospace",
              letterSpacing: 1,
              cursor: 'pointer',
              borderBottom: '1px solid rgba(212,175,55,0.4)',
              paddingBottom: 1,
            }}>
              SIGN UP
            </span>
          </div>
        </div>
      </div>
    </div>
  );
}
