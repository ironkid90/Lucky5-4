package j$.time.chrono;

import j$.time.d;
import j$.time.h;
import j$.time.l;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.u;
import j$.time.temporal.w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

public final class C extends C0530d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a  reason: collision with root package name */
    private final transient h f4993a;

    C(h hVar) {
        Objects.requireNonNull(hVar, "isoDate");
        this.f4993a = hVar;
    }

    public final l h() {
        return A.f4991d;
    }

    public final int hashCode() {
        A.f4991d.getClass();
        return this.f4993a.hashCode() ^ -1990173233;
    }

    public final m u() {
        return T() >= 1 ? D.ROC : D.BEFORE_ROC;
    }

    public final w l(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.J(this);
        }
        if (f(rVar)) {
            a aVar = (a) rVar;
            int i3 = B.f4992a[aVar.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                return this.f4993a.l(rVar);
            }
            if (i3 != 4) {
                return A.f4991d.U(aVar);
            }
            w C3 = a.YEAR.C();
            return w.j(1, T() <= 0 ? (-C3.e()) + 1912 : C3.d() - 1911);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i3 = B.f4992a[((a) rVar).ordinal()];
        int i4 = 1;
        if (i3 != 4) {
            h hVar = this.f4993a;
            if (i3 == 5) {
                return ((((long) T()) * 12) + ((long) hVar.a0())) - 1;
            }
            if (i3 == 6) {
                return (long) T();
            }
            if (i3 != 7) {
                return hVar.g(rVar);
            }
            if (T() < 1) {
                i4 = 0;
            }
            return (long) i4;
        }
        int T3 = T();
        if (T3 < 1) {
            T3 = 1 - T3;
        }
        return (long) T3;
    }

    private int T() {
        return this.f4993a.b0() - 1911;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r2 != 7) goto L_0x0061;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j$.time.chrono.C b(long r9, j$.time.temporal.r r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L_0x0099
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.g(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            return r8
        L_0x0010:
            int[] r1 = j$.time.chrono.B.f4992a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.h r3 = r8.f4993a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L_0x004b
            r7 = 5
            if (r2 == r7) goto L_0x0027
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x004b
            goto L_0x0061
        L_0x0027:
            j$.time.chrono.A r11 = j$.time.chrono.A.f4991d
            j$.time.temporal.w r11 = r11.U(r0)
            r11.b(r9, r0)
            int r11 = r8.T()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.a0()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.h r9 = r3.m0(r9)
            j$.time.chrono.C r9 = r8.Z(r9)
            return r9
        L_0x004b:
            j$.time.chrono.A r2 = j$.time.chrono.A.f4991d
            j$.time.temporal.w r2 = r2.U(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L_0x0084
            if (r0 == r5) goto L_0x0079
            if (r0 == r4) goto L_0x006a
        L_0x0061:
            j$.time.h r9 = r3.b(r9, r11)
            j$.time.chrono.C r9 = r8.Z(r9)
            return r9
        L_0x006a:
            int r9 = r8.T()
            int r9 = 1912 - r9
            j$.time.h r9 = r3.t0(r9)
            j$.time.chrono.C r9 = r8.Z(r9)
            return r9
        L_0x0079:
            int r2 = r2 + 1911
            j$.time.h r9 = r3.t0(r2)
            j$.time.chrono.C r9 = r8.Z(r9)
            return r9
        L_0x0084:
            int r9 = r8.T()
            r10 = 1
            if (r9 < r10) goto L_0x008e
            int r2 = r2 + 1911
            goto L_0x0090
        L_0x008e:
            int r2 = 1912 - r2
        L_0x0090:
            j$.time.h r9 = r3.t0(r2)
            j$.time.chrono.C r9 = r8.Z(r9)
            return r9
        L_0x0099:
            j$.time.chrono.b r9 = super.b((long) r9, (j$.time.temporal.r) r11)
            j$.time.chrono.C r9 = (j$.time.chrono.C) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.C.b(long, j$.time.temporal.r):j$.time.chrono.C");
    }

    public final m j(h hVar) {
        return (C) super.j(hVar);
    }

    public final C0528b m(n nVar) {
        return (C) super.j(nVar);
    }

    public final C0528b M(q qVar) {
        return (C) super.M(qVar);
    }

    /* access modifiers changed from: package-private */
    public final C0528b S(long j3) {
        return Z(this.f4993a.o0(j3));
    }

    /* access modifiers changed from: package-private */
    public final C0528b J(long j3) {
        return Z(this.f4993a.m0(j3));
    }

    /* access modifiers changed from: package-private */
    public final C0528b C(long j3) {
        return Z(this.f4993a.l0(j3));
    }

    public final C0528b d(long j3, u uVar) {
        return (C) super.d(j3, uVar);
    }

    /* renamed from: d  reason: collision with other method in class */
    public final m m0d(long j3, u uVar) {
        return (C) super.d(j3, uVar);
    }

    public final C0528b e(long j3, u uVar) {
        return (C) super.e(j3, uVar);
    }

    /* renamed from: e  reason: collision with other method in class */
    public final m m1e(long j3, u uVar) {
        return (C) super.e(j3, uVar);
    }

    private C Z(h hVar) {
        return hVar.equals(this.f4993a) ? this : new C(hVar);
    }

    public final long v() {
        return this.f4993a.v();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            return this.f4993a.equals(((C) obj).f4993a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 7, this);
    }

    public final C0531e K(l lVar) {
        return C0533g.C(this, lVar);
    }
}
