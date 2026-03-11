package T2;

import A2.g;
import z2.p;

public final /* synthetic */ class c extends g implements p {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f1737n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, obj, cls, str, str2, i4);
        this.f1737n = i5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x042c, code lost:
        r13.b(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d6, code lost:
        r15.b(1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.Object r19, java.lang.Object r20) {
        /*
            r18 = this;
            r1 = r18
            p2.h r2 = p2.C0368h.f4194a
            java.lang.String r0 = "emitLog"
            java.lang.String r3 = "code is required"
            r4 = 0
            java.lang.String r5 = "code"
            java.lang.String r6 = "emitError"
            java.lang.String r7 = "setAudioContext"
            java.lang.String r8 = "message"
            java.lang.String r9 = "message is required"
            java.lang.Object r10 = r1.f70g
            java.lang.String r11 = "p1"
            java.lang.String r12 = "p0"
            r14 = 1
            int r15 = r1.f1737n
            switch(r15) {
                case 0: goto L_0x00e8;
                default: goto L_0x001f;
            }
        L_0x001f:
            r13 = r19
            c2.m r13 = (c2.m) r13
            r15 = r20
            c2.p r15 = (c2.p) r15
            A2.i.e(r13, r12)
            A2.i.e(r15, r11)
            T2.d r10 = (T2.d) r10
            r10.getClass()
            java.lang.String r11 = r13.f2785a
            if (r11 == 0) goto L_0x00e4
            int r12 = r11.hashCode()
            switch(r12) {
                case -1630329231: goto L_0x00c4;
                case 3237136: goto L_0x0093;
                case 910310901: goto L_0x0061;
                case 1902436987: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x00e4
        L_0x003f:
            boolean r0 = r11.equals(r7)
            if (r0 != 0) goto L_0x0047
            goto L_0x00e4
        L_0x0047:
            android.media.AudioManager r0 = r10.a()
            T2.a r3 = r10.f1743k
            int r3 = r3.f1734f
            r0.setMode(r3)
            T2.a r3 = r10.f1743k
            boolean r3 = r3.f1729a
            r0.setSpeakerphoneOn(r3)
            T2.a r0 = android.support.v4.media.session.a.a(r13)
            r10.f1743k = r0
            goto L_0x00d6
        L_0x0061:
            boolean r0 = r11.equals(r6)
            if (r0 != 0) goto L_0x0069
            goto L_0x00e4
        L_0x0069:
            java.lang.Object r0 = r13.a(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x008d
            java.lang.Object r3 = r13.a(r8)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0087
            C0.r r5 = r10.f1738f
            if (r5 == 0) goto L_0x0081
            r5.F(r0, r3, r4)
            goto L_0x00d6
        L_0x0081:
            java.lang.String r0 = "globalEvents"
            A2.i.g(r0)
            throw r4
        L_0x0087:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x008d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0093:
            java.lang.String r0 = "init"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x009c
            goto L_0x00e4
        L_0x009c:
            java.util.concurrent.ConcurrentHashMap r0 = r10.f1742j
            java.util.Collection r3 = r0.values()
            java.lang.String r4 = "<get-values>(...)"
            A2.i.d(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x00ab:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00c0
            java.lang.Object r4 = r3.next()
            U2.p r4 = (U2.p) r4
            r4.e()
            C0.r r4 = r4.f1834b
            r4.E()
            goto L_0x00ab
        L_0x00c0:
            r0.clear()
            goto L_0x00d6
        L_0x00c4:
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00cb
            goto L_0x00e4
        L_0x00cb:
            java.lang.Object r0 = r13.a(r8)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00de
            r10.b(r0)
        L_0x00d6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r15.b(r0)
            goto L_0x00e7
        L_0x00de:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x00e4:
            r15.c()
        L_0x00e7:
            return r2
        L_0x00e8:
            r15 = r19
            c2.m r15 = (c2.m) r15
            r13 = r20
            c2.p r13 = (c2.p) r13
            A2.i.e(r15, r12)
            A2.i.e(r13, r11)
            T2.d r10 = (T2.d) r10
            r10.getClass()
            java.lang.String r11 = "playerId"
            java.lang.Object r11 = r15.a(r11)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x0107
            goto L_0x0463
        L_0x0107:
            java.lang.String r12 = "create"
            java.lang.String r4 = r15.f2785a
            boolean r12 = A2.i.a(r4, r12)
            java.util.concurrent.ConcurrentHashMap r14 = r10.f1742j
            if (r12 == 0) goto L_0x0151
            C0.r r0 = new C0.r
            C0.f r3 = new C0.f
            c2.f r4 = r10.f1740h
            if (r4 == 0) goto L_0x014a
            java.lang.String r5 = "xyz.luan/audioplayers/events/"
            java.lang.String r5 = r5.concat(r11)
            r3.<init>((c2.f) r4, (java.lang.String) r5)
            r0.<init>((C0.f) r3)
            U2.p r3 = new U2.p
            T2.a r4 = r10.f1743k
            T2.a r4 = T2.a.b(r4)
            C0.r r5 = r10.f1741i
            if (r5 == 0) goto L_0x0143
            r3.<init>(r10, r0, r4, r5)
            r14.put(r11, r3)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.b(r0)
            goto L_0x0463
        L_0x0143:
            java.lang.String r0 = "soundPoolManager"
            A2.i.g(r0)
            r0 = 0
            throw r0
        L_0x014a:
            r0 = 0
            java.lang.String r2 = "binaryMessenger"
            A2.i.g(r2)
            throw r0
        L_0x0151:
            java.lang.Object r10 = r14.get(r11)
            U2.p r10 = (U2.p) r10
            if (r10 == 0) goto L_0x0464
            java.lang.String r12 = "AndroidAudioError"
            if (r4 == 0) goto L_0x0458
            int r16 = r4.hashCode()     // Catch:{ Exception -> 0x01bd }
            C0.r r1 = r10.f1834b
            r17 = 46
            switch(r16) {
                case -1757019252: goto L_0x043c;
                case -1722943962: goto L_0x03f7;
                case -1660487654: goto L_0x03bd;
                case -1630329231: goto L_0x03a2;
                case -934426579: goto L_0x036e;
                case -402284771: goto L_0x0336;
                case -159032046: goto L_0x02f8;
                case 3526264: goto L_0x02bc;
                case 3540994: goto L_0x02ad;
                case 85887754: goto L_0x028f;
                case 106440182: goto L_0x0280;
                case 670514716: goto L_0x0246;
                case 910310901: goto L_0x0217;
                case 1090594823: goto L_0x0209;
                case 1671767583: goto L_0x01f5;
                case 1771699022: goto L_0x01d0;
                case 1902436987: goto L_0x01c0;
                case 2096116872: goto L_0x016a;
                default: goto L_0x0168;
            }
        L_0x0168:
            goto L_0x0458
        L_0x016a:
            java.lang.String r0 = "setReleaseMode"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0174
            goto L_0x0458
        L_0x0174:
            java.lang.String r0 = "releaseMode"
            java.lang.Object r0 = r15.a(r0)     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0180
            r4 = 0
            goto L_0x0198
        L_0x0180:
            r1 = 1
            char[] r3 = new char[r1]     // Catch:{ Exception -> 0x01bd }
            r1 = 0
            r3[r1] = r17     // Catch:{ Exception -> 0x01bd }
            java.util.List r0 = H2.l.k0(r0, r3)     // Catch:{ Exception -> 0x01bd }
            java.lang.Object r0 = q2.C0401d.f0(r0)     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = android.support.v4.media.session.a.E(r0)     // Catch:{ Exception -> 0x01bd }
            T2.f r4 = T2.f.valueOf(r0)     // Catch:{ Exception -> 0x01bd }
        L_0x0198:
            if (r4 == 0) goto L_0x01b5
            T2.f r0 = r10.f1842j     // Catch:{ Exception -> 0x01bd }
            if (r0 == r4) goto L_0x01b2
            r10.f1842j = r4     // Catch:{ Exception -> 0x01bd }
            boolean r0 = r10.f1844l     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x01b2
            U2.h r0 = r10.f1837e     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x01b2
            T2.f r1 = T2.f.f1747g     // Catch:{ Exception -> 0x01bd }
            if (r4 != r1) goto L_0x01ae
            r1 = 1
            goto L_0x01af
        L_0x01ae:
            r1 = 0
        L_0x01af:
            r0.c(r1)     // Catch:{ Exception -> 0x01bd }
        L_0x01b2:
            r0 = 1
            goto L_0x042c
        L_0x01b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            java.lang.String r1 = "releaseMode is required"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            goto L_0x045c
        L_0x01c0:
            boolean r0 = r4.equals(r7)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x01c8
            goto L_0x0458
        L_0x01c8:
            T2.a r0 = android.support.v4.media.session.a.a(r15)     // Catch:{ Exception -> 0x01bd }
            r10.l(r0)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x01d0:
            java.lang.String r0 = "setSourceBytes"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x01da
            goto L_0x0458
        L_0x01da:
            java.lang.String r0 = "bytes"
            java.lang.Object r0 = r15.a(r0)     // Catch:{ Exception -> 0x01bd }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x01ed
            V2.b r1 = new V2.b     // Catch:{ Exception -> 0x01bd }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01bd }
            r10.i(r1)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x01ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            java.lang.String r1 = "bytes are required"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x01f5:
            java.lang.String r0 = "dispose"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x01ff
            goto L_0x0458
        L_0x01ff:
            r10.e()     // Catch:{ Exception -> 0x01bd }
            r1.E()     // Catch:{ Exception -> 0x01bd }
            r14.remove(r11)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x0209:
            java.lang.String r0 = "release"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0213
            goto L_0x0458
        L_0x0213:
            r10.e()     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x0217:
            boolean r0 = r4.equals(r6)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x021f
            goto L_0x0458
        L_0x021f:
            java.lang.Object r0 = r15.a(r5)     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x0240
            java.lang.Object r3 = r15.a(r8)     // Catch:{ Exception -> 0x01bd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x01bd }
            if (r3 == 0) goto L_0x023a
            T2.d r4 = r10.f1833a     // Catch:{ Exception -> 0x01bd }
            r4.getClass()     // Catch:{ Exception -> 0x01bd }
            r5 = 0
            r1.F(r0, r3, r5)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x023a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            r0.<init>(r9)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x0240:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            r0.<init>(r3)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x0246:
            java.lang.String r0 = "setVolume"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0250
            goto L_0x0458
        L_0x0250:
            java.lang.String r0 = "volume"
            java.lang.Object r0 = r15.a(r0)     // Catch:{ Exception -> 0x01bd }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x0278
            double r0 = r0.doubleValue()     // Catch:{ Exception -> 0x01bd }
            float r0 = (float) r0     // Catch:{ Exception -> 0x01bd }
            float r1 = r10.f1839g     // Catch:{ Exception -> 0x01bd }
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0267
            goto L_0x01b2
        L_0x0267:
            r10.f1839g = r0     // Catch:{ Exception -> 0x01bd }
            boolean r1 = r10.f1844l     // Catch:{ Exception -> 0x01bd }
            if (r1 != 0) goto L_0x01b2
            U2.h r1 = r10.f1837e     // Catch:{ Exception -> 0x01bd }
            if (r1 == 0) goto L_0x01b2
            float r3 = r10.f1840h     // Catch:{ Exception -> 0x01bd }
            U2.p.j(r1, r0, r3)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x0278:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            java.lang.String r1 = "volume is required"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x0280:
            java.lang.String r0 = "pause"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x028a
            goto L_0x0458
        L_0x028a:
            r10.d()     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x028f:
            r5 = 0
            java.lang.String r0 = "getDuration"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x029a
            goto L_0x0458
        L_0x029a:
            boolean r0 = r10.f1845m     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x02a7
            U2.h r0 = r10.f1837e     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x02a7
            java.lang.Integer r4 = r0.i()     // Catch:{ Exception -> 0x01bd }
            goto L_0x02a8
        L_0x02a7:
            r4 = r5
        L_0x02a8:
            r13.b(r4)     // Catch:{ Exception -> 0x01bd }
            goto L_0x0463
        L_0x02ad:
            java.lang.String r0 = "stop"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x02b7
            goto L_0x0458
        L_0x02b7:
            r10.k()     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x02bc:
            java.lang.String r0 = "seek"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x02c6
            goto L_0x0458
        L_0x02c6:
            java.lang.String r0 = "position"
            java.lang.Object r0 = r15.a(r0)     // Catch:{ Exception -> 0x01bd }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x02f0
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01bd }
            boolean r1 = r10.f1845m     // Catch:{ Exception -> 0x01bd }
            if (r1 == 0) goto L_0x02ec
            U2.h r1 = r10.f1837e     // Catch:{ Exception -> 0x01bd }
            if (r1 == 0) goto L_0x02e4
            boolean r1 = r1.j()     // Catch:{ Exception -> 0x01bd }
            r3 = 1
            if (r1 != r3) goto L_0x02e4
            goto L_0x02ec
        L_0x02e4:
            U2.h r1 = r10.f1837e     // Catch:{ Exception -> 0x01bd }
            if (r1 == 0) goto L_0x02eb
            r1.n(r0)     // Catch:{ Exception -> 0x01bd }
        L_0x02eb:
            r0 = -1
        L_0x02ec:
            r10.f1847o = r0     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x02f0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            java.lang.String r1 = "position is required"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x02f8:
            java.lang.String r0 = "setSourceUrl"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0302
            goto L_0x0458
        L_0x0302:
            java.lang.String r0 = "url"
            java.lang.Object r0 = r15.a(r0)     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x032e
            java.lang.String r1 = "isLocal"
            java.lang.Object r1 = r15.a(r1)     // Catch:{ Exception -> 0x01bd }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x01bd }
            if (r1 == 0) goto L_0x031b
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x01bd }
            goto L_0x031c
        L_0x031b:
            r1 = 0
        L_0x031c:
            V2.d r3 = new V2.d     // Catch:{ FileNotFoundException -> 0x0326 }
            r3.<init>(r0, r1)     // Catch:{ FileNotFoundException -> 0x0326 }
            r10.i(r3)     // Catch:{ FileNotFoundException -> 0x0326 }
            goto L_0x01b2
        L_0x0326:
            r0 = move-exception
            java.lang.String r1 = "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md"
            r13.a(r12, r1, r0)     // Catch:{ Exception -> 0x01bd }
            goto L_0x0463
        L_0x032e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            java.lang.String r1 = "url is required"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x0336:
            java.lang.String r0 = "setPlaybackRate"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0340
            goto L_0x0458
        L_0x0340:
            java.lang.String r0 = "playbackRate"
            java.lang.Object r0 = r15.a(r0)     // Catch:{ Exception -> 0x01bd }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x0366
            double r0 = r0.doubleValue()     // Catch:{ Exception -> 0x01bd }
            float r0 = (float) r0     // Catch:{ Exception -> 0x01bd }
            float r1 = r10.f1841i     // Catch:{ Exception -> 0x01bd }
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0357
            goto L_0x01b2
        L_0x0357:
            r10.f1841i = r0     // Catch:{ Exception -> 0x01bd }
            boolean r1 = r10.f1846n     // Catch:{ Exception -> 0x01bd }
            if (r1 == 0) goto L_0x01b2
            U2.h r1 = r10.f1837e     // Catch:{ Exception -> 0x01bd }
            if (r1 == 0) goto L_0x01b2
            r1.l(r0)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x0366:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            java.lang.String r1 = "playbackRate is required"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x036e:
            java.lang.String r0 = "resume"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0378
            goto L_0x0458
        L_0x0378:
            boolean r0 = r10.f1846n     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x01b2
            boolean r0 = r10.f1844l     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x01b2
            r0 = 1
            r10.f1846n = r0     // Catch:{ Exception -> 0x01bd }
            U2.h r0 = r10.f1837e     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0399
            U2.h r0 = r10.b()     // Catch:{ Exception -> 0x01bd }
            r10.f1837e = r0     // Catch:{ Exception -> 0x01bd }
            V2.c r1 = r10.f1838f     // Catch:{ Exception -> 0x01bd }
            if (r1 == 0) goto L_0x01b2
            r0.k(r1)     // Catch:{ Exception -> 0x01bd }
            r10.a(r0)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x0399:
            boolean r0 = r10.f1845m     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x01b2
            r10.f()     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x03a2:
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x03aa
            goto L_0x0458
        L_0x03aa:
            java.lang.Object r0 = r15.a(r8)     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x03b7
            r10.c(r0)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x03b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            r0.<init>(r9)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x03bd:
            java.lang.String r0 = "setBalance"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x03c7
            goto L_0x0458
        L_0x03c7:
            java.lang.String r0 = "balance"
            java.lang.Object r0 = r15.a(r0)     // Catch:{ Exception -> 0x01bd }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x03ef
            double r0 = r0.doubleValue()     // Catch:{ Exception -> 0x01bd }
            float r0 = (float) r0     // Catch:{ Exception -> 0x01bd }
            float r1 = r10.f1840h     // Catch:{ Exception -> 0x01bd }
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x03de
            goto L_0x01b2
        L_0x03de:
            r10.f1840h = r0     // Catch:{ Exception -> 0x01bd }
            boolean r1 = r10.f1844l     // Catch:{ Exception -> 0x01bd }
            if (r1 != 0) goto L_0x01b2
            U2.h r1 = r10.f1837e     // Catch:{ Exception -> 0x01bd }
            if (r1 == 0) goto L_0x01b2
            float r3 = r10.f1839g     // Catch:{ Exception -> 0x01bd }
            U2.p.j(r1, r3, r0)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x03ef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            java.lang.String r1 = "balance is required"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x03f7:
            r5 = 0
            java.lang.String r0 = "setPlayerMode"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0401
            goto L_0x0458
        L_0x0401:
            java.lang.String r0 = "playerMode"
            java.lang.Object r0 = r15.a(r0)     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x040d
            r4 = r5
            goto L_0x0425
        L_0x040d:
            r1 = 1
            char[] r3 = new char[r1]     // Catch:{ Exception -> 0x01bd }
            r1 = 0
            r3[r1] = r17     // Catch:{ Exception -> 0x01bd }
            java.util.List r0 = H2.l.k0(r0, r3)     // Catch:{ Exception -> 0x01bd }
            java.lang.Object r0 = q2.C0401d.f0(r0)     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = android.support.v4.media.session.a.E(r0)     // Catch:{ Exception -> 0x01bd }
            T2.e r4 = T2.e.valueOf(r0)     // Catch:{ Exception -> 0x01bd }
        L_0x0425:
            if (r4 == 0) goto L_0x0434
            r10.g(r4)     // Catch:{ Exception -> 0x01bd }
            goto L_0x01b2
        L_0x042c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01bd }
            r13.b(r0)     // Catch:{ Exception -> 0x01bd }
            goto L_0x0463
        L_0x0434:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bd }
            java.lang.String r1 = "playerMode is required"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01bd }
            throw r0     // Catch:{ Exception -> 0x01bd }
        L_0x043c:
            r5 = 0
            java.lang.String r0 = "getCurrentPosition"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x01bd }
            if (r0 != 0) goto L_0x0446
            goto L_0x0458
        L_0x0446:
            boolean r0 = r10.f1845m     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x0453
            U2.h r0 = r10.f1837e     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x0453
            java.lang.Integer r4 = r0.v()     // Catch:{ Exception -> 0x01bd }
            goto L_0x0454
        L_0x0453:
            r4 = r5
        L_0x0454:
            r13.b(r4)     // Catch:{ Exception -> 0x01bd }
            goto L_0x0463
        L_0x0458:
            r13.c()     // Catch:{ Exception -> 0x01bd }
            goto L_0x0463
        L_0x045c:
            java.lang.String r1 = r0.getMessage()
            r13.a(r12, r1, r0)
        L_0x0463:
            return r2
        L_0x0464:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Player has not yet been created or has already been disposed."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.c.i(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
