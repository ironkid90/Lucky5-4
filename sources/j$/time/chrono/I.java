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

public final class I extends C0530d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* renamed from: a  reason: collision with root package name */
    private final transient h f5000a;

    I(h hVar) {
        Objects.requireNonNull(hVar, "isoDate");
        this.f5000a = hVar;
    }

    public final l h() {
        return G.f4998d;
    }

    public final int hashCode() {
        G.f4998d.getClass();
        return this.f5000a.hashCode() ^ 146118545;
    }

    public final m u() {
        return T() >= 1 ? J.BE : J.BEFORE_BE;
    }

    public final w l(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.J(this);
        }
        if (f(rVar)) {
            a aVar = (a) rVar;
            int i3 = H.f4999a[aVar.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                return this.f5000a.l(rVar);
            }
            if (i3 != 4) {
                return G.f4998d.U(aVar);
            }
            w C3 = a.YEAR.C();
            return w.j(1, T() <= 0 ? (-(C3.e() + 543)) + 1 : 543 + C3.d());
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final long g(r rVar) {
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        int i3 = H.f4999a[((a) rVar).ordinal()];
        int i4 = 1;
        if (i3 != 4) {
            h hVar = this.f5000a;
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
        return this.f5000a.b0() + 543;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r2 != 7) goto L_0x0061;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j$.time.chrono.I b(long r9, j$.time.temporal.r r11) {
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
            int[] r1 = j$.time.chrono.H.f4999a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.h r3 = r8.f5000a
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
            j$.time.chrono.G r11 = j$.time.chrono.G.f4998d
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
            j$.time.chrono.I r9 = r8.Z(r9)
            return r9
        L_0x004b:
            j$.time.chrono.G r2 = j$.time.chrono.G.f4998d
            j$.time.temporal.w r2 = r2.U(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L_0x0084
            if (r0 == r5) goto L_0x0079
            if (r0 == r4) goto L_0x006a
        L_0x0061:
            j$.time.h r9 = r3.b(r9, r11)
            j$.time.chrono.I r9 = r8.Z(r9)
            return r9
        L_0x006a:
            int r9 = r8.T()
            int r9 = -542 - r9
            j$.time.h r9 = r3.t0(r9)
            j$.time.chrono.I r9 = r8.Z(r9)
            return r9
        L_0x0079:
            int r2 = r2 + -543
            j$.time.h r9 = r3.t0(r2)
            j$.time.chrono.I r9 = r8.Z(r9)
            return r9
        L_0x0084:
            int r9 = r8.T()
            r10 = 1
            if (r9 < r10) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            int r2 = 1 - r2
        L_0x008e:
            int r2 = r2 + -543
            j$.time.h r9 = r3.t0(r2)
            j$.time.chrono.I r9 = r8.Z(r9)
            return r9
        L_0x0099:
            j$.time.chrono.b r9 = super.b((long) r9, (j$.time.temporal.r) r11)
            j$.time.chrono.I r9 = (j$.time.chrono.I) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.I.b(long, j$.time.temporal.r):j$.time.chrono.I");
    }

    public final m j(h hVar) {
        return (I) super.j(hVar);
    }

    public final C0528b m(n nVar) {
        return (I) super.j(nVar);
    }

    public final C0528b M(q qVar) {
        return (I) super.M(qVar);
    }

    /* access modifiers changed from: package-private */
    public final C0528b S(long j3) {
        return Z(this.f5000a.o0(j3));
    }

    /* access modifiers changed from: package-private */
    public final C0528b J(long j3) {
        return Z(this.f5000a.m0(j3));
    }

    /* access modifiers changed from: package-private */
    public final C0528b C(long j3) {
        return Z(this.f5000a.l0(j3));
    }

    public final C0528b d(long j3, u uVar) {
        return (I) super.d(j3, uVar);
    }

    /* renamed from: d  reason: collision with other method in class */
    public final m m2d(long j3, u uVar) {
        return (I) super.d(j3, uVar);
    }

    public final C0528b e(long j3, u uVar) {
        return (I) super.e(j3, uVar);
    }

    /* renamed from: e  reason: collision with other method in class */
    public final m m3e(long j3, u uVar) {
        return (I) super.e(j3, uVar);
    }

    private I Z(h hVar) {
        return hVar.equals(this.f5000a) ? this : new I(hVar);
    }

    public final long v() {
        return this.f5000a.v();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.f5000a.equals(((I) obj).f5000a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 8, this);
    }

    public final C0531e K(l lVar) {
        return C0533g.C(this, lVar);
    }
}
