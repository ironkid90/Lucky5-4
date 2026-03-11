package W0;

import L0.b;
import O0.e;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public final class o implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1886f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1887g;

    public /* synthetic */ o(int i3, Object obj) {
        this.f1886f = i3;
        this.f1887g = obj;
    }

    public final void execute(Runnable runnable) {
        switch (this.f1886f) {
            case 0:
                ((e) this.f1887g).post(runnable);
                return;
            case 1:
                ((ExecutorService) this.f1887g).execute(new b(runnable, 2));
                return;
            default:
                runnable.getClass();
                Handler handler = (Handler) this.f1887g;
                if (!handler.post(runnable)) {
                    throw new RejectedExecutionException(handler + " is shutting down");
                }
                return;
        }
    }

    public o() {
        this.f1886f = 0;
        Handler handler = new Handler(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f1887g = handler;
    }
}
