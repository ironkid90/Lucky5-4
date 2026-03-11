package E1;

import A2.h;
import java.util.Iterator;
import java.util.Map;
import w1.q;
import z1.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f226a;

    public static void a(b bVar) {
        if (bVar instanceof f) {
            f fVar = (f) bVar;
            fVar.D(5);
            Map.Entry entry = (Map.Entry) ((Iterator) fVar.F()).next();
            fVar.H(entry.getValue());
            fVar.H(new q((String) entry.getKey()));
            return;
        }
        int i3 = bVar.f234m;
        if (i3 == 0) {
            i3 = bVar.d();
        }
        if (i3 == 13) {
            bVar.f234m = 9;
        } else if (i3 == 12) {
            bVar.f234m = 8;
        } else if (i3 == 14) {
            bVar.f234m = 10;
        } else {
            throw new IllegalStateException("Expected a name but was " + h.l(bVar.w()) + bVar.l());
        }
    }
}
