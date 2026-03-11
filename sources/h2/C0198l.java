package h2;

import c2.C0134b;
import c2.f;
import j1.e;
import s1.C0464y;

/* renamed from: h2.l  reason: case insensitive filesystem */
public interface C0198l {
    static void a(f fVar, C0191e eVar) {
        n nVar = n.f3101d;
        C0464y yVar = new C0464y(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", nVar, (e) null);
        if (eVar != null) {
            yVar.l(new C0196j(eVar, 0));
        } else {
            yVar.l((C0134b) null);
        }
        C0464y yVar2 = new C0464y(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", nVar, (e) null);
        if (eVar != null) {
            yVar2.l(new C0196j(eVar, 1));
        } else {
            yVar2.l((C0134b) null);
        }
        C0464y yVar3 = new C0464y(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.delete", nVar, (e) null);
        if (eVar != null) {
            yVar3.l(new C0196j(eVar, 2));
        } else {
            yVar3.l((C0134b) null);
        }
    }
}
