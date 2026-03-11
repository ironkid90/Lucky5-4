package x;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.C0339f;
import n.k;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final C0339f f4755a = new C0339f(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f4756b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4757c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final k f4758d = new k();

    /* JADX WARNING: type inference failed for: r9v0, types: [x.i, java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ? obj = new Object();
        obj.f4765a = "fonts-androidx";
        obj.f4766b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4756b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static x.e a(java.lang.String r6, android.content.Context r7, s1.C0465z r8, int r9) {
        /*
            n.f r0 = f4755a
            java.lang.Object r1 = r0.a(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0010
            x.e r6 = new x.e
            r6.<init>((android.graphics.Typeface) r1)
            return r6
        L_0x0010:
            F0.y r8 = x.b.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x005c }
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f361b
            x.g[] r3 = (x.g[]) r3
            int r8 = r8.f360a
            if (r8 == 0) goto L_0x0024
            if (r8 == r1) goto L_0x0022
        L_0x0020:
            r1 = r2
            goto L_0x003d
        L_0x0022:
            r1 = -2
            goto L_0x003d
        L_0x0024:
            if (r3 == 0) goto L_0x003d
            int r8 = r3.length
            if (r8 != 0) goto L_0x002a
            goto L_0x003d
        L_0x002a:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L_0x002d:
            if (r4 >= r8) goto L_0x003d
            r5 = r3[r4]
            int r5 = r5.f4763e
            if (r5 == 0) goto L_0x003a
            if (r5 >= 0) goto L_0x0038
            goto L_0x0020
        L_0x0038:
            r1 = r5
            goto L_0x003d
        L_0x003a:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x003d:
            if (r1 == 0) goto L_0x0045
            x.e r6 = new x.e
            r6.<init>((int) r1)
            return r6
        L_0x0045:
            a.a r8 = t.C0470d.f4640a
            android.graphics.Typeface r7 = r8.i(r7, r3, r9)
            if (r7 == 0) goto L_0x0056
            r0.b(r6, r7)
            x.e r6 = new x.e
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x0056:
            x.e r6 = new x.e
            r6.<init>((int) r2)
            return r6
        L_0x005c:
            x.e r6 = new x.e
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.f.a(java.lang.String, android.content.Context, s1.z, int):x.e");
    }
}
