package j$.time;

import L.k;
import j$.time.chrono.C0528b;
import j$.time.chrono.C0531e;
import j$.time.chrono.l;
import j$.time.chrono.s;
import j$.time.chrono.t;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.u;
import j$.time.temporal.w;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class h implements m, n, C0528b, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final h f5128d = g0(-999999999, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    public static final h f5129e = g0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a  reason: collision with root package name */
    private final int f5130a;

    /* renamed from: b  reason: collision with root package name */
    private final short f5131b;

    /* renamed from: c  reason: collision with root package name */
    private final short f5132c;

    static {
        g0(1970, 1, 1);
    }

    public static h h0(int i3, n nVar, int i4) {
        a.YEAR.a0((long) i3);
        a.DAY_OF_MONTH.a0((long) i4);
        return C(i3, nVar.p(), i4);
    }

    public static h g0(int i3, int i4, int i5) {
        a.YEAR.a0((long) i3);
        a.MONTH_OF_YEAR.a0((long) i4);
        a.DAY_OF_MONTH.a0((long) i5);
        return C(i3, i4, i5);
    }

    public static h j0(int i3, int i4) {
        long j3 = (long) i3;
        a.YEAR.a0(j3);
        a.DAY_OF_YEAR.a0((long) i4);
        s.f5038d.getClass();
        boolean Z = s.Z(j3);
        if (i4 != 366 || Z) {
            n S3 = n.S(((i4 - 1) / 31) + 1);
            if (i4 > (S3.C(Z) + S3.r(Z)) - 1) {
                S3 = S3.T();
            }
            return new h(i3, S3.p(), (i4 - S3.r(Z)) + 1);
        }
        throw new RuntimeException("Invalid date 'DayOfYear 366' as '" + i3 + "' is not a leap year");
    }

    public static h i0(long j3) {
        long j4;
        long j5 = j3;
        a.EPOCH_DAY.a0(j5);
        long j6 = 719468 + j5;
        if (j6 < 0) {
            long j7 = ((j5 + 719469) / 146097) - 1;
            j4 = j7 * 400;
            j6 += (-j7) * 146097;
        } else {
            j4 = 0;
        }
        long j8 = ((j6 * 400) + 591) / 146097;
        long j9 = j6 - ((j8 / 400) + (((j8 / 4) + (j8 * 365)) - (j8 / 100)));
        if (j9 < 0) {
            j8--;
            j9 = j6 - ((j8 / 400) + (((j8 / 4) + (365 * j8)) - (j8 / 100)));
        }
        int i3 = (int) j9;
        int i4 = ((i3 * 5) + 2) / 153;
        return new h(a.YEAR.Z(j8 + j4 + ((long) (i4 / 10))), ((i4 + 2) % 12) + 1, (i3 - (((i4 * 306) + 5) / 10)) + 1);
    }

    public static h J(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        h hVar = (h) temporalAccessor.a(j$.time.temporal.s.b());
        if (hVar != null) {
            return hVar;
        }
        String name = temporalAccessor.getClass().getName();
        throw new RuntimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + name);
    }

    private static h C(int i3, int i4, int i5) {
        int i6 = 28;
        if (i5 > 28) {
            if (i4 != 2) {
                i6 = (i4 == 4 || i4 == 6 || i4 == 9 || i4 == 11) ? 30 : 31;
            } else {
                s.f5038d.getClass();
                if (s.Z((long) i3)) {
                    i6 = 29;
                }
            }
            if (i5 > i6) {
                if (i5 == 29) {
                    throw new RuntimeException("Invalid date 'February 29' as '" + i3 + "' is not a leap year");
                }
                throw new RuntimeException("Invalid date '" + n.S(i4).name() + " " + i5 + "'");
            }
        }
        return new h(i3, i4, i5);
    }

    private static h p0(int i3, int i4, int i5) {
        if (i4 == 2) {
            s.f5038d.getClass();
            i5 = Math.min(i5, s.Z((long) i3) ? 29 : 28);
        } else if (i4 == 4 || i4 == 6 || i4 == 9 || i4 == 11) {
            i5 = Math.min(i5, 30);
        }
        return new h(i3, i4, i5);
    }

    private h(int i3, int i4, int i5) {
        this.f5130a = i3;
        this.f5131b = (short) i4;
        this.f5132c = (short) i5;
    }

    public static h f0(b bVar) {
        Instant S3 = Instant.S(System.currentTimeMillis());
        ZoneId a2 = bVar.a();
        Objects.requireNonNull(S3, "instant");
        Objects.requireNonNull(a2, "zone");
        return i0(Math.floorDiv(S3.C() + ((long) a2.r().d(S3).Z()), (long) 86400));
    }

    public final w l(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.J(this);
        }
        a aVar = (a) rVar;
        if (aVar.T()) {
            int i3 = g.f5126a[aVar.ordinal()];
            if (i3 == 1) {
                return w.j(1, (long) e0());
            }
            if (i3 == 2) {
                return w.j(1, (long) (d0() ? 366 : 365));
            } else if (i3 == 3) {
                return w.j(1, (n.S(this.f5131b) != n.FEBRUARY || d0()) ? 5 : 4);
            } else if (i3 != 4) {
                return ((a) rVar).C();
            } else {
                return w.j(1, this.f5130a <= 0 ? 1000000000 : 999999999);
            }
        } else {
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    public final int i(r rVar) {
        if (rVar instanceof a) {
            return S(rVar);
        }
        return super.i(rVar);
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        if (rVar == a.EPOCH_DAY) {
            return v();
        }
        return rVar == a.PROLEPTIC_MONTH ? ((((long) this.f5130a) * 12) + ((long) this.f5131b)) - 1 : (long) S(rVar);
    }

    private int S(r rVar) {
        int i3;
        int i4 = g.f5126a[((a) rVar).ordinal()];
        short s3 = this.f5132c;
        int i5 = this.f5130a;
        switch (i4) {
            case 1:
                return s3;
            case k.FLOAT_FIELD_NUMBER:
                return Z();
            case k.INTEGER_FIELD_NUMBER:
                i3 = (s3 - 1) / 7;
                break;
            case k.LONG_FIELD_NUMBER:
                return i5 >= 1 ? i5 : 1 - i5;
            case k.STRING_FIELD_NUMBER:
                return W().p();
            case k.STRING_SET_FIELD_NUMBER:
                i3 = (s3 - 1) % 7;
                break;
            case k.DOUBLE_FIELD_NUMBER:
                return ((Z() - 1) % 7) + 1;
            case k.BYTES_FIELD_NUMBER:
                throw new RuntimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Z() - 1) / 7) + 1;
            case 10:
                return this.f5131b;
            case 11:
                throw new RuntimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i5;
            case 13:
                if (i5 >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
        return i3 + 1;
    }

    public final l h() {
        return s.f5038d;
    }

    public final j$.time.chrono.m u() {
        return this.f5130a >= 1 ? t.CE : t.BCE;
    }

    public final int b0() {
        return this.f5130a;
    }

    public final int a0() {
        return this.f5131b;
    }

    public final int Z() {
        return (n.S(this.f5131b).r(d0()) + this.f5132c) - 1;
    }

    public final int T() {
        return this.f5132c;
    }

    public final DayOfWeek W() {
        return DayOfWeek.r(((int) Math.floorMod(v() + 3, (long) 7)) + 1);
    }

    public final boolean d0() {
        s.f5038d.getClass();
        return s.Z((long) this.f5130a);
    }

    public final int e0() {
        short s3 = this.f5131b;
        return s3 != 2 ? (s3 == 4 || s3 == 6 || s3 == 9 || s3 == 11) ? 30 : 31 : d0() ? 29 : 28;
    }

    /* renamed from: r0 */
    public final h m(n nVar) {
        if (nVar instanceof h) {
            return (h) nVar;
        }
        return (h) nVar.c(this);
    }

    /* renamed from: q0 */
    public final h b(long j3, r rVar) {
        if (!(rVar instanceof a)) {
            return (h) rVar.p(this, j3);
        }
        a aVar = (a) rVar;
        aVar.a0(j3);
        int i3 = g.f5126a[aVar.ordinal()];
        short s3 = this.f5132c;
        short s4 = this.f5131b;
        int i4 = this.f5130a;
        switch (i3) {
            case 1:
                int i5 = (int) j3;
                return s3 == i5 ? this : g0(i4, s4, i5);
            case k.FLOAT_FIELD_NUMBER:
                return s0((int) j3);
            case k.INTEGER_FIELD_NUMBER:
                return n0(j3 - g(a.ALIGNED_WEEK_OF_MONTH));
            case k.LONG_FIELD_NUMBER:
                if (i4 < 1) {
                    j3 = 1 - j3;
                }
                return t0((int) j3);
            case k.STRING_FIELD_NUMBER:
                return l0(j3 - ((long) W().p()));
            case k.STRING_SET_FIELD_NUMBER:
                return l0(j3 - g(a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case k.DOUBLE_FIELD_NUMBER:
                return l0(j3 - g(a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case k.BYTES_FIELD_NUMBER:
                return i0(j3);
            case 9:
                return n0(j3 - g(a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i6 = (int) j3;
                if (s4 == i6) {
                    return this;
                }
                a.MONTH_OF_YEAR.a0((long) i6);
                return p0(i4, i6, s3);
            case 11:
                return m0(j3 - (((((long) i4) * 12) + ((long) s4)) - 1));
            case 12:
                return t0((int) j3);
            case 13:
                return g(a.ERA) == j3 ? this : t0(1 - i4);
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    public final h t0(int i3) {
        if (this.f5130a == i3) {
            return this;
        }
        a.YEAR.a0((long) i3);
        return p0(i3, this.f5131b, this.f5132c);
    }

    public final h s0(int i3) {
        if (Z() == i3) {
            return this;
        }
        return j0(this.f5130a, i3);
    }

    public final C0528b M(q qVar) {
        if (qVar instanceof s) {
            s sVar = (s) qVar;
            return m0(sVar.d()).l0((long) sVar.a());
        }
        Objects.requireNonNull(qVar, "amountToAdd");
        return (h) qVar.p(this);
    }

    /* renamed from: k0 */
    public final h d(long j3, u uVar) {
        if (!(uVar instanceof b)) {
            return (h) uVar.p(this, j3);
        }
        switch (g.f5127b[((b) uVar).ordinal()]) {
            case 1:
                return l0(j3);
            case k.FLOAT_FIELD_NUMBER:
                return n0(j3);
            case k.INTEGER_FIELD_NUMBER:
                return m0(j3);
            case k.LONG_FIELD_NUMBER:
                return o0(j3);
            case k.STRING_FIELD_NUMBER:
                return o0(Math.multiplyExact(j3, (long) 10));
            case k.STRING_SET_FIELD_NUMBER:
                return o0(Math.multiplyExact(j3, (long) 100));
            case k.DOUBLE_FIELD_NUMBER:
                return o0(Math.multiplyExact(j3, (long) 1000));
            case k.BYTES_FIELD_NUMBER:
                a aVar = a.ERA;
                return b(Math.addExact(g(aVar), j3), aVar);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    public final h o0(long j3) {
        if (j3 == 0) {
            return this;
        }
        return p0(a.YEAR.Z(((long) this.f5130a) + j3), this.f5131b, this.f5132c);
    }

    public final h m0(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j4 = (((long) this.f5130a) * 12) + ((long) (this.f5131b - 1)) + j3;
        long j5 = (long) 12;
        return p0(a.YEAR.Z(Math.floorDiv(j4, j5)), ((int) Math.floorMod(j4, j5)) + 1, this.f5132c);
    }

    public final h n0(long j3) {
        return l0(Math.multiplyExact(j3, (long) 7));
    }

    public final h l0(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j4 = ((long) this.f5132c) + j3;
        if (j4 > 0) {
            int i3 = (j4 > 28 ? 1 : (j4 == 28 ? 0 : -1));
            short s3 = this.f5131b;
            int i4 = this.f5130a;
            if (i3 <= 0) {
                return new h(i4, s3, (int) j4);
            }
            if (j4 <= 59) {
                long e02 = (long) e0();
                if (j4 <= e02) {
                    return new h(i4, s3, (int) j4);
                }
                if (s3 < 12) {
                    return new h(i4, s3 + 1, (int) (j4 - e02));
                }
                int i5 = i4 + 1;
                a.YEAR.a0((long) i5);
                return new h(i5, 1, (int) (j4 - e02));
            }
        }
        return i0(Math.addExact(v(), j3));
    }

    public final m e(long j3, u uVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1, uVar) : d(-j3, uVar);
    }

    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.b()) {
            return this;
        }
        return super.a(tVar);
    }

    public final C0531e K(l lVar) {
        return LocalDateTime.h0(this, lVar);
    }

    public final long v() {
        long j3;
        long j4 = (long) this.f5130a;
        long j5 = (long) this.f5131b;
        long j6 = 365 * j4;
        if (j4 >= 0) {
            j3 = ((j4 + 399) / 400) + (((3 + j4) / 4) - ((99 + j4) / 100)) + j6;
        } else {
            j3 = j6 - ((j4 / -400) + ((j4 / -4) - (j4 / -100)));
        }
        long j7 = (((367 * j5) - 362) / 12) + j3 + ((long) (this.f5132c - 1));
        if (j5 > 2) {
            j7 = !d0() ? j7 - 2 : j7 - 1;
        }
        return j7 - 719528;
    }

    /* renamed from: V */
    public final int compareTo(C0528b bVar) {
        if (bVar instanceof h) {
            return r((h) bVar);
        }
        return super.compareTo(bVar);
    }

    /* access modifiers changed from: package-private */
    public final int r(h hVar) {
        int i3 = this.f5130a - hVar.f5130a;
        if (i3 != 0) {
            return i3;
        }
        int i4 = this.f5131b - hVar.f5131b;
        return i4 == 0 ? this.f5132c - hVar.f5132c : i4;
    }

    public final boolean c0(h hVar) {
        if (hVar != null) {
            if (r(hVar) < 0) {
                return true;
            }
            return false;
        } else if (v() < hVar.v()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        if (r((h) obj) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f5130a;
        return (((i3 << 11) + (this.f5131b << 6)) + this.f5132c) ^ (i3 & -2048);
    }

    public final String toString() {
        int i3 = this.f5130a;
        int abs = Math.abs(i3);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i3 > 9999) {
                sb.append('+');
            }
            sb.append(i3);
        } else if (i3 < 0) {
            sb.append(i3 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i3 + 10000);
            sb.deleteCharAt(0);
        }
        String str = "-";
        short s3 = this.f5131b;
        sb.append(s3 < 10 ? "-0" : str);
        sb.append(s3);
        short s4 = this.f5132c;
        if (s4 < 10) {
            str = "-0";
        }
        sb.append(str);
        sb.append(s4);
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void u0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f5130a);
        dataOutput.writeByte(this.f5131b);
        dataOutput.writeByte(this.f5132c);
    }
}
