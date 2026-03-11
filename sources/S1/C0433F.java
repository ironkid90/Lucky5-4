package s1;

import T1.d;
import W0.i;
import W0.p;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n.C0335b;
import n.k;

/* renamed from: s1.F  reason: case insensitive filesystem */
public final class C0433F {

    /* renamed from: i  reason: collision with root package name */
    public static final long f4502i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f4503j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4504a;

    /* renamed from: b  reason: collision with root package name */
    public final C0458s f4505b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4506c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseMessaging f4507d;

    /* renamed from: e  reason: collision with root package name */
    public final C0335b f4508e = new k();

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4509f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4510g = false;

    /* renamed from: h  reason: collision with root package name */
    public final C0431D f4511h;

    /* JADX WARNING: type inference failed for: r0v0, types: [n.b, n.k] */
    public C0433F(FirebaseMessaging firebaseMessaging, C0458s sVar, C0431D d3, d dVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f4507d = firebaseMessaging;
        this.f4505b = sVar;
        this.f4511h = d3;
        this.f4506c = dVar;
        this.f4504a = context;
        this.f4509f = scheduledThreadPoolExecutor;
    }

    public static void a(p pVar) {
        try {
            a.e(pVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        }
    }

    public final void b(String str) {
        String a2 = this.f4507d.a();
        d dVar = this.f4506c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(dVar.l(dVar.p(a2, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a2 = this.f4507d.a();
        d dVar = this.f4506c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(dVar.l(dVar.p(a2, "/topics/" + str, bundle)));
    }

    public final p d(C0430C c3) {
        ArrayDeque arrayDeque;
        C0431D d3 = this.f4511h;
        synchronized (d3) {
            C0465z zVar = d3.f4496a;
            String str = c3.f4494c;
            zVar.getClass();
            if (!TextUtils.isEmpty(str)) {
                if (!str.contains((String) zVar.f4629i)) {
                    synchronized (((ArrayDeque) zVar.f4630j)) {
                        if (((ArrayDeque) zVar.f4630j).add(str)) {
                            ((ScheduledThreadPoolExecutor) zVar.f4631k).execute(new L1.d(8, (Object) zVar));
                        }
                    }
                }
            }
        }
        i iVar = new i();
        synchronized (this.f4508e) {
            try {
                String str2 = c3.f4494c;
                if (this.f4508e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.f4508e.getOrDefault(str2, (Object) null);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f4508e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(iVar);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return iVar.f1875a;
    }

    public final synchronized void e(boolean z3) {
        this.f4510g = z3;
    }

    public final void f() {
        boolean z3;
        if (this.f4511h.a() != null) {
            synchronized (this) {
                z3 = this.f4510g;
            }
            if (!z3) {
                h(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r8 = r0.f4493b;
        r9 = r8.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r9 == 83) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r9 == 85) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r8.equals("U") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (r8.equals("S") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r8 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        r10 = r0.f4492a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r8 == 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r8 == 1) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        android.util.Log.d("FirebaseMessaging", "Unknown topic operation" + r0 + ".");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        c(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0081, code lost:
        android.util.Log.d("FirebaseMessaging", "Unsubscribe from topic: " + r10 + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        b(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        android.util.Log.d("FirebaseMessaging", "Subscribe to topic: " + r10 + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        r1 = r11.f4511h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2 = r1.f4496a;
        r3 = r0.f4494c;
        r4 = (java.util.ArrayDeque) r2.f4630j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c5, code lost:
        if (((java.util.ArrayDeque) r2.f4630j).remove(r3) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        ((java.util.concurrent.ScheduledThreadPoolExecutor) r2.f4631k).execute(new L1.d(8, (java.lang.Object) r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d5, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d6, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
        r2 = r11.f4508e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d9, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r0 = r0.f4494c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e2, code lost:
        if (r11.f4508e.containsKey(r0) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e4, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        r1 = (java.util.ArrayDeque) r11.f4508e.getOrDefault(r0, (java.lang.Object) null);
        r4 = (W0.i) r1.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f8, code lost:
        if (r4 == null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fa, code lost:
        r4.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0101, code lost:
        if (r1.isEmpty() == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0103, code lost:
        r11.f4508e.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0108, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011d, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r0.getMessage()) != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x013c, code lost:
        if (r0.getMessage() == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x013e, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0144, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0145, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed: " + r0.getMessage() + ". Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r11 = this;
        L_0x0000:
            monitor-enter(r11)
            s1.D r0 = r11.f4511h     // Catch:{ all -> 0x001b }
            s1.C r0 = r0.a()     // Catch:{ all -> 0x001b }
            r1 = 3
            r2 = 1
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x001b }
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            goto L_0x0160
        L_0x001e:
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            return r2
        L_0x0020:
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r4 = "Unknown topic operation"
            java.lang.String r5 = "Subscribe to topic: "
            java.lang.String r6 = "Unsubscribe from topic: "
            r7 = 0
            java.lang.String r8 = r0.f4493b     // Catch:{ IOException -> 0x0043 }
            int r9 = r8.hashCode()     // Catch:{ IOException -> 0x0043 }
            r10 = 83
            if (r9 == r10) goto L_0x0046
            r10 = 85
            if (r9 == r10) goto L_0x0039
            goto L_0x0050
        L_0x0039:
            java.lang.String r9 = "U"
            boolean r8 = r8.equals(r9)     // Catch:{ IOException -> 0x0043 }
            if (r8 == 0) goto L_0x0050
            r8 = r2
            goto L_0x0051
        L_0x0043:
            r0 = move-exception
            goto L_0x0113
        L_0x0046:
            java.lang.String r9 = "S"
            boolean r8 = r8.equals(r9)     // Catch:{ IOException -> 0x0043 }
            if (r8 == 0) goto L_0x0050
            r8 = r7
            goto L_0x0051
        L_0x0050:
            r8 = -1
        L_0x0051:
            java.lang.String r9 = " succeeded."
            java.lang.String r10 = r0.f4492a
            if (r8 == 0) goto L_0x0094
            if (r8 == r2) goto L_0x0076
            java.lang.String r2 = "FirebaseMessaging"
            boolean r1 = android.util.Log.isLoggable(r2, r1)     // Catch:{ IOException -> 0x0043 }
            if (r1 == 0) goto L_0x00b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0043 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0043 }
            r1.append(r0)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r2 = "."
            r1.append(r2)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0043 }
            android.util.Log.d(r3, r1)     // Catch:{ IOException -> 0x0043 }
            goto L_0x00b1
        L_0x0076:
            r11.c(r10)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r2 = "FirebaseMessaging"
            boolean r1 = android.util.Log.isLoggable(r2, r1)     // Catch:{ IOException -> 0x0043 }
            if (r1 == 0) goto L_0x00b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0043 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0043 }
            r1.append(r10)     // Catch:{ IOException -> 0x0043 }
            r1.append(r9)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0043 }
            android.util.Log.d(r3, r1)     // Catch:{ IOException -> 0x0043 }
            goto L_0x00b1
        L_0x0094:
            r11.b(r10)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r2 = "FirebaseMessaging"
            boolean r1 = android.util.Log.isLoggable(r2, r1)     // Catch:{ IOException -> 0x0043 }
            if (r1 == 0) goto L_0x00b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0043 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0043 }
            r1.append(r10)     // Catch:{ IOException -> 0x0043 }
            r1.append(r9)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0043 }
            android.util.Log.d(r3, r1)     // Catch:{ IOException -> 0x0043 }
        L_0x00b1:
            s1.D r1 = r11.f4511h
            monitor-enter(r1)
            s1.z r2 = r1.f4496a     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.f4494c     // Catch:{ all -> 0x0110 }
            java.lang.Object r4 = r2.f4630j     // Catch:{ all -> 0x0110 }
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch:{ all -> 0x0110 }
            monitor-enter(r4)     // Catch:{ all -> 0x0110 }
            java.lang.Object r5 = r2.f4630j     // Catch:{ all -> 0x010d }
            java.util.ArrayDeque r5 = (java.util.ArrayDeque) r5     // Catch:{ all -> 0x010d }
            boolean r3 = r5.remove(r3)     // Catch:{ all -> 0x010d }
            if (r3 == 0) goto L_0x00d5
            L1.d r3 = new L1.d     // Catch:{ all -> 0x010d }
            r5 = 8
            r3.<init>((int) r5, (java.lang.Object) r2)     // Catch:{ all -> 0x010d }
            java.lang.Object r2 = r2.f4631k     // Catch:{ all -> 0x010d }
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = (java.util.concurrent.ScheduledThreadPoolExecutor) r2     // Catch:{ all -> 0x010d }
            r2.execute(r3)     // Catch:{ all -> 0x010d }
        L_0x00d5:
            monitor-exit(r4)     // Catch:{ all -> 0x010d }
            monitor-exit(r1)
            n.b r2 = r11.f4508e
            monitor-enter(r2)
            java.lang.String r0 = r0.f4494c     // Catch:{ all -> 0x00e7 }
            n.b r1 = r11.f4508e     // Catch:{ all -> 0x00e7 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x00e7 }
            if (r1 != 0) goto L_0x00e9
            monitor-exit(r2)     // Catch:{ all -> 0x00e7 }
            goto L_0x0000
        L_0x00e7:
            r0 = move-exception
            goto L_0x010b
        L_0x00e9:
            n.b r1 = r11.f4508e     // Catch:{ all -> 0x00e7 }
            r3 = 0
            java.lang.Object r1 = r1.getOrDefault(r0, r3)     // Catch:{ all -> 0x00e7 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00e7 }
            java.lang.Object r4 = r1.poll()     // Catch:{ all -> 0x00e7 }
            W0.i r4 = (W0.i) r4     // Catch:{ all -> 0x00e7 }
            if (r4 == 0) goto L_0x00fd
            r4.b(r3)     // Catch:{ all -> 0x00e7 }
        L_0x00fd:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00e7 }
            if (r1 == 0) goto L_0x0108
            n.b r1 = r11.f4508e     // Catch:{ all -> 0x00e7 }
            r1.remove(r0)     // Catch:{ all -> 0x00e7 }
        L_0x0108:
            monitor-exit(r2)     // Catch:{ all -> 0x00e7 }
            goto L_0x0000
        L_0x010b:
            monitor-exit(r2)     // Catch:{ all -> 0x00e7 }
            throw r0
        L_0x010d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010d }
            throw r0     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0110 }
            throw r0
        L_0x0113:
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r2 = r0.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0145
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r2 = r0.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0145
            java.lang.String r1 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r2 = r0.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0138
            goto L_0x0145
        L_0x0138:
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x0144
            java.lang.String r0 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r3, r0)
            goto L_0x015f
        L_0x0144:
            throw r0
        L_0x0145:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Topic operation failed: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = ". Will retry Topic operation."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r3, r0)
        L_0x015f:
            return r7
        L_0x0160:
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.C0433F.g():boolean");
    }

    public final void h(long j3) {
        long min = Math.min(Math.max(30, 2 * j3), f4502i);
        this.f4509f.schedule(new C0435H(this, this.f4504a, this.f4505b, min), j3, TimeUnit.SECONDS);
        e(true);
    }
}
