package F;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f260a;

    /* renamed from: b  reason: collision with root package name */
    public int f261b;

    /* renamed from: c  reason: collision with root package name */
    public float f262c;

    /* renamed from: d  reason: collision with root package name */
    public float f263d;

    /* renamed from: e  reason: collision with root package name */
    public long f264e;

    /* renamed from: f  reason: collision with root package name */
    public long f265f;

    /* renamed from: g  reason: collision with root package name */
    public long f266g;

    /* renamed from: h  reason: collision with root package name */
    public float f267h;

    /* renamed from: i  reason: collision with root package name */
    public int f268i;

    public final float a(long j3) {
        long j4 = this.f264e;
        if (j3 < j4) {
            return 0.0f;
        }
        long j5 = this.f266g;
        if (j5 < 0 || j3 < j5) {
            return f.b(((float) (j3 - j4)) / ((float) this.f260a), 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f267h;
        return (f.b(((float) (j3 - j5)) / ((float) this.f268i), 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
