package h2;

import W0.i;
import W0.p;
import android.support.v4.media.session.a;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.concurrent.Executors;
import s1.C0455p;

/* renamed from: h2.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0192f implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3073f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ i f3074g;

    public /* synthetic */ C0192f(i iVar, int i3) {
        this.f3073f = i3;
        this.f3074g = iVar;
    }

    public final void run() {
        p pVar;
        switch (this.f3073f) {
            case 0:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(this.f3074g);
                return;
            case 1:
                this.f3074g.b((Object) null);
                return;
            default:
                i iVar = this.f3074g;
                try {
                    FirebaseMessaging c3 = FirebaseMessaging.c();
                    if (c3.f() == null) {
                        pVar = a.r((Object) null);
                    } else {
                        i iVar2 = new i();
                        Executors.newSingleThreadExecutor(new L0.a("Firebase-Messaging-Network-Io")).execute(new C0455p(c3, iVar2, 1));
                        pVar = iVar2.f1875a;
                    }
                    a.d(pVar);
                    iVar.b((Object) null);
                    return;
                } catch (Exception e2) {
                    iVar.a(e2);
                    return;
                }
        }
    }
}
