package d0;

import A2.i;
import A2.j;
import F0.h;
import a0.e;
import androidx.window.extensions.layout.WindowLayoutComponent;
import f0.C0162c;
import f0.C0163d;
import z2.a;

/* renamed from: d0.f  reason: case insensitive filesystem */
public final class C0144f extends j implements a {

    /* renamed from: g  reason: collision with root package name */
    public static final C0144f f2897g = new j(0);

    public final Object a() {
        C0143e eVar;
        WindowLayoutComponent a2;
        Object obj;
        try {
            ClassLoader classLoader = C0146h.class.getClassLoader();
            if (classLoader != null) {
                eVar = new C0143e(classLoader, new h(15, (Object) classLoader));
            } else {
                eVar = null;
            }
            if (eVar == null || (a2 = eVar.a()) == null) {
                return null;
            }
            i.d(classLoader, "loader");
            h hVar = new h(15, (Object) classLoader);
            int a3 = e.a();
            if (a3 >= 2) {
                obj = new C0163d(a2);
            } else if (a3 == 1) {
                obj = new C0162c(a2, hVar);
            } else {
                obj = new Object();
            }
            return obj;
        } catch (Throwable unused) {
            C0145g gVar = C0145g.f2898a;
            return null;
        }
    }
}
