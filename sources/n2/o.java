package N2;

import A2.i;
import G2.e;
import J2.a;
import J2.c;
import J2.d;
import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1214a;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v3, types: [J2.a, java.lang.Object] */
    static {
        String str;
        int i3 = w.f1223a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new a[]{new Object()}).iterator();
            i.e(it, "<this>");
            Iterator it2 = G2.c.I(new G2.a(new e(it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int a2 = ((a) obj).a();
                    do {
                        Object next = it2.next();
                        int a3 = ((a) next).a();
                        if (a2 < a3) {
                            obj = next;
                            a2 = a3;
                        }
                    } while (it2.hasNext());
                }
            }
            a aVar = (a) obj;
            if (aVar != null) {
                try {
                    aVar.getClass();
                    Looper mainLooper = Looper.getMainLooper();
                    if (mainLooper != null) {
                        f1214a = new c(d.a(mainLooper));
                        return;
                    }
                    throw new IllegalStateException("The main looper is not available");
                } catch (Throwable th) {
                    aVar.getClass();
                    throw th;
                }
            } else {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
