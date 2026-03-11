package r;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import java.util.Objects;
import q.C0377g;
import q.C0378h;

/* renamed from: r.d  reason: case insensitive filesystem */
public abstract class C0411d {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
        int i4;
        if ((i3 & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3 & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        char c3 = 65535;
        if (context.checkPermission(str2, myPid, myUid) != -1) {
            String d3 = C0377g.d(str2);
            if (d3 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                Class cls = AppOpsManager.class;
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    i4 = C0377g.c((AppOpsManager) C0377g.a(context, cls), d3, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c4 = C0378h.c(context);
                    i4 = C0378h.a(c4, d3, Binder.getCallingUid(), packageName);
                    if (i4 == 0) {
                        i4 = C0378h.a(c4, d3, myUid, C0378h.b(context));
                    }
                } else {
                    i4 = C0377g.c((AppOpsManager) C0377g.a(context, cls), d3, packageName);
                }
                if (i4 != 0) {
                    c3 = 65534;
                }
            }
            c3 = 0;
        }
        if (c3 == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException("Permission " + str2 + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
