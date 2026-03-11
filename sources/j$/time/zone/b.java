package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.e;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a  reason: collision with root package name */
    private final long f5205a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalDateTime f5206b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneOffset f5207c;

    /* renamed from: d  reason: collision with root package name */
    private final ZoneOffset f5208d;

    public final int compareTo(Object obj) {
        return Long.compare(this.f5205a, ((b) obj).f5205a);
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f5205a = localDateTime.Y(zoneOffset);
        this.f5206b = localDateTime;
        this.f5207c = zoneOffset;
        this.f5208d = zoneOffset2;
    }

    b(long j3, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f5205a = j3;
        this.f5206b = LocalDateTime.i0(j3, 0, zoneOffset);
        this.f5207c = zoneOffset;
        this.f5208d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.f5205a, objectOutput);
        a.d(this.f5207c, objectOutput);
        a.d(this.f5208d, objectOutput);
    }

    public final long O() {
        return this.f5205a;
    }

    public final LocalDateTime r() {
        return this.f5206b;
    }

    public final ZoneOffset S() {
        return this.f5207c;
    }

    public final ZoneOffset J() {
        return this.f5208d;
    }

    public final Duration C() {
        return Duration.S((long) (this.f5208d.Z() - this.f5207c.Z()));
    }

    public final LocalDateTime p() {
        return this.f5206b.k0((long) (this.f5208d.Z() - this.f5207c.Z()));
    }

    public final boolean W() {
        return this.f5208d.Z() > this.f5207c.Z();
    }

    /* access modifiers changed from: package-private */
    public final List T() {
        return W() ? Collections.emptyList() : e.a(new Object[]{this.f5207c, this.f5208d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f5205a != bVar.f5205a || !this.f5207c.equals(bVar.f5207c) || !this.f5208d.equals(bVar.f5208d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f5206b.hashCode() ^ this.f5207c.hashCode()) ^ Integer.rotateLeft(this.f5208d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(W() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f5206b);
        sb.append(this.f5207c);
        sb.append(" to ");
        sb.append(this.f5208d);
        sb.append(']');
        return sb.toString();
    }
}
