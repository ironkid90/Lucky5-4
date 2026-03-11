package C0;

import J0.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class q implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public int f152a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f153b;

    /* renamed from: c  reason: collision with root package name */
    public r f154c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f155d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray f156e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f157f;

    public q(t tVar) {
        this.f157f = tVar;
        Handler handler = new Handler(Looper.getMainLooper(), new p(0, this));
        Looper.getMainLooper();
        this.f153b = new Messenger(handler);
        this.f155d = new ArrayDeque();
        this.f156e = new SparseArray();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 112 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r1, int r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            r2 = 0
            r0.b(r1, r2)     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)
            return
        L_0x0007:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r1
        L_0x0009:
            r1 = move-exception
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.q.a(java.lang.String, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [H1.a, java.lang.Exception] */
    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i3 = this.f152a;
            if (i3 == 0) {
                throw new IllegalStateException();
            } else if (i3 == 1 || i3 == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f152a = 4;
                a.a().b(this.f157f.f168a, this);
                ? exc = new Exception(str, securityException);
                Iterator it = this.f155d.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).b(exc);
                }
                this.f155d.clear();
                for (int i4 = 0; i4 < this.f156e.size(); i4++) {
                    ((s) this.f156e.valueAt(i4)).b(exc);
                }
                this.f156e.clear();
            } else if (i3 == 3) {
                this.f152a = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f152a     // Catch:{ all -> 0x0026 }
            r1 = 2
            if (r0 != r1) goto L_0x0038
            java.util.ArrayDeque r0 = r2.f155d     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0038
            android.util.SparseArray r0 = r2.f156e     // Catch:{ all -> 0x0026 }
            int r0 = r0.size()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r0 = move-exception
            goto L_0x003a
        L_0x0028:
            r0 = 3
            r2.f152a = r0     // Catch:{ all -> 0x0026 }
            C0.t r0 = r2.f157f     // Catch:{ all -> 0x0026 }
            J0.a r1 = J0.a.a()     // Catch:{ all -> 0x0026 }
            android.content.Context r0 = r0.f168a     // Catch:{ all -> 0x0026 }
            r1.b(r0, r2)     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.q.c():void");
    }

    public final synchronized boolean d(s sVar) {
        int i3 = this.f152a;
        if (i3 == 0) {
            this.f155d.add(sVar);
            if (this.f152a == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f152a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a a2 = a.a();
                    Context context = this.f157f.f168a;
                    if (!a2.c(context, context.getClass().getName(), intent, this, 1, (Executor) null)) {
                        a("Unable to bind to service", 0);
                    } else {
                        this.f157f.f169b.schedule(new o(this, 1), 30, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e2) {
                    b("Unable to bind to service", e2);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (i3 == 1) {
            this.f155d.add(sVar);
            return true;
        } else if (i3 != 2) {
            return false;
        } else {
            this.f155d.add(sVar);
            this.f157f.f169b.execute(new o(this, 0));
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f157f.f169b.execute(new n(0, this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f157f.f169b.execute(new o(this, 2));
    }
}
