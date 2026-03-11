package k2;

import A2.i;
import M.b;
import M.e;
import M0.a;
import java.util.List;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

/* renamed from: k2.h  reason: case insensitive filesystem */
public final class C0293h extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f3918j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List f3919k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0293h(List list, C0420d dVar) {
        super(2, dVar);
        this.f3919k = list;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        C0293h hVar = new C0293h(this.f3919k, dVar);
        hVar.f3918j = obj;
        return hVar;
    }

    public final Object i(Object obj, Object obj2) {
        C0368h hVar = C0368h.f4194a;
        ((C0293h) c((b) obj, (C0420d) obj2)).l(hVar);
        return hVar;
    }

    public final Object l(Object obj) {
        a.V(obj);
        b bVar = (b) this.f3918j;
        List<String> list = this.f3919k;
        if (list != null) {
            for (String str : list) {
                i.e(str, "name");
                e eVar = new e(str);
                bVar.b();
                bVar.f1071a.remove(eVar);
            }
        } else {
            bVar.b();
            bVar.f1071a.clear();
        }
        return C0368h.f4194a;
    }
}
