package j$.time.chrono;

import L.k;
import j$.time.d;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.u;
import java.io.Serializable;

/* renamed from: j$.time.chrono.d  reason: case insensitive filesystem */
abstract class C0530d implements C0528b, m, n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* access modifiers changed from: package-private */
    public abstract C0528b C(long j3);

    /* access modifiers changed from: package-private */
    public abstract C0528b J(long j3);

    /* access modifiers changed from: package-private */
    public abstract C0528b S(long j3);

    public /* bridge */ /* synthetic */ m e(long j3, u uVar) {
        return e(j3, uVar);
    }

    static C0528b r(l lVar, m mVar) {
        C0528b bVar = (C0528b) mVar;
        C0527a aVar = (C0527a) lVar;
        if (aVar.equals(bVar.h())) {
            return bVar;
        }
        String s3 = aVar.s();
        String s4 = bVar.h().s();
        throw new ClassCastException("Chronology mismatch, expected: " + s3 + ", actual: " + s4);
    }

    C0530d() {
    }

    public C0528b d(long j3, u uVar) {
        boolean z3 = uVar instanceof b;
        if (z3) {
            switch (C0529c.f5005a[((b) uVar).ordinal()]) {
                case 1:
                    return C(j3);
                case k.FLOAT_FIELD_NUMBER:
                    return C(Math.multiplyExact(j3, (long) 7));
                case k.INTEGER_FIELD_NUMBER:
                    return J(j3);
                case k.LONG_FIELD_NUMBER:
                    return S(j3);
                case k.STRING_FIELD_NUMBER:
                    return S(Math.multiplyExact(j3, (long) 10));
                case k.STRING_SET_FIELD_NUMBER:
                    return S(Math.multiplyExact(j3, (long) 100));
                case k.DOUBLE_FIELD_NUMBER:
                    return S(Math.multiplyExact(j3, (long) 1000));
                case k.BYTES_FIELD_NUMBER:
                    a aVar = a.ERA;
                    return b(Math.addExact(g(aVar), j3), (r) aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + uVar);
            }
        } else if (!z3) {
            return r(h(), uVar.p(this, j3));
        } else {
            throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0528b)) {
            return false;
        }
        if (compareTo((C0528b) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long v = v();
        return ((int) (v ^ (v >>> 32))) ^ ((C0527a) h()).hashCode();
    }

    /* renamed from: m */
    public C0528b j(n nVar) {
        return r(h(), nVar.c(this));
    }

    public String toString() {
        long g2 = g(a.YEAR_OF_ERA);
        long g3 = g(a.MONTH_OF_YEAR);
        long g4 = g(a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((C0527a) h()).s());
        sb.append(" ");
        sb.append(u());
        sb.append(" ");
        sb.append(g2);
        String str = "-";
        sb.append(g3 < 10 ? "-0" : str);
        sb.append(g3);
        if (g4 < 10) {
            str = "-0";
        }
        sb.append(str);
        sb.append(g4);
        return sb.toString();
    }

    public C0528b b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return r(h(), rVar.p(this, j3));
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public C0528b M(q qVar) {
        return r(h(), qVar.p(this));
    }
}
