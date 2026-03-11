package I;

import A2.i;
import A2.j;
import I2.C0063n;
import java.util.concurrent.CancellationException;
import p2.C0368h;
import z2.p;

public final class L extends j implements p {

    /* renamed from: g  reason: collision with root package name */
    public static final L f553g = new j(2);

    public final Object i(Object obj, Object obj2) {
        S s3 = (S) obj;
        Throwable th = (Throwable) obj2;
        i.e(s3, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        s3.f582b.K(new C0063n(th, false));
        return C0368h.f4194a;
    }
}
