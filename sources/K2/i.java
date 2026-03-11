package K2;

import z2.l;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final h f901a = new Object();

    public static b a(int i3, int i4, int i5) {
        b mVar;
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        if (i3 != -2) {
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 == Integer.MAX_VALUE) {
                        return new b(Integer.MAX_VALUE, (l) null);
                    }
                    if (i4 == 1) {
                        return new b(i3, (l) null);
                    }
                    return new m(i3, i4, (l) null);
                } else if (i4 == 1) {
                    mVar = new b(0, (l) null);
                } else {
                    mVar = new m(1, i4, (l) null);
                }
            } else if (i4 == 1) {
                return new m(1, 2, (l) null);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else if (i4 == 1) {
            f.f899b.getClass();
            mVar = new b(e.f898b, (l) null);
        } else {
            mVar = new m(1, i4, (l) null);
        }
        return mVar;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [t2.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(K2.p r4, L.b r5, t2.C0484b r6) {
        /*
            boolean r0 = r6 instanceof K2.n
            if (r0 == 0) goto L_0x0013
            r0 = r6
            K2.n r0 = (K2.n) r0
            int r1 = r0.f908k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f908k = r1
            goto L_0x0018
        L_0x0013:
            K2.n r0 = new K2.n
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f907j
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f908k
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            z2.a r5 = r0.f906i
            M0.a.V(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0065
        L_0x0029:
            r4 = move-exception
            goto L_0x006b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            M0.a.V(r6)
            r2.i r6 = r0.f4684g
            A2.i.b(r6)
            I2.t r2 = I2.C0068t.f786g
            r2.g r6 = r6.n(r2)
            if (r6 != r4) goto L_0x006f
            r0.f906i = r5     // Catch:{ all -> 0x0029 }
            r0.f908k = r3     // Catch:{ all -> 0x0029 }
            I2.f r6 = new I2.f     // Catch:{ all -> 0x0029 }
            r2.d r0 = M0.a.y(r0)     // Catch:{ all -> 0x0029 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0029 }
            r6.v()     // Catch:{ all -> 0x0029 }
            I.K r0 = new I.K     // Catch:{ all -> 0x0029 }
            r2 = 1
            r0.<init>(r2, r6)     // Catch:{ all -> 0x0029 }
            K2.o r4 = (K2.o) r4     // Catch:{ all -> 0x0029 }
            r4.X(r0)     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r6.u()     // Catch:{ all -> 0x0029 }
            if (r4 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r5.a()
            p2.h r4 = p2.C0368h.f4194a
            return r4
        L_0x006b:
            r5.a()
            throw r4
        L_0x006f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.i.b(K2.p, L.b, t2.b):java.lang.Object");
    }
}
