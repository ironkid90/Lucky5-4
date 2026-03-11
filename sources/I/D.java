package I;

import M0.a;
import p2.C0363c;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class D extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public Throwable f517j;

    /* renamed from: k  reason: collision with root package name */
    public int f518k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ boolean f519l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ P f520m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f521n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public D(P p3, int i3, C0420d dVar) {
        super(2, dVar);
        this.f520m = p3;
        this.f521n = i3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        D d3 = new D(this.f520m, this.f521n, dVar);
        d3.f519l = ((Boolean) obj).booleanValue();
        return d3;
    }

    public final Object i(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((D) c(bool, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        a0 a0Var;
        boolean z3;
        int i3;
        Throwable th;
        boolean z4;
        C0466a aVar = C0466a.f4632f;
        int i4 = this.f518k;
        P p3 = this.f520m;
        if (i4 == 0) {
            a.V(obj);
            z3 = this.f519l;
            this.f519l = z3;
            this.f518k = 1;
            obj = P.e(p3, z3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i4 == 1) {
            z3 = this.f519l;
            try {
                a.V(obj);
            } catch (Throwable th2) {
                if (z3) {
                    Z f3 = p3.f();
                    this.f517j = th2;
                    this.f519l = z3;
                    this.f518k = 2;
                    Integer a2 = f3.a();
                    if (a2 == aVar) {
                        return aVar;
                    }
                    z4 = z3;
                    th = th2;
                    obj = a2;
                } else {
                    boolean z5 = z3;
                    th = th2;
                    i3 = this.f521n;
                    z4 = z5;
                }
            }
        } else if (i4 == 2) {
            z4 = this.f519l;
            th = this.f517j;
            a.V(obj);
            i3 = ((Number) obj).intValue();
            T t3 = new T(th, i3);
            z3 = z4;
            a0Var = t3;
            return new C0363c(a0Var, Boolean.valueOf(z3));
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0Var = (a0) obj;
        return new C0363c(a0Var, Boolean.valueOf(z3));
    }
}
