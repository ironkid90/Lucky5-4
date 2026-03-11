package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.c;
import j$.time.format.y;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.o;
import j$.time.temporal.p;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.chrono.a  reason: case insensitive filesystem */
public abstract class C0527a implements l {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f5002a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f5003b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f5004c = 0;

    public final int compareTo(Object obj) {
        return s().compareTo(((l) obj).s());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    static l C(C0527a aVar, String str) {
        String R3;
        l lVar = (l) f5002a.putIfAbsent(str, aVar);
        if (lVar == null && (R3 = aVar.R()) != null) {
            f5003b.putIfAbsent(R3, aVar);
        }
        return lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static j$.time.chrono.l r(java.lang.String r4) {
        /*
            java.lang.String r0 = "id"
            java.util.Objects.requireNonNull(r4, r0)
        L_0x0005:
            java.util.concurrent.ConcurrentHashMap r0 = f5002a
            java.lang.Object r1 = r0.get(r4)
            j$.time.chrono.l r1 = (j$.time.chrono.l) r1
            if (r1 != 0) goto L_0x0017
            java.util.concurrent.ConcurrentHashMap r1 = f5003b
            java.lang.Object r1 = r1.get(r4)
            j$.time.chrono.l r1 = (j$.time.chrono.l) r1
        L_0x0017:
            if (r1 == 0) goto L_0x001a
            return r1
        L_0x001a:
            java.lang.String r1 = "ISO"
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0079
            j$.time.chrono.o r0 = j$.time.chrono.o.f5020o
            java.lang.String r2 = r0.s()
            C(r0, r2)
            j$.time.chrono.v r0 = j$.time.chrono.v.f5041d
            java.lang.String r2 = r0.s()
            C(r0, r2)
            j$.time.chrono.A r0 = j$.time.chrono.A.f4991d
            java.lang.String r2 = r0.s()
            C(r0, r2)
            j$.time.chrono.G r0 = j$.time.chrono.G.f4998d
            java.lang.String r2 = r0.s()
            C(r0, r2)
            java.lang.Class<j$.time.chrono.a> r0 = j$.time.chrono.C0527a.class
            r2 = 0
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0051:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r0.next()
            j$.time.chrono.a r2 = (j$.time.chrono.C0527a) r2
            java.lang.String r3 = r2.s()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = r2.s()
            C(r2, r3)
            goto L_0x0051
        L_0x006f:
            j$.time.chrono.s r0 = j$.time.chrono.s.f5038d
            java.lang.String r1 = r0.s()
            C(r0, r1)
            goto L_0x0005
        L_0x0079:
            java.lang.Class<j$.time.chrono.l> r0 = j$.time.chrono.l.class
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0083:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()
            j$.time.chrono.l r1 = (j$.time.chrono.l) r1
            java.lang.String r2 = r1.s()
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00a3
            java.lang.String r2 = r1.R()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0083
        L_0x00a3:
            return r1
        L_0x00a4:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Unknown chronology: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.C0527a.r(java.lang.String):j$.time.chrono.l");
    }

    protected C0527a() {
    }

    public C0528b P(Map map, y yVar) {
        Map map2 = map;
        y yVar2 = yVar;
        a aVar = a.EPOCH_DAY;
        if (map2.containsKey(aVar)) {
            return q(((Long) map2.remove(aVar)).longValue());
        }
        S(map, yVar);
        C0528b W2 = W(map, yVar);
        if (W2 != null) {
            return W2;
        }
        a aVar2 = a.YEAR;
        if (!map2.containsKey(aVar2)) {
            return null;
        }
        a aVar3 = a.MONTH_OF_YEAR;
        if (map2.containsKey(aVar3)) {
            if (map2.containsKey(a.DAY_OF_MONTH)) {
                return T(map, yVar);
            }
            a aVar4 = a.ALIGNED_WEEK_OF_MONTH;
            if (map2.containsKey(aVar4)) {
                a aVar5 = a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map2.containsKey(aVar5)) {
                    int a2 = U(aVar2).a(((Long) map2.remove(aVar2)).longValue(), aVar2);
                    if (yVar2 == y.LENIENT) {
                        long subtractExact = Math.subtractExact(((Long) map2.remove(aVar3)).longValue(), 1);
                        long subtractExact2 = Math.subtractExact(((Long) map2.remove(aVar4)).longValue(), 1);
                        return G(a2, 1, 1).d(subtractExact, b.MONTHS).d(subtractExact2, b.WEEKS).d(Math.subtractExact(((Long) map2.remove(aVar5)).longValue(), 1), b.DAYS);
                    }
                    int a3 = U(aVar3).a(((Long) map2.remove(aVar3)).longValue(), aVar3);
                    int a4 = U(aVar4).a(((Long) map2.remove(aVar4)).longValue(), aVar4);
                    C0528b d3 = G(a2, a3, 1).d((long) ((U(aVar5).a(((Long) map2.remove(aVar5)).longValue(), aVar5) - 1) + ((a4 - 1) * 7)), b.DAYS);
                    if (yVar2 != y.STRICT || d3.i(aVar3) == a3) {
                        return d3;
                    }
                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different month");
                }
                a aVar6 = a.DAY_OF_WEEK;
                if (map2.containsKey(aVar6)) {
                    int a5 = U(aVar2).a(((Long) map2.remove(aVar2)).longValue(), aVar2);
                    if (yVar2 == y.LENIENT) {
                        return J(G(a5, 1, 1), Math.subtractExact(((Long) map2.remove(aVar3)).longValue(), 1), Math.subtractExact(((Long) map2.remove(aVar4)).longValue(), 1), Math.subtractExact(((Long) map2.remove(aVar6)).longValue(), 1));
                    }
                    int a6 = U(aVar3).a(((Long) map2.remove(aVar3)).longValue(), aVar3);
                    C0528b m3 = G(a5, a6, 1).d((long) ((U(aVar4).a(((Long) map2.remove(aVar4)).longValue(), aVar4) - 1) * 7), b.DAYS).m(new o(DayOfWeek.r(U(aVar6).a(((Long) map2.remove(aVar6)).longValue(), aVar6)).p(), 0));
                    if (yVar2 != y.STRICT || m3.i(aVar3) == a6) {
                        return m3;
                    }
                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        a aVar7 = a.DAY_OF_YEAR;
        if (map2.containsKey(aVar7)) {
            int a7 = U(aVar2).a(((Long) map2.remove(aVar2)).longValue(), aVar2);
            if (yVar2 != y.LENIENT) {
                return A(a7, U(aVar7).a(((Long) map2.remove(aVar7)).longValue(), aVar7));
            }
            return A(a7, 1).d(Math.subtractExact(((Long) map2.remove(aVar7)).longValue(), 1), b.DAYS);
        }
        a aVar8 = a.ALIGNED_WEEK_OF_YEAR;
        if (!map2.containsKey(aVar8)) {
            return null;
        }
        a aVar9 = a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map2.containsKey(aVar9)) {
            int a8 = U(aVar2).a(((Long) map2.remove(aVar2)).longValue(), aVar2);
            if (yVar2 == y.LENIENT) {
                long subtractExact3 = Math.subtractExact(((Long) map2.remove(aVar8)).longValue(), 1);
                return A(a8, 1).d(subtractExact3, b.WEEKS).d(Math.subtractExact(((Long) map2.remove(aVar9)).longValue(), 1), b.DAYS);
            }
            int a9 = U(aVar8).a(((Long) map2.remove(aVar8)).longValue(), aVar8);
            C0528b d4 = A(a8, 1).d((long) ((U(aVar9).a(((Long) map2.remove(aVar9)).longValue(), aVar9) - 1) + ((a9 - 1) * 7)), b.DAYS);
            if (yVar2 != y.STRICT || d4.i(aVar2) == a8) {
                return d4;
            }
            throw new RuntimeException("Strict mode rejected resolved date as it is in a different year");
        }
        a aVar10 = a.DAY_OF_WEEK;
        if (!map2.containsKey(aVar10)) {
            return null;
        }
        int a10 = U(aVar2).a(((Long) map2.remove(aVar2)).longValue(), aVar2);
        if (yVar2 == y.LENIENT) {
            return J(A(a10, 1), 0, Math.subtractExact(((Long) map2.remove(aVar8)).longValue(), 1), Math.subtractExact(((Long) map2.remove(aVar10)).longValue(), 1));
        }
        C0528b m4 = A(a10, 1).d((long) ((U(aVar8).a(((Long) map2.remove(aVar8)).longValue(), aVar8) - 1) * 7), b.DAYS).m(new o(DayOfWeek.r(U(aVar10).a(((Long) map2.remove(aVar10)).longValue(), aVar10)).p(), 0));
        if (yVar2 != y.STRICT || m4.i(aVar2) == a10) {
            return m4;
        }
        throw new RuntimeException("Strict mode rejected resolved date as it is in a different year");
    }

    /* access modifiers changed from: package-private */
    public void S(Map map, y yVar) {
        a aVar = a.PROLEPTIC_MONTH;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            if (yVar != y.LENIENT) {
                aVar.a0(l3.longValue());
            }
            C0528b b3 = L().b(1, a.DAY_OF_MONTH).b(l3.longValue(), aVar);
            a aVar2 = a.MONTH_OF_YEAR;
            p(map, aVar2, (long) b3.i(aVar2));
            a aVar3 = a.YEAR;
            p(map, aVar3, (long) b3.i(aVar3));
        }
    }

    /* access modifiers changed from: package-private */
    public C0528b W(Map map, y yVar) {
        int i3;
        a aVar = a.YEAR_OF_ERA;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            a aVar2 = a.ERA;
            Long l4 = (Long) map.remove(aVar2);
            if (yVar != y.LENIENT) {
                i3 = U(aVar).a(l3.longValue(), aVar);
            } else {
                i3 = Math.toIntExact(l3.longValue());
            }
            if (l4 != null) {
                p(map, a.YEAR, (long) w(N(U(aVar2).a(l4.longValue(), aVar2)), i3));
                return null;
            }
            a aVar3 = a.YEAR;
            if (map.containsKey(aVar3)) {
                p(map, aVar3, (long) w(A(U(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).u(), i3));
                return null;
            } else if (yVar == y.STRICT) {
                map.put(aVar, l3);
                return null;
            } else {
                List D3 = D();
                if (D3.isEmpty()) {
                    p(map, aVar3, (long) i3);
                    return null;
                }
                p(map, aVar3, (long) w((m) D3.get(D3.size() - 1), i3));
                return null;
            }
        } else {
            a aVar4 = a.ERA;
            if (!map.containsKey(aVar4)) {
                return null;
            }
            U(aVar4).b(((Long) map.get(aVar4)).longValue(), aVar4);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public C0528b T(Map map, y yVar) {
        a aVar = a.YEAR;
        int a2 = U(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (yVar == y.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(a.MONTH_OF_YEAR)).longValue(), 1);
            return G(a2, 1, 1).d(subtractExact, b.MONTHS).d(Math.subtractExact(((Long) map.remove(a.DAY_OF_MONTH)).longValue(), 1), b.DAYS);
        }
        a aVar2 = a.MONTH_OF_YEAR;
        int a3 = U(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        a aVar3 = a.DAY_OF_MONTH;
        int a4 = U(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (yVar != y.SMART) {
            return G(a2, a3, a4);
        }
        try {
            return G(a2, a3, a4);
        } catch (c unused) {
            return G(a2, a3, 1).m(new p(0));
        }
    }

    static C0528b J(C0528b bVar, long j3, long j4, long j5) {
        long j6;
        C0528b d3 = bVar.d(j3, b.MONTHS);
        b bVar2 = b.WEEKS;
        C0528b d4 = d3.d(j4, bVar2);
        if (j5 > 7) {
            long j7 = j5 - 1;
            d4 = d4.d(j7 / 7, bVar2);
            j6 = j7 % 7;
        } else {
            if (j5 < 1) {
                d4 = d4.d(Math.subtractExact(j5, 7) / 7, bVar2);
                j6 = (j5 + 6) % 7;
            }
            return d4.m(new o(DayOfWeek.r((int) j5).p(), 0));
        }
        j5 = j6 + 1;
        return d4.m(new o(DayOfWeek.r((int) j5).p(), 0));
    }

    static void p(Map map, a aVar, long j3) {
        Long l3 = (Long) map.get(aVar);
        if (l3 == null || l3.longValue() == j3) {
            map.put(aVar, Long.valueOf(j3));
            return;
        }
        throw new RuntimeException("Conflict found: " + aVar + " " + l3 + " differs from " + aVar + " " + j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0527a)) {
            return false;
        }
        if (s().compareTo(((C0527a) obj).s()) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ s().hashCode();
    }

    public final String toString() {
        return s();
    }
}
