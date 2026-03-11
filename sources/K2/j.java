package K2;

import A2.i;
import B.m;
import I2.m0;
import N2.a;
import N2.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
import r2.C0425i;
import z2.l;

public final class j extends u {

    /* renamed from: j  reason: collision with root package name */
    public final b f902j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicReferenceArray f903k = new AtomicReferenceArray(d.f879b * 2);

    public j(long j3, j jVar, b bVar, int i3) {
        super(j3, jVar, i3);
        this.f902j = bVar;
    }

    public final int f() {
        return d.f879b;
    }

    public final void g(int i3, C0425i iVar) {
        boolean z3;
        b bVar;
        m mVar;
        int i4 = d.f879b;
        if (i3 >= i4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i3 -= i4;
        }
        Object obj = this.f903k.get(i3 * 2);
        while (true) {
            Object k3 = k(i3);
            boolean z4 = k3 instanceof m0;
            bVar = this.f902j;
            if (z4 || (k3 instanceof s)) {
                if (z3) {
                    mVar = d.f887j;
                } else {
                    mVar = d.f888k;
                }
                if (j(i3, k3, mVar)) {
                    m(i3, (Object) null);
                    l(i3, !z3);
                    if (z3) {
                        i.b(bVar);
                        l lVar = bVar.f876g;
                        if (lVar != null) {
                            a.a(lVar, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (k3 == d.f887j || k3 == d.f888k) {
                m(i3, (Object) null);
            } else if (!(k3 == d.f884g || k3 == d.f883f)) {
                if (k3 != d.f886i && k3 != d.f881d && k3 != d.f889l) {
                    throw new IllegalStateException(("unexpected state: " + k3).toString());
                }
                return;
            }
        }
        m(i3, (Object) null);
        if (z3) {
            i.b(bVar);
            l lVar2 = bVar.f876g;
            if (lVar2 != null) {
                a.a(lVar2, obj, iVar);
            }
        }
    }

    public final boolean j(int i3, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f903k;
        int i4 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.f903k.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z3) {
        if (z3) {
            b bVar = this.f902j;
            i.b(bVar);
            bVar.C((this.f1221h * ((long) d.f879b)) + ((long) i3));
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f903k.lazySet(i3 * 2, obj);
    }

    public final void n(int i3, m mVar) {
        this.f903k.set((i3 * 2) + 1, mVar);
    }
}
