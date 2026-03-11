package t;

import a.C0094a;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import n.C0339f;

/* renamed from: t.d  reason: case insensitive filesystem */
public abstract class C0470d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0094a f4640a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0339f f4641b = new C0339f(16);

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f4640a = new C0094a();
        } else if (i3 >= 28) {
            f4640a = new C0473g();
        } else if (i3 >= 26) {
            f4640a = new C0473g();
        } else {
            Method method = C0472f.f4649n;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f4640a = new C0094a();
            } else {
                f4640a = new C0094a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r6.equals(r10) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r14, s.b r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, C0.u r21) {
        /*
            r0 = r14
            r1 = r15
            r7 = r20
            r2 = r21
            r8 = 1
            r3 = 10
            r4 = 0
            r5 = 13
            boolean r6 = r1 instanceof s.e
            if (r6 == 0) goto L_0x017c
            s.e r1 = (s.e) r1
            java.lang.String r6 = r1.f4468d
            r9 = 0
            if (r6 == 0) goto L_0x0031
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x001e
            goto L_0x0031
        L_0x001e:
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r4)
            android.graphics.Typeface r10 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r4)
            if (r6 == 0) goto L_0x0031
            boolean r10 = r6.equals(r10)
            if (r10 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r6 = r9
        L_0x0032:
            if (r6 == 0) goto L_0x0046
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            L1.h r1 = new L1.h
            r1.<init>(r3, r2, r6)
            r0.post(r1)
            return r6
        L_0x0046:
            int r3 = r1.f4467c
            if (r3 != 0) goto L_0x004c
            r3 = r8
            goto L_0x004d
        L_0x004c:
            r3 = r4
        L_0x004d:
            int r10 = r1.f4466b
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            r6.<init>(r11)
            b2.h r11 = new b2.h
            r11.<init>((int) r5)
            r11.f2743g = r2
            s1.z r12 = r1.f4465a
            c2.n r13 = new c2.n
            r1 = 14
            r13.<init>((int) r1, (java.lang.Object) r11, (java.lang.Object) r6)
            if (r3 == 0) goto L_0x00ee
            n.f r1 = x.f.f4755a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r12.f4631k
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = r1.toString()
            n.f r1 = x.f.f4755a
            java.lang.Object r1 = r1.a(r2)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0099
            C0.n r0 = new C0.n
            r0.<init>(r5, r11, r1)
            r6.post(r0)
        L_0x0096:
            r9 = r1
            goto L_0x0177
        L_0x0099:
            r1 = -1
            if (r10 != r1) goto L_0x00a7
            x.e r0 = x.f.a(r2, r14, r12, r7)
            r13.n(r0)
            android.graphics.Typeface r9 = r0.f4753a
            goto L_0x0177
        L_0x00a7:
            x.c r8 = new x.c
            r6 = 0
            r1 = r8
            r3 = r14
            r4 = r12
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = x.f.f4756b     // Catch:{ InterruptedException -> 0x00db }
            java.util.concurrent.Future r0 = r0.submit(r8)     // Catch:{ InterruptedException -> 0x00db }
            long r1 = (long) r10
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00ca, InterruptedException -> 0x00c8, TimeoutException -> 0x00cc }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ ExecutionException -> 0x00ca, InterruptedException -> 0x00c8, TimeoutException -> 0x00cc }
            x.e r0 = (x.e) r0     // Catch:{ InterruptedException -> 0x00db }
            r13.n(r0)     // Catch:{ InterruptedException -> 0x00db }
            android.graphics.Typeface r9 = r0.f4753a     // Catch:{ InterruptedException -> 0x00db }
            goto L_0x0177
        L_0x00c8:
            r0 = move-exception
            goto L_0x00d4
        L_0x00ca:
            r0 = move-exception
            goto L_0x00d5
        L_0x00cc:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00db }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x00db }
            throw r0     // Catch:{ InterruptedException -> 0x00db }
        L_0x00d4:
            throw r0     // Catch:{ InterruptedException -> 0x00db }
        L_0x00d5:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00db }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x00db }
            throw r1     // Catch:{ InterruptedException -> 0x00db }
        L_0x00db:
            C0.e r0 = new C0.e
            java.lang.Object r1 = r13.f2789g
            b2.h r1 = (b2.h) r1
            r2 = -3
            r0.<init>((b2.h) r1, (int) r2)
            java.lang.Object r1 = r13.f2790h
            android.os.Handler r1 = (android.os.Handler) r1
            r1.post(r0)
            goto L_0x0177
        L_0x00ee:
            n.f r1 = x.f.f4755a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r12.f4631k
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            n.f r1 = x.f.f4755a
            java.lang.Object r1 = r1.a(r10)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x011c
            C0.n r0 = new C0.n
            r0.<init>(r5, r11, r1)
            r6.post(r0)
            goto L_0x0096
        L_0x011c:
            x.d r1 = new x.d
            r1.<init>(r4, r13)
            java.lang.Object r4 = x.f.f4757c
            monitor-enter(r4)
            n.k r2 = x.f.f4758d     // Catch:{ all -> 0x0133 }
            java.lang.Object r3 = r2.getOrDefault(r10, r9)     // Catch:{ all -> 0x0133 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0133 }
            if (r3 == 0) goto L_0x0135
            r3.add(r1)     // Catch:{ all -> 0x0133 }
            monitor-exit(r4)     // Catch:{ all -> 0x0133 }
            goto L_0x0177
        L_0x0133:
            r0 = move-exception
            goto L_0x017a
        L_0x0135:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0133 }
            r3.<init>()     // Catch:{ all -> 0x0133 }
            r3.add(r1)     // Catch:{ all -> 0x0133 }
            r2.put(r10, r3)     // Catch:{ all -> 0x0133 }
            monitor-exit(r4)     // Catch:{ all -> 0x0133 }
            x.c r11 = new x.c
            r6 = 1
            r1 = r11
            r2 = r10
            r3 = r14
            r4 = r12
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = x.f.f4756b
            x.d r1 = new x.d
            r1.<init>(r8, r10)
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L_0x0164
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            goto L_0x0169
        L_0x0164:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
        L_0x0169:
            C0.l r3 = new C0.l
            r3.<init>()
            r3.f137g = r11
            r3.f138h = r1
            r3.f139i = r2
            r0.execute(r3)
        L_0x0177:
            r5 = r16
            goto L_0x019d
        L_0x017a:
            monitor-exit(r4)     // Catch:{ all -> 0x0133 }
            throw r0
        L_0x017c:
            a.a r4 = f4640a
            s.c r1 = (s.c) r1
            r5 = r16
            android.graphics.Typeface r9 = r4.h(r14, r1, r5, r7)
            if (r9 == 0) goto L_0x019a
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            L1.h r1 = new L1.h
            r1.<init>(r3, r2, r9)
            r0.post(r1)
            goto L_0x019d
        L_0x019a:
            r21.a()
        L_0x019d:
            if (r9 == 0) goto L_0x01a8
            n.f r0 = f4641b
            java.lang.String r1 = b(r16, r17, r18, r19, r20)
            r0.b(r1, r9)
        L_0x01a8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0470d.a(android.content.Context, s.b, android.content.res.Resources, int, java.lang.String, int, int, C0.u):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }
}
