package I2;

import r2.C0420d;

public final class W extends C0055f {

    /* renamed from: n  reason: collision with root package name */
    public final C0061l f736n;

    public W(C0420d dVar, C0061l lVar) {
        super(1, dVar);
        this.f736n = lVar;
    }

    public final String A() {
        return "AwaitContinuation";
    }

    public final Throwable t(a0 a0Var) {
        Throwable c3;
        Object E3 = this.f736n.E();
        if ((E3 instanceof Y) && (c3 = ((Y) E3).c()) != null) {
            return c3;
        }
        if (E3 instanceof C0063n) {
            return ((C0063n) E3).f775a;
        }
        return a0Var.A();
    }
}
