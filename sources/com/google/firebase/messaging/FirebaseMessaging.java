package com.google.firebase.messaging;

import C0.j;
import C0.s;
import C0.t;
import G0.o;
import L0.a;
import T1.d;
import W0.h;
import W0.p;
import W1.b;
import X0.g;
import a.C0094a;
import a1.e;
import a1.k;
import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import d2.C0152a;
import i1.c;
import i2.C0224e;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l1.C0313a;
import m1.C0330d;
import n.C0335b;
import s1.C0428A;
import s1.C0429B;
import s1.C0432E;
import s1.C0433F;
import s1.C0449j;
import s1.C0450k;
import s1.C0451l;
import s1.C0452m;
import s1.C0454o;
import s1.C0456q;
import s1.C0458s;
import s1.C0463x;

public class FirebaseMessaging {

    /* renamed from: k  reason: collision with root package name */
    public static final long f2859k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l  reason: collision with root package name */
    public static C0152a f2860l;

    /* renamed from: m  reason: collision with root package name */
    public static C0313a f2861m = new e(6);

    /* renamed from: n  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f2862n;

    /* renamed from: a  reason: collision with root package name */
    public final g f2863a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2864b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2865c;

    /* renamed from: d  reason: collision with root package name */
    public final C0449j f2866d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2867e;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2868f;

    /* renamed from: g  reason: collision with root package name */
    public final ThreadPoolExecutor f2869g;

    /* renamed from: h  reason: collision with root package name */
    public final p f2870h;

    /* renamed from: i  reason: collision with root package name */
    public final C0458s f2871i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2872j = false;

    /* JADX WARNING: type inference failed for: r6v0, types: [T1.d, java.lang.Object] */
    public FirebaseMessaging(g gVar, C0313a aVar, C0313a aVar2, C0330d dVar, C0313a aVar3, c cVar) {
        g gVar2 = gVar;
        gVar.a();
        Context context = gVar2.f1936a;
        C0458s sVar = new C0458s(context);
        gVar.a();
        C0.b bVar = new C0.b(gVar2.f1936a);
        ? obj = new Object();
        obj.f1703a = gVar2;
        obj.f1704b = sVar;
        obj.f1705c = bVar;
        obj.f1706d = aVar;
        obj.f1707e = aVar2;
        obj.f1708f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-File-Io"));
        f2861m = aVar3;
        this.f2863a = gVar2;
        this.f2867e = new b(this, cVar);
        gVar.a();
        Context context2 = gVar2.f1936a;
        this.f2864b = context2;
        C0450k kVar = new C0450k();
        this.f2871i = sVar;
        this.f2865c = obj;
        this.f2866d = new C0449j(newSingleThreadExecutor);
        this.f2868f = scheduledThreadPoolExecutor;
        this.f2869g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(kVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new C0451l(this, 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Topics-Io"));
        int i3 = C0433F.f4503j;
        p g2 = android.support.v4.media.session.a.g(scheduledThreadPoolExecutor2, new C0432E(context2, scheduledThreadPoolExecutor2, this, sVar, obj));
        this.f2870h = g2;
        g2.a(scheduledThreadPoolExecutor, new C0452m(this, 0));
        scheduledThreadPoolExecutor.execute(new C0451l(this, 1));
    }

    public static void b(Runnable runnable, long j3) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f2862n == null) {
                    f2862n = new ScheduledThreadPoolExecutor(1, new a("TAG"));
                }
                f2862n.schedule(runnable, j3, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(g.d());
        }
        return instance;
    }

