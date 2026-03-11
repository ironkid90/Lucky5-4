package k2;

import A2.i;
import A2.q;
import I.C0032h;
import I2.C0069u;
import L2.t;
import M.e;
import M0.a;
import android.content.Context;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

/* renamed from: k2.s  reason: case insensitive filesystem */
public final class C0304s extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public q f3954j;

    /* renamed from: k  reason: collision with root package name */
    public int f3955k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f3956l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0281I f3957m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ q f3958n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0304s(String str, C0281I i3, q qVar, C0420d dVar) {
        super(2, dVar);
        this.f3956l = str;
        this.f3957m = i3;
        this.f3958n = qVar;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new C0304s(this.f3956l, this.f3957m, this.f3958n, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0304s) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        q qVar;
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f3955k;
        if (i3 == 0) {
            a.V(obj);
            e eVar = new e(this.f3956l);
            Context context = this.f3957m.f3892f;
            if (context != null) {
                C0299n nVar = new C0299n(((C0032h) C0282J.a(context).f100g).o(), eVar, 1);
                q qVar2 = this.f3958n;
                this.f3954j = qVar2;
                this.f3955k = 1;
                Object c3 = t.c(nVar, this);
                if (c3 == aVar) {
                    return aVar;
                }
                qVar = qVar2;
                obj = c3;
            } else {
                i.g("context");
                throw null;
            }
        } else if (i3 == 1) {
            qVar = this.f3954j;
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qVar.f86f = obj;
        return C0368h.f4194a;
    }
}
