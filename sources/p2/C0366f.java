package p2;

import A2.i;
import java.io.Serializable;
import z2.a;

/* renamed from: p2.f  reason: case insensitive filesystem */
public final class C0366f implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public a f4190f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f4191g = C0367g.f4193a;

    /* renamed from: h  reason: collision with root package name */
    public final Object f4192h = this;

    public C0366f(a aVar) {
        this.f4190f = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f4191g;
        C0367g gVar = C0367g.f4193a;
        if (obj2 != gVar) {
            return obj2;
        }
        synchronized (this.f4192h) {
            obj = this.f4191g;
            if (obj == gVar) {
                a aVar = this.f4190f;
                i.b(aVar);
                obj = aVar.a();
                this.f4191g = obj;
                this.f4190f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f4191g != C0367g.f4193a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
