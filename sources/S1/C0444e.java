package s1;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import i2.C0231l;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: s1.e  reason: case insensitive filesystem */
public abstract class C0444e {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f4555a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i3) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!C0231l.B(resources.getDrawable(i3, (Resources.Theme) null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i3);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i3 + ", treating it as an invalid icon");
            return false;
        }
    }
}
