package k2;

import M.b;
import M.e;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

public final class z extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f3984j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e f3985k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f3986l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(e eVar, boolean z3, C0420d dVar) {
        super(2, dVar);
        this.f3985k = eVar;
        this.f3986l = z3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        z zVar = new z(this.f3985k, this.f3986l, dVar);
        zVar.f3984j = obj;
        return zVar;
    }

    public final Object i(Object obj, Object obj2) {
        C0368h hVar = C0368h.f4194a;
        ((z) c((b) obj, (C0420d) obj2)).l(hVar);
        return hVar;
    }

    public final Object l(Object obj) {
        a.V(obj);
        ((b) this.f3984j).d(this.f3985k, Boolean.valueOf(this.f3986l));
        return C0368h.f4194a;
    }
}
