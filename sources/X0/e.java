package X0;

import F0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f1931a = new AtomicReference();

    public final void a(boolean z3) {
        synchronized (g.f1934k) {
            try {
                Iterator it = new ArrayList(g.f1935l.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f1940e.get()) {
                        gVar.j(z3);
                    }
                }
            } finally {
            }
        }
    }
}
