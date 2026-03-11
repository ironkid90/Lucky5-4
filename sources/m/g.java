package M;

import M0.a;
import java.util.LinkedHashMap;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class g extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f1079j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f1080k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ C0488f f1081l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(p pVar, C0420d dVar) {
        super(2, dVar);
        this.f1081l = (C0488f) pVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [z2.p, t2.f] */
    public final C0420d c(Object obj, C0420d dVar) {
        g gVar = new g(this.f1081l, dVar);
        gVar.f1080k = obj;
        return gVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((g) c((b) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [z2.p, t2.f] */
    public final Object l(Object obj) {
        Object obj2 = C0466a.f4632f;
        int i3 = this.f1079j;
        if (i3 == 0) {
            a.V(obj);
            b bVar = new b(new LinkedHashMap(((b) this.f1080k).a()), false);
            this.f1080k = bVar;
            this.f1079j = 1;
            if (this.f1081l.i(bVar, this) == obj2) {
                return obj2;
            }
            return bVar;
        } else if (i3 == 1) {
            b bVar2 = (b) this.f1080k;
            a.V(obj);
            return bVar2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
