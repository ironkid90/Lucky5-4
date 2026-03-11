package j$.time.chrono;

import L.k;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.h;
import j$.time.l;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.u;
import j$.time.temporal.w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: j$.time.chrono.g  reason: case insensitive filesystem */
final class C0533g implements C0531e, m, n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a  reason: collision with root package name */
    private final transient C0528b f5007a;

    /* renamed from: b  reason: collision with root package name */
    private final transient l f5008b;

    static C0533g C(C0528b bVar, l lVar) {
        return new C0533g(bVar, lVar);
    }

    static C0533g r(l lVar, m mVar) {
        C0533g gVar = (C0533g) mVar;
        C0527a aVar = (C0527a) lVar;
        if (aVar.equals(gVar.h())) {
            return gVar;
        }
        String s3 = aVar.s();
        String s4 = gVar.h().s();
        throw new ClassCastException("Chronology mismatch, required: " + s3 + ", actual: " + s4);
    }

    private C0533g(C0528b bVar, l lVar) {
        Objects.requireNonNull(lVar, "time");
        this.f5007a = bVar;
        this.f5008b = lVar;
    }

    private C0533g Z(m mVar, l lVar) {
        C0528b bVar = this.f5007a;
        if (bVar == mVar && this.f5008b == lVar) {
            return this;
        }
        return new C0533g(C0530d.r(bVar.h(), mVar), lVar);
    }

    public final C0528b o() {
        return this.f5007a;
    }

    public final l n() {
        return this.f5008b;
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            a aVar = (a) rVar;
            if (aVar.T() || aVar.b0()) {
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
        if (!(rVar instanceof a)) {
            return rVar.J(this);
        }
        return (((a) rVar).b0() ? this.f5008b : this.f5007a).l(rVar);
    }

    public final int i(r rVar) {
        if (rVar instanceof a) {
            return ((a) rVar).b0() ? this.f5008b.i(rVar) : this.f5007a.i(rVar);
        }
        return l(rVar).a(g(rVar), rVar);
    }

    public final long g(r rVar) {
        if (rVar instanceof a) {
            return ((a) rVar).b0() ? this.f5008b.g(rVar) : this.f5007a.g(rVar);
        }
        return rVar.r(this);
    }

    public final m j(h hVar) {
        return Z(hVar, this.f5008b);
    }

    /* renamed from: W */
    public final C0533g b(long j3, r rVar) {
        boolean z3 = rVar instanceof a;
        C0528b bVar = this.f5007a;
        if (!z3) {
            return r(bVar.h(), rVar.p(this, j3));
        }
        boolean b02 = ((a) rVar).b0();
        l lVar = this.f5008b;
        if (b02) {
            return Z(bVar, lVar.b(j3, rVar));
        }
        return Z(bVar.b(j3, rVar), lVar);
    }

    /* renamed from: J */
    public final C0533g d(long j3, u uVar) {
        long j4 = j3;
        u uVar2 = uVar;
        boolean z3 = uVar2 instanceof b;
        C0528b bVar = this.f5007a;
        if (!z3) {
            return r(bVar.h(), uVar2.p(this, j4));
        }
        int i3 = C0532f.f5006a[((b) uVar2).ordinal()];
        l lVar = this.f5008b;
        switch (i3) {
            case 1:
                return T(this.f5007a, 0, 0, 0, j3);
            case k.FLOAT_FIELD_NUMBER:
                C0533g Z = Z(bVar.d(j4 / 86400000000L, b.DAYS), lVar);
                return Z.T(Z.f5007a, 0, 0, 0, (j4 % 86400000000L) * 1000);
            case k.INTEGER_FIELD_NUMBER:
                C0533g Z2 = Z(bVar.d(j4 / 86400000, b.DAYS), lVar);
                return Z2.T(Z2.f5007a, 0, 0, 0, (j4 % 86400000) * 1000000);
            case k.LONG_FIELD_NUMBER:
                return S(j3);
            case k.STRING_FIELD_NUMBER:
                return T(this.f5007a, 0, j3, 0, 0);
            case k.STRING_SET_FIELD_NUMBER:
                return T(this.f5007a, j3, 0, 0, 0);
            case k.DOUBLE_FIELD_NUMBER:
                C0533g Z3 = Z(bVar.d(j4 / 256, b.DAYS), lVar);
                return Z3.T(Z3.f5007a, (j4 % 256) * 12, 0, 0, 0);
            default:
                return Z(bVar.d(j4, uVar2), lVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final C0533g S(long j3) {
        return T(this.f5007a, 0, 0, j3, 0);
    }

    private C0533g T(C0528b bVar, long j3, long j4, long j5, long j6) {
        C0528b bVar2 = bVar;
        int i3 = ((j3 | j4 | j5 | j6) > 0 ? 1 : ((j3 | j4 | j5 | j6) == 0 ? 0 : -1));
        l lVar = this.f5008b;
        if (i3 == 0) {
            return Z(bVar2, lVar);
        }
        long j7 = j4 / 1440;
        long j8 = j3 / 24;
        long j9 = (j4 % 1440) * 60000000000L;
        long j10 = ((j3 % 24) * 3600000000000L) + j9 + ((j5 % 86400) * 1000000000) + (j6 % 86400000000000L);
        long l02 = lVar.l0();
        long j11 = j10 + l02;
        long floorDiv = Math.floorDiv(j11, 86400000000000L) + j8 + j7 + (j5 / 86400) + (j6 / 86400000000000L);
        long floorMod = Math.floorMod(j11, 86400000000000L);
        if (floorMod != l02) {
            lVar = l.d0(floorMod);
        }
        return Z(bVar2.d(floorDiv, b.DAYS), lVar);
    }

    public final ChronoZonedDateTime H(ZoneId zoneId) {
        return k.C(zoneId, (ZoneOffset) null, this);
    }

    private Object writeReplace() {
        return new E((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f5007a);
        objectOutput.writeObject(this.f5008b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0531e)) {
            return false;
        }
        if (compareTo((C0531e) obj) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5007a.hashCode() ^ this.f5008b.hashCode();
    }

    public final String toString() {
        String bVar = this.f5007a.toString();
        String lVar = this.f5008b.toString();
        return bVar + "T" + lVar;
    }
}
