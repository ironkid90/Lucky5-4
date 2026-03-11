package h2;

import W0.i;
import X0.g;
import X0.h;
import android.support.v4.media.session.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: h2.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0189c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3063f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0191e f3064g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f3065h;

    public /* synthetic */ C0189c(C0191e eVar, i iVar, int i3) {
        this.f3063f = i3;
        this.f3064g = eVar;
        this.f3065h = iVar;
    }

    public final void run() {
        ArrayList arrayList;
        switch (this.f3063f) {
            case 0:
                i iVar = this.f3065h;
                HashMap hashMap = C0191e.f3070h;
                C0191e eVar = this.f3064g;
                eVar.getClass();
                try {
                    h a2 = h.a(eVar.f3071f);
                    if (a2 == null) {
                        iVar.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                        return;
                    } else {
                        iVar.b(C0191e.c(a2));
                        return;
                    }
                } catch (Exception e2) {
                    iVar.a(e2);
                    return;
                }
            default:
                C0191e eVar2 = this.f3064g;
                i iVar2 = this.f3065h;
                HashMap hashMap2 = C0191e.f3070h;
                eVar2.getClass();
                try {
                    if (!eVar2.f3072g) {
                        eVar2.f3072g = true;
                    } else {
                        a.d(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                    }
                    synchronized (g.f1934k) {
                        arrayList = new ArrayList(g.f1935l.values());
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        i iVar3 = new i();
                        FlutterFirebasePlugin.cachedThreadPool.execute(new C0190d(eVar2, (g) it.next(), iVar3, 0));
                        arrayList2.add((C0195i) a.d(iVar3.f1875a));
                    }
                    iVar2.b(arrayList2);
                    return;
                } catch (Exception e3) {
                    iVar2.a(e3);
                    return;
                }
        }
    }
}
