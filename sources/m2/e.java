package M2;

import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class e extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f1106j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f1107k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ f f1108l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar, C0420d dVar) {
        super(2, dVar);
        this.f1108l = fVar;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        e eVar = new e(this.f1108l, dVar);
        eVar.f1107k = obj;
        return eVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((e) c((K2.p) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f1106j;
        if (i3 == 0) {
            a.V(obj);
            this.f1106j = 1;
            if (this.f1108l.a((K2.p) this.f1107k, this) == aVar) {
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
