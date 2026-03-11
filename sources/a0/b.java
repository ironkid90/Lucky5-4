package a0;

import A2.h;
import A2.i;
import android.graphics.Rect;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f1974a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1975b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1976c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1977d;

    public b(Rect rect) {
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        this.f1974a = i3;
        this.f1975b = i4;
        this.f1976c = i5;
        this.f1977d = i6;
        if (i3 > i5) {
            throw new IllegalArgumentException(h.f("Left must be less than or equal to right, left: ", i3, ", right: ", i5).toString());
        } else if (i4 > i6) {
            throw new IllegalArgumentException(h.f("top must be less than or equal to bottom, top: ", i4, ", bottom: ", i6).toString());
        }
    }

    public final int a() {
        return this.f1977d - this.f1975b;
    }

    public final int b() {
        return this.f1976c - this.f1974a;
    }

    public final Rect c() {
        return new Rect(this.f1974a, this.f1975b, this.f1976c, this.f1977d);
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
        if (!b.class.equals(cls)) {
            return false;
        }
        i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        if (this.f1974a == bVar.f1974a && this.f1975b == bVar.f1975b && this.f1976c == bVar.f1976c && this.f1977d == bVar.f1977d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f1974a * 31) + this.f1975b) * 31) + this.f1976c) * 31) + this.f1977d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f1974a + ',' + this.f1975b + ',' + this.f1976c + ',' + this.f1977d + "] }";
    }
}
