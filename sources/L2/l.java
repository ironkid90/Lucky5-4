package L2;

import A2.n;
import I.C0040p;
import M.e;
import M2.t;
import N2.a;
import k2.C0281I;
import r2.C0420d;
import r2.C0425i;

public final class l implements e {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1038f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1039g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f1040h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f1041i;

    public l(n nVar, e eVar, C0040p pVar) {
        this.f1039g = nVar;
        this.f1040h = eVar;
        this.f1041i = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.Object r8, r2.C0420d r9) {
        /*
            r7 = this;
            int r0 = r7.f1038f
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x005d;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r9 instanceof k2.C0301p
            if (r0 == 0) goto L_0x0018
            r0 = r9
            k2.p r0 = (k2.C0301p) r0
            int r1 = r0.f3944j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.f3944j = r1
            goto L_0x001d
        L_0x0018:
            k2.p r0 = new k2.p
            r0.<init>(r7, r9)
        L_0x001d:
            java.lang.Object r9 = r0.f3943i
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f3944j
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            M0.a.V(r9)
            goto L_0x005a
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            M0.a.V(r9)
            M.b r8 = (M.b) r8
            java.lang.Object r9 = r7.f1039g
            M.e r9 = (M.e) r9
            java.lang.Object r8 = r8.c(r9)
            java.lang.Object r9 = r7.f1041i
            k2.I r9 = (k2.C0281I) r9
            G0.f r9 = r9.f3894h
            java.lang.Object r8 = k2.C0282J.c(r8, r9)
            java.lang.Double r8 = (java.lang.Double) r8
            r0.f3944j = r3
            java.lang.Object r9 = r7.f1040h
            L2.e r9 = (L2.e) r9
            java.lang.Object r8 = r9.b(r8, r0)
            if (r8 != r1) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            p2.h r1 = p2.C0368h.f4194a
        L_0x005c:
            return r1
        L_0x005d:
            java.lang.Object r0 = r7.f1039g
            r2.i r0 = (r2.C0425i) r0
            java.lang.Object r1 = r7.f1040h
            java.lang.Object r2 = r7.f1041i
            M2.t r2 = (M2.t) r2
            java.lang.Object r8 = M2.l.b(r0, r8, r1, r2, r9)
            s2.a r9 = s2.C0466a.f4632f
            if (r8 != r9) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            p2.h r8 = p2.C0368h.f4194a
        L_0x0072:
            return r8
        L_0x0073:
            boolean r0 = r9 instanceof L2.k
            if (r0 == 0) goto L_0x0086
            r0 = r9
            L2.k r0 = (L2.k) r0
            int r1 = r0.f1037m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0086
            int r1 = r1 - r2
            r0.f1037m = r1
            goto L_0x008b
        L_0x0086:
            L2.k r0 = new L2.k
            r0.<init>(r7, r9)
        L_0x008b:
            java.lang.Object r9 = r0.f1035k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f1037m
            p2.h r3 = p2.C0368h.f4194a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00b3
            if (r2 == r6) goto L_0x00af
            if (r2 == r5) goto L_0x00a7
            if (r2 != r4) goto L_0x009f
            goto L_0x00af
        L_0x009f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x00a7:
            java.lang.Object r8 = r0.f1034j
            L2.l r2 = r0.f1033i
            M0.a.V(r9)
            goto L_0x00df
        L_0x00af:
            M0.a.V(r9)
            goto L_0x00cb
        L_0x00b3:
            M0.a.V(r9)
            java.lang.Object r9 = r7.f1039g
            A2.n r9 = (A2.n) r9
            boolean r9 = r9.f83f
            if (r9 == 0) goto L_0x00cd
            r0.f1037m = r6
            java.lang.Object r9 = r7.f1040h
            L2.e r9 = (L2.e) r9
            java.lang.Object r8 = r9.b(r8, r0)
            if (r8 != r1) goto L_0x00cb
            goto L_0x00fe
        L_0x00cb:
            r1 = r3
            goto L_0x00fe
        L_0x00cd:
            r0.f1033i = r7
            r0.f1034j = r8
            r0.f1037m = r5
            java.lang.Object r9 = r7.f1041i
            I.p r9 = (I.C0040p) r9
            java.lang.Object r9 = r9.i(r8, r0)
            if (r9 != r1) goto L_0x00de
            goto L_0x00fe
        L_0x00de:
            r2 = r7
        L_0x00df:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x00cb
            java.lang.Object r9 = r2.f1039g
            A2.n r9 = (A2.n) r9
            r9.f83f = r6
            r9 = 0
            r0.f1033i = r9
            r0.f1034j = r9
            r0.f1037m = r4
            java.lang.Object r9 = r2.f1040h
            L2.e r9 = (L2.e) r9
            java.lang.Object r8 = r9.b(r8, r0)
            if (r8 != r1) goto L_0x00cb
        L_0x00fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.l.b(java.lang.Object, r2.d):java.lang.Object");
    }

    public l(e eVar, e eVar2, C0281I i3) {
        this.f1040h = eVar;
        this.f1039g = eVar2;
        this.f1041i = i3;
    }

    public l(e eVar, C0425i iVar) {
        this.f1039g = iVar;
        this.f1040h = a.l(iVar);
        this.f1041i = new t(eVar, (C0420d) null);
    }
}
