package I;

import A2.o;
import A2.q;
import java.io.Serializable;
import p2.C0368h;
import r2.C0420d;
import r2.C0425i;
import t2.C0488f;
import z2.l;
import z2.p;

public final class G extends C0488f implements l {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f536j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f537k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ P f538l;

    /* renamed from: m  reason: collision with root package name */
    public Object f539m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f540n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Serializable f541o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(q qVar, P p3, o oVar, C0420d dVar) {
        super(1, dVar);
        this.f540n = qVar;
        this.f538l = p3;
        this.f541o = oVar;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [z2.p, t2.f] */
    public final Object j(Object obj) {
        C0420d dVar = (C0420d) obj;
        switch (this.f536j) {
            case 0:
                return new G((q) this.f540n, this.f538l, (o) this.f541o, dVar).l(C0368h.f4194a);
            default:
                return new G(this.f538l, (C0425i) this.f540n, (p) (C0488f) this.f541o, dVar).l(C0368h.f4194a);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r6v3, types: [z2.p, t2.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f536j
            switch(r0) {
                case 0: goto L_0x0083;
                default: goto L_0x0005;
            }
        L_0x0005:
            s2.a r0 = s2.C0466a.f4632f
            int r1 = r8.f537k
            I.P r2 = r8.f538l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r5) goto L_0x002c
            if (r1 == r4) goto L_0x0024
            if (r1 != r3) goto L_0x001c
            java.lang.Object r0 = r8.f539m
            M0.a.V(r9)
            goto L_0x007a
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0024:
            java.lang.Object r1 = r8.f539m
            I.c r1 = (I.C0027c) r1
            M0.a.V(r9)
            goto L_0x0058
        L_0x002c:
            M0.a.V(r9)
            goto L_0x003c
        L_0x0030:
            M0.a.V(r9)
            r8.f537k = r5
            java.lang.Object r9 = I.P.e(r2, r5, r8)
            if (r9 != r0) goto L_0x003c
            goto L_0x007a
        L_0x003c:
            r1 = r9
            I.c r1 = (I.C0027c) r1
            I.I r9 = new I.I
            java.io.Serializable r6 = r8.f541o
            t2.f r6 = (t2.C0488f) r6
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.f539m = r1
            r8.f537k = r4
            java.lang.Object r4 = r8.f540n
            r2.i r4 = (r2.C0425i) r4
            java.lang.Object r9 = I2.C0071w.o(r4, r9, r8)
            if (r9 != r0) goto L_0x0058
            goto L_0x007a
        L_0x0058:
            java.lang.Object r4 = r1.f609b
            if (r4 == 0) goto L_0x0061
            int r4 = r4.hashCode()
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            int r6 = r1.f610c
            if (r4 != r6) goto L_0x007b
            java.lang.Object r1 = r1.f609b
            boolean r1 = A2.i.a(r1, r9)
            if (r1 != 0) goto L_0x0079
            r8.f539m = r9
            r8.f537k = r3
            java.lang.Object r1 = r2.i(r9, r5, r8)
            if (r1 != r0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r0 = r9
        L_0x007a:
            return r0
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r9.<init>(r0)
            throw r9
        L_0x0083:
            s2.a r0 = s2.C0466a.f4632f
            int r1 = r8.f537k
            java.io.Serializable r2 = r8.f541o
            A2.o r2 = (A2.o) r2
            java.lang.Object r3 = r8.f540n
            A2.q r3 = (A2.q) r3
            r4 = 3
            r5 = 2
            I.P r6 = r8.f538l
            r7 = 1
            if (r1 == 0) goto L_0x00c3
            if (r1 == r7) goto L_0x00b9
            if (r1 == r5) goto L_0x00af
            if (r1 != r4) goto L_0x00a7
            java.lang.Object r0 = r8.f539m
            java.io.Serializable r0 = (java.io.Serializable) r0
            r2 = r0
            A2.o r2 = (A2.o) r2
            M0.a.V(r9)
            goto L_0x00fa
        L_0x00a7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x00af:
            java.lang.Object r1 = r8.f539m
            java.io.Serializable r1 = (java.io.Serializable) r1
            A2.o r1 = (A2.o) r1
            M0.a.V(r9)     // Catch:{ b -> 0x00ed }
            goto L_0x00e4
        L_0x00b9:
            java.lang.Object r1 = r8.f539m
            java.io.Serializable r1 = (java.io.Serializable) r1
            A2.q r1 = (A2.q) r1
            M0.a.V(r9)     // Catch:{ b -> 0x00ed }
            goto L_0x00d2
        L_0x00c3:
            M0.a.V(r9)
            r8.f539m = r3     // Catch:{ b -> 0x00ed }
            r8.f537k = r7     // Catch:{ b -> 0x00ed }
            java.lang.Object r9 = r6.h(r8)     // Catch:{ b -> 0x00ed }
            if (r9 != r0) goto L_0x00d1
            goto L_0x0104
        L_0x00d1:
            r1 = r3
        L_0x00d2:
            r1.f86f = r9     // Catch:{ b -> 0x00ed }
            I.Z r9 = r6.f()     // Catch:{ b -> 0x00ed }
            r8.f539m = r2     // Catch:{ b -> 0x00ed }
            r8.f537k = r5     // Catch:{ b -> 0x00ed }
            java.lang.Integer r9 = r9.a()     // Catch:{ b -> 0x00ed }
            if (r9 != r0) goto L_0x00e3
            goto L_0x0104
        L_0x00e3:
            r1 = r2
        L_0x00e4:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch:{ b -> 0x00ed }
            int r9 = r9.intValue()     // Catch:{ b -> 0x00ed }
            r1.f84f = r9     // Catch:{ b -> 0x00ed }
            goto L_0x0102
        L_0x00ed:
            java.lang.Object r9 = r3.f86f
            r8.f539m = r2
            r8.f537k = r4
            java.lang.Object r9 = r6.i(r9, r7, r8)
            if (r9 != r0) goto L_0x00fa
            goto L_0x0104
        L_0x00fa:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.f84f = r9
        L_0x0102:
            p2.h r0 = p2.C0368h.f4194a
        L_0x0104:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I.G.l(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(P p3, C0425i iVar, p pVar, C0420d dVar) {
        super(1, dVar);
        this.f538l = p3;
        this.f540n = iVar;
        this.f541o = (C0488f) pVar;
    }
}
