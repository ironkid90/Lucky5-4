package K2;

import A2.i;
import A2.t;
import B.m;
import I2.C0054e;
import I2.C0055f;
import I2.m0;
import N2.a;
import N2.p;
import N2.u;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import z2.l;

public class b implements f {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f866h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f867i;

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f868j;

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f869k;

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f870l;

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f871m;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f872n;

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f873o;

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f874p;
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: f  reason: collision with root package name */
    public final int f875f;

    /* renamed from: g  reason: collision with root package name */
    public final l f876g;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    static {
        Class<b> cls = b.class;
        f866h = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus");
        f867i = AtomicLongFieldUpdater.newUpdater(cls, "receivers");
        f868j = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd");
        f869k = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag");
        Class<Object> cls2 = Object.class;
        f870l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment");
        f871m = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment");
        f872n = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment");
        f873o = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause");
        f874p = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler");
    }

    public b(int i3, l lVar) {
        long j3;
        this.f875f = i3;
        this.f876g = lVar;
        if (i3 >= 0) {
            j jVar = d.f878a;
            if (i3 == 0) {
                j3 = 0;
            } else if (i3 != Integer.MAX_VALUE) {
                j3 = (long) i3;
            } else {
                j3 = Long.MAX_VALUE;
            }
            this.bufferEnd = j3;
            this.completedExpandBuffersAndPauseFlag = f868j.get(this);
            j jVar2 = new j(0, (j) null, this, 3);
            this.sendSegment = jVar2;
            this.receiveSegment = jVar2;
            if (u()) {
                jVar2 = d.f878a;
                i.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar2;
            this._closeCause = d.f896s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i3 + ", should be >=0").toString());
    }

