package j;

public final class p0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3758f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q0 f3759g;

    public /* synthetic */ p0(q0 q0Var, int i3) {
        this.f3758f = i3;
        this.f3759g = q0Var;
    }

    public final void run() {
        switch (this.f3758f) {
            case 0:
                this.f3759g.c(false);
                return;
            default:
                this.f3759g.a();
                return;
        }
    }
}
