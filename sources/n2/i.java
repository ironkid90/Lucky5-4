package N2;

import I2.C0067s;
import I2.C0073y;
import I2.C0074z;
import P2.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class i extends C0067s implements C0074z {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1197l = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: h  reason: collision with root package name */
    public final l f1198h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1199i;

    /* renamed from: j  reason: collision with root package name */
    public final l f1200j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f1201k;
    private volatile int runningWorkers;

    public i(l lVar, int i3) {
        C0074z zVar;
        this.f1198h = lVar;
        this.f1199i = i3;
        if (lVar instanceof C0074z) {
            zVar = (C0074z) lVar;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            int i4 = C0073y.f798a;
        }
        this.f1200j = new l();
        this.f1201k = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r3 = i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r3 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r2.f1198h.g(r2, new C0.n(r2, r3, 3, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(r2.C0425i r3, java.lang.Runnable r4) {
        /*
            r2 = this;
            N2.l r3 = r2.f1200j
            r3.a(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f1197l
            int r4 = r3.get(r2)
            int r0 = r2.f1199i
            if (r4 >= r0) goto L_0x0037
            java.lang.Object r4 = r2.f1201k
            monitor-enter(r4)
            int r0 = r3.get(r2)     // Catch:{ all -> 0x0034 }
            int r1 = r2.f1199i     // Catch:{ all -> 0x0034 }
            if (r0 < r1) goto L_0x001c
            monitor-exit(r4)
            goto L_0x0037
        L_0x001c:
            r3.incrementAndGet(r2)     // Catch:{ all -> 0x0034 }
            monitor-exit(r4)
            java.lang.Runnable r3 = r2.i()
            if (r3 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            C0.n r4 = new C0.n
            r0 = 3
            r1 = 0
            r4.<init>(r2, r3, r0, r1)
            P2.l r3 = r2.f1198h
            r3.g(r2, r4)
            goto L_0x0037
        L_0x0034:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.i.g(r2.i, java.lang.Runnable):void");
    }

    public final Runnable i() {
        while (true) {
            Runnable runnable = (Runnable) this.f1200j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1201k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1197l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1200j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
