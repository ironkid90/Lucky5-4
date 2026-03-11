package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;

final class h implements f {
    public final boolean p(t tVar, StringBuilder sb) {
        StringBuilder sb2 = sb;
        Long e2 = tVar.e(a.INSTANT_SECONDS);
        TemporalAccessor d3 = tVar.d();
        a aVar = a.NANO_OF_SECOND;
        Long valueOf = d3.f(aVar) ? Long.valueOf(tVar.d().g(aVar)) : null;
        int i3 = 0;
        if (e2 == null) {
            return false;
        }
        long longValue = e2.longValue();
        int Z = aVar.Z(valueOf != null ? valueOf.longValue() : 0);
        if (longValue >= -62167219200L) {
            long j3 = longValue - 253402300800L;
            long floorDiv = Math.floorDiv(j3, 315569520000L) + 1;
            LocalDateTime i0 = LocalDateTime.i0(Math.floorMod(j3, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (floorDiv > 0) {
                sb2.append('+');
                sb2.append(floorDiv);
            }
            sb2.append(i0);
            if (i0.b0() == 0) {
                sb2.append(":00");
            }
        } else {
            long j4 = longValue + 62167219200L;
            long j5 = j4 / 315569520000L;
            long j6 = j4 % 315569520000L;
            LocalDateTime i02 = LocalDateTime.i0(j6 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb2.append(i02);
            if (i02.b0() == 0) {
                sb2.append(":00");
            }
            if (j5 < 0) {
                if (i02.c0() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j5 - 1));
                } else if (j6 == 0) {
                    sb2.insert(length, j5);
                } else {
                    sb2.insert(length + 1, Math.abs(j5));
                }
            }
        }
        if (Z > 0) {
            sb2.append('.');
            int i4 = 100000000;
            while (true) {
                if (Z <= 0 && i3 % 3 == 0 && i3 >= -2) {
                    break;
                }
                int i5 = Z / i4;
                sb2.append((char) (i5 + 48));
                Z -= i5 * i4;
                i4 /= 10;
                i3++;
            }
        }
        sb2.append('Z');
        return true;
    }

    public final int r(q qVar, CharSequence charSequence, int i3) {
        int i4;
        int i5;
        int i6 = i3;
        p pVar = new p();
        pVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        pVar.e('T');
        a aVar = a.HOUR_OF_DAY;
        pVar.k(aVar, 2);
        pVar.e(':');
        a aVar2 = a.MINUTE_OF_HOUR;
        pVar.k(aVar2, 2);
        pVar.e(':');
        a aVar3 = a.SECOND_OF_MINUTE;
        pVar.k(aVar3, 2);
        a aVar4 = a.NANO_OF_SECOND;
        pVar.b(aVar4);
        pVar.e('Z');
        e f3 = pVar.t().f();
        q c3 = qVar.c();
        int r3 = f3.r(c3, charSequence, i6);
        if (r3 < 0) {
            return r3;
        }
        long longValue = c3.i(a.YEAR).longValue();
        int intValue = c3.i(a.MONTH_OF_YEAR).intValue();
        int intValue2 = c3.i(a.DAY_OF_MONTH).intValue();
        int intValue3 = c3.i(aVar).intValue();
        int intValue4 = c3.i(aVar2).intValue();
        Long i7 = c3.i(aVar3);
        Long i8 = c3.i(aVar4);
        int i9 = 0;
        int intValue5 = i7 != null ? i7.intValue() : 0;
        int intValue6 = i8 != null ? i8.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i4 = intValue5;
            i5 = 0;
            i9 = 1;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            qVar.o();
            i5 = intValue3;
            i4 = 59;
        } else {
            i5 = intValue3;
            i4 = intValue5;
        }
        try {
            long multiplyExact = Math.multiplyExact(longValue / 10000, 315569520000L) + LocalDateTime.g0(((int) longValue) % 10000, intValue, intValue2, i5, intValue4, i4, 0).plusDays((long) i9).Y(ZoneOffset.UTC);
            q qVar2 = qVar;
            int i10 = intValue6;
            int i11 = i3;
            return qVar2.n(aVar4, (long) i10, i11, qVar2.n(a.INSTANT_SECONDS, multiplyExact, i11, r3));
        } catch (RuntimeException unused) {
            return ~i6;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
