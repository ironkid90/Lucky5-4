package I;

import A2.o;
import K.j;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

public final class O extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public o f561j;

    /* renamed from: k  reason: collision with root package name */
    public int f562k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f563l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ o f564m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ P f565n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f566o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f567p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(o oVar, P p3, Object obj, boolean z3, C0420d dVar) {
        super(2, dVar);
        this.f564m = oVar;
        this.f565n = p3;
        this.f566o = obj;
        this.f567p = z3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        O o3 = new O(this.f564m, this.f565n, this.f566o, this.f567p, dVar);
        o3.f563l = obj;
        return o3;
    }

    public final Object i(Object obj, Object obj2) {
        return ((O) c((j) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r9) {
        /*
            r8 = this;
            s2.a r0 = s2.C0466a.f4632f
            int r1 = r8.f562k
            A2.o r2 = r8.f564m
            java.lang.Object r3 = r8.f566o
            I.P r4 = r8.f565n
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r6) goto L_0x001e
            if (r1 != r5) goto L_0x0016
            M0.a.V(r9)
            goto L_0x0065
        L_0x0016:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001e:
            A2.o r1 = r8.f561j
            java.lang.Object r6 = r8.f563l
            K.j r6 = (K.j) r6
            M0.a.V(r9)
            goto L_0x004f
        L_0x0028:
            M0.a.V(r9)
            java.lang.Object r9 = r8.f563l
            K.j r9 = (K.j) r9
            I.Z r1 = r4.f()
            r8.f563l = r9
            r8.f561j = r2
            r8.f562k = r6
            B.m r1 = r1.f605b
            java.lang.Object r1 = r1.f100g
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r1 = r2
            r7 = r6
            r6 = r9
            r9 = r7
        L_0x004f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.f84f = r9
            r9 = 0
            r8.f563l = r9
            r8.f561j = r9
            r8.f562k = r5
            java.lang.Object r9 = r6.b(r3, r8)
            if (r9 != r0) goto L_0x0065
            return r0
        L_0x0065:
            boolean r9 = r8.f567p
            if (r9 == 0) goto L_0x007d
            B.m r9 = r4.f575m
            I.c r0 = new I.c
            if (r3 == 0) goto L_0x0074
            int r1 = r3.hashCode()
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            int r2 = r2.f84f
            r0.<init>(r3, r1, r2)
            r9.s(r0)
        L_0x007d:
            p2.h r9 = p2.C0368h.f4194a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I.O.l(java.lang.Object):java.lang.Object");
    }
}
