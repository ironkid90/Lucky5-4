package z1;

import D1.a;
import w1.k;
import w1.s;

public final class r implements s {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4933f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f4934g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ w1.r f4935h;

    public /* synthetic */ r(Object obj, w1.r rVar, int i3) {
        this.f4933f = i3;
        this.f4934g = obj;
        this.f4935h = rVar;
    }

    public final w1.r create(k kVar, a aVar) {
        switch (this.f4933f) {
            case 0:
                if (aVar.f220a == ((Class) this.f4934g)) {
                    return this.f4935h;
                }
                return null;
            case 1:
                Class cls = aVar.f220a;
                if (!((Class) this.f4934g).isAssignableFrom(cls)) {
                    return null;
                }
                return new C0525a(this, cls);
            default:
                if (aVar.equals((a) this.f4934g)) {
                    return this.f4935h;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f4933f) {
            case 0:
                return "Factory[type=" + ((Class) this.f4934g).getName() + ",adapter=" + this.f4935h + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f4934g).getName() + ",adapter=" + this.f4935h + "]";
            default:
                return super.toString();
        }
    }
}
