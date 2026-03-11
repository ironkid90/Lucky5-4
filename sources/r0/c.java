package r0;

import A2.h;
import e1.C0157c;
import e1.C0158d;
import h1.C0186a;
import h1.e;
import u0.d;

public final class c implements C0158d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4407a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0157c f4408b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0157c f4409c;

    /* JADX WARNING: type inference failed for: r0v0, types: [r0.c, java.lang.Object] */
    static {
        Class<e> cls = e.class;
        f4408b = new C0157c("eventsDroppedCount", h.i(h.h(cls, new C0186a(1))));
        f4409c = new C0157c("reason", h.i(h.h(cls, new C0186a(3))));
    }

    public final void a(Object obj, Object obj2) {
        d dVar = (d) obj;
        e1.e eVar = (e1.e) obj2;
        eVar.c(f4408b, dVar.f4704a);
        eVar.e(f4409c, dVar.f4705b);
    }
}
