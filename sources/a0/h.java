package a0;

import A2.i;
import z2.l;

public final class h extends g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1987a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1988b;

    /* renamed from: c  reason: collision with root package name */
    public final C0095a f1989c;

    public h(Object obj, int i3, C0095a aVar) {
        i.e(obj, "value");
        A2.h.k("verificationMode", i3);
        this.f1987a = obj;
        this.f1988b = i3;
        this.f1989c = aVar;
    }

    public final Object a() {
        return this.f1987a;
    }

    public final g d(String str, l lVar) {
        Object obj = this.f1987a;
        if (((Boolean) lVar.j(obj)).booleanValue()) {
            return this;
        }
        return new f(obj, str, this.f1989c, this.f1988b);
    }
}
