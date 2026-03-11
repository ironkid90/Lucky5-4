package F0;

import C0.r;
import D0.a;
import G0.h;
import G0.y;
import I0.c;
import K0.b;
import O0.e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import n.C0336c;

public final class d implements Handler.Callback {

    /* renamed from: o  reason: collision with root package name */
    public static final Status f303o = new Status(4, "Sign-out occurred while this API call was in progress.", (PendingIntent) null, (a) null);

    /* renamed from: p  reason: collision with root package name */
    public static final Status f304p = new Status(4, "The user must be signed in to make this API call.", (PendingIntent) null, (a) null);

    /* renamed from: q  reason: collision with root package name */
    public static final Object f305q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static d f306r;

    /* renamed from: a  reason: collision with root package name */
    public long f307a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f308b = false;

    /* renamed from: c  reason: collision with root package name */
    public h f309c;

    /* renamed from: d  reason: collision with root package name */
    public c f310d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f311e;

    /* renamed from: f  reason: collision with root package name */
    public final D0.d f312f;

    /* renamed from: g  reason: collision with root package name */
    public final r f313g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f314h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f315i;

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f316j;

    /* renamed from: k  reason: collision with root package name */
    public final C0336c f317k;

    /* renamed from: l  reason: collision with root package name */
    public final C0336c f318l;

