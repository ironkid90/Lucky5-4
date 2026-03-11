package R2;

import A2.i;
import j1.e;
import java.util.LinkedHashMap;

public final class u extends f {

    /* renamed from: e  reason: collision with root package name */
    public static final l f1415e = e.a("/", false);

    /* renamed from: b  reason: collision with root package name */
    public final l f1416b;

    /* renamed from: c  reason: collision with root package name */
    public final i f1417c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f1418d;

    static {
        String str = l.f1393g;
    }

    public u(l lVar, i iVar, LinkedHashMap linkedHashMap) {
        i.e(iVar, "fileSystem");
        this.f1416b = lVar;
        this.f1417c = iVar;
        this.f1418d = linkedHashMap;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, A2.q] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, A2.q] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, A2.q] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final R2.e b(R2.l r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "path"
            A2.i.e(r0, r2)
            R2.l r2 = f1415e
            r2.getClass()
            r3 = 1
            R2.l r0 = S2.b.b(r2, r0, r3)
            java.util.LinkedHashMap r2 = r1.f1418d
            java.lang.Object r0 = r2.get(r0)
            S2.d r0 = (S2.d) r0
            r2 = 0
            if (r0 != 0) goto L_0x001f
            return r2
        L_0x001f:
            R2.e r10 = new R2.e
            boolean r5 = r0.f1536b
            r4 = r5 ^ 1
            if (r5 == 0) goto L_0x0029
            r6 = r2
            goto L_0x0030
        L_0x0029:
            long r6 = r0.f1537c
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r6 = r3
        L_0x0030:
            java.lang.Long r8 = r0.f1538d
            r9 = 0
            r7 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            long r3 = r0.f1539e
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
            return r10
        L_0x0041:
            R2.l r0 = r1.f1416b
            R2.i r5 = r1.f1417c
            R2.h r5 = r5.e(r0)
            R2.d r0 = r5.d(r3)     // Catch:{ all -> 0x0058 }
            R2.p r3 = M0.a.a(r0)     // Catch:{ all -> 0x0058 }
            r5.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0068
        L_0x0055:
            r0 = move-exception
            r2 = r0
            goto L_0x0068
        L_0x0058:
            r0 = move-exception
            r3 = r0
            r5.close()     // Catch:{ all -> 0x005e }
            goto L_0x0063
        L_0x005e:
            r0 = move-exception
            r4 = r0
            android.support.v4.media.session.a.c(r3, r4)
        L_0x0063:
            r18 = r3
            r3 = r2
            r2 = r18
        L_0x0068:
            if (r2 != 0) goto L_0x0116
            A2.i.b(r3)
            A2.q r0 = new A2.q
            r0.<init>()
            java.lang.Long r2 = r10.f1382e
            r0.f86f = r2
            A2.q r2 = new A2.q
            r2.<init>()
            A2.q r4 = new A2.q
            r4.<init>()
            int r5 = r3.a()
            r6 = 67324752(0x4034b50, float:1.5433558E-36)
            if (r5 != r6) goto L_0x00f2
            r5 = 2
            r3.g(r5)
            short r5 = r3.c()
            r6 = 65535(0xffff, float:9.1834E-41)
            r7 = r5 & r6
            r5 = r5 & 1
            if (r5 != 0) goto L_0x00da
            r7 = 18
            r3.g(r7)
            short r5 = r3.c()
            long r7 = (long) r5
            r11 = 65535(0xffff, double:3.23786E-319)
            long r7 = r7 & r11
            short r5 = r3.c()
            r5 = r5 & r6
            r3.g(r7)
            S2.g r6 = new S2.g
            r6.<init>(r3, r0, r2, r4)
            S2.a.d(r3, r5, r6)
            R2.e r3 = new R2.e
            java.lang.Object r4 = r4.f86f
            r15 = r4
            java.lang.Long r15 = (java.lang.Long) r15
            java.lang.Object r0 = r0.f86f
            r16 = r0
            java.lang.Long r16 = (java.lang.Long) r16
            java.lang.Object r0 = r2.f86f
            r17 = r0
            java.lang.Long r17 = (java.lang.Long) r17
            boolean r13 = r10.f1379b
            java.lang.Long r14 = r10.f1380c
            boolean r12 = r10.f1378a
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            A2.i.b(r3)
            return r3
        L_0x00da:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "unsupported zip: general purpose bit flag="
            r2.<init>(r3)
            java.lang.String r3 = S2.a.b(r7)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x00f2:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bad zip: expected "
            r2.<init>(r3)
            java.lang.String r3 = S2.a.b(r6)
            r2.append(r3)
            java.lang.String r3 = " but was "
            r2.append(r3)
            java.lang.String r3 = S2.a.b(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0116:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.u.b(R2.l):R2.e");
    }
}
