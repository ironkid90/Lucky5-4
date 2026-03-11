package androidx.datastore.preferences.protobuf;

import L.k;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final G f2355a;

    public H(m0 m0Var, o0 o0Var, k kVar) {
        this.f2355a = new G(m0Var, o0Var, kVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        r1 = r1 + r5;
        r5 = androidx.datastore.preferences.protobuf.C0109m.u0(2);
        r0 = r0.f2353b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        if (r0 != r6) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
        r5 = r5 * 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010a, code lost:
        switch(r0.ordinal()) {
            case 0: goto L_0x01f2;
            case 1: goto L_0x01ea;
            case L.k.FLOAT_FIELD_NUMBER :int: goto L_0x01de;
            case L.k.INTEGER_FIELD_NUMBER :int: goto L_0x01d2;
            case L.k.LONG_FIELD_NUMBER :int: goto L_0x01c5;
            case L.k.STRING_FIELD_NUMBER :int: goto L_0x01bd;
            case L.k.STRING_SET_FIELD_NUMBER :int: goto L_0x01b6;
            case L.k.DOUBLE_FIELD_NUMBER :int: goto L_0x01af;
            case L.k.BYTES_FIELD_NUMBER :int: goto L_0x0197;
            case 9: goto L_0x018d;
            case 10: goto L_0x017f;
            case 11: goto L_0x0163;
            case 12: goto L_0x0156;
            case 13: goto L_0x0148;
            case 14: goto L_0x013f;
            case 15: goto L_0x0136;
            case 16: goto L_0x0124;
            case 17: goto L_0x0113;
            default: goto L_0x010d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0112, code lost:
        throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
        r2 = ((java.lang.Long) r2).longValue();
        r4 = androidx.datastore.preferences.protobuf.C0109m.y0((r2 >> 63) ^ (r2 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0124, code lost:
        r0 = ((java.lang.Integer) r2).intValue();
        r4 = androidx.datastore.preferences.protobuf.C0109m.w0((r0 >> 31) ^ (r0 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0136, code lost:
        ((java.lang.Long) r2).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013c, code lost:
        r4 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013f, code lost:
        ((java.lang.Integer) r2).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0145, code lost:
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0148, code lost:
        r4 = androidx.datastore.preferences.protobuf.C0109m.y0((long) ((java.lang.Integer) r2).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0156, code lost:
        r4 = androidx.datastore.preferences.protobuf.C0109m.w0(((java.lang.Integer) r2).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0165, code lost:
        if ((r2 instanceof androidx.datastore.preferences.protobuf.C0103g) == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0167, code lost:
        r0 = ((androidx.datastore.preferences.protobuf.C0103g) r2).size();
        r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0172, code lost:
        r4 = r2 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0176, code lost:
        r0 = ((byte[]) r2).length;
        r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017f, code lost:
        r0 = ((androidx.datastore.preferences.protobuf.C0118w) ((androidx.datastore.preferences.protobuf.C0097a) r2)).a((androidx.datastore.preferences.protobuf.W) null);
        r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018d, code lost:
        r4 = ((androidx.datastore.preferences.protobuf.C0118w) ((androidx.datastore.preferences.protobuf.C0097a) r2)).a((androidx.datastore.preferences.protobuf.W) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0199, code lost:
        if ((r2 instanceof androidx.datastore.preferences.protobuf.C0103g) == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019b, code lost:
        r0 = ((androidx.datastore.preferences.protobuf.C0103g) r2).size();
        r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a7, code lost:
        r4 = androidx.datastore.preferences.protobuf.C0109m.t0((java.lang.String) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01af, code lost:
        ((java.lang.Boolean) r2).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b6, code lost:
        ((java.lang.Integer) r2).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bd, code lost:
        ((java.lang.Long) r2).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c5, code lost:
        r4 = androidx.datastore.preferences.protobuf.C0109m.y0((long) ((java.lang.Integer) r2).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d2, code lost:
        r4 = androidx.datastore.preferences.protobuf.C0109m.y0(((java.lang.Long) r2).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01de, code lost:
        r4 = androidx.datastore.preferences.protobuf.C0109m.y0(((java.lang.Long) r2).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ea, code lost:
        ((java.lang.Float) r2).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f2, code lost:
        ((java.lang.Double) r2).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fc, code lost:
        return (r4 + r5) + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(androidx.datastore.preferences.protobuf.G r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 2
            r4 = 1
            int r5 = androidx.datastore.preferences.protobuf.r.f2475c
            int r5 = androidx.datastore.preferences.protobuf.C0109m.u0(r4)
            androidx.datastore.preferences.protobuf.n0 r6 = androidx.datastore.preferences.protobuf.q0.GROUP
            androidx.datastore.preferences.protobuf.m0 r7 = r0.f2352a
            if (r7 != r6) goto L_0x0015
            int r5 = r5 * r3
        L_0x0015:
            int r7 = r7.ordinal()
            r8 = 63
            java.lang.String r9 = "There is no way to get here, but the compiler thinks otherwise."
            r10 = 8
            r11 = 4
            r12 = 0
            switch(r7) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00cc;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00c0;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00a3;
                case 9: goto L_0x009a;
                case 10: goto L_0x008d;
                case 11: goto L_0x0074;
                case 12: goto L_0x0068;
                case 13: goto L_0x005b;
                case 14: goto L_0x0053;
                case 15: goto L_0x004b;
                case 16: goto L_0x003a;
                case 17: goto L_0x002a;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r9)
            throw r0
        L_0x002a:
            java.lang.Long r1 = (java.lang.Long) r1
            long r13 = r1.longValue()
            long r15 = r13 << r4
            long r13 = r13 >> r8
            long r13 = r13 ^ r15
            int r1 = androidx.datastore.preferences.protobuf.C0109m.y0(r13)
            goto L_0x00fc
        L_0x003a:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r7 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = androidx.datastore.preferences.protobuf.C0109m.w0(r1)
            goto L_0x00fc
        L_0x004b:
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
        L_0x0050:
            r1 = r10
            goto L_0x00fc
        L_0x0053:
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
        L_0x0058:
            r1 = r11
            goto L_0x00fc
        L_0x005b:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r13 = (long) r1
            int r1 = androidx.datastore.preferences.protobuf.C0109m.y0(r13)
            goto L_0x00fc
        L_0x0068:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = androidx.datastore.preferences.protobuf.C0109m.w0(r1)
            goto L_0x00fc
        L_0x0074:
            boolean r7 = r1 instanceof androidx.datastore.preferences.protobuf.C0103g
            if (r7 == 0) goto L_0x0085
            androidx.datastore.preferences.protobuf.g r1 = (androidx.datastore.preferences.protobuf.C0103g) r1
            int r1 = r1.size()
            int r7 = androidx.datastore.preferences.protobuf.C0109m.w0(r1)
        L_0x0082:
            int r1 = r1 + r7
            goto L_0x00fc
        L_0x0085:
            byte[] r1 = (byte[]) r1
            int r1 = r1.length
            int r7 = androidx.datastore.preferences.protobuf.C0109m.w0(r1)
            goto L_0x0082
        L_0x008d:
            androidx.datastore.preferences.protobuf.a r1 = (androidx.datastore.preferences.protobuf.C0097a) r1
            androidx.datastore.preferences.protobuf.w r1 = (androidx.datastore.preferences.protobuf.C0118w) r1
            int r1 = r1.a(r12)
            int r7 = androidx.datastore.preferences.protobuf.C0109m.w0(r1)
            goto L_0x0082
        L_0x009a:
            androidx.datastore.preferences.protobuf.a r1 = (androidx.datastore.preferences.protobuf.C0097a) r1
            androidx.datastore.preferences.protobuf.w r1 = (androidx.datastore.preferences.protobuf.C0118w) r1
            int r1 = r1.a(r12)
            goto L_0x00fc
        L_0x00a3:
            boolean r7 = r1 instanceof androidx.datastore.preferences.protobuf.C0103g
            if (r7 == 0) goto L_0x00b2
            androidx.datastore.preferences.protobuf.g r1 = (androidx.datastore.preferences.protobuf.C0103g) r1
            int r1 = r1.size()
            int r7 = androidx.datastore.preferences.protobuf.C0109m.w0(r1)
            goto L_0x0082
        L_0x00b2:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = androidx.datastore.preferences.protobuf.C0109m.t0(r1)
            goto L_0x00fc
        L_0x00b9:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            r1 = r4
            goto L_0x00fc
        L_0x00c0:
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            goto L_0x0058
        L_0x00c6:
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            goto L_0x0050
        L_0x00cc:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r13 = (long) r1
            int r1 = androidx.datastore.preferences.protobuf.C0109m.y0(r13)
            goto L_0x00fc
        L_0x00d8:
            java.lang.Long r1 = (java.lang.Long) r1
            long r13 = r1.longValue()
            int r1 = androidx.datastore.preferences.protobuf.C0109m.y0(r13)
            goto L_0x00fc
        L_0x00e3:
            java.lang.Long r1 = (java.lang.Long) r1
            long r13 = r1.longValue()
            int r1 = androidx.datastore.preferences.protobuf.C0109m.y0(r13)
            goto L_0x00fc
        L_0x00ee:
            java.lang.Float r1 = (java.lang.Float) r1
            r1.getClass()
            goto L_0x0058
        L_0x00f5:
            java.lang.Double r1 = (java.lang.Double) r1
            r1.getClass()
            goto L_0x0050
        L_0x00fc:
            int r1 = r1 + r5
            int r5 = androidx.datastore.preferences.protobuf.C0109m.u0(r3)
            androidx.datastore.preferences.protobuf.o0 r0 = r0.f2353b
            if (r0 != r6) goto L_0x0106
            int r5 = r5 * r3
        L_0x0106:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x01f2;
                case 1: goto L_0x01ea;
                case 2: goto L_0x01de;
                case 3: goto L_0x01d2;
                case 4: goto L_0x01c5;
                case 5: goto L_0x01bd;
                case 6: goto L_0x01b6;
                case 7: goto L_0x01af;
                case 8: goto L_0x0197;
                case 9: goto L_0x018d;
                case 10: goto L_0x017f;
                case 11: goto L_0x0163;
                case 12: goto L_0x0156;
                case 13: goto L_0x0148;
                case 14: goto L_0x013f;
                case 15: goto L_0x0136;
                case 16: goto L_0x0124;
                case 17: goto L_0x0113;
                default: goto L_0x010d;
            }
        L_0x010d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r9)
            throw r0
        L_0x0113:
            r0 = r2
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r6 = r2 << r4
            long r2 = r2 >> r8
            long r2 = r2 ^ r6
            int r4 = androidx.datastore.preferences.protobuf.C0109m.y0(r2)
            goto L_0x01fa
        L_0x0124:
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r2 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r2
            int r4 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01fa
        L_0x0136:
            r0 = r2
            java.lang.Long r0 = (java.lang.Long) r0
            r0.getClass()
        L_0x013c:
            r4 = r10
            goto L_0x01fa
        L_0x013f:
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
        L_0x0145:
            r4 = r11
            goto L_0x01fa
        L_0x0148:
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r2 = (long) r0
            int r4 = androidx.datastore.preferences.protobuf.C0109m.y0(r2)
            goto L_0x01fa
        L_0x0156:
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r4 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01fa
        L_0x0163:
            boolean r0 = r2 instanceof androidx.datastore.preferences.protobuf.C0103g
            if (r0 == 0) goto L_0x0176
            r0 = r2
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0103g) r0
            int r0 = r0.size()
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
        L_0x0172:
            int r4 = r2 + r0
            goto L_0x01fa
        L_0x0176:
            r0 = r2
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x0172
        L_0x017f:
            r0 = r2
            androidx.datastore.preferences.protobuf.a r0 = (androidx.datastore.preferences.protobuf.C0097a) r0
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.C0118w) r0
            int r0 = r0.a(r12)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x0172
        L_0x018d:
            r0 = r2
            androidx.datastore.preferences.protobuf.a r0 = (androidx.datastore.preferences.protobuf.C0097a) r0
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.C0118w) r0
            int r4 = r0.a(r12)
            goto L_0x01fa
        L_0x0197:
            boolean r0 = r2 instanceof androidx.datastore.preferences.protobuf.C0103g
            if (r0 == 0) goto L_0x01a7
            r0 = r2
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0103g) r0
            int r0 = r0.size()
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x0172
        L_0x01a7:
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            int r4 = androidx.datastore.preferences.protobuf.C0109m.t0(r0)
            goto L_0x01fa
        L_0x01af:
            r0 = r2
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            goto L_0x01fa
        L_0x01b6:
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            goto L_0x0145
        L_0x01bd:
            r0 = r2
            java.lang.Long r0 = (java.lang.Long) r0
            r0.getClass()
            goto L_0x013c
        L_0x01c5:
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r2 = (long) r0
            int r4 = androidx.datastore.preferences.protobuf.C0109m.y0(r2)
            goto L_0x01fa
        L_0x01d2:
            r0 = r2
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r4 = androidx.datastore.preferences.protobuf.C0109m.y0(r2)
            goto L_0x01fa
        L_0x01de:
            r0 = r2
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r4 = androidx.datastore.preferences.protobuf.C0109m.y0(r2)
            goto L_0x01fa
        L_0x01ea:
            r0 = r2
            java.lang.Float r0 = (java.lang.Float) r0
            r0.getClass()
            goto L_0x0145
        L_0x01f2:
            r0 = r2
            java.lang.Double r0 = (java.lang.Double) r0
            r0.getClass()
            goto L_0x013c
        L_0x01fa:
            int r4 = r4 + r5
            int r4 = r4 + r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.H.a(androidx.datastore.preferences.protobuf.G, java.lang.Object, java.lang.Object):int");
    }
}
