package P2;

import A2.i;
import A2.q;
import B.m;
import C2.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class a extends Thread {

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1243n = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: f  reason: collision with root package name */
    public final m f1244f = new m();

    /* renamed from: g  reason: collision with root package name */
    public final q f1245g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public int f1246h = 4;

    /* renamed from: i  reason: collision with root package name */
    public long f1247i;
    private volatile int indexInArray;

    /* renamed from: j  reason: collision with root package name */
    public long f1248j;

    /* renamed from: k  reason: collision with root package name */
    public int f1249k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1250l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ b f1251m;
    private volatile Object nextParkedWorker = b.f1255p;
    private volatile int workerCtl;

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, A2.q] */
    public a(b bVar, int i3) {
        this.f1251m = bVar;
        setDaemon(true);
        e.f186f.getClass();
        this.f1249k = e.f187g.a().nextInt();
        f(i3);
    }

    public final h a(boolean z3) {
        h e2;
        h e3;
        b bVar;
        long j3;
        int i3 = this.f1246h;
        boolean z4 = true;
        h hVar = null;
        m mVar = this.f1244f;
        b bVar2 = this.f1251m;
        if (i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1253n;
            do {
                bVar = this.f1251m;
                j3 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1:
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1281b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f1269g.f1270a == 1) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, (Object) null)) {
                                    hVar = hVar2;
                                    break loop1;
                                } else if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                }
                            }
                        }
                    }
                    int i4 = m.f1283d.get(mVar);
                    int i5 = m.f1282c.get(mVar);
                    while (true) {
                        if (i4 != i5 && m.f1284e.get(mVar) != 0) {
                            i5--;
                            h c3 = mVar.c(i5, true);
                            if (c3 != null) {
                                hVar = c3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f1261k.d();
                    if (hVar3 == null) {
                        return i(1);
                    }
                    return hVar3;
                }
            } while (!b.f1253n.compareAndSet(bVar, j3, j3 - 4398046511104L));
            this.f1246h = 1;
        }
        if (z3) {
            if (d(bVar2.f1256f * 2) != 0) {
                z4 = false;
            }
            if (z4 && (e3 = e()) != null) {
                return e3;
            }
            mVar.getClass();
            h hVar4 = (h) m.f1281b.getAndSet(mVar, (Object) null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z4 && (e2 = e()) != null) {
                return e2;
            }
        } else {
            h e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i4 = this.f1249k;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f1249k = i7;
        int i8 = i3 - 1;
        if ((i8 & i3) == 0) {
            return i7 & i8;
        }
        return (i7 & Integer.MAX_VALUE) % i3;
    }

    public final h e() {
        int d3 = d(2);
        b bVar = this.f1251m;
        if (d3 == 0) {
            h hVar = (h) bVar.f1260j.d();
            if (hVar != null) {
                return hVar;
            }
            return (h) bVar.f1261k.d();
        }
        h hVar2 = (h) bVar.f1261k.d();
        if (hVar2 != null) {
            return hVar2;
        }
        return (h) bVar.f1260j.d();
    }

    public final void f(int i3) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1251m.f1259i);
        sb.append("-worker-");
        if (i3 == 0) {
            str = "TERMINATED";
        } else {
            str = String.valueOf(i3);
        }
        sb.append(str);
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i3) {
        int i4 = this.f1246h;
        boolean z3 = true;
        if (i4 != 1) {
            z3 = false;
        }
        if (z3) {
            b.f1253n.addAndGet(this.f1251m, 4398046511104L);
        }
        if (i4 != i3) {
            this.f1246h = i3;
        }
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final P2.h i(int r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = P2.b.f1253n
            P2.b r3 = r0.f1251m
            long r4 = r2.get(r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r2 = (int) r4
            r4 = 2
            r5 = 0
            if (r2 >= r4) goto L_0x0016
            return r5
        L_0x0016:
            int r6 = r0.d(r2)
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0020:
            if (r10 >= r2) goto L_0x00e7
            r15 = 1
            int r6 = r6 + r15
            if (r6 <= r2) goto L_0x0027
            r6 = r15
        L_0x0027:
            N2.s r4 = r3.f1262l
            java.lang.Object r4 = r4.b(r6)
            P2.a r4 = (P2.a) r4
            if (r4 == 0) goto L_0x00dd
            if (r4 == r0) goto L_0x00dd
            r7 = 3
            P2.m r4 = r4.f1244f
            if (r1 != r7) goto L_0x003d
            P2.h r7 = r4.b()
            goto L_0x0069
        L_0x003d:
            r4.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = P2.m.f1283d
            int r7 = r7.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = P2.m.f1282c
            int r8 = r8.get(r4)
            if (r1 != r15) goto L_0x0050
            r9 = r15
            goto L_0x0051
        L_0x0050:
            r9 = 0
        L_0x0051:
            if (r7 == r8) goto L_0x005d
            if (r9 == 0) goto L_0x005f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = P2.m.f1284e
            int r13 = r13.get(r4)
            if (r13 != 0) goto L_0x005f
        L_0x005d:
            r7 = r5
            goto L_0x0069
        L_0x005f:
            int r13 = r7 + 1
            P2.h r7 = r4.c(r7, r9)
            if (r7 != 0) goto L_0x0069
            r7 = r13
            goto L_0x0051
        L_0x0069:
            A2.q r13 = r0.f1245g
            if (r7 == 0) goto L_0x0076
            r13.f86f = r7
            r19 = r6
        L_0x0071:
            r6 = -1
        L_0x0073:
            r8 = -1
            goto L_0x00b9
        L_0x0076:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = P2.m.f1281b
            java.lang.Object r14 = r7.get(r4)
            P2.h r14 = (P2.h) r14
            r18 = -2
            if (r14 != 0) goto L_0x0089
        L_0x0082:
            r21 = r18
            r19 = r6
            r6 = r21
            goto L_0x0073
        L_0x0089:
            P2.i r8 = r14.f1269g
            int r8 = r8.f1270a
            if (r8 != r15) goto L_0x0091
            r8 = r15
            goto L_0x0092
        L_0x0091:
            r8 = 2
        L_0x0092:
            r8 = r8 & r1
            if (r8 != 0) goto L_0x0096
            goto L_0x0082
        L_0x0096:
            P2.f r8 = P2.k.f1277f
            r8.getClass()
            long r8 = java.lang.System.nanoTime()
            r19 = r6
            long r5 = r14.f1268f
            long r8 = r8 - r5
            long r5 = P2.k.f1273b
            int r20 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r20 >= 0) goto L_0x00af
            long r4 = r5 - r8
            r6 = r4
            r5 = 0
            goto L_0x0073
        L_0x00af:
            r5 = 0
            boolean r6 = r7.compareAndSet(r4, r14, r5)
            if (r6 == 0) goto L_0x00cf
            r13.f86f = r14
            goto L_0x0071
        L_0x00b9:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00c4
            java.lang.Object r1 = r13.f86f
            P2.h r1 = (P2.h) r1
            r13.f86f = r5
            return r1
        L_0x00c4:
            r16 = 0
            int r4 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00df
            long r11 = java.lang.Math.min(r11, r6)
            goto L_0x00df
        L_0x00cf:
            r8 = -1
            r16 = 0
            java.lang.Object r5 = r7.get(r4)
            if (r5 == r14) goto L_0x00af
            r6 = r19
            r5 = 0
            goto L_0x0076
        L_0x00dd:
            r19 = r6
        L_0x00df:
            int r10 = r10 + 1
            r6 = r19
            r4 = 2
            r5 = 0
            goto L_0x0020
        L_0x00e7:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = 0
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r11 = r16
        L_0x00f5:
            r0.f1248j = r11
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.a.i(int):P2.h");
    }

    public final void run() {
        boolean z3;
        boolean z4;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        int i3;
        loop0:
        while (true) {
            boolean z5 = false;
            while (true) {
                b bVar = this.f1251m;
                bVar.getClass();
                int i4 = 5;
                if (b.f1254o.get(bVar) == 0 && this.f1246h != 5) {
                    h a2 = a(this.f1250l);
                    int i5 = 3;
                    if (a2 == null) {
                        this.f1250l = false;
                        if (this.f1248j != 0) {
                            if (z5) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f1248j);
                                this.f1248j = 0;
                                break;
                            }
                            z5 = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            m mVar = b.f1255p;
                            if (obj != mVar) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                f1243n.set(this, -1);
                                while (this.nextParkedWorker != b.f1255p) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1243n;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    b bVar2 = this.f1251m;
                                    bVar2.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1254o;
                                    if (atomicIntegerFieldUpdater2.get(bVar2) != 0 || this.f1246h == i4) {
                                        break;
                                    }
                                    h(i5);
                                    Thread.interrupted();
                                    if (this.f1247i == 0) {
                                        this.f1247i = System.nanoTime() + this.f1251m.f1258h;
                                    }
                                    LockSupport.parkNanos(this.f1251m.f1258h);
                                    if (System.nanoTime() - this.f1247i >= 0) {
                                        this.f1247i = 0;
                                        b bVar3 = this.f1251m;
                                        synchronized (bVar3.f1262l) {
                                            try {
                                                if (atomicIntegerFieldUpdater2.get(bVar3) != 0) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (!z4) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1253n;
                                                    if (((int) (atomicLongFieldUpdater2.get(bVar3) & 2097151)) > bVar3.f1256f) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i6 = this.indexInArray;
                                                            f(0);
                                                            bVar3.c(this, i6, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar3) & 2097151);
                                                            if (andDecrement != i6) {
                                                                Object b3 = bVar3.f1262l.b(andDecrement);
                                                                i.b(b3);
                                                                a aVar = (a) b3;
                                                                bVar3.f1262l.c(i6, aVar);
                                                                aVar.f(i6);
                                                                bVar3.c(aVar, andDecrement, i6);
                                                            }
                                                            bVar3.f1262l.c(andDecrement, (a) null);
                                                            this.f1246h = 5;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    i4 = 5;
                                    i5 = 3;
                                }
                            } else {
                                b bVar4 = this.f1251m;
                                bVar4.getClass();
                                if (this.nextParkedWorker == mVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f1252m;
                                        j3 = atomicLongFieldUpdater.get(bVar4);
                                        i3 = this.indexInArray;
                                        this.nextParkedWorker = bVar4.f1262l.b((int) (j3 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar4, j3, ((j3 + 2097152) & -2097152) | ((long) i3)));
                                }
                            }
                        }
                    } else {
                        this.f1248j = 0;
                        int i7 = a2.f1269g.f1270a;
                        this.f1247i = 0;
                        if (this.f1246h == 3) {
                            this.f1246h = 2;
                        }
                        b bVar5 = this.f1251m;
                        if (i7 != 0 && h(2) && !bVar5.e() && !bVar5.d(b.f1253n.get(bVar5))) {
                            bVar5.e();
                        }
                        bVar5.getClass();
                        try {
                            a2.run();
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th3);
                        }
                        if (i7 != 0) {
                            b.f1253n.addAndGet(bVar5, -2097152);
                            if (this.f1246h != 5) {
                                this.f1246h = 4;
                            }
                        }
                    }
                }
            }
        }
        h(5);
    }
}
