package K;

import B.m;
import I.C0025a;
import R2.i;
import R2.l;
import java.util.concurrent.atomic.AtomicBoolean;

public class b implements C0025a {

    /* renamed from: a  reason: collision with root package name */
    public final i f814a;

    /* renamed from: b  reason: collision with root package name */
    public final l f815b;

    /* renamed from: c  reason: collision with root package name */
    public final m f816c = new m(6);

    public b(i iVar, l lVar) {
        A2.i.e(iVar, "fileSystem");
        A2.i.e(lVar, "path");
        this.f814a = iVar;
        this.f815b = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077 A[SYNTHETIC, Splitter:B:30:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097 A[Catch:{ FileNotFoundException -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b A[Catch:{ FileNotFoundException -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf A[SYNTHETIC, Splitter:B:57:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(K.b r8, t2.C0484b r9) {
        /*
            boolean r0 = r9 instanceof K.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            K.a r0 = (K.a) r0
            int r1 = r0.f813m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f813m = r1
            goto L_0x0018
        L_0x0013:
            K.a r0 = new K.a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f811k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f813m
            M.i r3 = M.i.f1083a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            java.lang.Object r8 = r0.f809i
            java.io.Closeable r8 = (java.io.Closeable) r8
            M0.a.V(r9)     // Catch:{ all -> 0x0032 }
            goto L_0x00bd
        L_0x0032:
            r9 = move-exception
            goto L_0x00c5
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            R2.p r8 = r0.f810j
            java.lang.Object r2 = r0.f809i
            K.b r2 = (K.b) r2
            M0.a.V(r9)     // Catch:{ all -> 0x0047 }
            goto L_0x0075
        L_0x0047:
            r9 = move-exception
            goto L_0x0086
        L_0x0049:
            M0.a.V(r9)
            B.m r9 = r8.f816c
            java.lang.Object r9 = r9.f100g
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9
            boolean r9 = r9.get()
            if (r9 != 0) goto L_0x00e0
            R2.i r9 = r8.f814a     // Catch:{ FileNotFoundException -> 0x009c }
            R2.l r2 = r8.f815b     // Catch:{ FileNotFoundException -> 0x009c }
            R2.t r9 = r9.f(r2)     // Catch:{ FileNotFoundException -> 0x009c }
            R2.p r9 = M0.a.a(r9)     // Catch:{ FileNotFoundException -> 0x009c }
            r0.f809i = r8     // Catch:{ all -> 0x0084 }
            r0.f810j = r9     // Catch:{ all -> 0x0084 }
            r0.f813m = r5     // Catch:{ all -> 0x0084 }
            M.b r2 = r3.a(r9)     // Catch:{ all -> 0x0084 }
            if (r2 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r7 = r2
            r2 = r8
            r8 = r9
            r9 = r7
        L_0x0075:
            if (r8 == 0) goto L_0x007d
            r8.close()     // Catch:{ all -> 0x007b }
            goto L_0x007d
        L_0x007b:
            r8 = move-exception
            goto L_0x0095
        L_0x007d:
            r8 = r6
            goto L_0x0095
        L_0x007f:
            r7 = r2
            r2 = r8
            r8 = r9
            r9 = r7
            goto L_0x0086
        L_0x0084:
            r2 = move-exception
            goto L_0x007f
        L_0x0086:
            if (r8 == 0) goto L_0x0093
            r8.close()     // Catch:{ all -> 0x008c }
            goto L_0x0093
        L_0x008c:
            r8 = move-exception
            android.support.v4.media.session.a.c(r9, r8)     // Catch:{ FileNotFoundException -> 0x0091 }
            goto L_0x0093
        L_0x0091:
            r8 = r2
            goto L_0x009c
        L_0x0093:
            r8 = r9
            r9 = r6
        L_0x0095:
            if (r8 != 0) goto L_0x009b
            A2.i.b(r9)     // Catch:{ FileNotFoundException -> 0x0091 }
            goto L_0x00df
        L_0x009b:
            throw r8     // Catch:{ FileNotFoundException -> 0x0091 }
        L_0x009c:
            R2.i r9 = r8.f814a
            R2.l r2 = r8.f815b
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x00d9
            R2.i r8 = r8.f814a
            R2.t r8 = r8.f(r2)
            R2.p r8 = M0.a.a(r8)
            r0.f809i = r8     // Catch:{ all -> 0x0032 }
            r0.f810j = r6     // Catch:{ all -> 0x0032 }
            r0.f813m = r4     // Catch:{ all -> 0x0032 }
            M.b r9 = r3.a(r8)     // Catch:{ all -> 0x0032 }
            if (r9 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            if (r8 == 0) goto L_0x00d2
            r8.close()     // Catch:{ all -> 0x00c3 }
            goto L_0x00d2
        L_0x00c3:
            r6 = move-exception
            goto L_0x00d2
        L_0x00c5:
            if (r8 == 0) goto L_0x00cf
            r8.close()     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r8 = move-exception
            android.support.v4.media.session.a.c(r9, r8)
        L_0x00cf:
            r7 = r6
            r6 = r9
            r9 = r7
        L_0x00d2:
            if (r6 != 0) goto L_0x00d8
            A2.i.b(r9)
            goto L_0x00df
        L_0x00d8:
            throw r6
        L_0x00d9:
            M.b r8 = new M.b
            r8.<init>(r5)
            r9 = r8
        L_0x00df:
            return r9
        L_0x00e0:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This scope has already been closed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K.b.a(K.b, t2.b):java.lang.Object");
    }

    public final void close() {
        ((AtomicBoolean) this.f816c.f100g).set(true);
    }
}
