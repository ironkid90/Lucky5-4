package J1;

import A2.i;
import F0.h;
import H1.a;
import android.app.Activity;
import android.content.SharedPreferences;
import b2.f;
import c2.u;
import q2.C0400c;

public final class b implements u {

    /* renamed from: f  reason: collision with root package name */
    public Activity f803f;

    /* renamed from: g  reason: collision with root package name */
    public h f804g;

    public final boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        SharedPreferences sharedPreferences;
        i.e(strArr, "permissions");
        i.e(iArr, "grantResults");
        if (iArr.length == 0) {
            h hVar = this.f804g;
            if (hVar != null) {
                ((f) hVar.f322g).a(a.class.getSimpleName(), new Exception("The permission request dialog was closed or the request was cancelled.").getMessage(), (Object) null);
            }
            this.f803f = null;
            this.f804g = null;
            return false;
        }
        I1.b bVar = I1.b.f710g;
        if (i3 != 100) {
            return false;
        }
        int L3 = C0400c.L(strArr, "android.permission.POST_NOTIFICATIONS");
        if (L3 < 0 || iArr[L3] != 0) {
            Activity activity = this.f803f;
            if (activity != null && !activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                bVar = I1.b.f711h;
            }
        } else {
            bVar = I1.b.f709f;
        }
        Activity activity2 = this.f803f;
        if (!(activity2 == null || (sharedPreferences = activity2.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.NOTIFICATION_PERMISSION_STATUS", 0)) == null)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("android.permission.POST_NOTIFICATIONS", bVar.toString());
            edit.commit();
        }
        h hVar2 = this.f804g;
        if (hVar2 != null) {
            ((f) hVar2.f322g).b(Integer.valueOf(bVar.ordinal()));
        }
        this.f803f = null;
        this.f804g = null;
        return true;
    }
}
