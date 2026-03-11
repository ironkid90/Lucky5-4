package p2;

import A2.i;
import java.io.Serializable;

/* renamed from: p2.d  reason: case insensitive filesystem */
public final class C0364d implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final Throwable f4189f;

    public C0364d(Throwable th) {
        i.e(th, "exception");
        this.f4189f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0364d) {
            if (i.a(this.f4189f, ((C0364d) obj).f4189f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4189f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f4189f + ')';
    }
}
