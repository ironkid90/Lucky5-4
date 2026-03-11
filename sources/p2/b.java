package P2;

import A2.h;
import A2.i;
import B.m;
import I2.C0071w;
import L.j;
import N2.l;
import N2.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class b implements Executor, Closeable {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1252m;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1253n;

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1254o;

    /* renamed from: p  reason: collision with root package name */
    public static final m f1255p = new m(11, (Object) "NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: f  reason: collision with root package name */
    public final int f1256f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1257g;

    /* renamed from: h  reason: collision with root package name */
    public final long f1258h;

    /* renamed from: i  reason: collision with root package name */
    public final String f1259i;

    /* renamed from: j  reason: collision with root package name */
    public final e f1260j;

    /* renamed from: k  reason: collision with root package name */
    public final e f1261k;

    /* renamed from: l  reason: collision with root package name */
    public final s f1262l;
    private volatile long parkedWorkersStack;

    static {
        Class<b> cls = b.class;
        f1252m = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f1253n = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f1254o = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [N2.l, P2.e] */
    /* JADX WARNING: type inference failed for: r4v11, types: [N2.l, P2.e] */
    public b(int i3, int i4, long j3, String str) {
        this.f1256f = i3;
        this.f1257g = i4;
        this.f1258h = j3;
        this.f1259i = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i3 + " should be at least 1").toString());
        } else if (i4 < i3) {
            throw new IllegalArgumentException(h.f("Max pool size ", i4, " should be greater than or equals to core pool size ", i3).toString());
        } else if (i4 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j3 > 0) {
            this.f1260j = new l();
            this.f1261k = new l();
            this.f1262l = new s((i3 + 1) * 2);
            this.controlState = ((long) i3) << 42;
            this._isTerminated = 0;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
    }

    public final int a() {
        boolean z3;
        synchronized (this.f1262l) {
            try {
                if (f1254o.get(this) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1253n;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f1256f) {
                    return 0;
                }
                if (i3 >= this.f1257g) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f1262l.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i5);
                this.f1262l.c(i5, aVar);
                if (i5 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i6 = i4 + 1;
                    aVar.start();
                    return i6;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar, boolean z3) {
        h hVar;
        boolean z4;
        long j3;
        a aVar;
        boolean z5;
        int i3;
        k.f1277f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            hVar = (h) runnable;
            hVar.f1268f = nanoTime;
            hVar.f1269g = iVar;
        } else {
            hVar = new j(runnable, nanoTime, iVar);
        }
        boolean z6 = false;
        if (hVar.f1269g.f1270a == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1253n;
        if (z4) {
            j3 = atomicLongFieldUpdater.addAndGet(this, 2097152);
        } else {
            j3 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !i.a(aVar.f1251m, this)) {
            aVar = null;
        }
        if (!(aVar == null || (i3 = aVar.f1246h) == 5 || (hVar.f1269g.f1270a == 0 && i3 == 2))) {
            aVar.f1250l = true;
            m mVar = aVar.f1244f;
            if (z3) {
                hVar = mVar.a(hVar);
            } else {
                mVar.getClass();
                h hVar2 = (h) m.f1281b.getAndSet(mVar, hVar);
                if (hVar2 == null) {
                    hVar = null;
                } else {
                    hVar = mVar.a(hVar2);
                }
            }
        }
        if (hVar != null) {
            if (hVar.f1269g.f1270a == 1) {
                z5 = this.f1261k.a(hVar);
            } else {
                z5 = this.f1260j.a(hVar);
            }
            if (!z5) {
                throw new RejectedExecutionException(this.f1259i + " was terminated");
            }
        }
        if (z3 && aVar != null) {
            z6 = true;
        }
        if (z4) {
            if (!z6 && !e() && !d(j3)) {
                e();
            }
        } else if (!z6 && !e() && !d(atomicLongFieldUpdater.get(this))) {
            e();
        }
    }

    public final void c(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f1252m.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & -2097152;
            if (i5 == i3) {
                if (i4 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f1255p) {
                            i5 = -1;
                            break;
                        } else if (c3 == null) {
                            i5 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c3;
                            int b3 = aVar2.b();
                            if (b3 != 0) {
                                i5 = b3;
                                break;
                            }
                            c3 = aVar2.c();
                        }
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f1252m.compareAndSet(this, j3, ((long) i5) | j4)) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r1 == null) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f1254o
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00af
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof P2.a
            r3 = 0
            if (r1 == 0) goto L_0x0018
            P2.a r0 = (P2.a) r0
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            P2.b r1 = r0.f1251m
            boolean r1 = A2.i.a(r1, r8)
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r3
        L_0x0025:
            N2.s r1 = r8.f1262l
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f1253n     // Catch:{ all -> 0x00c1 }
            long r4 = r4.get(r8)     // Catch:{ all -> 0x00c1 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L_0x0077
            r1 = r2
        L_0x0037:
            N2.s r5 = r8.f1262l
            java.lang.Object r5 = r5.b(r1)
            A2.i.b(r5)
            P2.a r5 = (P2.a) r5
            if (r5 == r0) goto L_0x0072
        L_0x0044:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L_0x0053
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x0044
        L_0x0053:
            P2.m r5 = r5.f1244f
            P2.e r6 = r8.f1261k
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = P2.m.f1281b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            P2.h r7 = (P2.h) r7
            if (r7 == 0) goto L_0x0067
            r6.a(r7)
        L_0x0067:
            P2.h r7 = r5.b()
            if (r7 != 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            r6.a(r7)
            goto L_0x0067
        L_0x0072:
            if (r1 == r4) goto L_0x0077
            int r1 = r1 + 1
            goto L_0x0037
        L_0x0077:
            P2.e r1 = r8.f1261k
            r1.b()
            P2.e r1 = r8.f1260j
            r1.b()
        L_0x0081:
            if (r0 == 0) goto L_0x0089
            P2.h r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00b0
        L_0x0089:
            P2.e r1 = r8.f1260j
            java.lang.Object r1 = r1.d()
            P2.h r1 = (P2.h) r1
            if (r1 != 0) goto L_0x00b0
            P2.e r1 = r8.f1261k
            java.lang.Object r1 = r1.d()
            P2.h r1 = (P2.h) r1
            if (r1 != 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00a3
            r1 = 5
            r0.h(r1)
        L_0x00a3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f1252m
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f1253n
            r0.set(r8, r1)
        L_0x00af:
            return
        L_0x00b0:
            r1.run()     // Catch:{ all -> 0x00b4 }
            goto L_0x0081
        L_0x00b4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L_0x0081
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.b.close():void");
    }

    public final boolean d(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f1256f;
        if (i3 < i4) {
            int a2 = a();
            if (a2 == 1 && i4 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        m mVar;
        int i3;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1252m;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f1262l.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & -2097152;
                Object c3 = aVar.c();
                while (true) {
                    mVar = f1255p;
                    if (c3 == mVar) {
                        i3 = -1;
                        break;
                    } else if (c3 == null) {
                        i3 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c3;
                        i3 = aVar2.b();
                        if (i3 != 0) {
                            break;
                        }
                        c3 = aVar2.c();
                    }
                }
                if (i3 >= 0) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j3, j4 | ((long) i3))) {
                        aVar.g(mVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1243n.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final void execute(Runnable runnable) {
        b(runnable, k.f1278g, false);
    }

    public final String toString() {
        int i3;
        ArrayList arrayList = new ArrayList();
        s sVar = this.f1262l;
        int a2 = sVar.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a2; i9++) {
            a aVar = (a) sVar.b(i9);
            if (aVar != null) {
                m mVar = aVar.f1244f;
                mVar.getClass();
                if (m.f1281b.get(mVar) != null) {
                    i3 = (m.f1282c.get(mVar) - m.f1283d.get(mVar)) + 1;
                } else {
                    i3 = m.f1282c.get(mVar) - m.f1283d.get(mVar);
                }
                int b3 = j.b(aVar.f1246h);
                if (b3 == 0) {
                    i4++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i3);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (b3 == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i3);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (b3 == 2) {
                    i6++;
                } else if (b3 == 3) {
                    i7++;
                    if (i3 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i3);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (b3 == 4) {
                    i8++;
                }
            }
        }
        long j3 = f1253n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1259i);
        sb4.append('@');
        sb4.append(C0071w.c(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f1256f;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.f1257g);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i4);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1260j.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1261k.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
