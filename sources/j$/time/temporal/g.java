package j$.time.temporal;

import j$.time.h;

/* 'enum' modifier removed */
final class g extends h {
    g() {
        super("WEEK_BASED_YEAR", 3);
    }

    public final w C() {
        return a.YEAR.C();
    }

    public final boolean W(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY) && j.a(temporalAccessor);
    }

    public final long r(TemporalAccessor temporalAccessor) {
        if (W(temporalAccessor)) {
            return (long) h.e0(h.J(temporalAccessor));
        }
        throw new RuntimeException("Unsupported field: WeekBasedYear");
    }

    public final w J(TemporalAccessor temporalAccessor) {
        if (W(temporalAccessor)) {
            return C();
        }
        throw new RuntimeException("Unsupported field: WeekBasedYear");
    }

    public final m p(m mVar, long j3) {
        if (W(mVar)) {
            int a2 = a.YEAR.C().a(j3, h.WEEK_BASED_YEAR);
            h J = h.J(mVar);
            a aVar = a.DAY_OF_WEEK;
            int i3 = J.i(aVar);
            int a02 = h.a0(J);
            if (a02 == 53 && h.f0(a2) == 52) {
                a02 = 52;
            }
            h g02 = h.g0(a2, 1, 4);
            return mVar.j(g02.l0((long) (((a02 - 1) * 7) + (i3 - g02.i(aVar)))));
        }
        throw new RuntimeException("Unsupported field: WeekBasedYear");
    }

    public final String toString() {
        return "WeekBasedYear";
    }
}
