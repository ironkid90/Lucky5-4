package k2;

import M.b;
import M.e;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

/* renamed from: k2.j  reason: case insensitive filesystem */
public final class C0295j extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f3923j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e f3924k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f3925l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0295j(e eVar, String str, C0420d dVar) {
        super(2, dVar);
        this.f3924k = eVar;
        this.f3925l = str;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        C0295j jVar = new C0295j(this.f3924k, this.f3925l, dVar);
        jVar.f3923j = obj;
        return jVar;
    }

    public final Object i(Object obj, Object obj2) {
        C0368h hVar = C0368h.f4194a;
        ((C0295j) c((b) obj, (C0420d) obj2)).l(hVar);
        return hVar;
    }

    public final Object l(Object obj) {
        a.V(obj);
        ((b) this.f3923j).d(this.f3924k, this.f3925l);
        return C0368h.f4194a;
    }
}
