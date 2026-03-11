package s1;

import L0.a;
import W0.i;
import W0.p;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import d2.C0152a;
import h2.C0190d;
import i2.C0224e;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: s1.g  reason: case insensitive filesystem */
public abstract class C0446g extends Service {

    /* renamed from: f  reason: collision with root package name */
    public final ExecutorService f4557f;

    /* renamed from: g  reason: collision with root package name */
    public C0437J f4558g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f4559h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public int f4560i;

    /* renamed from: j  reason: collision with root package name */
    public int f4561j = 0;

    public C0446g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f4557f = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            C0436I.b(intent);
        }
        synchronized (this.f4559h) {
            try {
                int i3 = this.f4561j - 1;
                this.f4561j = i3;
                if (i3 == 0) {
                    stopSelfResult(this.f4560i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f4558g == null) {
                this.f4558g = new C0437J(new C0152a(8, this));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f4558g;
    }

    public final void onDestroy() {
        this.f4557f.shutdown();
        super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final int onStartCommand(Intent intent, int i3, int i4) {
        synchronized (this.f4559h) {
            this.f4560i = i4;
            this.f4561j++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) C0464y.e().f4625i).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        i iVar = new i();
        this.f4557f.execute(new C0190d(this, intent2, iVar, 2));
        p pVar = iVar.f1875a;
        if (pVar.d()) {
            a(intent);
            return 2;
        }
        pVar.g(new Object(), new C0224e(2, this, intent));
        return 3;
    }
}
