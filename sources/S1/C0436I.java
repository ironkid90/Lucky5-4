package s1;

import V0.a;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: s1.I  reason: case insensitive filesystem */
public abstract class C0436I {

    /* renamed from: a  reason: collision with root package name */
    public static final long f4522a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4523b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static a f4524c;

    public static void a(Context context) {
        if (f4524c == null) {
            a aVar = new a(context);
            f4524c = aVar;
            synchronized (aVar.f1857a) {
                aVar.f1863g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f4523b) {
            try {
                if (f4524c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f4524c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName c(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f4523b
            monitor-enter(r0)
            a(r4)     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r2 = 0
            boolean r1 = r5.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 1
            r5.putExtra(r2, r3)     // Catch:{ all -> 0x001c }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x001c }
            if (r4 != 0) goto L_0x001e
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            r4 = 0
            return r4
        L_0x001c:
            r4 = move-exception
            goto L_0x0029
        L_0x001e:
            if (r1 != 0) goto L_0x0027
            V0.a r5 = f4524c     // Catch:{ all -> 0x001c }
            long r1 = f4522a     // Catch:{ all -> 0x001c }
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r4
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.C0436I.c(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
