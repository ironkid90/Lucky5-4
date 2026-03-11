package K;

public final class j extends b {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087 A[SYNTHETIC, Splitter:B:28:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9 A[SYNTHETIC, Splitter:B:45:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7 A[SYNTHETIC, Splitter:B:53:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.Object r10, t2.C0484b r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof K.i
            if (r0 == 0) goto L_0x0013
            r0 = r11
            K.i r0 = (K.i) r0
            int r1 = r0.f850n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f850n = r1
            goto L_0x0018
        L_0x0013:
            K.i r0 = new K.i
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f848l
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f850n
            p2.h r3 = p2.C0368h.f4194a
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            R2.n r10 = r0.f847k
            R2.h r1 = r0.f846j
            R2.h r0 = r0.f845i
            M0.a.V(r11)     // Catch:{ all -> 0x0030 }
            goto L_0x0082
        L_0x0030:
            r11 = move-exception
            goto L_0x0096
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            M0.a.V(r11)
            B.m r11 = r9.f816c
            java.lang.Object r11 = r11.f100g
            java.util.concurrent.atomic.AtomicBoolean r11 = (java.util.concurrent.atomic.AtomicBoolean) r11
            boolean r11 = r11.get()
            if (r11 != 0) goto L_0x00cc
            R2.i r11 = r9.f814a
            r11.getClass()
            R2.l r11 = r9.f815b
            java.lang.String r2 = "file"
            A2.i.e(r11, r2)
            R2.h r2 = new R2.h
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            java.io.File r11 = r11.e()
            java.lang.String r7 = "rw"
            r6.<init>(r11, r7)
            r2.<init>(r4, r6)
            R2.c r11 = R2.h.b(r2)     // Catch:{ all -> 0x00b5 }
            R2.n r6 = new R2.n     // Catch:{ all -> 0x00b5 }
            r6.<init>(r11)     // Catch:{ all -> 0x00b5 }
            M.i r11 = M.i.f1083a     // Catch:{ all -> 0x0094 }
            r0.f845i = r2     // Catch:{ all -> 0x0094 }
            r0.f846j = r2     // Catch:{ all -> 0x0094 }
            r0.f847k = r6     // Catch:{ all -> 0x0094 }
            r0.f850n = r4     // Catch:{ all -> 0x0094 }
            r11.b(r10, r6)     // Catch:{ all -> 0x0094 }
            if (r3 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r0 = r2
            r1 = r0
            r10 = r6
        L_0x0082:
            r1.a()     // Catch:{ all -> 0x0030 }
            if (r10 == 0) goto L_0x008d
            r10.close()     // Catch:{ all -> 0x008b }
            goto L_0x008d
        L_0x008b:
            r10 = move-exception
            goto L_0x008e
        L_0x008d:
            r10 = r5
        L_0x008e:
            r2 = r0
            r11 = r3
            goto L_0x00a7
        L_0x0091:
            r0 = r2
            r10 = r6
            goto L_0x0096
        L_0x0094:
            r11 = move-exception
            goto L_0x0091
        L_0x0096:
            if (r10 == 0) goto L_0x00a4
            r10.close()     // Catch:{ all -> 0x009c }
            goto L_0x00a4
        L_0x009c:
            r10 = move-exception
            android.support.v4.media.session.a.c(r11, r10)     // Catch:{ all -> 0x00a1 }
            goto L_0x00a4
        L_0x00a1:
            r10 = move-exception
            r2 = r0
            goto L_0x00b8
        L_0x00a4:
            r10 = r11
            r2 = r0
            r11 = r5
        L_0x00a7:
            if (r10 != 0) goto L_0x00b7
            A2.i.b(r11)     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x00b3
            r2.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b3
        L_0x00b2:
            r5 = move-exception
        L_0x00b3:
            r10 = r3
            goto L_0x00c5
        L_0x00b5:
            r10 = move-exception
            goto L_0x00b8
        L_0x00b7:
            throw r10     // Catch:{ all -> 0x00b5 }
        L_0x00b8:
            if (r2 == 0) goto L_0x00c2
            r2.close()     // Catch:{ all -> 0x00be }
            goto L_0x00c2
        L_0x00be:
            r11 = move-exception
            android.support.v4.media.session.a.c(r10, r11)
        L_0x00c2:
            r8 = r5
            r5 = r10
            r10 = r8
        L_0x00c5:
            if (r5 != 0) goto L_0x00cb
            A2.i.b(r10)
            return r3
        L_0x00cb:
            throw r5
        L_0x00cc:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "This scope has already been closed."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: K.j.b(java.lang.Object, t2.b):java.lang.Object");
    }
}
