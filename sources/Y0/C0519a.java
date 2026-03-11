package y0;

/* renamed from: y0.a  reason: case insensitive filesystem */
public final class C0519a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0519a f4809f = new C0519a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a  reason: collision with root package name */
    public final long f4810a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4811b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4812c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4813d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4814e;

    public C0519a(long j3, int i3, int i4, long j4, int i5) {
        this.f4810a = j3;
        this.f4811b = i3;
        this.f4812c = i4;
        this.f4813d = j4;
        this.f4814e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0519a)) {
            return false;
        }
        C0519a aVar = (C0519a) obj;
        if (this.f4810a == aVar.f4810a && this.f4811b == aVar.f4811b && this.f4812c == aVar.f4812c && this.f4813d == aVar.f4813d && this.f4814e == aVar.f4814e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4810a;
        long j4 = this.f4813d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f4811b) * 1000003) ^ this.f4812c) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f4814e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f4810a + ", loadBatchSize=" + this.f4811b + ", criticalSectionEnterTimeoutMs=" + this.f4812c + ", eventCleanUpAge=" + this.f4813d + ", maxBlobByteSizePerRow=" + this.f4814e + "}";
    }
}
