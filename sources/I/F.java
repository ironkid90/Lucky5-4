package I;

import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

public final class F extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public Object f531j;

    /* renamed from: k  reason: collision with root package name */
    public int f532k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ boolean f533l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ P f534m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f535n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F(P p3, int i3, C0420d dVar) {
        super(2, dVar);
        this.f534m = p3;
        this.f535n = i3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        F f3 = new F(this.f534m, this.f535n, dVar);
        f3.f533l = ((Boolean) obj).booleanValue();
        return f3;
    }

    public final Object i(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) c(bool, (C0420d) obj2)).l(C0368h.f4194a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r7) {
        /*
            r6 = this;
            s2.a r0 = s2.C0466a.f4632f
            int r1 = r6.f532k
            I.P r2 = r6.f534m
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            java.lang.Object r0 = r6.f531j
            M0.a.V(r7)
            goto L_0x0045
        L_0x0014:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001c:
            boolean r1 = r6.f533l
            M0.a.V(r7)
            goto L_0x0032
        L_0x0022:
            M0.a.V(r7)
            boolean r1 = r6.f533l
            r6.f533l = r1
            r6.f532k = r4
            java.lang.Object r7 = r2.h(r6)
            if (r7 != r0) goto L_0x0032
            return r0
        L_0x0032:
            if (r1 == 0) goto L_0x004c
            I.Z r1 = r2.f()
            r6.f531j = r7
            r6.f532k = r3
            java.lang.Integer r1 = r1.a()
            if (r1 != r0) goto L_0x0043
            return r0
        L_0x0043:
            r0 = r7
            r7 = r1
        L_0x0045:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L_0x0051
        L_0x004c:
            int r0 = r6.f535n
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0051:
            I.c r1 = new I.c
            if (r0 == 0) goto L_0x005a
            int r2 = r0.hashCode()
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            r1.<init>(r0, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I.F.l(java.lang.Object):java.lang.Object");
    }
}
