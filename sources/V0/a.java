package V0;

import G0.o;
import K0.c;
import K0.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import r.C0414g;

public final class a {

    /* renamed from: n  reason: collision with root package name */
    public static final long f1854n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o  reason: collision with root package name */
    public static volatile ScheduledExecutorService f1855o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final Object f1856p = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1857a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f1858b;

    /* renamed from: c  reason: collision with root package name */
    public int f1859c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f1860d;

    /* renamed from: e  reason: collision with root package name */
    public long f1861e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f1862f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public boolean f1863g = true;

    /* renamed from: h  reason: collision with root package name */
    public R0.a f1864h;

    /* renamed from: i  reason: collision with root package name */
    public final K0.a f1865i = K0.a.f851a;

    /* renamed from: j  reason: collision with root package name */
    public final String f1866j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f1867k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f1868l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    public final ScheduledExecutorService f1869m;

    public a(Context context) {
        boolean z3;
        boolean z4;
        String str;
        String packageName = context.getPackageName();
        o.c("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f1864h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f1866j = str;
        } else {
            this.f1866j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f1858b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            Method method = d.f860a;
            synchronized (d.class) {
                Boolean bool = d.f862c;
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    if (C0414g.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    d.f862c = Boolean.valueOf(z3);
                }
            }
            if (z3) {
                int i3 = c.f859a;
                if (packageName == null || packageName.trim().isEmpty()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                packageName = z4 ? context.getPackageName() : packageName;
                if (!(context.getPackageManager() == null || packageName == null)) {
                    try {
                        ApplicationInfo applicationInfo = M0.c.a(context).f1087a.getPackageManager().getApplicationInfo(packageName, 0);
                        if (applicationInfo == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i4 = applicationInfo.uid;
                            workSource = new WorkSource();
                            Method method2 = d.f861b;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, new Object[]{Integer.valueOf(i4), packageName});
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            } else {
                                Method method3 = d.f860a;
                                if (method3 != null) {
                                    try {
                                        method3.invoke(workSource, new Object[]{Integer.valueOf(i4)});
                                    } catch (Exception e3) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f1858b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e4) {
                        Log.wtf("WakeLock", e4.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f1855o;
            if (scheduledExecutorService == null) {
                synchronized (f1856p) {
                    try {
                        scheduledExecutorService = f1855o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f1855o = scheduledExecutorService;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f1869m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new RuntimeException(sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: V0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: V0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: V0.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f1868l
            r0.incrementAndGet()
            long r0 = f1854n
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = java.lang.Math.min(r2, r0)
            r4 = 1
            long r0 = java.lang.Math.max(r0, r4)
            r4 = 0
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            long r0 = java.lang.Math.min(r9, r0)
        L_0x0020:
            java.lang.Object r9 = r8.f1857a
            monitor-enter(r9)
            boolean r10 = r8.b()     // Catch:{ all -> 0x003b }
            if (r10 != 0) goto L_0x003d
            R0.a r10 = R0.a.f1364f     // Catch:{ all -> 0x003b }
            r8.f1864h = r10     // Catch:{ all -> 0x003b }
            android.os.PowerManager$WakeLock r10 = r8.f1858b     // Catch:{ all -> 0x003b }
            r10.acquire()     // Catch:{ all -> 0x003b }
            K0.a r10 = r8.f1865i     // Catch:{ all -> 0x003b }
            r10.getClass()     // Catch:{ all -> 0x003b }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            goto L_0x003d
        L_0x003b:
            r10 = move-exception
            goto L_0x0099
        L_0x003d:
            int r10 = r8.f1859c     // Catch:{ all -> 0x003b }
            int r10 = r10 + 1
            r8.f1859c = r10     // Catch:{ all -> 0x003b }
            boolean r10 = r8.f1863g     // Catch:{ all -> 0x003b }
            r4 = 0
            if (r10 == 0) goto L_0x004b
            android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003b }
        L_0x004b:
            java.util.HashMap r10 = r8.f1867k     // Catch:{ all -> 0x003b }
            java.lang.Object r10 = r10.get(r4)     // Catch:{ all -> 0x003b }
            V0.b r10 = (V0.b) r10     // Catch:{ all -> 0x003b }
            if (r10 != 0) goto L_0x005f
            V0.b r10 = new V0.b     // Catch:{ all -> 0x003b }
            r10.<init>()     // Catch:{ all -> 0x003b }
            java.util.HashMap r5 = r8.f1867k     // Catch:{ all -> 0x003b }
            r5.put(r4, r10)     // Catch:{ all -> 0x003b }
        L_0x005f:
            int r4 = r10.f1870a     // Catch:{ all -> 0x003b }
            int r4 = r4 + 1
            r10.f1870a = r4     // Catch:{ all -> 0x003b }
            K0.a r10 = r8.f1865i     // Catch:{ all -> 0x003b }
            r10.getClass()     // Catch:{ all -> 0x003b }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            long r6 = r2 - r4
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0076
            long r2 = r4 + r0
        L_0x0076:
            long r4 = r8.f1861e     // Catch:{ all -> 0x003b }
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0097
            r8.f1861e = r2     // Catch:{ all -> 0x003b }
            java.util.concurrent.ScheduledFuture r10 = r8.f1860d     // Catch:{ all -> 0x003b }
            if (r10 == 0) goto L_0x0086
            r2 = 0
            r10.cancel(r2)     // Catch:{ all -> 0x003b }
        L_0x0086:
            java.util.concurrent.ScheduledExecutorService r10 = r8.f1869m     // Catch:{ all -> 0x003b }
            C0.e r2 = new C0.e     // Catch:{ all -> 0x003b }
            r3 = 9
            r2.<init>((int) r3, (java.lang.Object) r8)     // Catch:{ all -> 0x003b }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x003b }
            java.util.concurrent.ScheduledFuture r10 = r10.schedule(r2, r0, r3)     // Catch:{ all -> 0x003b }
            r8.f1860d = r10     // Catch:{ all -> 0x003b }
        L_0x0097:
            monitor-exit(r9)     // Catch:{ all -> 0x003b }
            return
        L_0x0099:
            monitor-exit(r9)     // Catch:{ all -> 0x003b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.a.a(long):void");
    }

    public final boolean b() {
        boolean z3;
        synchronized (this.f1857a) {
            if (this.f1859c > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public final void c() {
        if (this.f1868l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f1866j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f1857a) {
            try {
                if (this.f1863g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                if (this.f1867k.containsKey((Object) null)) {
                    b bVar = (b) this.f1867k.get((Object) null);
                    if (bVar != null) {
                        int i3 = bVar.f1870a - 1;
                        bVar.f1870a = i3;
                        if (i3 == 0) {
                            this.f1867k.remove((Object) null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f1866j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f1862f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1857a
            monitor-enter(r0)
            boolean r1 = r6.b()     // Catch:{ all -> 0x000b }
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r1 = move-exception
            goto L_0x00a5
        L_0x000e:
            boolean r1 = r6.f1863g     // Catch:{ all -> 0x000b }
            r2 = 0
            if (r1 == 0) goto L_0x001e
            int r1 = r6.f1859c     // Catch:{ all -> 0x000b }
            int r1 = r1 + -1
            r6.f1859c = r1     // Catch:{ all -> 0x000b }
            if (r1 > 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x001e:
            r6.f1859c = r2     // Catch:{ all -> 0x000b }
        L_0x0020:
            r6.d()     // Catch:{ all -> 0x000b }
            java.util.HashMap r1 = r6.f1867k     // Catch:{ all -> 0x000b }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x000b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x000b }
        L_0x002d:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x000b }
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x000b }
            V0.b r3 = (V0.b) r3     // Catch:{ all -> 0x000b }
            r3.f1870a = r2     // Catch:{ all -> 0x000b }
            goto L_0x002d
        L_0x003c:
            java.util.HashMap r1 = r6.f1867k     // Catch:{ all -> 0x000b }
            r1.clear()     // Catch:{ all -> 0x000b }
            java.util.concurrent.ScheduledFuture r1 = r6.f1860d     // Catch:{ all -> 0x000b }
            r3 = 0
            if (r1 == 0) goto L_0x004f
            r1.cancel(r2)     // Catch:{ all -> 0x000b }
            r6.f1860d = r3     // Catch:{ all -> 0x000b }
            r1 = 0
            r6.f1861e = r1     // Catch:{ all -> 0x000b }
        L_0x004f:
            android.os.PowerManager$WakeLock r1 = r6.f1858b     // Catch:{ all -> 0x000b }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x0092
            android.os.PowerManager$WakeLock r1 = r6.f1858b     // Catch:{ RuntimeException -> 0x0065 }
            r1.release()     // Catch:{ RuntimeException -> 0x0065 }
            R0.a r1 = r6.f1864h     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x00a3
            r6.f1864h = r3     // Catch:{ all -> 0x000b }
            goto L_0x00a3
        L_0x0063:
            r1 = move-exception
            goto L_0x008b
        L_0x0065:
            r1 = move-exception
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x0063 }
            java.lang.Class<java.lang.RuntimeException> r4 = java.lang.RuntimeException.class
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = "WakeLock"
            java.lang.String r4 = r6.f1866j     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = " failed to release!"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0063 }
            android.util.Log.e(r2, r4, r1)     // Catch:{ all -> 0x0063 }
            R0.a r1 = r6.f1864h     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x00a3
            r6.f1864h = r3     // Catch:{ all -> 0x000b }
            goto L_0x00a3
        L_0x008a:
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x008b:
            R0.a r2 = r6.f1864h     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x0091
            r6.f1864h = r3     // Catch:{ all -> 0x000b }
        L_0x0091:
            throw r1     // Catch:{ all -> 0x000b }
        L_0x0092:
            java.lang.String r1 = "WakeLock"
            java.lang.String r2 = r6.f1866j     // Catch:{ all -> 0x000b }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x000b }
            java.lang.String r3 = " should be held!"
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x000b }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x000b }
        L_0x00a3:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.a.e():void");
    }
}
