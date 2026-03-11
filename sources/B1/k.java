package b1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum k implements Executor {
    ;
    

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f2700g = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [b1.k, java.lang.Enum] */
    static {
        f2700g = new Handler(Looper.getMainLooper());
    }

    public final void execute(Runnable runnable) {
        f2700g.post(runnable);
    }
}
