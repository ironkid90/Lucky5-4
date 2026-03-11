package J0;

import G0.o;
import G0.x;
import M0.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f799b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f800c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f801a = new ConcurrentHashMap();

    public static a a() {
        if (f800c == null) {
            synchronized (f799b) {
                try {
                    if (f800c == null) {
                        f800c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVar = f800c;
        o.e(aVar);
        return aVar;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof x)) {
            ConcurrentHashMap concurrentHashMap = this.f801a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i3, Executor executor) {
        boolean z3;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).f1087a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof x)) {
            ConcurrentHashMap concurrentHashMap = this.f801a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT < 29 || executor == null) {
                    z3 = context.bindService(intent, serviceConnection, i3);
                } else {
                    z3 = context.bindService(intent, i3, executor, serviceConnection);
                }
                if (z3) {
                    return z3;
                }
                return false;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        } else {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT < 29 || executor == null) {
                return context.bindService(intent, serviceConnection, i3);
            }
            return context.bindService(intent, i3, executor, serviceConnection);
        }
    }
}
