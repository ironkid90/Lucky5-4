package r;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import q.M;
import q.T;

/* renamed from: r.g  reason: case insensitive filesystem */
public abstract class C0414g {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f4399a = null;

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        } else if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            if (M.a(new T(context).f4231b)) {
                return 0;
            }
            return -1;
        }
    }

    public static void b(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0411d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
