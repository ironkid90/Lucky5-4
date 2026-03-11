package d0;

import A2.i;
import a0.b;

/* renamed from: d0.c  reason: case insensitive filesystem */
public final class C0141c {

    /* renamed from: a  reason: collision with root package name */
    public final b f2889a;

    /* renamed from: b  reason: collision with root package name */
    public final C0140b f2890b;

    /* renamed from: c  reason: collision with root package name */
    public final C0140b f2891c;

    public C0141c(b bVar, C0140b bVar2, C0140b bVar3) {
        this.f2889a = bVar;
        this.f2890b = bVar2;
        this.f2891c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        } else if (bVar.f1974a != 0 && bVar.f1975b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
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
        if (!C0141c.class.equals(cls)) {
            return false;
        }
        i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0141c cVar = (C0141c) obj;
        if (i.a(this.f2889a, cVar.f2889a) && i.a(this.f2890b, cVar.f2890b) && i.a(this.f2891c, cVar.f2891c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2890b.hashCode();
        return this.f2891c.hashCode() + ((hashCode + (this.f2889a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0141c.class.getSimpleName() + " { " + this.f2889a + ", type=" + this.f2890b + ", state=" + this.f2891c + " }";
    }
}
