import './_group.css';

export function Polished() {
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
        @keyframes floatCard {
          0%, 100% { transform: translateY(0); }
          50% { transform: translateY(-6px); }
        }
        @keyframes glowPulse {
          0%, 100% { opacity: 0.3; }
          50% { opacity: 0.6; }
        }
        @keyframes inputFocusLine {
          0% { width: 0; }
          100% { width: 100%; }
        }
        .pol-input-wrap {
          position: relative;
          margin-bottom: 22px;
        }
        .pol-input-wrap::after {
          content: '';
          position: absolute;
          bottom: 0;
          left: 0;
          width: 100%;
          height: 1px;
          background: linear-gradient(90deg, transparent, #8B6914, transparent);
        }
        .pol-input {
          width: 100%;
          padding: 14px 16px 12px;
          background: rgba(0,0,0,0.5);
          border: 1px solid rgba(139,105,20,0.25);
          border-radius: 6px;
          color: #e8d48b;
          font-family: monospace;
          font-size: 13px;
          letter-spacing: 1px;
          outline: none;
          transition: all 0.3s;
        }
        .pol-input::placeholder {
          color: #555;
          font-family: 'Arcade', monospace;
          font-size: 10px;
          letter-spacing: 2px;
        }
        .pol-input:focus {
          border-color: rgba(255,215,0,0.5);
          box-shadow: 0 0 12px rgba(255,215,0,0.1);
          background: rgba(20,10,0,0.7);
        }
        .pol-btn {
          width: 100%;
          padding: 15px;
          background: linear-gradient(180deg, #FFD700 0%, #c9a227 40%, #B8860B 100%);
          border: 1px solid rgba(255,215,0,0.3);
          border-radius: 6px;
          color: #1a0f00;
          font-family: 'Arcade', monospace;
          font-size: 14px;
          cursor: pointer;
          letter-spacing: 3px;
          transition: all 0.2s;
          box-shadow:
            0 4px 12px rgba(0,0,0,0.4),
            0 2px 8px rgba(255,215,0,0.2),
            inset 0 1px 0 rgba(255,255,255,0.25),
            inset 0 -2px 4px rgba(0,0,0,0.15);
          text-shadow: 0 1px 0 rgba(255,215,0,0.3);
          position: relative;
        }
        .pol-btn:hover {
          filter: brightness(1.08);
          transform: translateY(-1px);
          box-shadow:
            0 6px 20px rgba(0,0,0,0.5),
            0 4px 16px rgba(255,215,0,0.3),
            inset 0 1px 0 rgba(255,255,255,0.3),
            inset 0 -2px 4px rgba(0,0,0,0.15);
        }
        .pol-btn:active {
          transform: translateY(1px);
          box-shadow:
            0 1px 4px rgba(0,0,0,0.4),
            0 1px 4px rgba(255,215,0,0.15),
            inset 0 2px 4px rgba(0,0,0,0.2);
        }
        .suit-pattern {
          position: absolute;
          color: rgba(139,105,20,0.04);
          font-size: 28px;
          pointer-events: none;
          user-select: none;
        }
      `}</style>

      <div style={{
        position: 'absolute',
        inset: 0,
        background: 'radial-gradient(ellipse at 50% 25%, rgba(139,105,20,0.08) 0%, transparent 55%)',
        pointerEvents: 'none',
      }} />

      {['♠','♥','♦','♣','♠','♥','♦','♣','♠','♦','♣','♥'].map((suit, i) => (
        <span
          key={i}
          className="suit-pattern"
          style={{
            top: `${8 + (i * 7.5)}%`,
            left: `${10 + ((i * 17) % 80)}%`,
            fontSize: 20 + (i % 3) * 8,
            opacity: 0.025 + (i % 3) * 0.008,
            transform: `rotate(${(i * 30) % 360}deg)`,
          }}
        >
          {suit}
        </span>
      ))}

      <div style={{
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        position: 'relative',
        zIndex: 1,
      }}>
        <div style={{ position: 'relative', marginBottom: -4 }}>
          <div style={{
            position: 'absolute',
            top: '50%',
            left: '50%',
            transform: 'translate(-50%, -50%)',
            width: 200,
            height: 200,
            background: 'radial-gradient(circle, rgba(255,215,0,0.12) 0%, transparent 70%)',
            borderRadius: '50%',
            animation: 'glowPulse 3s ease-in-out infinite',
            pointerEvents: 'none',
          }} />
          <img
            src="/__mockup/images/lucky5.png"
            alt="Lucky 5"
            style={{
              width: 160,
              imageRendering: 'pixelated' as any,
              animation: 'floatCard 4s ease-in-out infinite',
              position: 'relative',
              zIndex: 2,
              filter: 'drop-shadow(0 8px 16px rgba(0,0,0,0.6))',
            }}
          />
        </div>

        <div style={{
          width: 340,
          background: 'linear-gradient(180deg, rgba(50,32,14,0.97) 0%, rgba(25,15,5,0.99) 100%)',
          border: '2px solid #8B6914',
          borderRadius: 10,
          padding: '40px 34px 30px',
          textAlign: 'center',
          position: 'relative',
          boxShadow: `
            0 0 60px rgba(139,105,20,0.1),
            0 20px 40px rgba(0,0,0,0.5),
            inset 0 1px 0 rgba(255,215,0,0.1)
          `,
        }}>
          <div style={{
            position: 'absolute',
            top: -1,
            left: 20,
            right: 20,
            height: 1,
            background: 'linear-gradient(90deg, transparent, rgba(255,215,0,0.3), transparent)',
          }} />

          <CornerAccent top={8} left={8} />
          <CornerAccent top={8} right={8} flipH />
          <CornerAccent bottom={8} left={8} flipV />
          <CornerAccent bottom={8} right={8} flipH flipV />

          <h2 style={{
            fontFamily: "'Arcade', monospace",
            fontSize: 16,
            color: '#FFD700',
            marginBottom: 8,
            textShadow: '0 0 15px rgba(255,215,0,0.35)',
            letterSpacing: 5,
          }}>
            LOGIN
          </h2>

          <div style={{
            width: 40,
            height: 1,
            background: 'linear-gradient(90deg, transparent, #8B6914, transparent)',
            margin: '0 auto 28px',
          }} />

          <div className="pol-input-wrap">
            <input
              className="pol-input"
              type="text"
              placeholder="USERNAME"
              readOnly
            />
          </div>
          <div className="pol-input-wrap">
            <input
              className="pol-input"
              type="password"
              placeholder="PASSWORD"
              readOnly
            />
          </div>

          <button className="pol-btn" style={{ marginTop: 6 }}>
            LOGIN
          </button>

          <div style={{
            marginTop: 20,
            display: 'flex',
            alignItems: 'center',
            justifyContent: 'center',
            gap: 8,
          }}>
            <div style={{
              width: 24,
              height: 1,
              background: 'linear-gradient(90deg, transparent, rgba(139,105,20,0.3))',
            }} />
            <span style={{
              color: '#777',
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
            }}>
              SIGN UP
            </span>
            <div style={{
              width: 24,
              height: 1,
              background: 'linear-gradient(270deg, transparent, rgba(139,105,20,0.3))',
            }} />
          </div>
        </div>
      </div>
    </div>
  );
}

function CornerAccent({ top, bottom, left, right, flipH, flipV }: {
  top?: number; bottom?: number; left?: number; right?: number;
  flipH?: boolean; flipV?: boolean;
}) {
  return (
    <div style={{
      position: 'absolute',
      ...(top !== undefined && { top }),
      ...(bottom !== undefined && { bottom }),
      ...(left !== undefined && { left }),
      ...(right !== undefined && { right }),
      width: 12,
      height: 12,
      borderTop: flipV ? 'none' : '1px solid rgba(255,215,0,0.3)',
      borderBottom: flipV ? '1px solid rgba(255,215,0,0.3)' : 'none',
      borderLeft: flipH ? 'none' : '1px solid rgba(255,215,0,0.3)',
      borderRight: flipH ? '1px solid rgba(255,215,0,0.3)' : 'none',
      pointerEvents: 'none',
    }} />
  );
}
