package s1;

import F0.p;
import L0.a;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: s1.B  reason: case insensitive filesystem */
public final class C0429B implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final long f4488f;

    /* renamed from: g  reason: collision with root package name */
    public final PowerManager.WakeLock f4489g;

    /* renamed from: h  reason: collision with root package name */
    public final FirebaseMessaging f4490h;

    public C0429B(FirebaseMessaging firebaseMessaging, long j3) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("firebase-iid-executor"));
        this.f4490h = firebaseMessaging;
        this.f4488f = j3;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f2864b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f4489g = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f4490h.f2864b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        try {
            if (this.f4490h.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e2) {
            String message = e2.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e2.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e2.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e2;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public final void run() {
        C0464y e2 = C0464y.e();
        FirebaseMessaging firebaseMessaging = this.f4490h;
        boolean h3 = e2.h(firebaseMessaging.f2864b);
        PowerManager.WakeLock wakeLock = this.f4489g;
        if (h3) {
            wakeLock.acquire();
        }
        try {
            synchronized (firebaseMessaging) {
                firebaseMessaging.f2872j = true;
            }
            if (!firebaseMessaging.f2871i.d()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f2872j = false;
                }
                if (C0464y.e().h(firebaseMessaging.f2864b)) {
                    wakeLock.release();
                }
            } else if (!C0464y.e().g(firebaseMessaging.f2864b) || a()) {
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f2872j = false;
                    }
                } else {
                    firebaseMessaging.l(this.f4488f);
                }
                if (!C0464y.e().h(firebaseMessaging.f2864b)) {
                    return;
                }
                wakeLock.release();
            } else {
                p pVar = new p();
                pVar.f347c = this;
                pVar.a();
                if (C0464y.e().h(firebaseMessaging.f2864b)) {
                    wakeLock.release();
                }
            }
        } catch (IOException e3) {
            try {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e3.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f2872j = false;
                    if (!C0464y.e().h(firebaseMessaging.f2864b)) {
                    }
                }
            } catch (Throwable th) {
                if (C0464y.e().h(firebaseMessaging.f2864b)) {
                    wakeLock.release();
                }
                throw th;
            }
        }
    }
}
