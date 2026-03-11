package o;

import M0.a;

public final class f extends a {
    public final void F(g gVar, g gVar2) {
        gVar.f4130b = gVar2;
    }

    public final void G(g gVar, Thread thread) {
        gVar.f4129a = thread;
    }

    public final boolean b(h hVar, d dVar) {
        d dVar2 = d.f4121b;
        synchronized (hVar) {
            try {
                if (hVar.f4136g != dVar) {
                    return false;
                }
                hVar.f4136g = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f4135f != obj) {
                    return false;
                }
                hVar.f4135f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f4137h != gVar) {
                    return false;
                }
                hVar.f4137h = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
