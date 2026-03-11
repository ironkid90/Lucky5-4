package k2;

import I2.C0069u;
import M0.a;
import java.util.List;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class t extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f3959j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C0281I f3960k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List f3961l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(C0281I i3, List list, C0420d dVar) {
        super(2, dVar);
        this.f3960k = i3;
        this.f3961l = list;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new t(this.f3960k, this.f3961l, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((t) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f3959j;
        if (i3 == 0) {
            a.V(obj);
            this.f3959j = 1;
            obj = C0281I.g(this.f3960k, this.f3961l, this);
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
