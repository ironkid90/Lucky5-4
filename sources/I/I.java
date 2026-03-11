package I;

import I2.C0069u;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class I extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f544j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C0488f f545k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ C0027c f546l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(p pVar, C0027c cVar, C0420d dVar) {
        super(2, dVar);
        this.f545k = (C0488f) pVar;
        this.f546l = cVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [z2.p, t2.f] */
    public final C0420d c(Object obj, C0420d dVar) {
        return new I(this.f545k, this.f546l, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((I) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [z2.p, t2.f] */
    public final Object l(Object obj) {
        Object obj2 = C0466a.f4632f;
        int i3 = this.f544j;
        if (i3 == 0) {
            a.V(obj);
            Object obj3 = this.f546l.f609b;
            this.f544j = 1;
            obj = this.f545k.i(obj3, this);
            if (obj == obj2) {
                return obj2;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
