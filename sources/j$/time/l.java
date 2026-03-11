package j$.time;

import L.k;
import j$.time.temporal.TemporalAccessor;
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
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class l implements m, n, Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final l f5136e;

    /* renamed from: f  reason: collision with root package name */
    public static final l f5137f = new l(23, 59, 59, 999999999);

    /* renamed from: g  reason: collision with root package name */
    public static final l f5138g;

    /* renamed from: h  reason: collision with root package name */
    private static final l[] f5139h = new l[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a  reason: collision with root package name */
    private final byte f5140a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f5141b;

    /* renamed from: c  reason: collision with root package name */
    private final byte f5142c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5143d;

    static {
        int i3 = 0;
        while (true) {
            l[] lVarArr = f5139h;
            if (i3 < lVarArr.length) {
                lVarArr[i3] = new l(i3, 0, 0, 0);
                i3++;
            } else {
                l lVar = lVarArr[0];
                f5138g = lVar;
                l lVar2 = lVarArr[12];
                f5136e = lVar;
                return;
            }
        }
    }

    public static l b0(int i3) {
        a.HOUR_OF_DAY.a0((long) i3);
        return f5139h[i3];
    }

    public static l c0(int i3, int i4, int i5, int i6) {
        a.HOUR_OF_DAY.a0((long) i3);
        a.MINUTE_OF_HOUR.a0((long) i4);
        a.SECOND_OF_MINUTE.a0((long) i5);
        a.NANO_OF_SECOND.a0((long) i6);
        return C(i3, i4, i5, i6);
    }

    public static l e0(long j3) {
        a.SECOND_OF_DAY.a0(j3);
        int i3 = (int) (j3 / 3600);
        long j4 = j3 - ((long) (i3 * 3600));
        int i4 = (int) (j4 / 60);
        return C(i3, i4, (int) (j4 - ((long) (i4 * 60))), 0);
    }

    public static l d0(long j3) {
        a.NANO_OF_DAY.a0(j3);
        int i3 = (int) (j3 / 3600000000000L);
        long j4 = j3 - (((long) i3) * 3600000000000L);
        int i4 = (int) (j4 / 60000000000L);
        long j5 = j4 - (((long) i4) * 60000000000L);
        int i5 = (int) (j5 / 1000000000);
        return C(i3, i4, i5, (int) (j5 - (((long) i5) * 1000000000)));
    }

    public static l J(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.a(s.c());
        if (lVar != null) {
            return lVar;
        }
        String name = temporalAccessor.getClass().getName();
        throw new RuntimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + name);
    }

    private static l C(int i3, int i4, int i5, int i6) {
        if ((i4 | i5 | i6) == 0) {
            return f5139h[i3];
        }
        return new l(i3, i4, i5, i6);
    }

    private l(int i3, int i4, int i5, int i6) {
        this.f5140a = (byte) i3;
        this.f5141b = (byte) i4;
        this.f5142c = (byte) i5;
        this.f5143d = i6;
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            return ((a) rVar).b0();
        }
        return rVar != null && rVar.W(this);
    }

    public final int i(r rVar) {
        if (rVar instanceof a) {
            return S(rVar);
        }
        return super.i(rVar);
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        if (rVar == a.NANO_OF_DAY) {
            return l0();
        }
        if (rVar == a.MICRO_OF_DAY) {
            return l0() / 1000;
        }
        return (long) S(rVar);
    }

    private int S(r rVar) {
        int i3 = k.f5134a[((a) rVar).ordinal()];
        byte b3 = this.f5141b;
        int i4 = this.f5143d;
        byte b4 = this.f5140a;
        switch (i3) {
            case 1:
                return i4;
            case k.FLOAT_FIELD_NUMBER:
                throw new RuntimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case k.INTEGER_FIELD_NUMBER:
                return i4 / 1000;
            case k.LONG_FIELD_NUMBER:
                throw new RuntimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case k.STRING_FIELD_NUMBER:
                return i4 / 1000000;
            case k.STRING_SET_FIELD_NUMBER:
                return (int) (l0() / 1000000);
            case k.DOUBLE_FIELD_NUMBER:
                return this.f5142c;
            case k.BYTES_FIELD_NUMBER:
                return m0();
            case 9:
                return b3;
            case 10:
                return (b4 * 60) + b3;
            case 11:
                return b4 % 12;
            case 12:
                int i5 = b4 % 12;
                if (i5 % 12 == 0) {
                    return 12;
                }
                return i5;
            case 13:
                return b4;
            case 14:
                if (b4 == 0) {
                    return 24;
                }
                return b4;
            case 15:
                return b4 / 12;
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    public final int T() {
        return this.f5140a;
    }

    public final int W() {
        return this.f5141b;
    }

    public final int a0() {
        return this.f5142c;
    }

    public final int Z() {
        return this.f5143d;
    }

    public final m j(h hVar) {
        return (l) hVar.c(this);
    }

    /* renamed from: n0 */
    public final l b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (l) rVar.p(this, j3);
        }
        a aVar = (a) rVar;
        aVar.a0(j3);
        int i3 = k.f5134a[aVar.ordinal()];
        byte b3 = this.f5141b;
        byte b4 = this.f5142c;
        int i4 = this.f5143d;
        byte b5 = this.f5140a;
        switch (i3) {
            case 1:
                return o0((int) j3);
            case k.FLOAT_FIELD_NUMBER:
                return d0(j3);
            case k.INTEGER_FIELD_NUMBER:
                return o0(((int) j3) * 1000);
            case k.LONG_FIELD_NUMBER:
                return d0(j3 * 1000);
            case k.STRING_FIELD_NUMBER:
                return o0(((int) j3) * 1000000);
            case k.STRING_SET_FIELD_NUMBER:
                return d0(j3 * 1000000);
            case k.DOUBLE_FIELD_NUMBER:
                int i5 = (int) j3;
                if (b4 == i5) {
                    return this;
                }
                a.SECOND_OF_MINUTE.a0((long) i5);
                return C(b5, b3, i5, i4);
            case k.BYTES_FIELD_NUMBER:
                return j0(j3 - ((long) m0()));
            case 9:
                int i6 = (int) j3;
                if (b3 == i6) {
                    return this;
                }
                a.MINUTE_OF_HOUR.a0((long) i6);
                return C(b5, i6, b4, i4);
            case 10:
                return h0(j3 - ((long) ((b5 * 60) + b3)));
            case 11:
                return g0(j3 - ((long) (b5 % 12)));
            case 12:
                if (j3 == 12) {
                    j3 = 0;
                }
                return g0(j3 - ((long) (b5 % 12)));
            case 13:
                int i7 = (int) j3;
                if (b5 == i7) {
                    return this;
                }
                a.HOUR_OF_DAY.a0((long) i7);
                return C(i7, b3, b4, i4);
            case 14:
                if (j3 == 24) {
                    j3 = 0;
                }
                int i8 = (int) j3;
                if (b5 == i8) {
                    return this;
                }
                a.HOUR_OF_DAY.a0((long) i8);
                return C(i8, b3, b4, i4);
            case 15:
                return g0((j3 - ((long) (b5 / 12))) * 12);
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    public final l o0(int i3) {
        if (this.f5143d == i3) {
            return this;
        }
        a.NANO_OF_SECOND.a0((long) i3);
        return C(this.f5140a, this.f5141b, this.f5142c, i3);
    }

    /* renamed from: f0 */
    public final l d(long j3, u uVar) {
        if (!(uVar instanceof b)) {
            return (l) uVar.p(this, j3);
        }
        switch (k.f5135b[((b) uVar).ordinal()]) {
            case 1:
                return i0(j3);
            case k.FLOAT_FIELD_NUMBER:
                return i0((j3 % 86400000000L) * 1000);
            case k.INTEGER_FIELD_NUMBER:
                return i0((j3 % 86400000) * 1000000);
            case k.LONG_FIELD_NUMBER:
                return j0(j3);
            case k.STRING_FIELD_NUMBER:
                return h0(j3);
            case k.STRING_SET_FIELD_NUMBER:
                return g0(j3);
            case k.DOUBLE_FIELD_NUMBER:
                return g0((j3 % 2) * 12);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    public final l g0(long j3) {
        if (j3 == 0) {
            return this;
        }
        return C(((((int) (j3 % 24)) + this.f5140a) + 24) % 24, this.f5141b, this.f5142c, this.f5143d);
    }

    public final l h0(long j3) {
        if (j3 == 0) {
            return this;
        }
        int i3 = (this.f5140a * 60) + this.f5141b;
        int i4 = ((((int) (j3 % 1440)) + i3) + 1440) % 1440;
        if (i3 == i4) {
            return this;
        }
        return C(i4 / 60, i4 % 60, this.f5142c, this.f5143d);
    }

    public final l j0(long j3) {
        if (j3 == 0) {
            return this;
        }
        int i3 = (this.f5141b * 60) + (this.f5140a * 3600) + this.f5142c;
        int i4 = ((((int) (j3 % 86400)) + i3) + 86400) % 86400;
        if (i3 == i4) {
            return this;
        }
        return C(i4 / 3600, (i4 / 60) % 60, i4 % 60, this.f5143d);
    }

    public final l i0(long j3) {
        if (j3 == 0) {
            return this;
        }
        long l02 = l0();
        long j4 = (((j3 % 86400000000000L) + l02) + 86400000000000L) % 86400000000000L;
        if (l02 == j4) {
            return this;
        }
        return C((int) (j4 / 3600000000000L), (int) ((j4 / 60000000000L) % 60), (int) ((j4 / 1000000000) % 60), (int) (j4 % 1000000000));
    }

    public final m e(long j3, u uVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1, uVar) : d(-j3, uVar);
    }

    public final Object a(t tVar) {
        if (tVar == s.a() || tVar == s.g() || tVar == s.f() || tVar == s.d()) {
            return null;
        }
        if (tVar == s.c()) {
            return this;
        }
        if (tVar == s.b()) {
            return null;
        }
        if (tVar == s.e()) {
            return b.NANOS;
        }
        return tVar.j(this);
    }

    public final m c(m mVar) {
        return mVar.b(l0(), a.NANO_OF_DAY);
    }

    public final int m0() {
        return (this.f5141b * 60) + (this.f5140a * 3600) + this.f5142c;
    }

    public final long l0() {
        return (((long) this.f5142c) * 1000000000) + (((long) this.f5141b) * 60000000000L) + (((long) this.f5140a) * 3600000000000L) + ((long) this.f5143d);
    }

    /* renamed from: r */
    public final int compareTo(l lVar) {
        int compare = Integer.compare(this.f5140a, lVar.f5140a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f5141b, lVar.f5141b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f5142c, lVar.f5142c);
        return compare3 == 0 ? Integer.compare(this.f5143d, lVar.f5143d) : compare3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f5140a == lVar.f5140a && this.f5141b == lVar.f5141b && this.f5142c == lVar.f5142c && this.f5143d == lVar.f5143d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long l02 = l0();
        return (int) (l02 ^ (l02 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b3 = this.f5140a;
        sb.append(b3 < 10 ? "0" : "");
        sb.append(b3);
        String str = ":";
        byte b4 = this.f5141b;
        sb.append(b4 < 10 ? ":0" : str);
        sb.append(b4);
        byte b5 = this.f5142c;
        int i3 = this.f5143d;
        if (b5 > 0 || i3 > 0) {
            if (b5 < 10) {
                str = ":0";
            }
            sb.append(str);
            sb.append(b5);
            if (i3 > 0) {
                sb.append('.');
                if (i3 % 1000000 == 0) {
                    sb.append(Integer.toString((i3 / 1000000) + 1000).substring(1));
                } else if (i3 % 1000 == 0) {
                    sb.append(Integer.toString((i3 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i3 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void p0(DataOutput dataOutput) {
        byte b3 = this.f5142c;
        byte b4 = this.f5140a;
        byte b5 = this.f5141b;
        int i3 = this.f5143d;
        if (i3 != 0) {
            dataOutput.writeByte(b4);
            dataOutput.writeByte(b5);
            dataOutput.writeByte(b3);
            dataOutput.writeInt(i3);
        } else if (b3 != 0) {
            dataOutput.writeByte(b4);
            dataOutput.writeByte(b5);
            dataOutput.writeByte(~b3);
        } else if (b5 == 0) {
            dataOutput.writeByte(~b4);
        } else {
            dataOutput.writeByte(b4);
            dataOutput.writeByte(~b5);
        }
    }

    static l k0(ObjectInput objectInput) {
        int i3;
        int i4;
        int readByte = objectInput.readByte();
        int i5 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i3 = 0;
            i4 = 0;
        } else {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                int i6 = ~readByte2;
                i4 = 0;
                i5 = i6;
                i3 = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i3 = ~readByte3;
                } else {
                    i5 = objectInput.readInt();
                    i3 = readByte3;
                }
                byte b3 = readByte2;
                i4 = i5;
                i5 = b3;
            }
        }
        return c0(readByte, i5, i3, i4);
    }
}
