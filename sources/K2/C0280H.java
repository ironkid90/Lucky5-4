package k2;

import I2.C0069u;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

/* renamed from: k2.H  reason: case insensitive filesystem */
public final class C0280H extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f3888j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C0281I f3889k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f3890l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f3891m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0280H(C0281I i3, String str, String str2, C0420d dVar) {
        super(2, dVar);
        this.f3889k = i3;
        this.f3890l = str;
        this.f3891m = str2;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new C0280H(this.f3889k, this.f3890l, this.f3891m, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0280H) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f3888j;
        if (i3 == 0) {
            a.V(obj);
            this.f3888j = 1;
            if (C0281I.d(this.f3889k, this.f3890l, this.f3891m, this) == aVar) {
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
