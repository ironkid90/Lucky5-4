package r0;

import A2.h;
import e1.C0157c;
import e1.C0158d;
import h1.C0186a;
import h1.e;

public final class f implements C0158d {

    /* renamed from: a  reason: collision with root package name */
    public static final f f4414a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0157c f4415b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0157c f4416c;

    /* JADX WARNING: type inference failed for: r0v0, types: [r0.f, java.lang.Object] */
    static {
        Class<e> cls = e.class;
        f4415b = new C0157c("currentCacheSizeBytes", h.i(h.h(cls, new C0186a(1))));
        f4416c = new C0157c("maxCacheSizeBytes", h.i(h.h(cls, new C0186a(2))));
    }

    public final void a(Object obj, Object obj2) {
        u0.f fVar = (u0.f) obj;
        e1.e eVar = (e1.e) obj2;
        eVar.c(f4415b, fVar.f4709a);
        eVar.c(f4416c, fVar.f4710b);
    }
}
