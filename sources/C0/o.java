package C0;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f148f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q f149g;

    public /* synthetic */ o(q qVar, int i3) {
        this.f148f = i3;
        this.f149g = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        android.util.Log.d("MessengerIpcClient", "Sending ".concat(java.lang.String.valueOf(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        r3 = r0.f157f;
        r4 = r0.f153b;
        r5 = r1.f164c;
        r3 = r3.f168a;
        r6 = android.os.Message.obtain();
        r6.what = r5;
        r6.arg1 = r1.f162a;
        r6.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.a());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f165d);
        r6.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1 = r0.f154c;
        r3 = (android.os.Messenger) r1.f160g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (r3 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        r3.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        r1 = (C0.i) r1.f161h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        if (r1 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        r1 = r1.f131a;
        r1.getClass();
        r1.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cf, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d0, code lost:
        r0.a(r1.getMessage(), 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f148f
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            C0.q r0 = r8.f149g
            r1 = 2
            java.lang.String r2 = "Service disconnected"
            r0.a(r2, r1)
            return
        L_0x000e:
            C0.q r0 = r8.f149g
            monitor-enter(r0)
            int r1 = r0.f152a     // Catch:{ all -> 0x001d }
            r2 = 1
            if (r1 != r2) goto L_0x001b
            java.lang.String r1 = "Timed out while binding"
            r0.a(r1, r2)     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)
            goto L_0x001f
        L_0x001d:
            r1 = move-exception
            goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        L_0x0022:
            C0.q r0 = r8.f149g
            monitor-enter(r0)
            int r1 = r0.f152a     // Catch:{ all -> 0x002c }
            r2 = 2
            if (r1 == r2) goto L_0x002f
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x003b
        L_0x002c:
            r1 = move-exception
            goto L_0x00d9
        L_0x002f:
            java.util.ArrayDeque r1 = r0.f155d     // Catch:{ all -> 0x002c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x003c
            r0.c()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x003b:
            return
        L_0x003c:
            java.util.ArrayDeque r1 = r0.f155d     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x002c }
            C0.s r1 = (C0.s) r1     // Catch:{ all -> 0x002c }
            android.util.SparseArray r3 = r0.f156e     // Catch:{ all -> 0x002c }
            int r4 = r1.f162a     // Catch:{ all -> 0x002c }
            r3.put(r4, r1)     // Catch:{ all -> 0x002c }
            C0.t r3 = r0.f157f     // Catch:{ all -> 0x002c }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f169b     // Catch:{ all -> 0x002c }
            C0.n r4 = new C0.n     // Catch:{ all -> 0x002c }
            r5 = 1
            r4.<init>(r5, r0, r1)     // Catch:{ all -> 0x002c }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            r6 = 30
            r3.schedule(r4, r6, r5)     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0075
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Sending "
            java.lang.String r5 = "MessengerIpcClient"
            java.lang.String r3 = r4.concat(r3)
            android.util.Log.d(r5, r3)
        L_0x0075:
            C0.t r3 = r0.f157f
            android.os.Messenger r4 = r0.f153b
            int r5 = r1.f164c
            android.content.Context r3 = r3.f168a
            android.os.Message r6 = android.os.Message.obtain()
            r6.what = r5
            int r5 = r1.f162a
            r6.arg1 = r5
            r6.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            boolean r5 = r1.a()
            java.lang.String r7 = "oneWay"
            r4.putBoolean(r7, r5)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r5 = "pkg"
            r4.putString(r5, r3)
            android.os.Bundle r1 = r1.f165d
            java.lang.String r3 = "data"
            r4.putBundle(r3, r1)
            r6.setData(r4)
            C0.r r1 = r0.f154c     // Catch:{ RemoteException -> 0x00cf }
            java.lang.Object r3 = r1.f160g     // Catch:{ RemoteException -> 0x00cf }
            android.os.Messenger r3 = (android.os.Messenger) r3     // Catch:{ RemoteException -> 0x00cf }
            if (r3 == 0) goto L_0x00b7
            r3.send(r6)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x0022
        L_0x00b7:
            java.lang.Object r1 = r1.f161h     // Catch:{ RemoteException -> 0x00cf }
            C0.i r1 = (C0.i) r1     // Catch:{ RemoteException -> 0x00cf }
            if (r1 == 0) goto L_0x00c7
            android.os.Messenger r1 = r1.f131a     // Catch:{ RemoteException -> 0x00cf }
            r1.getClass()     // Catch:{ RemoteException -> 0x00cf }
            r1.send(r6)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x0022
        L_0x00c7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00cf }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00cf }
            throw r1     // Catch:{ RemoteException -> 0x00cf }
        L_0x00cf:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r1, r2)
            goto L_0x0022
        L_0x00d9:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.o.run():void");
    }
}