    /* renamed from: m  reason: collision with root package name */
    public final e f319m;

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f320n;

    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Handler, O0.e] */
    public d(Context context, Looper looper) {
        D0.d dVar = D0.d.f200c;
        boolean z3 = true;
        this.f314h = new AtomicInteger(1);
        this.f315i = new AtomicInteger(0);
        this.f316j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f317k = new C0336c(0);
        this.f318l = new C0336c(0);
        this.f320n = true;
        this.f311e = context;
        ? handler = new Handler(looper, this);
        this.f319m = handler;
        this.f312f = dVar;
        this.f313g = new r(8);
        PackageManager packageManager = context.getPackageManager();
        if (b.f856e == null) {
            b.f856e = Boolean.valueOf((!b.b() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z3);
        }
        if (b.f856e.booleanValue()) {
            this.f320n = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static Status b(a aVar, a aVar2) {
        String valueOf = String.valueOf(aVar2);
        return new Status(17, "API: " + ((String) aVar.f296b.f161h) + " is not available on this device. Connection failed with: " + valueOf, aVar2.f191c, aVar2);
    }

    public static d d(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (f305q) {
            if (f306r == null) {
                synchronized (y.f459g) {
                    try {
                        handlerThread = y.f461i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            y.f461i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = y.f461i;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = D0.d.f199b;
                f306r = new d(applicationContext, looper);
            }
            dVar = f306r;
        }
        return dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(D0.a r8, int r9) {
        /*
            r7 = this;
            D0.d r0 = r7.f312f
            android.content.Context r1 = r7.f311e
            r0.getClass()
            java.lang.Class<M0.a> r2 = M0.a.class
            monitor-enter(r2)
            android.content.Context r3 = r1.getApplicationContext()     // Catch:{ all -> 0x0020 }
            android.content.Context r4 = M0.a.f1084a     // Catch:{ all -> 0x0020 }
            r5 = 0
            if (r4 == 0) goto L_0x0023
            java.lang.Boolean r6 = M0.a.f1085b     // Catch:{ all -> 0x0020 }
            if (r6 == 0) goto L_0x0023
            if (r4 == r3) goto L_0x001a
            goto L_0x0023
        L_0x001a:
            boolean r3 = r6.booleanValue()     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            goto L_0x0055
        L_0x0020:
            r8 = move-exception
            goto L_0x009b
        L_0x0023:
            M0.a.f1085b = r5     // Catch:{ all -> 0x0020 }
            boolean r4 = K0.b.b()     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x003a
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ all -> 0x0020 }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x0020 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0020 }
            M0.a.f1085b = r4     // Catch:{ all -> 0x0020 }
            goto L_0x004c
        L_0x003a:
            java.lang.ClassLoader r4 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0048 }
            java.lang.String r6 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0048 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0048 }
            M0.a.f1085b = r4     // Catch:{ ClassNotFoundException -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0020 }
            M0.a.f1085b = r4     // Catch:{ all -> 0x0020 }
        L_0x004c:
            M0.a.f1084a = r3     // Catch:{ all -> 0x0020 }
            java.lang.Boolean r3 = M0.a.f1085b     // Catch:{ all -> 0x0020 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
        L_0x0055:
            r2 = 0
            if (r3 == 0) goto L_0x0059
            goto L_0x009a
        L_0x0059:
            int r3 = r8.f190b
            if (r3 == 0) goto L_0x0062
            android.app.PendingIntent r4 = r8.f191c
            if (r4 == 0) goto L_0x0062
            goto L_0x0070
        L_0x0062:
            android.content.Intent r3 = r0.a(r3, r1, r5)
            if (r3 != 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            r4 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r1, r2, r3, r4)
        L_0x006f:
            r4 = r5
        L_0x0070:
            if (r4 == 0) goto L_0x009a
            int r8 = r8.f190b
            int r3 = com.google.android.gms.common.api.GoogleApiActivity.f2822g
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r5 = com.google.android.gms.common.api.GoogleApiActivity.class
            r3.<init>(r1, r5)
            java.lang.String r5 = "pending_intent"
            r3.putExtra(r5, r4)
            java.lang.String r4 = "failing_client_id"
            r3.putExtra(r4, r9)
            java.lang.String r9 = "notify_manager"
            r4 = 1
            r3.putExtra(r9, r4)
            int r9 = O0.d.f1237a
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r9 = r9 | r5
            android.app.PendingIntent r9 = android.app.PendingIntent.getActivity(r1, r2, r3, r9)
            r0.f(r1, r8, r9)
            r2 = r4
        L_0x009a:
            return r2
        L_0x009b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.d.a(D0.a, int):boolean");
    }

    public final l c(c cVar) {
        a aVar = cVar.f701e;
        ConcurrentHashMap concurrentHashMap = this.f316j;
        l lVar = (l) concurrentHashMap.get(aVar);
        if (lVar == null) {
            lVar = new l(this, cVar);
            concurrentHashMap.put(aVar, lVar);
        }
        if (lVar.f327d.l()) {
            this.f318l.add(aVar);
        }
        lVar.m();
        return lVar;
    }

    public final void e(a aVar, int i3) {
        if (!a(aVar, i3)) {
            e eVar = this.f319m;
            eVar.sendMessage(eVar.obtainMessage(5, i3, 0, aVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        if (r2 != 0) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0121, code lost:
        if (r0 != 0) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            r14 = this;
            r0 = 0
            int r2 = r15.what
            java.lang.String r3 = "GoogleApiManager"
            O0.e r4 = r14.f319m
            java.util.concurrent.ConcurrentHashMap r5 = r14.f316j
            r6 = -1
            r7 = 203400000(0xc1fa340, float:1.2298041E-31)
            r8 = 300000(0x493e0, double:1.482197E-318)
            r10 = 17
            r11 = 0
            r12 = 0
            r13 = 1
            switch(r2) {
                case 1: goto L_0x0426;
                case 2: goto L_0x041b;
                case 3: goto L_0x03fa;
                case 4: goto L_0x03c3;
                case 5: goto L_0x0346;
                case 6: goto L_0x02f4;
                case 7: goto L_0x02eb;
                case 8: goto L_0x03c3;
                case 9: goto L_0x02cb;
                case 10: goto L_0x02a5;
                case 11: goto L_0x0247;
                case 12: goto L_0x01fd;
                case 13: goto L_0x03c3;
                case 14: goto L_0x01f2;
                case 15: goto L_0x01be;
                case 16: goto L_0x0140;
                case 17: goto L_0x00f1;
                case 18: goto L_0x002f;
                case 19: goto L_0x002b;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown message id: "
            r15.<init>(r0)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            android.util.Log.w(r3, r15)
            return r11
        L_0x002b:
            r14.f308b = r11
            goto L_0x0458
        L_0x002f:
            java.lang.Object r15 = r15.obj
            F0.r r15 = (F0.r) r15
            r15.getClass()
            int r15 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r15 != 0) goto L_0x005f
            G0.h r15 = new G0.h
            G0.e[] r0 = new G0.e[]{r12}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r15.<init>(r11, r0)
            I0.c r0 = r14.f310d
            if (r0 != 0) goto L_0x0058
            I0.c r0 = new I0.c
            E0.b r1 = E0.b.f223b
            android.content.Context r2 = r14.f311e
            C0.r r3 = I0.c.f696i
            r0.<init>(r2, r3, r1)
            r14.f310d = r0
        L_0x0058:
            I0.c r0 = r14.f310d
            r0.a(r15)
            goto L_0x0458
        L_0x005f:
            G0.h r15 = r14.f309c
            if (r15 == 0) goto L_0x00d5
            java.util.List r2 = r15.f419b
            int r15 = r15.f418a
            if (r15 != 0) goto L_0x0085
            if (r2 == 0) goto L_0x0072
            int r15 = r2.size()
            if (r15 < 0) goto L_0x0072
            goto L_0x0085
        L_0x0072:
            G0.h r15 = r14.f309c
            java.util.List r2 = r15.f419b
            if (r2 != 0) goto L_0x007f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r15.f419b = r2
        L_0x007f:
            java.util.List r15 = r15.f419b
            r15.add(r12)
            goto L_0x00d5
        L_0x0085:
            r4.removeMessages(r10)
            G0.h r15 = r14.f309c
            if (r15 == 0) goto L_0x00d5
            int r2 = r15.f418a
            if (r2 > 0) goto L_0x00bd
            boolean r2 = r14.f308b
            if (r2 == 0) goto L_0x0095
            goto L_0x00d3
        L_0x0095:
            java.lang.Class<G0.f> r2 = G0.f.class
            monitor-enter(r2)
            G0.f r3 = G0.f.f411g     // Catch:{ all -> 0x00a4 }
            if (r3 != 0) goto L_0x00a6
            G0.f r3 = new G0.f     // Catch:{ all -> 0x00a4 }
            r3.<init>(r11)     // Catch:{ all -> 0x00a4 }
            G0.f.f411g = r3     // Catch:{ all -> 0x00a4 }
            goto L_0x00a6
        L_0x00a4:
            r15 = move-exception
            goto L_0x00bb
        L_0x00a6:
            G0.f r3 = G0.f.f411g     // Catch:{ all -> 0x00a4 }
            monitor-exit(r2)
            r3.getClass()
            C0.r r2 = r14.f313g
            java.lang.Object r2 = r2.f160g
            android.util.SparseIntArray r2 = (android.util.SparseIntArray) r2
            int r2 = r2.get(r7, r6)
            if (r2 == r6) goto L_0x00bd
            if (r2 != 0) goto L_0x00d3
            goto L_0x00bd
        L_0x00bb:
            monitor-exit(r2)     // Catch:{ all -> 0x00a4 }
            throw r15
        L_0x00bd:
            I0.c r2 = r14.f310d
            if (r2 != 0) goto L_0x00ce
            I0.c r2 = new I0.c
            E0.b r3 = E0.b.f223b
            android.content.Context r5 = r14.f311e
            C0.r r6 = I0.c.f696i
            r2.<init>(r5, r6, r3)
            r14.f310d = r2
        L_0x00ce:
            I0.c r2 = r14.f310d
            r2.a(r15)
        L_0x00d3:
            r14.f309c = r12
        L_0x00d5:
            G0.h r15 = r14.f309c
            if (r15 != 0) goto L_0x0458
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r15.add(r12)
            G0.h r2 = new G0.h
            r2.<init>(r11, r15)
            r14.f309c = r2
            android.os.Message r15 = r4.obtainMessage(r10)
            r4.sendMessageDelayed(r15, r0)
            goto L_0x0458
        L_0x00f1:
            G0.h r15 = r14.f309c
            if (r15 == 0) goto L_0x0458
            int r0 = r15.f418a
            if (r0 > 0) goto L_0x0126
            boolean r0 = r14.f308b
            if (r0 == 0) goto L_0x00fe
            goto L_0x013c
        L_0x00fe:
            java.lang.Class<G0.f> r0 = G0.f.class
            monitor-enter(r0)
            G0.f r1 = G0.f.f411g     // Catch:{ all -> 0x010d }
            if (r1 != 0) goto L_0x010f
            G0.f r1 = new G0.f     // Catch:{ all -> 0x010d }
            r1.<init>(r11)     // Catch:{ all -> 0x010d }
            G0.f.f411g = r1     // Catch:{ all -> 0x010d }
            goto L_0x010f
        L_0x010d:
            r15 = move-exception
            goto L_0x0124
        L_0x010f:
            G0.f r1 = G0.f.f411g     // Catch:{ all -> 0x010d }
            monitor-exit(r0)
            r1.getClass()
            C0.r r0 = r14.f313g
            java.lang.Object r0 = r0.f160g
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r0 = r0.get(r7, r6)
            if (r0 == r6) goto L_0x0126
            if (r0 != 0) goto L_0x013c
            goto L_0x0126
        L_0x0124:
            monitor-exit(r0)     // Catch:{ all -> 0x010d }
            throw r15
        L_0x0126:
            I0.c r0 = r14.f310d
            if (r0 != 0) goto L_0x0137
            I0.c r0 = new I0.c
            E0.b r1 = E0.b.f223b
            android.content.Context r2 = r14.f311e
            C0.r r3 = I0.c.f696i
            r0.<init>(r2, r3, r1)
            r14.f310d = r0
        L_0x0137:
            I0.c r0 = r14.f310d
            r0.a(r15)
        L_0x013c:
            r14.f309c = r12
            goto L_0x0458
        L_0x0140:
            java.lang.Object r15 = r15.obj
            F0.m r15 = (F0.m) r15
            F0.a r0 = r15.f337a
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0458
            F0.a r0 = r15.f337a
            java.lang.Object r0 = r5.get(r0)
            F0.l r0 = (F0.l) r0
            java.util.ArrayList r1 = r0.f334k
            boolean r1 = r1.remove(r15)
            if (r1 == 0) goto L_0x0458
            F0.d r1 = r0.f336m
            O0.e r2 = r1.f319m
            r3 = 15
            r2.removeMessages(r3, r15)
            O0.e r1 = r1.f319m
            r2 = 16
            r1.removeMessages(r2, r15)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.LinkedList r2 = r0.f326c
            int r3 = r2.size()
            r1.<init>(r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x017b:
            boolean r4 = r3.hasNext()
            D0.c r5 = r15.f338b
            if (r4 == 0) goto L_0x01a5
            java.lang.Object r4 = r3.next()
            F0.q r4 = (F0.q) r4
            if (r4 == 0) goto L_0x017b
            D0.c[] r6 = r4.b(r0)
            if (r6 == 0) goto L_0x017b
            int r7 = r6.length
            r8 = r11
        L_0x0193:
            if (r8 >= r7) goto L_0x017b
            r9 = r6[r8]
            boolean r9 = G0.o.g(r9, r5)
            if (r9 == 0) goto L_0x01a3
            if (r8 < 0) goto L_0x017b
            r1.add(r4)
            goto L_0x017b
        L_0x01a3:
            int r8 = r8 + r13
            goto L_0x0193
        L_0x01a5:
            int r15 = r1.size()
        L_0x01a9:
            if (r11 >= r15) goto L_0x0458
            java.lang.Object r0 = r1.get(r11)
            F0.q r0 = (F0.q) r0
            r2.remove(r0)
            E0.g r3 = new E0.g
            r3.<init>(r5)
            r0.d(r3)
            int r11 = r11 + r13
            goto L_0x01a9
        L_0x01be:
            java.lang.Object r15 = r15.obj
            F0.m r15 = (F0.m) r15
            F0.a r0 = r15.f337a
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0458
            F0.a r0 = r15.f337a
            java.lang.Object r0 = r5.get(r0)
            F0.l r0 = (F0.l) r0
            java.util.ArrayList r1 = r0.f334k
            boolean r15 = r1.contains(r15)
            if (r15 != 0) goto L_0x01dc
            goto L_0x0458
        L_0x01dc:
            boolean r15 = r0.f333j
            if (r15 != 0) goto L_0x0458
            E0.a r15 = r0.f327d
            boolean r15 = r15.c()
            if (r15 != 0) goto L_0x01ed
            r0.m()
            goto L_0x0458
        L_0x01ed:
            r0.g()
            goto L_0x0458
        L_0x01f2:
            java.lang.Object r15 = r15.obj
            r15.getClass()
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x01fd:
            java.lang.Object r0 = r15.obj
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0458
            java.lang.Object r15 = r15.obj
            java.lang.Object r15 = r5.get(r15)
            F0.l r15 = (F0.l) r15
            F0.d r0 = r15.f336m
            O0.e r0 = r0.f319m
            G0.o.a(r0)
            E0.a r0 = r15.f327d
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0458
            java.util.HashMap r1 = r15.f331h
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0458
            C0.r r1 = r15.f329f
            java.lang.Object r2 = r1.f160g
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0242
            java.lang.Object r1 = r1.f161h
            java.util.Map r1 = (java.util.Map) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x023b
            goto L_0x0242
        L_0x023b:
            java.lang.String r15 = "Timing out service connection."
            r0.k(r15)
            goto L_0x0458
        L_0x0242:
            r15.j()
            goto L_0x0458
        L_0x0247:
            java.lang.Object r0 = r15.obj
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0458
            java.lang.Object r15 = r15.obj
            java.lang.Object r15 = r5.get(r15)
            F0.l r15 = (F0.l) r15
            F0.d r0 = r15.f336m
            O0.e r1 = r0.f319m
            G0.o.a(r1)
            boolean r1 = r15.f333j
            if (r1 == 0) goto L_0x0458
            if (r1 == 0) goto L_0x0278
            F0.d r1 = r15.f336m
            O0.e r2 = r1.f319m
            F0.a r3 = r15.f328e
            r4 = 11
            r2.removeMessages(r4, r3)
            O0.e r1 = r1.f319m
            r2 = 9
            r1.removeMessages(r2, r3)
            r15.f333j = r11
        L_0x0278:
            int r1 = D0.e.f201a
            android.content.Context r2 = r0.f311e
            D0.d r0 = r0.f312f
            int r0 = r0.b(r2, r1)
            r1 = 18
            if (r0 != r1) goto L_0x0290
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 21
            java.lang.String r2 = "Connection timed out waiting for Google Play services update to complete."
            r0.<init>(r1, r2, r12, r12)
            goto L_0x0299
        L_0x0290:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 22
            java.lang.String r2 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r1, r2, r12, r12)
        L_0x0299:
            r15.e(r0)
            E0.a r15 = r15.f327d
            java.lang.String r0 = "Timing out connection while resuming."
            r15.k(r0)
            goto L_0x0458
        L_0x02a5:
            n.c r15 = r14.f318l
            java.util.Iterator r0 = r15.iterator()
        L_0x02ab:
            r1 = r0
            n.g r1 = (n.C0340g) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02c6
            java.lang.Object r1 = r1.next()
            F0.a r1 = (F0.a) r1
            java.lang.Object r1 = r5.remove(r1)
            F0.l r1 = (F0.l) r1
            if (r1 == 0) goto L_0x02ab
            r1.p()
            goto L_0x02ab
        L_0x02c6:
            r15.clear()
            goto L_0x0458
        L_0x02cb:
            java.lang.Object r0 = r15.obj
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0458
            java.lang.Object r15 = r15.obj
            java.lang.Object r15 = r5.get(r15)
            F0.l r15 = (F0.l) r15
            F0.d r0 = r15.f336m
            O0.e r0 = r0.f319m
            G0.o.a(r0)
            boolean r0 = r15.f333j
            if (r0 == 0) goto L_0x0458
            r15.m()
            goto L_0x0458
        L_0x02eb:
            java.lang.Object r15 = r15.obj
            I0.c r15 = (I0.c) r15
            r14.c(r15)
            goto L_0x0458
        L_0x02f4:
            android.content.Context r15 = r14.f311e
            android.content.Context r0 = r15.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L_0x0458
            android.content.Context r15 = r15.getApplicationContext()
            android.app.Application r15 = (android.app.Application) r15
            F0.c.a(r15)
            F0.c r15 = F0.c.f298j
            F0.j r0 = new F0.j
            r0.<init>(r14)
            r15.getClass()
            monitor-enter(r15)
            java.util.ArrayList r1 = r15.f301h     // Catch:{ all -> 0x0343 }
            r1.add(r0)     // Catch:{ all -> 0x0343 }
            monitor-exit(r15)     // Catch:{ all -> 0x0343 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.f300g
            boolean r1 = r0.get()
            java.util.concurrent.atomic.AtomicBoolean r15 = r15.f299f
            if (r1 != 0) goto L_0x0339
            android.app.ActivityManager$RunningAppProcessInfo r1 = new android.app.ActivityManager$RunningAppProcessInfo
            r1.<init>()
            android.app.ActivityManager.getMyMemoryState(r1)
            boolean r0 = r0.getAndSet(r13)
            if (r0 != 0) goto L_0x0339
            int r0 = r1.importance
            r1 = 100
            if (r0 <= r1) goto L_0x0339
            r15.set(r13)
        L_0x0339:
            boolean r15 = r15.get()
            if (r15 != 0) goto L_0x0458
            r14.f307a = r8
            goto L_0x0458
        L_0x0343:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0343 }
            throw r0
        L_0x0346:
            int r0 = r15.arg1
            java.lang.Object r15 = r15.obj
            D0.a r15 = (D0.a) r15
            java.util.Collection r1 = r5.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0354:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0365
            java.lang.Object r2 = r1.next()
            F0.l r2 = (F0.l) r2
            int r4 = r2.f332i
            if (r4 != r0) goto L_0x0354
            goto L_0x0366
        L_0x0365:
            r2 = r12
        L_0x0366:
            if (r2 == 0) goto L_0x03a6
            int r0 = r15.f190b
            r1 = 13
            if (r0 != r1) goto L_0x039b
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            D0.d r3 = r14.f312f
            r3.getClass()
            java.util.concurrent.atomic.AtomicBoolean r3 = D0.f.f202a
            java.lang.String r0 = D0.a.a(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Error resolution was canceled by the user, original error message: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            java.lang.String r15 = r15.f192d
            r3.append(r15)
            java.lang.String r15 = r3.toString()
            r1.<init>(r10, r15, r12, r12)
            r2.e(r1)
            goto L_0x0458
        L_0x039b:
            F0.a r0 = r2.f328e
            com.google.android.gms.common.api.Status r15 = b(r0, r15)
            r2.e(r15)
            goto L_0x0458
        L_0x03a6:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find API instance "
            r15.<init>(r1)
            r15.append(r0)
            java.lang.String r0 = " while trying to fail enqueued calls."
            r15.append(r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r15 = r15.toString()
            android.util.Log.wtf(r3, r15, r0)
            goto L_0x0458
        L_0x03c3:
            java.lang.Object r15 = r15.obj
            F0.s r15 = (F0.s) r15
            I0.c r0 = r15.f351c
            F0.a r0 = r0.f701e
            java.lang.Object r0 = r5.get(r0)
            F0.l r0 = (F0.l) r0
            if (r0 != 0) goto L_0x03d9
            I0.c r0 = r15.f351c
            F0.l r0 = r14.c(r0)
        L_0x03d9:
            E0.a r1 = r0.f327d
            boolean r1 = r1.l()
            F0.w r2 = r15.f349a
            if (r1 == 0) goto L_0x03f6
            java.util.concurrent.atomic.AtomicInteger r1 = r14.f315i
            int r1 = r1.get()
            int r15 = r15.f350b
            if (r1 == r15) goto L_0x03f6
            com.google.android.gms.common.api.Status r15 = f303o
            r2.c(r15)
            r0.p()
            goto L_0x0458
        L_0x03f6:
            r0.n(r2)
            goto L_0x0458
        L_0x03fa:
            java.util.Collection r15 = r5.values()
            java.util.Iterator r15 = r15.iterator()
        L_0x0402:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0458
            java.lang.Object r0 = r15.next()
            F0.l r0 = (F0.l) r0
            F0.d r1 = r0.f336m
            O0.e r1 = r1.f319m
            G0.o.a(r1)
            r0.f335l = r12
            r0.m()
            goto L_0x0402
        L_0x041b:
            java.lang.Object r15 = r15.obj
            r15.getClass()
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x0426:
            java.lang.Object r15 = r15.obj
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r13 == r15) goto L_0x0431
            goto L_0x0433
        L_0x0431:
            r8 = 10000(0x2710, double:4.9407E-320)
        L_0x0433:
            r14.f307a = r8
            r15 = 12
            r4.removeMessages(r15)
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0442:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0458
            java.lang.Object r1 = r0.next()
            F0.a r1 = (F0.a) r1
            android.os.Message r1 = r4.obtainMessage(r15, r1)
            long r2 = r14.f307a
            r4.sendMessageDelayed(r1, r2)
            goto L_0x0442
        L_0x0458:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.d.handleMessage(android.os.Message):boolean");
    }
}
