package j;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    public int f3633a;

    /* renamed from: b  reason: collision with root package name */
    public int f3634b;

    /* renamed from: c  reason: collision with root package name */
    public int f3635c;

    /* renamed from: d  reason: collision with root package name */
    public int f3636d;

    /* renamed from: e  reason: collision with root package name */
    public int f3637e;

    /* renamed from: f  reason: collision with root package name */
    public int f3638f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3639g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3640h;

    public final void a(int i3, int i4) {
        this.f3635c = i3;
        this.f3636d = i4;
        this.f3640h = true;
        if (this.f3639g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f3633a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f3634b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f3633a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f3634b = i4;
        }
    }
}
