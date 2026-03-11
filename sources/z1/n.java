package z1;

import E1.b;
import E1.c;
import com.dexterous.flutterlocalnotifications.i;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import w1.r;
import y1.m;

public final class n extends r {

    /* renamed from: a  reason: collision with root package name */
    public final m f4918a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f4919b;

    public n(m mVar, LinkedHashMap linkedHashMap) {
        this.f4918a = mVar;
        this.f4919b = linkedHashMap;
    }

    public final Object a(b bVar) {
        if (bVar.w() == 9) {
            bVar.s();
            return null;
        }
        Object r3 = this.f4918a.r();
        try {
            bVar.b();
            while (bVar.j()) {
                m mVar = (m) this.f4919b.get(bVar.q());
                if (mVar != null) {
                    if (mVar.f4911c) {
                        Object a2 = mVar.f4914f.a(bVar);
                        if (a2 != null || !mVar.f4917i) {
                            mVar.f4912d.set(r3, a2);
                        }
                    }
                }
                bVar.B();
            }
            bVar.g();
            return r3;
        } catch (IllegalStateException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }

    public final void b(c cVar, Object obj) {
        if (obj == null) {
            cVar.j();
            return;
        }
        cVar.c();
        try {
            for (m mVar : this.f4919b.values()) {
                boolean z3 = mVar.f4910b;
                Field field = mVar.f4912d;
                if (z3) {
                    if (field.get(obj) != obj) {
                        cVar.h(mVar.f4909a);
                        Object obj2 = field.get(obj);
                        boolean z4 = mVar.f4913e;
                        r rVar = mVar.f4914f;
                        if (!z4) {
                            rVar = new i(mVar.f4915g, rVar, mVar.f4916h.f221b);
                        }
                        rVar.b(cVar, obj2);
                    }
                }
            }
            cVar.g();
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
