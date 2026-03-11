package I;

import L2.e;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

/* renamed from: I.t  reason: case insensitive filesystem */
public final class C0043t extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public C0027c f668j;

    /* renamed from: k  reason: collision with root package name */
    public int f669k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f670l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ P f671m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0043t(P p3, C0420d dVar) {
        super(2, dVar);
        this.f671m = p3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        C0043t tVar = new C0043t(this.f671m, dVar);
        tVar.f670l = obj;
        return tVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0043t) c((e) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r12) {
        /*
            r11 = this;
            s2.a r0 = s2.C0466a.f4632f
            int r1 = r11.f669k
            p2.h r2 = p2.C0368h.f4194a
            r3 = 3
            r4 = 1
            I.P r5 = r11.f671m
            r6 = 2
            r7 = 0
            if (r1 == 0) goto L_0x0034
            if (r1 == r4) goto L_0x002b
            if (r1 == r6) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            M0.a.V(r12)
            goto L_0x00cb
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0021:
            I.c r1 = r11.f668j
            java.lang.Object r4 = r11.f670l
            L2.e r4 = (L2.e) r4
            M0.a.V(r12)
            goto L_0x007c
        L_0x002b:
            java.lang.Object r1 = r11.f670l
            L2.e r1 = (L2.e) r1
            M0.a.V(r12)
            r4 = r1
            goto L_0x0053
        L_0x0034:
            M0.a.V(r12)
            java.lang.Object r12 = r11.f670l
            L2.e r12 = (L2.e) r12
            r11.f670l = r12
            r11.f669k = r4
            I2.u r1 = r5.f570h
            r2.i r1 = r1.j()
            I.H r4 = new I.H
            r4.<init>(r5, r7)
            java.lang.Object r1 = I2.C0071w.o(r1, r4, r11)
            if (r1 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r4 = r12
            r12 = r1
        L_0x0053:
            r1 = r12
            I.a0 r1 = (I.a0) r1
            boolean r12 = r1 instanceof I.C0027c
            if (r12 == 0) goto L_0x006f
            r12 = r1
            I.c r12 = (I.C0027c) r12
            java.lang.Object r12 = r12.f609b
            r11.f670l = r4
            r8 = r1
            I.c r8 = (I.C0027c) r8
            r11.f668j = r8
            r11.f669k = r6
            java.lang.Object r12 = r4.b(r12, r11)
            if (r12 != r0) goto L_0x007c
            return r0
        L_0x006f:
            boolean r12 = r1 instanceof I.b0
            if (r12 != 0) goto L_0x00d6
            boolean r12 = r1 instanceof I.T
            if (r12 != 0) goto L_0x00d1
            boolean r12 = r1 instanceof I.Q
            if (r12 == 0) goto L_0x007c
            return r2
        L_0x007c:
            B.m r12 = r5.f575m
            java.lang.Object r12 = r12.f100g
            L2.s r12 = (L2.s) r12
            I.n r8 = new I.n
            r8.<init>(r5, r7)
            C0.r r9 = new C0.r
            r10 = 9
            r9.<init>((int) r10, (java.lang.Object) r8, (java.lang.Object) r12)
            I.o r12 = new I.o
            r12.<init>(r6, r7)
            C0.r r6 = new C0.r
            r8 = 11
            r6.<init>((int) r8, (java.lang.Object) r9, (java.lang.Object) r12)
            I.p r12 = new I.p
            r12.<init>(r1, r7)
            C0.r r1 = new C0.r
            r8 = 10
            r1.<init>((int) r8, (java.lang.Object) r6, (java.lang.Object) r12)
            F0.h r12 = new F0.h
            r6 = 3
            r12.<init>((int) r6, (java.lang.Object) r1)
            I.q r1 = new I.q
            r1.<init>((I.P) r5, (r2.C0420d) r7)
            L2.i r5 = new L2.i
            r5.<init>(r12, r1)
            r11.f670l = r7
            r11.f668j = r7
            r11.f669k = r3
            boolean r12 = r4 instanceof L2.v
            if (r12 != 0) goto L_0x00cc
            java.lang.Object r12 = r5.g(r4, r11)
            if (r12 != r0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r12 = r2
        L_0x00c8:
            if (r12 != r0) goto L_0x00cb
            return r0
        L_0x00cb:
            return r2
        L_0x00cc:
            L2.v r4 = (L2.v) r4
            java.lang.Throwable r12 = r4.f1069f
            throw r12
        L_0x00d1:
            I.T r1 = (I.T) r1
            java.lang.Throwable r12 = r1.f585b
            throw r12
        L_0x00d6:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0043t.l(java.lang.Object):java.lang.Object");
    }
}
