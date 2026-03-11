package G0;

import O0.e;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

public final class p extends e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f436a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(a aVar, Looper looper) {
        super(looper);
        this.f436a = aVar;
        Looper.getMainLooper();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: type inference failed for: r10v8, types: [android.os.Parcelable] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0 == 5) goto L_0x0036;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.a r0 = r9.f436a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.v
            int r0 = r0.get()
            int r1 = r10.arg1
            r2 = 7
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0024
            int r0 = r10.what
            if (r0 == r3) goto L_0x0019
            if (r0 == r4) goto L_0x0019
            if (r0 != r2) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r10 = r10.obj
            G0.l r10 = (G0.l) r10
            r10.getClass()
            r10.c()
            return
        L_0x0024:
            int r0 = r10.what
            r1 = 4
            r5 = 5
            if (r0 == r4) goto L_0x0036
            if (r0 == r2) goto L_0x0036
            if (r0 != r1) goto L_0x0034
            com.google.android.gms.common.internal.a r0 = r9.f436a
            r0.getClass()
            goto L_0x0036
        L_0x0034:
            if (r0 != r5) goto L_0x003e
        L_0x0036:
            com.google.android.gms.common.internal.a r0 = r9.f436a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0192
        L_0x003e:
            int r0 = r10.what
            r6 = 8
            r7 = 0
            r8 = 3
            if (r0 != r1) goto L_0x0094
            com.google.android.gms.common.internal.a r0 = r9.f436a
            D0.a r1 = new D0.a
            int r10 = r10.arg2
            r1.<init>(r10)
            r0.f2849s = r1
            boolean r10 = r0.f2850t
            if (r10 == 0) goto L_0x0056
            goto L_0x007a
        L_0x0056:
            java.lang.String r10 = r0.r()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0061
            goto L_0x007a
        L_0x0061:
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 == 0) goto L_0x0068
            goto L_0x007a
        L_0x0068:
            java.lang.String r10 = r0.r()     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x007a }
            com.google.android.gms.common.internal.a r10 = r9.f436a
            boolean r0 = r10.f2850t
            if (r0 == 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            r10.v(r8, r7)
            return
        L_0x007a:
            com.google.android.gms.common.internal.a r10 = r9.f436a
            D0.a r0 = r10.f2849s
            if (r0 == 0) goto L_0x0081
            goto L_0x0086
        L_0x0081:
            D0.a r0 = new D0.a
            r0.<init>(r6)
        L_0x0086:
            F0.n r10 = r10.f2839i
            r10.a(r0)
            com.google.android.gms.common.internal.a r10 = r9.f436a
            r10.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x0094:
            if (r0 != r5) goto L_0x00b0
            com.google.android.gms.common.internal.a r10 = r9.f436a
            D0.a r0 = r10.f2849s
            if (r0 == 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            D0.a r0 = new D0.a
            r0.<init>(r6)
        L_0x00a2:
            F0.n r10 = r10.f2839i
            r10.a(r0)
            com.google.android.gms.common.internal.a r10 = r9.f436a
            r10.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00b0:
            if (r0 != r8) goto L_0x00d2
            java.lang.Object r0 = r10.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00bb
            r7 = r0
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
        L_0x00bb:
            D0.a r0 = new D0.a
            int r10 = r10.arg2
            r0.<init>(r10, r7)
            com.google.android.gms.common.internal.a r10 = r9.f436a
            F0.n r10 = r10.f2839i
            r10.a(r0)
            com.google.android.gms.common.internal.a r10 = r9.f436a
            r10.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00d2:
            r1 = 6
            if (r0 != r1) goto L_0x00f7
            com.google.android.gms.common.internal.a r0 = r9.f436a
            r0.v(r5, r7)
            com.google.android.gms.common.internal.a r0 = r9.f436a
            F0.h r0 = r0.f2844n
            if (r0 == 0) goto L_0x00e9
            int r10 = r10.arg2
            java.lang.Object r0 = r0.f322g
            E0.c r0 = (E0.c) r0
            r0.a(r10)
        L_0x00e9:
            com.google.android.gms.common.internal.a r10 = r9.f436a
            r10.getClass()
            java.lang.System.currentTimeMillis()
            com.google.android.gms.common.internal.a r10 = r9.f436a
            com.google.android.gms.common.internal.a.u(r10, r5, r4, r7)
            return
        L_0x00f7:
            if (r0 != r3) goto L_0x010d
            com.google.android.gms.common.internal.a r0 = r9.f436a
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0102
            goto L_0x010d
        L_0x0102:
            java.lang.Object r10 = r10.obj
            G0.l r10 = (G0.l) r10
            r10.getClass()
            r10.c()
            return
        L_0x010d:
            int r0 = r10.what
            if (r0 == r3) goto L_0x0127
            if (r0 == r4) goto L_0x0127
            if (r0 != r2) goto L_0x0116
            goto L_0x0127
        L_0x0116:
            java.lang.String r10 = "Don't know how to handle message: "
            java.lang.String r10 = A2.h.e(r10, r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r10, r0)
            return
        L_0x0127:
            java.lang.Object r10 = r10.obj
            r0 = r10
            G0.l r0 = (G0.l) r0
            java.lang.String r10 = "Callback proxy "
            monitor-enter(r0)
            java.lang.Boolean r1 = r0.f426a     // Catch:{ all -> 0x0150 }
            boolean r2 = r0.f427b     // Catch:{ all -> 0x0150 }
            if (r2 == 0) goto L_0x0152
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x0150 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r5.<init>(r10)     // Catch:{ all -> 0x0150 }
            r5.append(r3)     // Catch:{ all -> 0x0150 }
            java.lang.String r10 = " being reused. This is not safe."
            r5.append(r10)     // Catch:{ all -> 0x0150 }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x0150 }
            android.util.Log.w(r2, r10)     // Catch:{ all -> 0x0150 }
            goto L_0x0152
        L_0x0150:
            r10 = move-exception
            goto L_0x0190
        L_0x0152:
            monitor-exit(r0)     // Catch:{ all -> 0x0150 }
            if (r1 == 0) goto L_0x0185
            com.google.android.gms.common.internal.a r10 = r0.f431f
            int r1 = r0.f429d
            if (r1 != 0) goto L_0x016d
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x0185
            r10.v(r4, r7)
            D0.a r10 = new D0.a
            r10.<init>(r6, r7)
            r0.a(r10)
            goto L_0x0185
        L_0x016d:
            r10.v(r4, r7)
            android.os.Bundle r10 = r0.f430e
            if (r10 == 0) goto L_0x017d
            java.lang.String r2 = "pendingIntent"
            android.os.Parcelable r10 = r10.getParcelable(r2)
            r7 = r10
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
        L_0x017d:
            D0.a r10 = new D0.a
            r10.<init>(r1, r7)
            r0.a(r10)
        L_0x0185:
            monitor-enter(r0)
            r0.f427b = r4     // Catch:{ all -> 0x018d }
            monitor-exit(r0)     // Catch:{ all -> 0x018d }
            r0.c()
            return
        L_0x018d:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018d }
            throw r10
        L_0x0190:
            monitor-exit(r0)     // Catch:{ all -> 0x0150 }
            throw r10
        L_0x0192:
            java.lang.Object r10 = r10.obj
            G0.l r10 = (G0.l) r10
            r10.getClass()
            r10.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.p.handleMessage(android.os.Message):void");
    }
}
