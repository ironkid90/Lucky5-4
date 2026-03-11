package j$.time;

import j$.time.chrono.C0527a;
import j$.time.chrono.l;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.w;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class p implements TemporalAccessor, n, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a  reason: collision with root package name */
    private final int f5148a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5149b;

    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int i3 = this.f5148a - pVar.f5148a;
        return i3 == 0 ? this.f5149b - pVar.f5149b : i3;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.f("--");
        pVar.k(a.MONTH_OF_YEAR, 2);
        pVar.e('-');
        pVar.k(a.DAY_OF_MONTH, 2);
        pVar.t();
    }

    private p(int i3, int i4) {
        this.f5148a = i3;
        this.f5149b = i4;
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            if (rVar == a.MONTH_OF_YEAR || rVar == a.DAY_OF_MONTH) {
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
        if (rVar != a.DAY_OF_MONTH) {
            return super.l(rVar);
        }
        int i3 = this.f5148a;
        n S3 = n.S(i3);
        S3.getClass();
        int i4 = m.f5144a[S3.ordinal()];
        return w.k((long) (i4 != 1 ? (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? 30 : 31 : 28), (long) n.S(i3).J());
    }

    public final int i(r rVar) {
        return l(rVar).a(g(rVar), rVar);
    }

    public final long g(r rVar) {
        int i3;
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i4 = o.f5147a[((a) rVar).ordinal()];
        if (i4 == 1) {
            i3 = this.f5149b;
        } else if (i4 == 2) {
            i3 = this.f5148a;
        } else {
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
        return (long) i3;
    }

    public final Object a(t tVar) {
        if (tVar == s.a()) {
            return j$.time.chrono.s.f5038d;
        }
        return super.a(tVar);
    }

    public final m c(m mVar) {
        if (((C0527a) l.F(mVar)).equals(j$.time.chrono.s.f5038d)) {
            m b3 = mVar.b((long) this.f5148a, a.MONTH_OF_YEAR);
            a aVar = a.DAY_OF_MONTH;
            return b3.b(Math.min(b3.l(aVar).d(), (long) this.f5149b), aVar);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f5148a == pVar.f5148a && this.f5149b == pVar.f5149b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5148a << 6) + this.f5149b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i3 = this.f5148a;
        sb.append(i3 < 10 ? "0" : "");
        sb.append(i3);
        int i4 = this.f5149b;
        sb.append(i4 < 10 ? "-0" : "-");
        sb.append(i4);
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void C(DataOutput dataOutput) {
        dataOutput.writeByte(this.f5148a);
        dataOutput.writeByte(this.f5149b);
    }

    static p r(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        byte readByte2 = objectInput.readByte();
        n S3 = n.S(readByte);
        Objects.requireNonNull(S3, "month");
        a.DAY_OF_MONTH.a0((long) readByte2);
        if (readByte2 <= S3.J()) {
            return new p(S3.p(), readByte2);
        }
        String name = S3.name();
        throw new RuntimeException("Illegal value for DayOfMonth field, value " + readByte2 + " is not valid for month " + name);
    }
}
