package i2;

import android.app.NotificationChannel;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* renamed from: i2.l  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0231l {
    public static /* bridge */ /* synthetic */ boolean B(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ JobWorkItem d(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* bridge */ /* synthetic */ AutofillManager f(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue g(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return AutofillManager.class;
    }
}
