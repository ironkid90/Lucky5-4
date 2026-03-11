package I;

import I2.C0069u;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class H extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f542j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ P f543k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H(P p3, C0420d dVar) {
        super(2, dVar);
        this.f543k = p3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new H(this.f543k, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((H) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f542j;
        P p3 = this.f543k;
        if (i3 == 0) {
            a.V(obj);
            if (p3.f575m.r() instanceof Q) {
                return p3.f575m.r();
            }
            this.f542j = 1;
            if (p3.g(this) == aVar) {
                return aVar;
            }
        } else if (i3 == 1) {
            try {
                a.V(obj);
            } catch (Throwable th) {
                return new T(th, -1);
            }
        } else if (i3 == 2) {
            a.V(obj);
            return (a0) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f542j = 2;
        obj = P.d(p3, false, this);
        if (obj == aVar) {
            return aVar;
        }
        return (a0) obj;
    }
}
