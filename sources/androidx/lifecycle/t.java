package androidx.lifecycle;

import A2.i;
import B.m;
import L1.d;
import android.os.Handler;

public final class t implements j {

    /* renamed from: n  reason: collision with root package name */
    public static final t f2536n = new t();

    /* renamed from: f  reason: collision with root package name */
    public int f2537f;

    /* renamed from: g  reason: collision with root package name */
    public int f2538g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2539h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2540i = true;

    /* renamed from: j  reason: collision with root package name */
    public Handler f2541j;

    /* renamed from: k  reason: collision with root package name */
    public final l f2542k = new l(this);

    /* renamed from: l  reason: collision with root package name */
    public final d f2543l = new d(4, (Object) this);

    /* renamed from: m  reason: collision with root package name */
    public final m f2544m = new m(20, (Object) this);

    public final l b() {
        return this.f2542k;
    }

    public final void c() {
        int i3 = this.f2538g + 1;
        this.f2538g = i3;
        if (i3 != 1) {
            return;
        }
        if (this.f2539h) {
            this.f2542k.d(d.ON_RESUME);
            this.f2539h = false;
            return;
        }
        Handler handler = this.f2541j;
        i.b(handler);
        handler.removeCallbacks(this.f2543l);
    }
}
