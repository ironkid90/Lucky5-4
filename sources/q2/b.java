package Q2;

import A2.j;
import z2.l;

public final class b extends j implements l {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f1299g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f1300h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f1301i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        super(1);
        this.f1299g = i3;
        this.f1300h = obj;
        this.f1301i = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f1299g
            switch(r1) {
                case 0: goto L_0x010a;
                case 1: goto L_0x00ef;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r19
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f1300h
            I.K r2 = (I.K) r2
            r2.j(r1)
            java.lang.Object r2 = r0.f1301i
            s1.y r2 = (s1.C0464y) r2
            java.lang.Object r3 = r2.f4624h
            K2.b r3 = (K2.b) r3
            r4 = 0
            r3.f(r1, r4)
        L_0x001e:
            java.lang.Object r3 = r2.f4624h
            K2.b r3 = (K2.b) r3
            r3.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = K2.b.f867i
            long r4 = r10.get(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = K2.b.f866h
            long r6 = r11.get(r3)
            r12 = 1
            boolean r8 = r3.r(r6, r12)
            if (r8 == 0) goto L_0x0043
            java.lang.Throwable r3 = r3.m()
            K2.g r4 = new K2.g
            r4.<init>(r3)
            goto L_0x00d3
        L_0x0043:
            r8 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r6 = r6 & r8
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            K2.h r13 = K2.i.f901a
            if (r4 < 0) goto L_0x0052
        L_0x004f:
            r4 = r13
            goto L_0x00d3
        L_0x0052:
            B.m r14 = K2.d.f888k
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = K2.b.f871m
            java.lang.Object r4 = r4.get(r3)
            K2.j r4 = (K2.j) r4
        L_0x005c:
            long r5 = r11.get(r3)
            boolean r5 = r3.r(r5, r12)
            if (r5 == 0) goto L_0x0071
            java.lang.Throwable r3 = r3.m()
            K2.g r4 = new K2.g
            r4.<init>(r3)
            goto L_0x00d3
        L_0x0071:
            long r7 = r10.getAndIncrement(r3)
            int r5 = K2.d.f879b
            long r5 = (long) r5
            r15 = r13
            long r12 = r7 / r5
            long r5 = r7 % r5
            int r9 = (int) r5
            long r5 = r4.f1221h
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x008f
            K2.j r5 = r3.k(r12, r4)
            if (r5 != 0) goto L_0x008d
        L_0x008a:
            r13 = r15
            r12 = 1
            goto L_0x005c
        L_0x008d:
            r12 = r5
            goto L_0x0090
        L_0x008f:
            r12 = r4
        L_0x0090:
            r4 = r3
            r5 = r12
            r6 = r9
            r16 = r7
            r13 = r9
            r9 = r14
            java.lang.Object r4 = r4.A(r5, r6, r7, r9)
            B.m r5 = K2.d.f890m
            if (r4 != r5) goto L_0x00b6
            boolean r4 = r14 instanceof I2.m0
            if (r4 == 0) goto L_0x00a6
            I2.m0 r14 = (I2.m0) r14
            goto L_0x00a7
        L_0x00a6:
            r14 = 0
        L_0x00a7:
            if (r14 == 0) goto L_0x00ac
            r14.a(r12, r13)
        L_0x00ac:
            r5 = r16
            r3.C(r5)
            r12.h()
            r13 = r15
            goto L_0x004f
        L_0x00b6:
            r5 = r16
            B.m r7 = K2.d.f892o
            if (r4 != r7) goto L_0x00c9
            long r7 = r3.p()
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c7
            r12.a()
        L_0x00c7:
            r4 = r12
            goto L_0x008a
        L_0x00c9:
            B.m r3 = K2.d.f891n
            if (r4 == r3) goto L_0x00e7
            r12.a()
            r13 = r4
            goto L_0x004f
        L_0x00d3:
            boolean r3 = r4 instanceof K2.h
            r5 = 0
            if (r3 != 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r4 = r5
        L_0x00da:
            p2.h r3 = p2.C0368h.f4194a
            if (r4 == 0) goto L_0x00e4
            I.L r5 = I.L.f553g
            r5.i(r4, r1)
            r5 = r3
        L_0x00e4:
            if (r5 != 0) goto L_0x001e
            return r3
        L_0x00e7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L_0x00ef:
            r1 = r19
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Q2.d.f1304g
            java.lang.Object r2 = r0.f1301i
            Q2.c r2 = (Q2.c) r2
            r2.getClass()
            java.lang.Object r2 = r0.f1300h
            Q2.d r2 = (Q2.d) r2
            r3 = 0
            r1.set(r2, r3)
            r2.e(r3)
            p2.h r1 = p2.C0368h.f4194a
            return r1
        L_0x010a:
            r1 = r19
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r1 = r0.f1301i
            Q2.c r1 = (Q2.c) r1
            r1.getClass()
            java.lang.Object r1 = r0.f1300h
            Q2.d r1 = (Q2.d) r1
            r2 = 0
            r1.e(r2)
            p2.h r1 = p2.C0368h.f4194a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.b.j(java.lang.Object):java.lang.Object");
    }
}
