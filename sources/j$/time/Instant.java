package j$.time;

import L.k;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class Instant implements m, n, Comparable<Instant>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Instant f4970c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a  reason: collision with root package name */
    private final long f4971a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4972b;

    public final int compareTo(Object obj) {
        Instant instant = (Instant) obj;
        int compare = Long.compare(this.f4971a, instant.f4971a);
        return compare != 0 ? compare : this.f4972b - instant.f4972b;
    }

    static {
        W(-31557014167219200L, 0);
        W(31556889864403199L, 999999999);
    }

    public static Instant T(long j3) {
        return r(j3, 0);
    }

    public static Instant W(long j3, long j4) {
        return r(Math.addExact(j3, Math.floorDiv(j4, 1000000000)), (int) Math.floorMod(j4, 1000000000));
    }

    public static Instant S(long j3) {
        long j4 = (long) 1000;
        return r(Math.floorDiv(j3, j4), ((int) Math.floorMod(j3, j4)) * 1000000);
    }

    private static Instant r(long j3, int i3) {
        if ((((long) i3) | j3) == 0) {
            return f4970c;
        }
        if (j3 >= -31557014167219200L && j3 <= 31556889864403199L) {
            return new Instant(j3, i3);
        }
        throw new RuntimeException("Instant exceeds minimum or maximum instant");
    }

    private Instant(long j3, int i3) {
        this.f4971a = j3;
        this.f4972b = i3;
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            if (rVar == a.INSTANT_SECONDS || rVar == a.NANO_OF_SECOND || rVar == a.MICRO_OF_SECOND || rVar == a.MILLI_OF_SECOND) {
                return true;
            }
            return false;
        } else if (rVar == null || !rVar.W(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final int i(r rVar) {
        if (!(rVar instanceof a)) {
            return super.l(rVar).a(rVar.r(this), rVar);
        }
        int i3 = f.f5053a[((a) rVar).ordinal()];
        int i4 = this.f4972b;
        if (i3 == 1) {
            return i4;
        }
        if (i3 == 2) {
            return i4 / 1000;
        }
        if (i3 == 3) {
            return i4 / 1000000;
        }
        if (i3 == 4) {
            a.INSTANT_SECONDS.Z(this.f4971a);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final long g(r rVar) {
        int i3;
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i4 = f.f5053a[((a) rVar).ordinal()];
        int i5 = this.f4972b;
        if (i4 == 1) {
            return (long) i5;
        }
        if (i4 == 2) {
            i3 = i5 / 1000;
        } else if (i4 == 3) {
            i3 = i5 / 1000000;
        } else if (i4 == 4) {
            return this.f4971a;
        } else {
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
        return (long) i3;
    }

    public final long C() {
        return this.f4971a;
    }

    public final int J() {
        return this.f4972b;
    }

    public final m j(h hVar) {
        return (Instant) hVar.c(this);
    }

    public final m b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (Instant) rVar.p(this, j3);
        }
        a aVar = (a) rVar;
        aVar.a0(j3);
        int i3 = f.f5053a[aVar.ordinal()];
        int i4 = this.f4972b;
        long j4 = this.f4971a;
        if (i3 != 1) {
            if (i3 == 2) {
                int i5 = ((int) j3) * 1000;
                if (i5 != i4) {
                    return r(j4, i5);
                }
            } else if (i3 == 3) {
                int i6 = ((int) j3) * 1000000;
                if (i6 != i4) {
                    return r(j4, i6);
                }
            } else if (i3 != 4) {
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
            } else if (j3 != j4) {
                return r(j3, i4);
            }
        } else if (j3 != ((long) i4)) {
            return r(j4, (int) j3);
        }
        return this;
    }

    /* renamed from: a0 */
    public final Instant d(long j3, u uVar) {
        if (!(uVar instanceof b)) {
            return (Instant) uVar.p(this, j3);
        }
        switch (f.f5054b[((b) uVar).ordinal()]) {
            case 1:
                return Z(0, j3);
            case k.FLOAT_FIELD_NUMBER:
                return Z(j3 / 1000000, (j3 % 1000000) * 1000);
            case k.INTEGER_FIELD_NUMBER:
                return Z(j3 / 1000, (j3 % 1000) * 1000000);
            case k.LONG_FIELD_NUMBER:
                return Z(j3, 0);
            case k.STRING_FIELD_NUMBER:
                return Z(Math.multiplyExact(j3, (long) 60), 0);
            case k.STRING_SET_FIELD_NUMBER:
                return Z(Math.multiplyExact(j3, (long) 3600), 0);
            case k.DOUBLE_FIELD_NUMBER:
                return Z(Math.multiplyExact(j3, (long) 43200), 0);
            case k.BYTES_FIELD_NUMBER:
                return Z(Math.multiplyExact(j3, (long) 86400), 0);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    private Instant Z(long j3, long j4) {
        if ((j3 | j4) == 0) {
            return this;
        }
        return W(Math.addExact(Math.addExact(this.f4971a, j3), j4 / 1000000000), ((long) this.f4972b) + (j4 % 1000000000));
    }

    public final m e(long j3, u uVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1, uVar) : d(-j3, uVar);
    }

    public final Object a(t tVar) {
        if (tVar == s.e()) {
            return b.NANOS;
        }
        if (tVar == s.a() || tVar == s.g() || tVar == s.f() || tVar == s.d() || tVar == s.b() || tVar == s.c()) {
            return null;
        }
        return tVar.j(this);
    }

    public final m c(m mVar) {
        return mVar.b(this.f4971a, a.INSTANT_SECONDS).b((long) this.f4972b, a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.C(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j3 = this.f4971a;
        int i3 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        int i4 = this.f4972b;
        if (i3 >= 0 || i4 <= 0) {
            return Math.addExact(Math.multiplyExact(j3, (long) 1000), (long) (i4 / 1000000));
        }
        return Math.addExact(Math.multiplyExact(j3 + 1, (long) 1000), (long) ((i4 / 1000000) - 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        if (this.f4971a == instant.f4971a && this.f4972b == instant.f4972b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4971a;
        return (this.f4972b * 51) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f5056f.format(this);
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void b0(DataOutput dataOutput) {
        dataOutput.writeLong(this.f4971a);
        dataOutput.writeInt(this.f4972b);
    }
}
