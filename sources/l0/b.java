package L0;

import a.C0094a;
import android.os.Process;

public final class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f923f;

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f924g;

    public /* synthetic */ b(Runnable runnable, int i3) {
        this.f923f = i3;
        this.f924g = runnable;
    }

    public final void run() {
        switch (this.f923f) {
            case 0:
                Process.setThreadPriority(0);
                this.f924g.run();
                return;
            case 1:
                this.f924g.run();
                return;
            default:
                try {
                    this.f924g.run();
                    return;
                } catch (Exception e2) {
                    C0094a.q("Executor", "Background execution failure.", e2);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f923f) {
            case 1:
                return this.f924g.toString();
            default:
                return super.toString();
        }
    }
}
