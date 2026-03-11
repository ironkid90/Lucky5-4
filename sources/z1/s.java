package z1;

import D1.a;
import w1.k;
import w1.r;

public final class s implements w1.s {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f4936f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Class f4937g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f4938h;

    public s(Class cls, Class cls2, r rVar) {
        this.f4936f = cls;
        this.f4937g = cls2;
        this.f4938h = rVar;
    }

    public final r create(k kVar, a aVar) {
        Class cls = this.f4936f;
        Class cls2 = aVar.f220a;
        if (cls2 == cls || cls2 == this.f4937g) {
            return this.f4938h;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f4937g.getName() + "+" + this.f4936f.getName() + ",adapter=" + this.f4938h + "]";
    }
}
