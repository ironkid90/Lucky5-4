package N;

import C0.f;
import android.content.DialogInterface;

public final class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1140f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f1141g;

    public /* synthetic */ b(e eVar, int i3) {
        this.f1140f = i3;
        this.f1141g = eVar;
    }

    public final void run() {
        switch (this.f1140f) {
            case 0:
                this.f1141g.f1154o.onDismiss((DialogInterface) null);
                return;
            default:
                e eVar = this.f1141g;
                if (eVar.f1148i != null) {
                    if (eVar.f1148i == null) {
                        f fVar = new f(3, false);
                        Object obj = e.f1144t;
                        fVar.f128h = obj;
                        fVar.f127g = obj;
                        fVar.f129i = obj;
                        eVar.f1148i = fVar;
                    }
                    eVar.f1148i.getClass();
                    return;
                }
                return;
        }
    }
}
