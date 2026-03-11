package I;

import A2.q;
import L2.e;
import M2.a;
import S1.m;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;

/* renamed from: I.y  reason: case insensitive filesystem */
public final class C0048y implements e {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f690f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f691g;

    public /* synthetic */ C0048y(int i3, Object obj) {
        this.f690f = i3;
        this.f691g = obj;
    }

    public final Object b(Object obj, C0420d dVar) {
        Object d3;
        switch (this.f690f) {
            case 0:
                C0368h hVar = (C0368h) obj;
                P p3 = (P) this.f691g;
                boolean z3 = p3.f575m.r() instanceof Q;
                C0368h hVar2 = C0368h.f4194a;
                if (z3 || (d3 = P.d(p3, true, dVar)) != C0466a.f4632f) {
                    return hVar2;
                }
                return d3;
            case 1:
                ((q) this.f691g).f86f = obj;
                throw new a(this);
            default:
                ((m) this.f691g).accept(obj);
                return C0368h.f4194a;
        }
    }
}
