package k2;

import M.b;
import M.e;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

/* renamed from: k2.F  reason: case insensitive filesystem */
public final class C0278F extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f3881j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e f3882k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ long f3883l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0278F(e eVar, long j3, C0420d dVar) {
        super(2, dVar);
        this.f3882k = eVar;
        this.f3883l = j3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        C0278F f3 = new C0278F(this.f3882k, this.f3883l, dVar);
        f3.f3881j = obj;
        return f3;
    }

    public final Object i(Object obj, Object obj2) {
        C0368h hVar = C0368h.f4194a;
        ((C0278F) c((b) obj, (C0420d) obj2)).l(hVar);
        return hVar;
    }

    public final Object l(Object obj) {
        a.V(obj);
        ((b) this.f3881j).d(this.f3882k, new Long(this.f3883l));
        return C0368h.f4194a;
    }
}
