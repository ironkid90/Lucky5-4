package L1;

import b2.f;
import c2.m;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f974f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f975g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f976h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Boolean f977i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ f f978j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f979k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f980l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f981m;

    public /* synthetic */ o(boolean z3, String str, f fVar, Boolean bool, f fVar2, m mVar, boolean z4, int i3) {
        this.f974f = z3;
        this.f975g = str;
        this.f976h = fVar;
        this.f977i = bool;
        this.f978j = fVar2;
        this.f979k = mVar;
        this.f980l = z4;
        this.f981m = i3;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [android.database.DatabaseErrorHandler, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r2.b(L1.q.c(r7, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        r4.i(r0, new M1.c(r5, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            boolean r0 = r12.f974f
            java.lang.String r1 = r12.f975g
            b2.f r2 = r12.f976h
            java.lang.Boolean r3 = r12.f977i
            L1.f r4 = r12.f978j
            c2.m r5 = r12.f979k
            boolean r6 = r12.f980l
            int r7 = r12.f981m
            java.lang.String r8 = "open_failed "
            java.lang.Object r9 = L1.q.f990k
            monitor-enter(r9)
            r10 = 0
            if (r0 != 0) goto L_0x004f
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x004c }
            r0.<init>(r1)     // Catch:{ all -> 0x004c }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.getParent()     // Catch:{ all -> 0x004c }
            r11.<init>(r0)     // Catch:{ all -> 0x004c }
            boolean r0 = r11.exists()     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x004f
            boolean r0 = r11.mkdirs()     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x004f
            boolean r0 = r11.exists()     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "sqlite_error"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r3.<init>(r8)     // Catch:{ all -> 0x004c }
            r3.append(r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x004c }
            r2.a(r0, r1, r10)     // Catch:{ all -> 0x004c }
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            goto L_0x00c7
        L_0x004c:
            r0 = move-exception
            goto L_0x00c8
        L_0x004f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00bd }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x00bd }
            if (r0 == 0) goto L_0x0066
            L1.e r0 = new L1.e     // Catch:{ Exception -> 0x00bd }
            r0.<init>()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = r4.f934b     // Catch:{ Exception -> 0x00bd }
            r8 = 1
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r3, r10, r8, r0)     // Catch:{ Exception -> 0x00bd }
            r4.f941i = r0     // Catch:{ Exception -> 0x00bd }
            goto L_0x0069
        L_0x0066:
            r4.k()     // Catch:{ Exception -> 0x00bd }
        L_0x0069:
            java.lang.Object r0 = L1.q.f989j     // Catch:{ all -> 0x004c }
            monitor-enter(r0)     // Catch:{ all -> 0x004c }
            if (r6 == 0) goto L_0x007a
            java.util.HashMap r3 = L1.q.f987h     // Catch:{ all -> 0x0078 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0078 }
            r3.put(r1, r5)     // Catch:{ all -> 0x0078 }
            goto L_0x007a
        L_0x0078:
            r1 = move-exception
            goto L_0x00bb
        L_0x007a:
            java.util.HashMap r3 = L1.q.f988i     // Catch:{ all -> 0x0078 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0078 }
            r3.put(r5, r4)     // Catch:{ all -> 0x0078 }
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            int r0 = r4.f936d     // Catch:{ all -> 0x004c }
            boolean r0 = L1.a.a(r0)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "Sqflite"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r3.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r4.h()     // Catch:{ all -> 0x004c }
            r3.append(r4)     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "opened "
            r3.append(r4)     // Catch:{ all -> 0x004c }
            r3.append(r7)     // Catch:{ all -> 0x004c }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x004c }
            r3.append(r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x004c }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x004c }
        L_0x00b1:
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            r0 = 0
            java.util.HashMap r0 = L1.q.c(r7, r0, r0)
            r2.b(r0)
            goto L_0x00c7
        L_0x00bb:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r1     // Catch:{ all -> 0x004c }
        L_0x00bd:
            r0 = move-exception
            M1.c r1 = new M1.c     // Catch:{ all -> 0x004c }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x004c }
            r4.i(r0, r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
        L_0x00c7:
            return
        L_0x00c8:
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.o.run():void");
    }
}
