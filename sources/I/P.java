package I;

import B.m;
import I2.C0068t;
import I2.C0069u;
import I2.C0071w;
import I2.Q;
import I2.a0;
import I2.f0;
import K.e;
import K.h;
import K2.i;
import Q2.b;
import Q2.d;
import java.util.List;
import p2.C0366f;
import q2.C0401d;
import r2.C0420d;
import r2.C0425i;
import s1.C0464y;
import t2.C0484b;
import t2.C0488f;
import z2.p;

public final class P implements C0032h {

    /* renamed from: f  reason: collision with root package name */
    public final e f568f;

    /* renamed from: g  reason: collision with root package name */
    public final j1.e f569g;

    /* renamed from: h  reason: collision with root package name */
    public final C0069u f570h;

    /* renamed from: i  reason: collision with root package name */
    public final m f571i = new m((p) new C0043t(this, (C0420d) null));

    /* renamed from: j  reason: collision with root package name */
    public final d f572j = Q2.e.a();

    /* renamed from: k  reason: collision with root package name */
    public int f573k;

    /* renamed from: l  reason: collision with root package name */
    public f0 f574l;

    /* renamed from: m  reason: collision with root package name */
    public final m f575m = new m(5);

    /* renamed from: n  reason: collision with root package name */
    public final C0464y f576n;

    /* renamed from: o  reason: collision with root package name */
    public final C0366f f577o;

    /* renamed from: p  reason: collision with root package name */
    public final C0366f f578p;

