package K;

import A2.j;
import G0.f;
import R2.l;
import S2.b;
import j1.e;
import p2.C0368h;
import z2.a;

public final class d extends j implements a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f818g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f819h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i3) {
        super(0);
        this.f818g = i3;
        this.f819h = eVar;
    }

    public final Object a() {
        switch (this.f818g) {
            case 0:
                e eVar = this.f819h;
                l lVar = (l) eVar.f824c.a();
                if (b.a(lVar) != -1) {
                    return e.a(lVar.f1394f.n(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + eVar.f824c + ", instead got " + lVar).toString());
            default:
                f fVar = e.f821f;
                e eVar2 = this.f819h;
                synchronized (fVar) {
                    e.f820e.remove(((l) eVar2.f825d.a()).f1394f.n());
                }
                return C0368h.f4194a;
        }
    }
}
