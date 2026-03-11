package j$.time;

import j$.time.chrono.C0528b;
import j$.time.chrono.C0531e;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import j$.time.zone.f;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class ZonedDateTime implements m, ChronoZonedDateTime<h>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f4986a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f4987b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneId f4988c;

    public final C0531e B() {
        return this.f4986a;
    }

    public final m e(long j3, u uVar) {
        b bVar = (b) uVar;
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1, bVar) : d(-j3, bVar);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        a aVar;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            aVar = a.f4989b;
        } else {
            aVar = new a(zoneId);
        }
        Objects.requireNonNull(aVar, "clock");
        return C(Instant.S(System.currentTimeMillis()), aVar.a());
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return J(localDateTime, zoneId, (ZoneOffset) null);
    }

    public static ZonedDateTime of(int i3, int i4, int i5, int i6, int i7, int i8, int i9, ZoneId zoneId) {
        return J(LocalDateTime.g0(i3, i4, i5, i6, i7, i8, i9), zoneId, (ZoneOffset) null);
    }

    public static ZonedDateTime J(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        f r3 = zoneId.r();
        List g2 = r3.g(localDateTime);
        if (g2.size() == 1) {
            zoneOffset = (ZoneOffset) g2.get(0);
        } else if (g2.size() == 0) {
            j$.time.zone.b f3 = r3.f(localDateTime);
            localDateTime = localDateTime.k0(f3.C().J());
            zoneOffset = f3.J();
        } else if (zoneOffset == null || !g2.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g2.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime C(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return r(instant.C(), instant.J(), zoneId);
    }

    private static ZonedDateTime r(long j3, int i3, ZoneId zoneId) {
        ZoneOffset d3 = zoneId.r().d(Instant.W(j3, (long) i3));
        return new ZonedDateTime(LocalDateTime.i0(j3, i3, d3), zoneId, d3);
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f4986a = localDateTime;
        this.f4987b = zoneOffset;
        this.f4988c = zoneId;
    }

    public final boolean f(r rVar) {
        return (rVar instanceof a) || (rVar != null && rVar.W(this));
    }

    public final w l(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.J(this);
        }
        if (rVar == a.INSTANT_SECONDS || rVar == a.OFFSET_SECONDS) {
            return ((a) rVar).C();
        }
        return this.f4986a.l(rVar);
    }

    public final int i(r rVar) {
        if (!(rVar instanceof a)) {
            return super.i(rVar);
        }
        int i3 = z.f5202a[((a) rVar).ordinal()];
        if (i3 == 1) {
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        } else if (i3 != 2) {
            return this.f4986a.i(rVar);
        } else {
            return this.f4987b.Z();
        }
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i3 = z.f5202a[((a) rVar).ordinal()];
        if (i3 == 1) {
            return O();
        }
        if (i3 != 2) {
            return this.f4986a.g(rVar);
        }
        return (long) this.f4987b.Z();
    }

    public final ZoneOffset E() {
        return this.f4987b;
    }

    public final ZoneId Q() {
        return this.f4988c;
    }

    public final ChronoZonedDateTime I(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f4988c.equals(zoneId) ? this : J(this.f4986a, zoneId, this.f4987b);
    }

    public final LocalDateTime W() {
        return this.f4986a;
    }

    public final C0528b o() {
        return this.f4986a.m0();
    }

    public int getYear() {
        return this.f4986a.c0();
    }

    public int getMonthValue() {
        return this.f4986a.Z();
    }

    public int getDayOfMonth() {
        return this.f4986a.J();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f4986a.S();
    }

    public final l n() {
        return this.f4986a.n();
    }

    public int getHour() {
        return this.f4986a.T();
    }

    public int getMinute() {
        return this.f4986a.W();
    }

    public int getSecond() {
        return this.f4986a.b0();
    }

    public int getNano() {
        return this.f4986a.a0();
    }

    /* renamed from: a0 */
    public final ZonedDateTime m(h hVar) {
        return J(LocalDateTime.h0(hVar, this.f4986a.n()), this.f4988c, this.f4987b);
    }

    /* renamed from: Z */
    public final ZonedDateTime b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (ZonedDateTime) rVar.p(this, j3);
        }
        a aVar = (a) rVar;
        int i3 = z.f5202a[aVar.ordinal()];
        ZoneId zoneId = this.f4988c;
        if (i3 == 1) {
            return r(j3, getNano(), zoneId);
        }
        ZoneOffset zoneOffset = this.f4987b;
        LocalDateTime localDateTime = this.f4986a;
        if (i3 != 2) {
            return J(localDateTime.b(j3, rVar), zoneId, zoneOffset);
        }
        ZoneOffset c0 = ZoneOffset.c0(aVar.Z(j3));
        return (c0.equals(zoneOffset) || !zoneId.r().g(localDateTime).contains(c0)) ? this : new ZonedDateTime(localDateTime, zoneId, c0);
    }

    /* renamed from: S */
    public final ZonedDateTime d(long j3, u uVar) {
        if (!(uVar instanceof b)) {
            return (ZonedDateTime) uVar.p(this, j3);
        }
        b bVar = (b) uVar;
        int compareTo = bVar.compareTo(b.DAYS);
        ZoneOffset zoneOffset = this.f4987b;
        ZoneId zoneId = this.f4988c;
        LocalDateTime localDateTime = this.f4986a;
        if (compareTo >= 0 && bVar != b.FOREVER) {
            return J(localDateTime.d(j3, uVar), zoneId, zoneOffset);
        }
        LocalDateTime j02 = localDateTime.d(j3, uVar);
        Objects.requireNonNull(j02, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.r().g(j02).contains(zoneOffset)) {
            return new ZonedDateTime(j02, zoneId, zoneOffset);
        }
        return r(j02.Y(zoneOffset), j02.a0(), zoneId);
    }

    public ZonedDateTime plusDays(long j3) {
        return J(this.f4986a.plusDays(j3), this.f4988c, this.f4987b);
    }

    public final ChronoZonedDateTime k(long j3, b bVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1, bVar) : d(-j3, bVar);
    }

    public final Object a(t tVar) {
        return tVar == s.b() ? this.f4986a.m0() : super.a(tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        if (!this.f4986a.equals(zonedDateTime.f4986a) || !this.f4987b.equals(zonedDateTime.f4987b) || !this.f4988c.equals(zonedDateTime.f4988c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f4986a.hashCode() ^ this.f4987b.hashCode()) ^ Integer.rotateLeft(this.f4988c.hashCode(), 3);
    }

    public final String toString() {
        String localDateTime = this.f4986a.toString();
        ZoneOffset zoneOffset = this.f4987b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.f4988c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void b0(DataOutput dataOutput) {
        this.f4986a.q0(dataOutput);
        this.f4987b.f0(dataOutput);
        this.f4988c.T((ObjectOutput) dataOutput);
    }

    static ZonedDateTime T(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f4973c;
        h hVar = h.f5128d;
        LocalDateTime h02 = LocalDateTime.h0(h.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.k0(objectInput));
        ZoneOffset e02 = ZoneOffset.e0(objectInput);
        ZoneId zoneId = (ZoneId) t.a(objectInput);
        Objects.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || e02.equals(zoneId)) {
            return new ZonedDateTime(h02, zoneId, e02);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }
}
