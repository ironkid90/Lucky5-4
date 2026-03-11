package io.flutter.plugins.firebase.core;

import W0.h;
import W0.i;
import X0.g;
import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import h2.C0192f;
import h2.C0193g;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static h didReinitializeFirebaseCore() {
        i iVar = new i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C0192f(iVar, 0));
        return iVar.f1875a;
    }

    public static h getPluginConstantsForFirebaseApp(g gVar) {
        i iVar = new i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C0193g(gVar, iVar, 0));
        return iVar.f1875a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(i iVar) {
        try {
            for (Map.Entry<String, FlutterFirebasePlugin> value : registeredPlugins.entrySet()) {
                a.d(((FlutterFirebasePlugin) value.getValue()).didReinitializeFirebaseCore());
            }
            iVar.b((Object) null);
        } catch (Exception e2) {
            iVar.a(e2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(g gVar, i iVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry next : map.entrySet()) {
                hashMap.put((String) next.getKey(), a.d(((FlutterFirebasePlugin) next.getValue()).getPluginConstantsForFirebaseApp(gVar)));
            }
            iVar.b(hashMap);
        } catch (Exception e2) {
            iVar.a(e2);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
