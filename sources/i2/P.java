package I2;

import M0.a;
import p2.C0368h;
import z2.l;

public final class P extends V {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f731j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f732k;

    public /* synthetic */ P(int i3, Object obj) {
        this.f731j = i3;
        this.f732k = obj;
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        switch (this.f731j) {
            case 0:
                o((Throwable) obj);
                return C0368h.f4194a;
            default:
                o((Throwable) obj);
                return C0368h.f4194a;
        }
    }

    public final void o(Throwable th) {
        switch (this.f731j) {
            case 0:
                ((l) this.f732k).j(th);
                return;
            default:
                Object E3 = n().E();
                boolean z3 = E3 instanceof C0063n;
                W w3 = (W) this.f732k;
                if (z3) {
                    w3.m(a.h(((C0063n) E3).f775a));
                    return;
                } else {
                    w3.m(C0071w.m(E3));
                    return;
                }
        }
    }
}
