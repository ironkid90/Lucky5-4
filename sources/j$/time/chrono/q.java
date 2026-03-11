package j$.time.chrono;

import L.k;
import j$.time.d;
import j$.time.h;
import j$.time.l;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.u;
import j$.time.temporal.w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public final class q extends C0530d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a  reason: collision with root package name */
    private final transient o f5033a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f5034b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f5035c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f5036d;

    public final l h() {
        return this.f5033a;
    }

    static q Z(o oVar, int i3, int i4, int i5) {
        return new q(oVar, i3, i4, i5);
    }

    static q a0(o oVar, long j3) {
        return new q(oVar, j3);
    }

    private q(o oVar, int i3, int i4, int i5) {
        oVar.d0(i3, i4, i5);
        this.f5033a = oVar;
        this.f5034b = i3;
        this.f5035c = i4;
        this.f5036d = i5;
    }

    private q(o oVar, long j3) {
        int[] e02 = oVar.e0((int) j3);
        this.f5033a = oVar;
        this.f5034b = e02[0];
        this.f5035c = e02[1];
        this.f5036d = e02[2];
    }

    public final m u() {
        return r.AH;
    }

    public final int W() {
        return this.f5033a.g0(this.f5034b);
    }

    public final w l(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.J(this);
        }
        if (f(rVar)) {
            a aVar = (a) rVar;
            int i3 = p.f5032a[aVar.ordinal()];
            o oVar = this.f5033a;
            if (i3 == 1) {
                return w.j(1, (long) oVar.f0(this.f5034b, this.f5035c));
            }
            if (i3 == 2) {
                return w.j(1, (long) W());
            }
            if (i3 != 3) {
                return oVar.U(aVar);
            }
            return w.j(1, 5);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i3 = p.f5032a[((a) rVar).ordinal()];
        int i4 = this.f5035c;
        int i5 = 1;
        int i6 = this.f5036d;
        int i7 = this.f5034b;
        switch (i3) {
            case 1:
                return (long) i6;
            case k.FLOAT_FIELD_NUMBER:
                return (long) T();
            case k.INTEGER_FIELD_NUMBER:
                return (long) (((i6 - 1) / 7) + 1);
            case k.LONG_FIELD_NUMBER:
                return (long) (((int) Math.floorMod(v() + 3, (long) 7)) + 1);
            case k.STRING_FIELD_NUMBER:
                return (long) (((i6 - 1) % 7) + 1);
            case k.STRING_SET_FIELD_NUMBER:
                return (long) (((T() - 1) % 7) + 1);
            case k.DOUBLE_FIELD_NUMBER:
                return v();
            case k.BYTES_FIELD_NUMBER:
                return (long) (((T() - 1) / 7) + 1);
            case 9:
                return (long) i4;
            case 10:
                return ((((long) i7) * 12) + ((long) i4)) - 1;
            case 11:
                return (long) i7;
            case 12:
                return (long) i7;
            case 13:
                if (i7 <= 1) {
                    i5 = 0;
                }
                return (long) i5;
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    /* renamed from: e0 */
    public final q b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (q) super.b(j3, rVar);
        }
        a aVar = (a) rVar;
        o oVar = this.f5033a;
        oVar.U(aVar).b(j3, aVar);
        int i3 = (int) j3;
        int i4 = p.f5032a[aVar.ordinal()];
        int i5 = this.f5036d;
        int i6 = this.f5035c;
        int i7 = this.f5034b;
        switch (i4) {
            case 1:
                return d0(i7, i6, i3);
            case k.FLOAT_FIELD_NUMBER:
                return C((long) (Math.min(i3, W()) - T()));
            case k.INTEGER_FIELD_NUMBER:
                return C((j3 - g(a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case k.LONG_FIELD_NUMBER:
                return C(j3 - ((long) (((int) Math.floorMod(v() + 3, (long) 7)) + 1)));
            case k.STRING_FIELD_NUMBER:
                return C(j3 - g(a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case k.STRING_SET_FIELD_NUMBER:
                return C(j3 - g(a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case k.DOUBLE_FIELD_NUMBER:
                return new q(oVar, j3);
            case k.BYTES_FIELD_NUMBER:
                return C((j3 - g(a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return d0(i7, i3, i5);
            case 10:
                return J(j3 - (((((long) i7) * 12) + ((long) i6)) - 1));
            case 11:
                if (i7 < 1) {
                    i3 = 1 - i3;
                }
                return d0(i3, i6, i5);
            case 12:
                return d0(i3, i6, i5);
            case 13:
                return d0(1 - i7, i6, i5);
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    private q d0(int i3, int i4, int i5) {
        o oVar = this.f5033a;
        int f02 = oVar.f0(i3, i4);
        if (i5 > f02) {
            i5 = f02;
        }
        return new q(oVar, i3, i4, i5);
    }

    public final m j(h hVar) {
        return (q) super.j(hVar);
    }

    public final C0528b m(n nVar) {
        return (q) super.j(nVar);
    }

    public final C0528b M(j$.time.temporal.q qVar) {
        return (q) super.M(qVar);
    }

    public final long v() {
        return this.f5033a.d0(this.f5034b, this.f5035c, this.f5036d);
    }

    private int T() {
        return this.f5033a.c0(this.f5034b, this.f5035c) + this.f5036d;
    }

    /* access modifiers changed from: package-private */
    public final C0528b S(long j3) {
        if (j3 == 0) {
            return this;
        }
        return d0(Math.addExact(this.f5034b, (int) j3), this.f5035c, this.f5036d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final q J(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j4 = (((long) this.f5034b) * 12) + ((long) (this.f5035c - 1)) + j3;
        return d0(this.f5033a.a0(Math.floorDiv(j4, 12)), ((int) Math.floorMod(j4, 12)) + 1, this.f5036d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final q C(long j3) {
        return new q(this.f5033a, v() + j3);
    }

    public final C0528b d(long j3, u uVar) {
        return (q) super.d(j3, uVar);
    }

    /* renamed from: d  reason: collision with other method in class */
    public final m m4d(long j3, u uVar) {
        return (q) super.d(j3, uVar);
    }

    public final C0528b e(long j3, u uVar) {
        return (q) super.e(j3, uVar);
    }

    /* renamed from: e  reason: collision with other method in class */
    public final m m5e(long j3, u uVar) {
        return (q) super.e(j3, uVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f5034b == qVar.f5034b && this.f5035c == qVar.f5035c && this.f5036d == qVar.f5036d && this.f5033a.equals(qVar.f5033a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5033a.s().hashCode();
        int i3 = this.f5034b;
        return (hashCode ^ (i3 & -2048)) ^ (((i3 << 11) + (this.f5035c << 6)) + this.f5036d);
    }

    public final C0531e K(l lVar) {
        return C0533g.C(this, lVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 6, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f5033a);
        objectOutput.writeInt(i(a.YEAR));
        objectOutput.writeByte(i(a.MONTH_OF_YEAR));
        objectOutput.writeByte(i(a.DAY_OF_MONTH));
    }
}
