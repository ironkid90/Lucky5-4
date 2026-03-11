package N2;

import A2.i;
import G2.a;
import G2.c;
import G2.e;
import J2.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final List f1190a;

    static {
        try {
            Iterator it = Arrays.asList(new b[]{new b()}).iterator();
            i.e(it, "<this>");
            f1190a = c.I(new a(new e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
