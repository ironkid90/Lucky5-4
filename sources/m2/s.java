package M2;

import r2.C0420d;
import r2.C0425i;
import t2.C0485c;

public final class s implements C0420d, C0485c {

    /* renamed from: f  reason: collision with root package name */
    public final C0420d f1130f;

    /* renamed from: g  reason: collision with root package name */
    public final C0425i f1131g;

    public s(C0420d dVar, C0425i iVar) {
        this.f1130f = dVar;
        this.f1131g = iVar;
    }

    public final C0485c g() {
        C0420d dVar = this.f1130f;
        if (dVar instanceof C0485c) {
            return (C0485c) dVar;
        }
        return null;
    }

    public final C0425i h() {
        return this.f1131g;
    }

    public final void m(Object obj) {
        this.f1130f.m(obj);
    }
}
