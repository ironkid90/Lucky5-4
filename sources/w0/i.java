package W0;

import G0.o;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final p f1875a = new p();

    public final void a(Exception exc) {
        this.f1875a.k(exc);
    }

    public final void b(Object obj) {
        this.f1875a.l(obj);
    }

    public final boolean c(Exception exc) {
        p pVar = this.f1875a;
        pVar.getClass();
        o.f(exc, "Exception must not be null");
        synchronized (pVar.f1888a) {
            try {
                if (pVar.f1890c) {
                    return false;
                }
                pVar.f1890c = true;
                pVar.f1893f = exc;
                pVar.f1889b.e(pVar);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void d(Object obj) {
        p pVar = this.f1875a;
        synchronized (pVar.f1888a) {
            try {
                if (!pVar.f1890c) {
                    pVar.f1890c = true;
                    pVar.f1892e = obj;
                    pVar.f1889b.e(pVar);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
