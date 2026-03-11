package Q2;

import B.m;
import I2.C0054e;
import I2.C0055f;
import I2.m0;
import N2.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.C0368h;
import r2.C0425i;
import z2.l;

public final class c implements C0054e, m0 {

    /* renamed from: f  reason: collision with root package name */
    public final C0055f f1302f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f1303g;

    public c(d dVar, C0055f fVar) {
        this.f1303g = dVar;
        this.f1302f = fVar;
    }

    public final void a(u uVar, int i3) {
        this.f1302f.a(uVar, i3);
    }

    public final void f(Object obj, l lVar) {
        C0368h hVar = C0368h.f4194a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1304g;
        d dVar = this.f1303g;
        atomicReferenceFieldUpdater.set(dVar, (Object) null);
        this.f1302f.f(hVar, new b(0, dVar, this));
    }

    public final C0425i h() {
        return this.f1302f.f761j;
    }

    public final m k(Object obj, l lVar) {
        d dVar = this.f1303g;
        b bVar = new b(1, dVar, this);
        m k3 = this.f1302f.k((C0368h) obj, bVar);
        if (k3 != null) {
            d.f1304g.set(dVar, (Object) null);
        }
        return k3;
    }

    public final void m(Object obj) {
        this.f1302f.m(obj);
    }

    public final void o(Object obj) {
        this.f1302f.o(obj);
    }
}
