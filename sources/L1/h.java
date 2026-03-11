package L1;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f948f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f949g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f950h;

    public /* synthetic */ h(int i3, Object obj, Object obj2) {
        this.f948f = i3;
        this.f949g = obj;
        this.f950h = obj2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|18|19|21|22|119) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            int r2 = r6.f948f
            switch(r2) {
                case 0: goto L_0x01ab;
                case 1: goto L_0x0140;
                case 2: goto L_0x0132;
                case 3: goto L_0x00f3;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00ac;
                case 6: goto L_0x0094;
                case 7: goto L_0x006c;
                case 8: goto L_0x0050;
                case 9: goto L_0x0042;
                case 10: goto L_0x0036;
                case 11: goto L_0x002a;
                case 12: goto L_0x0015;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.f2821f
            java.lang.Object r1 = r6.f949g
            com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService r1 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService) r1
            java.lang.Object r2 = r6.f950h
            android.app.job.JobParameters r2 = (android.app.job.JobParameters) r2
            r1.jobFinished(r2, r0)
            return
        L_0x0015:
            java.lang.Object r0 = r6.f950h
            W0.i r0 = (W0.i) r0
            java.lang.Object r1 = r6.f949g
            s1.r r1 = (s1.C0457r) r1
            android.graphics.Bitmap r1 = r1.a()     // Catch:{ Exception -> 0x0025 }
            r0.b(r1)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r1 = move-exception
            r0.a(r1)
        L_0x0029:
            return
        L_0x002a:
            java.lang.Object r0 = r6.f949g
            s1.k r0 = (s1.C0450k) r0
            java.lang.Object r1 = r6.f950h
            android.content.Intent r1 = (android.content.Intent) r1
            r0.a(r1)
            return
        L_0x0036:
            java.lang.Object r0 = r6.f949g
            C0.u r0 = (C0.u) r0
            java.lang.Object r1 = r6.f950h
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r0.b(r1)
            return
        L_0x0042:
            C0.f r0 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService.f3427n
            java.lang.Object r1 = r6.f949g
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r2 = r6.f950h
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2
            r0.E(r1, r2)
            return
        L_0x0050:
            java.lang.Object r0 = r6.f949g
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r6.f950h
            W0.i r2 = (W0.i) r2
            java.util.HashMap r3 = h2.C0191e.f3070h
            X0.g r0 = X0.g.e(r0)     // Catch:{ Exception -> 0x0062 }
            r0.b()     // Catch:{ IllegalStateException -> 0x0064 }
            goto L_0x0064
        L_0x0062:
            r0 = move-exception
            goto L_0x0068
        L_0x0064:
            r2.b(r1)     // Catch:{ Exception -> 0x0062 }
            goto L_0x006b
        L_0x0068:
            r2.a(r0)
        L_0x006b:
            return
        L_0x006c:
            java.lang.Object r0 = r6.f949g
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.lang.Object r2 = r6.f950h
            F0.h r2 = (F0.h) r2
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x008f }
            java.lang.Object r3 = r2.f322g     // Catch:{ Exception -> 0x008f }
            b1.i r3 = (b1.i) r3     // Catch:{ Exception -> 0x008f }
            r3.getClass()     // Catch:{ Exception -> 0x008f }
            if (r0 != 0) goto L_0x0083
            java.lang.Object r0 = o.h.f4134l     // Catch:{ Exception -> 0x008f }
        L_0x0083:
            M0.a r4 = o.h.f4133k     // Catch:{ Exception -> 0x008f }
            boolean r0 = r4.c(r3, r1, r0)     // Catch:{ Exception -> 0x008f }
            if (r0 == 0) goto L_0x0093
            o.h.c(r3)     // Catch:{ Exception -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r0 = move-exception
            r2.y(r0)
        L_0x0093:
            return
        L_0x0094:
            java.lang.Object r0 = r6.f949g
            b1.a r0 = (b1.C0126a) r0
            int r1 = r0.f2667c
            android.os.Process.setThreadPriority(r1)
            android.os.StrictMode$ThreadPolicy r0 = r0.f2668d
            if (r0 == 0) goto L_0x00a4
            android.os.StrictMode.setThreadPolicy(r0)
        L_0x00a4:
            java.lang.Object r0 = r6.f950h
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x00ac:
            java.lang.Object r0 = r6.f949g
            a1.n r0 = (a1.n) r0
            java.lang.Object r1 = r6.f950h
            l1.a r1 = (l1.C0313a) r1
            monitor-enter(r0)
            java.util.Set r2 = r0.f2029b     // Catch:{ all -> 0x00bf }
            if (r2 != 0) goto L_0x00c1
            java.util.Set r2 = r0.f2028a     // Catch:{ all -> 0x00bf }
            r2.add(r1)     // Catch:{ all -> 0x00bf }
            goto L_0x00ca
        L_0x00bf:
            r1 = move-exception
            goto L_0x00cc
        L_0x00c1:
            java.util.Set r2 = r0.f2029b     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00bf }
            r2.add(r1)     // Catch:{ all -> 0x00bf }
        L_0x00ca:
            monitor-exit(r0)
            return
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x00bf }
            throw r1
        L_0x00ce:
            java.lang.Object r0 = r6.f949g
            a1.o r0 = (a1.o) r0
            java.lang.Object r2 = r6.f950h
            l1.a r2 = (l1.C0313a) r2
            l1.a r3 = r0.f2033b
            a1.e r4 = a1.o.f2031d
            if (r3 != r4) goto L_0x00eb
            monitor-enter(r0)
            A.c r3 = r0.f2032a     // Catch:{ all -> 0x00e8 }
            r0.f2032a = r1     // Catch:{ all -> 0x00e8 }
            r0.f2033b = r2     // Catch:{ all -> 0x00e8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            r3.getClass()
            return
        L_0x00e8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            throw r1
        L_0x00eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "provide() can be called only once."
            r0.<init>(r1)
            throw r0
        L_0x00f3:
            java.lang.Object r1 = r6.f949g
            androidx.profileinstaller.ProfileInstallerInitializer r1 = (androidx.profileinstaller.ProfileInstallerInitializer) r1
            r1.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0109
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r1 = R.j.a(r1)
            goto L_0x0112
        L_0x0109:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
        L_0x0112:
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 1
            int r3 = java.lang.Math.max(r3, r4)
            int r2 = r2.nextInt(r3)
            R.g r3 = new R.g
            java.lang.Object r4 = r6.f950h
            android.content.Context r4 = (android.content.Context) r4
            r3.<init>(r4, r0)
            int r2 = r2 + 5000
            long r4 = (long) r2
            r1.postDelayed(r3, r4)
            return
        L_0x0132:
            java.lang.Object r0 = r6.f949g
            N1.b r0 = (N1.b) r0
            c2.g r0 = r0.f1173g
            java.lang.Object r1 = r6.f950h
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.a(r1)
            return
        L_0x0140:
            java.lang.Object r0 = r6.f950h
            L1.k r0 = (L1.k) r0
            java.lang.Object r2 = r6.f949g
            L1.i r2 = (L1.i) r2
            monitor-enter(r0)
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x01a5 }
            java.io.Serializable r4 = r0.f958b     // Catch:{ all -> 0x01a5 }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x01a5 }
            r3.<init>(r4)     // Catch:{ all -> 0x01a5 }
            java.io.Serializable r4 = r0.f959c     // Catch:{ all -> 0x01a5 }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x01a5 }
            r4.remove(r2)     // Catch:{ all -> 0x01a5 }
            java.io.Serializable r4 = r0.f958b     // Catch:{ all -> 0x01a5 }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x01a5 }
            r4.add(r2)     // Catch:{ all -> 0x01a5 }
            L1.g r4 = r2.f956f     // Catch:{ all -> 0x01a5 }
            if (r4 == 0) goto L_0x0173
            F0.h r4 = r4.f946a     // Catch:{ all -> 0x01a5 }
            if (r4 == 0) goto L_0x0173
            java.lang.Object r4 = r4.f322g     // Catch:{ all -> 0x01a5 }
            L1.f r4 = (L1.f) r4     // Catch:{ all -> 0x01a5 }
            boolean r4 = r4.j()     // Catch:{ all -> 0x01a5 }
            if (r4 == 0) goto L_0x0173
            goto L_0x018e
        L_0x0173:
            L1.g r4 = r2.f956f     // Catch:{ all -> 0x01a5 }
            if (r4 == 0) goto L_0x017c
            java.lang.Integer r4 = r4.a()     // Catch:{ all -> 0x01a5 }
            goto L_0x017d
        L_0x017c:
            r4 = r1
        L_0x017d:
            if (r4 == 0) goto L_0x018e
            java.io.Serializable r4 = r0.f963g     // Catch:{ all -> 0x01a5 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x01a5 }
            L1.g r5 = r2.f956f     // Catch:{ all -> 0x01a5 }
            if (r5 == 0) goto L_0x018b
            java.lang.Integer r1 = r5.a()     // Catch:{ all -> 0x01a5 }
        L_0x018b:
            r4.remove(r1)     // Catch:{ all -> 0x01a5 }
        L_0x018e:
            r0.h(r2)     // Catch:{ all -> 0x01a5 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x01a5 }
        L_0x0195:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x01a5 }
            if (r2 == 0) goto L_0x01a7
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x01a5 }
            L1.i r2 = (L1.i) r2     // Catch:{ all -> 0x01a5 }
            r0.h(r2)     // Catch:{ all -> 0x01a5 }
            goto L_0x0195
        L_0x01a5:
            r1 = move-exception
            goto L_0x01a9
        L_0x01a7:
            monitor-exit(r0)
            return
        L_0x01a9:
            monitor-exit(r0)     // Catch:{ all -> 0x01a5 }
            throw r1
        L_0x01ab:
            java.lang.Object r0 = r6.f949g
            L1.i r0 = (L1.i) r0
            r0.getClass()
            java.lang.Object r1 = r6.f950h
            L1.g r1 = (L1.g) r1
            java.lang.Runnable r2 = r1.f947b
            r2.run()
            r0.f956f = r1
            L1.h r0 = r0.f955e
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.h.run():void");
    }

    public /* synthetic */ h(k kVar, i iVar) {
        this.f948f = 1;
        this.f950h = kVar;
        this.f949g = iVar;
    }
}
