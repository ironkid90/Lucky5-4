package A;

import android.view.View;
import android.view.WindowInsets;
import t.C0469c;

public class J extends L {

    /* renamed from: a  reason: collision with root package name */
    public final WindowInsets.Builder f13a = I.j();

    public V b() {
        a();
        V a2 = V.a(this.f13a.build(), (View) null);
        a2.f31a.n((C0469c[]) null);
        return a2;
    }

    public void c(C0469c cVar) {
        this.f13a.setStableInsets(cVar.c());
    }

    public void d(C0469c cVar) {
        this.f13a.setSystemWindowInsets(cVar.c());
    }
}
