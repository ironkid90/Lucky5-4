package R;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1351f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f1352g;

    public /* synthetic */ g(Context context, int i3) {
        this.f1351f = i3;
        this.f1352g = context;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void run() {
        switch (this.f1351f) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f1352g, 1));
                return;
            default:
                f.s(this.f1352g, new Object(), f.f1341a, false);
                return;
        }
    }
}