    /* renamed from: q  reason: collision with root package name */
    public final C0464y f579q;

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, s1.y] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Object, s1.y] */
    public P(e eVar, List list, j1.e eVar2, C0069u uVar) {
        this.f568f = eVar;
        this.f569g = eVar2;
        this.f570h = uVar;
        ? obj = new Object();
        obj.f4625i = this;
        obj.f4622f = Q2.e.a();
        a0 a0Var = new a0(true);
        a0Var.H((Q) null);
        obj.f4623g = a0Var;
        obj.f4624h = C0401d.h0(list);
        this.f576n = obj;
        this.f577o = new C0366f(new C0037m(this, 1));
        this.f578p = new C0366f(new C0037m(this, 0));
        K k3 = new K(0, this);
        M m3 = new M(this, (C0420d) null);
        ? obj2 = new Object();
        obj2.f4622f = uVar;
        obj2.f4623g = m3;
        obj2.f4624h = i.a(Integer.MAX_VALUE, 0, 6);
        obj2.f4625i = new m(4);
        Q q3 = (Q) uVar.j().n(C0068t.f786g);
        if (q3 != null) {
            ((a0) q3).I(false, true, new b(2, k3, obj2));
        }
        this.f579q = obj2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053 A[Catch:{ all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(I.P r4, t2.C0484b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof I.C0044u
            if (r0 == 0) goto L_0x0016
            r0 = r5
            I.u r0 = (I.C0044u) r0
            int r1 = r0.f676m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f676m = r1
            goto L_0x001b
        L_0x0016:
            I.u r0 = new I.u
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.f674k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f676m
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            Q2.d r4 = r0.f673j
            I.P r0 = r0.f672i
            M0.a.V(r5)
            r5 = r4
            r4 = r0
            goto L_0x004a
        L_0x0030:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0038:
            M0.a.V(r5)
            r0.f672i = r4
            Q2.d r5 = r4.f572j
            r0.f673j = r5
            r0.f676m = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L_0x004a
            goto L_0x0064
        L_0x004a:
            r0 = 0
            int r1 = r4.f573k     // Catch:{ all -> 0x005d }
            int r1 = r1 + -1
            r4.f573k = r1     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x005f
            I2.f0 r1 = r4.f574l     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x005a
            r1.a(r0)     // Catch:{ all -> 0x005d }
        L_0x005a:
            r4.f574l = r0     // Catch:{ all -> 0x005d }
            goto L_0x005f
        L_0x005d:
            r4 = move-exception
            goto L_0x0065
        L_0x005f:
            r5.e(r0)
            p2.h r1 = p2.C0368h.f4194a
        L_0x0064:
            return r1
        L_0x0065:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I.P.a(I.P, t2.b):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [z2.p, t2.f] */
    /* JADX WARNING: type inference failed for: r2v7, types: [z2.p, t2.f] */
    /* JADX WARNING: type inference failed for: r9v19, types: [I2.k] */
    /* JADX WARNING: type inference failed for: r9v26, types: [I2.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(I.P r9, I.S r10, t2.C0484b r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof I.C0046w
            if (r0 == 0) goto L_0x0016
            r0 = r11
            I.w r0 = (I.C0046w) r0
            int r1 = r0.f684n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f684n = r1
            goto L_0x001b
        L_0x0016:
            I.w r0 = new I.w
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.f682l
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f684n
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r6) goto L_0x0050
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            java.lang.Object r9 = r0.f679i
            I2.k r9 = (I2.C0060k) r9
        L_0x0031:
            M0.a.V(r11)     // Catch:{ all -> 0x0036 }
            goto L_0x00e0
        L_0x0036:
            r10 = move-exception
            goto L_0x00dc
        L_0x0039:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0041:
            I2.l r9 = r0.f681k
            I.P r10 = r0.f680j
            java.lang.Object r2 = r0.f679i
            I.S r2 = (I.S) r2
            M0.a.V(r11)     // Catch:{ all -> 0x0036 }
            r11 = r9
            r9 = r10
            r10 = r2
            goto L_0x00a5
        L_0x0050:
            java.lang.Object r9 = r0.f679i
            I2.k r9 = (I2.C0060k) r9
            goto L_0x0031
        L_0x0055:
            M0.a.V(r11)
            I2.l r11 = r10.f582b
            B.m r2 = r9.f575m     // Catch:{ all -> 0x0087 }
            I.a0 r2 = r2.r()     // Catch:{ all -> 0x0087 }
            boolean r7 = r2 instanceof I.C0027c     // Catch:{ all -> 0x0087 }
            if (r7 == 0) goto L_0x0089
            t2.f r2 = r10.f581a     // Catch:{ all -> 0x0087 }
            r2.i r10 = r10.f584d     // Catch:{ all -> 0x0087 }
            r0.f679i = r11     // Catch:{ all -> 0x0087 }
            r0.f684n = r6     // Catch:{ all -> 0x0087 }
            I.Z r4 = r9.f()     // Catch:{ all -> 0x0083 }
            I.G r5 = new I.G     // Catch:{ all -> 0x0083 }
            r5.<init>((I.P) r9, (r2.C0425i) r10, (z2.p) r2, (r2.C0420d) r3)     // Catch:{ all -> 0x0083 }
            java.lang.Object r9 = r4.b(r5, r0)     // Catch:{ all -> 0x0083 }
            if (r9 != r1) goto L_0x007d
            goto L_0x00fa
        L_0x007d:
            r8 = r11
            r11 = r9
            r9 = r8
            goto L_0x00e0
        L_0x0081:
            r10 = r9
            goto L_0x0085
        L_0x0083:
            r9 = move-exception
            goto L_0x0081
        L_0x0085:
            r9 = r11
            goto L_0x00dc
        L_0x0087:
            r10 = move-exception
            goto L_0x0085
        L_0x0089:
            boolean r7 = r2 instanceof I.T     // Catch:{ all -> 0x0087 }
            if (r7 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            boolean r6 = r2 instanceof I.b0     // Catch:{ all -> 0x0087 }
        L_0x0090:
            if (r6 == 0) goto L_0x00cd
            I.a0 r6 = r10.f583c     // Catch:{ all -> 0x0087 }
            if (r2 != r6) goto L_0x00c3
            r0.f679i = r10     // Catch:{ all -> 0x0087 }
            r0.f680j = r9     // Catch:{ all -> 0x0087 }
            r0.f681k = r11     // Catch:{ all -> 0x0087 }
            r0.f684n = r5     // Catch:{ all -> 0x0087 }
            java.lang.Object r2 = r9.g(r0)     // Catch:{ all -> 0x0087 }
            if (r2 != r1) goto L_0x00a5
            goto L_0x00fa
        L_0x00a5:
            t2.f r2 = r10.f581a     // Catch:{ all -> 0x0087 }
            r2.i r10 = r10.f584d     // Catch:{ all -> 0x0087 }
            r0.f679i = r11     // Catch:{ all -> 0x0087 }
            r0.f680j = r3     // Catch:{ all -> 0x0087 }
            r0.f681k = r3     // Catch:{ all -> 0x0087 }
            r0.f684n = r4     // Catch:{ all -> 0x0087 }
            I.Z r4 = r9.f()     // Catch:{ all -> 0x00c1 }
            I.G r5 = new I.G     // Catch:{ all -> 0x00c1 }
            r5.<init>((I.P) r9, (r2.C0425i) r10, (z2.p) r2, (r2.C0420d) r3)     // Catch:{ all -> 0x00c1 }
            java.lang.Object r9 = r4.b(r5, r0)     // Catch:{ all -> 0x00c1 }
            if (r9 != r1) goto L_0x007d
            goto L_0x00fa
        L_0x00c1:
            r9 = move-exception
            goto L_0x0081
        L_0x00c3:
            java.lang.String r9 = "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>"
            A2.i.c(r2, r9)     // Catch:{ all -> 0x0087 }
            I.T r2 = (I.T) r2     // Catch:{ all -> 0x0087 }
            java.lang.Throwable r9 = r2.f585b     // Catch:{ all -> 0x0087 }
            throw r9     // Catch:{ all -> 0x0087 }
        L_0x00cd:
            boolean r9 = r2 instanceof I.Q     // Catch:{ all -> 0x0087 }
            if (r9 == 0) goto L_0x00d6
            I.Q r2 = (I.Q) r2     // Catch:{ all -> 0x0087 }
            java.lang.Throwable r9 = r2.f580b     // Catch:{ all -> 0x0087 }
            throw r9     // Catch:{ all -> 0x0087 }
        L_0x00d6:
            H0.b r9 = new H0.b     // Catch:{ all -> 0x0087 }
            r9.<init>()     // Catch:{ all -> 0x0087 }
            throw r9     // Catch:{ all -> 0x0087 }
        L_0x00dc:
            p2.d r11 = M0.a.h(r10)
        L_0x00e0:
            java.lang.Throwable r10 = p2.C0365e.a(r11)
            I2.l r9 = (I2.C0061l) r9
            if (r10 != 0) goto L_0x00ec
            r9.K(r11)
            goto L_0x00f8
        L_0x00ec:
            r9.getClass()
            I2.n r11 = new I2.n
            r0 = 0
            r11.<init>(r10, r0)
            r9.K(r11)
        L_0x00f8:
            p2.h r1 = p2.C0368h.f4194a
        L_0x00fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I.P.b(I.P, I.S, t2.b):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(I.P r4, t2.C0484b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof I.C0047x
            if (r0 == 0) goto L_0x0016
            r0 = r5
            I.x r0 = (I.C0047x) r0
            int r1 = r0.f689m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f689m = r1
            goto L_0x001b
        L_0x0016:
            I.x r0 = new I.x
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.f687k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f689m
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            Q2.d r4 = r0.f686j
            I.P r0 = r0.f685i
            M0.a.V(r5)
            r5 = r4
            r4 = r0
            goto L_0x004a
        L_0x0030:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0038:
            M0.a.V(r5)
            r0.f685i = r4
            Q2.d r5 = r4.f572j
            r0.f686j = r5
            r0.f689m = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            r0 = 0
            int r1 = r4.f573k     // Catch:{ all -> 0x0061 }
            int r1 = r1 + r3
            r4.f573k = r1     // Catch:{ all -> 0x0061 }
            if (r1 != r3) goto L_0x0063
            I2.u r1 = r4.f570h     // Catch:{ all -> 0x0061 }
            I.z r2 = new I.z     // Catch:{ all -> 0x0061 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x0061 }
            r3 = 3
            I2.f0 r1 = I2.C0071w.h(r1, r0, r2, r3)     // Catch:{ all -> 0x0061 }
            r4.f574l = r1     // Catch:{ all -> 0x0061 }
            goto L_0x0063
        L_0x0061:
            r4 = move-exception
            goto L_0x0069
        L_0x0063:
            r5.e(r0)
            p2.h r1 = p2.C0368h.f4194a
        L_0x0068:
            return r1
        L_0x0069:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I.P.c(I.P, t2.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(I.P r8, boolean r9, r2.C0420d r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof I.B
            if (r0 == 0) goto L_0x0016
            r0 = r10
            I.B r0 = (I.B) r0
            int r1 = r0.f513n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f513n = r1
            goto L_0x001b
        L_0x0016:
            I.B r0 = new I.B
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.f511l
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f513n
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            I.P r8 = r0.f508i
            M0.a.V(r10)
            goto L_0x00b8
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            I.P r8 = r0.f508i
            M0.a.V(r10)
            goto L_0x009e
        L_0x0041:
            boolean r9 = r0.f510k
            I.a0 r8 = r0.f509j
            I.P r2 = r0.f508i
            M0.a.V(r10)
            goto L_0x0070
        L_0x004b:
            M0.a.V(r10)
            B.m r10 = r8.f575m
            I.a0 r10 = r10.r()
            boolean r2 = r10 instanceof I.b0
            if (r2 != 0) goto L_0x00cf
            I.Z r2 = r8.f()
            r0.f508i = r8
            r0.f509j = r10
            r0.f510k = r9
            r0.f513n = r5
            java.lang.Integer r2 = r2.a()
            if (r2 != r1) goto L_0x006c
            goto L_0x00ce
        L_0x006c:
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L_0x0070:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            boolean r5 = r8 instanceof I.C0027c
            if (r5 == 0) goto L_0x007d
            int r6 = r8.f607a
            goto L_0x007e
        L_0x007d:
            r6 = -1
        L_0x007e:
            if (r5 == 0) goto L_0x0084
            if (r10 != r6) goto L_0x0084
            r1 = r8
            goto L_0x00ce
        L_0x0084:
            r8 = 0
            if (r9 == 0) goto L_0x00a1
            I.Z r9 = r2.f()
            I.C r10 = new I.C
            r10.<init>(r2, r8)
            r0.f508i = r2
            r0.f509j = r8
            r0.f513n = r4
            java.lang.Object r10 = r9.b(r10, r0)
            if (r10 != r1) goto L_0x009d
            goto L_0x00ce
        L_0x009d:
            r8 = r2
        L_0x009e:
            p2.c r10 = (p2.C0363c) r10
            goto L_0x00ba
        L_0x00a1:
            I.Z r9 = r2.f()
            I.D r10 = new I.D
            r10.<init>(r2, r6, r8)
            r0.f508i = r2
            r0.f509j = r8
            r0.f513n = r3
            java.lang.Object r10 = r9.c(r10, r0)
            if (r10 != r1) goto L_0x00b7
            goto L_0x00ce
        L_0x00b7:
            r8 = r2
        L_0x00b8:
            p2.c r10 = (p2.C0363c) r10
        L_0x00ba:
            java.lang.Object r9 = r10.f4187f
            r1 = r9
            I.a0 r1 = (I.a0) r1
            java.lang.Object r9 = r10.f4188g
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00ce
            B.m r8 = r8.f575m
            r8.s(r1)
        L_0x00ce:
            return r1
        L_0x00cf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I.P.d(I.P, boolean, r2.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, A2.q, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r9v14, types: [java.lang.Object, A2.o, java.io.Serializable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        r9 = r9.f86f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r9 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r3 = r9.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e8, code lost:
        if (r10 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ea, code lost:
        r3 = r10.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r2 = r8.f();
        r0.f522i = r8;
        r0.f523j = r10;
        r0.f526m = r9;
        r0.f527n = r3;
        r0.f530q = 2;
        r2 = r2.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0101, code lost:
        if (r2 != r1) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0104, code lost:
        r1 = r10;
        r10 = r2;
        r2 = r8;
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0127, code lost:
        r10 = ((java.lang.Number) r10).intValue();
        r2 = r8.f();
        r3 = new I.F(r8, r10, (r2.C0420d) null);
        r0.f522i = r8;
        r0.f526m = r9;
        r0.f530q = 4;
        r10 = r2.c(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0141, code lost:
        if (r10 != r1) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return (I.C0027c) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return new I.C0027c(r9, r3, r8.f84f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return new I.C0027c(r1, r8, ((java.lang.Number) r10).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(I.P r8, boolean r9, t2.C0484b r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof I.E
            if (r0 == 0) goto L_0x0016
            r0 = r10
            I.E r0 = (I.E) r0
            int r1 = r0.f530q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f530q = r1
            goto L_0x001b
        L_0x0016:
            I.E r0 = new I.E
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.f528o
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f530q
            r3 = 0
            r4 = 0
            switch(r2) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00b9;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a0;
                case 5: goto L_0x0040;
                case 6: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002e:
            java.io.Serializable r8 = r0.f524k
            A2.o r8 = (A2.o) r8
            java.lang.Object r9 = r0.f523j
            A2.q r9 = (A2.q) r9
            java.lang.Object r0 = r0.f522i
            I.b r0 = (I.C0026b) r0
            M0.a.V(r10)     // Catch:{ all -> 0x003e }
            goto L_0x0087
        L_0x003e:
            r8 = move-exception
            goto L_0x009c
        L_0x0040:
            boolean r8 = r0.f526m
            A2.q r9 = r0.f525l
            java.io.Serializable r2 = r0.f524k
            A2.q r2 = (A2.q) r2
            java.lang.Object r5 = r0.f523j
            I.b r5 = (I.C0026b) r5
            java.lang.Object r6 = r0.f522i
            I.P r6 = (I.P) r6
            M0.a.V(r10)
            r9.f86f = r10
            A2.o r9 = new A2.o
            r9.<init>()
            I.G r10 = new I.G     // Catch:{ all -> 0x009a }
            r10.<init>((A2.q) r2, (I.P) r6, (A2.o) r9, (r2.C0420d) r4)     // Catch:{ all -> 0x009a }
            r0.f522i = r5     // Catch:{ all -> 0x009a }
            r0.f523j = r2     // Catch:{ all -> 0x009a }
            r0.f524k = r9     // Catch:{ all -> 0x009a }
            r0.f525l = r4     // Catch:{ all -> 0x009a }
            r7 = 6
            r0.f530q = r7     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x0074
            r6.getClass()     // Catch:{ all -> 0x009a }
            java.lang.Object r8 = r10.j(r0)     // Catch:{ all -> 0x009a }
            goto L_0x0081
        L_0x0074:
            I.Z r8 = r6.f()     // Catch:{ all -> 0x009a }
            I.v r6 = new I.v     // Catch:{ all -> 0x009a }
            r6.<init>(r10, r4)     // Catch:{ all -> 0x009a }
            java.lang.Object r8 = r8.b(r6, r0)     // Catch:{ all -> 0x009a }
        L_0x0081:
            if (r8 != r1) goto L_0x0085
            goto L_0x0147
        L_0x0085:
            r8 = r9
            r9 = r2
        L_0x0087:
            I.c r1 = new I.c
            java.lang.Object r9 = r9.f86f
            if (r9 == 0) goto L_0x0091
            int r3 = r9.hashCode()
        L_0x0091:
            int r8 = r8.f84f
            r1.<init>(r9, r3, r8)
            goto L_0x0147
        L_0x0098:
            r0 = r5
            goto L_0x009c
        L_0x009a:
            r8 = move-exception
            goto L_0x0098
        L_0x009c:
            android.support.v4.media.session.a.c(r0, r8)
            throw r0
        L_0x00a0:
            boolean r9 = r0.f526m
            java.lang.Object r8 = r0.f522i
            I.P r8 = (I.P) r8
            M0.a.V(r10)     // Catch:{ b -> 0x00ab }
            goto L_0x0144
        L_0x00ab:
            r10 = move-exception
            goto L_0x0148
        L_0x00ae:
            boolean r9 = r0.f526m
            java.lang.Object r8 = r0.f522i
            I.P r8 = (I.P) r8
            M0.a.V(r10)     // Catch:{ b -> 0x00ab }
            goto L_0x0127
        L_0x00b9:
            int r8 = r0.f527n
            boolean r9 = r0.f526m
            java.lang.Object r1 = r0.f523j
            java.lang.Object r2 = r0.f522i
            I.P r2 = (I.P) r2
            M0.a.V(r10)     // Catch:{ b -> 0x00c7 }
            goto L_0x0108
        L_0x00c7:
            r10 = move-exception
            r8 = r2
            goto L_0x0148
        L_0x00cb:
            boolean r9 = r0.f526m
            java.lang.Object r8 = r0.f522i
            I.P r8 = (I.P) r8
            M0.a.V(r10)     // Catch:{ b -> 0x00ab }
            goto L_0x00e8
        L_0x00d5:
            M0.a.V(r10)
            if (r9 == 0) goto L_0x0115
            r0.f522i = r8     // Catch:{ b -> 0x00ab }
            r0.f526m = r9     // Catch:{ b -> 0x00ab }
            r10 = 1
            r0.f530q = r10     // Catch:{ b -> 0x00ab }
            java.lang.Object r10 = r8.h(r0)     // Catch:{ b -> 0x00ab }
            if (r10 != r1) goto L_0x00e8
            goto L_0x0147
        L_0x00e8:
            if (r10 == 0) goto L_0x00ee
            int r3 = r10.hashCode()     // Catch:{ b -> 0x00ab }
        L_0x00ee:
            I.Z r2 = r8.f()     // Catch:{ b -> 0x00ab }
            r0.f522i = r8     // Catch:{ b -> 0x00ab }
            r0.f523j = r10     // Catch:{ b -> 0x00ab }
            r0.f526m = r9     // Catch:{ b -> 0x00ab }
            r0.f527n = r3     // Catch:{ b -> 0x00ab }
            r4 = 2
            r0.f530q = r4     // Catch:{ b -> 0x00ab }
            java.lang.Integer r2 = r2.a()     // Catch:{ b -> 0x00ab }
            if (r2 != r1) goto L_0x0104
            goto L_0x0147
        L_0x0104:
            r1 = r10
            r10 = r2
            r2 = r8
            r8 = r3
        L_0x0108:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ b -> 0x00c7 }
            int r10 = r10.intValue()     // Catch:{ b -> 0x00c7 }
            I.c r3 = new I.c     // Catch:{ b -> 0x00c7 }
            r3.<init>(r1, r8, r10)     // Catch:{ b -> 0x00c7 }
            r1 = r3
            goto L_0x0147
        L_0x0115:
            I.Z r10 = r8.f()     // Catch:{ b -> 0x00ab }
            r0.f522i = r8     // Catch:{ b -> 0x00ab }
            r0.f526m = r9     // Catch:{ b -> 0x00ab }
            r2 = 3
            r0.f530q = r2     // Catch:{ b -> 0x00ab }
            java.lang.Integer r10 = r10.a()     // Catch:{ b -> 0x00ab }
            if (r10 != r1) goto L_0x0127
            goto L_0x0147
        L_0x0127:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ b -> 0x00ab }
            int r10 = r10.intValue()     // Catch:{ b -> 0x00ab }
            I.Z r2 = r8.f()     // Catch:{ b -> 0x00ab }
            I.F r3 = new I.F     // Catch:{ b -> 0x00ab }
            r3.<init>(r8, r10, r4)     // Catch:{ b -> 0x00ab }
            r0.f522i = r8     // Catch:{ b -> 0x00ab }
            r0.f526m = r9     // Catch:{ b -> 0x00ab }
            r10 = 4
            r0.f530q = r10     // Catch:{ b -> 0x00ab }
            java.lang.Object r10 = r2.c(r3, r0)     // Catch:{ b -> 0x00ab }
            if (r10 != r1) goto L_0x0144
            goto L_0x0147
        L_0x0144:
            I.c r10 = (I.C0027c) r10     // Catch:{ b -> 0x00ab }
            r1 = r10
        L_0x0147:
            return r1
        L_0x0148:
            A2.q r1 = new A2.q
            r1.<init>()
            j1.e r2 = r8.f569g
            r0.f522i = r8
            r0.f523j = r10
            r0.f524k = r1
            r0.f525l = r1
            r0.f526m = r9
            r8 = 5
            r0.f530q = r8
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: I.P.e(I.P, boolean, t2.b):java.lang.Object");
    }

    public final Z f() {
        return (Z) this.f578p.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(t2.C0484b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof I.A
            if (r0 == 0) goto L_0x0013
            r0 = r6
            I.A r0 = (I.A) r0
            int r1 = r0.f507m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f507m = r1
            goto L_0x0018
        L_0x0013:
            I.A r0 = new I.A
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f505k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f507m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r1 = r0.f504j
            I.P r0 = r0.f503i
            M0.a.V(r6)     // Catch:{ all -> 0x002e }
            goto L_0x0066
        L_0x002e:
            r6 = move-exception
            goto L_0x006f
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            I.P r2 = r0.f503i
            M0.a.V(r6)
            goto L_0x0051
        L_0x003e:
            M0.a.V(r6)
            I.Z r6 = r5.f()
            r0.f503i = r5
            r0.f507m = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r2 = r5
        L_0x0051:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            s1.y r4 = r2.f576n     // Catch:{ all -> 0x006d }
            r0.f503i = r2     // Catch:{ all -> 0x006d }
            r0.f504j = r6     // Catch:{ all -> 0x006d }
            r0.f507m = r3     // Catch:{ all -> 0x006d }
            java.lang.Object r6 = r4.j(r0)     // Catch:{ all -> 0x006d }
            if (r6 != r1) goto L_0x0066
            return r1
        L_0x0066:
            p2.h r6 = p2.C0368h.f4194a
            return r6
        L_0x0069:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L_0x006f
        L_0x006d:
            r0 = move-exception
            goto L_0x0069
        L_0x006f:
            B.m r0 = r0.f575m
            I.T r2 = new I.T
            r2.<init>(r6, r1)
            r0.s(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I.P.g(t2.b):java.lang.Object");
    }

    public final Object h(C0484b bVar) {
        return ((h) this.f577o.a()).a(new C0041q(3, (C0420d) null), bVar);
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Object, A2.o] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.Object r12, boolean r13, t2.C0484b r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof I.N
            if (r0 == 0) goto L_0x0013
            r0 = r14
            I.N r0 = (I.N) r0
            int r1 = r0.f560l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f560l = r1
            goto L_0x0018
        L_0x0013:
            I.N r0 = new I.N
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f558j
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f560l
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            A2.o r12 = r0.f557i
            M0.a.V(r14)
            goto L_0x0058
        L_0x0029:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0031:
            M0.a.V(r14)
            A2.o r14 = new A2.o
            r14.<init>()
            p2.f r2 = r11.f577o
            java.lang.Object r2 = r2.a()
            K.h r2 = (K.h) r2
            I.O r10 = new I.O
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f557i = r14
            r0.f560l = r3
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r12 = r14
        L_0x0058:
            int r12 = r12.f84f
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: I.P.i(java.lang.Object, boolean, t2.b):java.lang.Object");
    }

    public final Object l(p pVar, C0488f fVar) {
        C0425i iVar = fVar.f4684g;
        A2.i.b(iVar);
        d0 d0Var = (d0) iVar.n(c0.f611f);
        if (d0Var != null) {
            d0Var.f(this);
        }
        return C0071w.o(new d0(d0Var, this), new J(this, pVar, (C0420d) null), fVar);
    }

    public final L2.d o() {
        return this.f571i;
    }
}
