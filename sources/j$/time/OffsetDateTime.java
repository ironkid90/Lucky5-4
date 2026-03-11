package j$.time;

import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

public final class OffsetDateTime implements m, n, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f4977a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f4978b;

    public final int compareTo(Object obj) {
        int i3;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        ZoneOffset zoneOffset = offsetDateTime.f4978b;
        ZoneOffset zoneOffset2 = this.f4978b;
        if (zoneOffset2.equals(zoneOffset)) {
            i3 = toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f4977a;
            long Y2 = localDateTime.Y(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime.f4978b;
            LocalDateTime localDateTime2 = offsetDateTime.f4977a;
            int compare = Long.compare(Y2, localDateTime2.Y(zoneOffset3));
            i3 = compare == 0 ? localDateTime.n().Z() - localDateTime2.n().Z() : compare;
        }
        return i3 == 0 ? toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime()) : i3;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f4973c;
        ZoneOffset zoneOffset = ZoneOffset.f4983g;
        localDateTime.getClass();
        r(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f4974d;
        ZoneOffset zoneOffset2 = ZoneOffset.f4982f;
        localDateTime2.getClass();
        r(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime r(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime C(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d3 = zoneId.r().d(instant);
        return new OffsetDateTime(LocalDateTime.i0(instant.C(), instant.J(), d3), d3);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f4977a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f4978b = zoneOffset;
    }

    private OffsetDateTime T(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (this.f4977a != localDateTime || !this.f4978b.equals(zoneOffset)) {
            return new OffsetDateTime(localDateTime, zoneOffset);
        }
        return this;
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
        return this.f4977a.l(rVar);
    }

    public final int i(r rVar) {
        if (!(rVar instanceof a)) {
            return super.i(rVar);
        }
        int i3 = q.f5150a[((a) rVar).ordinal()];
        if (i3 == 1) {
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        } else if (i3 != 2) {
            return this.f4977a.i(rVar);
        } else {
            return this.f4978b.Z();
        }
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i3 = q.f5150a[((a) rVar).ordinal()];
        ZoneOffset zoneOffset = this.f4978b;
        LocalDateTime localDateTime = this.f4977a;
        if (i3 == 1) {
            return localDateTime.Y(zoneOffset);
        }
        if (i3 != 2) {
            return localDateTime.g(rVar);
        }
        return (long) zoneOffset.Z();
    }

    public LocalDateTime toLocalDateTime() {
        return this.f4977a;
    }

    public final m j(h hVar) {
        return T(this.f4977a.o0(hVar), this.f4978b);
    }

    public final m b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (OffsetDateTime) rVar.p(this, j3);
        }
        a aVar = (a) rVar;
        int i3 = q.f5150a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.f4978b;
        LocalDateTime localDateTime = this.f4977a;
        if (i3 == 1) {
            return C(Instant.W(j3, (long) localDateTime.a0()), zoneOffset);
        }
        if (i3 != 2) {
            return T(localDateTime.b(j3, rVar), zoneOffset);
        }
        return T(localDateTime, ZoneOffset.c0(aVar.Z(j3)));
    }

    /* renamed from: J */
    public final OffsetDateTime d(long j3, u uVar) {
        if (uVar instanceof b) {
            return T(this.f4977a.d(j3, uVar), this.f4978b);
        }
        return (OffsetDateTime) uVar.p(this, j3);
    }

    public final m e(long j3, u uVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1, uVar) : d(-j3, uVar);
    }

    public final Object a(t tVar) {
        if (tVar == s.d() || tVar == s.f()) {
            return this.f4978b;
        }
        if (tVar == s.g()) {
            return null;
        }
        t b3 = s.b();
        LocalDateTime localDateTime = this.f4977a;
        if (tVar == b3) {
            return localDateTime.m0();
        }
        if (tVar == s.c()) {
            return localDateTime.n();
        }
        if (tVar == s.a()) {
            return j$.time.chrono.s.f5038d;
        }
        if (tVar == s.e()) {
            return b.NANOS;
        }
        return tVar.j(this);
    }

    public final m c(m mVar) {
        a aVar = a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f4977a;
        return mVar.b(localDateTime.m0().v(), aVar).b(localDateTime.n().l0(), a.NANO_OF_DAY).b((long) this.f4978b.Z(), a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (!this.f4977a.equals(offsetDateTime.f4977a) || !this.f4978b.equals(offsetDateTime.f4978b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4977a.hashCode() ^ this.f4978b.hashCode();
    }

    public final String toString() {
        String localDateTime = this.f4977a.toString();
        String zoneOffset = this.f4978b.toString();
        return localDateTime + zoneOffset;
    }

    private Object writeReplace() {
        return new t((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f4977a.q0(objectOutput);
        this.f4978b.f0(objectOutput);
    }

    static OffsetDateTime S(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f4973c;
        h hVar = h.f5128d;
        return new OffsetDateTime(LocalDateTime.h0(h.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.k0(objectInput)), ZoneOffset.e0(objectInput));
    }
}
