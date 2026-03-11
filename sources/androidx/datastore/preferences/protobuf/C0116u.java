package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u  reason: case insensitive filesystem */
public abstract class C0116u implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public final C0118w f2495f;

    /* renamed from: g  reason: collision with root package name */
    public C0118w f2496g;

    public C0116u(C0118w wVar) {
        this.f2495f = wVar;
        if (!wVar.i()) {
            this.f2496g = wVar.k();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final C0118w a() {
        C0118w b3 = b();
        b3.getClass();
        if (C0118w.h(b3, true)) {
            return b3;
        }
        throw new b0();
    }

    public final C0118w b() {
        if (!this.f2496g.i()) {
            return this.f2496g;
        }
        C0118w wVar = this.f2496g;
        wVar.getClass();
        T t3 = T.f2381c;
        t3.getClass();
        t3.a(wVar.getClass()).h(wVar);
        wVar.j();
        return this.f2496g;
    }

    public final void c() {
        if (!this.f2496g.i()) {
            C0118w k3 = this.f2495f.k();
            C0118w wVar = this.f2496g;
            T t3 = T.f2381c;
            t3.getClass();
            t3.a(k3.getClass()).c(k3, wVar);
            this.f2496g = k3;
        }
    }

    public final Object clone() {
        C0116u uVar = (C0116u) this.f2495f.e(5);
        uVar.f2496g = b();
        return uVar;
    }
}
