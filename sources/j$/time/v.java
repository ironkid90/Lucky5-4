package j$.time;

import j$.time.chrono.C0527a;
import j$.time.chrono.l;
import j$.time.format.p;
import j$.time.format.z;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class v implements m, n, Comparable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5193b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a  reason: collision with root package name */
    private final int f5194a;

    public final int compareTo(Object obj) {
        return this.f5194a - ((v) obj).f5194a;
    }

    static {
        p pVar = new p();
        pVar.l(a.YEAR, 4, 10, z.EXCEEDS_PAD);
        pVar.t();
    }

    public static v r(int i3) {
        a.YEAR.a0((long) i3);
        return new v(i3);
    }

    private v(int i3) {
        this.f5194a = i3;
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            if (rVar == a.YEAR || rVar == a.YEAR_OF_ERA || rVar == a.ERA) {
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
        if (rVar != a.YEAR_OF_ERA) {
            return super.l(rVar);
        }
        return w.j(1, this.f5194a <= 0 ? 1000000000 : 999999999);
    }

    public final int i(r rVar) {
        return l(rVar).a(g(rVar), rVar);
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i3 = u.f5191a[((a) rVar).ordinal()];
        int i4 = this.f5194a;
        int i5 = 1;
        if (i3 == 1) {
            if (i4 < 1) {
                i4 = 1 - i4;
            }
            return (long) i4;
        } else if (i3 == 2) {
            return (long) i4;
        } else {
            if (i3 == 3) {
                if (i4 < 1) {
                    i5 = 0;
                }
                return (long) i5;
            }
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    public final m j(h hVar) {
        return (v) hVar.c(this);
    }

    /* renamed from: S */
    public final v b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (v) rVar.p(this, j3);
        }
        a aVar = (a) rVar;
        aVar.a0(j3);
        int i3 = u.f5191a[aVar.ordinal()];
        int i4 = this.f5194a;
        if (i3 == 1) {
            if (i4 < 1) {
                j3 = 1 - j3;
            }
            return r((int) j3);
        } else if (i3 == 2) {
            return r((int) j3);
        } else {
            if (i3 == 3) {
                return g(a.ERA) == j3 ? this : r(1 - i4);
            }
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    /* renamed from: C */
    public final v d(long j3, u uVar) {
        if (!(uVar instanceof b)) {
            return (v) uVar.p(this, j3);
        }
        int i3 = u.f5192b[((b) uVar).ordinal()];
        if (i3 == 1) {
            return J(j3);
        }
        if (i3 == 2) {
            return J(Math.multiplyExact(j3, (long) 10));
        }
        if (i3 == 3) {
            return J(Math.multiplyExact(j3, (long) 100));
        }
        if (i3 == 4) {
            return J(Math.multiplyExact(j3, (long) 1000));
        }
        if (i3 == 5) {
            a aVar = a.ERA;
            return b(Math.addExact(g(aVar), j3), aVar);
        }
        throw new RuntimeException("Unsupported unit: " + uVar);
    }

    public final v J(long j3) {
        return j3 == 0 ? this : r(a.YEAR.Z(((long) this.f5194a) + j3));
    }

    public final m e(long j3, u uVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1, uVar) : d(-j3, uVar);
    }

    public final Object a(t tVar) {
        if (tVar == s.a()) {
            return j$.time.chrono.s.f5038d;
        }
        if (tVar == s.e()) {
            return b.YEARS;
        }
        return super.a(tVar);
    }

    public final m c(m mVar) {
        if (((C0527a) l.F(mVar)).equals(j$.time.chrono.s.f5038d)) {
            return mVar.b((long) this.f5194a, a.YEAR);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        if (this.f5194a == ((v) obj).f5194a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5194a;
    }

    public final String toString() {
        return Integer.toString(this.f5194a);
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void T(DataOutput dataOutput) {
        dataOutput.writeInt(this.f5194a);
    }
}
