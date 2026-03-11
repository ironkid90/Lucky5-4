package x0;

import java.util.Set;

/* renamed from: x0.c  reason: case insensitive filesystem */
public final class C0511c {

    /* renamed from: a  reason: collision with root package name */
    public final long f4769a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4770b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f4771c;

    public C0511c(long j3, long j4, Set set) {
        this.f4769a = j3;
        this.f4770b = j4;
        this.f4771c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0511c)) {
            return false;
        }
        C0511c cVar = (C0511c) obj;
        if (this.f4769a == cVar.f4769a && this.f4770b == cVar.f4770b && this.f4771c.equals(cVar.f4771c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4769a;
        long j4 = this.f4770b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f4771c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4769a + ", maxAllowedDelay=" + this.f4770b + ", flags=" + this.f4771c + "}";
    }
}
