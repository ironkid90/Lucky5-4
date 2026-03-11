package s1;

import W0.i;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.support.v4.media.session.a;
import android.util.Log;

/* renamed from: s1.u  reason: case insensitive filesystem */
public final /* synthetic */ class C0460u implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f4595f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f4596g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f4597h;

    public /* synthetic */ C0460u(Context context, boolean z3, i iVar) {
        this.f4595f = context;
        this.f4596g = z3;
        this.f4597h = iVar;
    }

    public final void run() {
        boolean z3;
        Context context = this.f4595f;
        i iVar = this.f4597h;
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            } else {
                SharedPreferences.Editor edit = a.u(context).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (this.f4596g) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
            }
        } finally {
            iVar.d((Object) null);
        }
    }
}
