package L2;

import B.m;
import M2.h;
import r2.C0425i;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final m f1066a = new m(11, (Object) "NONE");

    /* renamed from: b  reason: collision with root package name */
    public static final m f1067b = new m(11, (Object) "PENDING");

    /* JADX WARNING: type inference failed for: r0v2, types: [t2.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(L2.v r4, I.C0041q r5, java.lang.Throwable r6, t2.C0484b r7) {
        /*
            boolean r0 = r7 instanceof L2.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            L2.g r0 = (L2.g) r0
            int r1 = r0.f1019k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1019k = r1
            goto L_0x0018
        L_0x0013:
            L2.g r0 = new L2.g
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f1018j
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f1019k
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Throwable r6 = r0.f1017i
            M0.a.V(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x0041
        L_0x0029:
            r4 = move-exception
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            M0.a.V(r7)
            r0.f1017i = r6     // Catch:{ all -> 0x0029 }
            r0.f1019k = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r5.p(r4, r6, r0)     // Catch:{ all -> 0x0029 }
            if (r4 != r1) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            p2.h r1 = p2.C0368h.f4194a
        L_0x0043:
            return r1
        L_0x0044:
            if (r6 == 0) goto L_0x004b
            if (r6 == r4) goto L_0x004b
            android.support.v4.media.session.a.c(r4, r6)
        L_0x004b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.t.a(L2.v, I.q, java.lang.Throwable, t2.b):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [t2.b] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b2, code lost:
        if (r10 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b6, code lost:
        if ((r8 instanceof java.util.concurrent.CancellationException) != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b8, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bb, code lost:
        if (r3 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bd, code lost:
        r3 = new java.util.concurrent.CancellationException("Channel was consumed, consumer had failed");
        r3.initCause(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c7, code lost:
        r9.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ca, code lost:
        throw r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[Catch:{ all -> 0x00b1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f A[Catch:{ all -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[Catch:{ all -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(L2.e r8, K2.o r9, boolean r10, t2.C0484b r11) {
        /*
            boolean r0 = r11 instanceof L2.f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            L2.f r0 = (L2.f) r0
            int r1 = r0.f1016n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1016n = r1
            goto L_0x0018
        L_0x0013:
            L2.f r0 = new L2.f
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f1015m
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f1016n
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            boolean r10 = r0.f1014l
            K2.a r8 = r0.f1013k
            K2.q r9 = r0.f1012j
            L2.e r2 = r0.f1011i
            M0.a.V(r11)     // Catch:{ all -> 0x0036 }
        L_0x0032:
            r7 = r2
            r2 = r8
            r8 = r7
            goto L_0x005e
        L_0x0036:
            r8 = move-exception
            goto L_0x00b0
        L_0x0039:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0041:
            boolean r10 = r0.f1014l
            K2.a r8 = r0.f1013k
            K2.q r9 = r0.f1012j
            L2.e r2 = r0.f1011i
            M0.a.V(r11)     // Catch:{ all -> 0x0036 }
            goto L_0x0072
        L_0x004d:
            M0.a.V(r11)
            boolean r11 = r8 instanceof L2.v
            if (r11 != 0) goto L_0x00cb
            K2.b r11 = r9.f909i     // Catch:{ all -> 0x0036 }
            r11.getClass()     // Catch:{ all -> 0x0036 }
            K2.a r2 = new K2.a     // Catch:{ all -> 0x0036 }
            r2.<init>(r11)     // Catch:{ all -> 0x0036 }
        L_0x005e:
            r0.f1011i = r8     // Catch:{ all -> 0x0036 }
            r0.f1012j = r9     // Catch:{ all -> 0x0036 }
            r0.f1013k = r2     // Catch:{ all -> 0x0036 }
            r0.f1014l = r10     // Catch:{ all -> 0x0036 }
            r0.f1016n = r5     // Catch:{ all -> 0x0036 }
            java.lang.Object r11 = r2.b(r0)     // Catch:{ all -> 0x0036 }
            if (r11 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r7 = r2
            r2 = r8
            r8 = r7
        L_0x0072:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0036 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r11 == 0) goto L_0x00a8
            java.lang.Object r11 = r8.f863f     // Catch:{ all -> 0x0036 }
            B.m r6 = K2.d.f893p     // Catch:{ all -> 0x0036 }
            if (r11 == r6) goto L_0x00a0
            r8.f863f = r6     // Catch:{ all -> 0x0036 }
            B.m r6 = K2.d.f889l     // Catch:{ all -> 0x0036 }
            if (r11 == r6) goto L_0x0097
            r0.f1011i = r2     // Catch:{ all -> 0x0036 }
            r0.f1012j = r9     // Catch:{ all -> 0x0036 }
            r0.f1013k = r8     // Catch:{ all -> 0x0036 }
            r0.f1014l = r10     // Catch:{ all -> 0x0036 }
            r0.f1016n = r4     // Catch:{ all -> 0x0036 }
            java.lang.Object r11 = r2.b(r11, r0)     // Catch:{ all -> 0x0036 }
            if (r11 != r1) goto L_0x0032
            return r1
        L_0x0097:
            K2.b r8 = r8.f865h     // Catch:{ all -> 0x0036 }
            java.lang.Throwable r8 = r8.n()     // Catch:{ all -> 0x0036 }
            int r11 = N2.v.f1222a     // Catch:{ all -> 0x0036 }
            throw r8     // Catch:{ all -> 0x0036 }
        L_0x00a0:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0036 }
            java.lang.String r11 = "`hasNext()` has not been invoked"
            r8.<init>(r11)     // Catch:{ all -> 0x0036 }
            throw r8     // Catch:{ all -> 0x0036 }
        L_0x00a8:
            if (r10 == 0) goto L_0x00ad
            r9.a(r3)
        L_0x00ad:
            p2.h r8 = p2.C0368h.f4194a
            return r8
        L_0x00b0:
            throw r8     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r11 = move-exception
            if (r10 == 0) goto L_0x00ca
            boolean r10 = r8 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto L_0x00bb
            r3 = r8
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L_0x00bb:
            if (r3 != 0) goto L_0x00c7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "Channel was consumed, consumer had failed"
            r3.<init>(r10)
            r3.initCause(r8)
        L_0x00c7:
            r9.a(r3)
        L_0x00ca:
            throw r11
        L_0x00cb:
            L2.v r8 = (L2.v) r8
            java.lang.Throwable r8 = r8.f1069f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.t.b(L2.e, K2.o, boolean, t2.b):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, A2.q] */
    /* JADX WARNING: type inference failed for: r0v7, types: [t2.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(L2.d r5, t2.C0484b r6) {
        /*
            boolean r0 = r6 instanceof L2.o
            if (r0 == 0) goto L_0x0013
            r0 = r6
            L2.o r0 = (L2.o) r0
            int r1 = r0.f1054l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1054l = r1
            goto L_0x0018
        L_0x0013:
            L2.o r0 = new L2.o
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f1053k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f1054l
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            I.y r5 = r0.f1052j
            A2.q r0 = r0.f1051i
            M0.a.V(r6)     // Catch:{ a -> 0x002b }
            goto L_0x005a
        L_0x002b:
            r6 = move-exception
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            M0.a.V(r6)
            A2.q r6 = new A2.q
            r6.<init>()
            I.y r2 = new I.y
            r4 = 1
            r2.<init>(r4, r6)
            r0.f1051i = r6     // Catch:{ a -> 0x0052 }
            r0.f1052j = r2     // Catch:{ a -> 0x0052 }
            r0.f1054l = r3     // Catch:{ a -> 0x0052 }
            java.lang.Object r5 = r5.g(r2, r0)     // Catch:{ a -> 0x0052 }
            if (r5 != r1) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r0 = r6
            goto L_0x005a
        L_0x0052:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L_0x0056:
            L2.e r1 = r6.f1098f
            if (r1 != r5) goto L_0x005d
        L_0x005a:
            java.lang.Object r1 = r0.f86f
        L_0x005c:
            return r1
        L_0x005d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.t.c(L2.d, t2.b):java.lang.Object");
    }

    public static final d d(q qVar, C0425i iVar, int i3, int i4) {
        if (((i3 >= 0 && i3 < 2) || i3 == -2) && i4 == 2) {
            return qVar;
        }
        if ((i3 == 0 || i3 == -3) && i4 == 1) {
            return qVar;
        }
        return new h(qVar, iVar, i3, i4);
    }
}
