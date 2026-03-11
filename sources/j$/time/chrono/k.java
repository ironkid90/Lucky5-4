package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.r;
import j$.time.temporal.u;
import j$.time.zone.b;
import j$.time.zone.f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

final class k implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a  reason: collision with root package name */
    private final transient C0533g f5016a;

    /* renamed from: b  reason: collision with root package name */
    private final transient ZoneOffset f5017b;

    /* renamed from: c  reason: collision with root package name */
    private final transient ZoneId f5018c;

    static ChronoZonedDateTime C(ZoneId zoneId, ZoneOffset zoneOffset, C0533g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, gVar);
        }
        f r3 = zoneId.r();
        LocalDateTime C3 = LocalDateTime.C(gVar);
        List g2 = r3.g(C3);
        if (g2.size() == 1) {
            zoneOffset = (ZoneOffset) g2.get(0);
        } else if (g2.size() == 0) {
            b f3 = r3.f(C3);
            gVar = gVar.S(f3.C().J());
            zoneOffset = f3.J();
        } else if (zoneOffset == null || !g2.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g2.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, gVar);
    }

    static k J(l lVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d3 = zoneId.r().d(instant);
        Objects.requireNonNull(d3, "offset");
        return new k(zoneId, d3, (C0533g) lVar.x(LocalDateTime.i0(instant.C(), instant.J(), d3)));
    }

    static k r(l lVar, m mVar) {
        k kVar = (k) mVar;
        C0527a aVar = (C0527a) lVar;
        if (aVar.equals(kVar.h())) {
            return kVar;
        }
        String s3 = aVar.s();
        String s4 = kVar.h().s();
        throw new ClassCastException("Chronology mismatch, required: " + s3 + ", actual: " + s4);
    }

    private k(ZoneId zoneId, ZoneOffset zoneOffset, C0533g gVar) {
        Objects.requireNonNull(gVar, "dateTime");
        this.f5016a = gVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f5017b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.f5018c = zoneId;
    }

    public final ZoneOffset E() {
        return this.f5017b;
    }

    public final C0531e B() {
        return this.f5016a;
    }

    public final ZoneId Q() {
        return this.f5018c;
    }

    public final ChronoZonedDateTime I(ZoneId zoneId) {
        return C(zoneId, this.f5017b, this.f5016a);
    }

    public final boolean f(r rVar) {
        return (rVar instanceof a) || (rVar != null && rVar.W(this));
    }

    public final ChronoZonedDateTime b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return r(h(), rVar.p(this, j3));
        }
        a aVar = (a) rVar;
        int i3 = C0536j.f5015a[aVar.ordinal()];
        if (i3 == 1) {
            return d(j3 - O(), (u) j$.time.temporal.b.SECONDS);
        }
        ZoneId zoneId = this.f5018c;
        C0533g gVar = this.f5016a;
        if (i3 != 2) {
            return C(zoneId, this.f5017b, gVar.b(j3, rVar));
        }
        return J(h(), Instant.W(gVar.Y(ZoneOffset.c0(aVar.Z(j3))), (long) gVar.n().Z()), zoneId);
    }

    public final ChronoZonedDateTime d(long j3, u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return j(this.f5016a.d(j3, uVar));
        }
        return r(h(), uVar.p(this, j3));
    }

    private Object writeReplace() {
        return new E((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f5016a);
        objectOutput.writeObject(this.f5017b);
        objectOutput.writeObject(this.f5018c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChronoZonedDateTime)) {
            return false;
        }
        if (compareTo((ChronoZonedDateTime) obj) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5016a.hashCode() ^ this.f5017b.hashCode()) ^ Integer.rotateLeft(this.f5018c.hashCode(), 3);
    }

    public final String toString() {
        String gVar = this.f5016a.toString();
        ZoneOffset zoneOffset = this.f5017b;
        String str = gVar + zoneOffset.toString();
        ZoneId zoneId = this.f5018c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }
}
