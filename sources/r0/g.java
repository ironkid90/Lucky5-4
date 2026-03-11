package r0;

import A2.h;
import e1.C0157c;
import e1.C0158d;
import h1.C0186a;
import h1.e;

public final class g implements C0158d {

    /* renamed from: a  reason: collision with root package name */
    public static final g f4417a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0157c f4418b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0157c f4419c;

    /* JADX WARNING: type inference failed for: r0v0, types: [r0.g, java.lang.Object] */
    static {
        Class<e> cls = e.class;
        f4418b = new C0157c("startMs", h.i(h.h(cls, new C0186a(1))));
        f4419c = new C0157c("endMs", h.i(h.h(cls, new C0186a(2))));
    }

    public final void a(Object obj, Object obj2) {
        u0.g gVar = (u0.g) obj;
        e1.e eVar = (e1.e) obj2;
        eVar.c(f4418b, gVar.f4711a);
        eVar.c(f4419c, gVar.f4712b);
    }
}
