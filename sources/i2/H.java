package I2;

import B.m;
import N2.n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q2.C0399b;
import r2.C0425i;

public abstract class H extends I implements C0074z {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f719l;

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f720m;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f721n;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    static {
        Class<H> cls = H.class;
        Class<Object> cls2 = Object.class;
        f719l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f720m = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
        f721n = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted");
    }

    public final void g(C0425i iVar, Runnable runnable) {
        o(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[LOOP:1: B:12:0x0032->B:15:0x003d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l() {
        /*
            r9 = this;
            boolean r0 = r9.m()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f720m
            java.lang.Object r0 = r0.get(r9)
            I2.G r0 = (I2.G) r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f719l
            java.lang.Object r3 = r0.get(r9)
            r4 = 0
            if (r3 != 0) goto L_0x001b
            goto L_0x004e
        L_0x001b:
            boolean r5 = r3 instanceof N2.n
            if (r5 == 0) goto L_0x0040
            r4 = r3
            N2.n r4 = (N2.n) r4
            java.lang.Object r5 = r4.d()
            B.m r6 = N2.n.f1209g
            if (r5 == r6) goto L_0x002e
            r4 = r5
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            goto L_0x004e
        L_0x002e:
            N2.n r5 = r4.c()
        L_0x0032:
            boolean r4 = r0.compareAndSet(r9, r3, r5)
            if (r4 == 0) goto L_0x0039
            goto L_0x0011
        L_0x0039:
            java.lang.Object r4 = r0.get(r9)
            if (r4 == r3) goto L_0x0032
            goto L_0x0011
        L_0x0040:
            B.m r5 = I2.C0071w.f788b
            if (r3 != r5) goto L_0x0045
            goto L_0x004e
        L_0x0045:
            boolean r5 = r0.compareAndSet(r9, r3, r4)
            if (r5 == 0) goto L_0x00a2
            r4 = r3
            java.lang.Runnable r4 = (java.lang.Runnable) r4
        L_0x004e:
            if (r4 == 0) goto L_0x0054
            r4.run()
            return r1
        L_0x0054:
            q2.b r0 = r9.f725j
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x005f
        L_0x005d:
            r5 = r3
            goto L_0x0067
        L_0x005f:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0066
            goto L_0x005d
        L_0x0066:
            r5 = r1
        L_0x0067:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006c
            goto L_0x00a1
        L_0x006c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f719l
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L_0x0098
            boolean r5 = r0 instanceof N2.n
            if (r5 == 0) goto L_0x0092
            N2.n r0 = (N2.n) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = N2.n.f1208f
            long r5 = r5.get(r0)
            r7 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r7 = r7 & r5
            int r0 = (int) r7
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r7
            r7 = 30
            long r5 = r5 >> r7
            int r5 = (int) r5
            if (r0 != r5) goto L_0x00a1
            goto L_0x0098
        L_0x0092:
            B.m r5 = I2.C0071w.f788b
            if (r0 != r5) goto L_0x00a1
        L_0x0096:
            r1 = r3
            goto L_0x00a1
        L_0x0098:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f720m
            java.lang.Object r0 = r0.get(r9)
            I2.G r0 = (I2.G) r0
            goto L_0x0096
        L_0x00a1:
            return r1
        L_0x00a2:
            java.lang.Object r5 = r0.get(r9)
            if (r5 == r3) goto L_0x0045
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.H.l():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        r6 = j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (java.lang.Thread.currentThread() == r6) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038 A[LOOP:2: B:15:0x0038->B:18:0x0043, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(java.lang.Runnable r6) {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f719l
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f721n
            int r2 = r2.get(r5)
            if (r2 == 0) goto L_0x000f
            goto L_0x004a
        L_0x000f:
            if (r1 != 0) goto L_0x0020
        L_0x0011:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L_0x0019
            goto L_0x0066
        L_0x0019:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L_0x0011
            goto L_0x0000
        L_0x0020:
            boolean r2 = r1 instanceof N2.n
            r3 = 1
            if (r2 == 0) goto L_0x0046
            r2 = r1
            N2.n r2 = (N2.n) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0034
            r0 = 2
            if (r4 == r0) goto L_0x004a
            goto L_0x0000
        L_0x0034:
            N2.n r2 = r2.c()
        L_0x0038:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L_0x0038
            goto L_0x0000
        L_0x0046:
            B.m r2 = I2.C0071w.f788b
            if (r1 != r2) goto L_0x0050
        L_0x004a:
            I2.x r0 = I2.C0072x.f796o
            r0.o(r6)
            goto L_0x0073
        L_0x0050:
            N2.n r2 = new N2.n
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L_0x0060:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L_0x0074
        L_0x0066:
            java.lang.Thread r6 = r5.j()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L_0x0073
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L_0x0073:
            return
        L_0x0074:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L_0x0060
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.H.o(java.lang.Runnable):void");
    }

    public final boolean p() {
        boolean z3;
        C0399b bVar = this.f725j;
        if (bVar != null) {
            z3 = bVar.isEmpty();
        } else {
            z3 = true;
        }
        if (!z3) {
            return false;
        }
        G g2 = (G) f720m.get(this);
        Object obj = f719l.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof n) {
            long j3 = n.f1208f.get((n) obj);
            if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == C0071w.f788b) {
            return true;
        }
        return false;
    }

    public void shutdown() {
        i0.f764a.set((Object) null);
        f721n.set(this, 1);
        loop0:
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f719l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            m mVar = C0071w.f788b;
            if (obj != null) {
                if (!(obj instanceof n)) {
                    if (obj != mVar) {
                        n nVar = new n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                }
            }
            break loop0;
        }
        do {
        } while (l() <= 0);
        System.nanoTime();
        G g2 = (G) f720m.get(this);
    }
}
