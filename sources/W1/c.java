package W1;

import S1.u;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1903f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f1904g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f1905h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Handler f1906i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u f1907j;

    public /* synthetic */ c(f fVar, Context context, Handler handler, u uVar, int i3) {
        this.f1903f = i3;
        this.f1904g = fVar;
        this.f1905h = context;
        this.f1906i = handler;
        this.f1907j = uVar;
    }

    public final void run() {
        Handler handler;
        switch (this.f1903f) {
            case 0:
                f fVar = this.f1904g;
                fVar.getClass();
                try {
                    e eVar = (e) fVar.f1918g.get();
                    Looper mainLooper = Looper.getMainLooper();
                    if (Build.VERSION.SDK_INT >= 28) {
                        handler = Handler.createAsync(mainLooper);
                    } else {
                        handler = new Handler(mainLooper);
                    }
                    handler.post(new c(fVar, this.f1905h, this.f1906i, this.f1907j, 1));
                    return;
                } catch (Exception e2) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e2);
                    throw new RuntimeException(e2);
                }
            default:
                f fVar2 = this.f1904g;
                fVar2.getClass();
                fVar2.a(this.f1905h.getApplicationContext(), (String[]) null);
                this.f1906i.post(this.f1907j);
                return;
        }
    }
}
