package m1;

/* renamed from: m1.a  reason: case insensitive filesystem */
public final class C0327a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4018a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4019b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4020c;

    public C0327a(String str, long j3, long j4) {
        this.f4018a = str;
        this.f4019b = j3;
        this.f4020c = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0327a)) {
            return false;
        }
        C0327a aVar = (C0327a) obj;
        if (this.f4018a.equals(aVar.f4018a) && this.f4019b == aVar.f4019b && this.f4020c == aVar.f4020c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4019b;
        long j4 = this.f4020c;
        return ((((this.f4018a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f4018a + ", tokenExpirationTimestamp=" + this.f4019b + ", tokenCreationTimestamp=" + this.f4020c + "}";
    }
}
