package androidx.datastore.preferences.protobuf;

import A2.h;

public final class O implements W {

    /* renamed from: a  reason: collision with root package name */
    public final C0118w f2376a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f2377b;

    /* renamed from: c  reason: collision with root package name */
    public final C0112p f2378c;

    public O(d0 d0Var, C0112p pVar, C0118w wVar) {
        this.f2377b = d0Var;
        pVar.getClass();
        this.f2378c = pVar;
        this.f2376a = wVar;
    }

    public final boolean a(Object obj) {
        this.f2378c.getClass();
        h.j(obj);
        throw null;
    }

    public final void b(Object obj, C0107k kVar, C0111o oVar) {
        this.f2377b.getClass();
        d0.a(obj);
        this.f2378c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    public final void c(Object obj, Object obj2) {
        X.A(this.f2377b, obj, obj2);
    }

    public final void d(Object obj, F f3) {
        this.f2378c.getClass();
        h.j(obj);
        throw null;
    }

    public final int e(C0118w wVar) {
        this.f2377b.getClass();
        return wVar.unknownFields.hashCode();
    }

    public final int f(C0118w wVar) {
        this.f2377b.getClass();
        c0 c0Var = wVar.unknownFields;
        int i3 = c0Var.f2414d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < c0Var.f2411a; i5++) {
            i4 += C0109m.f0(3, (C0103g) c0Var.f2413c[i5]) + C0109m.v0(2, c0Var.f2412b[i5] >>> 3) + (C0109m.u0(1) * 2);
        }
        c0Var.f2414d = i4;
        return i4;
    }

    public final C0118w g() {
        C0118w wVar = this.f2376a;
        if (wVar != null) {
            return wVar.k();
        }
        return ((C0116u) wVar.e(5)).b();
    }

    public final void h(Object obj) {
        this.f2377b.getClass();
        d0.b(obj);
        this.f2378c.getClass();
        h.j(obj);
        throw null;
    }

    public final boolean i(C0118w wVar, Object obj) {
        this.f2377b.getClass();
        if (!wVar.unknownFields.equals(((C0118w) obj).unknownFields)) {
            return false;
        }
        return true;
    }
}
