package N2;

import B.m;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1207e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1208f;

    /* renamed from: g  reason: collision with root package name */
    public static final m f1209g = new m(11, (Object) "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    public final int f1210a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1211b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1212c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceArray f1213d;

    static {
        Class<n> cls = n.class;
        f1207e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f1208f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public n(int i3, boolean z3) {
        this.f1210a = i3;
        this.f1211b = z3;
        int i4 = i3 - 1;
        this.f1212c = i4;
        this.f1213d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i3 & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1208f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) == 0) {
                int i3 = (int) (1073741823 & j3);
                int i4 = (int) ((1152921503533105152L & j3) >> 30);
                int i5 = this.f1212c;
                if (((i4 + 2) & i5) == (i3 & i5)) {
                    return 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.f1213d;
                if (this.f1211b || atomicReferenceArray.get(i4 & i5) == null) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j3, (-1152921503533105153L & j3) | (((long) ((i4 + 1) & 1073741823)) << 30))) {
                        atomicReferenceArray.set(i4 & i5, runnable);
                        n nVar = this;
                        while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = nVar.f1213d;
                            int i6 = nVar.f1212c & i4;
                            Object obj = atomicReferenceArray2.get(i6);
                            if (!(obj instanceof m) || ((m) obj).f1206a != i4) {
                                nVar = null;
                                continue;
                            } else {
                                atomicReferenceArray2.set(i6, runnable);
                                continue;
                            }
                            if (nVar == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                } else {
                    int i7 = this.f1210a;
                    if (i7 < 1024 || ((i4 - i3) & 1073741823) > (i7 >> 1)) {
                        return 1;
                    }
                }
            } else if ((j3 & 2305843009213693952L) != 0) {
                return 2;
            } else {
                return 1;
            }
        }
        return 1;
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f1208f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[LOOP:3: B:16:0x006a->B:19:0x0076, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final N2.n c() {
        /*
            r10 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = f1208f
            long r2 = r6.get(r10)
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0011
            goto L_0x001d
        L_0x0011:
            long r7 = r2 | r0
            r0 = r6
            r1 = r10
            r4 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r7
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1207e
            java.lang.Object r1 = r0.get(r10)
            N2.n r1 = (N2.n) r1
            if (r1 == 0) goto L_0x0028
            return r1
        L_0x0028:
            N2.n r1 = new N2.n
            int r4 = r10.f1210a
            int r4 = r4 * 2
            boolean r5 = r10.f1211b
            r1.<init>(r4, r5)
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r4 = (int) r4
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
        L_0x0042:
            int r7 = r10.f1212c
            r8 = r4 & r7
            r7 = r7 & r5
            if (r8 == r7) goto L_0x0061
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f1213d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0056
            N2.m r7 = new N2.m
            r7.<init>(r4)
        L_0x0056:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.f1213d
            int r9 = r1.f1212c
            r9 = r9 & r4
            r8.set(r9, r7)
            int r4 = r4 + 1
            goto L_0x0042
        L_0x0061:
            r4 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r4 = r4 & r2
            r6.set(r1, r4)
        L_0x006a:
            r4 = 0
            boolean r4 = r0.compareAndSet(r10, r4, r1)
            if (r4 == 0) goto L_0x0072
            goto L_0x001d
        L_0x0072:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == 0) goto L_0x006a
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.n.c():N2.n");
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1208f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                return f1209g;
            }
            int i3 = (int) (j3 & 1073741823);
            int i4 = this.f1212c;
            int i5 = i3 & i4;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i4) == i5) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1213d;
            Object obj = atomicReferenceArray.get(i5);
            boolean z3 = this.f1211b;
            if (obj == null) {
                if (z3) {
                    return null;
                }
            } else if (obj instanceof m) {
                return null;
            } else {
                long j4 = (long) ((i3 + 1) & 1073741823);
                Object obj2 = obj;
                boolean z4 = z3;
                if (atomicLongFieldUpdater.compareAndSet(this, j3, (j3 & -1073741824) | j4)) {
                    atomicReferenceArray.set(i5, (Object) null);
                    return obj2;
                } else if (z4) {
                    n nVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1208f;
                        long j5 = atomicLongFieldUpdater2.get(nVar);
                        int i6 = (int) (j5 & 1073741823);
                        if ((j5 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j5, (j5 & -1073741824) | j4)) {
                                nVar.f1213d.set(nVar.f1212c & i6, (Object) null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
