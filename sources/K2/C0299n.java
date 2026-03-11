package k2;

import L.k;
import L2.d;
import M.e;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;

/* renamed from: k2.n  reason: case insensitive filesystem */
public final class C0299n implements d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3935f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f3936g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f3937h;

    public /* synthetic */ C0299n(d dVar, e eVar, int i3) {
        this.f3935f = i3;
        this.f3936g = dVar;
        this.f3937h = eVar;
    }

    public final Object g(L2.e eVar, C0420d dVar) {
        switch (this.f3935f) {
            case 0:
                Object g2 = this.f3936g.g(new C0298m(eVar, this.f3937h, 0), dVar);
                if (g2 == C0466a.f4632f) {
                    return g2;
                }
                return C0368h.f4194a;
            case 1:
                Object g3 = this.f3936g.g(new C0298m(eVar, this.f3937h, 1), dVar);
                if (g3 == C0466a.f4632f) {
                    return g3;
                }
                return C0368h.f4194a;
            case k.FLOAT_FIELD_NUMBER:
                Object g4 = this.f3936g.g(new C0298m(eVar, this.f3937h, 2), dVar);
                if (g4 == C0466a.f4632f) {
                    return g4;
                }
                return C0368h.f4194a;
            default:
                Object g5 = this.f3936g.g(new C0298m(eVar, this.f3937h, 3), dVar);
                if (g5 == C0466a.f4632f) {
                    return g5;
                }
                return C0368h.f4194a;
        }
    }
}
