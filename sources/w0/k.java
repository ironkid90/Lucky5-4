package W0;

import C0.n;
import java.util.concurrent.Executor;

public final class k implements m, e, d, b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1878f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f1879g;

    /* renamed from: h  reason: collision with root package name */
    public final a f1880h;

    /* renamed from: i  reason: collision with root package name */
    public final p f1881i;

    public /* synthetic */ k(Executor executor, a aVar, p pVar, int i3) {
        this.f1878f = i3;
        this.f1879g = executor;
        this.f1880h = aVar;
        this.f1881i = pVar;
    }

    public final void a(h hVar) {
        switch (this.f1878f) {
            case 0:
                this.f1879g.execute(new n(this, hVar, 4, false));
                return;
            default:
                this.f1879g.execute(new n(this, hVar, 5, false));
                return;
        }
    }

    public void b() {
        this.f1881i.m();
    }

    public void c(Exception exc) {
        this.f1881i.k(exc);
    }

    public void d(Object obj) {
        this.f1881i.l(obj);
    }
}
