package y1;

import java.lang.reflect.Method;

public final class o extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f4878b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4879c;

    public o(Method method, int i3) {
        this.f4878b = method;
        this.f4879c = i3;
    }

    public final Object i(Class cls) {
        d.a(cls);
        return this.f4878b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f4879c)});
    }
}
