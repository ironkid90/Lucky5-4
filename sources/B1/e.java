package b1;

import F0.h;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2683f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f2684g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Runnable f2685h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ h f2686i;

    public /* synthetic */ e(g gVar, Runnable runnable, h hVar, int i3) {
        this.f2683f = i3;
        this.f2684g = gVar;
        this.f2685h = runnable;
        this.f2686i = hVar;
    }

    public final void run() {
        switch (this.f2683f) {
            case 0:
                g gVar = this.f2684g;
                gVar.getClass();
                gVar.f2690f.execute(new C0128c(this.f2685h, this.f2686i, 0));
                return;
            case 1:
                g gVar2 = this.f2684g;
                gVar2.getClass();
                gVar2.f2690f.execute(new C0128c(this.f2685h, this.f2686i, 2));
                return;
            default:
                g gVar3 = this.f2684g;
                gVar3.getClass();
                gVar3.f2690f.execute(new C0128c(this.f2685h, this.f2686i, 1));
                return;
        }
    }
}
