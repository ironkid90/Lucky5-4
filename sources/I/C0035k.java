package I;

import A2.n;
import A2.q;
import Q2.a;

/* renamed from: I.k  reason: case insensitive filesystem */
public final class C0035k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f640a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f641b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f642c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ P f643d;

    public C0035k(a aVar, n nVar, q qVar, P p3) {
        this.f640a = aVar;
        this.f641b = nVar;
        this.f642c = qVar;
        this.f643d = p3;
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [Q2.a] */
    /* JADX WARNING: type inference failed for: r8v3, types: [z2.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(I.C0031g r11, t2.C0484b r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof I.C0034j
            if (r0 == 0) goto L_0x0013
            r0 = r12
            I.j r0 = (I.C0034j) r0
            int r1 = r0.f639p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f639p = r1
            goto L_0x0018
        L_0x0013:
            I.j r0 = new I.j
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f637n
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f639p
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0070
            if (r2 == r5) goto L_0x0058
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r11 = r0.f634k
            java.lang.Object r1 = r0.f633j
            A2.q r1 = (A2.q) r1
            java.lang.Object r0 = r0.f632i
            Q2.a r0 = (Q2.a) r0
            M0.a.V(r12)     // Catch:{ all -> 0x0039 }
            goto L_0x00c9
        L_0x0039:
            r11 = move-exception
            goto L_0x00e1
        L_0x003c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0044:
            java.lang.Object r11 = r0.f634k
            I.P r11 = (I.P) r11
            java.lang.Object r2 = r0.f633j
            A2.q r2 = (A2.q) r2
            java.lang.Object r4 = r0.f632i
            Q2.a r4 = (Q2.a) r4
            M0.a.V(r12)     // Catch:{ all -> 0x0054 }
            goto L_0x00ae
        L_0x0054:
            r11 = move-exception
            r0 = r4
            goto L_0x00e1
        L_0x0058:
            I.P r11 = r0.f636m
            A2.q r2 = r0.f635l
            java.lang.Object r5 = r0.f634k
            A2.n r5 = (A2.n) r5
            java.lang.Object r7 = r0.f633j
            Q2.a r7 = (Q2.a) r7
            java.lang.Object r8 = r0.f632i
            z2.p r8 = (z2.p) r8
            M0.a.V(r12)
            r12 = r7
            r9 = r8
            r8 = r11
            r11 = r9
            goto L_0x0092
        L_0x0070:
            M0.a.V(r12)
            r0.f632i = r11
            Q2.a r12 = r10.f640a
            r0.f633j = r12
            A2.n r2 = r10.f641b
            r0.f634k = r2
            A2.q r7 = r10.f642c
            r0.f635l = r7
            I.P r8 = r10.f643d
            r0.f636m = r8
            r0.f639p = r5
            Q2.d r12 = (Q2.d) r12
            java.lang.Object r5 = r12.c(r0)
            if (r5 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r5 = r2
            r2 = r7
        L_0x0092:
            boolean r5 = r5.f83f     // Catch:{ all -> 0x00d6 }
            if (r5 != 0) goto L_0x00d9
            java.lang.Object r5 = r2.f86f     // Catch:{ all -> 0x00d6 }
            r0.f632i = r12     // Catch:{ all -> 0x00d6 }
            r0.f633j = r2     // Catch:{ all -> 0x00d6 }
            r0.f634k = r8     // Catch:{ all -> 0x00d6 }
            r0.f635l = r6     // Catch:{ all -> 0x00d6 }
            r0.f636m = r6     // Catch:{ all -> 0x00d6 }
            r0.f639p = r4     // Catch:{ all -> 0x00d6 }
            java.lang.Object r11 = r11.i(r5, r0)     // Catch:{ all -> 0x00d6 }
            if (r11 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            r4 = r12
            r12 = r11
            r11 = r8
        L_0x00ae:
            java.lang.Object r5 = r2.f86f     // Catch:{ all -> 0x0054 }
            boolean r5 = A2.i.a(r12, r5)     // Catch:{ all -> 0x0054 }
            if (r5 != 0) goto L_0x00cd
            r0.f632i = r4     // Catch:{ all -> 0x0054 }
            r0.f633j = r2     // Catch:{ all -> 0x0054 }
            r0.f634k = r12     // Catch:{ all -> 0x0054 }
            r0.f639p = r3     // Catch:{ all -> 0x0054 }
            r3 = 0
            java.lang.Object r11 = r11.i(r12, r3, r0)     // Catch:{ all -> 0x0054 }
            if (r11 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            r11 = r12
            r1 = r2
            r0 = r4
        L_0x00c9:
            r1.f86f = r11     // Catch:{ all -> 0x0039 }
            r2 = r1
            goto L_0x00ce
        L_0x00cd:
            r0 = r4
        L_0x00ce:
            java.lang.Object r11 = r2.f86f     // Catch:{ all -> 0x0039 }
            Q2.d r0 = (Q2.d) r0
            r0.e(r6)
            return r11
        L_0x00d6:
            r11 = move-exception
            r0 = r12
            goto L_0x00e1
        L_0x00d9:
            java.lang.String r11 = "InitializerApi.updateData should not be called after initialization is complete."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d6 }
            r0.<init>(r11)     // Catch:{ all -> 0x00d6 }
            throw r0     // Catch:{ all -> 0x00d6 }
        L_0x00e1:
            Q2.d r0 = (Q2.d) r0
            r0.e(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0035k.a(I.g, t2.b):java.lang.Object");
    }
}
