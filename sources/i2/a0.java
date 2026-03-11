package I2;

import A2.i;
import B.m;
import H0.b;
import N2.k;
import N2.q;
import android.support.v4.media.session.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r2.C0418b;
import r2.C0423g;
import r2.C0424h;
import r2.C0425i;
import r2.C0426j;
import z2.l;
import z2.p;

public class a0 implements Q, e0 {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f750f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f751g;
    private volatile Object _parentHandle;
    private volatile Object _state;

    static {
        Class<a0> cls = a0.class;
        Class<Object> cls2 = Object.class;
        f750f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f751g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public a0(boolean z3) {
        F f3;
        if (z3) {
            f3 = C0071w.f795i;
        } else {
            f3 = C0071w.f794h;
        }
        this._state = f3;
    }

    public static C0059j M(k kVar) {
        while (kVar.m()) {
            k g2 = kVar.g();
            if (g2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f1203g;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (k) obj;
                    if (!kVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = g2;
            }
        }
        while (true) {
            kVar = kVar.l();
            if (!kVar.m()) {
                if (kVar instanceof C0059j) {
                    return (C0059j) kVar;
                }
                if (kVar instanceof b0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (obj instanceof Y) {
            Y y2 = (Y) obj;
            if (y2.d()) {
                return "Cancelling";
            }
            if (y2.e()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof M) {
            if (((M) obj).b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C0063n) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException A() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.E()
            boolean r1 = r0 instanceof I2.Y
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x004c
            I2.Y r0 = (I2.Y) r0
            java.lang.Throwable r0 = r0.c()
            if (r0 == 0) goto L_0x0036
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " is cancelling"
            java.lang.String r1 = r1.concat(r3)
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0028
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0028:
            if (r2 != 0) goto L_0x0080
            I2.S r2 = new I2.S
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r4.v()
        L_0x0032:
            r2.<init>(r1, r0, r4)
            goto L_0x0080
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x004c:
            boolean r1 = r0 instanceof I2.M
            if (r1 != 0) goto L_0x0081
            boolean r1 = r0 instanceof I2.C0063n
            if (r1 == 0) goto L_0x006c
            I2.n r0 = (I2.C0063n) r0
            java.lang.Throwable r0 = r0.f775a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x005f
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x005f:
            if (r2 != 0) goto L_0x0080
            I2.S r1 = new I2.S
            java.lang.String r2 = r4.v()
            r1.<init>(r2, r0, r4)
            r2 = r1
            goto L_0x0080
        L_0x006c:
            I2.S r0 = new I2.S
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " has completed normally"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1, r2, r4)
            r2 = r0
        L_0x0080:
            return r2
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.a0.A():java.util.concurrent.CancellationException");
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof C0061l;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [N2.k, I2.b0] */
    public final b0 D(M m3) {
        b0 f3 = m3.f();
        if (f3 != null) {
            return f3;
        }
        if (m3 instanceof F) {
            return new k();
        }
        if (m3 instanceof V) {
            Q((V) m3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + m3).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = f750f.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public final void H(Q q3) {
        int R3;
        c0 c0Var = c0.f755f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f751g;
        if (q3 == null) {
            atomicReferenceFieldUpdater.set(this, c0Var);
            return;
        }
        a0 a0Var = (a0) q3;
        do {
            R3 = a0Var.R(a0Var.E());
            if (R3 == 0) {
                break;
            }
        } while (R3 != 1);
        C0058i iVar = (C0058i) C0071w.f(a0Var, true, new C0059j(this), 2);
        atomicReferenceFieldUpdater.set(this, iVar);
        if (!(E() instanceof M)) {
            iVar.c();
            atomicReferenceFieldUpdater.set(this, c0Var);
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [N2.k, I2.b0] */
    public final D I(boolean z3, boolean z4, l lVar) {
        V v;
        C0063n nVar;
        Throwable th;
        L l3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        V v3;
        Throwable th2 = null;
        if (z3) {
            if (lVar instanceof T) {
                v = (T) lVar;
            } else {
                v = null;
            }
            if (v == null) {
                v = new O(lVar);
            }
        } else {
            if (lVar instanceof V) {
                v3 = (V) lVar;
            } else {
                v3 = null;
            }
            if (v == null) {
                v = new P(0, lVar);
            }
        }
        v.f735i = this;
        while (true) {
            Object E3 = E();
            if (E3 instanceof F) {
                F f3 = (F) E3;
                if (!f3.f718f) {
                    ? kVar = new k();
                    if (f3.f718f) {
                        l3 = kVar;
                    } else {
                        l3 = new L(kVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = f750f;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, f3, l3)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == f3);
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f750f;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, E3, v)) {
                        if (atomicReferenceFieldUpdater2.get(this) != E3) {
                        }
                    }
                    return v;
                }
            } else if (E3 instanceof M) {
                b0 f4 = ((M) E3).f();
                if (f4 == null) {
                    i.c(E3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((V) E3);
                } else {
                    D d3 = c0.f755f;
                    if (!z3 || !(E3 instanceof Y)) {
                        th = null;
                    } else {
                        synchronized (E3) {
                            try {
                                th = ((Y) E3).c();
                                if (th != null) {
                                    if ((lVar instanceof C0059j) && !((Y) E3).e()) {
                                    }
                                }
                                if (p((M) E3, f4, v)) {
                                    if (th == null) {
                                        return v;
                                    }
                                    d3 = v;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    if (th != null) {
                        if (z4) {
                            lVar.j(th);
                        }
                        return d3;
                    } else if (p((M) E3, f4, v)) {
                        return v;
                    }
                }
            } else {
                if (z4) {
                    if (E3 instanceof C0063n) {
                        nVar = (C0063n) E3;
                    } else {
                        nVar = null;
                    }
                    if (nVar != null) {
                        th2 = nVar.f775a;
                    }
                    lVar.j(th2);
                }
                return c0.f755f;
            }
        }
    }

    public boolean J() {
        return this instanceof C0052c;
    }

    public final boolean K(Object obj) {
        Object T3;
        do {
            T3 = T(E(), obj);
            if (T3 == C0071w.f789c) {
                return false;
            }
            if (T3 == C0071w.f790d) {
                return true;
            }
        } while (T3 == C0071w.f791e);
        q(T3);
        return true;
    }

    public final Object L(Object obj) {
        Object T3;
        C0063n nVar;
        do {
            T3 = T(E(), obj);
            if (T3 == C0071w.f789c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0063n) {
                    nVar = (C0063n) obj;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    th = nVar.f775a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (T3 == C0071w.f791e);
        return T3;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(I2.b0 r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.k()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            A2.i.c(r0, r1)
            N2.k r0 = (N2.k) r0
            r1 = 0
        L_0x000c:
            boolean r2 = r0.equals(r7)
            if (r2 != 0) goto L_0x0044
            boolean r2 = r0 instanceof I2.T
            if (r2 == 0) goto L_0x003f
            r2 = r0
            I2.V r2 = (I2.V) r2
            r2.o(r8)     // Catch:{ all -> 0x001d }
            goto L_0x003f
        L_0x001d:
            r3 = move-exception
            if (r1 == 0) goto L_0x0024
            android.support.v4.media.session.a.c(r1, r3)
            goto L_0x003f
        L_0x0024:
            H0.b r1 = new H0.b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception in completion handler "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r3)
        L_0x003f:
            N2.k r0 = r0.l()
            goto L_0x000c
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r6.G(r1)
        L_0x0049:
            r6.u(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.a0.N(I2.b0, java.lang.Throwable):void");
    }

    public final void Q(V v) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k kVar = new k();
        v.getClass();
        k.f1203g.lazySet(kVar, v);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f1202f;
        atomicReferenceFieldUpdater2.lazySet(kVar, v);
        loop0:
        while (true) {
            if (v.k() != v) {
                break;
            }
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(v, v, kVar)) {
                    kVar.h(v);
                    break loop0;
                } else if (atomicReferenceFieldUpdater2.get(v) != v) {
                }
            }
        }
        k l3 = v.l();
        do {
            atomicReferenceFieldUpdater = f750f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, v, l3) || atomicReferenceFieldUpdater.get(this) != v) {
            }
            atomicReferenceFieldUpdater = f750f;
            return;
        } while (atomicReferenceFieldUpdater.get(this) != v);
    }

    public final int R(Object obj) {
        boolean z3 = obj instanceof F;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f750f;
        if (z3) {
            if (((F) obj).f718f) {
                return 0;
            }
            F f3 = C0071w.f795i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        } else if (!(obj instanceof L)) {
            return 0;
        } else {
            b0 b0Var = ((L) obj).f727f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a4, code lost:
        if (r5 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a6, code lost:
        N(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ab, code lost:
        if ((r7 instanceof I2.C0059j) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ad, code lost:
        r0 = (I2.C0059j) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b1, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b2, code lost:
        if (r0 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b4, code lost:
        r7 = r7.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b8, code lost:
        if (r7 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ba, code lost:
        r2 = M(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00bf, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c0, code lost:
        if (r2 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d0, code lost:
        if (I2.C0071w.f(r2.f765j, false, new I2.X(r6, r1, r2, r8), 1) == I2.c0.f755f) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d5, code lost:
        r2 = M(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d9, code lost:
        if (r2 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return z(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return I2.C0071w.f790d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof I2.M
            if (r0 != 0) goto L_0x0007
            B.m r7 = I2.C0071w.f789c
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof I2.F
            if (r0 != 0) goto L_0x000f
            boolean r0 = r7 instanceof I2.V
            if (r0 == 0) goto L_0x0041
        L_0x000f:
            boolean r0 = r7 instanceof I2.C0059j
            if (r0 != 0) goto L_0x0041
            boolean r0 = r8 instanceof I2.C0063n
            if (r0 != 0) goto L_0x0041
            r0 = r7
            I2.M r0 = (I2.M) r0
            boolean r7 = r8 instanceof I2.M
            if (r7 == 0) goto L_0x0028
            I2.N r7 = new I2.N
            r1 = r8
            I2.M r1 = (I2.M) r1
            r7.<init>(r1)
            r1 = r7
            goto L_0x0029
        L_0x0028:
            r1 = r8
        L_0x0029:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f750f
            boolean r2 = r7.compareAndSet(r6, r0, r1)
            if (r2 == 0) goto L_0x0038
            r6.O(r8)
            r6.x(r0, r8)
            return r8
        L_0x0038:
            java.lang.Object r7 = r7.get(r6)
            if (r7 == r0) goto L_0x0029
            B.m r7 = I2.C0071w.f791e
            return r7
        L_0x0041:
            I2.M r7 = (I2.M) r7
            I2.b0 r0 = r6.D(r7)
            if (r0 != 0) goto L_0x004d
            B.m r7 = I2.C0071w.f791e
            goto L_0x00df
        L_0x004d:
            boolean r1 = r7 instanceof I2.Y
            r2 = 0
            if (r1 == 0) goto L_0x0056
            r1 = r7
            I2.Y r1 = (I2.Y) r1
            goto L_0x0057
        L_0x0056:
            r1 = r2
        L_0x0057:
            if (r1 != 0) goto L_0x005e
            I2.Y r1 = new I2.Y
            r1.<init>(r0, r2)
        L_0x005e:
            monitor-enter(r1)
            boolean r3 = r1.e()     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x006a
            B.m r7 = I2.C0071w.f789c     // Catch:{ all -> 0x0085 }
            monitor-exit(r1)
            goto L_0x00df
        L_0x006a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = I2.Y.f741g     // Catch:{ all -> 0x0085 }
            r4 = 1
            r3.set(r1, r4)     // Catch:{ all -> 0x0085 }
            if (r1 == r7) goto L_0x0087
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f750f     // Catch:{ all -> 0x0085 }
        L_0x0074:
            boolean r5 = r3.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x0085 }
            if (r5 == 0) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            java.lang.Object r5 = r3.get(r6)     // Catch:{ all -> 0x0085 }
            if (r5 == r7) goto L_0x0074
            B.m r7 = I2.C0071w.f791e     // Catch:{ all -> 0x0085 }
            monitor-exit(r1)
            goto L_0x00df
        L_0x0085:
            r7 = move-exception
            goto L_0x00e0
        L_0x0087:
            boolean r3 = r1.d()     // Catch:{ all -> 0x0085 }
            boolean r5 = r8 instanceof I2.C0063n     // Catch:{ all -> 0x0085 }
            if (r5 == 0) goto L_0x0093
            r5 = r8
            I2.n r5 = (I2.C0063n) r5     // Catch:{ all -> 0x0085 }
            goto L_0x0094
        L_0x0093:
            r5 = r2
        L_0x0094:
            if (r5 == 0) goto L_0x009b
            java.lang.Throwable r5 = r5.f775a     // Catch:{ all -> 0x0085 }
            r1.a(r5)     // Catch:{ all -> 0x0085 }
        L_0x009b:
            java.lang.Throwable r5 = r1.c()     // Catch:{ all -> 0x0085 }
            if (r3 != 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r5 = r2
        L_0x00a3:
            monitor-exit(r1)
            if (r5 == 0) goto L_0x00a9
            r6.N(r0, r5)
        L_0x00a9:
            boolean r0 = r7 instanceof I2.C0059j
            if (r0 == 0) goto L_0x00b1
            r0 = r7
            I2.j r0 = (I2.C0059j) r0
            goto L_0x00b2
        L_0x00b1:
            r0 = r2
        L_0x00b2:
            if (r0 != 0) goto L_0x00bf
            I2.b0 r7 = r7.f()
            if (r7 == 0) goto L_0x00c0
            I2.j r2 = M(r7)
            goto L_0x00c0
        L_0x00bf:
            r2 = r0
        L_0x00c0:
            if (r2 == 0) goto L_0x00db
        L_0x00c2:
            I2.a0 r7 = r2.f765j
            I2.X r0 = new I2.X
            r0.<init>(r6, r1, r2, r8)
            r3 = 0
            I2.D r7 = I2.C0071w.f(r7, r3, r0, r4)
            I2.c0 r0 = I2.c0.f755f
            if (r7 == r0) goto L_0x00d5
            B.m r7 = I2.C0071w.f790d
            goto L_0x00df
        L_0x00d5:
            I2.j r2 = M(r2)
            if (r2 != 0) goto L_0x00c2
        L_0x00db:
            java.lang.Object r7 = r6.z(r1, r8)
        L_0x00df:
            return r7
        L_0x00e0:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.a0.T(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new S(v(), (Throwable) null, this);
        }
        t(cancellationException);
    }

    public boolean b() {
        Object E3 = E();
        if (!(E3 instanceof M) || !((M) E3).b()) {
            return false;
        }
        return true;
    }

    public final C0425i c(C0424h hVar) {
        return a.y(this, hVar);
    }

    public final C0425i d(C0425i iVar) {
        i.e(iVar, "context");
        if (iVar == C0426j.f4457f) {
            return this;
        }
        return (C0425i) iVar.e(this, new C0418b(1));
    }

    public final Object e(Object obj, p pVar) {
        return pVar.i(obj, this);
    }

    public final C0424h getKey() {
        return C0068t.f786g;
    }

    public final C0423g n(C0424h hVar) {
        return a.s(this, hVar);
    }

    public final boolean p(M m3, b0 b0Var, V v) {
        boolean z3;
        Z z4 = new Z(v, this, m3);
        do {
            k g2 = b0Var.g();
            if (g2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f1203g;
                Object obj = atomicReferenceFieldUpdater.get(b0Var);
                while (true) {
                    g2 = (k) obj;
                    if (!g2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(g2);
                }
            }
            k.f1203g.lazySet(v, g2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f1202f;
            atomicReferenceFieldUpdater2.lazySet(v, b0Var);
            z4.f746c = b0Var;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(g2, b0Var, z4)) {
                    if (atomicReferenceFieldUpdater2.get(g2) != b0Var) {
                        z3 = false;
                        break;
                    }
                } else if (z4.a(g2) == null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
            }
            if (z3) {
                return true;
            }
        } while (!z3);
        return false;
    }

    public void r(Object obj) {
        q(obj);
    }

    public final boolean s(Object obj) {
        boolean z3;
        m mVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m mVar2 = C0071w.f789c;
        if (C()) {
            while (true) {
                Object E3 = E();
                if ((E3 instanceof M) && (!(E3 instanceof Y) || !((Y) E3).e())) {
                    mVar2 = T(E3, new C0063n(y(obj), false));
                    if (mVar2 != C0071w.f791e) {
                        break;
                    }
                } else {
                    mVar2 = C0071w.f789c;
                }
            }
            if (mVar2 == C0071w.f790d) {
                return true;
            }
        }
        if (mVar2 == C0071w.f789c) {
            Throwable th = null;
            Throwable th2 = null;
            loop1:
            while (true) {
                Object E4 = E();
                if (!(E4 instanceof Y)) {
                    if (!(E4 instanceof M)) {
                        mVar = C0071w.f792f;
                        break;
                    }
                    if (th2 == null) {
                        th2 = y(obj);
                    }
                    M m3 = (M) E4;
                    if (m3.b()) {
                        b0 D3 = D(m3);
                        if (D3 == null) {
                            continue;
                        } else {
                            Y y2 = new Y(D3, th2);
                            do {
                                atomicReferenceFieldUpdater = f750f;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, m3, y2)) {
                                    N(D3, th2);
                                    mVar = C0071w.f789c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == m3);
                        }
                    } else {
                        Object T3 = T(E4, new C0063n(th2, false));
                        if (T3 == C0071w.f789c) {
                            throw new IllegalStateException(("Cannot happen in " + E4).toString());
                        } else if (T3 != C0071w.f791e) {
                            mVar2 = T3;
                            break;
                        }
                    }
                } else {
                    synchronized (E4) {
                        try {
                            Y y3 = (Y) E4;
                            y3.getClass();
                            if (Y.f743i.get(y3) == C0071w.f793g) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                mVar = C0071w.f792f;
                            } else {
                                boolean d3 = ((Y) E4).d();
                                if (th2 == null) {
                                    th2 = y(obj);
                                }
                                ((Y) E4).a(th2);
                                Throwable c3 = ((Y) E4).c();
                                if (!d3) {
                                    th = c3;
                                }
                                if (th != null) {
                                    N(((Y) E4).f744f, th);
                                }
                                mVar = C0071w.f789c;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            mVar2 = mVar;
        }
        if (!(mVar2 == C0071w.f789c || mVar2 == C0071w.f790d)) {
            if (mVar2 == C0071w.f792f) {
                return false;
            }
            q(mVar2);
        }
        return true;
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + S(E()) + '}');
        sb.append('@');
        sb.append(C0071w.c(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        C0058i iVar = (C0058i) f751g.get(this);
        if (iVar == null || iVar == c0.f755f) {
            return z3;
        }
        if (iVar.e(th) || z3) {
            return true;
        }
        return false;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!s(th) || !B()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.RuntimeException, H0.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(I2.M r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f751g
            java.lang.Object r1 = r0.get(r7)
            I2.i r1 = (I2.C0058i) r1
            if (r1 == 0) goto L_0x0012
            r1.c()
            I2.c0 r1 = I2.c0.f755f
            r0.set(r7, r1)
        L_0x0012:
            boolean r0 = r9 instanceof I2.C0063n
            r1 = 0
            if (r0 == 0) goto L_0x001a
            I2.n r9 = (I2.C0063n) r9
            goto L_0x001b
        L_0x001a:
            r9 = r1
        L_0x001b:
            if (r9 == 0) goto L_0x0020
            java.lang.Throwable r9 = r9.f775a
            goto L_0x0021
        L_0x0020:
            r9 = r1
        L_0x0021:
            boolean r0 = r8 instanceof I2.V
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L_0x004c
            r0 = r8
            I2.V r0 = (I2.V) r0     // Catch:{ all -> 0x0030 }
            r0.o(r9)     // Catch:{ all -> 0x0030 }
            goto L_0x0096
        L_0x0030:
            r9 = move-exception
            H0.b r0 = new H0.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r8)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8, r9)
            r7.G(r0)
            goto L_0x0096
        L_0x004c:
            I2.b0 r8 = r8.f()
            if (r8 == 0) goto L_0x0096
            java.lang.Object r0 = r8.k()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            A2.i.c(r0, r4)
            N2.k r0 = (N2.k) r0
        L_0x005d:
            boolean r4 = r0.equals(r8)
            if (r4 != 0) goto L_0x0091
            boolean r4 = r0 instanceof I2.V
            if (r4 == 0) goto L_0x008c
            r4 = r0
            I2.V r4 = (I2.V) r4
            r4.o(r9)     // Catch:{ all -> 0x006e }
            goto L_0x008c
        L_0x006e:
            r5 = move-exception
            if (r1 == 0) goto L_0x0075
            android.support.v4.media.session.a.c(r1, r5)
            goto L_0x008c
        L_0x0075:
            H0.b r1 = new H0.b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r4)
            r6.append(r2)
            r6.append(r7)
            java.lang.String r4 = r6.toString()
            r1.<init>(r4, r5)
        L_0x008c:
            N2.k r0 = r0.l()
            goto L_0x005d
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r7.G(r1)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.a0.x(I2.M, java.lang.Object):void");
    }

    public final Throwable y(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        a0 a0Var = (a0) ((e0) obj);
        Object E3 = a0Var.E();
        CancellationException cancellationException = null;
        if (E3 instanceof Y) {
            th = ((Y) E3).c();
        } else if (E3 instanceof C0063n) {
            th = ((C0063n) E3).f775a;
        } else if (!(E3 instanceof M)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + E3).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException == null) {
            cancellationException = new S("Parent job is ".concat(S(E3)), th, a0Var);
        }
        return cancellationException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4 A[LOOP:2: B:54:0x00c4->B:57:0x00cf, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(I2.Y r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof I2.C0063n
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r10
            I2.n r0 = (I2.C0063n) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000f
            java.lang.Throwable r0 = r0.f775a
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            monitor-enter(r9)
            r9.d()     // Catch:{ all -> 0x00d5 }
            java.util.ArrayList r2 = r9.g(r0)     // Catch:{ all -> 0x00d5 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x00d5 }
            r4 = 0
            if (r3 == 0) goto L_0x0030
            boolean r3 = r9.d()     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x0051
            I2.S r3 = new I2.S     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = r8.v()     // Catch:{ all -> 0x00d5 }
            r3.<init>(r5, r1, r8)     // Catch:{ all -> 0x00d5 }
            r1 = r3
            goto L_0x0051
        L_0x0030:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x0034:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00d5 }
            r6 = r5
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00d5 }
            boolean r6 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00d5 }
            if (r6 != 0) goto L_0x0034
            r1 = r5
        L_0x0046:
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            java.lang.Object r1 = r2.get(r4)     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00d5 }
        L_0x0051:
            r3 = 1
            if (r1 == 0) goto L_0x008a
            int r5 = r2.size()     // Catch:{ all -> 0x00d5 }
            if (r5 > r3) goto L_0x005b
            goto L_0x008a
        L_0x005b:
            int r5 = r2.size()     // Catch:{ all -> 0x00d5 }
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00d5 }
            r6.<init>(r5)     // Catch:{ all -> 0x00d5 }
            java.util.Set r5 = java.util.Collections.newSetFromMap(r6)     // Catch:{ all -> 0x00d5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x006c:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00d5 }
            if (r6 == r1) goto L_0x006c
            if (r6 == r1) goto L_0x006c
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00d5 }
            if (r7 != 0) goto L_0x006c
            boolean r7 = r5.add(r6)     // Catch:{ all -> 0x00d5 }
            if (r7 == 0) goto L_0x006c
            android.support.v4.media.session.a.c(r1, r6)     // Catch:{ all -> 0x00d5 }
            goto L_0x006c
        L_0x008a:
            monitor-exit(r9)
            if (r1 != 0) goto L_0x008e
            goto L_0x0096
        L_0x008e:
            if (r1 != r0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            I2.n r10 = new I2.n
            r10.<init>(r1, r4)
        L_0x0096:
            if (r1 == 0) goto L_0x00b1
            boolean r0 = r8.u(r1)
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r8.F(r1)
            if (r0 == 0) goto L_0x00b1
        L_0x00a4:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            A2.i.c(r10, r0)
            r0 = r10
            I2.n r0 = (I2.C0063n) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = I2.C0063n.f774b
            r1.compareAndSet(r0, r4, r3)
        L_0x00b1:
            r8.O(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f750f
            boolean r1 = r10 instanceof I2.M
            if (r1 == 0) goto L_0x00c3
            I2.N r1 = new I2.N
            r2 = r10
            I2.M r2 = (I2.M) r2
            r1.<init>(r2)
            goto L_0x00c4
        L_0x00c3:
            r1 = r10
        L_0x00c4:
            boolean r2 = r0.compareAndSet(r8, r9, r1)
            if (r2 == 0) goto L_0x00cb
            goto L_0x00d1
        L_0x00cb:
            java.lang.Object r2 = r0.get(r8)
            if (r2 == r9) goto L_0x00c4
        L_0x00d1:
            r8.x(r9, r10)
            return r10
        L_0x00d5:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.a0.z(I2.Y, java.lang.Object):java.lang.Object");
    }

    public void P() {
    }

    public void G(b bVar) {
        throw bVar;
    }

    public void O(Object obj) {
    }

    public void q(Object obj) {
    }
}
