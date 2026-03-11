package m1;

import W0.i;
import n1.C0346b;

public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public final j f4036a;

    /* renamed from: b  reason: collision with root package name */
    public final i f4037b;

    public f(j jVar, i iVar) {
        this.f4036a = jVar;
        this.f4037b = iVar;
    }

    public final boolean a(C0346b bVar) {
        if (bVar.f4105b != 4 || this.f4036a.a(bVar)) {
            return false;
        }
        String str = bVar.f4106c;
        if (str != null) {
            this.f4037b.b(new C0327a(str, bVar.f4108e, bVar.f4109f));
            return true;
        }
        throw new NullPointerException("Null token");
    }

    public final boolean b(Exception exc) {
        this.f4037b.c(exc);
        return true;
    }
}
