package L1;

import b2.f;
import c2.m;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f970f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f971g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f972h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ f f973i;

    public /* synthetic */ n(f fVar, m mVar, f fVar2) {
        this.f970f = 6;
        this.f973i = fVar;
        this.f971g = mVar;
        this.f972h = fVar2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            r0 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            c2.m r6 = r1.f971g
            b2.f r7 = r1.f972h
            L1.f r8 = r1.f973i
            int r9 = r1.f970f
            switch(r9) {
                case 0: goto L_0x01ad;
                case 1: goto L_0x019d;
                case 2: goto L_0x018d;
                case 3: goto L_0x015d;
                case 4: goto L_0x014c;
                case 5: goto L_0x013c;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.util.HashMap r9 = L1.q.f987h
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.String r10 = "noResult"
            java.lang.Object r10 = r6.a(r10)
            boolean r9 = r9.equals(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.String r11 = "continueOnError"
            java.lang.Object r11 = r6.a(r11)
            boolean r10 = r10.equals(r11)
            java.lang.String r11 = "operations"
            java.lang.Object r6 = r6.a(r11)
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x003d:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x0132
            java.lang.Object r12 = r6.next()
            java.util.Map r12 = (java.util.Map) r12
            M1.a r13 = new M1.a
            r13.<init>(r12, r9)
            java.lang.String r12 = r13.x()
            r12.getClass()
            s1.y r14 = r13.f1091m
            int r16 = r12.hashCode()
            switch(r16) {
                case -1319569547: goto L_0x0081;
                case -1183792455: goto L_0x0076;
                case -838846263: goto L_0x006b;
                case 107944136: goto L_0x0060;
                default: goto L_0x005e;
            }
        L_0x005e:
            r15 = -1
            goto L_0x008b
        L_0x0060:
            java.lang.String r15 = "query"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x0069
            goto L_0x005e
        L_0x0069:
            r15 = r0
            goto L_0x008b
        L_0x006b:
            java.lang.String r15 = "update"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x0074
            goto L_0x005e
        L_0x0074:
            r15 = r2
            goto L_0x008b
        L_0x0076:
            java.lang.String r15 = "insert"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x007f
            goto L_0x005e
        L_0x007f:
            r15 = r3
            goto L_0x008b
        L_0x0081:
            java.lang.String r15 = "execute"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x008a
            goto L_0x005e
        L_0x008a:
            r15 = r4
        L_0x008b:
            switch(r15) {
                case 0: goto L_0x010d;
                case 1: goto L_0x00eb;
                case 2: goto L_0x00c9;
                case 3: goto L_0x00a8;
                default: goto L_0x008e;
            }
        L_0x008e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Batch method '"
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r2 = "' not supported"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "bad_param"
            r7.a(r2, r0, r5)
            goto L_0x013b
        L_0x00a8:
            boolean r12 = r8.e(r13)
            if (r12 == 0) goto L_0x00b2
            r13.a0(r11)
            goto L_0x003d
        L_0x00b2:
            if (r10 == 0) goto L_0x00b8
            r13.Z(r11)
            goto L_0x003d
        L_0x00b8:
            java.lang.Object r0 = r14.f4622f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r14.f4624h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r14.f4625i
            java.util.HashMap r3 = (java.util.HashMap) r3
            r7.a(r0, r2, r3)
            goto L_0x013b
        L_0x00c9:
            boolean r12 = r8.f(r13)
            if (r12 == 0) goto L_0x00d4
            r13.a0(r11)
            goto L_0x003d
        L_0x00d4:
            if (r10 == 0) goto L_0x00db
            r13.Z(r11)
            goto L_0x003d
        L_0x00db:
            java.lang.Object r0 = r14.f4622f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r14.f4624h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r14.f4625i
            java.util.HashMap r3 = (java.util.HashMap) r3
            r7.a(r0, r2, r3)
            goto L_0x013b
        L_0x00eb:
            boolean r12 = r8.d(r13)
            if (r12 == 0) goto L_0x00f6
            r13.a0(r11)
            goto L_0x003d
        L_0x00f6:
            if (r10 == 0) goto L_0x00fd
            r13.Z(r11)
            goto L_0x003d
        L_0x00fd:
            java.lang.Object r0 = r14.f4622f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r14.f4624h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r14.f4625i
            java.util.HashMap r3 = (java.util.HashMap) r3
            r7.a(r0, r2, r3)
            goto L_0x013b
        L_0x010d:
            boolean r12 = r8.g(r13)
            if (r12 != 0) goto L_0x012a
            if (r10 == 0) goto L_0x011a
            r13.Z(r11)
            goto L_0x003d
        L_0x011a:
            java.lang.Object r0 = r14.f4622f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r14.f4624h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r14.f4625i
            java.util.HashMap r3 = (java.util.HashMap) r3
            r7.a(r0, r2, r3)
            goto L_0x013b
        L_0x012a:
            r13.b(r5)
            r13.a0(r11)
            goto L_0x003d
        L_0x0132:
            if (r9 == 0) goto L_0x0138
            r7.b(r5)
            goto L_0x013b
        L_0x0138:
            r7.b(r11)
        L_0x013b:
            return
        L_0x013c:
            java.util.HashMap r0 = L1.q.f987h
            M1.c r0 = new M1.c
            r0.<init>(r6, r7)
            L1.b r3 = new L1.b
            r3.<init>(r8, r0, r2)
            r8.l(r0, r3)
            return
        L_0x014c:
            java.util.HashMap r0 = L1.q.f987h
            M1.c r0 = new M1.c
            r0.<init>(r6, r7)
            L1.b r2 = new L1.b
            r3 = 4
            r2.<init>(r8, r0, r3)
            r8.l(r0, r2)
            return
        L_0x015d:
            java.util.HashMap r0 = L1.q.f987h
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r6.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.database.sqlite.SQLiteDatabase r2 = r8.f941i     // Catch:{ Exception -> 0x0174 }
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)     // Catch:{ Exception -> 0x0174 }
            r2.setLocale(r0)     // Catch:{ Exception -> 0x0174 }
            r7.b(r5)     // Catch:{ Exception -> 0x0174 }
            goto L_0x018c
        L_0x0174:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error calling setLocale: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "sqlite_error"
            r7.a(r2, r0, r5)
        L_0x018c:
            return
        L_0x018d:
            java.util.HashMap r0 = L1.q.f987h
            M1.c r0 = new M1.c
            r0.<init>(r6, r7)
            L1.b r2 = new L1.b
            r2.<init>(r8, r0, r3)
            r8.l(r0, r2)
            return
        L_0x019d:
            java.util.HashMap r2 = L1.q.f987h
            M1.c r2 = new M1.c
            r2.<init>(r6, r7)
            L1.b r3 = new L1.b
            r3.<init>(r8, r2, r0)
            r8.l(r2, r3)
            return
        L_0x01ad:
            java.util.HashMap r0 = L1.q.f987h
            M1.c r0 = new M1.c
            r0.<init>(r6, r7)
            L1.b r2 = new L1.b
            r2.<init>(r8, r0, r4)
            r8.l(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.n.run():void");
    }

    public /* synthetic */ n(m mVar, f fVar, f fVar2) {
        this.f970f = 3;
        this.f971g = mVar;
        this.f973i = fVar;
        this.f972h = fVar2;
    }

    public /* synthetic */ n(m mVar, f fVar, f fVar2, int i3) {
        this.f970f = i3;
        this.f971g = mVar;
        this.f972h = fVar;
        this.f973i = fVar2;
    }
}
