package k2;

import A2.i;
import B.m;
import I2.C0069u;
import M.g;
import M0.a;
import android.content.Context;
import java.util.List;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

/* renamed from: k2.i  reason: case insensitive filesystem */
public final class C0294i extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f3920j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C0281I f3921k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List f3922l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0294i(C0281I i3, List list, C0420d dVar) {
        super(2, dVar);
        this.f3921k = i3;
        this.f3922l = list;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new C0294i(this.f3921k, this.f3922l, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0294i) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f3920j;
        if (i3 == 0) {
            a.V(obj);
            Context context = this.f3921k.f3892f;
            if (context != null) {
                m a2 = C0282J.a(context);
                C0293h hVar = new C0293h(this.f3922l, (C0420d) null);
                this.f3920j = 1;
                obj = a2.l(new g(hVar, (C0420d) null), this);
                if (obj == aVar) {
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
        return obj;
    }
}
