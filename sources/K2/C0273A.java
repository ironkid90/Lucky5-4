package k2;

import A2.i;
import B.m;
import I2.C0069u;
import M.e;
import M.g;
import M0.a;
import android.content.Context;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

/* renamed from: k2.A  reason: case insensitive filesystem */
public final class C0273A extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f3862j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f3863k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ C0281I f3864l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f3865m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0273A(String str, C0281I i3, boolean z3, C0420d dVar) {
        super(2, dVar);
        this.f3863k = str;
        this.f3864l = i3;
        this.f3865m = z3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new C0273A(this.f3863k, this.f3864l, this.f3865m, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0273A) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f3862j;
        if (i3 == 0) {
            a.V(obj);
            e eVar = new e(this.f3863k);
            Context context = this.f3864l.f3892f;
            if (context != null) {
                m a2 = C0282J.a(context);
                z zVar = new z(eVar, this.f3865m, (C0420d) null);
                this.f3862j = 1;
                if (a2.l(new g(zVar, (C0420d) null), this) == aVar) {
                    return aVar;
                }
            } else {
                i.g("context");
                throw null;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C0368h.f4194a;
    }
}
