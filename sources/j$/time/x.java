package j$.time;

import L.k;
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
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class x implements m, n, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a  reason: collision with root package name */
    private final int f5197a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5198b;

    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        int i3 = this.f5197a - xVar.f5197a;
        return i3 == 0 ? this.f5198b - xVar.f5198b : i3;
    }

    static {
        p pVar = new p();
        pVar.l(a.YEAR, 4, 10, z.EXCEEDS_PAD);
        pVar.e('-');
        pVar.k(a.MONTH_OF_YEAR, 2);
        pVar.t();
    }

    private x(int i3, int i4) {
        this.f5197a = i3;
        this.f5198b = i4;
    }

    private x W(int i3, int i4) {
        if (this.f5197a == i3 && this.f5198b == i4) {
            return this;
        }
        return new x(i3, i4);
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            if (rVar == a.YEAR || rVar == a.MONTH_OF_YEAR || rVar == a.PROLEPTIC_MONTH || rVar == a.YEAR_OF_ERA || rVar == a.ERA) {
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
        return w.j(1, this.f5197a <= 0 ? 1000000000 : 999999999);
    }

    public final int i(r rVar) {
        return l(rVar).a(g(rVar), rVar);
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i3 = w.f5195a[((a) rVar).ordinal()];
        int i4 = 1;
        if (i3 == 1) {
            return (long) this.f5198b;
        }
        if (i3 == 2) {
            return r();
        }
        int i5 = this.f5197a;
        if (i3 == 3) {
            if (i5 < 1) {
                i5 = 1 - i5;
            }
            return (long) i5;
        } else if (i3 == 4) {
            return (long) i5;
        } else {
            if (i3 == 5) {
                if (i5 < 1) {
                    i4 = 0;
                }
                return (long) i4;
            }
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    private long r() {
        return ((((long) this.f5197a) * 12) + ((long) this.f5198b)) - 1;
    }

    public final m j(h hVar) {
        return (x) hVar.c(this);
    }

    /* renamed from: Z */
    public final x b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (x) rVar.p(this, j3);
        }
        a aVar = (a) rVar;
        aVar.a0(j3);
        int i3 = w.f5195a[aVar.ordinal()];
        int i4 = this.f5197a;
        if (i3 == 1) {
            int i5 = (int) j3;
            a.MONTH_OF_YEAR.a0((long) i5);
            return W(i4, i5);
        } else if (i3 == 2) {
            return J(j3 - r());
        } else {
            int i6 = this.f5198b;
            if (i3 == 3) {
                if (i4 < 1) {
                    j3 = 1 - j3;
                }
                int i7 = (int) j3;
                a.YEAR.a0((long) i7);
                return W(i7, i6);
            } else if (i3 == 4) {
                int i8 = (int) j3;
                a.YEAR.a0((long) i8);
                return W(i8, i6);
            } else if (i3 != 5) {
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
            } else if (g(a.ERA) == j3) {
                return this;
            } else {
                int i9 = 1 - i4;
                a.YEAR.a0((long) i9);
                return W(i9, i6);
            }
        }
    }

    /* renamed from: C */
    public final x d(long j3, u uVar) {
        if (!(uVar instanceof b)) {
            return (x) uVar.p(this, j3);
        }
        switch (w.f5196b[((b) uVar).ordinal()]) {
            case 1:
                return J(j3);
            case k.FLOAT_FIELD_NUMBER:
                return S(j3);
            case k.INTEGER_FIELD_NUMBER:
                return S(Math.multiplyExact(j3, (long) 10));
            case k.LONG_FIELD_NUMBER:
                return S(Math.multiplyExact(j3, (long) 100));
            case k.STRING_FIELD_NUMBER:
                return S(Math.multiplyExact(j3, (long) 1000));
            case k.STRING_SET_FIELD_NUMBER:
                a aVar = a.ERA;
                return b(Math.addExact(g(aVar), j3), aVar);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    public final x S(long j3) {
        if (j3 == 0) {
            return this;
        }
        return W(a.YEAR.Z(((long) this.f5197a) + j3), this.f5198b);
    }

    public final x J(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j4 = (((long) this.f5197a) * 12) + ((long) (this.f5198b - 1)) + j3;
        long j5 = (long) 12;
        return W(a.YEAR.Z(Math.floorDiv(j4, j5)), ((int) Math.floorMod(j4, j5)) + 1);
    }

    public final m e(long j3, u uVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1, uVar) : d(-j3, uVar);
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
            return mVar.b(r(), a.PROLEPTIC_MONTH);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f5197a == xVar.f5197a && this.f5198b == xVar.f5198b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5198b << 27) ^ this.f5197a;
    }

    public final String toString() {
        int i3 = this.f5197a;
        int abs = Math.abs(i3);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i3);
        } else if (i3 < 0) {
            sb.append(i3 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i3 + 10000);
            sb.deleteCharAt(0);
        }
        int i4 = this.f5198b;
        sb.append(i4 < 10 ? "-0" : "-");
        sb.append(i4);
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void a0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f5197a);
        dataOutput.writeByte(this.f5198b);
    }

    static x T(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        byte readByte = objectInput.readByte();
        a.YEAR.a0((long) readInt);
        a.MONTH_OF_YEAR.a0((long) readByte);
        return new x(readInt, readByte);
    }
}
