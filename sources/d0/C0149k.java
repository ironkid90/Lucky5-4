package d0;

import A.V;
import A2.i;
import a0.b;
import android.graphics.Rect;

/* renamed from: d0.k  reason: case insensitive filesystem */
public final class C0149k {

    /* renamed from: a  reason: collision with root package name */
    public final b f2907a;

    /* renamed from: b  reason: collision with root package name */
    public final V f2908b;

    public C0149k(b bVar, V v) {
        i.e(v, "_windowInsetsCompat");
        this.f2907a = bVar;
        this.f2908b = v;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C0149k.class.equals(cls)) {
            return false;
        }
        i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        C0149k kVar = (C0149k) obj;
        if (i.a(this.f2907a, kVar.f2907a) && i.a(this.f2908b, kVar.f2908b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2908b.hashCode() + (this.f2907a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f2907a + ", windowInsetsCompat=" + this.f2908b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0149k(Rect rect, V v) {
        this(new b(rect), v);
        i.e(v, "insets");
    }
}
