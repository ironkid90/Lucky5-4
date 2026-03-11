package I;

import L2.e;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

/* renamed from: I.n  reason: case insensitive filesystem */
public final class C0038n extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f655j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ P f656k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0038n(P p3, C0420d dVar) {
        super(2, dVar);
        this.f656k = p3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new C0038n(this.f656k, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0038n) c((e) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f655j;
        if (i3 == 0) {
            a.V(obj);
            this.f655j = 1;
            if (P.c(this.f656k, this) == aVar) {
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
