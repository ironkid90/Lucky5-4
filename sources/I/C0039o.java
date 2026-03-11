package I;

import M0.a;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

/* renamed from: I.o  reason: case insensitive filesystem */
public final class C0039o extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f657j;

    /* JADX WARNING: type inference failed for: r0v0, types: [r2.d, t2.f, I.o] */
    public final C0420d c(Object obj, C0420d dVar) {
        ? fVar = new C0488f(2, dVar);
        fVar.f657j = obj;
        return fVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0039o) c((a0) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        a.V(obj);
        return Boolean.valueOf(!(((a0) this.f657j) instanceof Q));
    }
}
