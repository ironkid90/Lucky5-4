package I2;

import A2.i;
import z2.l;

/* renamed from: I2.o  reason: case insensitive filesystem */
public final class C0064o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f776a;

    /* renamed from: b  reason: collision with root package name */
    public final l f777b;

    public C0064o(Object obj, l lVar) {
        this.f776a = obj;
        this.f777b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0064o)) {
            return false;
        }
        C0064o oVar = (C0064o) obj;
        if (i.a(this.f776a, oVar.f776a) && i.a(this.f777b, oVar.f777b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        Object obj = this.f776a;
        if (obj == null) {
            i3 = 0;
        } else {
            i3 = obj.hashCode();
        }
        return this.f777b.hashCode() + (i3 * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f776a + ", onCancellation=" + this.f777b + ')';
    }
}
