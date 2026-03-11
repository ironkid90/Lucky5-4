package I;

import A2.j;
import I2.C0055f;
import K.h;
import p2.C0367g;
import p2.C0368h;
import z2.l;

public final class K extends j implements l {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f551g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f552h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i3, Object obj) {
        super(1);
        this.f551g = i3;
        this.f552h = obj;
    }

    public final Object j(Object obj) {
        switch (this.f551g) {
            case 0:
                Throwable th = (Throwable) obj;
                P p3 = (P) this.f552h;
                if (th != null) {
                    p3.f575m.s(new Q(th));
                }
                if (p3.f577o.f4191g != C0367g.f4193a) {
                    ((h) p3.f577o.a()).close();
                }
                return C0368h.f4194a;
            case 1:
                Throwable th2 = (Throwable) obj;
                C0368h hVar = C0368h.f4194a;
                ((C0055f) this.f552h).m(hVar);
                return hVar;
            default:
                Throwable th3 = (Throwable) obj;
                ((Q2.h) this.f552h).b();
                return C0368h.f4194a;
        }
    }
}
