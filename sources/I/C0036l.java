package I;

import java.io.Serializable;
import java.util.Iterator;
import p2.C0368h;
import r2.C0420d;
import s1.C0464y;
import t2.C0488f;
import z2.l;

/* renamed from: I.l  reason: case insensitive filesystem */
public final class C0036l extends C0488f implements l {

    /* renamed from: j  reason: collision with root package name */
    public Object f644j;

    /* renamed from: k  reason: collision with root package name */
    public Serializable f645k;

    /* renamed from: l  reason: collision with root package name */
    public Object f646l;

    /* renamed from: m  reason: collision with root package name */
    public Object f647m;

    /* renamed from: n  reason: collision with root package name */
    public Iterator f648n;

    /* renamed from: o  reason: collision with root package name */
    public int f649o;

    /* renamed from: p  reason: collision with root package name */
    public int f650p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ P f651q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0464y f652r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0036l(P p3, C0464y yVar, C0420d dVar) {
        super(1, dVar);
        this.f651q = p3;
        this.f652r = yVar;
    }

    public final Object j(Object obj) {
        return new C0036l(this.f651q, this.f652r, (C0420d) obj).l(C0368h.f4194a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: A2.q} */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0100 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r14) {
        /*
            r13 = this;
            s2.a r0 = s2.C0466a.f4632f
            int r1 = r13.f650p
            s1.y r2 = r13.f652r
            r3 = 4
            r4 = 3
            r5 = 2
            I.P r6 = r13.f651q
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0063
            if (r1 == r7) goto L_0x004f
            if (r1 == r5) goto L_0x0039
            if (r1 == r4) goto L_0x0028
            if (r1 != r3) goto L_0x0020
            int r0 = r13.f649o
            java.lang.Object r1 = r13.f644j
            M0.a.V(r14)
            goto L_0x0103
        L_0x0020:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0028:
            java.lang.Object r1 = r13.f646l
            Q2.a r1 = (Q2.a) r1
            java.io.Serializable r2 = r13.f645k
            A2.q r2 = (A2.q) r2
            java.lang.Object r4 = r13.f644j
            A2.n r4 = (A2.n) r4
            M0.a.V(r14)
            goto L_0x00db
        L_0x0039:
            java.util.Iterator r1 = r13.f648n
            java.lang.Object r9 = r13.f647m
            I.k r9 = (I.C0035k) r9
            java.lang.Object r10 = r13.f646l
            A2.q r10 = (A2.q) r10
            java.io.Serializable r11 = r13.f645k
            A2.n r11 = (A2.n) r11
            java.lang.Object r12 = r13.f644j
            Q2.a r12 = (Q2.a) r12
            M0.a.V(r14)
            goto L_0x009f
        L_0x004f:
            java.lang.Object r1 = r13.f647m
            A2.q r1 = (A2.q) r1
            java.lang.Object r9 = r13.f646l
            A2.q r9 = (A2.q) r9
            java.io.Serializable r10 = r13.f645k
            A2.n r10 = (A2.n) r10
            java.lang.Object r11 = r13.f644j
            Q2.a r11 = (Q2.a) r11
            M0.a.V(r14)
            goto L_0x0086
        L_0x0063:
            M0.a.V(r14)
            Q2.d r11 = Q2.e.a()
            A2.n r10 = new A2.n
            r10.<init>()
            A2.q r1 = new A2.q
            r1.<init>()
            r13.f644j = r11
            r13.f645k = r10
            r13.f646l = r1
            r13.f647m = r1
            r13.f650p = r7
            java.lang.Object r14 = I.P.e(r6, r7, r13)
            if (r14 != r0) goto L_0x0085
            return r0
        L_0x0085:
            r9 = r1
        L_0x0086:
            I.c r14 = (I.C0027c) r14
            java.lang.Object r14 = r14.f609b
            r1.f86f = r14
            I.k r14 = new I.k
            r14.<init>(r11, r10, r9, r6)
            java.lang.Object r1 = r2.f4624h
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00c1
            java.util.Iterator r1 = r1.iterator()
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r14
        L_0x009f:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x00be
            java.lang.Object r14 = r1.next()
            z2.p r14 = (z2.p) r14
            r13.f644j = r12
            r13.f645k = r11
            r13.f646l = r10
            r13.f647m = r9
            r13.f648n = r1
            r13.f650p = r5
            java.lang.Object r14 = r14.i(r9, r13)
            if (r14 != r0) goto L_0x009f
            return r0
        L_0x00be:
            r9 = r10
            r10 = r11
            r11 = r12
        L_0x00c1:
            r2.f4624h = r8
            r13.f644j = r10
            r13.f645k = r9
            r13.f646l = r11
            r13.f647m = r8
            r13.f648n = r8
            r13.f650p = r4
            r1 = r11
            Q2.d r1 = (Q2.d) r1
            java.lang.Object r14 = r1.c(r13)
            if (r14 != r0) goto L_0x00d9
            return r0
        L_0x00d9:
            r2 = r9
            r4 = r10
        L_0x00db:
            r4.f83f = r7     // Catch:{ all -> 0x010f }
            Q2.d r1 = (Q2.d) r1
            r1.e(r8)
            java.lang.Object r1 = r2.f86f
            if (r1 == 0) goto L_0x00eb
            int r14 = r1.hashCode()
            goto L_0x00ec
        L_0x00eb:
            r14 = 0
        L_0x00ec:
            I.Z r2 = r6.f()
            r13.f644j = r1
            r13.f645k = r8
            r13.f646l = r8
            r13.f649o = r14
            r13.f650p = r3
            java.lang.Integer r2 = r2.a()
            if (r2 != r0) goto L_0x0101
            return r0
        L_0x0101:
            r0 = r14
            r14 = r2
        L_0x0103:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            I.c r2 = new I.c
            r2.<init>(r1, r0, r14)
            return r2
        L_0x010f:
            r14 = move-exception
            Q2.d r1 = (Q2.d) r1
            r1.e(r8)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0036l.l(java.lang.Object):java.lang.Object");
    }
}
