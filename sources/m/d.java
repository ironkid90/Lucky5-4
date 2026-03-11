package M;

import A2.j;
import z2.a;

public final class d extends j implements a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f1076g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f1077h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, Object obj) {
        super(0);
        this.f1076g = i3;
        this.f1077h = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02fe A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r31 = this;
            r1 = r31
            r0 = -1
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Object r5 = r1.f1077h
            int r6 = r1.f1076g
            switch(r6) {
                case 0: goto L_0x036d;
                case 1: goto L_0x008b;
                case 2: goto L_0x0044;
                case 3: goto L_0x001a;
                default: goto L_0x000d;
            }
        L_0x000d:
            N.e r5 = (N.e) r5
            r5.getClass()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Can't access ViewModels from detached fragment"
            r0.<init>(r2)
            throw r0
        L_0x001a:
            a0.i r5 = (a0.i) r5
            int r0 = r5.f1991f
            long r2 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r2)
            r2 = 32
            java.math.BigInteger r0 = r0.shiftLeft(r2)
            int r3 = r5.f1992g
            long r3 = (long) r3
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r0 = r0.or(r3)
            java.math.BigInteger r0 = r0.shiftLeft(r2)
            int r2 = r5.f1993h
            long r2 = (long) r2
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r0 = r0.or(r2)
            return r0
        L_0x0044:
            B.m r5 = (B.m) r5
            java.lang.Object r0 = r5.f100g
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.String r2 = "androidx.window.extensions.WindowExtensionsProvider"
            java.lang.Class r0 = r0.loadClass(r2)
            java.lang.String r2 = "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)"
            A2.i.d(r0, r2)
            java.lang.String r2 = "getWindowExtensions"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)
            java.lang.Object r2 = r5.f100g
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
            java.lang.String r3 = "androidx.window.extensions.WindowExtensions"
            java.lang.Class r2 = r2.loadClass(r3)
            java.lang.String r3 = "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)"
            A2.i.d(r2, r3)
            java.lang.String r3 = "getWindowExtensionsMethod"
            A2.i.d(r0, r3)
            java.lang.Class r3 = r0.getReturnType()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0085
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x0085
            r4 = 1
            goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x008b:
            R2.l r6 = S2.c.f1533c
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5
            java.util.Enumeration r2 = r5.getResources(r2)
            java.lang.String r6 = "getResources(\"\")"
            A2.i.d(r2, r6)
            java.util.ArrayList r2 = java.util.Collections.list(r2)
            java.lang.String r6 = "list(this)"
            A2.i.d(r2, r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00aa:
            boolean r8 = r2.hasNext()
            java.lang.String r9 = "it"
            if (r8 == 0) goto L_0x00e7
            java.lang.Object r8 = r2.next()
            java.net.URL r8 = (java.net.URL) r8
            R2.l r10 = S2.c.f1533c
            A2.i.d(r8, r9)
            java.lang.String r9 = r8.getProtocol()
            java.lang.String r10 = "file"
            boolean r9 = A2.i.a(r9, r10)
            if (r9 != 0) goto L_0x00cb
            r10 = r3
            goto L_0x00e1
        L_0x00cb:
            R2.i r9 = R2.f.f1385a
            java.lang.String r10 = R2.l.f1393g
            java.io.File r10 = new java.io.File
            java.net.URI r8 = r8.toURI()
            r10.<init>(r8)
            R2.l r8 = j1.e.c(r10)
            p2.c r10 = new p2.c
            r10.<init>(r9, r8)
        L_0x00e1:
            if (r10 == 0) goto L_0x00aa
            r7.add(r10)
            goto L_0x00aa
        L_0x00e7:
            java.lang.String r2 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r2 = r5.getResources(r2)
            java.lang.String r5 = "getResources(\"META-INF/MANIFEST.MF\")"
            A2.i.d(r2, r5)
            java.util.ArrayList r2 = java.util.Collections.list(r2)
            A2.i.d(r2, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0102:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0358
            java.lang.Object r6 = r2.next()
            java.net.URL r6 = (java.net.URL) r6
            R2.l r8 = S2.c.f1533c
            A2.i.d(r6, r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "toString()"
            A2.i.d(r6, r8)
            java.lang.String r8 = "jar:file:"
            boolean r8 = r6.startsWith(r8)
            if (r8 != 0) goto L_0x012c
        L_0x0124:
            r24 = r2
            r0 = r3
            r18 = r9
            r9 = r0
            goto L_0x02f9
        L_0x012c:
            java.lang.String r8 = "!"
            int r10 = H2.l.c0(r6)
            java.lang.String r11 = "<this>"
            A2.i.e(r6, r11)
            int r8 = r6.lastIndexOf(r8, r10)
            if (r8 != r0) goto L_0x013e
            goto L_0x0124
        L_0x013e:
            java.lang.String r10 = R2.l.f1393g
            java.io.File r10 = new java.io.File
            r11 = 4
            java.lang.String r6 = r6.substring(r11, r8)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            A2.i.d(r6, r8)
            java.net.URI r6 = java.net.URI.create(r6)
            r10.<init>(r6)
            R2.l r6 = j1.e.c(r10)
            R2.i r8 = R2.f.f1385a
            java.lang.String r10 = "not a zip: size="
            java.lang.String r11 = "fileSystem"
            A2.i.e(r8, r11)
            R2.h r11 = r8.e(r6)
            long r12 = r11.c()     // Catch:{ all -> 0x0294 }
            r14 = 22
            long r14 = (long) r14     // Catch:{ all -> 0x0294 }
            long r12 = r12 - r14
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x033b
            r16 = 65536(0x10000, double:3.2379E-319)
            long r0 = r12 - r16
            long r0 = java.lang.Math.max(r0, r14)     // Catch:{ all -> 0x0294 }
        L_0x017b:
            R2.d r10 = r11.d(r12)     // Catch:{ all -> 0x0294 }
            R2.p r10 = M0.a.a(r10)     // Catch:{ all -> 0x0294 }
            int r3 = r10.a()     // Catch:{ all -> 0x030f }
            r4 = 101010256(0x6054b50, float:2.506985E-35)
            if (r3 != r4) goto L_0x0317
            short r0 = r10.c()     // Catch:{ all -> 0x030f }
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r3 = r10.c()     // Catch:{ all -> 0x030f }
            r3 = r3 & r1
            short r4 = r10.c()     // Catch:{ all -> 0x030f }
            r4 = r4 & r1
            long r14 = (long) r4     // Catch:{ all -> 0x030f }
            short r4 = r10.c()     // Catch:{ all -> 0x030f }
            r4 = r4 & r1
            r24 = r2
            long r1 = (long) r4
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            java.lang.String r2 = "unsupported zip: spanned"
            if (r1 != 0) goto L_0x0311
            if (r0 != 0) goto L_0x0311
            if (r3 != 0) goto L_0x0311
            r0 = 4
            r10.g(r0)     // Catch:{ all -> 0x030f }
            int r0 = r10.a()     // Catch:{ all -> 0x030f }
            long r0 = (long) r0     // Catch:{ all -> 0x030f }
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r21 = r0 & r3
            short r0 = r10.c()     // Catch:{ all -> 0x030f }
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            S1.y r1 = new S1.y     // Catch:{ all -> 0x030f }
            r18 = r1
            r19 = r14
            r23 = r0
            r18.<init>(r19, r21, r23)     // Catch:{ all -> 0x030f }
            long r3 = (long) r0     // Catch:{ all -> 0x030f }
            r10.d(r3)     // Catch:{ all -> 0x030f }
            r10.close()     // Catch:{ all -> 0x0294 }
            r3 = 20
            long r3 = (long) r3     // Catch:{ all -> 0x0294 }
            long r12 = r12 - r3
            r3 = 0
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x029f
            R2.d r10 = r11.d(r12)     // Catch:{ all -> 0x0294 }
            R2.p r10 = M0.a.a(r10)     // Catch:{ all -> 0x0294 }
            int r12 = r10.a()     // Catch:{ all -> 0x024f }
            r13 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r12 != r13) goto L_0x024d
            int r1 = r10.a()     // Catch:{ all -> 0x024f }
            long r12 = r10.b()     // Catch:{ all -> 0x024f }
            int r14 = r10.a()     // Catch:{ all -> 0x024f }
            r15 = 1
            if (r14 != r15) goto L_0x028a
            if (r1 != 0) goto L_0x028a
            R2.d r1 = r11.d(r12)     // Catch:{ all -> 0x024f }
            R2.p r1 = M0.a.a(r1)     // Catch:{ all -> 0x024f }
            int r12 = r1.a()     // Catch:{ all -> 0x0281 }
            r13 = 101075792(0x6064b50, float:2.525793E-35)
            if (r12 != r13) goto L_0x025a
            r12 = 12
            r1.g(r12)     // Catch:{ all -> 0x0281 }
            int r12 = r1.a()     // Catch:{ all -> 0x0281 }
            int r13 = r1.a()     // Catch:{ all -> 0x0281 }
            long r26 = r1.b()     // Catch:{ all -> 0x0281 }
            long r14 = r1.b()     // Catch:{ all -> 0x0281 }
            int r14 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r14 != 0) goto L_0x0252
            if (r12 != 0) goto L_0x0252
            if (r13 != 0) goto L_0x0252
            r12 = 8
            r1.g(r12)     // Catch:{ all -> 0x0281 }
            long r28 = r1.b()     // Catch:{ all -> 0x0281 }
            S1.y r2 = new S1.y     // Catch:{ all -> 0x0281 }
            r25 = r2
            r30 = r0
            r25.<init>(r26, r28, r30)     // Catch:{ all -> 0x0281 }
            r0 = 0
            M0.a.e(r1, r0)     // Catch:{ all -> 0x024f }
            r1 = r2
        L_0x024d:
            r0 = 0
            goto L_0x0290
        L_0x024f:
            r0 = move-exception
            r1 = r0
            goto L_0x0298
        L_0x0252:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0281 }
            r0.<init>(r2)     // Catch:{ all -> 0x0281 }
            throw r0     // Catch:{ all -> 0x0281 }
        L_0x0258:
            r2 = r0
            goto L_0x0283
        L_0x025a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0281 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0281 }
            r2.<init>()     // Catch:{ all -> 0x0281 }
            java.lang.String r3 = "bad zip: expected "
            r2.append(r3)     // Catch:{ all -> 0x0281 }
            java.lang.String r3 = S2.a.b(r13)     // Catch:{ all -> 0x0281 }
            r2.append(r3)     // Catch:{ all -> 0x0281 }
            java.lang.String r3 = " but was "
            r2.append(r3)     // Catch:{ all -> 0x0281 }
            java.lang.String r3 = S2.a.b(r12)     // Catch:{ all -> 0x0281 }
            r2.append(r3)     // Catch:{ all -> 0x0281 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0281 }
            r0.<init>(r2)     // Catch:{ all -> 0x0281 }
            throw r0     // Catch:{ all -> 0x0281 }
        L_0x0281:
            r0 = move-exception
            goto L_0x0258
        L_0x0283:
            throw r2     // Catch:{ all -> 0x0284 }
        L_0x0284:
            r0 = move-exception
            r3 = r0
            M0.a.e(r1, r2)     // Catch:{ all -> 0x024f }
            throw r3     // Catch:{ all -> 0x024f }
        L_0x028a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x024f }
            r0.<init>(r2)     // Catch:{ all -> 0x024f }
            throw r0     // Catch:{ all -> 0x024f }
        L_0x0290:
            M0.a.e(r10, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x029f
        L_0x0294:
            r0 = move-exception
            r1 = r0
            goto L_0x0351
        L_0x0298:
            throw r1     // Catch:{ all -> 0x0299 }
        L_0x0299:
            r0 = move-exception
            r2 = r0
            M0.a.e(r10, r1)     // Catch:{ all -> 0x0294 }
            throw r2     // Catch:{ all -> 0x0294 }
        L_0x029f:
            long r12 = r1.f1525b     // Catch:{ all -> 0x0294 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0294 }
            r0.<init>()     // Catch:{ all -> 0x0294 }
            R2.d r2 = r11.d(r12)     // Catch:{ all -> 0x0294 }
            R2.p r2 = M0.a.a(r2)     // Catch:{ all -> 0x0294 }
            long r14 = r1.f1524a     // Catch:{ all -> 0x02ce }
        L_0x02b0:
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x02df
            S2.d r1 = S2.a.c(r2)     // Catch:{ all -> 0x02ce }
            r18 = r9
            long r9 = r1.f1539e     // Catch:{ all -> 0x02ce }
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x02d7
            R2.l r9 = S2.c.f1533c     // Catch:{ all -> 0x02ce }
            R2.l r9 = r1.f1535a     // Catch:{ all -> 0x02ce }
            boolean r9 = D0.g.e(r9)     // Catch:{ all -> 0x02ce }
            if (r9 == 0) goto L_0x02d1
            r0.add(r1)     // Catch:{ all -> 0x02ce }
            goto L_0x02d1
        L_0x02ce:
            r0 = move-exception
            r1 = r0
            goto L_0x0308
        L_0x02d1:
            r9 = 1
            long r3 = r3 + r9
            r9 = r18
            goto L_0x02b0
        L_0x02d7:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x02ce }
            java.lang.String r1 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r1)     // Catch:{ all -> 0x02ce }
            throw r0     // Catch:{ all -> 0x02ce }
        L_0x02df:
            r18 = r9
            r9 = 0
            M0.a.e(r2, r9)     // Catch:{ all -> 0x0294 }
            java.util.LinkedHashMap r0 = S2.a.a(r0)     // Catch:{ all -> 0x0294 }
            R2.u r1 = new R2.u     // Catch:{ all -> 0x0294 }
            r1.<init>(r6, r8, r0)     // Catch:{ all -> 0x0294 }
            M0.a.e(r11, r9)
            R2.l r0 = S2.c.f1533c
            p2.c r2 = new p2.c
            r2.<init>(r1, r0)
            r0 = r2
        L_0x02f9:
            if (r0 == 0) goto L_0x02fe
            r5.add(r0)
        L_0x02fe:
            r1 = r31
            r3 = r9
            r9 = r18
            r2 = r24
            r0 = -1
            goto L_0x0102
        L_0x0308:
            throw r1     // Catch:{ all -> 0x0309 }
        L_0x0309:
            r0 = move-exception
            r3 = r0
            M0.a.e(r2, r1)     // Catch:{ all -> 0x0294 }
            throw r3     // Catch:{ all -> 0x0294 }
        L_0x030f:
            r0 = move-exception
            goto L_0x0337
        L_0x0311:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x030f }
            r0.<init>(r2)     // Catch:{ all -> 0x030f }
            throw r0     // Catch:{ all -> 0x030f }
        L_0x0317:
            r24 = r2
            r18 = r9
            r3 = r14
            r9 = 0
            r10.close()     // Catch:{ all -> 0x0294 }
            r14 = -1
            long r12 = r12 + r14
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x032f
            r14 = r3
            r3 = r9
            r9 = r18
            r2 = r24
            goto L_0x017b
        L_0x032f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0294 }
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch:{ all -> 0x0294 }
            throw r0     // Catch:{ all -> 0x0294 }
        L_0x0337:
            r10.close()     // Catch:{ all -> 0x0294 }
            throw r0     // Catch:{ all -> 0x0294 }
        L_0x033b:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0294 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0294 }
            r1.<init>(r10)     // Catch:{ all -> 0x0294 }
            long r2 = r11.c()     // Catch:{ all -> 0x0294 }
            r1.append(r2)     // Catch:{ all -> 0x0294 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0294 }
            r0.<init>(r1)     // Catch:{ all -> 0x0294 }
            throw r0     // Catch:{ all -> 0x0294 }
        L_0x0351:
            throw r1     // Catch:{ all -> 0x0352 }
        L_0x0352:
            r0 = move-exception
            r2 = r0
            M0.a.e(r11, r1)
            throw r2
        L_0x0358:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            int r2 = r5.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            r0.addAll(r7)
            r0.addAll(r5)
            return r0
        L_0x036d:
            L.b r5 = (L.b) r5
            java.lang.Object r0 = r5.a()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r3 = "getName(...)"
            A2.i.d(r1, r3)
            int r3 = H2.l.c0(r1)
            r4 = 46
            int r3 = r1.lastIndexOf(r4, r3)
            r4 = -1
            if (r3 != r4) goto L_0x038c
            goto L_0x039b
        L_0x038c:
            r2 = 1
            int r3 = r3 + r2
            int r2 = r1.length()
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.String r1 = "substring(...)"
            A2.i.d(r2, r1)
        L_0x039b:
            java.lang.String r1 = "preferences_pb"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03b3
            java.lang.String r1 = R2.l.f1393g
            java.io.File r0 = r0.getAbsoluteFile()
            java.lang.String r1 = "file.absoluteFile"
            A2.i.d(r0, r1)
            R2.l r0 = j1.e.c(r0)
            return r0
        L_0x03b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "File extension for file: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " does not match required extension for Preferences file: preferences_pb"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M.d.a():java.lang.Object");
    }
}