    public static final j b(b bVar, long j3, j jVar) {
        Object c3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        bVar.getClass();
        j jVar2 = d.f878a;
        c cVar = c.f877n;
        loop0:
        while (true) {
            c3 = a.c(jVar, j3, cVar);
            if (a.f(c3)) {
                break;
            }
            u d3 = a.d(c3);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f870l;
                u uVar = (u) atomicReferenceFieldUpdater.get(bVar);
                if (uVar.f1221h >= d3.f1221h) {
                    break loop0;
                } else if (d3.i()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, d3)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != uVar) {
                            if (d3.e()) {
                                d3.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            }
        }
        boolean f3 = a.f(c3);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f867i;
        if (f3) {
            bVar.s();
            if (jVar.f1221h * ((long) d.f879b) >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) a.d(c3);
        long j6 = jVar3.f1221h;
        if (j6 <= j3) {
            return jVar3;
        }
        long j7 = ((long) d.f879b) * j6;
        do {
            atomicLongFieldUpdater = f866h;
            j4 = atomicLongFieldUpdater.get(bVar);
            j5 = 1152921504606846975L & j4;
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j4, j5 + (((long) ((int) (j4 >> 60))) << 60)));
        if (j6 * ((long) d.f879b) >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0055f fVar) {
        l lVar = bVar.f876g;
        if (lVar != null) {
            a.a(lVar, obj, fVar.f761j);
        }
        fVar.m(M0.a.h(bVar.o()));
    }

    public static final int d(b bVar, j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        bVar.getClass();
        jVar.m(i3, obj);
        if (z3) {
            return bVar.B(jVar, i3, obj, j3, obj2, z3);
        }
        Object k3 = jVar.k(i3);
        if (k3 == null) {
            if (bVar.e(j3)) {
                if (jVar.j(i3, (Object) null, d.f881d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (jVar.j(i3, (Object) null, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof m0) {
            jVar.m(i3, (Object) null);
            if (bVar.y(k3, obj)) {
                jVar.n(i3, d.f886i);
                return 0;
            }
            m mVar = d.f888k;
            if (jVar.f903k.getAndSet((i3 * 2) + 1, mVar) != mVar) {
                jVar.l(i3, true);
            }
            return 5;
        }
        return bVar.B(jVar, i3, obj, j3, obj2, z3);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f869k;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof C0054e) {
            i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((C0054e) obj, C0368h.f4194a, (l) null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(j jVar, int i3, long j3, Object obj) {
        Object k3 = jVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = jVar.f903k;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f866h;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f891n;
                }
                if (jVar.j(i3, k3, obj)) {
                    j();
                    return d.f890m;
                }
            }
        } else if (k3 == d.f881d && jVar.j(i3, k3, d.f886i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            jVar.m(i3, (Object) null);
            return obj2;
        }
        while (true) {
            Object k4 = jVar.k(i3);
            if (k4 == null || k4 == d.f882e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i3, k4, d.f885h)) {
                        j();
                        return d.f892o;
                    }
                } else if (obj == null) {
                    return d.f891n;
                } else {
                    if (jVar.j(i3, k4, obj)) {
                        j();
                        return d.f890m;
                    }
                }
            } else if (k4 != d.f881d) {
                m mVar = d.f887j;
                if (k4 == mVar) {
                    return d.f892o;
                }
                if (k4 == d.f885h) {
                    return d.f892o;
                }
                if (k4 == d.f889l) {
                    j();
                    return d.f892o;
                } else if (k4 != d.f884g && jVar.j(i3, k4, d.f883f)) {
                    boolean z3 = k4 instanceof s;
                    if (z3) {
                        k4 = ((s) k4).f910a;
                    }
                    if (z(k4)) {
                        jVar.n(i3, d.f886i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        jVar.m(i3, (Object) null);
                        return obj3;
                    }
                    jVar.n(i3, mVar);
                    jVar.h();
                    if (z3) {
                        j();
                    }
                    return d.f892o;
                }
            } else if (jVar.j(i3, k4, d.f886i)) {
                j();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                jVar.m(i3, (Object) null);
                return obj4;
            }
        }
    }

    public final int B(j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k3 = jVar.k(i3);
            if (k3 == null) {
                if (!e(j3) || z3) {
                    if (z3) {
                        if (jVar.j(i3, (Object) null, d.f887j)) {
                            jVar.h();
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (jVar.j(i3, (Object) null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i3, (Object) null, d.f881d)) {
                    return 1;
                }
            } else if (k3 != d.f882e) {
                m mVar = d.f888k;
                if (k3 == mVar) {
                    jVar.m(i3, (Object) null);
                    return 5;
                } else if (k3 == d.f885h) {
                    jVar.m(i3, (Object) null);
                    return 5;
                } else if (k3 == d.f889l) {
                    jVar.m(i3, (Object) null);
                    s();
                    return 4;
                } else {
                    jVar.m(i3, (Object) null);
                    if (k3 instanceof s) {
                        k3 = ((s) k3).f910a;
                    }
                    if (y(k3, obj)) {
                        jVar.n(i3, d.f886i);
                        return 0;
                    } else if (jVar.f903k.getAndSet((i3 * 2) + 1, mVar) == mVar) {
                        return 5;
                    } else {
                        jVar.l(i3, true);
                        return 5;
                    }
                }
            } else if (jVar.j(i3, k3, d.f881d)) {
                return 1;
            }
        }
    }

    public final void C(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        boolean z3;
        long j5;
        if (!u()) {
            do {
                atomicLongFieldUpdater = f868j;
            } while (atomicLongFieldUpdater.get(this) <= j3);
            int i3 = d.f880c;
            int i4 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f869k;
                if (i4 < i3) {
                    long j6 = atomicLongFieldUpdater.get(this);
                    if (j6 != (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) || j6 != atomicLongFieldUpdater.get(this)) {
                        i4++;
                    } else {
                        return;
                    }
                } else {
                    do {
                        j4 = atomicLongFieldUpdater2.get(this);
                    } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, 4611686018427387904L + (j4 & 4611686018427387903L)));
                    while (true) {
                        long j7 = atomicLongFieldUpdater.get(this);
                        long j8 = atomicLongFieldUpdater2.get(this);
                        long j9 = j8 & 4611686018427387903L;
                        if ((j8 & 4611686018427387904L) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (j7 == j9 && j7 == atomicLongFieldUpdater.get(this)) {
                            break;
                        } else if (!z3) {
                            atomicLongFieldUpdater2.compareAndSet(this, j8, j9 + 4611686018427387904L);
                        }
                    }
                    do {
                        j5 = atomicLongFieldUpdater2.get(this);
                    } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, j5 & 4611686018427387903L));
                    return;
                }
            }
        }
    }

    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j3) {
        if (j3 < f868j.get(this) || j3 < f867i.get(this) + ((long) this.f875f)) {
            return true;
        }
        return false;
    }

    public final boolean f(Throwable th, boolean z3) {
        boolean z4;
        Object obj;
        m mVar;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f866h;
        if (z3) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f878a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (((long) 1) << 60) + (j7 & 1152921504606846975L)));
        }
        m mVar2 = d.f896s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f873o;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, mVar2, th)) {
                if (atomicReferenceFieldUpdater.get(this) != mVar2) {
                    z4 = false;
                    break;
                }
            } else {
                z4 = true;
                break;
            }
        }
        if (z3) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (((long) 3) << 60) + (j6 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 >> 60);
                if (i3 == 0) {
                    j4 = j3 & 1152921504606846975L;
                    j5 = (long) 2;
                } else if (i3 != 1) {
                    break;
                } else {
                    j4 = j3 & 1152921504606846975L;
                    j5 = (long) 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, (j5 << 60) + j4));
        }
        s();
        if (z4) {
            loop4:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f874p;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    mVar = d.f894q;
                } else {
                    mVar = d.f895r;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, mVar)) {
                        break loop4;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
            }
            if (obj != null) {
                t.a(1, obj);
                ((l) obj).j(m());
            }
        }
        return z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r1 = (K2.j) ((N2.d) N2.d.f1188g.get(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final K2.j g(long r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f872n
            java.lang.Object r0 = r0.get(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f870l
            java.lang.Object r1 = r1.get(r12)
            K2.j r1 = (K2.j) r1
            long r2 = r1.f1221h
            r4 = r0
            K2.j r4 = (K2.j) r4
            long r4 = r4.f1221h
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            r0 = r1
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f871m
            java.lang.Object r1 = r1.get(r12)
            K2.j r1 = (K2.j) r1
            long r2 = r1.f1221h
            r4 = r0
            K2.j r4 = (K2.j) r4
            long r4 = r4.f1221h
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x002e
            r0 = r1
        L_0x002e:
            N2.d r0 = (N2.d) r0
        L_0x0030:
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = N2.d.f1187f
            java.lang.Object r1 = r1.get(r0)
            B.m r2 = N2.a.f1180b
            r3 = 0
            if (r1 != r2) goto L_0x003f
            goto L_0x004b
        L_0x003f:
            N2.d r1 = (N2.d) r1
            if (r1 != 0) goto L_0x0131
        L_0x0043:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = N2.d.f1187f
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L_0x0129
        L_0x004b:
            K2.j r0 = (K2.j) r0
            boolean r1 = r12.t()
            r2 = -1
            r4 = 1
            if (r1 == 0) goto L_0x00a3
            r1 = r0
        L_0x0056:
            int r5 = K2.d.f879b
            int r5 = r5 - r4
        L_0x0059:
            r6 = -1
            if (r2 >= r5) goto L_0x008f
            int r8 = K2.d.f879b
            long r8 = (long) r8
            long r10 = r1.f1221h
            long r10 = r10 * r8
            long r8 = (long) r5
            long r10 = r10 + r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f867i
            long r8 = r8.get(r12)
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0071
        L_0x006f:
            r10 = r6
            goto L_0x009c
        L_0x0071:
            java.lang.Object r8 = r1.k(r5)
            if (r8 == 0) goto L_0x0081
            B.m r9 = K2.d.f882e
            if (r8 != r9) goto L_0x007c
            goto L_0x0081
        L_0x007c:
            B.m r9 = K2.d.f881d
            if (r8 != r9) goto L_0x008c
            goto L_0x009c
        L_0x0081:
            B.m r9 = K2.d.f889l
            boolean r8 = r1.j(r5, r8, r9)
            if (r8 == 0) goto L_0x0071
            r1.h()
        L_0x008c:
            int r5 = r5 + -1
            goto L_0x0059
        L_0x008f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = N2.d.f1188g
            java.lang.Object r1 = r5.get(r1)
            N2.d r1 = (N2.d) r1
            K2.j r1 = (K2.j) r1
            if (r1 != 0) goto L_0x0056
            goto L_0x006f
        L_0x009c:
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00a3
            r12.h(r10)
        L_0x00a3:
            r1 = r0
        L_0x00a4:
            if (r1 == 0) goto L_0x0107
            int r5 = K2.d.f879b
            int r5 = r5 - r4
        L_0x00a9:
            if (r2 >= r5) goto L_0x00fc
            int r6 = K2.d.f879b
            long r6 = (long) r6
            long r8 = r1.f1221h
            long r8 = r8 * r6
            long r6 = (long) r5
            long r8 = r8 + r6
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x0107
        L_0x00b7:
            java.lang.Object r6 = r1.k(r5)
            if (r6 == 0) goto L_0x00ee
            B.m r7 = K2.d.f882e
            if (r6 != r7) goto L_0x00c2
            goto L_0x00ee
        L_0x00c2:
            boolean r7 = r6 instanceof K2.s
            if (r7 == 0) goto L_0x00da
            B.m r7 = K2.d.f889l
            boolean r7 = r1.j(r5, r6, r7)
            if (r7 == 0) goto L_0x00b7
            K2.s r6 = (K2.s) r6
            I2.m0 r6 = r6.f910a
            java.lang.Object r3 = N2.a.g(r3, r6)
            r1.l(r5, r4)
            goto L_0x00f9
        L_0x00da:
            boolean r7 = r6 instanceof I2.m0
            if (r7 == 0) goto L_0x00f9
            B.m r7 = K2.d.f889l
            boolean r7 = r1.j(r5, r6, r7)
            if (r7 == 0) goto L_0x00b7
            java.lang.Object r3 = N2.a.g(r3, r6)
            r1.l(r5, r4)
            goto L_0x00f9
        L_0x00ee:
            B.m r7 = K2.d.f889l
            boolean r6 = r1.j(r5, r6, r7)
            if (r6 == 0) goto L_0x00b7
            r1.h()
        L_0x00f9:
            int r5 = r5 + -1
            goto L_0x00a9
        L_0x00fc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = N2.d.f1188g
            java.lang.Object r1 = r5.get(r1)
            N2.d r1 = (N2.d) r1
            K2.j r1 = (K2.j) r1
            goto L_0x00a4
        L_0x0107:
            if (r3 == 0) goto L_0x0128
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto L_0x0113
            I2.m0 r3 = (I2.m0) r3
            r12.x(r3, r4)
            goto L_0x0128
        L_0x0113:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r4
        L_0x011a:
            if (r2 >= r13) goto L_0x0128
            java.lang.Object r14 = r3.get(r13)
            I2.m0 r14 = (I2.m0) r14
            r12.x(r14, r4)
            int r13 = r13 + -1
            goto L_0x011a
        L_0x0128:
            return r0
        L_0x0129:
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x0043
            goto L_0x0030
        L_0x0131:
            r0 = r1
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.b.g(long):K2.j");
    }

    public final void h(long j3) {
        H0.b b3;
        j jVar = (j) f871m.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f867i;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 >= Math.max(((long) this.f875f) + j4, f868j.get(this))) {
                if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                    long j5 = (long) d.f879b;
                    long j6 = j4 / j5;
                    int i3 = (int) (j4 % j5);
                    if (jVar.f1221h != j6) {
                        j k3 = k(j6, jVar);
                        if (k3 == null) {
                            continue;
                        } else {
                            jVar = k3;
                        }
                    }
                    Object A3 = A(jVar, i3, j4, (Object) null);
                    if (A3 != d.f892o) {
                        jVar.a();
                        l lVar = this.f876g;
                        if (!(lVar == null || (b3 = a.b(lVar, A3, (H0.b) null)) == null)) {
                            throw b3;
                        }
                    } else if (j4 < p()) {
                        jVar.a();
                    }
                }
            } else {
                return;
            }
        }
    }

    public Object i(Object obj) {
        boolean z3;
        j jVar;
        C0368h hVar;
        m0 m0Var;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f866h;
        long j3 = atomicLongFieldUpdater.get(this);
        if (r(j3, false)) {
            z3 = false;
        } else {
            z3 = !e(j3 & 1152921504606846975L);
        }
        h hVar2 = i.f901a;
        if (z3) {
            return hVar2;
        }
        m mVar = d.f887j;
        j jVar3 = (j) f870l.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean r3 = r(andIncrement, false);
            int i3 = d.f879b;
            long j5 = (long) i3;
            long j6 = j4 / j5;
            int i4 = (int) (j4 % j5);
            if (jVar3.f1221h != j6) {
                j b3 = b(this, j6, jVar3);
                if (b3 != null) {
                    jVar = b3;
                } else if (r3) {
                    return new g(o());
                }
            } else {
                jVar = jVar3;
            }
            j jVar4 = jVar;
            int i5 = i4;
            int i6 = i3;
            int d3 = d(this, jVar, i4, obj, j4, mVar, r3);
            hVar = C0368h.f4194a;
            if (d3 != 0) {
                if (d3 == 1) {
                    break;
                } else if (d3 != 2) {
                    if (d3 == 3) {
                        throw new IllegalStateException("unexpected");
                    } else if (d3 != 4) {
                        if (d3 == 5) {
                            jVar4.a();
                        }
                        jVar3 = jVar4;
                    } else {
                        if (j4 < f867i.get(this)) {
                            jVar4.a();
                        }
                        return new g(o());
                    }
                } else if (r3) {
                    jVar4.h();
                    return new g(o());
                } else {
                    if (mVar instanceof m0) {
                        m0Var = (m0) mVar;
                    } else {
                        m0Var = null;
                    }
                    if (m0Var != null) {
                        jVar2 = jVar4;
                        m0Var.a(jVar2, i5 + i6);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return hVar2;
                }
            } else {
                jVar4.a();
                break;
            }
        }
        return hVar;
    }

    public final void j() {
        Object c3;
        if (!u()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f872n;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            loop0:
            while (true) {
                long andIncrement = f868j.getAndIncrement(this);
                long j3 = andIncrement / ((long) d.f879b);
                if (p() <= andIncrement) {
                    if (jVar.f1221h < j3 && jVar.b() != null) {
                        v(j3, jVar);
                    }
                    q(this);
                    return;
                }
                if (jVar.f1221h != j3) {
                    c cVar = c.f877n;
                    while (true) {
                        c3 = a.c(jVar, j3, cVar);
                        if (a.f(c3)) {
                            break;
                        }
                        u d3 = a.d(c3);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f1221h >= d3.f1221h) {
                                break;
                            } else if (d3.i()) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d3)) {
                                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                        if (d3.e()) {
                                            d3.d();
                                        }
                                    }
                                }
                                if (uVar.e()) {
                                    uVar.d();
                                }
                            }
                        }
                    }
                    j jVar2 = null;
                    if (a.f(c3)) {
                        s();
                        v(j3, jVar);
                        q(this);
                    } else {
                        j jVar3 = (j) a.d(c3);
                        long j4 = jVar3.f1221h;
                        if (j4 > j3) {
                            long j5 = j4 * ((long) d.f879b);
                            if (f868j.compareAndSet(this, andIncrement + 1, j5)) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater = f869k;
                                if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                    do {
                                    } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                                }
                            } else {
                                q(this);
                            }
                        } else {
                            jVar2 = jVar3;
                        }
                    }
                    if (jVar2 == null) {
                        continue;
                    } else {
                        jVar = jVar2;
                    }
                }
                int i3 = (int) (andIncrement % ((long) d.f879b));
                Object k3 = jVar.k(i3);
                boolean z3 = k3 instanceof m0;
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f867i;
                if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i3, k3, d.f884g)) {
                    while (true) {
                        Object k4 = jVar.k(i3);
                        if (!(k4 instanceof m0)) {
                            if (k4 != d.f887j) {
                                if (k4 != null) {
                                    if (k4 == d.f881d || k4 == d.f885h || k4 == d.f886i || k4 == d.f888k || k4 == d.f889l) {
                                        break loop0;
                                    } else if (k4 != d.f883f) {
                                        throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                                    }
                                } else if (jVar.j(i3, k4, d.f882e)) {
                                    break loop0;
                                }
                            } else {
                                break;
                            }
                        } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (jVar.j(i3, k4, new s((m0) k4))) {
                                break loop0;
                            }
                        } else if (jVar.j(i3, k4, d.f884g)) {
                            if (z(k4)) {
                                jVar.n(i3, d.f881d);
                                break;
                            } else {
                                jVar.n(i3, d.f887j);
                                jVar.h();
                            }
                        }
                    }
                } else if (z(k3)) {
                    jVar.n(i3, d.f881d);
                    break;
                } else {
                    jVar.n(i3, d.f887j);
                    jVar.h();
                }
                q(this);
            }
            q(this);
        }
    }

    public final j k(long j3, j jVar) {
        Object c3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        j jVar2 = d.f878a;
        c cVar = c.f877n;
        loop0:
        while (true) {
            c3 = a.c(jVar, j3, cVar);
            if (a.f(c3)) {
                break;
            }
            u d3 = a.d(c3);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f871m;
                u uVar = (u) atomicReferenceFieldUpdater.get(this);
                if (uVar.f1221h >= d3.f1221h) {
                    break loop0;
                } else if (d3.i()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d3)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (d3.e()) {
                                d3.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            }
        }
        if (a.f(c3)) {
            s();
            if (jVar.f1221h * ((long) d.f879b) >= p()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) a.d(c3);
        boolean u3 = u();
        long j5 = jVar3.f1221h;
        if (!u3 && j3 <= f868j.get(this) / ((long) d.f879b)) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f872n;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f1221h >= j5 || !jVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (jVar3.e()) {
                            jVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j5 <= j3) {
            return jVar3;
        }
        long j6 = ((long) d.f879b) * j5;
        do {
            atomicLongFieldUpdater = f867i;
            j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= j6 || atomicLongFieldUpdater.compareAndSet(this, j4, j6)) {
            }
            atomicLongFieldUpdater = f867i;
            j4 = atomicLongFieldUpdater.get(this);
            break;
        } while (atomicLongFieldUpdater.compareAndSet(this, j4, j6));
        if (j5 * ((long) d.f879b) >= p()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        return r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ee, code lost:
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        c(r9, r27, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x017e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012b A[Catch:{ all -> 0x013f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object l(java.lang.Object r27, r2.C0420d r28) {
        /*
            r26 = this;
            r9 = r26
            r0 = r27
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = f870l
            java.lang.Object r1 = r10.get(r9)
            K2.j r1 = (K2.j) r1
        L_0x000c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = f866h
            long r2 = r11.getAndIncrement(r9)
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r14 = r2 & r12
            r8 = 0
            boolean r16 = r9.r(r2, r8)
            int r7 = K2.d.f879b
            long r2 = (long) r7
            long r4 = r14 / r2
            long r2 = r14 % r2
            int r6 = (int) r2
            long r2 = r1.f1221h
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            p2.h r3 = p2.C0368h.f4194a
            s2.a r12 = s2.C0466a.f4632f
            if (r2 == 0) goto L_0x0043
            K2.j r2 = b(r9, r4, r1)
            if (r2 != 0) goto L_0x0041
            if (r16 == 0) goto L_0x000c
            java.lang.Object r0 = r26.w(r27, r28)
            if (r0 != r12) goto L_0x01e2
        L_0x003e:
            r3 = r0
            goto L_0x01e2
        L_0x0041:
            r13 = r2
            goto L_0x0044
        L_0x0043:
            r13 = r1
        L_0x0044:
            r19 = 0
            r1 = r26
            r2 = r13
            r5 = r3
            r3 = r6
            r4 = r27
            r21 = r5
            r20 = r6
            r5 = r14
            r22 = r7
            r7 = r19
            r0 = r8
            r8 = r16
            int r1 = d(r1, r2, r3, r4, r5, r7, r8)
            if (r1 == 0) goto L_0x01dd
            r8 = 1
            if (r1 == r8) goto L_0x008b
            r7 = 2
            if (r1 == r7) goto L_0x01cc
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = f867i
            r6 = 5
            r4 = 4
            r3 = 3
            if (r1 == r3) goto L_0x008f
            if (r1 == r4) goto L_0x0078
            if (r1 == r6) goto L_0x0071
            goto L_0x0074
        L_0x0071:
            r13.a()
        L_0x0074:
            r0 = r27
            r1 = r13
            goto L_0x000c
        L_0x0078:
            long r0 = r5.get(r9)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0083
            r13.a()
        L_0x0083:
            java.lang.Object r3 = r26.w(r27, r28)
            if (r3 != r12) goto L_0x008b
            goto L_0x01e2
        L_0x008b:
            r3 = r21
            goto L_0x01e2
        L_0x008f:
            r2.d r1 = M0.a.y(r28)
            I2.f r2 = I2.C0071w.d(r1)
            r16 = 0
            r1 = r26
            r28 = r2
            r2 = r13
            r3 = r20
            r0 = r4
            r4 = r27
            r23 = r5
            r5 = r14
            r0 = r7
            r7 = r28
            r0 = r8
            r8 = r16
            int r1 = d(r1, r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x01b4
            if (r1 == r0) goto L_0x0176
            r2 = 2
            if (r1 == r2) goto L_0x01aa
            r2 = 4
            if (r1 == r2) goto L_0x0193
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x018b
            r13.a()     // Catch:{ all -> 0x013f }
            java.lang.Object r1 = r10.get(r9)     // Catch:{ all -> 0x013f }
            K2.j r1 = (K2.j) r1     // Catch:{ all -> 0x013f }
        L_0x00c8:
            long r2 = r11.getAndIncrement(r9)     // Catch:{ all -> 0x013f }
            r16 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r24 = r2 & r16
            r4 = 0
            boolean r10 = r9.r(r2, r4)     // Catch:{ all -> 0x013f }
            int r13 = K2.d.f879b     // Catch:{ all -> 0x013f }
            long r2 = (long) r13     // Catch:{ all -> 0x013f }
            long r5 = r24 / r2
            long r2 = r24 % r2
            int r8 = (int) r2     // Catch:{ all -> 0x013f }
            long r2 = r1.f1221h     // Catch:{ all -> 0x013f }
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x010d
            K2.j r2 = b(r9, r5, r1)     // Catch:{ all -> 0x0109 }
            if (r2 != 0) goto L_0x0101
            if (r10 == 0) goto L_0x00fe
            r7 = r27
            r5 = r28
            c(r9, r7, r5)     // Catch:{ all -> 0x00fa }
            r2 = r5
        L_0x00f6:
            r3 = r21
            goto L_0x01bc
        L_0x00fa:
            r0 = move-exception
        L_0x00fb:
            r2 = r5
            goto L_0x01c8
        L_0x00fe:
            r7 = r27
            goto L_0x00c8
        L_0x0101:
            r7 = r27
            r5 = r28
            r18 = r4
            r6 = r2
            goto L_0x0114
        L_0x0109:
            r0 = move-exception
            r5 = r28
            goto L_0x00fb
        L_0x010d:
            r7 = r27
            r5 = r28
            r18 = r4
            r6 = r1
        L_0x0114:
            r1 = r26
            r2 = r6
            r3 = r8
            r4 = r27
            r28 = r5
            r19 = r6
            r5 = r24
            r7 = r28
            r20 = r8
            r8 = r10
            int r1 = d(r1, r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x017e
            if (r1 == r0) goto L_0x0176
            r2 = 2
            if (r1 == r2) goto L_0x0164
            r3 = 3
            if (r1 == r3) goto L_0x0159
            r4 = 4
            if (r1 == r4) goto L_0x0144
            if (r1 == r15) goto L_0x0139
            goto L_0x013c
        L_0x0139:
            r19.a()     // Catch:{ all -> 0x013f }
        L_0x013c:
            r1 = r19
            goto L_0x00c8
        L_0x013f:
            r0 = move-exception
            r2 = r28
            goto L_0x01c8
        L_0x0144:
            r0 = r23
            long r0 = r0.get(r9)     // Catch:{ all -> 0x013f }
            int r0 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0151
            r19.a()     // Catch:{ all -> 0x013f }
        L_0x0151:
            r1 = r27
            r2 = r28
        L_0x0155:
            c(r9, r1, r2)     // Catch:{ all -> 0x0161 }
            goto L_0x00f6
        L_0x0159:
            r2 = r28
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0161 }
            r0.<init>(r14)     // Catch:{ all -> 0x0161 }
            throw r0     // Catch:{ all -> 0x0161 }
        L_0x0161:
            r0 = move-exception
            goto L_0x01c8
        L_0x0164:
            r1 = r27
            r2 = r28
            if (r10 == 0) goto L_0x016e
            r19.h()     // Catch:{ all -> 0x0161 }
            goto L_0x0155
        L_0x016e:
            int r8 = r20 + r13
            r1 = r19
            r2.a(r1, r8)     // Catch:{ all -> 0x0161 }
            goto L_0x00f6
        L_0x0176:
            r2 = r28
            r3 = r21
            r2.m(r3)     // Catch:{ all -> 0x0161 }
            goto L_0x01bc
        L_0x017e:
            r2 = r28
            r1 = r19
            r3 = r21
            r1.a()     // Catch:{ all -> 0x0161 }
        L_0x0187:
            r2.m(r3)     // Catch:{ all -> 0x0161 }
            goto L_0x01bc
        L_0x018b:
            r2 = r28
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0161 }
            r0.<init>(r14)     // Catch:{ all -> 0x0161 }
            throw r0     // Catch:{ all -> 0x0161 }
        L_0x0193:
            r1 = r27
            r2 = r28
            r3 = r21
            r0 = r23
            long r4 = r0.get(r9)     // Catch:{ all -> 0x0161 }
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a6
            r13.a()     // Catch:{ all -> 0x0161 }
        L_0x01a6:
            c(r9, r1, r2)     // Catch:{ all -> 0x0161 }
            goto L_0x01bc
        L_0x01aa:
            r2 = r28
            r3 = r21
            int r6 = r20 + r22
            r2.a(r13, r6)     // Catch:{ all -> 0x0161 }
            goto L_0x01bc
        L_0x01b4:
            r2 = r28
            r3 = r21
            r13.a()     // Catch:{ all -> 0x0161 }
            goto L_0x0187
        L_0x01bc:
            java.lang.Object r0 = r2.u()
            if (r0 != r12) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            r0 = r3
        L_0x01c4:
            if (r0 != r12) goto L_0x01e2
            goto L_0x003e
        L_0x01c8:
            r2.B()
            throw r0
        L_0x01cc:
            r1 = r27
            r3 = r21
            if (r16 == 0) goto L_0x01e2
            r13.h()
            java.lang.Object r0 = r26.w(r27, r28)
            if (r0 != r12) goto L_0x01e2
            goto L_0x003e
        L_0x01dd:
            r3 = r21
            r13.a()
        L_0x01e2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.b.l(java.lang.Object, r2.d):java.lang.Object");
    }

    public final Throwable m() {
        return (Throwable) f873o.get(this);
    }

    public final Throwable n() {
        Throwable m3 = m();
        if (m3 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return m3;
    }

    public final Throwable o() {
        Throwable m3 = m();
        if (m3 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return m3;
    }

    public final long p() {
        return f866h.get(this) & 1152921504606846975L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c6, code lost:
        r0 = (K2.j) ((N2.d) N2.d.f1188g.get(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(long r19, boolean r21) {
        /*
            r18 = this;
            r6 = r18
            r0 = 60
            long r0 = r19 >> r0
            int r0 = (int) r0
            r7 = 0
            if (r0 == 0) goto L_0x0199
            r8 = 1
            if (r0 == r8) goto L_0x0199
            r1 = 2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = f867i
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 == r1) goto L_0x010a
            r1 = 3
            if (r0 != r1) goto L_0x00fa
            long r0 = r19 & r2
            K2.j r0 = r6.g(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0023:
            int r4 = K2.d.f879b
            int r4 = r4 - r8
        L_0x0026:
            r5 = -1
            if (r5 >= r4) goto L_0x00c6
            int r10 = K2.d.f879b
            long r10 = (long) r10
            long r12 = r0.f1221h
            long r12 = r12 * r10
            long r10 = (long) r4
            long r12 = r12 + r10
        L_0x0031:
            java.lang.Object r10 = r0.k(r4)
            B.m r11 = K2.d.f886i
            if (r10 == r11) goto L_0x00d2
            B.m r11 = K2.d.f881d
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r0.f903k
            z2.l r15 = r6.f876g
            if (r10 != r11) goto L_0x0064
            long r16 = r9.get(r6)
            int r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00d2
            B.m r11 = K2.d.f889l
            boolean r10 = r0.j(r4, r10, r11)
            if (r10 == 0) goto L_0x0031
            if (r15 == 0) goto L_0x005d
            int r5 = r4 * 2
            java.lang.Object r5 = r14.get(r5)
            H0.b r2 = N2.a.b(r15, r5, r2)
        L_0x005d:
            r0.m(r4, r1)
            r0.h()
            goto L_0x00c2
        L_0x0064:
            B.m r11 = K2.d.f882e
            if (r10 == r11) goto L_0x00b7
            if (r10 != 0) goto L_0x006b
            goto L_0x00b7
        L_0x006b:
            boolean r11 = r10 instanceof I2.m0
            if (r11 != 0) goto L_0x0080
            boolean r11 = r10 instanceof K2.s
            if (r11 == 0) goto L_0x0074
            goto L_0x0080
        L_0x0074:
            B.m r11 = K2.d.f884g
            if (r10 == r11) goto L_0x00d2
            B.m r14 = K2.d.f883f
            if (r10 != r14) goto L_0x007d
            goto L_0x00d2
        L_0x007d:
            if (r10 == r11) goto L_0x0031
            goto L_0x00c2
        L_0x0080:
            long r16 = r9.get(r6)
            int r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00d2
            boolean r11 = r10 instanceof K2.s
            if (r11 == 0) goto L_0x0092
            r11 = r10
            K2.s r11 = (K2.s) r11
            I2.m0 r11 = r11.f910a
            goto L_0x0095
        L_0x0092:
            r11 = r10
            I2.m0 r11 = (I2.m0) r11
        L_0x0095:
            B.m r5 = K2.d.f889l
            boolean r5 = r0.j(r4, r10, r5)
            if (r5 == 0) goto L_0x00b4
            if (r15 == 0) goto L_0x00a9
            int r5 = r4 * 2
            java.lang.Object r5 = r14.get(r5)
            H0.b r2 = N2.a.b(r15, r5, r2)
        L_0x00a9:
            java.lang.Object r3 = N2.a.g(r3, r11)
            r0.m(r4, r1)
            r0.h()
            goto L_0x00c2
        L_0x00b4:
            r5 = -1
            goto L_0x0031
        L_0x00b7:
            B.m r5 = K2.d.f889l
            boolean r5 = r0.j(r4, r10, r5)
            if (r5 == 0) goto L_0x00b4
            r0.h()
        L_0x00c2:
            int r4 = r4 + -1
            goto L_0x0026
        L_0x00c6:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = N2.d.f1188g
            java.lang.Object r0 = r4.get(r0)
            N2.d r0 = (N2.d) r0
            K2.j r0 = (K2.j) r0
            if (r0 != 0) goto L_0x0023
        L_0x00d2:
            if (r3 == 0) goto L_0x00f4
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x00de
            I2.m0 r3 = (I2.m0) r3
            r6.x(r3, r7)
            goto L_0x00f4
        L_0x00de:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            int r0 = r0 - r8
            r1 = -1
        L_0x00e6:
            if (r1 >= r0) goto L_0x00f4
            java.lang.Object r4 = r3.get(r0)
            I2.m0 r4 = (I2.m0) r4
            r6.x(r4, r7)
            int r0 = r0 + -1
            goto L_0x00e6
        L_0x00f4:
            if (r2 != 0) goto L_0x00f9
        L_0x00f6:
            r7 = r8
            goto L_0x0199
        L_0x00f9:
            throw r2
        L_0x00fa:
            java.lang.String r1 = "unexpected close status: "
            java.lang.String r0 = A2.h.e(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x010a:
            long r0 = r19 & r2
            r6.g(r0)
            if (r21 == 0) goto L_0x00f6
        L_0x0111:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f871m
            java.lang.Object r1 = r0.get(r6)
            K2.j r1 = (K2.j) r1
            long r2 = r9.get(r6)
            long r4 = r18.p()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0126
            goto L_0x0143
        L_0x0126:
            int r4 = K2.d.f879b
            long r4 = (long) r4
            long r10 = r2 / r4
            long r12 = r1.f1221h
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0144
            K2.j r1 = r6.k(r10, r1)
            if (r1 != 0) goto L_0x0144
            java.lang.Object r0 = r0.get(r6)
            K2.j r0 = (K2.j) r0
            long r0 = r0.f1221h
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0111
        L_0x0143:
            goto L_0x00f6
        L_0x0144:
            r1.a()
            long r4 = r2 % r4
            int r0 = (int) r4
        L_0x014a:
            java.lang.Object r4 = r1.k(r0)
            if (r4 == 0) goto L_0x0181
            B.m r5 = K2.d.f882e
            if (r4 != r5) goto L_0x0155
            goto L_0x0181
        L_0x0155:
            B.m r0 = K2.d.f881d
            if (r4 != r0) goto L_0x015a
            goto L_0x0199
        L_0x015a:
            B.m r0 = K2.d.f887j
            if (r4 != r0) goto L_0x015f
            goto L_0x018c
        L_0x015f:
            B.m r0 = K2.d.f889l
            if (r4 != r0) goto L_0x0164
            goto L_0x018c
        L_0x0164:
            B.m r0 = K2.d.f886i
            if (r4 != r0) goto L_0x0169
            goto L_0x018c
        L_0x0169:
            B.m r0 = K2.d.f885h
            if (r4 != r0) goto L_0x016e
            goto L_0x018c
        L_0x016e:
            B.m r0 = K2.d.f884g
            if (r4 != r0) goto L_0x0173
            goto L_0x0199
        L_0x0173:
            B.m r0 = K2.d.f883f
            if (r4 != r0) goto L_0x0178
            goto L_0x018c
        L_0x0178:
            long r0 = r9.get(r6)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x018c
            goto L_0x0199
        L_0x0181:
            B.m r5 = K2.d.f885h
            boolean r4 = r1.j(r0, r4, r5)
            if (r4 == 0) goto L_0x014a
            r18.j()
        L_0x018c:
            r0 = 1
            long r4 = r2 + r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f867i
            r1 = r18
            r0.compareAndSet(r1, r2, r4)
            goto L_0x0111
        L_0x0199:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.b.r(long, boolean):boolean");
    }

    public final boolean s() {
        return r(f866h.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [N2.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019a, code lost:
        r3 = r3.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a1, code lost:
        if (r3 != null) goto L_0x01d4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f866h
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 2
            r4 = 3
            if (r2 == r3) goto L_0x001e
            if (r2 == r4) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0023
        L_0x001e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "capacity="
            r2.<init>(r5)
            int r5 = r0.f875f
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            K2.j[] r2 = new K2.j[r4]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f871m
            java.lang.Object r4 = r4.get(r0)
            r6 = 0
            r2[r6] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f870l
            java.lang.Object r4 = r4.get(r0)
            r7 = 1
            r2[r7] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f872n
            java.lang.Object r4 = r4.get(r0)
            r2[r3] = r4
            java.util.List r2 = q2.C0402e.b0(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r2.next()
            r8 = r4
            K2.j r8 = (K2.j) r8
            K2.j r9 = K2.d.f878a
            if (r8 == r9) goto L_0x0069
            r3.add(r4)
            goto L_0x0069
        L_0x007e:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01d8
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0093
            goto L_0x00ad
        L_0x0093:
            r4 = r3
            K2.j r4 = (K2.j) r4
            long r8 = r4.f1221h
        L_0x0098:
            java.lang.Object r4 = r2.next()
            r10 = r4
            K2.j r10 = (K2.j) r10
            long r10 = r10.f1221h
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00a7
            r3 = r4
            r8 = r10
        L_0x00a7:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0098
        L_0x00ad:
            K2.j r3 = (K2.j) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f867i
            long r10 = r2.get(r0)
            long r12 = r16.p()
        L_0x00b9:
            int r2 = K2.d.f879b
            r4 = r6
        L_0x00bc:
            if (r4 >= r2) goto L_0x019a
            long r8 = r3.f1221h
            int r14 = K2.d.f879b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00ce
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01a3
        L_0x00ce:
            java.lang.Object r15 = r3.k(r4)
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r3.f903k
            int r7 = r4 * 2
            java.lang.Object r6 = r6.get(r7)
            boolean r7 = r15 instanceof I2.C0054e
            if (r7 == 0) goto L_0x00f4
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e8
            if (r14 < 0) goto L_0x00e8
            java.lang.String r7 = "receive"
            goto L_0x0163
        L_0x00e8:
            if (r14 >= 0) goto L_0x00f0
            if (r7 < 0) goto L_0x00f0
            java.lang.String r7 = "send"
            goto L_0x0163
        L_0x00f0:
            java.lang.String r7 = "cont"
            goto L_0x0163
        L_0x00f4:
            boolean r7 = r15 instanceof K2.s
            if (r7 == 0) goto L_0x010c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "EB("
            r7.<init>(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x0163
        L_0x010c:
            B.m r7 = K2.d.f883f
            boolean r7 = A2.i.a(r15, r7)
            if (r7 == 0) goto L_0x0116
            r7 = 1
            goto L_0x011c
        L_0x0116:
            B.m r7 = K2.d.f884g
            boolean r7 = A2.i.a(r15, r7)
        L_0x011c:
            if (r7 == 0) goto L_0x0121
            java.lang.String r7 = "resuming_sender"
            goto L_0x0163
        L_0x0121:
            if (r15 != 0) goto L_0x0125
            r7 = 1
            goto L_0x012b
        L_0x0125:
            B.m r7 = K2.d.f882e
            boolean r7 = r15.equals(r7)
        L_0x012b:
            if (r7 == 0) goto L_0x012f
            r7 = 1
            goto L_0x0135
        L_0x012f:
            B.m r7 = K2.d.f886i
            boolean r7 = A2.i.a(r15, r7)
        L_0x0135:
            if (r7 == 0) goto L_0x0139
            r7 = 1
            goto L_0x013f
        L_0x0139:
            B.m r7 = K2.d.f885h
            boolean r7 = A2.i.a(r15, r7)
        L_0x013f:
            if (r7 == 0) goto L_0x0143
            r7 = 1
            goto L_0x0149
        L_0x0143:
            B.m r7 = K2.d.f888k
            boolean r7 = A2.i.a(r15, r7)
        L_0x0149:
            if (r7 == 0) goto L_0x014d
            r7 = 1
            goto L_0x0153
        L_0x014d:
            B.m r7 = K2.d.f887j
            boolean r7 = A2.i.a(r15, r7)
        L_0x0153:
            if (r7 == 0) goto L_0x0157
            r7 = 1
            goto L_0x015d
        L_0x0157:
            B.m r7 = K2.d.f889l
            boolean r7 = A2.i.a(r15, r7)
        L_0x015d:
            if (r7 != 0) goto L_0x0194
            java.lang.String r7 = r15.toString()
        L_0x0163:
            if (r6 == 0) goto L_0x0182
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "("
            r8.<init>(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x0194
        L_0x0182:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x0194:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00bc
        L_0x019a:
            N2.d r2 = r3.b()
            r3 = r2
            K2.j r3 = (K2.j) r3
            if (r3 != 0) goto L_0x01d4
        L_0x01a3:
            int r2 = r1.length()
            if (r2 == 0) goto L_0x01cc
            int r2 = H2.l.c0(r1)
            char r2 = r1.charAt(r2)
            if (r2 != r5) goto L_0x01c2
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            A2.i.d(r2, r3)
        L_0x01c2:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x01cc:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Char sequence is empty."
            r1.<init>(r2)
            throw r1
        L_0x01d4:
            r6 = 0
            r7 = 1
            goto L_0x00b9
        L_0x01d8:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.b.toString():java.lang.String");
    }

    public final boolean u() {
        long j3 = f868j.get(this);
        if (j3 == 0 || j3 == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final void v(long j3, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f1221h < j3 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f872n;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1221h < jVar.f1221h) {
                        if (!jVar.i()) {
                            continue;
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, jVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (jVar.e()) {
                                    jVar.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            jVar = jVar2;
        }
    }

    public final Object w(Object obj, C0420d dVar) {
        H0.b b3;
        C0055f fVar = new C0055f(1, M0.a.y(dVar));
        fVar.v();
        l lVar = this.f876g;
        if (lVar == null || (b3 = a.b(lVar, obj, (H0.b) null)) == null) {
            fVar.m(M0.a.h(o()));
        } else {
            android.support.v4.media.session.a.c(b3, o());
            fVar.m(M0.a.h(b3));
        }
        Object u3 = fVar.u();
        if (u3 == C0466a.f4632f) {
            return u3;
        }
        return C0368h.f4194a;
    }

    public final void x(m0 m0Var, boolean z3) {
        Throwable th;
        if (m0Var instanceof C0054e) {
            C0420d dVar = (C0420d) m0Var;
            if (z3) {
                th = n();
            } else {
                th = o();
            }
            dVar.m(M0.a.h(th));
        } else if (m0Var instanceof a) {
            a aVar = (a) m0Var;
            C0055f fVar = aVar.f864g;
            i.b(fVar);
            aVar.f864g = null;
            aVar.f863f = d.f889l;
            Throwable m3 = aVar.f865h.m();
            if (m3 == null) {
                fVar.m(Boolean.FALSE);
            } else {
                fVar.m(M0.a.h(m3));
            }
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + m0Var).toString());
        }
    }

    public final boolean y(Object obj, Object obj2) {
        p pVar = null;
        if (obj instanceof a) {
            i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            a aVar = (a) obj;
            C0055f fVar = aVar.f864g;
            i.b(fVar);
            aVar.f864g = null;
            aVar.f863f = obj2;
            Boolean bool = Boolean.TRUE;
            l lVar = aVar.f865h.f876g;
            if (lVar != null) {
                pVar = new p(lVar, obj2, fVar.f761j);
            }
            return d.a(fVar, bool, pVar);
        } else if (obj instanceof C0054e) {
            i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            C0054e eVar = (C0054e) obj;
            l lVar2 = this.f876g;
            if (lVar2 != null) {
                pVar = new p(lVar2, obj2, eVar.h());
            }
            return d.a(eVar, obj2, pVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }
}
