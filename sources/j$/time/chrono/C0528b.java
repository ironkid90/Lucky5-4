package j$.time.chrono;

import j$.time.l;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;

/* renamed from: j$.time.chrono.b  reason: case insensitive filesystem */
public interface C0528b extends m, n, Comparable {
    C0528b M(q qVar);

    C0528b b(long j3, r rVar);

    C0528b d(long j3, u uVar);

    boolean equals(Object obj);

    l h();

    int hashCode();

    C0528b m(n nVar);

    String toString();

    m u() {
        return h().N(i(a.ERA));
    }

    boolean f(r rVar) {
        if (rVar instanceof a) {
            return ((a) rVar).T();
        }
        return rVar != null && rVar.W(this);
    }

    C0528b e(long j3, u uVar) {
        return C0530d.r(h(), super.e(j3, uVar));
    }

    Object a(t tVar) {
        if (tVar == s.g() || tVar == s.f() || tVar == s.d() || tVar == s.c()) {
            return null;
        }
        if (tVar == s.a()) {
            return h();
        }
        if (tVar == s.e()) {
            return b.DAYS;
        }
        return tVar.j(this);
    }

    m c(m mVar) {
        return mVar.b(v(), a.EPOCH_DAY);
    }

    C0531e K(l lVar) {
        return C0533g.C(this, lVar);
    }

    long v() {
        return g(a.EPOCH_DAY);
    }

    /* renamed from: V */
    int compareTo(C0528b bVar) {
        int compare = Long.compare(v(), bVar.v());
        if (compare != 0) {
            return compare;
        }
        return ((C0527a) h()).s().compareTo(bVar.h().s());
    }
}
