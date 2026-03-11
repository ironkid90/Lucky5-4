package R2;

import java.io.FileInputStream;

public final class g implements t {

    /* renamed from: f  reason: collision with root package name */
    public final FileInputStream f1386f;

    public g(FileInputStream fileInputStream) {
        this.f1386f = fileInputStream;
    }

    public final void close() {
        this.f1386f.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r6 != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long f(R2.a r5, long r6) {
        /*
            r4 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0007
            return r0
        L_0x0007:
            if (r2 < 0) goto L_0x006a
            r0 = 1
            R2.q r1 = r5.k(r0)     // Catch:{ AssertionError -> 0x0035 }
            int r2 = r1.f1405c     // Catch:{ AssertionError -> 0x0035 }
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch:{ AssertionError -> 0x0035 }
            long r6 = java.lang.Math.min(r6, r2)     // Catch:{ AssertionError -> 0x0035 }
            int r6 = (int) r6     // Catch:{ AssertionError -> 0x0035 }
            java.io.FileInputStream r7 = r4.f1386f     // Catch:{ AssertionError -> 0x0035 }
            byte[] r2 = r1.f1403a     // Catch:{ AssertionError -> 0x0035 }
            int r3 = r1.f1405c     // Catch:{ AssertionError -> 0x0035 }
            int r6 = r7.read(r2, r3, r6)     // Catch:{ AssertionError -> 0x0035 }
            r7 = -1
            if (r6 != r7) goto L_0x003a
            int r6 = r1.f1404b     // Catch:{ AssertionError -> 0x0035 }
            int r7 = r1.f1405c     // Catch:{ AssertionError -> 0x0035 }
            if (r6 != r7) goto L_0x0037
            R2.q r6 = r1.a()     // Catch:{ AssertionError -> 0x0035 }
            r5.f1366f = r6     // Catch:{ AssertionError -> 0x0035 }
            R2.r.a(r1)     // Catch:{ AssertionError -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            r5 = move-exception
            goto L_0x0046
        L_0x0037:
            r5 = -1
            return r5
        L_0x003a:
            int r7 = r1.f1405c     // Catch:{ AssertionError -> 0x0035 }
            int r7 = r7 + r6
            r1.f1405c = r7     // Catch:{ AssertionError -> 0x0035 }
            long r1 = r5.f1367g     // Catch:{ AssertionError -> 0x0035 }
            long r6 = (long) r6     // Catch:{ AssertionError -> 0x0035 }
            long r1 = r1 + r6
            r5.f1367g = r1     // Catch:{ AssertionError -> 0x0035 }
            return r6
        L_0x0046:
            int r6 = R2.k.f1392a
            java.lang.Throwable r6 = r5.getCause()
            r7 = 0
            if (r6 == 0) goto L_0x0060
            java.lang.String r6 = r5.getMessage()
            if (r6 == 0) goto L_0x005c
            java.lang.String r1 = "getsockname failed"
            boolean r6 = H2.l.b0(r6, r1)
            goto L_0x005d
        L_0x005c:
            r6 = r7
        L_0x005d:
            if (r6 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r0 = r7
        L_0x0061:
            if (r0 == 0) goto L_0x0069
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        L_0x0069:
            throw r5
        L_0x006a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.g.f(R2.a, long):long");
    }

    public final String toString() {
        return "source(" + this.f1386f + ')';
    }
}
