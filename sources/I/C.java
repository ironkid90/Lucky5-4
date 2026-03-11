package I;

import M0.a;
import p2.C0363c;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.l;

public final class C extends C0488f implements l {

    /* renamed from: j  reason: collision with root package name */
    public Throwable f514j;

    /* renamed from: k  reason: collision with root package name */
    public int f515k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ P f516l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C(P p3, C0420d dVar) {
        super(1, dVar);
        this.f516l = p3;
    }

    public final Object j(Object obj) {
        return new C(this.f516l, (C0420d) obj).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        a0 a0Var;
        Throwable th;
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f515k;
        P p3 = this.f516l;
        if (i3 == 0) {
            a.V(obj);
            this.f515k = 1;
            obj = P.e(p3, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i3 == 1) {
            try {
                a.V(obj);
            } catch (Throwable th2) {
                Z f3 = p3.f();
                this.f514j = th2;
                this.f515k = 2;
                Integer a2 = f3.a();
                if (a2 == aVar) {
                    return aVar;
                }
                th = th2;
                obj = a2;
            }
        } else if (i3 == 2) {
            th = this.f514j;
            a.V(obj);
            a0Var = new T(th, ((Number) obj).intValue());
            return new C0363c(a0Var, Boolean.TRUE);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0Var = (a0) obj;
        return new C0363c(a0Var, Boolean.TRUE);
    }
}
