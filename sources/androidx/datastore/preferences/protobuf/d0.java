package androidx.datastore.preferences.protobuf;

public final class d0 {
    public static c0 a(Object obj) {
        C0118w wVar = (C0118w) obj;
        c0 c0Var = wVar.unknownFields;
        if (c0Var != c0.f2410f) {
            return c0Var;
        }
        c0 c0Var2 = new c0(0, new int[8], new Object[8], true);
        wVar.unknownFields = c0Var2;
        return c0Var2;
    }

    public static void b(Object obj) {
        c0 c0Var = ((C0118w) obj).unknownFields;
        if (c0Var.f2415e) {
            c0Var.f2415e = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[LOOP:0: B:17:0x0047->B:20:0x0054, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(int r8, androidx.datastore.preferences.protobuf.C0107k r9, java.lang.Object r10) {
        /*
            int r0 = r9.f2453b
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            r3 = 0
            r4 = 3
            androidx.datastore.preferences.protobuf.j r5 = r9.f2452a
            if (r0 == 0) goto L_0x0099
            if (r0 == r2) goto L_0x0085
            r6 = 2
            if (r0 == r6) goto L_0x0078
            if (r0 == r4) goto L_0x0034
            r8 = 4
            if (r0 == r8) goto L_0x0033
            r8 = 5
            if (r0 != r8) goto L_0x002e
            r9.w(r8)
            int r9 = r5.j()
            androidx.datastore.preferences.protobuf.c0 r10 = (androidx.datastore.preferences.protobuf.c0) r10
            int r0 = r1 << 3
            r8 = r8 | r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.c(r8, r9)
            return r2
        L_0x002e:
            androidx.datastore.preferences.protobuf.z r8 = androidx.datastore.preferences.protobuf.A.b()
            throw r8
        L_0x0033:
            return r3
        L_0x0034:
            androidx.datastore.preferences.protobuf.c0 r0 = new androidx.datastore.preferences.protobuf.c0
            r5 = 8
            int[] r6 = new int[r5]
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0.<init>(r3, r6, r5, r2)
            int r1 = r1 << r4
            r5 = r1 | 4
            int r8 = r8 + r2
            r6 = 100
            if (r8 >= r6) goto L_0x0070
        L_0x0047:
            int r6 = r9.a()
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L_0x0056
            boolean r6 = c(r8, r9, r0)
            if (r6 != 0) goto L_0x0047
        L_0x0056:
            int r8 = r9.f2453b
            if (r5 != r8) goto L_0x0068
            boolean r8 = r0.f2415e
            if (r8 == 0) goto L_0x0060
            r0.f2415e = r3
        L_0x0060:
            androidx.datastore.preferences.protobuf.c0 r10 = (androidx.datastore.preferences.protobuf.c0) r10
            r8 = r1 | 3
            r10.c(r8, r0)
            return r2
        L_0x0068:
            androidx.datastore.preferences.protobuf.A r8 = new androidx.datastore.preferences.protobuf.A
            java.lang.String r9 = "Protocol message end-group tag did not match expected tag."
            r8.<init>(r9)
            throw r8
        L_0x0070:
            androidx.datastore.preferences.protobuf.A r8 = new androidx.datastore.preferences.protobuf.A
            java.lang.String r9 = "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."
            r8.<init>(r9)
            throw r8
        L_0x0078:
            androidx.datastore.preferences.protobuf.g r8 = r9.e()
            androidx.datastore.preferences.protobuf.c0 r10 = (androidx.datastore.preferences.protobuf.c0) r10
            int r9 = r1 << 3
            r9 = r9 | r6
            r10.c(r9, r8)
            return r2
        L_0x0085:
            r9.w(r2)
            long r8 = r5.k()
            androidx.datastore.preferences.protobuf.c0 r10 = (androidx.datastore.preferences.protobuf.c0) r10
            int r0 = r1 << 3
            r0 = r0 | r2
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r10.c(r0, r8)
            return r2
        L_0x0099:
            r9.w(r3)
            long r8 = r5.n()
            androidx.datastore.preferences.protobuf.c0 r10 = (androidx.datastore.preferences.protobuf.c0) r10
            int r0 = r1 << 3
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r10.c(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.d0.c(int, androidx.datastore.preferences.protobuf.k, java.lang.Object):boolean");
    }
}
