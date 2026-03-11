package c2;

import j1.e;
import java.nio.ByteBuffer;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final f f2791a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2792b;

    /* renamed from: c  reason: collision with root package name */
    public final r f2793c;

    /* renamed from: d  reason: collision with root package name */
    public final e f2794d;

    public q(f fVar, String str) {
        this(fVar, str, x.f2798a, (e) null);
    }

    public final void a(String str, Object obj, p pVar) {
        C0133a aVar;
        ByteBuffer a2 = this.f2793c.a(new m(obj, str));
        if (pVar == null) {
            aVar = null;
        } else {
            aVar = new C0133a(1, this, pVar);
        }
        this.f2791a.r(this.f2792b, a2, aVar);
    }

    public final void b(o oVar) {
        n nVar = null;
        String str = this.f2792b;
        f fVar = this.f2791a;
        e eVar = this.f2794d;
        if (eVar != null) {
            if (oVar != null) {
                nVar = new n(this, oVar);
            }
            fVar.l(str, nVar, eVar);
            return;
        }
        if (oVar != null) {
            nVar = new n(this, oVar);
        }
        fVar.q(str, nVar);
    }

    public q(f fVar, String str, r rVar, e eVar) {
        this.f2791a = fVar;
        this.f2792b = str;
        this.f2793c = rVar;
        this.f2794d = eVar;
    }
}
