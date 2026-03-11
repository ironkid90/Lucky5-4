package O1;

import A2.i;
import C0.r;
import Y1.b;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import c2.f;
import c2.o;
import c2.q;

public final class a implements b {

    /* renamed from: f  reason: collision with root package name */
    public q f1238f;

    public final void onAttachedToEngine(Y1.a aVar) {
        i.e(aVar, "binding");
        f fVar = aVar.f1965b;
        i.d(fVar, "getBinaryMessenger(...)");
        Context context = aVar.f1964a;
        i.d(context, "getApplicationContext(...)");
        this.f1238f = new q(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        i.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        r rVar = new r(12, (Object) packageManager, (Object) (ActivityManager) systemService);
        q qVar = this.f1238f;
        if (qVar != null) {
            qVar.b(rVar);
        } else {
            i.g("methodChannel");
            throw null;
        }
    }

    public final void onDetachedFromEngine(Y1.a aVar) {
        i.e(aVar, "binding");
        q qVar = this.f1238f;
        if (qVar != null) {
            qVar.b((o) null);
        } else {
            i.g("methodChannel");
            throw null;
        }
    }
}
