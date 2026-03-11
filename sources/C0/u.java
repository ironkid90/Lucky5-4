package C0;

import K0.b;
import L1.d;
import M0.c;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import j.C0253s;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.List;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public int f172a;

    /* renamed from: b  reason: collision with root package name */
    public int f173b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f174c;

    public u(Context context) {
        this.f173b = 0;
        this.f174c = context;
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new d(7, (Object) this));
    }

    public void b(Typeface typeface) {
        int i3;
        boolean z3;
        WeakReference weakReference = (WeakReference) this.f174c;
        C0253s sVar = (C0253s) weakReference.get();
        if (sVar != null) {
            if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f172a) != -1) {
                if ((this.f173b & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                typeface = Typeface.create(typeface, i3, z3);
            }
            sVar.f3780a.post(new n(12, weakReference, typeface));
        }
    }

    public synchronized int c() {
        PackageInfo packageInfo;
        if (this.f172a == 0) {
            try {
                packageInfo = c.a((Context) this.f174c).f1087a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f172a = packageInfo.versionCode;
            }
        }
        return this.f172a;
    }

    public synchronized int d() {
        int i3 = this.f173b;
        if (i3 != 0) {
            return i3;
        }
        Context context = (Context) this.f174c;
        PackageManager packageManager = context.getPackageManager();
        if (c.a(context).f1087a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i4 = 1;
        if (!b.b()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f173b = i4;
                return i4;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true == b.b()) {
                i4 = 2;
            }
            this.f173b = i4;
            return i4;
        }
        i4 = 2;
        this.f173b = i4;
        return i4;
    }

    public u(int i3, String str, double d3, double d4, double d5, double d6, int i4, int i5, ByteBuffer byteBuffer) {
        this.f172a = i3;
        this.f174c = str;
        this.f173b = i4;
    }

    public u(C0253s sVar, int i3, int i4) {
        this.f174c = new WeakReference(sVar);
        this.f172a = i3;
        this.f173b = i4;
    }
}
