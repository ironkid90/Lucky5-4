package M2;

import L2.e;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class g extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f1112j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f1113k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ h f1114l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, C0420d dVar) {
        super(2, dVar);
        this.f1114l = hVar;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        g gVar = new g(this.f1114l, dVar);
        gVar.f1113k = obj;
        return gVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((g) c((e) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f1112j;
        C0368h hVar = C0368h.f4194a;
        if (i3 == 0) {
            a.V(obj);
            this.f1112j = 1;
            Object g2 = this.f1114l.f1115i.g((e) this.f1113k, this);
            if (g2 != aVar) {
                g2 = hVar;
            }
            if (g2 == aVar) {
                return aVar;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return hVar;
    }
}
