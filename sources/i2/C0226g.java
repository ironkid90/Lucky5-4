package i2;

import C0.f;
import L.k;
import S1.C0078d;
import T1.d;
import W0.h;
import W0.i;
import X0.g;
import Y1.b;
import Z1.a;
import a.C0094a;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import c2.m;
import c2.o;
import c2.p;
import c2.q;
import c2.t;
import h2.C0190d;
import h2.C0192f;
import h2.C0193g;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import s1.C0463x;
import u1.C0496c;

/* renamed from: i2.g  reason: case insensitive filesystem */
public class C0226g implements FlutterFirebasePlugin, o, t, b, a {

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f3248f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public q f3249g;

    /* renamed from: h  reason: collision with root package name */
    public C0078d f3250h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.o f3251i;

    /* renamed from: j  reason: collision with root package name */
    public C0225f f3252j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.o f3253k;

    /* renamed from: l  reason: collision with root package name */
    public C0225f f3254l;

    /* renamed from: m  reason: collision with root package name */
    public C0463x f3255m;

    /* renamed from: n  reason: collision with root package name */
    public Map f3256n;

    /* renamed from: o  reason: collision with root package name */
    public C0227h f3257o;

    public C0226g() {
        if (androidx.lifecycle.o.f2524l == null) {
            androidx.lifecycle.o.f2524l = new androidx.lifecycle.o();
        }
        this.f3251i = androidx.lifecycle.o.f2524l;
        if (androidx.lifecycle.o.f2525m == null) {
            androidx.lifecycle.o.f2525m = new androidx.lifecycle.o();
        }
        this.f3253k = androidx.lifecycle.o.f2525m;
    }

