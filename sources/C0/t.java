package C0;

import L0.a;
import W0.p;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static t f167e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f168a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f169b;

    /* renamed from: c  reason: collision with root package name */
    public q f170c = new q(this);

    /* renamed from: d  reason: collision with root package name */
    public int f171d = 1;

    public t(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f169b = scheduledExecutorService;
        this.f168a = context.getApplicationContext();
    }

    public static synchronized t a(Context context) {
        t tVar;
        synchronized (t.class) {
            try {
                if (f167e == null) {
                    f167e = new t(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
                }
                tVar = f167e;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return tVar;
    }

    public final synchronized p b(s sVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(sVar.toString()));
            }
            if (!this.f170c.d(sVar)) {
                q qVar = new q(this);
                this.f170c = qVar;
                qVar.d(sVar);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return sVar.f163b.f1875a;
    }
}
