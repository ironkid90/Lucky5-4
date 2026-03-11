package h2;

import C0.r;
import L.k;
import L1.h;
import W0.i;
import c2.C0134b;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.ArrayList;

/* renamed from: h2.j  reason: case insensitive filesystem */
public final /* synthetic */ class C0196j implements C0134b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3096f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0191e f3097g;

    public /* synthetic */ C0196j(C0191e eVar, int i3) {
        this.f3096f = i3;
        this.f3097g = eVar;
    }

    public final void j(Object obj, r rVar) {
        switch (this.f3096f) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                C0197k kVar = new C0197k(new ArrayList(), rVar, 0);
                this.f3097g.getClass();
                i iVar = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0188b((String) arrayList.get(0), (Boolean) arrayList.get(1), iVar, 1));
                iVar.f1875a.f(new S1.r(3, kVar));
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                C0197k kVar2 = new C0197k(new ArrayList(), rVar, 1);
                this.f3097g.getClass();
                i iVar2 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0188b((String) arrayList2.get(0), (Boolean) arrayList2.get(1), iVar2, 0));
                iVar2.f1875a.f(new S1.r(3, kVar2));
                return;
            case k.FLOAT_FIELD_NUMBER:
                C0197k kVar3 = new C0197k(new ArrayList(), rVar, 2);
                this.f3097g.getClass();
                i iVar3 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new h(8, (String) ((ArrayList) obj).get(0), iVar3));
                iVar3.f1875a.f(new S1.r(3, kVar3));
                return;
            case k.INTEGER_FIELD_NUMBER:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = (ArrayList) obj;
                C0194h hVar = (C0194h) arrayList4.get(1);
                C0197k kVar4 = new C0197k(arrayList3, rVar, 3);
                C0191e eVar = this.f3097g;
                eVar.getClass();
                i iVar4 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0187a(eVar, hVar, (String) arrayList4.get(0), iVar4, 0));
                iVar4.f1875a.f(new S1.r(4, kVar4));
                return;
            case k.LONG_FIELD_NUMBER:
                C0197k kVar5 = new C0197k(new ArrayList(), rVar, 4);
                C0191e eVar2 = this.f3097g;
                eVar2.getClass();
                i iVar5 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0189c(eVar2, iVar5, 1));
                iVar5.f1875a.f(new S1.r(4, kVar5));
                return;
            default:
                C0197k kVar6 = new C0197k(new ArrayList(), rVar, 5);
                C0191e eVar3 = this.f3097g;
                eVar3.getClass();
                i iVar6 = new i();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C0189c(eVar3, iVar6, 0));
                iVar6.f1875a.f(new S1.r(4, kVar6));
                return;
        }
    }
}
