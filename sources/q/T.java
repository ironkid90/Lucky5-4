package q;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

public final class T {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4225c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static String f4226d;

    /* renamed from: e  reason: collision with root package name */
    public static HashSet f4227e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f4228f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static S f4229g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4230a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f4231b;

    public T(Context context) {
        this.f4230a = context;
        this.f4231b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i3) {
        this.f4231b.cancel(str, i3);
    }

    public final void b(String str, int i3, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f4231b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i3, notification);
            return;
        }
        O o3 = new O(this.f4230a.getPackageName(), i3, str, notification);
        synchronized (f4228f) {
            try {
                if (f4229g == null) {
                    f4229g = new S(this.f4230a.getApplicationContext());
                }
                f4229g.f4222b.obtainMessage(0, o3).sendToTarget();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        notificationManager.cancel(str, i3);
    }
}
