package b0;

import I.C0048y;
import I2.C0069u;
import L2.d;
import M0.a;
import S1.m;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

/* renamed from: b0.a  reason: case insensitive filesystem */
public final class C0125a extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f2661j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d f2662k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ m f2663l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0125a(d dVar, m mVar, C0420d dVar2) {
        super(2, dVar2);
        this.f2662k = dVar;
        this.f2663l = mVar;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new C0125a(this.f2662k, this.f2663l, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0125a) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f2661j;
        if (i3 == 0) {
            a.V(obj);
            C0048y yVar = new C0048y(2, this.f2663l);
            this.f2661j = 1;
            if (this.f2662k.g(yVar, this) == aVar) {
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
