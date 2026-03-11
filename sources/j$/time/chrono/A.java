package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.b;
import j$.time.e;
import j$.time.format.y;
import j$.time.h;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class A extends C0527a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final A f4991d = new A();
    private static final long serialVersionUID = 1039765215346859963L;

    private A() {
    }

    public final String s() {
        return "Minguo";
    }

    public final m N(int i3) {
        if (i3 == 0) {
            return D.BEFORE_ROC;
        }
        if (i3 == 1) {
            return D.ROC;
        }
        throw new RuntimeException("Invalid era: " + i3);
    }

    public final String R() {
        return "roc";
    }

    public final C0528b G(int i3, int i4, int i5) {
        return new C(h.g0(i3 + 1911, i4, i5));
    }

    public final C0528b A(int i3, int i4) {
        return new C(h.j0(i3 + 1911, i4));
    }

    public final C0528b q(long j3) {
        return new C(h.i0(j3));
    }

    public final C0528b L() {
        return new C(h.J(h.f0(b.b())));
    }

    public final C0528b t(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C) {
            return (C) temporalAccessor;
        }
        return new C(h.J(temporalAccessor));
    }

    public final int w(m mVar, int i3) {
        if (mVar instanceof D) {
            return mVar == D.ROC ? i3 : 1 - i3;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    public final List D() {
        return e.a(D.values());
    }

    public final w U(a aVar) {
        int i3 = z.f5052a[aVar.ordinal()];
        if (i3 == 1) {
            w C3 = a.PROLEPTIC_MONTH.C();
            return w.j(C3.e() - 22932, C3.d() - 22932);
        } else if (i3 == 2) {
            w C4 = a.YEAR.C();
            return w.k(C4.d() - 1911, (-C4.e()) + 1912);
        } else if (i3 != 3) {
            return aVar.C();
        } else {
            w C5 = a.YEAR.C();
            return w.j(C5.e() - 1911, C5.d() - 1911);
        }
    }

    public final C0528b P(Map map, y yVar) {
        return (C) super.P(map, yVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return k.J(this, instant, zoneId);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new E((byte) 1, this);
    }
}
