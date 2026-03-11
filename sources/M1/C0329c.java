package m1;

import G0.o;
import L1.l;
import W0.i;
import W0.p;
import X0.g;
import a1.m;
import android.net.TrafficStats;
import android.support.v4.media.session.a;
import android.util.Log;
import b1.j;
import c2.n;
import j1.e;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import l1.C0313a;
import n1.C0345a;
import n1.C0346b;
import o1.b;
import o1.c;
import o1.d;

/* renamed from: m1.c  reason: case insensitive filesystem */
public final class C0329c implements C0330d {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f4023m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final g f4024a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4025b;

    /* renamed from: c  reason: collision with root package name */
    public final n f4026c;

    /* renamed from: d  reason: collision with root package name */
    public final j f4027d;

    /* renamed from: e  reason: collision with root package name */
    public final m f4028e;

    /* renamed from: f  reason: collision with root package name */
    public final h f4029f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4030g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f4031h;

    /* renamed from: i  reason: collision with root package name */
    public final j f4032i;

    /* renamed from: j  reason: collision with root package name */
    public String f4033j;

    /* renamed from: k  reason: collision with root package name */
    public final HashSet f4034k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f4035l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, m1.h] */
    public C0329c(g gVar, C0313a aVar, ExecutorService executorService, j jVar) {
        gVar.a();
        c cVar = new c(gVar.f1936a, aVar);
        n nVar = new n(gVar);
        if (e.f3848h == null) {
            e.f3848h = new e(14);
        }
        e eVar = e.f3848h;
        if (j.f4043d == null) {
            j.f4043d = new j(eVar);
        }
        j jVar2 = j.f4043d;
        m mVar = new m(new a1.c(2, gVar));
        ? obj = new Object();
        this.f4030g = new Object();
        this.f4034k = new HashSet();
        this.f4035l = new ArrayList();
        this.f4024a = gVar;
        this.f4025b = cVar;
        this.f4026c = nVar;
        this.f4027d = jVar2;
        this.f4028e = mVar;
        this.f4029f = obj;
        this.f4031h = executorService;
        this.f4032i = jVar;
    }

    public final void a() {
        n e2;
        C0346b o3;
        synchronized (f4023m) {
            try {
                g gVar = this.f4024a;
                gVar.a();
                e2 = n.e(gVar.f1936a);
                o3 = this.f4026c.o();
                int i3 = o3.f4105b;
                boolean z3 = true;
                if (i3 != 2) {
                    if (i3 != 1) {
                        z3 = false;
                    }
                }
                if (z3) {
                    String f3 = f(o3);
                    n nVar = this.f4026c;
                    C0345a a2 = o3.a();
                    a2.f4097a = f3;
                    a2.f4098b = 3;
                    o3 = a2.a();
                    nVar.k(o3);
                }
                if (e2 != null) {
                    e2.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i(o3);
        this.f4032i.execute(new C0328b(this, 2));
    }

    public final C0346b b(C0346b bVar) {
        boolean z3;
        b f3;
        C0346b bVar2 = bVar;
        g gVar = this.f4024a;
        gVar.a();
        String str = gVar.f1938c.f1946a;
        String str2 = bVar2.f4104a;
        g gVar2 = this.f4024a;
        gVar2.a();
        String str3 = gVar2.f1938c.f1952g;
        String str4 = bVar2.f4107d;
        c cVar = this.f4025b;
        d dVar = cVar.f4158c;
        if (dVar.a()) {
            URL a2 = c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            int i3 = 0;
            while (i3 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c3 = cVar.c(a2, str);
                try {
                    c3.setRequestMethod("POST");
                    c3.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c3.setDoOutput(true);
                    c.h(c3);
                    int responseCode = c3.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        f3 = c.f(c3);
                    } else {
                        c.b(c3, (String) null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            l a3 = b.a();
                            a3.f964a = 3;
                            f3 = a3.a();
                        } else if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                l a4 = b.a();
                                a4.f964a = 2;
                                f3 = a4.a();
                            }
                            c3.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i3++;
                        } else {
                            throw new C0331e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    }
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int b3 = L.j.b(f3.f4153c);
                    if (b3 == 0) {
                        j jVar = this.f4027d;
                        jVar.getClass();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        jVar.f4044a.getClass();
                        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                        C0345a a5 = bVar.a();
                        a5.f4099c = f3.f4151a;
                        a5.f4101e = Long.valueOf(f3.f4152b);
                        a5.f4102f = Long.valueOf(seconds);
                        return a5.a();
                    } else if (b3 == 1) {
                        C0345a a6 = bVar.a();
                        a6.f4103g = "BAD CONFIG";
                        a6.f4098b = 5;
                        return a6.a();
                    } else if (b3 == 2) {
                        synchronized (this) {
                            this.f4033j = null;
                        }
                        C0345a a7 = bVar.a();
                        a7.f4098b = 2;
                        return a7.a();
                    } else {
                        throw new C0331e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new C0331e("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new C0331e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final p c() {
        String str;
        e();
        synchronized (this) {
            str = this.f4033j;
        }
        if (str != null) {
            return a.r(str);
        }
        i iVar = new i();
        g gVar = new g(iVar);
        synchronized (this.f4030g) {
            this.f4035l.add(gVar);
        }
        p pVar = iVar.f1875a;
        this.f4031h.execute(new C0328b(this, 0));
        return pVar;
    }

    public final p d() {
        e();
        i iVar = new i();
        f fVar = new f(this.f4027d, iVar);
        synchronized (this.f4030g) {
            this.f4035l.add(fVar);
        }
        this.f4031h.execute(new C0328b(this, 1));
        return iVar.f1875a;
    }

    public final void e() {
        g gVar = this.f4024a;
        gVar.a();
        o.c(gVar.f1938c.f1947b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        o.c(gVar.f1938c.f1952g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        o.c(gVar.f1938c.f1946a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f1938c.f1947b;
        Pattern pattern = j.f4042c;
        if (str.contains(":")) {
            gVar.a();
            if (!j.f4042c.matcher(gVar.f1938c.f1946a).matches()) {
                throw new IllegalArgumentException("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
            }
            return;
        }
        throw new IllegalArgumentException("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f1937b) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f(n1.C0346b r6) {
        /*
            r5 = this;
            X0.g r0 = r5.f4024a
            r0.a()
            java.lang.String r0 = r0.f1937b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            X0.g r0 = r5.f4024a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f1937b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005b
        L_0x001e:
            r0 = 1
            int r6 = r6.f4105b
            if (r6 != r0) goto L_0x005b
            a1.m r6 = r5.f4028e
            java.lang.Object r6 = r6.get()
            n1.c r6 = (n1.C0347c) r6
            android.content.SharedPreferences r0 = r6.f4112a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f4112a     // Catch:{ all -> 0x003f }
            monitor-enter(r1)     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r6.f4112a     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x0056 }
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0041
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0046
        L_0x003f:
            r6 = move-exception
            goto L_0x0059
        L_0x0041:
            java.lang.String r2 = r6.a()     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
        L_0x0046:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0055
            m1.h r6 = r5.f4029f
            r6.getClass()
            java.lang.String r2 = m1.h.a()
        L_0x0055:
            return r2
        L_0x0056:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            throw r6     // Catch:{ all -> 0x003f }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        L_0x005b:
            m1.h r6 = r5.f4029f
            r6.getClass()
            java.lang.String r6 = m1.h.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C0329c.f(n1.b):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r9.startsWith("{") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = new org.json.JSONObject(r9).getString("token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018e, code lost:
        r15.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0194, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }, ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }]), Splitter:B:34:0x00ba] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n1.C0346b g(n1.C0346b r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = r0.f4104a
            r3 = 4
            r5 = 0
            if (r2 == 0) goto L_0x006a
            int r2 = r2.length()
            r6 = 11
            if (r2 != r6) goto L_0x006a
            a1.m r2 = r1.f4028e
            java.lang.Object r2 = r2.get()
            n1.c r2 = (n1.C0347c) r2
            android.content.SharedPreferences r6 = r2.f4112a
            monitor-enter(r6)
            java.lang.String[] r7 = n1.C0347c.f4111c     // Catch:{ all -> 0x0061 }
            r8 = 0
        L_0x0020:
            if (r8 >= r3) goto L_0x0066
            r9 = r7[r8]     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = r2.f4113b     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            java.lang.String r12 = "|T|"
            r11.<init>(r12)     // Catch:{ all -> 0x0061 }
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            r11.append(r9)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0061 }
            android.content.SharedPreferences r10 = r2.f4112a     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r10.getString(r9, r5)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x0063
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r10 != 0) goto L_0x0063
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005f }
            r2.<init>(r9)     // Catch:{ JSONException -> 0x005f }
            java.lang.String r7 = "token"
            java.lang.String r5 = r2.getString(r7)     // Catch:{ JSONException -> 0x005f }
            goto L_0x005f
        L_0x005e:
            r5 = r9
        L_0x005f:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            goto L_0x006a
        L_0x0061:
            r0 = move-exception
            goto L_0x0068
        L_0x0063:
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0066:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            goto L_0x006a
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x006a:
            o1.c r2 = r1.f4025b
            X0.g r6 = r1.f4024a
            r6.a()
            X0.h r6 = r6.f1938c
            java.lang.String r6 = r6.f1946a
            java.lang.String r7 = r0.f4104a
            X0.g r8 = r1.f4024a
            r8.a()
            X0.h r8 = r8.f1938c
            java.lang.String r8 = r8.f1952g
            X0.g r9 = r1.f4024a
            r9.a()
            X0.h r9 = r9.f1938c
            java.lang.String r9 = r9.f1947b
            o1.d r10 = r2.f4158c
            boolean r11 = r10.a()
            java.lang.String r12 = "Firebase Installations Service is unavailable. Please try again later."
            if (r11 == 0) goto L_0x01a5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "projects/"
            r11.<init>(r13)
            r11.append(r8)
            java.lang.String r13 = "/installations"
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.net.URL r11 = o1.c.a(r11)
            r13 = 0
        L_0x00ab:
            r14 = 1
            if (r13 > r14) goto L_0x019f
            r15 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r15)
            java.net.HttpURLConnection r15 = r2.c(r11, r6)
            java.lang.String r4 = "POST"
            r15.setRequestMethod(r4)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            r15.setDoOutput(r14)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            if (r5 == 0) goto L_0x00cb
            java.lang.String r4 = "x-goog-fis-android-iid-migration-auth"
            r15.addRequestProperty(r4, r5)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            goto L_0x00cb
        L_0x00c8:
            r0 = move-exception
            goto L_0x018e
        L_0x00cb:
            o1.c.g(r15, r7, r9)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            int r4 = r15.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            r10.b(r4)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 < r3) goto L_0x00df
            r3 = 300(0x12c, float:4.2E-43)
            if (r4 >= r3) goto L_0x00df
            r3 = r14
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            if (r3 == 0) goto L_0x00f0
            o1.a r2 = o1.c.e(r15)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0127
        L_0x00ed:
            r3 = 4
            goto L_0x0195
        L_0x00f0:
            o1.c.b(r15, r9, r6, r8)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r3 = 429(0x1ad, float:6.01E-43)
            if (r4 == r3) goto L_0x0185
            r3 = 500(0x1f4, float:7.0E-43)
            if (r4 < r3) goto L_0x0108
            r3 = 600(0x258, float:8.41E-43)
            if (r4 >= r3) goto L_0x0108
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r3 = 4
            goto L_0x019b
        L_0x0108:
            java.lang.String r3 = "Firebase-Installations"
            java.lang.String r4 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r3, r4)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            o1.a r3 = new o1.a     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r20 = 0
            r19 = 0
            r21 = 2
            r18 = 0
            r17 = 0
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r3
        L_0x0127:
            int r3 = r2.f4150e
            int r3 = L.j.b(r3)
            if (r3 == 0) goto L_0x0149
            if (r3 != r14) goto L_0x0141
            n1.a r0 = r23.a()
            java.lang.String r2 = "BAD CONFIG"
            r0.f4103g = r2
            r2 = 5
            r0.f4098b = r2
            n1.b r0 = r0.a()
            return r0
        L_0x0141:
            m1.e r0 = new m1.e
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            r0.<init>(r2)
            throw r0
        L_0x0149:
            java.lang.String r3 = r2.f4147b
            java.lang.String r4 = r2.f4148c
            m1.j r5 = r1.f4027d
            r5.getClass()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            j1.e r5 = r5.f4044a
            r5.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r6.toSeconds(r7)
            o1.b r2 = r2.f4149d
            java.lang.String r7 = r2.f4151a
            long r8 = r2.f4152b
            n1.a r0 = r23.a()
            r0.f4097a = r3
            r3 = 4
            r0.f4098b = r3
            r0.f4099c = r7
            r0.f4100d = r4
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r0.f4101e = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.f4102f = r2
            n1.b r0 = r0.a()
            return r0
        L_0x0185:
            r3 = 4
            m1.e r4 = new m1.e     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            java.lang.String r14 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r4.<init>(r14)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            throw r4     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
        L_0x018e:
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0195:
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x019b:
            int r13 = r13 + 1
            goto L_0x00ab
        L_0x019f:
            m1.e r0 = new m1.e
            r0.<init>(r12)
            throw r0
        L_0x01a5:
            m1.e r0 = new m1.e
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C0329c.g(n1.b):n1.b");
    }

    public final void h(Exception exc) {
        synchronized (this.f4030g) {
            try {
                Iterator it = this.f4035l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public final void i(C0346b bVar) {
        synchronized (this.f4030g) {
            try {
                Iterator it = this.f4035l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }
}
