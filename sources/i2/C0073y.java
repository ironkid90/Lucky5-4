package I2;

import J2.c;
import N2.o;
import N2.w;
import P2.d;

/* renamed from: I2.y  reason: case insensitive filesystem */
public abstract class C0073y {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f798a = 0;

    static {
        String str;
        boolean z3;
        int i3 = w.f1223a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z3 = Boolean.parseBoolean(str);
        } else {
            z3 = false;
        }
        if (!z3) {
            C0072x xVar = C0072x.f796o;
            return;
        }
        d dVar = C.f715a;
        c cVar = o.f1214a;
        c cVar2 = cVar.f808k;
        if (!(cVar instanceof C0074z)) {
            C0072x xVar2 = C0072x.f796o;
        }
    }
}
