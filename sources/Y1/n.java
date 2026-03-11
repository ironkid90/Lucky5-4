package y1;

import java.lang.reflect.Method;

public final class n extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f4876b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4877c;

    public n(Method method, Object obj) {
        this.f4876b = method;
        this.f4877c = obj;
    }

    public final Object i(Class cls) {
        d.a(cls);
        return this.f4876b.invoke(this.f4877c, new Object[]{cls});
    }
}
