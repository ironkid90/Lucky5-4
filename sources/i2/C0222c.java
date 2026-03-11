package i2;

import L.k;
import S1.C0078d;
import W0.i;
import a.C0094a;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.a;
import b2.h;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import q.C0374d;
import q.M;
import q.T;
import s1.C0455p;
import s1.C0463x;

/* renamed from: i2.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0222c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3237f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0226g f3238g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f3239h;

    public /* synthetic */ C0222c(C0226g gVar, i iVar, int i3) {
        this.f3237f = i3;
        this.f3238g = gVar;
        this.f3239h = iVar;
    }

    public final void run() {
        Map map;
        boolean z3;
        boolean z4;
        switch (this.f3237f) {
            case 0:
                i iVar = this.f3239h;
                C0226g gVar = this.f3238g;
                gVar.getClass();
                try {
                    C0463x xVar = gVar.f3255m;
                    if (xVar != null) {
                        HashMap A3 = a.A(xVar);
                        Map map2 = gVar.f3256n;
                        if (map2 != null) {
                            A3.put("notification", map2);
                        }
                        iVar.b(A3);
                        gVar.f3255m = null;
                        gVar.f3256n = null;
                        return;
                    }
                    C0078d dVar = gVar.f3250h;
                    if (dVar == null) {
                        iVar.b((Object) null);
                        return;
                    }
                    Intent intent = dVar.getIntent();
                    if (intent != null) {
                        if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("google.message_id");
                            if (string == null) {
                                string = intent.getExtras().getString("message_id");
                            }
                            if (string != null) {
                                HashMap hashMap = gVar.f3248f;
                                if (hashMap.get(string) == null) {
                                    C0463x xVar2 = (C0463x) FlutterFirebaseMessagingReceiver.f3428a.get(string);
                                    if (xVar2 == null) {
                                        HashMap l3 = h.m().l(string);
                                        if (l3 != null) {
                                            xVar2 = a.v(l3);
                                            if (l3.get("notification") != null) {
                                                map = (Map) l3.get("notification");
                                                h.m().E(string);
                                            }
                                        }
                                        map = null;
                                        h.m().E(string);
                                    } else {
                                        map = null;
                                    }
                                    if (xVar2 == null) {
                                        iVar.b((Object) null);
                                        return;
                                    }
                                    hashMap.put(string, Boolean.TRUE);
                                    HashMap A4 = a.A(xVar2);
                                    if (xVar2.c() == null && map != null) {
                                        A4.put("notification", map);
                                    }
                                    iVar.b(A4);
                                    return;
                                }
                            }
                            iVar.b((Object) null);
                            return;
                        }
                    }
                    iVar.b((Object) null);
                    return;
                } catch (Exception e2) {
                    iVar.a(e2);
                    return;
                }
            case 1:
                i iVar2 = this.f3239h;
                C0226g gVar2 = this.f3238g;
                gVar2.getClass();
                HashMap hashMap2 = new HashMap();
                try {
                    if (C0094a.f1971k.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        C0227h hVar = gVar2.f3257o;
                        C0078d dVar2 = gVar2.f3250h;
                        C0224e eVar = new C0224e(0, hashMap2, iVar2);
                        if (hVar.f3259g) {
                            iVar2.a(new Exception("A request for permissions is already running, please wait for it to finish before doing another request."));
                            return;
                        } else if (dVar2 == null) {
                            iVar2.a(new Exception("Unable to detect current Android Activity."));
                            return;
                        } else {
                            hVar.f3258f = eVar;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("android.permission.POST_NOTIFICATIONS");
                            String[] strArr = (String[]) arrayList.toArray(new String[0]);
                            if (!hVar.f3259g) {
                                C0374d.c(dVar2, strArr, 240);
                                hVar.f3259g = true;
                                return;
                            }
                            return;
                        }
                    } else {
                        hashMap2.put("authorizationStatus", 1);
                        iVar2.b(hashMap2);
                        return;
                    }
                } catch (Exception e3) {
                    iVar2.a(e3);
                    return;
                }
            case k.FLOAT_FIELD_NUMBER:
                i iVar3 = this.f3239h;
                this.f3238g.getClass();
                try {
                    FirebaseMessaging c3 = FirebaseMessaging.c();
                    c3.getClass();
                    i iVar4 = new i();
                    c3.f2868f.execute(new C0455p(c3, iVar4, 0));
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("token", (String) a.d(iVar4.f1875a));
                    iVar3.b(hashMap3);
                    return;
                } catch (Exception e4) {
                    iVar3.a(e4);
                    return;
                }
            default:
                i iVar5 = this.f3239h;
                C0226g gVar3 = this.f3238g;
                gVar3.getClass();
                try {
                    HashMap hashMap4 = new HashMap();
                    if (Build.VERSION.SDK_INT < 33) {
                        z4 = M.a(new T(gVar3.f3250h).f4231b);
                    } else if (C0094a.f1971k.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    hashMap4.put("authorizationStatus", Integer.valueOf(z4 ? 1 : 0));
                    iVar5.b(hashMap4);
                    return;
                } catch (Exception e5) {
                    iVar5.a(e5);
                    return;
                }
        }
    }
}
