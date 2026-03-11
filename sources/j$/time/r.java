package j$.time;

import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

public final class r implements m, n, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a  reason: collision with root package name */
    private final l f5151a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f5152b;

    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        ZoneOffset zoneOffset = rVar.f5152b;
        ZoneOffset zoneOffset2 = this.f5152b;
        boolean equals = zoneOffset2.equals(zoneOffset);
        l lVar = rVar.f5151a;
        l lVar2 = this.f5151a;
        if (equals) {
            return lVar2.compareTo(lVar);
        }
        int compare = Long.compare(lVar2.l0() - (((long) zoneOffset2.Z()) * 1000000000), lVar.l0() - (((long) rVar.f5152b.Z()) * 1000000000));
        return compare == 0 ? lVar2.compareTo(lVar) : compare;
    }

    static {
        l lVar = l.f5136e;
        ZoneOffset zoneOffset = ZoneOffset.f4983g;
        lVar.getClass();
        r(lVar, zoneOffset);
        l lVar2 = l.f5137f;
        ZoneOffset zoneOffset2 = ZoneOffset.f4982f;
        lVar2.getClass();
        r(lVar2, zoneOffset2);
    }

    public static r r(l lVar, ZoneOffset zoneOffset) {
        return new r(lVar, zoneOffset);
    }

    private r(l lVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(lVar, "time");
        this.f5151a = lVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f5152b = zoneOffset;
    }

    private r S(l lVar, ZoneOffset zoneOffset) {
        if (this.f5151a != lVar || !this.f5152b.equals(zoneOffset)) {
            return new r(lVar, zoneOffset);
        }
        return this;
    }

    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar instanceof a) {
            if (((a) rVar).b0() || rVar == a.OFFSET_SECONDS) {
                return true;
            }
            return false;
        } else if (rVar == null || !rVar.W(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final w l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.J(this);
        }
        if (rVar == a.OFFSET_SECONDS) {
            return ((a) rVar).C();
        }
        return this.f5151a.l(rVar);
    }

    public final long g(j$.time.temporal.r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        if (rVar == a.OFFSET_SECONDS) {
            return (long) this.f5152b.Z();
        }
        return this.f5151a.g(rVar);
    }

    public final m j(h hVar) {
        return (r) hVar.c(this);
    }

    public final m b(long j3, j$.time.temporal.r rVar) {
        if (!(rVar instanceof a)) {
            return (r) rVar.p(this, j3);
        }
        a aVar = a.OFFSET_SECONDS;
        l lVar = this.f5151a;
        if (rVar == aVar) {
            return S(lVar, ZoneOffset.c0(((a) rVar).Z(j3)));
        }
        return S(lVar.b(j3, rVar), this.f5152b);
    }

    /* renamed from: C */
    public final r d(long j3, u uVar) {
        if (uVar instanceof b) {
            return S(this.f5151a.d(j3, uVar), this.f5152b);
        }
        return (r) uVar.p(this, j3);
    }

    public final m e(long j3, u uVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1, uVar) : d(-j3, uVar);
    }

    public final Object a(t tVar) {
        if (tVar == s.d() || tVar == s.f()) {
            return this.f5152b;
        }
        boolean z3 = false;
        boolean z4 = tVar == s.g();
        if (tVar == s.a()) {
            z3 = true;
        }
        if ((z4 || z3) || tVar == s.b()) {
            return null;
        }
        if (tVar == s.c()) {
            return this.f5151a;
        }
        if (tVar == s.e()) {
            return b.NANOS;
        }
        return tVar.j(this);
    }

    public final m c(m mVar) {
        return mVar.b(this.f5151a.l0(), a.NANO_OF_DAY).b((long) this.f5152b.Z(), a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f5151a.equals(rVar.f5151a) || !this.f5152b.equals(rVar.f5152b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5151a.hashCode() ^ this.f5152b.hashCode();
    }

    public final String toString() {
        String lVar = this.f5151a.toString();
        String zoneOffset = this.f5152b.toString();
        return lVar + zoneOffset;
    }

    private Object writeReplace() {
        return new t((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f5151a.p0(objectOutput);
        this.f5152b.f0(objectOutput);
    }

    static r J(ObjectInput objectInput) {
        return new r(l.k0(objectInput), ZoneOffset.e0(objectInput));
    }
}
