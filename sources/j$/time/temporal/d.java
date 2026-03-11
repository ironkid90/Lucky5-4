package j$.time.temporal;

import j$.time.chrono.s;
import j$.time.format.y;
import j$.time.h;
import java.util.HashMap;

/* 'enum' modifier removed */
final class d extends h {
    public final w C() {
        return w.k(90, 92);
    }

    d() {
        super("DAY_OF_QUARTER", 0);
    }

    public final boolean W(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.DAY_OF_YEAR) && temporalAccessor.f(a.MONTH_OF_YEAR) && temporalAccessor.f(a.YEAR) && j.a(temporalAccessor);
    }

    public final w J(TemporalAccessor temporalAccessor) {
        if (W(temporalAccessor)) {
            long g2 = temporalAccessor.g(h.QUARTER_OF_YEAR);
            if (g2 == 1) {
                long g3 = temporalAccessor.g(a.YEAR);
                s.f5038d.getClass();
                return s.Z(g3) ? w.j(1, 91) : w.j(1, 90);
            } else if (g2 == 2) {
                return w.j(1, 91);
            } else {
                if (g2 == 3 || g2 == 4) {
                    return w.j(1, 92);
                }
                return C();
            }
        } else {
            throw new RuntimeException("Unsupported field: DayOfQuarter");
        }
    }

    public final long r(TemporalAccessor temporalAccessor) {
        if (W(temporalAccessor)) {
            int i3 = temporalAccessor.i(a.DAY_OF_YEAR);
            int i4 = temporalAccessor.i(a.MONTH_OF_YEAR);
            long g2 = temporalAccessor.g(a.YEAR);
            int[] Z = h.f5165a;
            int i5 = (i4 - 1) / 3;
            s.f5038d.getClass();
            return (long) (i3 - Z[i5 + (s.Z(g2) ? 4 : 0)]);
        }
        throw new RuntimeException("Unsupported field: DayOfQuarter");
    }

    public final m p(m mVar, long j3) {
        long r3 = r(mVar);
        C().b(j3, this);
        a aVar = a.DAY_OF_YEAR;
        return mVar.b((j3 - r3) + mVar.g(aVar), aVar);
    }

    public final TemporalAccessor S(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
        long j3;
        h hVar;
        HashMap hashMap2 = hashMap;
        y yVar2 = yVar;
        a aVar = a.YEAR;
        Long l3 = (Long) hashMap2.get(aVar);
        h hVar2 = h.QUARTER_OF_YEAR;
        Long l4 = (Long) hashMap2.get(hVar2);
        if (l3 == null || l4 == null) {
            return null;
        }
        int Z = aVar.Z(l3.longValue());
        long longValue = ((Long) hashMap2.get(h.DAY_OF_QUARTER)).longValue();
        if (j.a(temporalAccessor)) {
            if (yVar2 == y.LENIENT) {
                hVar = h.g0(Z, 1, 1).m0(Math.multiplyExact(Math.subtractExact(l4.longValue(), 1), (long) 3));
                j3 = Math.subtractExact(longValue, 1);
            } else {
                h g02 = h.g0(Z, ((hVar2.C().a(l4.longValue(), hVar2) - 1) * 3) + 1, 1);
                if (longValue < 1 || longValue > 90) {
                    if (yVar2 == y.STRICT) {
                        J(g02).b(longValue, this);
                    } else {
                        C().b(longValue, this);
                    }
                }
                j3 = longValue - 1;
                hVar = g02;
            }
            hashMap2.remove(this);
            hashMap2.remove(aVar);
            hashMap2.remove(hVar2);
            return hVar.l0(j3);
        }
        throw new RuntimeException("Resolve requires IsoChronology");
    }

    public final String toString() {
        return "DayOfQuarter";
    }
}
