package I;

import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.l;

/* renamed from: I.v  reason: case insensitive filesystem */
public final class C0045v extends C0488f implements l {

    /* renamed from: j  reason: collision with root package name */
    public int f677j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ G f678k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0045v(G g2, C0420d dVar) {
        super(1, dVar);
        this.f678k = g2;
    }

    public final Object j(Object obj) {
        return new C0045v(this.f678k, (C0420d) obj).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f677j;
        if (i3 == 0) {
            a.V(obj);
            this.f677j = 1;
            obj = this.f678k.j(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