    public final h didReinitializeFirebaseCore() {
        i iVar = new i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C0192f(iVar, 1));
        return iVar.f1875a;
    }

    public final h getPluginConstantsForFirebaseApp(g gVar) {
        i iVar = new i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C0193g(gVar, iVar, 1));
        return iVar.f1875a;
    }

    public final void onAttachedToActivity(Z1.b bVar) {
        d dVar = (d) bVar;
        ((HashSet) dVar.f1706d).add(this);
        ((HashSet) dVar.f1704b).add(this.f3257o);
        C0078d dVar2 = (C0078d) dVar.f1703a;
        this.f3250h = dVar2;
        if (dVar2.getIntent() != null && this.f3250h.getIntent().getExtras() != null && (this.f3250h.getIntent().getFlags() & 1048576) != 1048576) {
            onNewIntent(this.f3250h.getIntent());
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [i2.h, java.lang.Object] */
    public final void onAttachedToEngine(Y1.a aVar) {
        Context context = aVar.f1964a;
        Log.d("FLTFireContextHolder", "received application context.");
        C0094a.f1971k = context;
        q qVar = new q(aVar.f1965b, "plugins.flutter.io/firebase_messaging");
        this.f3249g = qVar;
        qVar.b(this);
        ? obj = new Object();
        obj.f3259g = false;
        this.f3257o = obj;
        C0225f fVar = new C0225f(this, 0);
        this.f3252j = fVar;
        this.f3254l = new C0225f(this, 1);
        this.f3251i.c(fVar);
        this.f3253k.c(this.f3254l);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    public final void onDetachedFromActivity() {
        this.f3250h = null;
    }

    public final void onDetachedFromActivityForConfigChanges() {
        this.f3250h = null;
    }

    public final void onDetachedFromEngine(Y1.a aVar) {
        this.f3253k.e(this.f3254l);
        this.f3251i.e(this.f3252j);
    }

    public final void onMethodCall(m mVar, p pVar) {
        W0.p pVar2;
        long j3;
        long j4;
        C0496c cVar;
        String str = mVar.f2785a;
        str.getClass();
        Object obj = mVar.f2786b;
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals("Messaging#getInitialMessage")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals("Messaging#setAutoInitEnabled")) {
                    c3 = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals("Messaging#deleteToken")) {
                    c3 = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals("Messaging#unsubscribeFromTopic")) {
                    c3 = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals("Messaging#subscribeToTopic")) {
                    c3 = 4;
                    break;
                }
                break;
            case 607887267:
                if (str.equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
                    c3 = 5;
                    break;
                }
                break;
            case 928431066:
                if (str.equals("Messaging#startBackgroundIsolate")) {
                    c3 = 6;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals("Messaging#sendMessage")) {
                    c3 = 7;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals("Messaging#requestPermission")) {
                    c3 = 8;
                    break;
                }
                break;
            case 1243856389:
                if (str.equals("Messaging#getNotificationSettings")) {
                    c3 = 9;
                    break;
                }
                break;
            case 1459336962:
                if (str.equals("Messaging#getToken")) {
                    c3 = 10;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                i iVar = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0222c(this, iVar, 0));
                pVar2 = iVar.f1875a;
                break;
            case 1:
                i iVar2 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0190d(this, (Map) obj, iVar2, 1));
                pVar2 = iVar2.f1875a;
                break;
            case k.FLOAT_FIELD_NUMBER:
                i iVar3 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0192f(iVar3, 2));
                pVar2 = iVar3.f1875a;
                break;
            case k.INTEGER_FIELD_NUMBER:
                i iVar4 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0223d((Map) obj, iVar4, 0));
                pVar2 = iVar4.f1875a;
                break;
            case k.LONG_FIELD_NUMBER:
                i iVar5 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0223d((Map) obj, iVar5, 2));
                pVar2 = iVar5.f1875a;
                break;
            case k.STRING_FIELD_NUMBER:
                i iVar6 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0223d((Map) obj, iVar6, 1));
                pVar2 = iVar6.f1875a;
                break;
            case k.STRING_SET_FIELD_NUMBER:
                Map map = (Map) obj;
                Object obj2 = map.get("pluginCallbackHandle");
                Object obj3 = map.get("userCallbackHandle");
                if (obj2 instanceof Long) {
                    j3 = ((Long) obj2).longValue();
                } else if (obj2 instanceof Integer) {
                    j3 = (long) ((Integer) obj2).intValue();
                } else {
                    throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                }
                if (obj3 instanceof Long) {
                    j4 = ((Long) obj3).longValue();
                } else if (obj3 instanceof Integer) {
                    j4 = (long) ((Integer) obj3).intValue();
                } else {
                    throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                }
                C0078d dVar = this.f3250h;
                if (dVar != null) {
                    cVar = C0496c.a(dVar.getIntent());
                } else {
                    cVar = null;
                }
                List list = FlutterFirebaseMessagingBackgroundService.f3426m;
                Context context = C0094a.f1971k;
                if (context == null) {
                    Log.e("FLTFireBGExecutor", "Context is null, cannot continue.");
                } else {
                    context.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", j3).apply();
                }
                C0094a.f1971k.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", j4).apply();
                if (FlutterFirebaseMessagingBackgroundService.f3427n != null) {
                    Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
                } else {
                    f fVar = new f(16);
                    FlutterFirebaseMessagingBackgroundService.f3427n = fVar;
                    fVar.Z(j3, cVar);
                }
                pVar2 = android.support.v4.media.session.a.r((Object) null);
                break;
            case k.DOUBLE_FIELD_NUMBER:
                i iVar7 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0223d((Map) obj, iVar7, 3));
                pVar2 = iVar7.f1875a;
                break;
            case k.BYTES_FIELD_NUMBER:
                if (Build.VERSION.SDK_INT < 33) {
                    i iVar8 = new i();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new C0222c(this, iVar8, 3));
                    pVar2 = iVar8.f1875a;
                    break;
                } else {
                    i iVar9 = new i();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new C0222c(this, iVar9, 1));
                    pVar2 = iVar9.f1875a;
                    break;
                }
            case 9:
                i iVar10 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0222c(this, iVar10, 3));
                pVar2 = iVar10.f1875a;
                break;
            case 10:
                i iVar11 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0222c(this, iVar11, 2));
                pVar2 = iVar11.f1875a;
                break;
            default:
                ((b2.f) pVar).c();
                return;
        }
        pVar2.f(new C0224e(1, this, (b2.f) pVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onNewIntent(android.content.Intent r9) {
        /*
            r8 = this;
            android.os.Bundle r0 = r9.getExtras()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.os.Bundle r0 = r9.getExtras()
            java.lang.String r2 = "google.message_id"
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001e
            android.os.Bundle r0 = r9.getExtras()
            java.lang.String r2 = "message_id"
            java.lang.String r0 = r0.getString(r2)
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return r1
        L_0x0021:
            java.util.HashMap r2 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver.f3428a
            java.lang.Object r3 = r2.get(r0)
            s1.x r3 = (s1.C0463x) r3
            java.lang.String r4 = "notification"
            r5 = 0
            if (r3 != 0) goto L_0x0055
            b2.h r6 = b2.h.m()
            java.util.HashMap r6 = r6.l(r0)
            if (r6 == 0) goto L_0x0055
            s1.x r3 = android.support.v4.media.session.a.v(r6)
            java.lang.String r7 = "message"
            java.lang.Object r6 = r6.get(r7)
            java.util.Objects.requireNonNull(r6)
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r6.get(r4)
            if (r7 != 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            java.lang.Object r6 = r6.get(r4)
            java.util.Map r6 = (java.util.Map) r6
            goto L_0x0056
        L_0x0055:
            r6 = r5
        L_0x0056:
            if (r3 != 0) goto L_0x0059
            return r1
        L_0x0059:
            r8.f3255m = r3
            r8.f3256n = r6
            r2.remove(r0)
            java.util.HashMap r0 = android.support.v4.media.session.a.A(r3)
            s1.w r1 = r3.c()
            if (r1 != 0) goto L_0x0071
            java.util.Map r1 = r8.f3256n
            if (r1 == 0) goto L_0x0071
            r0.put(r4, r1)
        L_0x0071:
            c2.q r1 = r8.f3249g
            java.lang.String r2 = "Messaging#onMessageOpenedApp"
            r1.a(r2, r0, r5)
            S1.d r0 = r8.f3250h
            r0.setIntent(r9)
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C0226g.onNewIntent(android.content.Intent):boolean");
    }

    public final void onReattachedToActivityForConfigChanges(Z1.b bVar) {
        d dVar = (d) bVar;
        ((HashSet) dVar.f1706d).add(this);
        this.f3250h = (C0078d) dVar.f1703a;
    }
}
