package F0;

import E0.a;
import G0.d;
import G0.o;
import java.util.Set;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final a f339a;

    /* renamed from: b  reason: collision with root package name */
    public final a f340b;

    /* renamed from: c  reason: collision with root package name */
    public final d f341c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Set f342d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f343e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f344f;

    public n(d dVar, a aVar, a aVar2) {
        this.f344f = dVar;
        this.f339a = aVar;
        this.f340b = aVar2;
    }

    public final void a(D0.a aVar) {
        this.f344f.f319m.post(new C0.n(this, aVar, 2, false));
    }

    public final void b(D0.a aVar) {
        l lVar = (l) this.f344f.f316j.get(this.f340b);
        if (lVar != null) {
            o.a(lVar.f336m.f319m);
            a aVar2 = lVar.f327d;
            String name = aVar2.getClass().getName();
            String valueOf = String.valueOf(aVar);
            aVar2.k("onSignInFailed for " + name + " with " + valueOf);
            lVar.o(aVar, (RuntimeException) null);
        }
    }
}
