package K;

import B.m;
import I.C0025a;
import I.Z;
import Q2.d;
import Q2.e;
import R2.i;
import R2.l;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h implements C0025a {

    /* renamed from: a  reason: collision with root package name */
    public final i f839a;

    /* renamed from: b  reason: collision with root package name */
    public final l f840b;

    /* renamed from: c  reason: collision with root package name */
    public final Z f841c;

    /* renamed from: d  reason: collision with root package name */
    public final d f842d;

    /* renamed from: e  reason: collision with root package name */
    public final m f843e = new m(6);

    /* renamed from: f  reason: collision with root package name */
    public final d f844f = e.a();

    public h(i iVar, l lVar, Z z3, d dVar) {
        A2.i.e(iVar, "fileSystem");
        A2.i.e(lVar, "path");
        A2.i.e(z3, "coordinator");
        this.f839a = iVar;
        this.f840b = lVar;
        this.f841c = z3;
        this.f842d = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        android.support.v4.media.session.a.c(r10, r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:33:0x007e, B:38:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[SYNTHETIC, Splitter:B:33:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(I.C0041q r9, t2.C0484b r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof K.f
            if (r0 == 0) goto L_0x0013
            r0 = r10
            K.f r0 = (K.f) r0
            int r1 = r0.f831n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f831n = r1
            goto L_0x0018
        L_0x0013:
            K.f r0 = new K.f
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f829l
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f831n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            boolean r9 = r0.f828k
            K.b r1 = r0.f827j
            K.h r0 = r0.f826i
            M0.a.V(r10)     // Catch:{ all -> 0x002e }
            goto L_0x006e
        L_0x002e:
            r10 = move-exception
            goto L_0x0089
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            M0.a.V(r10)
            B.m r10 = r8.f843e
            java.lang.Object r10 = r10.f100g
            java.util.concurrent.atomic.AtomicBoolean r10 = (java.util.concurrent.atomic.AtomicBoolean) r10
            boolean r10 = r10.get()
            if (r10 != 0) goto L_0x00a1
            Q2.d r10 = r8.f844f
            boolean r10 = r10.d(r3)
            K.b r2 = new K.b     // Catch:{ all -> 0x0097 }
            R2.i r5 = r8.f839a     // Catch:{ all -> 0x0097 }
            R2.l r6 = r8.f840b     // Catch:{ all -> 0x0097 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0097 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0087 }
            r0.f826i = r8     // Catch:{ all -> 0x0087 }
            r0.f827j = r2     // Catch:{ all -> 0x0087 }
            r0.f828k = r10     // Catch:{ all -> 0x0087 }
            r0.f831n = r4     // Catch:{ all -> 0x0087 }
            java.lang.Object r9 = r9.p(r2, r5, r0)     // Catch:{ all -> 0x0087 }
            if (r9 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x006e:
            r1.close()     // Catch:{ all -> 0x0073 }
            r1 = r3
            goto L_0x0074
        L_0x0073:
            r1 = move-exception
        L_0x0074:
            if (r1 != 0) goto L_0x007e
            if (r9 == 0) goto L_0x007d
            Q2.d r9 = r0.f844f
            r9.e(r3)
        L_0x007d:
            return r10
        L_0x007e:
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r10 = move-exception
            goto L_0x0099
        L_0x0081:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0089
        L_0x0087:
            r9 = move-exception
            goto L_0x0081
        L_0x0089:
            r1.close()     // Catch:{ all -> 0x008d }
            goto L_0x0091
        L_0x008d:
            r1 = move-exception
            android.support.v4.media.session.a.c(r10, r1)     // Catch:{ all -> 0x007f }
        L_0x0091:
            throw r10     // Catch:{ all -> 0x007f }
        L_0x0092:
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0099
        L_0x0097:
            r9 = move-exception
            goto L_0x0092
        L_0x0099:
            if (r9 == 0) goto L_0x00a0
            Q2.d r9 = r0.f844f
            r9.e(r3)
        L_0x00a0:
            throw r10
        L_0x00a1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K.h.a(I.q, t2.b):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r10v26, types: [Q2.a] */
    /* JADX WARNING: type inference failed for: r3v6, types: [z2.p] */
    /* JADX WARNING: type inference failed for: r2v15, types: [Q2.a] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x015f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011c A[SYNTHETIC, Splitter:B:58:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013c A[SYNTHETIC, Splitter:B:68:0x013c] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(I.O r10, t2.C0484b r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof K.g
            if (r0 == 0) goto L_0x0013
            r0 = r11
            K.g r0 = (K.g) r0
            int r1 = r0.f838o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f838o = r1
            goto L_0x0018
        L_0x0013:
            K.g r0 = new K.g
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f836m
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f838o
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0056
            if (r2 == r3) goto L_0x0043
            if (r2 != r4) goto L_0x003b
            java.lang.Object r10 = r0.f835l
            I.a r10 = (I.C0025a) r10
            R2.l r1 = r0.f834k
            java.lang.Object r2 = r0.f833j
            Q2.a r2 = (Q2.a) r2
            K.h r0 = r0.f832i
            M0.a.V(r11)     // Catch:{ all -> 0x0038 }
            goto L_0x0114
        L_0x0038:
            r11 = move-exception
            goto L_0x0143
        L_0x003b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0043:
            java.lang.Object r10 = r0.f835l
            Q2.a r10 = (Q2.a) r10
            R2.l r2 = r0.f834k
            java.lang.Object r3 = r0.f833j
            z2.p r3 = (z2.p) r3
            K.h r6 = r0.f832i
            M0.a.V(r11)
            r11 = r10
            r10 = r3
            goto L_0x00da
        L_0x0056:
            M0.a.V(r11)
            B.m r11 = r9.f843e
            java.lang.Object r11 = r11.f100g
            java.util.concurrent.atomic.AtomicBoolean r11 = (java.util.concurrent.atomic.AtomicBoolean) r11
            boolean r11 = r11.get()
            if (r11 != 0) goto L_0x016e
            R2.l r11 = r9.f840b
            R2.l r2 = r11.c()
            if (r2 == 0) goto L_0x0166
            R2.i r11 = r9.f839a
            r11.getClass()
            q2.b r6 = new q2.b
            r6.<init>()
            r7 = r2
        L_0x0078:
            if (r7 == 0) goto L_0x0088
            boolean r8 = r11.a(r7)
            if (r8 != 0) goto L_0x0088
            r6.addFirst(r7)
            R2.l r7 = r7.c()
            goto L_0x0078
        L_0x0088:
            java.util.Iterator r6 = r6.iterator()
        L_0x008c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c6
            java.lang.Object r7 = r6.next()
            R2.l r7 = (R2.l) r7
            java.lang.String r8 = "dir"
            A2.i.e(r7, r8)
            java.io.File r8 = r7.e()
            boolean r8 = r8.mkdir()
            if (r8 != 0) goto L_0x008c
            R2.e r8 = r11.b(r7)
            if (r8 == 0) goto L_0x00b2
            boolean r8 = r8.f1379b
            if (r8 != r3) goto L_0x00b2
            goto L_0x008c
        L_0x00b2:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "failed to create directory: "
            r11.<init>(r0)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00c6:
            r0.f832i = r9
            r0.f833j = r10
            r0.f834k = r2
            Q2.d r11 = r9.f844f
            r0.f835l = r11
            r0.f838o = r3
            java.lang.Object r3 = r11.c(r0)
            if (r3 != r1) goto L_0x00d9
            return r1
        L_0x00d9:
            r6 = r9
        L_0x00da:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x014c }
            r3.<init>()     // Catch:{ all -> 0x014c }
            R2.l r7 = r6.f840b     // Catch:{ all -> 0x014c }
            R2.i r8 = r6.f839a
            java.lang.String r7 = r7.b()     // Catch:{ all -> 0x014c }
            r3.append(r7)     // Catch:{ all -> 0x014c }
            java.lang.String r7 = ".tmp"
            r3.append(r7)     // Catch:{ all -> 0x014c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x014c }
            R2.l r2 = r2.d(r3)     // Catch:{ all -> 0x014c }
            r8.d(r2)     // Catch:{ IOException -> 0x014e }
            K.j r3 = new K.j     // Catch:{ IOException -> 0x014e }
            r3.<init>(r8, r2)     // Catch:{ IOException -> 0x014e }
            r0.f832i = r6     // Catch:{ all -> 0x013d }
            r0.f833j = r11     // Catch:{ all -> 0x013d }
            r0.f834k = r2     // Catch:{ all -> 0x013d }
            r0.f835l = r3     // Catch:{ all -> 0x013d }
            r0.f838o = r4     // Catch:{ all -> 0x013d }
            java.lang.Object r10 = r10.i(r3, r0)     // Catch:{ all -> 0x013d }
            if (r10 != r1) goto L_0x0110
            return r1
        L_0x0110:
            r1 = r2
            r10 = r3
            r0 = r6
            r2 = r11
        L_0x0114:
            r10.close()     // Catch:{ all -> 0x0119 }
            r10 = r5
            goto L_0x011a
        L_0x0119:
            r10 = move-exception
        L_0x011a:
            if (r10 != 0) goto L_0x013c
            R2.i r10 = r0.f839a     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            boolean r10 = r10.a(r1)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            if (r10 == 0) goto L_0x0134
            R2.i r10 = r0.f839a     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            R2.l r11 = r0.f840b     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r10.c(r1, r11)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            goto L_0x0134
        L_0x012c:
            r10 = move-exception
            r11 = r2
            goto L_0x0160
        L_0x012f:
            r10 = move-exception
            r6 = r0
            r11 = r2
            r2 = r1
            goto L_0x014f
        L_0x0134:
            Q2.d r2 = (Q2.d) r2
            r2.e(r5)
            p2.h r10 = p2.C0368h.f4194a
            return r10
        L_0x013c:
            throw r10     // Catch:{ IOException -> 0x012f, all -> 0x012c }
        L_0x013d:
            r10 = move-exception
            r1 = r2
            r0 = r6
            r2 = r11
            r11 = r10
            r10 = r3
        L_0x0143:
            r10.close()     // Catch:{ all -> 0x0147 }
            goto L_0x014b
        L_0x0147:
            r10 = move-exception
            android.support.v4.media.session.a.c(r11, r10)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
        L_0x014b:
            throw r11     // Catch:{ IOException -> 0x012f, all -> 0x012c }
        L_0x014c:
            r10 = move-exception
            goto L_0x0160
        L_0x014e:
            r10 = move-exception
        L_0x014f:
            R2.i r0 = r6.f839a     // Catch:{ all -> 0x014c }
            boolean r0 = r0.a(r2)     // Catch:{ all -> 0x014c }
            if (r0 == 0) goto L_0x015f
            R2.i r0 = r6.f839a     // Catch:{ IOException -> 0x015f }
            r0.getClass()     // Catch:{ IOException -> 0x015f }
            r0.d(r2)     // Catch:{ IOException -> 0x015f }
        L_0x015f:
            throw r10     // Catch:{ all -> 0x014c }
        L_0x0160:
            Q2.d r11 = (Q2.d) r11
            r11.e(r5)
            throw r10
        L_0x0166:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "must have a parent path"
            r10.<init>(r11)
            throw r10
        L_0x016e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "StorageConnection has already been disposed."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: K.h.b(I.O, t2.b):java.lang.Object");
    }

    public final void close() {
        ((AtomicBoolean) this.f843e.f100g).set(true);
        this.f842d.a();
    }
}
