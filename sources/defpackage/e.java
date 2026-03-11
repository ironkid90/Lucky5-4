package defpackage;

import A2.h;
import A2.i;
import Q1.a;
import c2.C0134b;
import c2.f;
import c2.l;
import p2.C0366f;
import s1.C0464y;

/* renamed from: e  reason: default package */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f2915a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0366f f2916b = new C0366f(new c(0));

    public static void a(e eVar, f fVar, a aVar) {
        eVar.getClass();
        i.e(fVar, "binaryMessenger");
        String str = "";
        if (str.length() > 0) {
            str = ".".concat(str);
        }
        String g2 = h.g("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", str);
        C0366f fVar2 = f2916b;
        C0464y yVar = new C0464y(fVar, g2, (l) fVar2.a(), (j1.e) null);
        if (aVar != null) {
            yVar.l(new d(aVar, 0));
        } else {
            yVar.l((C0134b) null);
        }
        C0464y yVar2 = new C0464y(fVar, h.g("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", str), (l) fVar2.a(), (j1.e) null);
        if (aVar != null) {
            yVar2.l(new d(aVar, 1));
        } else {
            yVar2.l((C0134b) null);
        }
    }
}
