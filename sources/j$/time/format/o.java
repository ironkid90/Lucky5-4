package j$.time.format;

import j$.time.chrono.l;
import j$.time.chrono.m;
import j$.time.temporal.a;
import j$.time.temporal.s;
import java.util.Iterator;
import java.util.Map;

final class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f5092a;

    /* renamed from: b  reason: collision with root package name */
    private final A f5093b;

    /* renamed from: c  reason: collision with root package name */
    private final b f5094c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f5095d;

    o(a aVar, A a2, b bVar) {
        this.f5092a = aVar;
        this.f5093b = a2;
        this.f5094c = bVar;
    }

    public final boolean p(t tVar, StringBuilder sb) {
        String str;
        Long e2 = tVar.e(this.f5092a);
        if (e2 == null) {
            return false;
        }
        l lVar = (l) tVar.d().a(s.a());
        if (lVar == null || lVar == j$.time.chrono.s.f5038d) {
            long longValue = e2.longValue();
            A a2 = this.f5093b;
            tVar.c();
            str = this.f5094c.f5064a.a(longValue, a2);
        } else {
            long longValue2 = e2.longValue();
            A a3 = this.f5093b;
            tVar.c();
            str = this.f5094c.f5064a.a(longValue2, a3);
        }
        if (str == null) {
            if (this.f5095d == null) {
                this.f5095d = new i(this.f5092a, 1, 19, z.NORMAL);
            }
            return this.f5095d.p(tVar, sb);
        }
        sb.append(str);
        return true;
    }

    public final int r(q qVar, CharSequence charSequence, int i3) {
        Iterator it;
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            throw new IndexOutOfBoundsException();
        }
        A a2 = qVar.k() ? this.f5093b : null;
        l g2 = qVar.g();
        b bVar = this.f5094c;
        a aVar = this.f5092a;
        if (g2 == null || g2 == j$.time.chrono.s.f5038d) {
            qVar.h();
            it = bVar.f5064a.b(a2);
        } else {
            qVar.h();
            it = bVar.f5064a.b(a2);
        }
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (qVar.r(str, 0, charSequence, i3, str.length())) {
                    return qVar.n(this.f5092a, ((Long) entry.getValue()).longValue(), i3, str.length() + i3);
                }
            }
            if (aVar == a.ERA && !qVar.k()) {
                for (m mVar : g2.D()) {
                    String obj = mVar.toString();
                    if (qVar.r(obj, 0, charSequence, i3, obj.length())) {
                        return qVar.n(this.f5092a, (long) mVar.p(), i3, obj.length() + i3);
                    }
                }
            }
            if (qVar.k()) {
                return ~i3;
            }
        }
        if (this.f5095d == null) {
            this.f5095d = new i(this.f5092a, 1, 19, z.NORMAL);
        }
        return this.f5095d.r(qVar, charSequence, i3);
    }

    public final String toString() {
        A a2 = A.FULL;
        a aVar = this.f5092a;
        A a3 = this.f5093b;
        if (a3 == a2) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + a3 + ")";
    }
}
