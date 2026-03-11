package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.w;

public enum DayOfWeek implements TemporalAccessor, n {
    ;
    

    /* renamed from: a  reason: collision with root package name */
    private static final DayOfWeek[] f4965a = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r1v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r2v2, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r3v2, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r4v2, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r5v2, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r6v2, types: [j$.time.DayOfWeek, java.lang.Enum] */
    static {
        f4965a = values();
    }

    public static DayOfWeek r(int i3) {
        if (i3 >= 1 && i3 <= 7) {
            return f4965a[i3 - 1];
        }
        throw new RuntimeException("Invalid value for DayOfWeek: " + i3);
    }

    public final int p() {
        return ordinal() + 1;
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            if (rVar == a.DAY_OF_WEEK) {
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
        if (rVar == a.DAY_OF_WEEK) {
            return rVar.C();
        }
        return super.l(rVar);
    }

    public final int i(r rVar) {
        if (rVar == a.DAY_OF_WEEK) {
            return p();
        }
        return super.i(rVar);
    }

    public final long g(r rVar) {
        if (rVar == a.DAY_OF_WEEK) {
            return (long) p();
        }
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final Object a(t tVar) {
        if (tVar == s.e()) {
            return b.DAYS;
        }
        return super.a(tVar);
    }

    public final m c(m mVar) {
        return mVar.b((long) p(), a.DAY_OF_WEEK);
    }
}
