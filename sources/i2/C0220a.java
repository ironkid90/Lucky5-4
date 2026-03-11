package i2;

import C0.f;
import S1.u;
import W1.c;
import a.C0094a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import u1.C0496c;

/* renamed from: i2.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0220a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f3231f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ W1.f f3232g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Handler f3233h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ C0496c f3234i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f3235j;

    public /* synthetic */ C0220a(f fVar, W1.f fVar2, Handler handler, C0496c cVar, long j3) {
        this.f3231f = fVar;
        this.f3232g = fVar2;
        this.f3233h = handler;
        this.f3234i = cVar;
        this.f3235j = j3;
    }

    public final void run() {
        f fVar = this.f3231f;
        fVar.getClass();
        Context context = C0094a.f1971k;
        W1.f fVar2 = this.f3232g;
        fVar2.d(context);
        Context context2 = C0094a.f1971k;
        u uVar = new u(fVar, fVar2, this.f3234i, this.f3235j);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        } else if (fVar2.f1913b != null) {
            boolean z3 = fVar2.f1912a;
            Handler handler = this.f3233h;
            if (z3) {
                handler.post(uVar);
                return;
            }
            fVar2.f1917f.execute(new c(fVar2, context2, handler, uVar, 0));
        } else {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
    }
}
