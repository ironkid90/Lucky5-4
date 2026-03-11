package o1;

import j1.e;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m1.j;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final long f4159d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    public static final long f4160e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final j f4161a;

    /* renamed from: b  reason: collision with root package name */
    public long f4162b;

    /* renamed from: c  reason: collision with root package name */
    public int f4163c;

    public d() {
        if (e.f3848h == null) {
            Pattern pattern = j.f4042c;
            e.f3848h = new e(14);
        }
        e eVar = e.f3848h;
        if (j.f4043d == null) {
            j.f4043d = new j(eVar);
        }
        this.f4161a = j.f4043d;
    }

    public final synchronized boolean a() {
        boolean z3;
        if (this.f4163c != 0) {
            this.f4161a.f4044a.getClass();
            if (System.currentTimeMillis() <= this.f4162b) {
                z3 = false;
            }
        }
        z3 = true;
        return z3;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void b(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 < r0) goto L_0x0009
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 < r0) goto L_0x0064
        L_0x0009:
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L_0x0064
            r0 = 404(0x194, float:5.66E-43)
            if (r7 != r0) goto L_0x0012
            goto L_0x0064
        L_0x0012:
            int r0 = r6.f4163c     // Catch:{ all -> 0x0060 }
            int r0 = r0 + 1
            r6.f4163c = r0     // Catch:{ all -> 0x0060 }
            monitor-enter(r6)     // Catch:{ all -> 0x0060 }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 == r0) goto L_0x002c
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L_0x0026
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            long r0 = f4159d     // Catch:{ all -> 0x002a }
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0050
        L_0x002a:
            r7 = move-exception
            goto L_0x0062
        L_0x002c:
            int r7 = r6.f4163c     // Catch:{ all -> 0x002a }
            double r0 = (double) r7     // Catch:{ all -> 0x002a }
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x002a }
            m1.j r7 = r6.f4161a     // Catch:{ all -> 0x002a }
            r7.getClass()     // Catch:{ all -> 0x002a }
            double r2 = java.lang.Math.random()     // Catch:{ all -> 0x002a }
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r2 = (long) r2     // Catch:{ all -> 0x002a }
            double r2 = (double) r2     // Catch:{ all -> 0x002a }
            double r0 = r0 + r2
            long r2 = f4160e     // Catch:{ all -> 0x002a }
            double r2 = (double) r2     // Catch:{ all -> 0x002a }
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x002a }
            long r0 = (long) r0
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
        L_0x0050:
            m1.j r7 = r6.f4161a     // Catch:{ all -> 0x0060 }
            j1.e r7 = r7.f4044a     // Catch:{ all -> 0x0060 }
            r7.getClass()     // Catch:{ all -> 0x0060 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0060 }
            long r2 = r2 + r0
            r6.f4162b = r2     // Catch:{ all -> 0x0060 }
            monitor-exit(r6)
            return
        L_0x0060:
            r7 = move-exception
            goto L_0x006e
        L_0x0062:
            monitor-exit(r6)     // Catch:{ all -> 0x002a }
            throw r7     // Catch:{ all -> 0x0060 }
        L_0x0064:
            monitor-enter(r6)     // Catch:{ all -> 0x0060 }
            r7 = 0
            r6.f4163c = r7     // Catch:{ all -> 0x006b }
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            monitor-exit(r6)
            return
        L_0x006b:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006b }
            throw r7     // Catch:{ all -> 0x0060 }
        L_0x006e:
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.d.b(int):void");
    }
}
