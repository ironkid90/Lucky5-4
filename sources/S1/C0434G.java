package s1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: s1.G  reason: case insensitive filesystem */
public final class C0434G extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public C0435H f4512a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0435H f4513b;

    public C0434G(C0435H h3, C0435H h4) {
        this.f4513b = h3;
        this.f4512a = h4;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f4513b.f4517f.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            C0435H h3 = this.f4512a;
            if (h3 != null) {
                if (h3.d()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    C0435H h4 = this.f4512a;
                    h4.f4520i.f4509f.schedule(h4, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f4512a = null;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
