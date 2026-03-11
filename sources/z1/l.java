package z1;

import C1.a;
import E1.b;
import E1.c;
import L.j;
import java.util.ArrayList;
import w1.k;
import w1.r;

public final class l extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4907b = new a(5);

    /* renamed from: a  reason: collision with root package name */
    public final k f4908a;

    public l(k kVar) {
        this.f4908a = kVar;
    }

    public final Object a(b bVar) {
        int b3 = j.b(bVar.w());
        if (b3 == 0) {
            ArrayList arrayList = new ArrayList();
            bVar.a();
            while (bVar.j()) {
                arrayList.add(a(bVar));
            }
            bVar.e();
            return arrayList;
        } else if (b3 == 2) {
            y1.l lVar = new y1.l();
            bVar.b();
            while (bVar.j()) {
                lVar.put(bVar.q(), a(bVar));
            }
            bVar.g();
            return lVar;
        } else if (b3 == 5) {
            return bVar.u();
        } else {
            if (b3 == 6) {
                return Double.valueOf(bVar.n());
            }
            if (b3 == 7) {
                return Boolean.valueOf(bVar.m());
            }
            if (b3 == 8) {
                bVar.s();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    public final void b(c cVar, Object obj) {
        if (obj == null) {
            cVar.j();
            return;
        }
        Class<?> cls = obj.getClass();
        k kVar = this.f4908a;
        kVar.getClass();
        r c3 = kVar.c(new D1.a(cls));
        if (c3 instanceof l) {
            cVar.c();
            cVar.g();
            return;
        }
        c3.b(cVar, obj);
    }
}
