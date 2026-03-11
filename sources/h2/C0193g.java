package h2;

import W0.i;
import X0.g;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;

/* renamed from: h2.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0193g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3075f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f3076g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f3077h;

    public /* synthetic */ C0193g(g gVar, i iVar, int i3) {
        this.f3075f = i3;
        this.f3076g = gVar;
        this.f3077h = iVar;
    }

    public final void run() {
        switch (this.f3075f) {
            case 0:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(this.f3076g, this.f3077h);
                return;
            default:
                g gVar = this.f3076g;
                i iVar = this.f3077h;
                try {
                    HashMap hashMap = new HashMap();
                    gVar.a();
                    if (gVar.f1937b.equals("[DEFAULT]")) {
                        hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.c().f2867e.b()));
                    }
                    iVar.b(hashMap);
                    return;
                } catch (Exception e2) {
                    iVar.a(e2);
                    return;
                }
        }
    }
}
