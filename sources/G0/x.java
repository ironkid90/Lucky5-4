package G0;

import J0.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class x implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f452a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f453b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f454c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f455d;

    /* renamed from: e  reason: collision with root package name */
    public final v f456e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f457f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y f458g;

    public x(y yVar, v vVar) {
        this.f458g = yVar;
        this.f456e = vVar;
    }

    public final void a(String str, Executor executor) {
        this.f453b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            y yVar = this.f458g;
            a aVar = yVar.f465d;
            Context context = yVar.f463b;
            boolean c3 = aVar.c(context, str, this.f456e.a(context), this, 4225, executor);
            this.f454c = c3;
            if (c3) {
                this.f458g.f464c.sendMessageDelayed(this.f458g.f464c.obtainMessage(1, this.f456e), this.f458g.f467f);
            } else {
                this.f453b = 2;
                try {
                    y yVar2 = this.f458g;
                    yVar2.f465d.b(yVar2.f463b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f458g.f462a) {
            try {
                this.f458g.f464c.removeMessages(1, this.f456e);
                this.f455d = iBinder;
                this.f457f = componentName;
                for (ServiceConnection onServiceConnected : this.f452a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.f453b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f458g.f462a) {
            try {
                this.f458g.f464c.removeMessages(1, this.f456e);
                this.f455d = null;
                this.f457f = componentName;
                for (ServiceConnection onServiceDisconnected : this.f452a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.f453b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
