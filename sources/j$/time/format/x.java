package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.C0527a;
import j$.time.chrono.C0528b;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.l;
import j$.time.d;
import j$.time.h;
import j$.time.s;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.r;
import j$.time.temporal.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

final class x implements TemporalAccessor {

    /* renamed from: a  reason: collision with root package name */
    final HashMap f5116a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    ZoneId f5117b;

    /* renamed from: c  reason: collision with root package name */
    l f5118c;

    /* renamed from: d  reason: collision with root package name */
    boolean f5119d;

    /* renamed from: e  reason: collision with root package name */
    private y f5120e;

    /* renamed from: f  reason: collision with root package name */
    private C0528b f5121f;

    /* renamed from: g  reason: collision with root package name */
    private j$.time.l f5122g;

    /* renamed from: h  reason: collision with root package name */
    s f5123h = s.f5153d;

    x() {
    }

    public final boolean f(r rVar) {
        if (this.f5116a.containsKey(rVar)) {
            return true;
        }
        C0528b bVar = this.f5121f;
        if (bVar != null && bVar.f(rVar)) {
            return true;
        }
        j$.time.l lVar = this.f5122g;
        if (lVar != null && lVar.f(rVar)) {
            return true;
        }
        if (rVar == null || (rVar instanceof a) || !rVar.W(this)) {
            return false;
        }
        return true;
    }

