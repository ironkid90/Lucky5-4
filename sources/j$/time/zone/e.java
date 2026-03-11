package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.h;
import j$.time.l;
import j$.time.n;
import j$.time.temporal.o;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a  reason: collision with root package name */
    private final n f5211a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f5212b;

    /* renamed from: c  reason: collision with root package name */
    private final DayOfWeek f5213c;

    /* renamed from: d  reason: collision with root package name */
    private final l f5214d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5215e;

    /* renamed from: f  reason: collision with root package name */
    private final d f5216f;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneOffset f5217g;

    /* renamed from: h  reason: collision with root package name */
    private final ZoneOffset f5218h;

    /* renamed from: i  reason: collision with root package name */
    private final ZoneOffset f5219i;

    e(n nVar, int i3, DayOfWeek dayOfWeek, l lVar, boolean z3, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f5211a = nVar;
        this.f5212b = (byte) i3;
        this.f5213c = dayOfWeek;
        this.f5214d = lVar;
        this.f5215e = z3;
        this.f5216f = dVar;
        this.f5217g = zoneOffset;
        this.f5218h = zoneOffset2;
        this.f5219i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        int i3;
        int i4;
        l lVar = this.f5214d;
        boolean z3 = this.f5215e;
        int m0 = z3 ? 86400 : lVar.m0();
        int Z = this.f5217g.Z();
        ZoneOffset zoneOffset = this.f5218h;
        int Z2 = zoneOffset.Z() - Z;
        ZoneOffset zoneOffset2 = this.f5219i;
        int Z3 = zoneOffset2.Z() - Z;
        int T3 = m0 % 3600 == 0 ? z3 ? 24 : lVar.T() : 31;
        int i5 = Z % 900 == 0 ? (Z / 900) + 128 : 255;
        if (Z2 == 0 || Z2 == 1800 || Z2 == 3600) {
            i3 = Z2 / 1800;
        } else {
            i3 = 3;
        }
        if (Z3 == 0 || Z3 == 1800 || Z3 == 3600) {
            i4 = Z3 / 1800;
        } else {
            i4 = 3;
        }
        DayOfWeek dayOfWeek = this.f5213c;
        objectOutput.writeInt((this.f5211a.p() << 28) + ((this.f5212b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.p()) << 19) + (T3 << 14) + (this.f5216f.ordinal() << 12) + (i5 << 4) + (i3 << 2) + i4);
        if (T3 == 31) {
            objectOutput.writeInt(m0);
        }
        if (i5 == 255) {
            objectOutput.writeInt(Z);
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset.Z());
        }
        if (i4 == 3) {
            objectOutput.writeInt(zoneOffset2.Z());
        }
    }

    static e b(ObjectInput objectInput) {
        DayOfWeek r3;
        int readInt = objectInput.readInt();
        n S3 = n.S(readInt >>> 28);
        int i3 = ((264241152 & readInt) >>> 22) - 32;
        int i4 = (3670016 & readInt) >>> 19;
        if (i4 == 0) {
            r3 = null;
        } else {
            r3 = DayOfWeek.r(i4);
        }
        DayOfWeek dayOfWeek = r3;
        int i5 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i6 = (readInt & 4080) >>> 4;
        int i7 = (readInt & 12) >>> 2;
        int i8 = readInt & 3;
        l e02 = i5 == 31 ? l.e0((long) objectInput.readInt()) : l.b0(i5 % 24);
        ZoneOffset c0 = ZoneOffset.c0(i6 == 255 ? objectInput.readInt() : (i6 - 128) * 900);
        ZoneOffset c02 = i7 == 3 ? ZoneOffset.c0(objectInput.readInt()) : ZoneOffset.c0((i7 * 1800) + c0.Z());
        ZoneOffset c03 = i8 == 3 ? ZoneOffset.c0(objectInput.readInt()) : ZoneOffset.c0((i8 * 1800) + c0.Z());
        boolean z3 = i5 == 24;
        Objects.requireNonNull(S3, "month");
        Objects.requireNonNull(e02, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        } else if (z3 && !e02.equals(l.f5138g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        } else if (e02.Z() == 0) {
            return new e(S3, i3, dayOfWeek, e02, z3, dVar, c0, c02, c03);
        } else {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
    }

    public final b a(int i3) {
        h hVar;
        n nVar = this.f5211a;
        DayOfWeek dayOfWeek = this.f5213c;
        byte b3 = this.f5212b;
        if (b3 < 0) {
            s.f5038d.getClass();
            hVar = h.h0(i3, nVar, nVar.C(s.Z((long) i3)) + 1 + b3);
            if (dayOfWeek != null) {
                hVar = hVar.m(new o(dayOfWeek.p(), 1));
            }
        } else {
            hVar = h.h0(i3, nVar, b3);
            if (dayOfWeek != null) {
                hVar = hVar.m(new o(dayOfWeek.p(), 0));
            }
        }
        if (this.f5215e) {
            hVar = hVar.l0(1);
        }
        LocalDateTime h02 = LocalDateTime.h0(hVar, this.f5214d);
        int i4 = c.f5209a[this.f5216f.ordinal()];
        ZoneOffset zoneOffset = this.f5218h;
        if (i4 == 1) {
            h02 = h02.k0((long) (zoneOffset.Z() - ZoneOffset.UTC.Z()));
        } else if (i4 == 2) {
            h02 = h02.k0((long) (zoneOffset.Z() - this.f5217g.Z()));
        }
        return new b(h02, zoneOffset, this.f5219i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f5211a == eVar.f5211a && this.f5212b == eVar.f5212b && this.f5213c == eVar.f5213c && this.f5216f == eVar.f5216f && this.f5214d.equals(eVar.f5214d) && this.f5215e == eVar.f5215e && this.f5217g.equals(eVar.f5217g) && this.f5218h.equals(eVar.f5218h) && this.f5219i.equals(eVar.f5219i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int m0 = ((this.f5214d.m0() + (this.f5215e ? 1 : 0)) << 15) + (this.f5211a.ordinal() << 11) + ((this.f5212b + 32) << 5);
        DayOfWeek dayOfWeek = this.f5213c;
        return ((this.f5217g.hashCode() ^ (this.f5216f.ordinal() + (m0 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f5218h.hashCode()) ^ this.f5219i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f5218h;
        ZoneOffset zoneOffset2 = this.f5219i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        n nVar = this.f5211a;
        byte b3 = this.f5212b;
        DayOfWeek dayOfWeek = this.f5213c;
        if (dayOfWeek == null) {
            sb.append(nVar.name());
            sb.append(' ');
            sb.append(b3);
        } else if (b3 == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(nVar.name());
        } else if (b3 < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b3) - 1);
            sb.append(" of ");
            sb.append(nVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(nVar.name());
            sb.append(' ');
            sb.append(b3);
        }
        sb.append(" at ");
        sb.append(this.f5215e ? "24:00" : this.f5214d.toString());
        sb.append(" ");
        sb.append(this.f5216f);
        sb.append(", standard offset ");
        sb.append(this.f5217g);
        sb.append(']');
        return sb.toString();
    }
}
