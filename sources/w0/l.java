package W0;

import java.util.concurrent.Executor;

public final class l implements m, e, d, b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1882f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1883g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f1884h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f1885i;

    public l(n nVar, b bVar) {
        this.f1882f = 0;
        this.f1883g = new Object();
        this.f1884h = nVar;
        this.f1885i = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        ((W0.n) r2.f1884h).getClass();
        r1 = r2.f1883g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = (W0.d) r2.f1885i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        r3 = r3.b();
        G0.o.e(r3);
        r0.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e(W0.h r3) {
        /*
            r2 = this;
            boolean r0 = r3.e()
            if (r0 != 0) goto L_0x003e
            r0 = r3
            W0.p r0 = (W0.p) r0
            boolean r0 = r0.f1891d
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r2.f1883g
            monitor-enter(r0)
            java.lang.Object r1 = r2.f1885i     // Catch:{ all -> 0x0018 }
            W0.d r1 = (W0.d) r1     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r3 = move-exception
            goto L_0x003c
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            java.util.concurrent.Executor r0 = r2.f1884h
            W0.n r0 = (W0.n) r0
            r0.getClass()
            java.lang.Object r1 = r2.f1883g
            monitor-enter(r1)
            java.lang.Object r0 = r2.f1885i     // Catch:{ all -> 0x0036 }
            W0.d r0 = (W0.d) r0     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0038
            java.lang.Exception r3 = r3.b()     // Catch:{ all -> 0x0036 }
            G0.o.e(r3)     // Catch:{ all -> 0x0036 }
            r0.c(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0038
        L_0x0036:
            r3 = move-exception
            goto L_0x003a
        L_0x0038:
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            return
        L_0x003a:
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            throw r3
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r3
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.l.e(W0.h):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006c, code lost:
        ((W0.n) r4.f1884h).getClass();
        r0 = r4.f1883g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0075, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r5 = (W0.b) r4.f1885i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007a, code lost:
        if (r5 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007c, code lost:
        r5.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0080, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0082, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0085, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(W0.h r5) {
        /*
            r4 = this;
            int r0 = r4.f1882f
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x003b;
                case 2: goto L_0x0037;
                case 3: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            C0.n r0 = new C0.n
            r1 = 8
            r2 = 0
            r0.<init>(r4, r5, r1, r2)
            java.util.concurrent.Executor r5 = r4.f1884h
            r5.execute(r0)
            return
        L_0x0013:
            boolean r0 = r5.e()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r4.f1883g
            monitor-enter(r0)
            java.lang.Object r1 = r4.f1885i     // Catch:{ all -> 0x0024 }
            W0.e r1 = (W0.e) r1     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            goto L_0x0036
        L_0x0024:
            r5 = move-exception
            goto L_0x0034
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            java.util.concurrent.Executor r0 = r4.f1884h
            C0.n r1 = new C0.n
            r2 = 7
            r3 = 0
            r1.<init>(r4, r5, r2, r3)
            r0.execute(r1)
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r5
        L_0x0036:
            return
        L_0x0037:
            r4.e(r5)
            return
        L_0x003b:
            java.lang.Object r0 = r4.f1883g
            monitor-enter(r0)
            java.lang.Object r1 = r4.f1885i     // Catch:{ all -> 0x0046 }
            W0.c r1 = (W0.c) r1     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0048
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x0055
        L_0x0046:
            r5 = move-exception
            goto L_0x0056
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            java.util.concurrent.Executor r0 = r4.f1884h
            C0.n r1 = new C0.n
            r2 = 6
            r3 = 0
            r1.<init>(r4, r5, r2, r3)
            r0.execute(r1)
        L_0x0055:
            return
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r5
        L_0x0058:
            W0.p r5 = (W0.p) r5
            boolean r5 = r5.f1891d
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r4.f1883g
            monitor-enter(r5)
            java.lang.Object r0 = r4.f1885i     // Catch:{ all -> 0x0069 }
            W0.b r0 = (W0.b) r0     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x006b
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            goto L_0x0088
        L_0x0069:
            r0 = move-exception
            goto L_0x0086
        L_0x006b:
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            java.util.concurrent.Executor r5 = r4.f1884h
            W0.n r5 = (W0.n) r5
            r5.getClass()
            java.lang.Object r0 = r4.f1883g
            monitor-enter(r0)
            java.lang.Object r5 = r4.f1885i     // Catch:{ all -> 0x0080 }
            W0.b r5 = (W0.b) r5     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0082
            r5.b()     // Catch:{ all -> 0x0080 }
            goto L_0x0082
        L_0x0080:
            r5 = move-exception
            goto L_0x0084
        L_0x0082:
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            goto L_0x0088
        L_0x0084:
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            throw r5
        L_0x0086:
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            throw r0
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.l.a(W0.h):void");
    }

    public void b() {
        ((p) this.f1885i).m();
    }

    public void c(Exception exc) {
        ((p) this.f1885i).k(exc);
    }

    public void d(Object obj) {
        ((p) this.f1885i).l(obj);
    }

    public l(n nVar, d dVar) {
        this.f1882f = 2;
        this.f1883g = new Object();
        this.f1884h = nVar;
        this.f1885i = dVar;
    }

    public l(Executor executor, c cVar) {
        this.f1882f = 1;
        this.f1883g = new Object();
        this.f1884h = executor;
        this.f1885i = cVar;
    }

    public l(Executor executor, e eVar) {
        this.f1882f = 3;
        this.f1883g = new Object();
        this.f1884h = executor;
        this.f1885i = eVar;
    }

    public l(Executor executor, g gVar, p pVar) {
        this.f1882f = 4;
        this.f1884h = executor;
        this.f1883g = gVar;
        this.f1885i = pVar;
    }
}
