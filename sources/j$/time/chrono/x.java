package j$.time.chrono;

import L.k;
import j$.time.d;
import j$.time.h;
import j$.time.l;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.u;
import j$.time.temporal.w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public final class x extends C0530d {

    /* renamed from: d  reason: collision with root package name */
    static final h f5043d = h.g0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a  reason: collision with root package name */
    private final transient h f5044a;

    /* renamed from: b  reason: collision with root package name */
    private transient y f5045b;

    /* renamed from: c  reason: collision with root package name */
    private transient int f5046c;

    public final m u() {
        return this.f5045b;
    }

    x(h hVar) {
        if (!hVar.c0(f5043d)) {
            y q3 = y.q(hVar);
            this.f5045b = q3;
            this.f5046c = (hVar.b0() - q3.s().b0()) + 1;
            this.f5044a = hVar;
            return;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
    }

    x(y yVar, int i3, h hVar) {
        if (!hVar.c0(f5043d)) {
            this.f5045b = yVar;
            this.f5046c = i3;
            this.f5044a = hVar;
            return;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
    }

    public final l h() {
        return v.f5041d;
    }

    public final int hashCode() {
        v.f5041d.getClass();
        return this.f5044a.hashCode() ^ -688086063;
    }

    public final y T() {
        return this.f5045b;
    }

    public final boolean f(r rVar) {
        if (rVar == a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == a.ALIGNED_WEEK_OF_MONTH || rVar == a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (rVar instanceof a) {
            return ((a) rVar).T();
        }
        if (rVar == null || !rVar.W(this)) {
            return false;
        }
        return true;
    }

    public final w l(r rVar) {
        int i3;
        if (!(rVar instanceof a)) {
            return rVar.J(this);
        }
        if (f(rVar)) {
            a aVar = (a) rVar;
            int i4 = w.f5042a[aVar.ordinal()];
            h hVar = this.f5044a;
            if (i4 == 1) {
                return w.j(1, (long) hVar.e0());
            }
            y yVar = this.f5045b;
            if (i4 == 2) {
                y t3 = yVar.t();
                if (t3 == null || t3.s().b0() != hVar.b0()) {
                    i3 = hVar.d0() ? 366 : 365;
                } else {
                    i3 = t3.s().Z() - 1;
                }
                if (this.f5046c == 1) {
                    i3 -= yVar.s().Z() - 1;
                }
                return w.j(1, (long) i3);
            } else if (i4 != 3) {
                return v.f5041d.U(aVar);
            } else {
                int b02 = yVar.s().b0();
                y t4 = yVar.t();
                if (t4 != null) {
                    return w.j(1, (long) ((t4.s().b0() - b02) + 1));
                }
                return w.j(1, (long) (999999999 - b02));
            }
        } else {
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i3 = w.f5042a[((a) rVar).ordinal()];
        int i4 = this.f5046c;
        y yVar = this.f5045b;
        h hVar = this.f5044a;
        switch (i3) {
            case k.FLOAT_FIELD_NUMBER:
                if (i4 == 1) {
                    return (long) ((hVar.Z() - yVar.s().Z()) + 1);
                }
                return (long) hVar.Z();
            case k.INTEGER_FIELD_NUMBER:
                return (long) i4;
            case k.LONG_FIELD_NUMBER:
            case k.STRING_FIELD_NUMBER:
            case k.STRING_SET_FIELD_NUMBER:
            case k.DOUBLE_FIELD_NUMBER:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
            case k.BYTES_FIELD_NUMBER:
                return (long) yVar.p();
            default:
                return hVar.g(rVar);
        }
    }

    /* renamed from: Z */
    public final x b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (x) super.b(j3, rVar);
        }
        a aVar = (a) rVar;
        if (g(aVar) == j3) {
            return this;
        }
        int[] iArr = w.f5042a;
        int i3 = iArr[aVar.ordinal()];
        h hVar = this.f5044a;
        if (i3 == 3 || i3 == 8 || i3 == 9) {
            v vVar = v.f5041d;
            int a2 = vVar.U(aVar).a(j3, aVar);
            int i4 = iArr[aVar.ordinal()];
            if (i4 == 3) {
                return a0(hVar.t0(vVar.w(this.f5045b, a2)));
            }
            if (i4 == 8) {
                return a0(hVar.t0(vVar.w(y.w(a2), this.f5046c)));
            }
            if (i4 == 9) {
                return a0(hVar.t0(a2));
            }
        }
        return a0(hVar.b(j3, rVar));
    }

    public final x b0(p pVar) {
        return (x) super.j(pVar);
    }

    public final m j(h hVar) {
        return (x) super.j(hVar);
    }

    public final C0528b m(n nVar) {
        return (x) super.j(nVar);
    }

    public final C0528b M(q qVar) {
        return (x) super.M(qVar);
    }

    public final C0531e K(l lVar) {
        return C0533g.C(this, lVar);
    }

    /* access modifiers changed from: package-private */
    public final C0528b S(long j3) {
        return a0(this.f5044a.o0(j3));
    }

    /* access modifiers changed from: package-private */
    public final C0528b J(long j3) {
        return a0(this.f5044a.m0(j3));
    }

    /* access modifiers changed from: package-private */
    public final C0528b C(long j3) {
        return a0(this.f5044a.l0(j3));
    }

    public final x W(long j3, b bVar) {
        return (x) super.d(j3, (u) bVar);
    }

    public final C0528b d(long j3, u uVar) {
        return (x) super.d(j3, uVar);
    }

    /* renamed from: d  reason: collision with other method in class */
    public final m m6d(long j3, u uVar) {
        return (x) super.d(j3, uVar);
    }

    public final C0528b e(long j3, u uVar) {
        return (x) super.e(j3, uVar);
    }

    /* renamed from: e  reason: collision with other method in class */
    public final m m7e(long j3, u uVar) {
        return (x) super.e(j3, uVar);
    }

    private x a0(h hVar) {
        return hVar.equals(this.f5044a) ? this : new x(hVar);
    }

    public final long v() {
        return this.f5044a.v();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.f5044a.equals(((x) obj).f5044a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 4, this);
    }
}
