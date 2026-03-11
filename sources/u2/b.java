package U2;

import A2.i;
import B.d;
import M0.a;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import z2.l;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1797d;

    /* renamed from: e  reason: collision with root package name */
    public final p f1798e;

    /* renamed from: f  reason: collision with root package name */
    public final n f1799f;

    /* renamed from: g  reason: collision with root package name */
    public final o f1800g;

    /* renamed from: h  reason: collision with root package name */
    public T2.a f1801h;

    /* renamed from: i  reason: collision with root package name */
    public Object f1802i;

    public b(p pVar, n nVar, o oVar, int i3) {
        this.f1797d = i3;
        switch (i3) {
            case 1:
                i.e(pVar, "player");
                this.f1798e = pVar;
                this.f1799f = nVar;
                this.f1800g = oVar;
                this.f1801h = pVar.f1835c;
                W();
                return;
            default:
                i.e(pVar, "player");
                this.f1798e = pVar;
                this.f1799f = nVar;
                this.f1800g = oVar;
                this.f1801h = pVar.f1835c;
                W();
                return;
        }
    }

    public final void M() {
        switch (this.f1797d) {
            case 0:
                v(u().f1833a.a().requestAudioFocus((a) this.f1802i, 3, this.f1801h.f1733e));
                return;
            default:
                AudioManager a2 = u().f1833a.a();
                AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.f1802i;
                i.b(audioFocusRequest);
                v(a2.requestAudioFocus(audioFocusRequest));
                return;
        }
    }

    public final void P(T2.a aVar) {
        switch (this.f1797d) {
            case 0:
                this.f1801h = aVar;
                return;
            default:
                this.f1801h = aVar;
                return;
        }
    }

    public final void W() {
        a aVar;
        AudioFocusRequest audioFocusRequest;
        switch (this.f1797d) {
            case 0:
                if (this.f1801h.f1733e == 0) {
                    aVar = null;
                } else {
                    aVar = new a(this, 0);
                }
                this.f1802i = aVar;
                return;
            default:
                if (this.f1801h.f1733e == 0) {
                    audioFocusRequest = null;
                } else {
                    d.q();
                    audioFocusRequest = d.i(this.f1801h.f1733e).setAudioAttributes(this.f1801h.a()).setOnAudioFocusChangeListener(new a(this, 1)).build();
                }
                this.f1802i = audioFocusRequest;
                return;
        }
    }

    public final T2.a q() {
        switch (this.f1797d) {
            case 0:
                return this.f1801h;
            default:
                return this.f1801h;
        }
    }

    public final z2.a s() {
        switch (this.f1797d) {
            case 0:
                return this.f1799f;
            default:
                return this.f1799f;
        }
    }

    public final l t() {
        switch (this.f1797d) {
            case 0:
                return this.f1800g;
            default:
                return this.f1800g;
        }
    }

    public final p u() {
        switch (this.f1797d) {
            case 0:
                return this.f1798e;
            default:
                return this.f1798e;
        }
    }

    public final void w() {
        AudioFocusRequest audioFocusRequest;
        switch (this.f1797d) {
            case 0:
                if (x()) {
                    u().f1833a.a().abandonAudioFocus((a) this.f1802i);
                    return;
                }
                return;
            default:
                if (x() && (audioFocusRequest = (AudioFocusRequest) this.f1802i) != null) {
                    u().f1833a.a().abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
        }
    }

    public final boolean x() {
        switch (this.f1797d) {
            case 0:
                if (((a) this.f1802i) != null) {
                    return true;
                }
                return false;
            default:
                if (((AudioFocusRequest) this.f1802i) != null) {
                    return true;
                }
                return false;
        }
    }
}
