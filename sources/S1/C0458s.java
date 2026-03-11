package s1;

import K0.b;
import X0.g;
import X0.h;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* renamed from: s1.s  reason: case insensitive filesystem */
public final class C0458s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4589a;

    /* renamed from: b  reason: collision with root package name */
    public String f4590b;

    /* renamed from: c  reason: collision with root package name */
    public String f4591c;

    /* renamed from: d  reason: collision with root package name */
    public int f4592d;

    /* renamed from: e  reason: collision with root package name */
    public int f4593e = 0;

    public C0458s(Context context) {
        this.f4589a = context;
    }

    public static String b(g gVar) {
        gVar.a();
        h hVar = gVar.f1938c;
        String str = hVar.f1950e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = hVar.f1947b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f4590b == null) {
                e();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f4590b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f4589a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Failed to find package " + e2);
            return null;
        }
    }

    public final boolean d() {
        int i3;
        synchronized (this) {
            i3 = this.f4593e;
            if (i3 == 0) {
                PackageManager packageManager = this.f4589a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i3 = 0;
                } else {
                    if (!b.b()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f4593e = 1;
                            i3 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (b.b()) {
                            this.f4593e = 2;
                        } else {
                            this.f4593e = 1;
                        }
                        i3 = this.f4593e;
                    } else {
                        this.f4593e = 2;
                        i3 = 2;
                    }
                }
            }
        }
        if (i3 != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void e() {
        PackageInfo c3 = c(this.f4589a.getPackageName());
        if (c3 != null) {
            this.f4590b = Integer.toString(c3.versionCode);
            this.f4591c = c3.versionName;
        }
    }
}
