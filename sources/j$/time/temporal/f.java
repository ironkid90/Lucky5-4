package j$.time.temporal;

import j$.time.format.y;
import j$.time.h;
import java.util.HashMap;

/* 'enum' modifier removed */
final class f extends h {
    public final w C() {
        return w.k(52, 53);
    }

    f() {
        super("WEEK_OF_WEEK_BASED_YEAR", 2);
    }

    public final boolean W(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY) && j.a(temporalAccessor);
    }

    public final w J(TemporalAccessor temporalAccessor) {
        if (W(temporalAccessor)) {
            return h.d0(h.J(temporalAccessor));
        }
        throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
    }

    public final long r(TemporalAccessor temporalAccessor) {
        if (W(temporalAccessor)) {
            return (long) h.a0(h.J(temporalAccessor));
        }
        throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
    }

    public final m p(m mVar, long j3) {
        C().b(j3, this);
        return mVar.d(Math.subtractExact(j3, r(mVar)), b.WEEKS);
    }

    public final TemporalAccessor S(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
        h hVar;
        long j3;
        long j4;
        HashMap hashMap2 = hashMap;
        y yVar2 = yVar;
        h hVar2 = h.WEEK_BASED_YEAR;
        Long l3 = (Long) hashMap2.get(hVar2);
        a aVar = a.DAY_OF_WEEK;
        Long l4 = (Long) hashMap2.get(aVar);
        if (l3 == null || l4 == null) {
            return null;
        }
        int a2 = hVar2.C().a(l3.longValue(), hVar2);
        long longValue = ((Long) hashMap2.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
        if (j.a(temporalAccessor)) {
            h g02 = h.g0(a2, 1, 4);
            if (yVar2 == y.LENIENT) {
                long longValue2 = l4.longValue();
                if (longValue2 > 7) {
                    long j5 = longValue2 - 1;
                    g02 = g02.n0(j5 / 7);
                    j4 = j5 % 7;
                } else {
                    j3 = 1;
                    if (longValue2 < 1) {
                        g02 = g02.n0(Math.subtractExact(longValue2, 7) / 7);
                        j4 = (longValue2 + 6) % 7;
                    }
                    hVar = g02.n0(Math.subtractExact(longValue, j3)).b(longValue2, aVar);
                }
                j3 = 1;
                longValue2 = j4 + 1;
                hVar = g02.n0(Math.subtractExact(longValue, j3)).b(longValue2, aVar);
            } else {
                int Z = aVar.Z(l4.longValue());
                if (longValue < 1 || longValue > 52) {
                    if (yVar2 == y.STRICT) {
                        h.d0(g02).b(longValue, this);
                    } else {
                        C().b(longValue, this);
                    }
                }
                hVar = g02.n0(longValue - 1).b((long) Z, aVar);
            }
            hashMap2.remove(this);
            hashMap2.remove(hVar2);
            hashMap2.remove(aVar);
            return hVar;
        }
        throw new RuntimeException("Resolve requires IsoChronology");
    }

    public final String toString() {
        return "WeekOfWeekBasedYear";
    }
}
