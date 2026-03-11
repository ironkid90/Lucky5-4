package L2;

import M2.f;
import d0.C0147i;
import r2.C0425i;

public final class c extends f {

    /* renamed from: i  reason: collision with root package name */
    public final C0147i f1009i;

    /* renamed from: j  reason: collision with root package name */
    public final C0147i f1010j;

    public c(C0147i iVar, C0425i iVar2, int i3, int i4) {
        super(iVar2, i3, i4);
        this.f1009i = iVar;
        this.f1010j = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(K2.p r6, r2.C0420d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof L2.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            L2.b r0 = (L2.b) r0
            int r1 = r0.f1008l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1008l = r1
            goto L_0x001a
        L_0x0013:
            L2.b r0 = new L2.b
            t2.b r7 = (t2.C0484b) r7
            r0.<init>(r5, r7)
        L_0x001a:
            java.lang.Object r7 = r0.f1006j
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f1008l
            p2.h r3 = p2.C0368h.f4194a
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            K2.p r6 = r0.f1005i
            M0.a.V(r7)
            goto L_0x0049
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            M0.a.V(r7)
            r0.f1005i = r6
            r0.f1008l = r4
            d0.i r7 = r5.f1009i
            java.lang.Object r7 = r7.i(r6, r0)
            if (r7 != r1) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r7 = r3
        L_0x0046:
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            K2.o r6 = (K2.o) r6
            K2.b r6 = r6.f909i
            boolean r6 = r6.s()
            if (r6 == 0) goto L_0x0054
            return r3
        L_0x0054:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.c.a(K2.p, r2.d):java.lang.Object");
    }

    public final f b(C0425i iVar, int i3, int i4) {
        return new c(this.f1010j, iVar, i3, i4);
    }

    public final String toString() {
        return "block[" + this.f1009i + "] -> " + super.toString();
    }
}
