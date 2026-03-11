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

/* renamed from: k2.D  reason: case insensitive filesystem */
public final class C0276D extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f3873j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f3874k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ C0281I f3875l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ double f3876m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0276D(String str, C0281I i3, double d3, C0420d dVar) {
        super(2, dVar);
        this.f3874k = str;
        this.f3875l = i3;
        this.f3876m = d3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new C0276D(this.f3874k, this.f3875l, this.f3876m, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0276D) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f3873j;
        if (i3 == 0) {
            a.V(obj);
            e eVar = new e(this.f3874k);
            Context context = this.f3875l.f3892f;
            if (context != null) {
                m a2 = C0282J.a(context);
                C0275C c3 = new C0275C(eVar, this.f3876m, (C0420d) null);
                this.f3873j = 1;
                if (a2.l(new g(c3, (C0420d) null), this) == aVar) {
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
