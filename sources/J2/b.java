package J2;

import I2.C0068t;
import r2.C0417a;
import r2.C0423g;

public final class b extends C0417a implements C0423g {
    private volatile Object _preHandler = this;

    public b() {
        super(C0068t.f785f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (java.lang.reflect.Modifier.isStatic(r4.getModifiers()) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.lang.Throwable r3, r2.C0425i r4) {
        /*
            r2 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r0 > r4) goto L_0x004a
            r0 = 28
            if (r4 >= r0) goto L_0x004a
            java.lang.Object r4 = r2._preHandler
            r0 = 0
            if (r4 == r2) goto L_0x0012
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            goto L_0x0032
        L_0x0012:
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r1, r0)     // Catch:{ all -> 0x002f }
            int r1 = r4.getModifiers()     // Catch:{ all -> 0x002f }
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002f
            int r1 = r4.getModifiers()     // Catch:{ all -> 0x002f }
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r4 = r0
        L_0x0030:
            r2._preHandler = r4
        L_0x0032:
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r4.invoke(r0, r0)
            goto L_0x003a
        L_0x0039:
            r4 = r0
        L_0x003a:
            boolean r1 = r4 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L_0x0041
            r0 = r4
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L_0x0041:
            if (r0 == 0) goto L_0x004a
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r0.uncaughtException(r4, r3)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.b.g(java.lang.Throwable, r2.i):void");
    }
}
