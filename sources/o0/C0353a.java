package o0;

import t1.C0482e;

/* renamed from: o0.a  reason: case insensitive filesystem */
public final class C0353a {

    /* renamed from: a  reason: collision with root package name */
    public final C0482e f4138a;

    /* renamed from: b  reason: collision with root package name */
    public final C0354b f4139b;

    public C0353a(C0482e eVar, C0354b bVar) {
        this.f4138a = eVar;
        this.f4139b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0353a)) {
            return false;
        }
        C0353a aVar = (C0353a) obj;
        aVar.getClass();
        if (this.f4138a.equals(aVar.f4138a)) {
            C0356d dVar = C0356d.f4142f;
            if (dVar.equals(dVar)) {
                if (this.f4139b.equals(aVar.f4139b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4139b.hashCode() ^ (((((1000003 * 1000003) ^ this.f4138a.hashCode()) * 1000003) ^ C0356d.f4142f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f4138a + ", priority=" + C0356d.f4142f + ", productData=" + this.f4139b + "}";
    }
}
