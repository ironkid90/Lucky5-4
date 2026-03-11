package M2;

import A2.i;
import I2.C0065p;
import I2.C0071w;
import K2.p;
import L2.d;
import L2.e;
import L2.l;
import N2.a;
import p2.C0368h;
import r2.C0420d;
import r2.C0421e;
import r2.C0425i;
import s2.C0466a;

public final class h extends f {

    /* renamed from: i  reason: collision with root package name */
    public final d f1115i;

    public h(d dVar, C0425i iVar, int i3, int i4) {
        super(iVar, i3, i4);
        this.f1115i = dVar;
    }

    public final Object a(p pVar, C0420d dVar) {
        Object g2 = this.f1115i.g(new r(pVar), dVar);
        C0466a aVar = C0466a.f4632f;
        C0368h hVar = C0368h.f4194a;
        if (g2 != aVar) {
            g2 = hVar;
        }
        if (g2 == aVar) {
            return g2;
        }
        return hVar;
    }

    public final f b(C0425i iVar, int i3, int i4) {
        return new h(this.f1115i, iVar, i3, i4);
    }

    public final Object g(e eVar, C0420d dVar) {
        Object g2;
        C0425i iVar;
        C0368h hVar = C0368h.f4194a;
        int i3 = this.f1110g;
        C0466a aVar = C0466a.f4632f;
        if (i3 == -3) {
            C0425i h3 = dVar.h();
            Boolean bool = Boolean.FALSE;
            C0065p pVar = C0065p.f779i;
            C0425i iVar2 = this.f1109f;
            if (!((Boolean) iVar2.e(bool, pVar)).booleanValue()) {
                iVar = h3.d(iVar2);
            } else {
                iVar = C0071w.b(h3, iVar2, false);
            }
            if (i.a(iVar, h3)) {
                g2 = this.f1115i.g(eVar, dVar);
                if (g2 != aVar) {
                    g2 = hVar;
                }
                if (g2 != aVar) {
                    return hVar;
                }
            } else {
                C0421e eVar2 = C0421e.f4456f;
                if (i.a(iVar.n(eVar2), h3.n(eVar2))) {
                    C0425i h4 = dVar.h();
                    if (!(eVar instanceof r)) {
                        eVar = new l(eVar, h4);
                    }
                    Object b3 = l.b(iVar, eVar, a.l(iVar), new g(this, (C0420d) null), dVar);
                    if (b3 != aVar) {
                        b3 = hVar;
                    }
                    if (g2 != aVar) {
                        return hVar;
                    }
                }
            }
            return g2;
        }
        g2 = super.g(eVar, dVar);
        if (g2 != aVar) {
            return hVar;
        }
        return g2;
    }

    public final String toString() {
        return this.f1115i + " -> " + super.toString();
    }
}
