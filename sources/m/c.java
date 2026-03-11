package M;

import A2.i;
import M0.a;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class c extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f1073j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f1074k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ C0488f f1075l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(p pVar, C0420d dVar) {
        super(2, dVar);
        this.f1075l = (C0488f) pVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [z2.p, t2.f] */
    public final C0420d c(Object obj, C0420d dVar) {
        c cVar = new c(this.f1075l, dVar);
        cVar.f1074k = obj;
        return cVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((c) c((b) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [z2.p, t2.f] */
    public final Object l(Object obj) {
        Object obj2 = C0466a.f4632f;
        int i3 = this.f1073j;
        if (i3 == 0) {
            a.V(obj);
            this.f1073j = 1;
            obj = this.f1075l.i((b) this.f1074k, this);
            if (obj == obj2) {
                return obj2;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b bVar = (b) obj;
        i.c(bVar, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar.f1072b.f322g).set(true);
        return bVar;
    }
}
