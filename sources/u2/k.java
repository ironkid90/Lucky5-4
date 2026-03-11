package U2;

import I2.C0069u;
import V2.d;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

public final class k extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d f1816j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l f1817k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ l f1818l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f1819m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(d dVar, l lVar, l lVar2, long j3, C0420d dVar2) {
        super(2, dVar2);
        this.f1816j = dVar;
        this.f1817k = lVar;
        this.f1818l = lVar2;
        this.f1819m = j3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new k(this.f1816j, this.f1817k, this.f1818l, this.f1819m, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        C0368h hVar = C0368h.f4194a;
        ((k) c((C0069u) obj, (C0420d) obj2)).l(hVar);
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        M0.a.e(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        M0.a.e(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r11) {
        /*
            r10 = this;
            M0.a.V(r11)
            V2.d r11 = r10.f1816j
            boolean r0 = r11.f1874b
            java.lang.String r11 = r11.f1873a
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "file://"
            boolean r0 = r11.startsWith(r0)
            if (r0 == 0) goto L_0x001d
            r0 = 7
            java.lang.String r11 = r11.substring(r0)
            java.lang.String r0 = "substring(...)"
            A2.i.d(r11, r0)
        L_0x001d:
            r3 = r11
            goto L_0x007f
        L_0x001f:
            java.net.URI r11 = java.net.URI.create(r11)
            java.net.URL r11 = r11.toURL()
            java.lang.String r0 = "toURL(...)"
            A2.i.d(r11, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.InputStream r11 = r11.openStream()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0051 }
        L_0x0039:
            int r2 = r11.read(r1)     // Catch:{ all -> 0x0051 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0051 }
            r4 = 0
            if (r2 <= 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r3 = r4
        L_0x0046:
            if (r3 == 0) goto L_0x0053
            int r2 = r3.intValue()     // Catch:{ all -> 0x0051 }
            r3 = 0
            r0.write(r1, r3, r2)     // Catch:{ all -> 0x0051 }
            goto L_0x0039
        L_0x0051:
            r0 = move-exception
            goto L_0x00a2
        L_0x0053:
            M0.a.e(r11, r4)
            byte[] r11 = r0.toByteArray()
            java.lang.String r0 = "toByteArray(...)"
            A2.i.d(r11, r0)
            java.lang.String r0 = "sound"
            java.lang.String r1 = ""
            java.io.File r0 = java.io.File.createTempFile(r0, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r1.write(r11)     // Catch:{ all -> 0x009b }
            r0.deleteOnExit()     // Catch:{ all -> 0x009b }
            M0.a.e(r1, r4)
            java.lang.String r11 = r0.getAbsolutePath()
            java.lang.String r0 = "getAbsolutePath(...)"
            A2.i.d(r11, r0)
            goto L_0x001d
        L_0x007f:
            U2.l r2 = r10.f1817k
            N2.e r11 = r2.f1822h
            P2.d r0 = I2.C.f715a
            J2.c r0 = N2.o.f1214a
            U2.j r9 = new U2.j
            U2.l r4 = r10.f1818l
            V2.d r5 = r10.f1816j
            long r6 = r10.f1819m
            r8 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r8)
            r1 = 2
            I2.C0071w.h(r11, r0, r9, r1)
            p2.h r11 = p2.C0368h.f4194a
            return r11
        L_0x009b:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            M0.a.e(r1, r11)
            throw r0
        L_0x00a2:
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            M0.a.e(r11, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.k.l(java.lang.Object):java.lang.Object");
    }
}
