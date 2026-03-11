package s1;

import S1.r;
import W0.i;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import d2.C0152a;
import h2.C0190d;

/* renamed from: s1.J  reason: case insensitive filesystem */
public final class C0437J extends Binder {

    /* renamed from: c  reason: collision with root package name */
    public final C0152a f4525c;

    public C0437J(C0152a aVar) {
        this.f4525c = aVar;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void a(C0438K k3) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = k3.f4526a;
            C0446g gVar = (C0446g) this.f4525c.f2912g;
            gVar.getClass();
            i iVar = new i();
            gVar.f4557f.execute(new C0190d(gVar, intent, iVar, 2));
            iVar.f1875a.g(new Object(), new r(10, k3));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
