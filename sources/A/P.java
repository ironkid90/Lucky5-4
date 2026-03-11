package A;

import android.view.WindowInsets;
import t.C0469c;

public class P extends O {

    /* renamed from: n  reason: collision with root package name */
    public C0469c f25n = null;

    /* renamed from: o  reason: collision with root package name */
    public C0469c f26o = null;

    /* renamed from: p  reason: collision with root package name */
    public C0469c f27p = null;

    public P(V v, WindowInsets windowInsets) {
        super(v, windowInsets);
    }

    public C0469c f() {
        if (this.f26o == null) {
            this.f26o = C0469c.b(this.f19c.getMandatorySystemGestureInsets());
        }
        return this.f26o;
    }

    public C0469c h() {
        if (this.f25n == null) {
            this.f25n = C0469c.b(this.f19c.getSystemGestureInsets());
        }
        return this.f25n;
    }

    public C0469c j() {
        if (this.f27p == null) {
            this.f27p = C0469c.b(this.f19c.getTappableElementInsets());
        }
        return this.f27p;
    }

    public void p(C0469c cVar) {
    }
}
