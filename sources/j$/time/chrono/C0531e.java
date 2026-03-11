package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.l;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.s;
import j$.time.temporal.t;
import java.util.Objects;

/* renamed from: j$.time.chrono.e  reason: case insensitive filesystem */
public interface C0531e extends m, n, Comparable {
    ChronoZonedDateTime H(ZoneId zoneId);

    l n();

    C0528b o();

    l h() {
        return o().h();
    }

    /* renamed from: k */
    C0531e e(long j3, b bVar) {
        return C0533g.r(h(), super.e(j3, bVar));
    }

    Object a(t tVar) {
        if (tVar == s.g() || tVar == s.f() || tVar == s.d()) {
            return null;
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

    m c(m mVar) {
        return mVar.b(o().v(), a.EPOCH_DAY).b(n().l0(), a.NANO_OF_DAY);
    }

    long Y(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((o().v() * 86400) + ((long) n().m0())) - ((long) zoneOffset.Z());
    }

    /* renamed from: X */
    int compareTo(C0531e eVar) {
        int V3 = o().compareTo(eVar.o());
        if (V3 != 0) {
            return V3;
        }
        int r3 = n().compareTo(eVar.n());
        if (r3 != 0) {
            return r3;
        }
        return ((C0527a) h()).s().compareTo(eVar.h().s());
    }
}
