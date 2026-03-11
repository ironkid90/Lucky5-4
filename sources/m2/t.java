package M2;

import L2.e;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class t extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f1132j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f1133k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ e f1134l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(e eVar, C0420d dVar) {
        super(2, dVar);
        this.f1134l = eVar;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        t tVar = new t(this.f1134l, dVar);
        tVar.f1133k = obj;
        return tVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((t) c(obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f1132j;
        if (i3 == 0) {
            a.V(obj);
            Object obj2 = this.f1133k;
            this.f1132j = 1;
            if (this.f1134l.b(obj2, this) == aVar) {
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
