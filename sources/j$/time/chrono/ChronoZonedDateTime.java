package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.C0528b;
import j$.time.l;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;

public interface ChronoZonedDateTime<D extends C0528b> extends m, Comparable<ChronoZonedDateTime<?>> {
    C0531e B();

    ZoneOffset E();

    ChronoZonedDateTime I(ZoneId zoneId);

    ZoneId Q();

    ChronoZonedDateTime b(long j3, r rVar);

    ChronoZonedDateTime d(long j3, u uVar);

    w l(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.J(this);
        }
        if (rVar == a.INSTANT_SECONDS || rVar == a.OFFSET_SECONDS) {
            return ((a) rVar).C();
        }
        return B().l(rVar);
    }

    int i(r rVar) {
        if (!(rVar instanceof a)) {
            return super.i(rVar);
        }
        int i3 = C0535i.f5014a[((a) rVar).ordinal()];
        if (i3 == 1) {
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        } else if (i3 != 2) {
            return B().i(rVar);
        } else {
            return E().Z();
        }
    }

    long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i3 = C0535i.f5014a[((a) rVar).ordinal()];
        if (i3 == 1) {
            return O();
        }
        if (i3 != 2) {
            return B().g(rVar);
        }
        return (long) E().Z();
    }

    C0528b o() {
        return B().o();
    }

    l n() {
        return B().n();
    }

    l h() {
        return o().h();
    }

    /* renamed from: m */
    ChronoZonedDateTime j(n nVar) {
        return k.r(h(), nVar.c(this));
    }

    /* renamed from: k */
    ChronoZonedDateTime e(long j3, b bVar) {
        return k.r(h(), super.e(j3, bVar));
    }

    Object a(t tVar) {
        if (tVar == s.f() || tVar == s.g()) {
            return Q();
        }
        if (tVar == s.d()) {
            return E();
        }
        if (tVar == s.c()) {
            return n();
        }
        if (tVar == s.a()) {
            return h();
        }
        if (tVar == s.e()) {
            return b.NANOS;
        }
        return tVar.j(this);
    }

    Instant toInstant() {
        return Instant.W(O(), (long) n().Z());
    }

    long O() {
        return ((o().v() * 86400) + ((long) n().m0())) - ((long) E().Z());
    }

    /* renamed from: z */
    int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int compare = Long.compare(O(), chronoZonedDateTime.O());
        if (compare != 0) {
            return compare;
        }
        int Z = n().Z() - chronoZonedDateTime.n().Z();
        if (Z != 0) {
            return Z;
        }
        int X2 = B().compareTo(chronoZonedDateTime.B());
        if (X2 != 0) {
            return X2;
        }
        int compareTo = Q().s().compareTo(chronoZonedDateTime.Q().s());
        if (compareTo != 0) {
            return compareTo;
        }
        return ((C0527a) h()).s().compareTo(chronoZonedDateTime.h().s());
    }

    boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime) {
        int i3 = (O() > chronoZonedDateTime.O() ? 1 : (O() == chronoZonedDateTime.O() ? 0 : -1));
        return i3 < 0 || (i3 == 0 && n().Z() < chronoZonedDateTime.n().Z());
    }
}
