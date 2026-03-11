package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a  reason: collision with root package name */
    private final long f5187a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5188b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5189c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5190d;

    public static w j(long j3, long j4) {
        if (j3 <= j4) {
            return new w(j3, j3, j4, j4);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static w k(long j3, long j4) {
        if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (1 <= j4) {
            return new w(1, 1, j3, j4);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    private w(long j3, long j4, long j5, long j6) {
        this.f5187a = j3;
        this.f5188b = j4;
        this.f5189c = j5;
        this.f5190d = j6;
    }

    public final boolean g() {
        return this.f5187a == this.f5188b && this.f5189c == this.f5190d;
    }

    public final long e() {
        return this.f5187a;
    }

    public final long f() {
        return this.f5189c;
    }

    public final long d() {
        return this.f5190d;
    }

    public final boolean h() {
        return this.f5187a >= -2147483648L && this.f5190d <= 2147483647L;
    }

    public final boolean i(long j3) {
        return j3 >= this.f5187a && j3 <= this.f5190d;
    }

    public final int a(long j3, r rVar) {
        if (h() && i(j3)) {
            return (int) j3;
        }
        throw new RuntimeException(c(j3, rVar));
    }

    public final void b(long j3, r rVar) {
        if (!i(j3)) {
            throw new RuntimeException(c(j3, rVar));
        }
    }

    private String c(long j3, r rVar) {
        if (rVar != null) {
            return "Invalid value for " + rVar + " (valid values " + this + "): " + j3;
        }
        return "Invalid value (valid values " + this + "): " + j3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j3 = this.f5187a;
        long j4 = this.f5188b;
        if (j3 <= j4) {
            long j5 = this.f5189c;
            long j6 = this.f5190d;
            if (j5 > j6) {
                throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
            } else if (j4 > j6) {
                throw new InvalidObjectException("Minimum value must be less than maximum value");
            }
        } else {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f5187a == wVar.f5187a && this.f5188b == wVar.f5188b && this.f5189c == wVar.f5189c && this.f5190d == wVar.f5190d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5188b;
        long j4 = this.f5187a + (j3 << 16) + (j3 >> 48);
        long j5 = this.f5189c;
        long j6 = j4 + (j5 << 32) + (j5 >> 32);
        long j7 = this.f5190d;
        long j8 = j6 + (j7 << 48) + (j7 >> 16);
        return (int) ((j8 >>> 32) ^ j8);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j3 = this.f5187a;
        sb.append(j3);
        long j4 = this.f5188b;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        sb.append(" - ");
        long j5 = this.f5189c;
        sb.append(j5);
        long j6 = this.f5190d;
        if (j5 != j6) {
            sb.append('/');
            sb.append(j6);
        }
        return sb.toString();
    }
}
