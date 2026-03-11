package N2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1205a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b A[LOOP:1: B:7:0x001b->B:10:0x0026, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Runnable r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1205a
            java.lang.Object r1 = r0.get(r4)
            N2.n r1 = (N2.n) r1
            int r2 = r1.a(r5)
            r3 = 1
            if (r2 == 0) goto L_0x0029
            if (r2 == r3) goto L_0x0017
            r0 = 2
            if (r2 == r0) goto L_0x0015
            goto L_0x0000
        L_0x0015:
            r5 = 0
            return r5
        L_0x0017:
            N2.n r2 = r1.c()
        L_0x001b:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L_0x0022
            goto L_0x0000
        L_0x0022:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L_0x001b
            goto L_0x0000
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.l.a(java.lang.Runnable):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0013 A[LOOP:1: B:4:0x0013->B:7:0x001e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1205a
            java.lang.Object r1 = r0.get(r4)
            N2.n r1 = (N2.n) r1
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x000f
            return
        L_0x000f:
            N2.n r2 = r1.c()
        L_0x0013:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L_0x001a
            goto L_0x0000
        L_0x001a:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L_0x0013
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.l.b():void");
    }

    public final int c() {
        n nVar = (n) f1205a.get(this);
        nVar.getClass();
        long j3 = n.f1208f.get(nVar);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0015 A[LOOP:1: B:4:0x0015->B:7:0x0020, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d() {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1205a
            java.lang.Object r1 = r0.get(r4)
            N2.n r1 = (N2.n) r1
            java.lang.Object r2 = r1.d()
            B.m r3 = N2.n.f1209g
            if (r2 == r3) goto L_0x0011
            return r2
        L_0x0011:
            N2.n r2 = r1.c()
        L_0x0015:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L_0x001c
            goto L_0x0000
        L_0x001c:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L_0x0015
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.l.d():java.lang.Object");
    }
}
