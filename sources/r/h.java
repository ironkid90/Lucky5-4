package R;

import android.view.Choreographer;

public final /* synthetic */ class h implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f1353a;

    public /* synthetic */ h(Runnable runnable) {
        this.f1353a = runnable;
    }

    public final void doFrame(long j3) {
        this.f1353a.run();
    }
}
