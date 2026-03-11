package s1;

import L0.a;
import L1.d;
import S1.r;
import W0.p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: s1.L  reason: case insensitive filesystem */
public final class C0439L implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4528a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f4529b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4530c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f4531d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public C0437J f4532e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4533f = false;

    public C0439L(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        Context applicationContext = context.getApplicationContext();
        this.f4528a = applicationContext;
        this.f4529b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f4530c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f4531d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                C0437J j3 = this.f4532e;
                if (j3 == null || !j3.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f4532e.a((C0438K) this.f4531d.poll());
            }
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized p b(Intent intent) {
        C0438K k3;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            k3 = new C0438K(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f4530c;
            k3.f4527b.f1875a.g(scheduledThreadPoolExecutor, new r(11, scheduledThreadPoolExecutor.schedule(new d(9, (Object) k3), 20, TimeUnit.SECONDS)));
            this.f4531d.add(k3);
            a();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return k3.f4527b.f1875a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f4533f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f4533f) {
            this.f4533f = true;
            try {
                J0.a a2 = J0.a.a();
                Context context = this.f4528a;
                if (!a2.c(context, context.getClass().getName(), this.f4529b, this, 65, (Executor) null)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f4533f = false;
                    while (true) {
                        ArrayDeque arrayDeque = this.f4531d;
                        if (!arrayDeque.isEmpty()) {
                            ((C0438K) arrayDeque.poll()).f4527b.d((Object) null);
                        } else {
                            return;
                        }
                    }
                }
            } catch (SecurityException e2) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e2);
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f4533f = false;
            if (!(iBinder instanceof C0437J)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.f4531d;
                    if (!arrayDeque.isEmpty()) {
                        ((C0438K) arrayDeque.poll()).f4527b.d((Object) null);
                    } else {
                        return;
                    }
                }
            } else {
                this.f4532e = (C0437J) iBinder;
                a();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
