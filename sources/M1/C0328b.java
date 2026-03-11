package m1;

/* renamed from: m1.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0328b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4021f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0329c f4022g;

    public /* synthetic */ C0328b(C0329c cVar, int i3) {
        this.f4021f = i3;
        this.f4022g = cVar;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f4021f
            switch(r0) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00e4;
                default: goto L_0x0005;
            }
        L_0x0005:
            m1.c r0 = r8.f4022g
            r0.getClass()
            java.lang.Object r1 = m1.C0329c.f4023m
            monitor-enter(r1)
            X0.g r2 = r0.f4024a     // Catch:{ all -> 0x0024 }
            r2.a()     // Catch:{ all -> 0x0024 }
            android.content.Context r2 = r2.f1936a     // Catch:{ all -> 0x0024 }
            c2.n r2 = c2.n.e(r2)     // Catch:{ all -> 0x0024 }
            c2.n r3 = r0.f4026c     // Catch:{ all -> 0x00db }
            n1.b r3 = r3.o()     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0027
            r2.p()     // Catch:{ all -> 0x0024 }
            goto L_0x0027
        L_0x0024:
            r0 = move-exception
            goto L_0x00e2
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            int r2 = r3.f4105b     // Catch:{ e -> 0x0048 }
            r4 = 0
            r5 = 5
            r6 = 1
            if (r2 != r5) goto L_0x0031
            r7 = r6
            goto L_0x0032
        L_0x0031:
            r7 = r4
        L_0x0032:
            if (r7 != 0) goto L_0x004b
            r7 = 3
            if (r2 != r7) goto L_0x0038
            r4 = r6
        L_0x0038:
            if (r4 == 0) goto L_0x003b
            goto L_0x004b
        L_0x003b:
            m1.j r2 = r0.f4027d     // Catch:{ e -> 0x0048 }
            boolean r2 = r2.a(r3)     // Catch:{ e -> 0x0048 }
            if (r2 == 0) goto L_0x00da
            n1.b r2 = r0.b(r3)     // Catch:{ e -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            r1 = move-exception
            goto L_0x00d7
        L_0x004b:
            n1.b r2 = r0.g(r3)     // Catch:{ e -> 0x0048 }
        L_0x004f:
            monitor-enter(r1)
            X0.g r4 = r0.f4024a     // Catch:{ all -> 0x0066 }
            r4.a()     // Catch:{ all -> 0x0066 }
            android.content.Context r4 = r4.f1936a     // Catch:{ all -> 0x0066 }
            c2.n r4 = c2.n.e(r4)     // Catch:{ all -> 0x0066 }
            c2.n r7 = r0.f4026c     // Catch:{ all -> 0x00ce }
            r7.k(r2)     // Catch:{ all -> 0x00ce }
            if (r4 == 0) goto L_0x0069
            r4.p()     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0066:
            r0 = move-exception
            goto L_0x00d5
        L_0x0069:
            monitor-exit(r1)     // Catch:{ all -> 0x0066 }
            monitor-enter(r0)
            java.util.HashSet r1 = r0.f4034k     // Catch:{ all -> 0x0092 }
            int r1 = r1.size()     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = r3.f4104a     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r2.f4104a     // Catch:{ all -> 0x0092 }
            boolean r1 = android.text.TextUtils.equals(r1, r3)     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x009a
            java.util.HashSet r1 = r0.f4034k     // Catch:{ all -> 0x0092 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0092 }
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0092 }
            if (r3 != 0) goto L_0x008a
            goto L_0x009a
        L_0x008a:
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x0094
            r1 = 0
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r1 = move-exception
            goto L_0x00cc
        L_0x0094:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x009a:
            monitor-exit(r0)
            r1 = 4
            int r3 = r2.f4105b
            if (r3 != r1) goto L_0x00aa
            java.lang.String r1 = r2.f4104a
            monitor-enter(r0)
            r0.f4033j = r1     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)
            goto L_0x00aa
        L_0x00a7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            throw r1
        L_0x00aa:
            int r1 = r2.f4105b
            if (r1 != r5) goto L_0x00b7
            m1.e r1 = new m1.e
            r1.<init>()
            r0.h(r1)
            goto L_0x00da
        L_0x00b7:
            r3 = 2
            if (r1 == r3) goto L_0x00c1
            if (r1 != r6) goto L_0x00bd
            goto L_0x00c1
        L_0x00bd:
            r0.i(r2)
            goto L_0x00da
        L_0x00c1:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.h(r1)
            goto L_0x00da
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            throw r1
        L_0x00ce:
            r0 = move-exception
            if (r4 == 0) goto L_0x00d4
            r4.p()     // Catch:{ all -> 0x0066 }
        L_0x00d4:
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x00d5:
            monitor-exit(r1)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x00d7:
            r0.h(r1)
        L_0x00da:
            return
        L_0x00db:
            r0 = move-exception
            if (r2 == 0) goto L_0x00e1
            r2.p()     // Catch:{ all -> 0x0024 }
        L_0x00e1:
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x00e2:
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            throw r0
        L_0x00e4:
            m1.c r0 = r8.f4022g
            r0.a()
            return
        L_0x00ea:
            m1.c r0 = r8.f4022g
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C0328b.run():void");
    }
}
