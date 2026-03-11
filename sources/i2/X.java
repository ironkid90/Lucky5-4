package I2;

import p2.C0368h;

public final class X extends V {

    /* renamed from: j  reason: collision with root package name */
    public final a0 f737j;

    /* renamed from: k  reason: collision with root package name */
    public final Y f738k;

    /* renamed from: l  reason: collision with root package name */
    public final C0059j f739l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f740m;

    public X(a0 a0Var, Y y2, C0059j jVar, Object obj) {
        this.f737j = a0Var;
        this.f738k = y2;
        this.f739l = jVar;
        this.f740m = obj;
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        o((Throwable) obj);
        return C0368h.f4194a;
    }

    public final void o(Throwable th) {
        C0059j jVar = this.f739l;
        a0 a0Var = this.f737j;
        a0Var.getClass();
        C0059j M3 = a0.M(jVar);
        Y y2 = this.f738k;
        Object obj = this.f740m;
        if (M3 != null) {
            while (C0071w.f(M3.f765j, false, new X(a0Var, y2, M3, obj), 1) == c0.f755f) {
                M3 = a0.M(M3);
                if (M3 == null) {
                }
            }
            return;
        }
        a0Var.q(a0Var.z(y2, obj));
    }
}
