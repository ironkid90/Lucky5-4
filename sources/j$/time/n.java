package j$.time;

import L.k;
import j$.time.chrono.C0527a;
import j$.time.chrono.l;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.w;

public enum n implements TemporalAccessor, j$.time.temporal.n {
    ;
    

    /* renamed from: a  reason: collision with root package name */
    private static final n[] f5145a = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.Enum, j$.time.n] */
    static {
        f5145a = values();
    }

    public static n S(int i3) {
        if (i3 >= 1 && i3 <= 12) {
            return f5145a[i3 - 1];
        }
        throw new RuntimeException("Invalid value for MonthOfYear: " + i3);
    }

    public final int p() {
        return ordinal() + 1;
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            if (rVar == a.MONTH_OF_YEAR) {
                return true;
            }
            return false;
        } else if (rVar == null || !rVar.W(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final w l(r rVar) {
        if (rVar == a.MONTH_OF_YEAR) {
            return rVar.C();
        }
        return super.l(rVar);
    }

    public final int i(r rVar) {
        if (rVar == a.MONTH_OF_YEAR) {
            return p();
        }
        return super.i(rVar);
    }

    public final long g(r rVar) {
        if (rVar == a.MONTH_OF_YEAR) {
            return (long) p();
        }
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final n T() {
        int i3 = ((int) 1) + 12;
        return f5145a[(i3 + ordinal()) % 12];
    }

    public final int C(boolean z3) {
        int i3 = m.f5144a[ordinal()];
        return i3 != 1 ? (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31 : z3 ? 29 : 28;
    }

    public final int J() {
        int i3 = m.f5144a[ordinal()];
        if (i3 != 1) {
            return (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int r(boolean z3) {
        switch (m.f5144a[ordinal()]) {
            case 1:
                return 32;
            case k.FLOAT_FIELD_NUMBER:
                return (z3 ? 1 : 0) + true;
            case k.INTEGER_FIELD_NUMBER:
                return z3 + true;
            case k.LONG_FIELD_NUMBER:
                return z3 + true;
            case k.STRING_FIELD_NUMBER:
                return z3 + true;
            case k.STRING_SET_FIELD_NUMBER:
                return 1;
            case k.DOUBLE_FIELD_NUMBER:
                return z3 + true;
            case k.BYTES_FIELD_NUMBER:
                return z3 + true;
            case 9:
                return z3 + true;
            case 10:
                return z3 + true;
            case 11:
                return z3 + true;
            default:
                return z3 + true;
        }
    }

    public final Object a(t tVar) {
        if (tVar == s.a()) {
            return j$.time.chrono.s.f5038d;
        }
        if (tVar == s.e()) {
            return b.MONTHS;
        }
        return super.a(tVar);
    }

    public final m c(m mVar) {
        if (((C0527a) l.F(mVar)).equals(j$.time.chrono.s.f5038d)) {
            return mVar.b((long) p(), a.MONTH_OF_YEAR);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }
}
