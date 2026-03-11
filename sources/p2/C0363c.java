package p2;

import A2.i;
import java.io.Serializable;

/* renamed from: p2.c  reason: case insensitive filesystem */
public final class C0363c implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final Object f4187f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4188g;

    public C0363c(Object obj, Object obj2) {
        this.f4187f = obj;
        this.f4188g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0363c)) {
            return false;
        }
        C0363c cVar = (C0363c) obj;
        if (i.a(this.f4187f, cVar.f4187f) && i.a(this.f4188g, cVar.f4188g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4 = 0;
        Object obj = this.f4187f;
        if (obj == null) {
            i3 = 0;
        } else {
            i3 = obj.hashCode();
        }
        int i5 = i3 * 31;
        Object obj2 = this.f4188g;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        return "(" + this.f4187f + ", " + this.f4188g + ')';
    }
}
