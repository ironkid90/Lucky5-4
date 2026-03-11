package j$.time;

import L.k;
import j$.time.chrono.C0528b;
import j$.time.chrono.C0531e;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class LocalDateTime implements m, n, C0531e, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final LocalDateTime f4973c = h0(h.f5128d, l.f5136e);

    /* renamed from: d  reason: collision with root package name */
    public static final LocalDateTime f4974d = h0(h.f5129e, l.f5137f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a  reason: collision with root package name */
    private final h f4975a;

    /* renamed from: b  reason: collision with root package name */
    private final l f4976b;

    public final m e(long j3, u uVar) {
        b bVar = (b) uVar;
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1, bVar) : d(-j3, bVar);
    }

    public final C0528b o() {
        return this.f4975a;
    }

    public static LocalDateTime f0(int i3) {
        return new LocalDateTime(h.g0(i3, 12, 31), l.b0(0));
    }

    public static LocalDateTime g0(int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return new LocalDateTime(h.g0(i3, i4, i5), l.c0(i6, i7, i8, i9));
    }

    public static LocalDateTime h0(h hVar, l lVar) {
        Objects.requireNonNull(hVar, "date");
        Objects.requireNonNull(lVar, "time");
        return new LocalDateTime(hVar, lVar);
    }

    public static LocalDateTime i0(long j3, int i3, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j4 = (long) i3;
        a.NANO_OF_SECOND.a0(j4);
        long Z = j3 + ((long) zoneOffset.Z());
        long j5 = (long) 86400;
        return new LocalDateTime(h.i0(Math.floorDiv(Z, j5)), l.d0((((long) ((int) Math.floorMod(Z, j5))) * 1000000000) + j4));
    }

    public static LocalDateTime C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).W();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(h.J(temporalAccessor), l.J(temporalAccessor));
        } catch (c e2) {
            String name = temporalAccessor.getClass().getName();
            throw new RuntimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + name, e2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [j$.time.i, java.lang.Object] */
    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.d(charSequence, new Object());
    }

    private LocalDateTime(h hVar, l lVar) {
        this.f4975a = hVar;
        this.f4976b = lVar;
    }

    private LocalDateTime p0(h hVar, l lVar) {
        if (this.f4975a == hVar && this.f4976b == lVar) {
            return this;
        }
        return new LocalDateTime(hVar, lVar);
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            a aVar = (a) rVar;
            if (aVar.T() || aVar.b0()) {
                return true;
            }
            return false;
        } else if (rVar == null || !rVar.W(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final w l(r rVar) {
        if (rVar instanceof a) {
            return ((a) rVar).b0() ? this.f4976b.l(rVar) : this.f4975a.l(rVar);
        }
        return rVar.J(this);
    }

    public final int i(r rVar) {
        if (rVar instanceof a) {
            return ((a) rVar).b0() ? this.f4976b.i(rVar) : this.f4975a.i(rVar);
        }
        return super.i(rVar);
    }

    public final long g(r rVar) {
        if (rVar instanceof a) {
            return ((a) rVar).b0() ? this.f4976b.g(rVar) : this.f4975a.g(rVar);
        }
        return rVar.r(this);
    }

    private int r(LocalDateTime localDateTime) {
        int r3 = this.f4975a.r(localDateTime.f4975a);
        return r3 == 0 ? this.f4976b.compareTo(localDateTime.f4976b) : r3;
    }

    public final h m0() {
        return this.f4975a;
    }

    public final int c0() {
        return this.f4975a.b0();
    }

    public final int Z() {
        return this.f4975a.a0();
    }

    public final int J() {
        return this.f4975a.T();
    }

    public final DayOfWeek S() {
        return this.f4975a.W();
    }

    public final l n() {
        return this.f4976b;
    }

    public final int T() {
        return this.f4976b.T();
    }

    public final int W() {
        return this.f4976b.W();
    }

    public final int b0() {
        return this.f4976b.a0();
    }

    public final int a0() {
        return this.f4976b.Z();
    }

    public final m j(h hVar) {
        return p0(hVar, this.f4976b);
    }

    public final LocalDateTime o0(h hVar) {
        return p0(hVar, this.f4976b);
    }

    /* renamed from: n0 */
    public final LocalDateTime b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (LocalDateTime) rVar.p(this, j3);
        }
        boolean b02 = ((a) rVar).b0();
        l lVar = this.f4976b;
        h hVar = this.f4975a;
        if (b02) {
            return p0(hVar, lVar.b(j3, rVar));
        }
        return p0(hVar.b(j3, rVar), lVar);
    }

    /* renamed from: j0 */
    public final LocalDateTime d(long j3, u uVar) {
        long j4 = j3;
        u uVar2 = uVar;
        if (!(uVar2 instanceof b)) {
            return (LocalDateTime) uVar2.p(this, j4);
        }
        switch (j.f5133a[((b) uVar2).ordinal()]) {
            case 1:
                return l0(this.f4975a, 0, 0, 0, j3);
            case k.FLOAT_FIELD_NUMBER:
                LocalDateTime plusDays = plusDays(j4 / 86400000000L);
                return plusDays.l0(plusDays.f4975a, 0, 0, 0, (j4 % 86400000000L) * 1000);
            case k.INTEGER_FIELD_NUMBER:
                LocalDateTime plusDays2 = plusDays(j4 / 86400000);
                return plusDays2.l0(plusDays2.f4975a, 0, 0, 0, (j4 % 86400000) * 1000000);
            case k.LONG_FIELD_NUMBER:
                return k0(j3);
            case k.STRING_FIELD_NUMBER:
                return l0(this.f4975a, 0, j3, 0, 0);
            case k.STRING_SET_FIELD_NUMBER:
                return l0(this.f4975a, j3, 0, 0, 0);
            case k.DOUBLE_FIELD_NUMBER:
                LocalDateTime plusDays3 = plusDays(j4 / 256);
                return plusDays3.l0(plusDays3.f4975a, (j4 % 256) * 12, 0, 0, 0);
            default:
                return p0(this.f4975a.d(j4, uVar2), this.f4976b);
        }
    }

    public LocalDateTime plusWeeks(long j3) {
        return p0(this.f4975a.n0(j3), this.f4976b);
    }

    public LocalDateTime plusDays(long j3) {
        return p0(this.f4975a.l0(j3), this.f4976b);
    }

    public final LocalDateTime k0(long j3) {
        return l0(this.f4975a, 0, 0, j3, 0);
    }

    public final C0531e k(long j3, b bVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1, bVar) : d(-j3, bVar);
    }

    private LocalDateTime l0(h hVar, long j3, long j4, long j5, long j6) {
        h hVar2 = hVar;
        int i3 = ((j3 | j4 | j5 | j6) > 0 ? 1 : ((j3 | j4 | j5 | j6) == 0 ? 0 : -1));
        l lVar = this.f4976b;
        if (i3 == 0) {
            return p0(hVar2, lVar);
        }
        long j7 = j4 / 1440;
        long j8 = j3 / 24;
        long j9 = j8 + j7 + (j5 / 86400) + (j6 / 86400000000000L);
        long j10 = (long) 1;
        long j11 = (j4 % 1440) * 60000000000L;
        long j12 = ((j3 % 24) * 3600000000000L) + j11 + ((j5 % 86400) * 1000000000) + (j6 % 86400000000000L);
        long l02 = lVar.l0();
        long j13 = (j12 * j10) + l02;
        long floorDiv = Math.floorDiv(j13, 86400000000000L) + (j9 * j10);
        long floorMod = Math.floorMod(j13, 86400000000000L);
        if (floorMod != l02) {
            lVar = l.d0(floorMod);
        }
        return p0(hVar2.l0(floorDiv), lVar);
    }

    public final Object a(t tVar) {
        if (tVar == s.b()) {
            return this.f4975a;
        }
        return super.a(tVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final ChronoZonedDateTime H(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    /* renamed from: X */
    public final int compareTo(C0531e eVar) {
        if (eVar instanceof LocalDateTime) {
            return r((LocalDateTime) eVar);
        }
        return super.compareTo(eVar);
    }

    public final boolean d0(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            int i3 = (this.f4975a.v() > localDateTime.f4975a.v() ? 1 : (this.f4975a.v() == localDateTime.f4975a.v() ? 0 : -1));
            if (i3 > 0 || (i3 == 0 && this.f4976b.l0() > localDateTime.f4976b.l0())) {
                return true;
            }
            return false;
        } else if (r(localDateTime) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean e0(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            int i3 = (this.f4975a.v() > localDateTime.f4975a.v() ? 1 : (this.f4975a.v() == localDateTime.f4975a.v() ? 0 : -1));
            if (i3 < 0 || (i3 == 0 && this.f4976b.l0() < localDateTime.f4976b.l0())) {
                return true;
            }
            return false;
        } else if (r(localDateTime) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (!this.f4975a.equals(localDateTime.f4975a) || !this.f4976b.equals(localDateTime.f4976b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4975a.hashCode() ^ this.f4976b.hashCode();
    }

    public final String toString() {
        String hVar = this.f4975a.toString();
        String lVar = this.f4976b.toString();
        return hVar + "T" + lVar;
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void q0(DataOutput dataOutput) {
        this.f4975a.u0(dataOutput);
        this.f4976b.p0(dataOutput);
    }
}
