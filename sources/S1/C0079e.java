package S1;

import L.k;
import android.os.Build;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.embedding.engine.renderer.i;
import java.util.Iterator;

/* renamed from: S1.e  reason: case insensitive filesystem */
public final class C0079e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1445a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1446b;

    public /* synthetic */ C0079e(int i3, Object obj) {
        this.f1445a = i3;
        this.f1446b = obj;
    }

    public final void a() {
        switch (this.f1445a) {
            case 0:
                g gVar = (g) this.f1446b;
                gVar.f1449a.getClass();
                gVar.f1456h = false;
                return;
            case 1:
                o oVar = (o) this.f1446b;
                oVar.f1491l = false;
                Iterator it = oVar.f1490k.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
                return;
            case k.FLOAT_FIELD_NUMBER:
                return;
            default:
                ((h) this.f1446b).f3311c = false;
                return;
        }
    }

    public final void b() {
        switch (this.f1445a) {
            case 0:
                g gVar = (g) this.f1446b;
                C0078d dVar = gVar.f1449a;
                if (Build.VERSION.SDK_INT >= 29) {
                    dVar.reportFullyDrawn();
                } else {
                    dVar.getClass();
                }
                gVar.f1456h = true;
                gVar.f1457i = true;
                return;
            case 1:
                o oVar = (o) this.f1446b;
                oVar.f1491l = true;
                Iterator it = oVar.f1490k.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).b();
                }
                return;
            case k.FLOAT_FIELD_NUMBER:
                E e2 = (E) this.f1446b;
                e2.f1427a.setAlpha(1.0f);
                h hVar = e2.f1428b;
                if (hVar != null) {
                    hVar.c(this);
                    return;
                }
                return;
            default:
                ((h) this.f1446b).f3311c = true;
                return;
        }
    }

    private final void c() {
    }
}
