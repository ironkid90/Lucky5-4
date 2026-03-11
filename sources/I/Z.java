package I;

import B.m;
import Q2.d;
import Q2.e;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C0420d;
import t2.C0488f;
import z2.p;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final d f604a = e.a();

    /* renamed from: b  reason: collision with root package name */
    public final m f605b = new m(4);

    /* renamed from: c  reason: collision with root package name */
    public final m f606c = new m((p) new C0488f(2, (C0420d) null));

    /* JADX WARNING: type inference failed for: r3v3, types: [z2.p, t2.f] */
    public Z(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f605b.f100g).get());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(z2.l r8, t2.C0484b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof I.W
            if (r0 == 0) goto L_0x0013
            r0 = r9
            I.W r0 = (I.W) r0
            int r1 = r0.f598m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f598m = r1
            goto L_0x0018
        L_0x0013:
            I.W r0 = new I.W
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f596k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f598m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.f594i
            Q2.a r8 = (Q2.a) r8
            M0.a.V(r9)     // Catch:{ all -> 0x002f }
            goto L_0x0067
        L_0x002f:
            r9 = move-exception
            goto L_0x0071
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            Q2.d r8 = r0.f595j
            java.lang.Object r2 = r0.f594i
            z2.l r2 = (z2.l) r2
            M0.a.V(r9)
            r9 = r8
            r8 = r2
            goto L_0x0057
        L_0x0045:
            M0.a.V(r9)
            r0.f594i = r8
            Q2.d r9 = r7.f604a
            r0.f595j = r9
            r0.f598m = r4
            java.lang.Object r2 = r9.c(r0)
            if (r2 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0.f594i = r9     // Catch:{ all -> 0x006d }
            r0.f595j = r5     // Catch:{ all -> 0x006d }
            r0.f598m = r3     // Catch:{ all -> 0x006d }
            java.lang.Object r8 = r8.j(r0)     // Catch:{ all -> 0x006d }
            if (r8 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0067:
            Q2.d r8 = (Q2.d) r8
            r8.e(r5)
            return r9
        L_0x006d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0071:
            Q2.d r8 = (Q2.d) r8
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Z.b(z2.l, t2.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(z2.p r7, t2.C0484b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof I.X
            if (r0 == 0) goto L_0x0013
            r0 = r8
            I.X r0 = (I.X) r0
            int r1 = r0.f603m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f603m = r1
            goto L_0x0018
        L_0x0013:
            I.X r0 = new I.X
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f601k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f603m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            boolean r7 = r0.f600j
            Q2.d r0 = r0.f599i
            M0.a.V(r8)     // Catch:{ all -> 0x002c }
            goto L_0x0053
        L_0x002c:
            r8 = move-exception
            goto L_0x005d
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            M0.a.V(r8)
            Q2.d r8 = r6.f604a
            boolean r2 = r8.d(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0059 }
            r0.f599i = r8     // Catch:{ all -> 0x0059 }
            r0.f600j = r2     // Catch:{ all -> 0x0059 }
            r0.f603m = r3     // Catch:{ all -> 0x0059 }
            java.lang.Object r7 = r7.i(r5, r0)     // Catch:{ all -> 0x0059 }
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r8
            r8 = r7
            r7 = r2
        L_0x0053:
            if (r7 == 0) goto L_0x0058
            r0.e(r4)
        L_0x0058:
            return r8
        L_0x0059:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L_0x005d:
            if (r7 == 0) goto L_0x0062
            r0.e(r4)
        L_0x0062:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Z.c(z2.p, t2.b):java.lang.Object");
    }
}
