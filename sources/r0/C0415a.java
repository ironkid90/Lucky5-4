package r0;

import A2.h;
import e1.C0157c;
import e1.C0158d;
import h1.C0186a;
import h1.e;
import u0.a;

/* renamed from: r0.a  reason: case insensitive filesystem */
public final class C0415a implements C0158d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0415a f4400a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0157c f4401b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0157c f4402c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0157c f4403d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0157c f4404e;

    /* JADX WARNING: type inference failed for: r0v0, types: [r0.a, java.lang.Object] */
    static {
        Class<e> cls = e.class;
        f4401b = new C0157c("window", h.i(h.h(cls, new C0186a(1))));
        f4402c = new C0157c("logSourceMetrics", h.i(h.h(cls, new C0186a(2))));
        f4403d = new C0157c("globalMetrics", h.i(h.h(cls, new C0186a(3))));
        f4404e = new C0157c("appNamespace", h.i(h.h(cls, new C0186a(4))));
    }

    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        e1.e eVar = (e1.e) obj2;
        eVar.e(f4401b, aVar.f4690a);
        eVar.e(f4402c, aVar.f4691b);
        eVar.e(f4403d, aVar.f4692c);
        eVar.e(f4404e, aVar.f4693d);
    }
}
