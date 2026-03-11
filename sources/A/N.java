package A;

import android.view.View;
import android.view.WindowInsets;
import t.C0469c;

public class N extends M {

    /* renamed from: m  reason: collision with root package name */
    public C0469c f24m = null;

    public N(V v, WindowInsets windowInsets) {
        super(v, windowInsets);
    }

    public V b() {
        return V.a(this.f19c.consumeStableInsets(), (View) null);
    }

    public V c() {
        return V.a(this.f19c.consumeSystemWindowInsets(), (View) null);
    }

    public final C0469c g() {
        if (this.f24m == null) {
            WindowInsets windowInsets = this.f19c;
            this.f24m = C0469c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f24m;
    }

    public boolean k() {
        return this.f19c.isConsumed();
    }

    public void p(C0469c cVar) {
        this.f24m = cVar;
    }
}
