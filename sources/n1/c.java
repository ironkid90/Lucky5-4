package N1;

import B.m;
import C0.f;
import F0.h;
import Y1.a;
import Y1.b;
import android.content.Context;
import android.net.ConnectivityManager;
import c2.o;
import c2.q;

public class c implements b {

    /* renamed from: f  reason: collision with root package name */
    public q f1176f;

    /* renamed from: g  reason: collision with root package name */
    public f f1177g;

    /* renamed from: h  reason: collision with root package name */
    public b f1178h;

    public final void onAttachedToEngine(a aVar) {
        c2.f fVar = aVar.f1965b;
        this.f1176f = new q(fVar, "dev.fluttercommunity.plus/connectivity");
        this.f1177g = new f(fVar, "dev.fluttercommunity.plus/connectivity_status");
        Context context = aVar.f1964a;
        m mVar = new m(10, (Object) (ConnectivityManager) context.getSystemService("connectivity"));
        h hVar = new h(8, (Object) mVar);
        this.f1178h = new b(context, mVar);
        this.f1176f.b(hVar);
        this.f1177g.X(this.f1178h);
    }

    public final void onDetachedFromEngine(a aVar) {
        this.f1176f.b((o) null);
        this.f1177g.X((c2.h) null);
        this.f1178h.r();
        this.f1176f = null;
        this.f1177g = null;
        this.f1178h = null;
    }
}
