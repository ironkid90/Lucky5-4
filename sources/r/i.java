package R;

import android.view.Choreographer;

public abstract class i {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new h(runnable));
    }
}
