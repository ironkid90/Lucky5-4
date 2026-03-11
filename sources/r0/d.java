package r0;

import A2.h;
import e1.C0157c;
import e1.C0158d;
import h1.C0186a;
import h1.e;

public final class d implements C0158d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f4410a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0157c f4411b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0157c f4412c;

    /* JADX WARNING: type inference failed for: r0v0, types: [r0.d, java.lang.Object] */
    static {
        Class<e> cls = e.class;
        f4411b = new C0157c("logSource", h.i(h.h(cls, new C0186a(1))));
        f4412c = new C0157c("logEventDropped", h.i(h.h(cls, new C0186a(2))));
    }

    public final void a(Object obj, Object obj2) {
        u0.e eVar = (u0.e) obj;
        e1.e eVar2 = (e1.e) obj2;
        eVar2.e(f4411b, eVar.f4707a);
        eVar2.e(f4412c, eVar.f4708b);
    }
}
