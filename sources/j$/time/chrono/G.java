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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class G extends C0527a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final G f4998d = new G();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    public final m N(int i3) {
        if (i3 == 0) {
            return J.BEFORE_BE;
        }
        if (i3 == 1) {
            return J.BE;
        }
        throw new RuntimeException("Invalid era: " + i3);
    }

    private G() {
    }

    public final String s() {
        return "ThaiBuddhist";
    }

    public final String R() {
        return "buddhist";
    }

    public final C0528b G(int i3, int i4, int i5) {
        return new I(h.g0(i3 - 543, i4, i5));
    }

    public final C0528b A(int i3, int i4) {
        return new I(h.j0(i3 - 543, i4));
    }

    public final C0528b q(long j3) {
        return new I(h.i0(j3));
    }

    public final C0528b L() {
        return new I(h.J(h.f0(b.b())));
    }

    public final C0528b t(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof I) {
            return (I) temporalAccessor;
        }
        return new I(h.J(temporalAccessor));
    }

    public final int w(m mVar, int i3) {
        if (mVar instanceof J) {
            return mVar == J.BE ? i3 : 1 - i3;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    public final List D() {
        return e.a(J.values());
    }

    public final w U(a aVar) {
        int i3 = F.f4997a[aVar.ordinal()];
        if (i3 == 1) {
            w C3 = a.PROLEPTIC_MONTH.C();
            return w.j(C3.e() + 6516, C3.d() + 6516);
        } else if (i3 == 2) {
            w C4 = a.YEAR.C();
            return w.k((-(C4.e() + 543)) + 1, C4.d() + 543);
        } else if (i3 != 3) {
            return aVar.C();
        } else {
            w C5 = a.YEAR.C();
            return w.j(C5.e() + 543, C5.d() + 543);
        }
    }

    public final C0528b P(Map map, y yVar) {
        return (I) super.P(map, yVar);
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
