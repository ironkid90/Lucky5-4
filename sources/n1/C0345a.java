package n1;

/* renamed from: n1.a  reason: case insensitive filesystem */
public final class C0345a {

    /* renamed from: a  reason: collision with root package name */
    public String f4097a;

    /* renamed from: b  reason: collision with root package name */
    public int f4098b;

    /* renamed from: c  reason: collision with root package name */
    public String f4099c;

    /* renamed from: d  reason: collision with root package name */
    public String f4100d;

    /* renamed from: e  reason: collision with root package name */
    public Long f4101e;

    /* renamed from: f  reason: collision with root package name */
    public Long f4102f;

    /* renamed from: g  reason: collision with root package name */
    public String f4103g;

    public final C0346b a() {
        String str;
        if (this.f4098b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (this.f4101e == null) {
            str = str.concat(" expiresInSecs");
        }
        if (this.f4102f == null) {
            str = str + " tokenCreationEpochInSecs";
        }
        if (str.isEmpty()) {
            return new C0346b(this.f4097a, this.f4098b, this.f4099c, this.f4100d, this.f4101e.longValue(), this.f4102f.longValue(), this.f4103g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
