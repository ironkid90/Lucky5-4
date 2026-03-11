package A2;

import F2.a;
import java.io.Serializable;

public abstract class c implements a, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public transient a f69f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f70g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f71h;

    /* renamed from: i  reason: collision with root package name */
    public final String f72i;

    /* renamed from: j  reason: collision with root package name */
    public final String f73j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f74k;

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f70g = obj;
        this.f71h = cls;
        this.f72i = str;
        this.f73j = str2;
        this.f74k = z3;
    }

    public abstract a b();

    public final d c() {
        Class cls = this.f71h;
        if (!this.f74k) {
            return r.a(cls);
        }
        r.f87a.getClass();
        return new k(cls);
    }
}
