package j$.time;

import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.q;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

public final class Duration implements q, Comparable<Duration>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Duration f4967c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a  reason: collision with root package name */
    private final long f4968a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4969b;

    public final int compareTo(Object obj) {
        Duration duration = (Duration) obj;
        int compare = Long.compare(this.f4968a, duration.f4968a);
        return compare != 0 ? compare : this.f4969b - duration.f4969b;
    }

    static {
        BigInteger.valueOf(1000000000);
    }

    public static Duration S(long j3) {
        return r(j3, 0);
    }

    public static Duration T(long j3, long j4) {
        return r(Math.addExact(j3, Math.floorDiv(j4, 1000000000)), (int) Math.floorMod(j4, 1000000000));
    }

    public static Duration ofMillis(long j3) {
        long j4 = j3 / 1000;
        int i3 = (int) (j3 % 1000);
        if (i3 < 0) {
            i3 += 1000;
            j4--;
        }
        return r(j4, i3 * 1000000);
    }

    private static Duration r(long j3, int i3) {
        if ((((long) i3) | j3) == 0) {
            return f4967c;
        }
        return new Duration(j3, i3);
    }

    private Duration(long j3, int i3) {
        this.f4968a = j3;
        this.f4969b = i3;
    }

    public final long J() {
        return this.f4968a;
    }

    public final int C() {
        return this.f4969b;
    }

    public final m p(m mVar) {
        long j3 = this.f4968a;
        if (j3 != 0) {
            mVar = mVar.d(j3, b.SECONDS);
        }
        int i3 = this.f4969b;
        return i3 != 0 ? mVar.d((long) i3, b.NANOS) : mVar;
    }

    public long toMillis() {
        long j3 = (long) this.f4969b;
        long j4 = this.f4968a;
        if (j4 < 0) {
            j4++;
            j3 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j4, (long) 1000), j3 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        if (this.f4968a == duration.f4968a && this.f4969b == duration.f4969b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4968a;
        return (this.f4969b * 51) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        if (this == f4967c) {
            return "PT0S";
        }
        long j3 = this.f4968a;
        int i3 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        int i4 = this.f4969b;
        long j4 = (i3 >= 0 || i4 <= 0) ? j3 : 1 + j3;
        long j5 = j4 / 3600;
        int i5 = (int) ((j4 % 3600) / 60);
        int i6 = (int) (j4 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j5 != 0) {
            sb.append(j5);
            sb.append('H');
        }
        if (i5 != 0) {
            sb.append(i5);
            sb.append('M');
        }
        if (i6 == 0 && i4 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j3 >= 0 || i4 <= 0) {
            sb.append(i6);
        } else if (i6 == 0) {
            sb.append("-0");
        } else {
            sb.append(i6);
        }
        if (i4 > 0) {
            int length = sb.length();
            if (j3 < 0) {
                sb.append(2000000000 - ((long) i4));
            } else {
                sb.append(((long) i4) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.f4968a);
        objectOutput.writeInt(this.f4969b);
    }
}
