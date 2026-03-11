package S1;

import android.view.ViewTreeObserver;

public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f1447f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f1448g;

    public f(g gVar, o oVar) {
        this.f1448g = gVar;
        this.f1447f = oVar;
    }

    public final boolean onPreDraw() {
        g gVar = this.f1448g;
        if (gVar.f1456h && gVar.f1454f != null) {
            this.f1447f.getViewTreeObserver().removeOnPreDrawListener(this);
            gVar.f1454f = null;
        }
        return gVar.f1456h;
    }
}
