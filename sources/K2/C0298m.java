package k2;

import I.C0039o;
import L2.e;

/* renamed from: k2.m  reason: case insensitive filesystem */
public final class C0298m implements e {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3932f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f3933g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3934h;

    public /* synthetic */ C0298m(e eVar, M.e eVar2, int i3) {
        this.f3932f = i3;
        this.f3933g = eVar;
        this.f3934h = eVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.Object r8, r2.C0420d r9) {
        /*
            r7 = this;
            int r0 = r7.f3932f
            switch(r0) {
                case 0: goto L_0x015e;
                case 1: goto L_0x0114;
                case 2: goto L_0x00ca;
                case 3: goto L_0x0080;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r9 instanceof L2.n
            if (r0 == 0) goto L_0x0018
            r0 = r9
            L2.n r0 = (L2.n) r0
            int r1 = r0.f1048k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.f1048k = r1
            goto L_0x001d
        L_0x0018:
            L2.n r0 = new L2.n
            r0.<init>(r7, r9)
        L_0x001d:
            java.lang.Object r9 = r0.f1047j
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f1048k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            k2.m r8 = r0.f1046i
            M0.a.V(r9)
            goto L_0x0075
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            java.lang.Object r8 = r0.f1050m
            k2.m r2 = r0.f1046i
            M0.a.V(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L_0x005c
        L_0x0045:
            M0.a.V(r9)
            r0.f1046i = r7
            r0.f1050m = r8
            r0.f1048k = r4
            java.lang.Object r9 = r7.f3934h
            I.o r9 = (I.C0039o) r9
            java.lang.Object r9 = r9.i(r8, r0)
            if (r9 != r1) goto L_0x0059
            goto L_0x0079
        L_0x0059:
            r2 = r9
            r9 = r8
            r8 = r7
        L_0x005c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0074
            L2.e r2 = r8.f3933g
            r0.f1046i = r8
            r5 = 0
            r0.f1050m = r5
            r0.f1048k = r3
            java.lang.Object r9 = r2.b(r9, r0)
            if (r9 != r1) goto L_0x0075
            goto L_0x0079
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            p2.h r1 = p2.C0368h.f4194a
        L_0x0079:
            return r1
        L_0x007a:
            M2.a r9 = new M2.a
            r9.<init>(r8)
            throw r9
        L_0x0080:
            boolean r0 = r9 instanceof k2.x
            if (r0 == 0) goto L_0x0093
            r0 = r9
            k2.x r0 = (k2.x) r0
            int r1 = r0.f3979j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0093
            int r1 = r1 - r2
            r0.f3979j = r1
            goto L_0x0098
        L_0x0093:
            k2.x r0 = new k2.x
            r0.<init>(r7, r9)
        L_0x0098:
            java.lang.Object r9 = r0.f3978i
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f3979j
            r3 = 1
            if (r2 == 0) goto L_0x00af
            if (r2 != r3) goto L_0x00a7
            M0.a.V(r9)
            goto L_0x00c7
        L_0x00a7:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x00af:
            M0.a.V(r9)
            M.b r8 = (M.b) r8
            java.lang.Object r9 = r7.f3934h
            M.e r9 = (M.e) r9
            java.lang.Object r8 = r8.c(r9)
            r0.f3979j = r3
            L2.e r9 = r7.f3933g
            java.lang.Object r8 = r9.b(r8, r0)
            if (r8 != r1) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            p2.h r1 = p2.C0368h.f4194a
        L_0x00c9:
            return r1
        L_0x00ca:
            boolean r0 = r9 instanceof k2.v
            if (r0 == 0) goto L_0x00dd
            r0 = r9
            k2.v r0 = (k2.v) r0
            int r1 = r0.f3971j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00dd
            int r1 = r1 - r2
            r0.f3971j = r1
            goto L_0x00e2
        L_0x00dd:
            k2.v r0 = new k2.v
            r0.<init>(r7, r9)
        L_0x00e2:
            java.lang.Object r9 = r0.f3970i
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f3971j
            r3 = 1
            if (r2 == 0) goto L_0x00f9
            if (r2 != r3) goto L_0x00f1
            M0.a.V(r9)
            goto L_0x0111
        L_0x00f1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x00f9:
            M0.a.V(r9)
            M.b r8 = (M.b) r8
            java.lang.Object r9 = r7.f3934h
            M.e r9 = (M.e) r9
            java.lang.Object r8 = r8.c(r9)
            r0.f3971j = r3
            L2.e r9 = r7.f3933g
            java.lang.Object r8 = r9.b(r8, r0)
            if (r8 != r1) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            p2.h r1 = p2.C0368h.f4194a
        L_0x0113:
            return r1
        L_0x0114:
            boolean r0 = r9 instanceof k2.C0303r
            if (r0 == 0) goto L_0x0127
            r0 = r9
            k2.r r0 = (k2.C0303r) r0
            int r1 = r0.f3952j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0127
            int r1 = r1 - r2
            r0.f3952j = r1
            goto L_0x012c
        L_0x0127:
            k2.r r0 = new k2.r
            r0.<init>(r7, r9)
        L_0x012c:
            java.lang.Object r9 = r0.f3951i
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f3952j
            r3 = 1
            if (r2 == 0) goto L_0x0143
            if (r2 != r3) goto L_0x013b
            M0.a.V(r9)
            goto L_0x015b
        L_0x013b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0143:
            M0.a.V(r9)
            M.b r8 = (M.b) r8
            java.lang.Object r9 = r7.f3934h
            M.e r9 = (M.e) r9
            java.lang.Object r8 = r8.c(r9)
            r0.f3952j = r3
            L2.e r9 = r7.f3933g
            java.lang.Object r8 = r9.b(r8, r0)
            if (r8 != r1) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            p2.h r1 = p2.C0368h.f4194a
        L_0x015d:
            return r1
        L_0x015e:
            boolean r0 = r9 instanceof k2.C0297l
            if (r0 == 0) goto L_0x0171
            r0 = r9
            k2.l r0 = (k2.C0297l) r0
            int r1 = r0.f3930j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0171
            int r1 = r1 - r2
            r0.f3930j = r1
            goto L_0x0176
        L_0x0171:
            k2.l r0 = new k2.l
            r0.<init>(r7, r9)
        L_0x0176:
            java.lang.Object r9 = r0.f3929i
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f3930j
            r3 = 1
            if (r2 == 0) goto L_0x018d
            if (r2 != r3) goto L_0x0185
            M0.a.V(r9)
            goto L_0x01a5
        L_0x0185:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x018d:
            M0.a.V(r9)
            M.b r8 = (M.b) r8
            java.lang.Object r9 = r7.f3934h
            M.e r9 = (M.e) r9
            java.lang.Object r8 = r8.c(r9)
            r0.f3930j = r3
            L2.e r9 = r7.f3933g
            java.lang.Object r8 = r9.b(r8, r0)
            if (r8 != r1) goto L_0x01a5
            goto L_0x01a7
        L_0x01a5:
            p2.h r1 = p2.C0368h.f4194a
        L_0x01a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C0298m.b(java.lang.Object, r2.d):java.lang.Object");
    }

    public C0298m(C0039o oVar, e eVar) {
        this.f3932f = 4;
        this.f3934h = oVar;
        this.f3933g = eVar;
    }
}
