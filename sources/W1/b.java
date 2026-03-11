package W1;

import X0.g;
import a1.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import i1.c;
import q1.C0397a;
import s1.C0456q;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1898a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1899b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1900c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1901d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1902e;

    public b(String str, String str2, String str3, String str4, boolean z3) {
        this.f1899b = str == null ? "libapp.so" : str;
        this.f1900c = str2 == null ? "flutter_assets" : str2;
        this.f1902e = str4;
        this.f1901d = str3 == null ? "" : str3;
        this.f1898a = z3;
    }

    public synchronized void a() {
        try {
            if (!this.f1898a) {
                Boolean c3 = c();
                this.f1901d = c3;
                if (c3 == null) {
                    C0456q qVar = new C0456q(this);
                    this.f1900c = qVar;
                    ((k) ((c) this.f1899b)).b(qVar);
                }
                this.f1898a = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized boolean b() {
        boolean z3;
        boolean z4;
        try {
            a();
            Boolean bool = (Boolean) this.f1901d;
            if (bool != null) {
                z3 = bool.booleanValue();
            } else {
                g gVar = ((FirebaseMessaging) this.f1902e).f2863a;
                gVar.a();
                C0397a aVar = (C0397a) gVar.f1942g.get();
                synchronized (aVar) {
                    z4 = aVar.f4388d;
                }
                z3 = z4;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z3;
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        g gVar = ((FirebaseMessaging) this.f1902e).f2863a;
        gVar.a();
        Context context = gVar.f1936a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public b(FirebaseMessaging firebaseMessaging, c cVar) {
        this.f1902e = firebaseMessaging;
        this.f1899b = cVar;
    }
}
