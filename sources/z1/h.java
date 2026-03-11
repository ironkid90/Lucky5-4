package z1;

import E1.c;
import java.io.IOException;
import java.util.ArrayList;
import w1.l;
import w1.m;
import w1.o;
import w1.p;
import w1.q;

public final class h extends c {

    /* renamed from: s  reason: collision with root package name */
    public static final g f4894s = new g();

    /* renamed from: t  reason: collision with root package name */
    public static final q f4895t = new q("closed");

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f4896p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public String f4897q;

    /* renamed from: r  reason: collision with root package name */
    public m f4898r = o.f4741f;

    public h() {
        super(f4894s);
    }

    public final void b() {
        l lVar = new l();
        t(lVar);
        this.f4896p.add(lVar);
    }

    public final void c() {
        p pVar = new p();
        t(pVar);
        this.f4896p.add(pVar);
    }

    public final void close() {
        ArrayList arrayList = this.f4896p;
        if (arrayList.isEmpty()) {
            arrayList.add(f4895t);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void e() {
        ArrayList arrayList = this.f4896p;
        if (arrayList.isEmpty() || this.f4897q != null) {
            throw new IllegalStateException();
        } else if (s() instanceof l) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void g() {
        ArrayList arrayList = this.f4896p;
        if (arrayList.isEmpty() || this.f4897q != null) {
            throw new IllegalStateException();
        } else if (s() instanceof p) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f4896p.isEmpty() || this.f4897q != null) {
            throw new IllegalStateException();
        } else if (s() instanceof p) {
            this.f4897q = str;
        } else {
            throw new IllegalStateException();
        }
    }

    public final c j() {
        t(o.f4741f);
        return this;
    }

    public final void m(long j3) {
        t(new q((Number) Long.valueOf(j3)));
    }

    public final void n(Boolean bool) {
        if (bool == null) {
            t(o.f4741f);
        } else {
            t(new q(bool));
        }
    }

    public final void o(Number number) {
        if (number == null) {
            t(o.f4741f);
            return;
        }
        if (!this.f248j) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        t(new q(number));
    }

    public final void p(String str) {
        if (str == null) {
            t(o.f4741f);
        } else {
            t(new q(str));
        }
    }

    public final void q(boolean z3) {
        t(new q(Boolean.valueOf(z3)));
    }

    public final m s() {
        ArrayList arrayList = this.f4896p;
        return (m) arrayList.get(arrayList.size() - 1);
    }

    public final void t(m mVar) {
        if (this.f4897q != null) {
            if (!(mVar instanceof o) || this.f251m) {
                p pVar = (p) s();
                String str = this.f4897q;
                pVar.getClass();
                pVar.f4742f.put(str, mVar);
            }
            this.f4897q = null;
        } else if (this.f4896p.isEmpty()) {
            this.f4898r = mVar;
        } else {
            m s3 = s();
            if (s3 instanceof l) {
                l lVar = (l) s3;
                lVar.getClass();
                lVar.f4740f.add(mVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void flush() {
    }
}
