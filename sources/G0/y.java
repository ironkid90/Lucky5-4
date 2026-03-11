package G0;

import C0.p;
import J0.a;
import O0.e;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class y {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f459g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static y f460h;

    /* renamed from: i  reason: collision with root package name */
    public static HandlerThread f461i;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f462a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f463b;

    /* renamed from: c  reason: collision with root package name */
    public volatile e f464c;

    /* renamed from: d  reason: collision with root package name */
    public final a f465d;

    /* renamed from: e  reason: collision with root package name */
    public final long f466e;

    /* renamed from: f  reason: collision with root package name */
    public final long f467f;

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.Handler, O0.e] */
    public y(Context context, Looper looper) {
        p pVar = new p(1, this);
        this.f463b = context.getApplicationContext();
        ? handler = new Handler(looper, pVar);
        Looper.getMainLooper();
        this.f464c = handler;
        this.f465d = a.a();
        this.f466e = 5000;
        this.f467f = 300000;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z3) {
        v vVar = new v(str, z3);
        o.f(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f462a) {
            try {
                x xVar = (x) this.f462a.get(vVar);
                if (xVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(vVar.toString()));
                } else if (xVar.f452a.containsKey(serviceConnection)) {
                    xVar.f452a.remove(serviceConnection);
                    if (xVar.f452a.isEmpty()) {
                        this.f464c.sendMessageDelayed(this.f464c.obtainMessage(0, vVar), this.f466e);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(vVar.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(v vVar, r rVar, String str) {
        boolean z3;
        synchronized (this.f462a) {
            try {
                x xVar = (x) this.f462a.get(vVar);
                if (xVar == null) {
                    xVar = new x(this, vVar);
                    xVar.f452a.put(rVar, rVar);
                    xVar.a(str, (Executor) null);
                    this.f462a.put(vVar, xVar);
                } else {
                    this.f464c.removeMessages(0, vVar);
                    if (!xVar.f452a.containsKey(rVar)) {
                        xVar.f452a.put(rVar, rVar);
                        int i3 = xVar.f453b;
                        if (i3 == 1) {
                            rVar.onServiceConnected(xVar.f457f, xVar.f455d);
                        } else if (i3 == 2) {
                            xVar.a(str, (Executor) null);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(vVar.toString()));
                    }
                }
                z3 = xVar.f454c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}
