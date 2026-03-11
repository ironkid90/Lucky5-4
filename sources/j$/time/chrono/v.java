package j$.time.chrono;

import L.k;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.b;
import j$.time.c;
import j$.time.e;
import j$.time.format.y;
import j$.time.h;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.p;
import j$.time.temporal.w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class v extends C0527a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final v f5041d = new v();
    private static final long serialVersionUID = 459996390165777884L;

    private v() {
    }

    public final String s() {
        return "Japanese";
    }

    public final String R() {
        return "japanese";
    }

    public final C0528b G(int i3, int i4, int i5) {
        return new x(h.g0(i3, i4, i5));
    }

    public final C0528b A(int i3, int i4) {
        return new x(h.j0(i3, i4));
    }

    public final C0528b q(long j3) {
        return new x(h.i0(j3));
    }

    public final C0528b L() {
        return new x(h.J(h.f0(b.b())));
    }

    public final C0528b t(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof x) {
            return (x) temporalAccessor;
        }
        return new x(h.J(temporalAccessor));
    }

    public final int w(m mVar, int i3) {
        if (mVar instanceof y) {
            y yVar = (y) mVar;
            int b02 = (yVar.s().b0() + i3) - 1;
            if (i3 == 1) {
                return b02;
            }
            if (b02 >= -999999999 && b02 <= 999999999 && b02 >= yVar.s().b0() && mVar == y.q(h.g0(b02, 1, 1))) {
                return b02;
            }
            throw new RuntimeException("Invalid yearOfEra value");
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    public final m N(int i3) {
        return y.w(i3);
    }

    public final List D() {
        return e.a(y.A());
    }

    public final w U(a aVar) {
        switch (u.f5040a[aVar.ordinal()]) {
            case 1:
            case k.FLOAT_FIELD_NUMBER:
            case k.INTEGER_FIELD_NUMBER:
            case k.LONG_FIELD_NUMBER:
                throw new RuntimeException("Unsupported field: " + aVar);
            case k.STRING_FIELD_NUMBER:
                return w.k(y.y(), (long) (999999999 - y.r().s().b0()));
            case k.STRING_SET_FIELD_NUMBER:
                return w.k(y.x(), a.DAY_OF_YEAR.C().d());
            case k.DOUBLE_FIELD_NUMBER:
                return w.j((long) x.f5043d.b0(), 999999999);
            case k.BYTES_FIELD_NUMBER:
                return w.j((long) y.f5047d.p(), (long) y.r().p());
            default:
                return aVar.C();
        }
    }

    public final C0528b P(Map map, y yVar) {
        return (x) super.P(map, yVar);
    }

    /* access modifiers changed from: package-private */
    public final C0528b W(Map map, y yVar) {
        y yVar2;
        h hVar;
        x xVar;
        a aVar = a.ERA;
        Long l3 = (Long) map.get(aVar);
        if (l3 != null) {
            yVar2 = y.w(U(aVar).a(l3.longValue(), aVar));
        } else {
            yVar2 = null;
        }
        a aVar2 = a.YEAR_OF_ERA;
        Long l4 = (Long) map.get(aVar2);
        int a2 = l4 != null ? U(aVar2).a(l4.longValue(), aVar2) : 0;
        if (yVar2 == null && l4 != null && !map.containsKey(a.YEAR) && yVar != y.STRICT) {
            yVar2 = y.A()[y.A().length - 1];
        }
        if (!(l4 == null || yVar2 == null)) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                a aVar4 = a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (yVar == y.LENIENT) {
                        return new x(h.g0((yVar2.s().b0() + a2) - 1, 1, 1)).W(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1), j$.time.temporal.b.MONTHS).W(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1), j$.time.temporal.b.DAYS);
                    }
                    int a3 = U(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int a4 = U(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (yVar != y.SMART) {
                        h hVar2 = x.f5043d;
                        h g02 = h.g0((yVar2.s().b0() + a2) - 1, a3, a4);
                        if (!g02.c0(yVar2.s()) && yVar2 == y.q(g02)) {
                            return new x(yVar2, a2, g02);
                        }
                        throw new RuntimeException("year, month, and day not valid for Era");
                    } else if (a2 >= 1) {
                        int b02 = (yVar2.s().b0() + a2) - 1;
                        try {
                            xVar = new x(h.g0(b02, a3, a4));
                        } catch (c unused) {
                            xVar = new x(h.g0(b02, a3, 1)).b0(new p(0));
                        }
                        if (xVar.T() == yVar2 || xVar.i(a.YEAR_OF_ERA) <= 1 || a2 <= 1) {
                            return xVar;
                        }
                        throw new RuntimeException("Invalid YearOfEra for Era: " + yVar2 + " " + a2);
                    } else {
                        throw new RuntimeException("Invalid YearOfEra: " + a2);
                    }
                }
            }
            a aVar5 = a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (yVar == y.LENIENT) {
                    return new x(h.j0((yVar2.s().b0() + a2) - 1, 1)).W(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1), j$.time.temporal.b.DAYS);
                }
                int a5 = U(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                h hVar3 = x.f5043d;
                if (a2 == 1) {
                    hVar = h.j0(yVar2.s().b0(), (yVar2.s().Z() + a5) - 1);
                } else {
                    hVar = h.j0((yVar2.s().b0() + a2) - 1, a5);
                }
                if (!hVar.c0(yVar2.s()) && yVar2 == y.q(hVar)) {
                    return new x(yVar2, a2, hVar);
                }
                throw new RuntimeException("Invalid parameters");
            }
        }
        return null;
    }

    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return k.J(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new E((byte) 1, this);
    }
}
