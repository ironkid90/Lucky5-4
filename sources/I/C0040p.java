package I;

import M0.a;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

/* renamed from: I.p  reason: case insensitive filesystem */
public final class C0040p extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f658j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ a0 f659k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0040p(a0 a0Var, C0420d dVar) {
        super(2, dVar);
        this.f659k = a0Var;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        C0040p pVar = new C0040p(this.f659k, dVar);
        pVar.f658j = obj;
        return pVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0040p) c((a0) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        boolean z3;
        a.V(obj);
        a0 a0Var = (a0) this.f658j;
        if (!(a0Var instanceof C0027c) || a0Var.f607a > this.f659k.f607a) {
            z3 = false;
        } else {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
