package L2;

import B.m;
import M2.b;
import M2.j;
import M2.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.C0368h;
import r2.C0420d;
import r2.C0425i;

public final class s extends b implements q, d, e, j {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1064j = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: i  reason: collision with root package name */
    public int f1065i;

    public s(Object obj) {
        this._state = obj;
    }

    public final Object a() {
        m mVar = l.f1119a;
        Object obj = f1064j.get(this);
        if (obj == mVar) {
            return null;
        }
        return obj;
    }

    public final Object b(Object obj, C0420d dVar) {
        if (obj == null) {
            obj = l.f1119a;
        }
        c((Object) null, obj);
        return C0368h.f4194a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        r12 = (L2.u[]) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r12 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        r0 = r12.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (r3 >= r0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        r4 = r12[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r4 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0039, code lost:
        r5 = L2.u.f1068a;
        r6 = r5.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        if (r6 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        r7 = L2.t.f1067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (r6 != r7) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        r8 = L2.t.f1066a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
        if (r6 != r8) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        if (r5.compareAndSet(r4, r6, r7) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0056, code lost:
        if (r5.get(r4) == r6) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        if (r5.compareAndSet(r4, r6, r8) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005f, code lost:
        ((I2.C0055f) r6).m(p2.C0368h.f4194a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006b, code lost:
        if (r5.get(r4) == r6) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006e, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0071, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r12 = r10.f1065i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0074, code lost:
        if (r12 != r11) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0076, code lost:
        r10.f1065i = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0079, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r11 = r10.f1099f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007f, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0080, code lost:
        r9 = r12;
        r12 = r11;
        r11 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1064j     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.get(r10)     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r11 == 0) goto L_0x0015
            boolean r11 = A2.i.a(r1, r11)     // Catch:{ all -> 0x0012 }
            if (r11 != 0) goto L_0x0015
            monitor-exit(r10)
            return r2
        L_0x0012:
            r11 = move-exception
            goto L_0x008c
        L_0x0015:
            boolean r11 = A2.i.a(r1, r12)     // Catch:{ all -> 0x0012 }
            r1 = 1
            if (r11 == 0) goto L_0x001e
            monitor-exit(r10)
            return r1
        L_0x001e:
            r0.set(r10, r12)     // Catch:{ all -> 0x0012 }
            int r11 = r10.f1065i     // Catch:{ all -> 0x0012 }
            r12 = r11 & 1
            if (r12 != 0) goto L_0x0086
            int r11 = r11 + r1
            r10.f1065i = r11     // Catch:{ all -> 0x0012 }
            M2.c[] r12 = r10.f1099f     // Catch:{ all -> 0x0012 }
            monitor-exit(r10)
        L_0x002d:
            L2.u[] r12 = (L2.u[]) r12
            if (r12 == 0) goto L_0x0071
            int r0 = r12.length
            r3 = r2
        L_0x0033:
            if (r3 >= r0) goto L_0x0071
            r4 = r12[r3]
            if (r4 == 0) goto L_0x006e
        L_0x0039:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = L2.u.f1068a
            java.lang.Object r6 = r5.get(r4)
            if (r6 != 0) goto L_0x0042
            goto L_0x006e
        L_0x0042:
            B.m r7 = L2.t.f1067b
            if (r6 != r7) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            B.m r8 = L2.t.f1066a
            if (r6 != r8) goto L_0x0059
        L_0x004b:
            boolean r8 = r5.compareAndSet(r4, r6, r7)
            if (r8 == 0) goto L_0x0052
            goto L_0x006e
        L_0x0052:
            java.lang.Object r8 = r5.get(r4)
            if (r8 == r6) goto L_0x004b
            goto L_0x0039
        L_0x0059:
            boolean r7 = r5.compareAndSet(r4, r6, r8)
            if (r7 == 0) goto L_0x0067
            I2.f r6 = (I2.C0055f) r6
            p2.h r4 = p2.C0368h.f4194a
            r6.m(r4)
            goto L_0x006e
        L_0x0067:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r6) goto L_0x0059
            goto L_0x0039
        L_0x006e:
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0071:
            monitor-enter(r10)
            int r12 = r10.f1065i     // Catch:{ all -> 0x007b }
            if (r12 != r11) goto L_0x007d
            int r11 = r11 + r1
            r10.f1065i = r11     // Catch:{ all -> 0x007b }
            monitor-exit(r10)
            return r1
        L_0x007b:
            r11 = move-exception
            goto L_0x0084
        L_0x007d:
            M2.c[] r11 = r10.f1099f     // Catch:{ all -> 0x007b }
            monitor-exit(r10)
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x002d
        L_0x0084:
            monitor-exit(r10)
            throw r11
        L_0x0086:
            int r11 = r11 + 2
            r10.f1065i = r11     // Catch:{ all -> 0x0012 }
            monitor-exit(r10)
            return r1
        L_0x008c:
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.s.c(java.lang.Object, java.lang.Object):boolean");
    }

    public final d d(C0425i iVar, int i3, int i4) {
        return t.d(this, iVar, i3, i4);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x013a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d4 A[Catch:{ all -> 0x003f, all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ee A[Catch:{ all -> 0x003f, all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f0 A[Catch:{ all -> 0x003f, all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0103 A[Catch:{ all -> 0x003f, all -> 0x0161 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0117 A[Catch:{ all -> 0x003f, all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0118 A[Catch:{ all -> 0x003f, all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013b A[Catch:{ all -> 0x003f, all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014f A[RETURN] */
    public final java.lang.Object g(L2.e r18, r2.C0420d r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r0 instanceof L2.r
            if (r2 == 0) goto L_0x0017
            r2 = r0
            L2.r r2 = (L2.r) r2
            int r3 = r2.f1063p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f1063p = r3
            goto L_0x001c
        L_0x0017:
            L2.r r2 = new L2.r
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f1061n
            s2.a r3 = s2.C0466a.f4632f
            int r4 = r2.f1063p
            r5 = 1
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 2
            if (r4 == 0) goto L_0x0063
            if (r4 == r5) goto L_0x0059
            if (r4 == r9) goto L_0x004a
            if (r4 != r6) goto L_0x0042
            java.lang.Object r4 = r2.f1060m
            I2.Q r10 = r2.f1059l
            L2.u r11 = r2.f1058k
            L2.e r12 = r2.f1057j
            L2.s r13 = r2.f1056i
            M0.a.V(r0)     // Catch:{ all -> 0x003f }
            r0 = r4
            goto L_0x0150
        L_0x003f:
            r0 = move-exception
            goto L_0x0155
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            java.lang.Object r4 = r2.f1060m
            I2.Q r10 = r2.f1059l
            L2.u r11 = r2.f1058k
            L2.e r12 = r2.f1057j
            L2.s r13 = r2.f1056i
            M0.a.V(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0104
        L_0x0059:
            L2.u r11 = r2.f1058k
            L2.e r4 = r2.f1057j
            L2.s r13 = r2.f1056i
            M0.a.V(r0)     // Catch:{ all -> 0x003f }
            goto L_0x00bc
        L_0x0063:
            M0.a.V(r0)
            monitor-enter(r17)
            M2.c[] r0 = r1.f1099f     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0073
            L2.u[] r0 = new L2.u[r9]     // Catch:{ all -> 0x0070 }
            r1.f1099f = r0     // Catch:{ all -> 0x0070 }
            goto L_0x008a
        L_0x0070:
            r0 = move-exception
            goto L_0x0171
        L_0x0073:
            int r4 = r1.f1100g     // Catch:{ all -> 0x0070 }
            int r10 = r0.length     // Catch:{ all -> 0x0070 }
            if (r4 < r10) goto L_0x008a
            int r4 = r0.length     // Catch:{ all -> 0x0070 }
            int r4 = r4 * r9
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "copyOf(this, newSize)"
            A2.i.d(r0, r4)     // Catch:{ all -> 0x0070 }
            r4 = r0
            M2.c[] r4 = (M2.c[]) r4     // Catch:{ all -> 0x0070 }
            r1.f1099f = r4     // Catch:{ all -> 0x0070 }
            M2.c[] r0 = (M2.c[]) r0     // Catch:{ all -> 0x0070 }
        L_0x008a:
            int r4 = r1.f1101h     // Catch:{ all -> 0x0070 }
        L_0x008c:
            r10 = r0[r4]     // Catch:{ all -> 0x0070 }
            if (r10 != 0) goto L_0x0097
            L2.u r10 = new L2.u     // Catch:{ all -> 0x0070 }
            r10.<init>()     // Catch:{ all -> 0x0070 }
            r0[r4] = r10     // Catch:{ all -> 0x0070 }
        L_0x0097:
            int r4 = r4 + 1
            int r11 = r0.length     // Catch:{ all -> 0x0070 }
            if (r4 < r11) goto L_0x009d
            r4 = r8
        L_0x009d:
            r11 = r10
            L2.u r11 = (L2.u) r11     // Catch:{ all -> 0x0070 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = L2.u.f1068a     // Catch:{ all -> 0x0070 }
            java.lang.Object r13 = r12.get(r11)     // Catch:{ all -> 0x0070 }
            if (r13 == 0) goto L_0x00a9
            goto L_0x008c
        L_0x00a9:
            B.m r0 = L2.t.f1066a     // Catch:{ all -> 0x0070 }
            r12.set(r11, r0)     // Catch:{ all -> 0x0070 }
            r1.f1101h = r4     // Catch:{ all -> 0x0070 }
            int r0 = r1.f1100g     // Catch:{ all -> 0x0070 }
            int r0 = r0 + r5
            r1.f1100g = r0     // Catch:{ all -> 0x0070 }
            monitor-exit(r17)
            L2.u r10 = (L2.u) r10
            r4 = r18
            r13 = r1
            r11 = r10
        L_0x00bc:
            r2.i r0 = r2.f4684g     // Catch:{ all -> 0x003f }
            A2.i.b(r0)     // Catch:{ all -> 0x003f }
            I2.t r10 = I2.C0068t.f786g     // Catch:{ all -> 0x003f }
            r2.g r0 = r0.n(r10)     // Catch:{ all -> 0x003f }
            I2.Q r0 = (I2.Q) r0     // Catch:{ all -> 0x003f }
            r10 = r0
            r12 = r4
            r0 = r7
        L_0x00cc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f1064j     // Catch:{ all -> 0x003f }
            java.lang.Object r4 = r4.get(r13)     // Catch:{ all -> 0x003f }
            if (r10 == 0) goto L_0x00e2
            boolean r14 = r10.b()     // Catch:{ all -> 0x003f }
            if (r14 == 0) goto L_0x00db
            goto L_0x00e2
        L_0x00db:
            I2.a0 r10 = (I2.a0) r10     // Catch:{ all -> 0x003f }
            java.util.concurrent.CancellationException r0 = r10.A()     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x00e2:
            if (r0 == 0) goto L_0x00ea
            boolean r14 = r0.equals(r4)     // Catch:{ all -> 0x003f }
            if (r14 != 0) goto L_0x0105
        L_0x00ea:
            B.m r0 = M2.l.f1119a     // Catch:{ all -> 0x003f }
            if (r4 != r0) goto L_0x00f0
            r0 = r7
            goto L_0x00f1
        L_0x00f0:
            r0 = r4
        L_0x00f1:
            r2.f1056i = r13     // Catch:{ all -> 0x003f }
            r2.f1057j = r12     // Catch:{ all -> 0x003f }
            r2.f1058k = r11     // Catch:{ all -> 0x003f }
            r2.f1059l = r10     // Catch:{ all -> 0x003f }
            r2.f1060m = r4     // Catch:{ all -> 0x003f }
            r2.f1063p = r9     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r12.b(r0, r2)     // Catch:{ all -> 0x003f }
            if (r0 != r3) goto L_0x0104
            return r3
        L_0x0104:
            r0 = r4
        L_0x0105:
            r11.getClass()     // Catch:{ all -> 0x003f }
            B.m r4 = L2.t.f1066a     // Catch:{ all -> 0x003f }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = L2.u.f1068a     // Catch:{ all -> 0x003f }
            java.lang.Object r14 = r14.getAndSet(r11, r4)     // Catch:{ all -> 0x003f }
            A2.i.b(r14)     // Catch:{ all -> 0x003f }
            B.m r15 = L2.t.f1067b     // Catch:{ all -> 0x003f }
            if (r14 != r15) goto L_0x0118
            goto L_0x00cc
        L_0x0118:
            r2.f1056i = r13     // Catch:{ all -> 0x003f }
            r2.f1057j = r12     // Catch:{ all -> 0x003f }
            r2.f1058k = r11     // Catch:{ all -> 0x003f }
            r2.f1059l = r10     // Catch:{ all -> 0x003f }
            r2.f1060m = r0     // Catch:{ all -> 0x003f }
            r2.f1063p = r6     // Catch:{ all -> 0x003f }
            I2.f r14 = new I2.f     // Catch:{ all -> 0x003f }
            r2.d r15 = M0.a.y(r2)     // Catch:{ all -> 0x003f }
            r14.<init>(r5, r15)     // Catch:{ all -> 0x003f }
            r14.v()     // Catch:{ all -> 0x003f }
        L_0x0130:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r15 = L2.u.f1068a     // Catch:{ all -> 0x003f }
            boolean r16 = r15.compareAndSet(r11, r4, r14)     // Catch:{ all -> 0x003f }
            p2.h r5 = p2.C0368h.f4194a     // Catch:{ all -> 0x003f }
            if (r16 == 0) goto L_0x013b
            goto L_0x0144
        L_0x013b:
            java.lang.Object r15 = r15.get(r11)     // Catch:{ all -> 0x003f }
            if (r15 == r4) goto L_0x0153
            r14.m(r5)     // Catch:{ all -> 0x003f }
        L_0x0144:
            java.lang.Object r4 = r14.u()     // Catch:{ all -> 0x003f }
            s2.a r14 = s2.C0466a.f4632f     // Catch:{ all -> 0x003f }
            if (r4 != r14) goto L_0x014d
            r5 = r4
        L_0x014d:
            if (r5 != r3) goto L_0x0150
            return r3
        L_0x0150:
            r5 = 1
            goto L_0x00cc
        L_0x0153:
            r5 = 1
            goto L_0x0130
        L_0x0155:
            monitor-enter(r13)
            int r2 = r13.f1100g     // Catch:{ all -> 0x0161 }
            int r2 = r2 + -1
            r13.f1100g = r2     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x0163
            r13.f1101h = r8     // Catch:{ all -> 0x0161 }
            goto L_0x0163
        L_0x0161:
            r0 = move-exception
            goto L_0x016f
        L_0x0163:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            A2.i.c(r11, r2)     // Catch:{ all -> 0x0161 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = L2.u.f1068a     // Catch:{ all -> 0x0161 }
            r2.set(r11, r7)     // Catch:{ all -> 0x0161 }
            monitor-exit(r13)
            throw r0
        L_0x016f:
            monitor-exit(r13)
            throw r0
        L_0x0171:
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.s.g(L2.e, r2.d):java.lang.Object");
    }
}
