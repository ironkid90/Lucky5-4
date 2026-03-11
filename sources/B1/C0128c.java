package b1;

import F0.h;

/* renamed from: b1.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0128c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2674f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Runnable f2675g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f2676h;

    public /* synthetic */ C0128c(Runnable runnable, h hVar, int i3) {
        this.f2674f = i3;
        this.f2675g = runnable;
        this.f2676h = hVar;
    }

    public final void run() {
        switch (this.f2674f) {
            case 0:
                try {
                    this.f2675g.run();
                    return;
                } catch (Exception e2) {
                    this.f2676h.y(e2);
                    throw e2;
                }
            case 1:
                try {
                    this.f2675g.run();
                    return;
                } catch (Exception e3) {
                    this.f2676h.y(e3);
                    return;
                }
            default:
                Runnable runnable = this.f2675g;
                h hVar = this.f2676h;
                try {
                    runnable.run();
                    i iVar = (i) hVar.f322g;
                    iVar.getClass();
                    if (o.h.f4133k.c(iVar, (Object) null, o.h.f4134l)) {
                        o.h.c(iVar);
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    hVar.y(e4);
                    return;
                }
        }
    }
}
