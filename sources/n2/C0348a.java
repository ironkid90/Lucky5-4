package n2;

import A2.i;
import Y1.a;
import Y1.b;
import android.content.Context;
import c2.f;
import c2.n;
import c2.o;
import c2.q;

/* renamed from: n2.a  reason: case insensitive filesystem */
public final class C0348a implements b {

    /* renamed from: f  reason: collision with root package name */
    public q f4114f;

    public final void onAttachedToEngine(a aVar) {
        i.e(aVar, "binding");
        f fVar = aVar.f1965b;
        i.d(fVar, "getBinaryMessenger(...)");
        Context context = aVar.f1964a;
        i.d(context, "getApplicationContext(...)");
        this.f4114f = new q(fVar, "PonnamKarthik/fluttertoast");
        n nVar = new n(11);
        nVar.f2789g = context;
        q qVar = this.f4114f;
        if (qVar != null) {
            qVar.b(nVar);
        }
    }

    public final void onDetachedFromEngine(a aVar) {
        i.e(aVar, "p0");
        q qVar = this.f4114f;
        if (qVar != null) {
            qVar.b((o) null);
        }
        this.f4114f = null;
    }
}