    public static synchronized C0152a d(Context context) {
        C0152a aVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f2860l == null) {
                    f2860l = new C0152a(context);
                }
                aVar = f2860l;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return aVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            Class<FirebaseMessaging> cls = FirebaseMessaging.class;
            gVar.a();
            firebaseMessaging = (FirebaseMessaging) gVar.f1939d.a(cls);
            o.f(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        h hVar;
        C0428A f3 = f();
        if (!m(f3)) {
            return f3.f4485a;
        }
        String b3 = C0458s.b(this.f2863a);
        C0449j jVar = this.f2866d;
        synchronized (jVar) {
            hVar = (h) ((C0335b) jVar.f4570b).getOrDefault(b3, (Object) null);
            if (hVar == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b3);
                }
                d dVar = this.f2865c;
                hVar = dVar.l(dVar.p(C0458s.b((g) dVar.f1703a), "*", new Bundle())).j(this.f2869g, new C0454o(this, b3, f3, 0)).i((ExecutorService) jVar.f4569a, new C0224e(3, jVar, b3));
                ((C0335b) jVar.f4570b).put(b3, hVar);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + b3);
            }
        }
        try {
            return (String) android.support.v4.media.session.a.d(hVar);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final String e() {
        g gVar = this.f2863a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f1937b)) {
            return "";
        }
        return gVar.f();
    }

    public final C0428A f() {
        C0428A b3;
        C0152a d3 = d(this.f2864b);
        String e2 = e();
        String b4 = C0458s.b(this.f2863a);
        synchronized (d3) {
            b3 = C0428A.b(((SharedPreferences) d3.f2912g).getString(C0152a.c(e2, b4), (String) null));
        }
        return b3;
    }

    public final void g() {
        p pVar;
        int i3;
        C0.b bVar = (C0.b) this.f2865c.f1705c;
        if (bVar.f113c.c() >= 241100000) {
            t a2 = t.a(bVar.f112b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (a2) {
                i3 = a2.f171d;
                a2.f171d = i3 + 1;
            }
            pVar = a2.b(new s(i3, 5, bundle, 1)).h(j.f133h, C0.d.f120h);
        } else {
            IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
            p pVar2 = new p();
            pVar2.k(iOException);
            pVar = pVar2;
        }
        pVar.a(this.f2868f, new C0452m(this, 1));
    }

    public final void h(C0463x xVar) {
        if (!TextUtils.isEmpty(xVar.f4618a.getString("google.to"))) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            Context context = this.f2864b;
            intent.putExtra("app", PendingIntent.getBroadcast(context, 0, intent2, 67108864));
            intent.setPackage("com.google.android.gms");
            intent.putExtras(xVar.f4618a);
            context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public final void i(boolean z3) {
        b bVar = this.f2867e;
        synchronized (bVar) {
            try {
                bVar.a();
                C0456q qVar = (C0456q) bVar.f1900c;
                if (qVar != null) {
                    ((k) ((c) bVar.f1899b)).c(qVar);
                    bVar.f1900c = null;
                }
                g gVar = ((FirebaseMessaging) bVar.f1902e).f2863a;
                gVar.a();
                SharedPreferences.Editor edit = gVar.f1936a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z3);
                edit.apply();
                if (z3) {
                    ((FirebaseMessaging) bVar.f1902e).k();
                }
                bVar.f1901d = Boolean.valueOf(z3);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final boolean j() {
        boolean z3;
        boolean z4;
        Context context = this.f2864b;
        C0094a.G(context);
        if (Build.VERSION.SDK_INT >= 29) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            } else if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                return false;
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                g gVar = this.f2863a;
                gVar.a();
                if (gVar.f1939d.a(Y0.a.class) != null) {
                    return true;
                }
                if (!M0.a.m() || f2861m == null) {
                    return false;
                }
                return true;
            }
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        } else {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
    }

    public final void k() {
        if (m(f())) {
            synchronized (this) {
                if (!this.f2872j) {
                    l(0);
                }
            }
        }
    }

    public final synchronized void l(long j3) {
        b(new C0429B(this, Math.min(Math.max(30, 2 * j3), f2859k)), j3);
        this.f2872j = true;
    }

    public final boolean m(C0428A a2) {
        if (a2 != null) {
            String a3 = this.f2871i.a();
            if (System.currentTimeMillis() > a2.f4487c + C0428A.f4484d || !a3.equals(a2.f4486b)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