    public final long g(r rVar) {
        Objects.requireNonNull(rVar, "field");
        Long l3 = (Long) this.f5116a.get(rVar);
        if (l3 != null) {
            return l3.longValue();
        }
        C0528b bVar = this.f5121f;
        if (bVar != null && bVar.f(rVar)) {
            return this.f5121f.g(rVar);
        }
        j$.time.l lVar = this.f5122g;
        if (lVar != null && lVar.f(rVar)) {
            return this.f5122g.g(rVar);
        }
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final Object a(t tVar) {
        if (tVar == j$.time.temporal.s.g()) {
            return this.f5117b;
        }
        if (tVar == j$.time.temporal.s.a()) {
            return this.f5118c;
        }
        if (tVar == j$.time.temporal.s.b()) {
            C0528b bVar = this.f5121f;
            if (bVar != null) {
                return h.J(bVar);
            }
            return null;
        } else if (tVar == j$.time.temporal.s.c()) {
            return this.f5122g;
        } else {
            if (tVar == j$.time.temporal.s.d()) {
                Long l3 = (Long) this.f5116a.get(a.OFFSET_SECONDS);
                if (l3 != null) {
                    return ZoneOffset.c0(l3.intValue());
                }
                ZoneId zoneId = this.f5117b;
                if (zoneId instanceof ZoneOffset) {
                    return zoneId;
                }
                return tVar.j(this);
            } else if (tVar == j$.time.temporal.s.f()) {
                return tVar.j(this);
            } else {
                if (tVar == j$.time.temporal.s.e()) {
                    return null;
                }
                return tVar.j(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(j$.time.format.y r24) {
        /*
            r23 = this;
            r9 = r23
            java.util.HashMap r10 = r9.f5116a
            r0 = r24
            r9.f5120e = r0
            r23.s()
            j$.time.chrono.l r0 = r9.f5118c
            j$.time.format.y r1 = r9.f5120e
            j$.time.chrono.b r0 = r0.P(r10, r1)
            r9.A(r0)
            r23.x()
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x00d8
            r0 = 0
        L_0x0020:
            r1 = 50
            if (r0 >= r1) goto L_0x00ba
            java.util.Set r2 = r10.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x002c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ba
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            j$.time.temporal.r r3 = (j$.time.temporal.r) r3
            j$.time.format.y r4 = r9.f5120e
            j$.time.temporal.TemporalAccessor r4 = r3.S(r10, r9, r4)
            if (r4 == 0) goto L_0x00b3
            boolean r1 = r4 instanceof j$.time.chrono.ChronoZonedDateTime
            if (r1 == 0) goto L_0x007c
            j$.time.chrono.ChronoZonedDateTime r4 = (j$.time.chrono.ChronoZonedDateTime) r4
            j$.time.ZoneId r1 = r9.f5117b
            if (r1 != 0) goto L_0x0057
            j$.time.ZoneId r1 = r4.Q()
            r9.f5117b = r1
            goto L_0x0061
        L_0x0057:
            j$.time.ZoneId r2 = r4.Q()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0066
        L_0x0061:
            j$.time.chrono.e r4 = r4.B()
            goto L_0x007c
        L_0x0066:
            j$.time.c r0 = new j$.time.c
            j$.time.ZoneId r1 = r9.f5117b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ChronoZonedDateTime must use the effective parsed zone: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x007c:
            boolean r1 = r4 instanceof j$.time.chrono.C0531e
            if (r1 == 0) goto L_0x0095
            j$.time.chrono.e r4 = (j$.time.chrono.C0531e) r4
            j$.time.l r1 = r4.n()
            j$.time.s r2 = j$.time.s.f5153d
            r9.y(r1, r2)
            j$.time.chrono.b r1 = r4.o()
            r9.A(r1)
        L_0x0092:
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0095:
            boolean r1 = r4 instanceof j$.time.chrono.C0528b
            if (r1 == 0) goto L_0x009f
            j$.time.chrono.b r4 = (j$.time.chrono.C0528b) r4
            r9.A(r4)
            goto L_0x0092
        L_0x009f:
            boolean r1 = r4 instanceof j$.time.l
            if (r1 == 0) goto L_0x00ab
            j$.time.l r4 = (j$.time.l) r4
            j$.time.s r1 = j$.time.s.f5153d
            r9.y(r4, r1)
            goto L_0x0092
        L_0x00ab:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime"
            r0.<init>(r1)
            throw r0
        L_0x00b3:
            boolean r3 = r10.containsKey(r3)
            if (r3 != 0) goto L_0x002c
            goto L_0x0092
        L_0x00ba:
            if (r0 == r1) goto L_0x00d0
            if (r0 <= 0) goto L_0x00d8
            r23.s()
            j$.time.chrono.l r0 = r9.f5118c
            j$.time.format.y r1 = r9.f5120e
            j$.time.chrono.b r0 = r0.P(r10, r1)
            r9.A(r0)
            r23.x()
            goto L_0x00d8
        L_0x00d0:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "One of the parsed fields has an incorrectly implemented resolve method"
            r0.<init>(r1)
            throw r0
        L_0x00d8:
            j$.time.l r0 = r9.f5122g
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x01b2
            j$.time.temporal.a r0 = j$.time.temporal.a.MILLI_OF_SECOND
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L_0x0128
            java.lang.Object r1 = r10.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            j$.time.temporal.a r3 = j$.time.temporal.a.MICRO_OF_SECOND
            boolean r4 = r10.containsKey(r3)
            if (r4 == 0) goto L_0x011d
            long r1 = r1 * r15
            java.lang.Object r4 = r10.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = r4 % r15
            long r4 = r4 + r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r9.C(r0, r3, r1)
            r10.remove(r3)
            j$.time.temporal.a r0 = j$.time.temporal.a.NANO_OF_SECOND
            long r4 = r4 * r15
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r10.put(r0, r1)
            goto L_0x0144
        L_0x011d:
            j$.time.temporal.a r0 = j$.time.temporal.a.NANO_OF_SECOND
            long r1 = r1 * r13
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r10.put(r0, r1)
            goto L_0x0144
        L_0x0128:
            j$.time.temporal.a r0 = j$.time.temporal.a.MICRO_OF_SECOND
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L_0x0144
            java.lang.Object r0 = r10.remove(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            j$.time.temporal.a r2 = j$.time.temporal.a.NANO_OF_SECOND
            long r0 = r0 * r15
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r2, r0)
        L_0x0144:
            j$.time.temporal.a r7 = j$.time.temporal.a.HOUR_OF_DAY
            java.lang.Object r0 = r10.get(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x01b2
            j$.time.temporal.a r8 = j$.time.temporal.a.MINUTE_OF_HOUR
            java.lang.Object r1 = r10.get(r8)
            java.lang.Long r1 = (java.lang.Long) r1
            j$.time.temporal.a r5 = j$.time.temporal.a.SECOND_OF_MINUTE
            java.lang.Object r2 = r10.get(r5)
            java.lang.Long r2 = (java.lang.Long) r2
            j$.time.temporal.a r6 = j$.time.temporal.a.NANO_OF_SECOND
            java.lang.Object r3 = r10.get(r6)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r1 != 0) goto L_0x016c
            if (r2 != 0) goto L_0x01f5
            if (r3 != 0) goto L_0x01f5
        L_0x016c:
            if (r1 == 0) goto L_0x0174
            if (r2 != 0) goto L_0x0174
            if (r3 == 0) goto L_0x0174
            goto L_0x01f5
        L_0x0174:
            if (r1 == 0) goto L_0x017b
            long r17 = r1.longValue()
            goto L_0x017d
        L_0x017b:
            r17 = 0
        L_0x017d:
            if (r2 == 0) goto L_0x0186
            long r1 = r2.longValue()
            r19 = r1
            goto L_0x0188
        L_0x0186:
            r19 = 0
        L_0x0188:
            if (r3 == 0) goto L_0x0191
            long r1 = r3.longValue()
            r21 = r1
            goto L_0x0193
        L_0x0191:
            r21 = 0
        L_0x0193:
            long r1 = r0.longValue()
            r0 = r23
            r3 = r17
            r11 = r5
            r12 = r6
            r5 = r19
            r13 = r7
            r14 = r8
            r7 = r21
            r0.w(r1, r3, r5, r7)
            r10.remove(r13)
            r10.remove(r14)
            r10.remove(r11)
            r10.remove(r12)
        L_0x01b2:
            j$.time.format.y r0 = r9.f5120e
            j$.time.format.y r1 = j$.time.format.y.LENIENT
            if (r0 == r1) goto L_0x01f5
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x01f5
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01c6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01f5
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            j$.time.temporal.r r2 = (j$.time.temporal.r) r2
            boolean r3 = r2 instanceof j$.time.temporal.a
            if (r3 == 0) goto L_0x01c6
            r3 = r2
            j$.time.temporal.a r3 = (j$.time.temporal.a) r3
            boolean r3 = r3.b0()
            if (r3 == 0) goto L_0x01c6
            j$.time.temporal.a r2 = (j$.time.temporal.a) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r2.a0(r3)
            goto L_0x01c6
        L_0x01f5:
            j$.time.chrono.b r0 = r9.f5121f
            if (r0 == 0) goto L_0x01fc
            r9.q(r0)
        L_0x01fc:
            j$.time.l r0 = r9.f5122g
            if (r0 == 0) goto L_0x0218
            r9.q(r0)
            j$.time.chrono.b r0 = r9.f5121f
            if (r0 == 0) goto L_0x0218
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x0218
            j$.time.chrono.b r0 = r9.f5121f
            j$.time.l r1 = r9.f5122g
            j$.time.chrono.e r0 = r0.K(r1)
            r9.q(r0)
        L_0x0218:
            j$.time.chrono.b r0 = r9.f5121f
            if (r0 == 0) goto L_0x0236
            j$.time.l r0 = r9.f5122g
            if (r0 == 0) goto L_0x0236
            j$.time.s r0 = r9.f5123h
            r0.getClass()
            j$.time.s r1 = j$.time.s.f5153d
            if (r0 != r1) goto L_0x022a
            goto L_0x0236
        L_0x022a:
            j$.time.chrono.b r0 = r9.f5121f
            j$.time.s r2 = r9.f5123h
            j$.time.chrono.b r0 = r0.M(r2)
            r9.f5121f = r0
            r9.f5123h = r1
        L_0x0236:
            j$.time.l r0 = r9.f5122g
            if (r0 != 0) goto L_0x0298
            j$.time.temporal.a r0 = j$.time.temporal.a.INSTANT_SECONDS
            boolean r0 = r10.containsKey(r0)
            if (r0 != 0) goto L_0x0252
            j$.time.temporal.a r0 = j$.time.temporal.a.SECOND_OF_DAY
            boolean r0 = r10.containsKey(r0)
            if (r0 != 0) goto L_0x0252
            j$.time.temporal.a r0 = j$.time.temporal.a.SECOND_OF_MINUTE
            boolean r0 = r10.containsKey(r0)
            if (r0 == 0) goto L_0x0298
        L_0x0252:
            j$.time.temporal.a r0 = j$.time.temporal.a.NANO_OF_SECOND
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L_0x027d
            java.lang.Object r0 = r10.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            j$.time.temporal.a r2 = j$.time.temporal.a.MICRO_OF_SECOND
            long r3 = r0 / r15
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10.put(r2, r3)
            j$.time.temporal.a r2 = j$.time.temporal.a.MILLI_OF_SECOND
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r2, r0)
            goto L_0x0298
        L_0x027d:
            r1 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r10.put(r0, r3)
            j$.time.temporal.a r0 = j$.time.temporal.a.MICRO_OF_SECOND
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r10.put(r0, r3)
            j$.time.temporal.a r0 = j$.time.temporal.a.MILLI_OF_SECOND
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r10.put(r0, r1)
        L_0x0298:
            j$.time.chrono.b r0 = r9.f5121f
            if (r0 == 0) goto L_0x02eb
            j$.time.l r0 = r9.f5122g
            if (r0 == 0) goto L_0x02eb
            j$.time.temporal.a r0 = j$.time.temporal.a.OFFSET_SECONDS
            java.lang.Object r0 = r10.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x02cc
            int r0 = r0.intValue()
            j$.time.ZoneOffset r0 = j$.time.ZoneOffset.c0(r0)
            j$.time.chrono.b r1 = r9.f5121f
            j$.time.l r2 = r9.f5122g
            j$.time.chrono.e r1 = r1.K(r2)
            j$.time.chrono.ChronoZonedDateTime r0 = r1.H(r0)
            long r0 = r0.O()
            j$.time.temporal.a r2 = j$.time.temporal.a.INSTANT_SECONDS
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r2, r0)
            goto L_0x02eb
        L_0x02cc:
            j$.time.ZoneId r0 = r9.f5117b
            if (r0 == 0) goto L_0x02eb
            j$.time.chrono.b r0 = r9.f5121f
            j$.time.l r1 = r9.f5122g
            j$.time.chrono.e r0 = r0.K(r1)
            j$.time.ZoneId r1 = r9.f5117b
            j$.time.chrono.ChronoZonedDateTime r0 = r0.H(r1)
            long r0 = r0.O()
            j$.time.temporal.a r2 = j$.time.temporal.a.INSTANT_SECONDS
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r2, r0)
        L_0x02eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.x.r(j$.time.format.y):void");
    }

    private void C(r rVar, a aVar, Long l3) {
        Long l4 = (Long) this.f5116a.put(aVar, l3);
        if (l4 != null && l4.longValue() != l3.longValue()) {
            throw new RuntimeException("Conflict found: " + aVar + " " + l4 + " differs from " + aVar + " " + l3 + " while resolving  " + rVar);
        }
    }

    private void s() {
        HashMap hashMap = this.f5116a;
        if (hashMap.containsKey(a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f5117b;
            if (zoneId != null) {
                t(zoneId);
                return;
            }
            Long l3 = (Long) hashMap.get(a.OFFSET_SECONDS);
            if (l3 != null) {
                t(ZoneOffset.c0(l3.intValue()));
            }
        }
    }

    private void t(ZoneId zoneId) {
        HashMap hashMap = this.f5116a;
        a aVar = a.INSTANT_SECONDS;
        ChronoZonedDateTime y2 = this.f5118c.y(Instant.T(((Long) hashMap.remove(aVar)).longValue()), zoneId);
        A(y2.o());
        C(aVar, a.SECOND_OF_DAY, Long.valueOf((long) y2.n().m0()));
    }

    private void A(C0528b bVar) {
        C0528b bVar2 = this.f5121f;
        if (bVar2 != null) {
            if (bVar != null && !bVar2.equals(bVar)) {
                C0528b bVar3 = this.f5121f;
                throw new RuntimeException("Conflict found: Fields resolved to two different dates: " + bVar3 + " " + bVar);
            }
        } else if (bVar != null) {
            if (((C0527a) this.f5118c).equals(bVar.h())) {
                this.f5121f = bVar;
                return;
            }
            l lVar = this.f5118c;
            throw new RuntimeException("ChronoLocalDate must use the effective parsed chronology: " + lVar);
        }
    }

    private void x() {
        HashMap hashMap = this.f5116a;
        a aVar = a.CLOCK_HOUR_OF_DAY;
        long j3 = 0;
        if (hashMap.containsKey(aVar)) {
            long longValue = ((Long) hashMap.remove(aVar)).longValue();
            y yVar = this.f5120e;
            if (yVar == y.STRICT || (yVar == y.SMART && longValue != 0)) {
                aVar.a0(longValue);
            }
            a aVar2 = a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            C(aVar, aVar2, Long.valueOf(longValue));
        }
        a aVar3 = a.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(aVar3)) {
            long longValue2 = ((Long) hashMap.remove(aVar3)).longValue();
            y yVar2 = this.f5120e;
            if (yVar2 == y.STRICT || (yVar2 == y.SMART && longValue2 != 0)) {
                aVar3.a0(longValue2);
            }
            a aVar4 = a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j3 = longValue2;
            }
            C(aVar3, aVar4, Long.valueOf(j3));
        }
        a aVar5 = a.AMPM_OF_DAY;
        if (hashMap.containsKey(aVar5)) {
            a aVar6 = a.HOUR_OF_AMPM;
            if (hashMap.containsKey(aVar6)) {
                long longValue3 = ((Long) hashMap.remove(aVar5)).longValue();
                long longValue4 = ((Long) hashMap.remove(aVar6)).longValue();
                if (this.f5120e == y.LENIENT) {
                    C(aVar5, a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(longValue3, (long) 12), longValue4)));
                } else {
                    aVar5.a0(longValue3);
                    aVar6.a0(longValue3);
                    C(aVar5, a.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        a aVar7 = a.NANO_OF_DAY;
        if (hashMap.containsKey(aVar7)) {
            long longValue5 = ((Long) hashMap.remove(aVar7)).longValue();
            if (this.f5120e != y.LENIENT) {
                aVar7.a0(longValue5);
            }
            C(aVar7, a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            C(aVar7, a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            C(aVar7, a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            C(aVar7, a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        a aVar8 = a.MICRO_OF_DAY;
        if (hashMap.containsKey(aVar8)) {
            long longValue6 = ((Long) hashMap.remove(aVar8)).longValue();
            if (this.f5120e != y.LENIENT) {
                aVar8.a0(longValue6);
            }
            C(aVar8, a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            C(aVar8, a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        a aVar9 = a.MILLI_OF_DAY;
        if (hashMap.containsKey(aVar9)) {
            long longValue7 = ((Long) hashMap.remove(aVar9)).longValue();
            if (this.f5120e != y.LENIENT) {
                aVar9.a0(longValue7);
            }
            C(aVar9, a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            C(aVar9, a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        a aVar10 = a.SECOND_OF_DAY;
        if (hashMap.containsKey(aVar10)) {
            long longValue8 = ((Long) hashMap.remove(aVar10)).longValue();
            if (this.f5120e != y.LENIENT) {
                aVar10.a0(longValue8);
            }
            C(aVar10, a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            C(aVar10, a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            C(aVar10, a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        a aVar11 = a.MINUTE_OF_DAY;
        if (hashMap.containsKey(aVar11)) {
            long longValue9 = ((Long) hashMap.remove(aVar11)).longValue();
            if (this.f5120e != y.LENIENT) {
                aVar11.a0(longValue9);
            }
            C(aVar11, a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            C(aVar11, a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        a aVar12 = a.NANO_OF_SECOND;
        if (hashMap.containsKey(aVar12)) {
            long longValue10 = ((Long) hashMap.get(aVar12)).longValue();
            y yVar3 = this.f5120e;
            y yVar4 = y.LENIENT;
            if (yVar3 != yVar4) {
                aVar12.a0(longValue10);
            }
            a aVar13 = a.MICRO_OF_SECOND;
            if (hashMap.containsKey(aVar13)) {
                long longValue11 = ((Long) hashMap.remove(aVar13)).longValue();
                if (this.f5120e != yVar4) {
                    aVar13.a0(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                C(aVar13, aVar12, Long.valueOf(longValue10));
            }
            a aVar14 = a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar14)) {
                long longValue12 = ((Long) hashMap.remove(aVar14)).longValue();
                if (this.f5120e != yVar4) {
                    aVar14.a0(longValue12);
                }
                C(aVar14, aVar12, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        a aVar15 = a.HOUR_OF_DAY;
        if (hashMap.containsKey(aVar15)) {
            a aVar16 = a.MINUTE_OF_HOUR;
            if (hashMap.containsKey(aVar16)) {
                a aVar17 = a.SECOND_OF_MINUTE;
                if (hashMap.containsKey(aVar17) && hashMap.containsKey(aVar12)) {
                    w(((Long) hashMap.remove(aVar15)).longValue(), ((Long) hashMap.remove(aVar16)).longValue(), ((Long) hashMap.remove(aVar17)).longValue(), ((Long) hashMap.remove(aVar12)).longValue());
                }
            }
        }
    }

    private void w(long j3, long j4, long j5, long j6) {
        if (this.f5120e == y.LENIENT) {
            long addExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j3, 3600000000000L), Math.multiplyExact(j4, 60000000000L)), Math.multiplyExact(j5, 1000000000)), j6);
            y(j$.time.l.d0(Math.floorMod(addExact, 86400000000000L)), s.b((int) Math.floorDiv(addExact, 86400000000000L)));
            return;
        }
        int Z = a.MINUTE_OF_HOUR.Z(j4);
        int Z2 = a.NANO_OF_SECOND.Z(j6);
        if (this.f5120e == y.SMART && j3 == 24 && Z == 0 && j5 == 0 && Z2 == 0) {
            y(j$.time.l.f5138g, s.b(1));
        } else {
            y(j$.time.l.c0(a.HOUR_OF_DAY.Z(j3), Z, a.SECOND_OF_MINUTE.Z(j5), Z2), s.f5153d);
        }
    }

    private void y(j$.time.l lVar, s sVar) {
        j$.time.l lVar2 = this.f5122g;
        if (lVar2 == null) {
            this.f5122g = lVar;
            this.f5123h = sVar;
        } else if (lVar2.equals(lVar)) {
            s sVar2 = this.f5123h;
            sVar2.getClass();
            s sVar3 = s.f5153d;
            if (sVar2 == sVar3 || sVar == sVar3 || this.f5123h.equals(sVar)) {
                this.f5123h = sVar;
                return;
            }
            s sVar4 = this.f5123h;
            throw new RuntimeException("Conflict found: Fields resolved to different excess periods: " + sVar4 + " " + sVar);
        } else {
            j$.time.l lVar3 = this.f5122g;
            throw new RuntimeException("Conflict found: Fields resolved to different times: " + lVar3 + " " + lVar);
        }
    }

    private void q(TemporalAccessor temporalAccessor) {
        Iterator it = this.f5116a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r rVar = (r) entry.getKey();
            if (temporalAccessor.f(rVar)) {
                try {
                    long g2 = temporalAccessor.g(rVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (g2 == longValue) {
                        it.remove();
                    } else {
                        throw new RuntimeException("Conflict found: Field " + rVar + " " + g2 + " differs from " + rVar + " " + longValue + " derived from " + temporalAccessor);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f5116a);
        sb.append(',');
        sb.append(this.f5118c);
        if (this.f5117b != null) {
            sb.append(',');
            sb.append(this.f5117b);
        }
        if (!(this.f5121f == null && this.f5122g == null)) {
            sb.append(" resolved to ");
            C0528b bVar = this.f5121f;
            if (bVar != null) {
                sb.append(bVar);
                if (this.f5122g != null) {
                    sb.append('T');
                    sb.append(this.f5122g);
                }
            } else {
                sb.append(this.f5122g);
            }
        }
        return sb.toString();
    }
}
