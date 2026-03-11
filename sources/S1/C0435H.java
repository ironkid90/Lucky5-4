package s1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* renamed from: s1.H  reason: case insensitive filesystem */
public final class C0435H implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f4514k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static Boolean f4515l;

    /* renamed from: m  reason: collision with root package name */
    public static Boolean f4516m;

    /* renamed from: f  reason: collision with root package name */
    public final Context f4517f;

    /* renamed from: g  reason: collision with root package name */
    public final C0458s f4518g;

    /* renamed from: h  reason: collision with root package name */
    public final PowerManager.WakeLock f4519h;

    /* renamed from: i  reason: collision with root package name */
    public final C0433F f4520i;

    /* renamed from: j  reason: collision with root package name */
    public final long f4521j;

    public C0435H(C0433F f3, Context context, C0458s sVar, long j3) {
        this.f4520i = f3;
        this.f4517f = context;
        this.f4521j = j3;
        this.f4518g = sVar;
        this.f4519h = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean z3;
        boolean booleanValue;
        synchronized (f4514k) {
            try {
                Boolean bool = f4516m;
                if (bool == null) {
                    z3 = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    z3 = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(z3);
                f4516m = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z3;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z3;
    }

    public static boolean c(Context context) {
        boolean z3;
        boolean booleanValue;
        synchronized (f4514k) {
            try {
                Boolean bool = f4515l;
                if (bool == null) {
                    z3 = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    z3 = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(z3);
                f4515l = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z3;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f4517f.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                z3 = false;
            } else {
                z3 = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return z3;
    }

    public final void run() {
        C0433F f3 = this.f4520i;
        Context context = this.f4517f;
        boolean c3 = c(context);
        PowerManager.WakeLock wakeLock = this.f4519h;
        if (c3) {
            wakeLock.acquire(C0445f.f4556a);
        }
        try {
            f3.e(true);
            if (!this.f4518g.d()) {
                f3.e(false);
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!a(context) || d()) {
                if (f3.g()) {
                    f3.e(false);
                } else {
                    f3.h(this.f4521j);
                }
                if (!c(context)) {
                    return;
                }
                try {
                    wakeLock.release();
                } catch (RuntimeException unused2) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } else {
                new C0434G(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e2) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e2.getMessage());
            f3.e(false);
            if (!c(context)) {
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
