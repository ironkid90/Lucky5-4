package h2;

/* renamed from: h2.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0187a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3054f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3055g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3056h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f3057i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f3058j;

    public /* synthetic */ C0187a(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f3054f = i3;
        this.f3055g = obj;
        this.f3056h = obj2;
        this.f3057i = obj3;
        this.f3058j = obj4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:12|13|14|15|16|17|18|(2:20|21)|24|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9 A[SYNTHETIC, Splitter:B:20:0x00a9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f3055g
            java.lang.Object r1 = r13.f3058j
            java.lang.Object r2 = r13.f3057i
            java.lang.Object r3 = r13.f3056h
            int r4 = r13.f3054f
            switch(r4) {
                case 0: goto L_0x0077;
                default: goto L_0x000d;
            }
        L_0x000d:
            r0.i r3 = (r0.i) r3
            A.c r2 = (A.C0002c) r2
            r0.h r1 = (r0.h) r1
            w0.a r0 = (w0.C0500a) r0
            r0.getClass()
            java.util.logging.Logger r4 = w0.C0500a.f4722f
            java.lang.String r5 = "Transport backend '"
            s0.f r6 = r0.f4725c     // Catch:{ Exception -> 0x0045 }
            java.lang.String r7 = r3.f4426a     // Catch:{ Exception -> 0x0045 }
            s0.g r6 = r6.a(r7)     // Catch:{ Exception -> 0x0045 }
            if (r6 != 0) goto L_0x0047
            java.lang.String r0 = r3.f4426a     // Catch:{ Exception -> 0x0045 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0045 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0045 }
            r1.append(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = "' is not registered"
            r1.append(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0045 }
            r4.warning(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0045 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0045 }
            r2.getClass()     // Catch:{ Exception -> 0x0045 }
            goto L_0x0076
        L_0x0045:
            r0 = move-exception
            goto L_0x005e
        L_0x0047:
            p0.d r6 = (p0.d) r6     // Catch:{ Exception -> 0x0045 }
            r0.h r1 = r6.a(r1)     // Catch:{ Exception -> 0x0045 }
            z0.c r5 = r0.f4727e     // Catch:{ Exception -> 0x0045 }
            s1.o r6 = new s1.o     // Catch:{ Exception -> 0x0045 }
            r7 = 1
            r6.<init>(r0, r3, r1, r7)     // Catch:{ Exception -> 0x0045 }
            y0.i r5 = (y0.i) r5     // Catch:{ Exception -> 0x0045 }
            r5.g(r6)     // Catch:{ Exception -> 0x0045 }
            r2.getClass()     // Catch:{ Exception -> 0x0045 }
            goto L_0x0076
        L_0x005e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Error scheduling event "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.warning(r0)
            r2.getClass()
        L_0x0076:
            return
        L_0x0077:
            h2.h r3 = (h2.C0194h) r3
            W0.i r1 = (W0.i) r1
            java.util.HashMap r4 = h2.C0191e.f3070h
            h2.e r0 = (h2.C0191e) r0
            r0.getClass()
            java.lang.String r6 = r3.f3078a     // Catch:{ Exception -> 0x00af }
            java.lang.String r4 = "ApiKey must be set."
            G0.o.c(r6, r4)     // Catch:{ Exception -> 0x00af }
            java.lang.String r5 = r3.f3079b     // Catch:{ Exception -> 0x00af }
            java.lang.String r4 = "ApplicationId must be set."
            G0.o.c(r5, r4)     // Catch:{ Exception -> 0x00af }
            java.lang.String r7 = r3.f3083f     // Catch:{ Exception -> 0x00af }
            java.lang.String r9 = r3.f3080c     // Catch:{ Exception -> 0x00af }
            java.lang.String r11 = r3.f3081d     // Catch:{ Exception -> 0x00af }
            java.lang.String r10 = r3.f3084g     // Catch:{ Exception -> 0x00af }
            java.lang.String r8 = r3.f3086i     // Catch:{ Exception -> 0x00af }
            X0.h r12 = new X0.h     // Catch:{ Exception -> 0x00af }
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00af }
            android.os.Looper.prepare()     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            java.lang.String r3 = r3.f3082e     // Catch:{ Exception -> 0x00af }
            java.lang.String r2 = (java.lang.String) r2
            if (r3 == 0) goto L_0x00b1
            java.util.HashMap r4 = h2.C0191e.f3070h     // Catch:{ Exception -> 0x00af }
            r4.put(r2, r3)     // Catch:{ Exception -> 0x00af }
            goto L_0x00b1
        L_0x00af:
            r0 = move-exception
            goto L_0x00d3
        L_0x00b1:
            android.content.Context r3 = r0.f3071f     // Catch:{ Exception -> 0x00af }
            X0.g r2 = X0.g.h(r12, r3, r2)     // Catch:{ Exception -> 0x00af }
            W0.i r3 = new W0.i     // Catch:{ Exception -> 0x00af }
            r3.<init>()     // Catch:{ Exception -> 0x00af }
            java.util.concurrent.ExecutorService r4 = io.flutter.plugins.firebase.core.FlutterFirebasePlugin.cachedThreadPool     // Catch:{ Exception -> 0x00af }
            h2.d r5 = new h2.d     // Catch:{ Exception -> 0x00af }
            r6 = 0
            r5.<init>(r0, r2, r3, r6)     // Catch:{ Exception -> 0x00af }
            r4.execute(r5)     // Catch:{ Exception -> 0x00af }
            W0.p r0 = r3.f1875a     // Catch:{ Exception -> 0x00af }
            java.lang.Object r0 = android.support.v4.media.session.a.d(r0)     // Catch:{ Exception -> 0x00af }
            h2.i r0 = (h2.C0195i) r0     // Catch:{ Exception -> 0x00af }
            r1.b(r0)     // Catch:{ Exception -> 0x00af }
            goto L_0x00d6
        L_0x00d3:
            r1.a(r0)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0187a.run():void");
    }
}
