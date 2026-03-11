package q;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: q.a  reason: case insensitive filesystem */
public abstract class C0371a {
    public static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i3) {
        activity.requestPermissions(strArr, i3);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
