package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.b;
import j$.time.e;
import j$.time.format.y;
import j$.time.h;
import j$.time.n;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.w;
import j$.time.v;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class s extends C0527a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final s f5038d = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    public final m N(int i3) {
        if (i3 == 0) {
            return t.BCE;
        }
        if (i3 == 1) {
            return t.CE;
        }
        throw new RuntimeException("Invalid era: " + i3);
    }

    private s() {
    }

    public final String s() {
        return "ISO";
    }

    public final String R() {
        return "iso8601";
    }

    public final C0528b G(int i3, int i4, int i5) {
        return h.g0(i3, i4, i5);
    }

    public final C0528b A(int i3, int i4) {
        return h.j0(i3, i4);
    }

    public final C0528b q(long j3) {
        return h.i0(j3);
    }

    public final C0528b t(TemporalAccessor temporalAccessor) {
        return h.J(temporalAccessor);
    }

    public final C0531e x(LocalDateTime localDateTime) {
        return LocalDateTime.C(localDateTime);
    }

    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.C(instant, zoneId);
    }

    public final C0528b L() {
        return h.J(h.f0(b.b()));
    }

    public static boolean Z(long j3) {
        return (3 & j3) == 0 && (j3 % 100 != 0 || j3 % 400 == 0);
    }

    public final int w(m mVar, int i3) {
        if (mVar instanceof t) {
            return mVar == t.CE ? i3 : 1 - i3;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    public final List D() {
        return e.a(t.values());
    }

    public final C0528b P(Map map, y yVar) {
        return (h) super.P(map, yVar);
    }

    /* access modifiers changed from: package-private */
    public final void S(Map map, y yVar) {
        a aVar = a.PROLEPTIC_MONTH;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            if (yVar != y.LENIENT) {
                aVar.a0(l3.longValue());
            }
            long j3 = (long) 12;
            C0527a.p(map, a.MONTH_OF_YEAR, (long) (((int) Math.floorMod(l3.longValue(), j3)) + 1));
            C0527a.p(map, a.YEAR, Math.floorDiv(l3.longValue(), j3));
        }
    }

    /* access modifiers changed from: package-private */
    public final C0528b W(Map map, y yVar) {
        a aVar = a.YEAR_OF_ERA;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            if (yVar != y.LENIENT) {
                aVar.a0(l3.longValue());
            }
            Long l4 = (Long) map.remove(a.ERA);
            if (l4 == null) {
                a aVar2 = a.YEAR;
                Long l5 = (Long) map.get(aVar2);
                if (yVar != y.STRICT) {
                    C0527a.p(map, aVar2, (l5 == null || l5.longValue() > 0) ? l3.longValue() : Math.subtractExact(1, l3.longValue()));
                    return null;
                } else if (l5 != null) {
                    int i3 = (l5.longValue() > 0 ? 1 : (l5.longValue() == 0 ? 0 : -1));
                    long longValue = l3.longValue();
                    if (i3 <= 0) {
                        longValue = Math.subtractExact(1, longValue);
                    }
                    C0527a.p(map, aVar2, longValue);
                    return null;
                } else {
                    map.put(aVar, l3);
                    return null;
                }
            } else if (l4.longValue() == 1) {
                C0527a.p(map, a.YEAR, l3.longValue());
                return null;
            } else if (l4.longValue() == 0) {
                C0527a.p(map, a.YEAR, Math.subtractExact(1, l3.longValue()));
                return null;
            } else {
                throw new RuntimeException("Invalid value for era: " + l4);
            }
        } else {
            a aVar3 = a.ERA;
            if (!map.containsKey(aVar3)) {
                return null;
            }
            aVar3.a0(((Long) map.get(aVar3)).longValue());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final C0528b T(Map map, y yVar) {
        a aVar = a.YEAR;
        int Z = aVar.Z(((Long) map.remove(aVar)).longValue());
        boolean z3 = true;
        if (yVar == y.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(a.MONTH_OF_YEAR)).longValue(), 1);
            return h.g0(Z, 1, 1).m0(subtractExact).l0(Math.subtractExact(((Long) map.remove(a.DAY_OF_MONTH)).longValue(), 1));
        }
        a aVar2 = a.MONTH_OF_YEAR;
        int Z2 = aVar2.Z(((Long) map.remove(aVar2)).longValue());
        a aVar3 = a.DAY_OF_MONTH;
        int Z3 = aVar3.Z(((Long) map.remove(aVar3)).longValue());
        if (yVar == y.SMART) {
            if (Z2 == 4 || Z2 == 6 || Z2 == 9 || Z2 == 11) {
                Z3 = Math.min(Z3, 30);
            } else if (Z2 == 2) {
                n nVar = n.FEBRUARY;
                long j3 = (long) Z;
                int i3 = v.f5193b;
                if ((3 & j3) != 0 || (j3 % 100 == 0 && j3 % 400 != 0)) {
                    z3 = false;
                }
                Z3 = Math.min(Z3, nVar.C(z3));
            }
        }
        return h.g0(Z, Z2, Z3);
    }

    public final w U(a aVar) {
        return aVar.C();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new E((byte) 1, this);
    }
}
