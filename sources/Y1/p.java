package y1;

import java.lang.reflect.Method;

public final class p extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f4880b;

    public p(Method method) {
        this.f4880b = method;
    }

    public final Object i(Class cls) {
        d.a(cls);
        return this.f4880b.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
