package I;

import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class M extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f554j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f555k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ P f556l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public M(P p3, C0420d dVar) {
        super(2, dVar);
        this.f556l = p3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        M m3 = new M(this.f556l, dVar);
        m3.f555k = obj;
        return m3;
    }

    public final Object i(Object obj, Object obj2) {
        return ((M) c((S) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f554j;
        if (i3 == 0) {
            a.V(obj);
            this.f554j = 1;
            if (P.b(this.f556l, (S) this.f555k, this) == aVar) {
                return aVar;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C0368h.f4194a;
    }
}
