package k2;

import M.b;
import M.e;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

/* renamed from: k2.C  reason: case insensitive filesystem */
public final class C0275C extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f3870j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e f3871k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ double f3872l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0275C(e eVar, double d3, C0420d dVar) {
        super(2, dVar);
        this.f3871k = eVar;
        this.f3872l = d3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        C0275C c3 = new C0275C(this.f3871k, this.f3872l, dVar);
        c3.f3870j = obj;
        return c3;
    }

    public final Object i(Object obj, Object obj2) {
        C0368h hVar = C0368h.f4194a;
        ((C0275C) c((b) obj, (C0420d) obj2)).l(hVar);
        return hVar;
    }

    public final Object l(Object obj) {
        a.V(obj);
        ((b) this.f3870j).d(this.f3871k, new Double(this.f3872l));
        return C0368h.f4194a;
    }
}
