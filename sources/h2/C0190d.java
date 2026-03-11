package h2;

import W0.i;
import X0.g;
import android.content.Intent;
import android.support.v4.media.session.a;
import com.google.firebase.messaging.FirebaseMessaging;
import i2.C0226g;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import q1.C0397a;
import s1.C0446g;

/* renamed from: h2.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0190d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3066f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ i f3067g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3068h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f3069i;

    public /* synthetic */ C0190d(Object obj, Object obj2, i iVar, int i3) {
        this.f3066f = i3;
        this.f3068h = obj;
        this.f3069i = obj2;
        this.f3067g = iVar;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [h2.i, java.lang.Object] */
    public final void run() {
        boolean z3;
        switch (this.f3066f) {
            case 0:
                g gVar = (g) this.f3069i;
                i iVar = this.f3067g;
                HashMap hashMap = C0191e.f3070h;
                ((C0191e) this.f3068h).getClass();
                try {
                    gVar.a();
                    String str = gVar.f1937b;
                    gVar.a();
                    C0194h c3 = C0191e.c(gVar.f1938c);
                    gVar.a();
                    C0397a aVar = (C0397a) gVar.f1942g.get();
                    synchronized (aVar) {
                        z3 = aVar.f4388d;
                    }
                    Boolean valueOf = Boolean.valueOf(z3);
                    Map map = (Map) a.d(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(gVar));
                    ? obj = new Object();
                    if (str != null) {
                        obj.f3092a = str;
                        obj.f3093b = c3;
                        obj.f3094c = valueOf;
                        if (map != null) {
                            obj.f3095d = map;
                            iVar.b(obj);
                            return;
                        }
                        throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
                    }
                    throw new IllegalStateException("Nonnull field \"name\" is null.");
                } catch (Exception e2) {
                    iVar.a(e2);
                    return;
                }
            case 1:
                Map map2 = (Map) this.f3069i;
                i iVar2 = this.f3067g;
                ((C0226g) this.f3068h).getClass();
                try {
                    FirebaseMessaging c4 = FirebaseMessaging.c();
                    Object obj2 = map2.get("enabled");
                    Objects.requireNonNull(obj2);
                    c4.i(((Boolean) obj2).booleanValue());
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("isAutoInitEnabled", Boolean.valueOf(c4.f2867e.b()));
                    iVar2.b(hashMap2);
                    return;
                } catch (Exception e3) {
                    iVar2.a(e3);
                    return;
                }
            default:
                Intent intent = (Intent) this.f3069i;
                i iVar3 = this.f3067g;
                C0446g gVar2 = (C0446g) this.f3068h;
                gVar2.getClass();
                try {
                    gVar2.b(intent);
                    return;
                } finally {
                    iVar3.b((Object) null);
                }
        }
    }
}
