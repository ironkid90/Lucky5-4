package q1;

import X0.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import i1.C0218a;
import i1.C0219b;
import r.C0410c;

/* renamed from: q1.a  reason: case insensitive filesystem */
public final class C0397a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4385a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f4386b;

    /* renamed from: c  reason: collision with root package name */
    public final C0219b f4387c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4388d;

    public C0397a(Context context, String str, C0219b bVar) {
        boolean z3;
        Context a2 = C0410c.a(context);
        this.f4385a = a2;
        SharedPreferences sharedPreferences = a2.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f4386b = sharedPreferences;
        this.f4387c = bVar;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z3 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            z3 = a();
        }
        this.f4388d = z3;
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f4385a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z3) {
        if (this.f4388d != z3) {
            this.f4388d = z3;
            this.f4387c.a(new C0218a(new b(0)));
        }
    }
}
