package X0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f1919a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1920b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1921c;

    public a(long j3, long j4, long j5) {
        this.f1919a = j3;
        this.f1920b = j4;
        this.f1921c = j5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1919a == aVar.f1919a && this.f1920b == aVar.f1920b && this.f1921c == aVar.f1921c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f1919a;
        long j4 = this.f1920b;
        long j5 = this.f1921c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f1919a + ", elapsedRealtime=" + this.f1920b + ", uptimeMillis=" + this.f1921c + "}";
    }
}
