package s0;

import D0.g;
import G0.f;
import android.content.Context;
import d2.C0152a;
import t0.C0477b;

public final class e implements C0477b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4479f;

    /* renamed from: g  reason: collision with root package name */
    public final C0152a f4480g;

    public /* synthetic */ e(C0152a aVar, int i3) {
        this.f4479f = i3;
        this.f4480g = aVar;
    }

    public final Object get() {
        switch (this.f4479f) {
            case 0:
                return new d((Context) this.f4480g.f2912g, new f(1), new g(1, false));
            default:
                String packageName = ((Context) this.f4480g.f2912g).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
