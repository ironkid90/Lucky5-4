package C0;

import android.os.Handler;

public final /* synthetic */ class p implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f150a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f151b;

    public /* synthetic */ p(int i3, Object obj) {
        this.f150a = i3;
        this.f151b = obj;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [H1.a, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r0v9, types: [H1.a, java.lang.Exception] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fc, code lost:
        r7 = r7.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0107, code lost:
        if (r7.getBoolean("unsupported", false) == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0109, code lost:
        r3.b(new java.lang.Exception("Not supported by GmsCore", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0117, code lost:
        switch(r3.f166e) {
            case 0: goto L_0x0128;
            default: goto L_0x011a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011a, code lost:
        r7 = r7.getBundle("data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0120, code lost:
        if (r7 != null) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0122, code lost:
        r7 = android.os.Bundle.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0124, code lost:
        r3.c(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0130, code lost:
        if (r7.getBoolean("ack", false) == false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0132, code lost:
        r3.c((android.os.Bundle) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0136, code lost:
        r3.b(new java.lang.Exception("Invalid response to one way request", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            int r0 = r6.f150a
            switch(r0) {
                case 0: goto L_0x00af;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "Timeout waiting for ServiceConnection callback "
            int r1 = r7.what
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0062
            if (r1 == r3) goto L_0x0011
            goto L_0x00ac
        L_0x0011:
            java.lang.Object r1 = r6.f151b
            G0.y r1 = (G0.y) r1
            java.util.HashMap r1 = r1.f462a
            monitor-enter(r1)
            java.lang.Object r7 = r7.obj     // Catch:{ all -> 0x0058 }
            G0.v r7 = (G0.v) r7     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r6.f151b     // Catch:{ all -> 0x0058 }
            G0.y r2 = (G0.y) r2     // Catch:{ all -> 0x0058 }
            java.util.HashMap r2 = r2.f462a     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0058 }
            G0.x r2 = (G0.x) r2     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x005d
            int r4 = r2.f453b     // Catch:{ all -> 0x0058 }
            r5 = 3
            if (r4 != r5) goto L_0x005d
            java.lang.String r4 = "GmsClientSupervisor"
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = r0.concat(r5)     // Catch:{ all -> 0x0058 }
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ all -> 0x0058 }
            r5.<init>()     // Catch:{ all -> 0x0058 }
            android.util.Log.e(r4, r0, r5)     // Catch:{ all -> 0x0058 }
            android.content.ComponentName r0 = r2.f457f     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0049
            r7.getClass()     // Catch:{ all -> 0x0058 }
            r0 = 0
        L_0x0049:
            if (r0 != 0) goto L_0x005a
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ all -> 0x0058 }
            java.lang.String r7 = r7.f450b     // Catch:{ all -> 0x0058 }
            G0.o.e(r7)     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "unknown"
            r0.<init>(r7, r4)     // Catch:{ all -> 0x0058 }
            goto L_0x005a
        L_0x0058:
            r7 = move-exception
            goto L_0x0060
        L_0x005a:
            r2.onServiceDisconnected(r0)     // Catch:{ all -> 0x0058 }
        L_0x005d:
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
        L_0x005e:
            r2 = r3
            goto L_0x00ac
        L_0x0060:
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            throw r7
        L_0x0062:
            java.lang.Object r0 = r6.f151b
            G0.y r0 = (G0.y) r0
            java.util.HashMap r0 = r0.f462a
            monitor-enter(r0)
            java.lang.Object r7 = r7.obj     // Catch:{ all -> 0x00a8 }
            G0.v r7 = (G0.v) r7     // Catch:{ all -> 0x00a8 }
            java.lang.Object r1 = r6.f151b     // Catch:{ all -> 0x00a8 }
            G0.y r1 = (G0.y) r1     // Catch:{ all -> 0x00a8 }
            java.util.HashMap r1 = r1.f462a     // Catch:{ all -> 0x00a8 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x00a8 }
            G0.x r1 = (G0.x) r1     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00aa
            java.util.HashMap r4 = r1.f452a     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x00aa
            boolean r4 = r1.f454c     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x009e
            G0.v r4 = r1.f456e     // Catch:{ all -> 0x00a8 }
            G0.y r5 = r1.f458g     // Catch:{ all -> 0x00a8 }
            O0.e r5 = r5.f464c     // Catch:{ all -> 0x00a8 }
            r5.removeMessages(r3, r4)     // Catch:{ all -> 0x00a8 }
            G0.y r4 = r1.f458g     // Catch:{ all -> 0x00a8 }
            J0.a r5 = r4.f465d     // Catch:{ all -> 0x00a8 }
            android.content.Context r4 = r4.f463b     // Catch:{ all -> 0x00a8 }
            r5.b(r4, r1)     // Catch:{ all -> 0x00a8 }
            r1.f454c = r2     // Catch:{ all -> 0x00a8 }
            r2 = 2
            r1.f453b = r2     // Catch:{ all -> 0x00a8 }
        L_0x009e:
            java.lang.Object r1 = r6.f151b     // Catch:{ all -> 0x00a8 }
            G0.y r1 = (G0.y) r1     // Catch:{ all -> 0x00a8 }
            java.util.HashMap r1 = r1.f462a     // Catch:{ all -> 0x00a8 }
            r1.remove(r7)     // Catch:{ all -> 0x00a8 }
            goto L_0x00aa
        L_0x00a8:
            r7 = move-exception
            goto L_0x00ad
        L_0x00aa:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            goto L_0x005e
        L_0x00ac:
            return r2
        L_0x00ad:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r7
        L_0x00af:
            java.lang.String r0 = "Received response for unknown request: "
            java.lang.String r1 = "MessengerIpcClient"
            int r2 = r7.arg1
            r3 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r3)
            if (r1 == 0) goto L_0x00cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Received response to request: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MessengerIpcClient"
            android.util.Log.d(r3, r1)
        L_0x00cf:
            java.lang.Object r1 = r6.f151b
            C0.q r1 = (C0.q) r1
            monitor-enter(r1)
            android.util.SparseArray r3 = r1.f156e     // Catch:{ all -> 0x00f1 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x00f1 }
            C0.s r3 = (C0.s) r3     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x00f3
            java.lang.String r7 = "MessengerIpcClient"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r3.<init>(r0)     // Catch:{ all -> 0x00f1 }
            r3.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00f1 }
            android.util.Log.w(r7, r0)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x0140
        L_0x00f1:
            r7 = move-exception
            goto L_0x0142
        L_0x00f3:
            android.util.SparseArray r0 = r1.f156e     // Catch:{ all -> 0x00f1 }
            r0.remove(r2)     // Catch:{ all -> 0x00f1 }
            r1.c()     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            android.os.Bundle r7 = r7.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r7.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0115
            java.lang.String r7 = "Not supported by GmsCore"
            H1.a r0 = new H1.a
            r1 = 0
            r0.<init>(r7, r1)
            r3.b(r0)
            goto L_0x0140
        L_0x0115:
            int r0 = r3.f166e
            switch(r0) {
                case 0: goto L_0x0128;
                default: goto L_0x011a;
            }
        L_0x011a:
            java.lang.String r0 = "data"
            android.os.Bundle r7 = r7.getBundle(r0)
            if (r7 != 0) goto L_0x0124
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x0124:
            r3.c(r7)
            goto L_0x0140
        L_0x0128:
            java.lang.String r0 = "ack"
            r1 = 0
            boolean r7 = r7.getBoolean(r0, r1)
            r0 = 0
            if (r7 == 0) goto L_0x0136
            r3.c(r0)
            goto L_0x0140
        L_0x0136:
            H1.a r7 = new H1.a
            java.lang.String r1 = "Invalid response to one way request"
            r7.<init>(r1, r0)
            r3.b(r7)
        L_0x0140:
            r7 = 1
            return r7
        L_0x0142:
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.p.handleMessage(android.os.Message):boolean");
    }
}
