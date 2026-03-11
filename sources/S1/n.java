package S1;

import L1.d;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.embedding.engine.renderer.i;

public final class n implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f1479a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f1480b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f1481c;

    public n(o oVar, h hVar, d dVar) {
        this.f1481c = oVar;
        this.f1479a = hVar;
        this.f1480b = dVar;
    }

    public final void b() {
        h hVar;
        this.f1479a.c(this);
        this.f1480b.run();
        o oVar = this.f1481c;
        if (!(oVar.f1488i instanceof h) && (hVar = oVar.f1487h) != null) {
            hVar.c();
            h hVar2 = oVar.f1487h;
            if (hVar2 != null) {
                hVar2.f1461f.close();
                oVar.removeView(oVar.f1487h);
                oVar.f1487h = null;
            }
        }
    }

    public final void a() {
    }
}
