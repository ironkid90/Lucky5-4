import './_group.css';

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
        background: 'radial-gradient(ellipse at 50% 30%, rgba(139,105,20,0.06) 0%, transparent 60%)',
        pointerEvents: 'none',
      }} />

      <div style={{
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        position: 'relative',
        zIndex: 1,
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
          boxShadow: '0 0 40px rgba(139,105,20,0.12), inset 0 1px 0 rgba(255,215,0,0.08)',
          animation: 'borderShimmer 4s ease-in-out infinite',
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
