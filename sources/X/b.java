package x;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0508a f4745a = new Object();

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static F0.y a(android.content.Context r21, s1.C0465z r22) {
        /*
            r0 = r22
            android.content.pm.PackageManager r1 = r21.getPackageManager()
            android.content.res.Resources r2 = r21.getResources()
            java.lang.Object r3 = r0.f4628h
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            android.content.pm.ProviderInfo r5 = r1.resolveContentProvider(r3, r4)
            if (r5 == 0) goto L_0x01cc
            java.lang.String r6 = r5.packageName
            java.lang.Object r7 = r0.f4629i
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01b0
            java.lang.String r3 = r5.packageName
            r6 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r6)
            android.content.pm.Signature[] r1 = r1.signatures
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = r1.length
            r7 = r4
        L_0x0032:
            if (r7 >= r6) goto L_0x0040
            r8 = r1[r7]
            byte[] r8 = r8.toByteArray()
            r3.add(r8)
            int r7 = r7 + 1
            goto L_0x0032
        L_0x0040:
            x.a r1 = f4745a
            java.util.Collections.sort(r3, r1)
            java.lang.Object r6 = r0.f4630j
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x004c
            goto L_0x0050
        L_0x004c:
            java.util.List r6 = M0.a.I(r2, r4)
        L_0x0050:
            r2 = r4
        L_0x0051:
            int r7 = r6.size()
            r8 = 0
            if (r2 >= r7) goto L_0x0090
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r9 = r6.get(r2)
            java.util.Collection r9 = (java.util.Collection) r9
            r7.<init>(r9)
            java.util.Collections.sort(r7, r1)
            int r9 = r3.size()
            int r10 = r7.size()
            if (r9 == r10) goto L_0x0071
            goto L_0x008a
        L_0x0071:
            r9 = r4
        L_0x0072:
            int r10 = r3.size()
            if (r9 >= r10) goto L_0x0091
            java.lang.Object r10 = r3.get(r9)
            byte[] r10 = (byte[]) r10
            java.lang.Object r11 = r7.get(r9)
            byte[] r11 = (byte[]) r11
            boolean r10 = java.util.Arrays.equals(r10, r11)
            if (r10 != 0) goto L_0x008d
        L_0x008a:
            int r2 = r2 + 1
            goto L_0x0051
        L_0x008d:
            int r9 = r9 + 1
            goto L_0x0072
        L_0x0090:
            r5 = r8
        L_0x0091:
            r1 = 1
            if (r5 != 0) goto L_0x009a
            F0.y r0 = new F0.y
            r0.<init>((int) r1, (java.lang.Object[]) r8)
            return r0
        L_0x009a:
            java.lang.String r2 = r5.authority
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            android.net.Uri$Builder r5 = r5.authority(r2)
            android.net.Uri r5 = r5.build()
            android.net.Uri$Builder r7 = new android.net.Uri$Builder
            r7.<init>()
            android.net.Uri$Builder r6 = r7.scheme(r6)
            android.net.Uri$Builder r2 = r6.authority(r2)
            java.lang.String r6 = "file"
            android.net.Uri$Builder r2 = r2.appendPath(r6)
            android.net.Uri r2 = r2.build()
            android.content.ContentResolver r6 = r21.getContentResolver()
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r5)
            java.lang.String r9 = "_id"
            java.lang.String r10 = "file_id"
            java.lang.String r11 = "font_ttc_index"
            java.lang.String r12 = "font_variation_settings"
            java.lang.String r13 = "font_weight"
            java.lang.String r14 = "font_italic"
            java.lang.String r15 = "result_code"
            java.lang.String[] r11 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15}     // Catch:{ all -> 0x0145 }
            java.lang.String r12 = "query = ?"
            java.lang.Object r0 = r0.f4627g     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0145 }
            java.lang.String[] r13 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0145 }
            if (r6 != 0) goto L_0x00f2
            goto L_0x0104
        L_0x00f2:
            r14 = 0
            r15 = 0
            r9 = r6
            r10 = r5
            android.database.Cursor r8 = r9.query(r10, r11, r12, r13, r14, r15)     // Catch:{ RemoteException -> 0x00fb }
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "FontsProvider"
            java.lang.String r9 = "Unable to query the content provider"
            android.util.Log.w(r0, r9, r7)     // Catch:{ all -> 0x0145 }
        L_0x0104:
            if (r8 == 0) goto L_0x018d
            int r0 = r8.getCount()     // Catch:{ all -> 0x0145 }
            if (r0 <= 0) goto L_0x018d
            java.lang.String r0 = "result_code"
            int r0 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x0145 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0145 }
            r3.<init>()     // Catch:{ all -> 0x0145 }
            java.lang.String r7 = "_id"
            int r7 = r8.getColumnIndex(r7)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "file_id"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r10 = "font_ttc_index"
            int r10 = r8.getColumnIndex(r10)     // Catch:{ all -> 0x0145 }
            java.lang.String r11 = "font_weight"
            int r11 = r8.getColumnIndex(r11)     // Catch:{ all -> 0x0145 }
            java.lang.String r12 = "font_italic"
            int r12 = r8.getColumnIndex(r12)     // Catch:{ all -> 0x0145 }
        L_0x0135:
            boolean r13 = r8.moveToNext()     // Catch:{ all -> 0x0145 }
            if (r13 == 0) goto L_0x018d
            r13 = -1
            if (r0 == r13) goto L_0x0147
            int r14 = r8.getInt(r0)     // Catch:{ all -> 0x0145 }
            r20 = r14
            goto L_0x0149
        L_0x0145:
            r0 = move-exception
            goto L_0x01a5
        L_0x0147:
            r20 = r4
        L_0x0149:
            if (r10 == r13) goto L_0x0152
            int r14 = r8.getInt(r10)     // Catch:{ all -> 0x0145 }
            r17 = r14
            goto L_0x0154
        L_0x0152:
            r17 = r4
        L_0x0154:
            if (r9 != r13) goto L_0x0161
            long r14 = r8.getLong(r7)     // Catch:{ all -> 0x0145 }
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r5, r14)     // Catch:{ all -> 0x0145 }
        L_0x015e:
            r16 = r14
            goto L_0x016a
        L_0x0161:
            long r14 = r8.getLong(r9)     // Catch:{ all -> 0x0145 }
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r2, r14)     // Catch:{ all -> 0x0145 }
            goto L_0x015e
        L_0x016a:
            if (r11 == r13) goto L_0x0173
            int r14 = r8.getInt(r11)     // Catch:{ all -> 0x0145 }
        L_0x0170:
            r18 = r14
            goto L_0x0176
        L_0x0173:
            r14 = 400(0x190, float:5.6E-43)
            goto L_0x0170
        L_0x0176:
            if (r12 == r13) goto L_0x0181
            int r13 = r8.getInt(r12)     // Catch:{ all -> 0x0145 }
            if (r13 != r1) goto L_0x0181
            r19 = r1
            goto L_0x0183
        L_0x0181:
            r19 = r4
        L_0x0183:
            x.g r13 = new x.g     // Catch:{ all -> 0x0145 }
            r15 = r13
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0145 }
            r3.add(r13)     // Catch:{ all -> 0x0145 }
            goto L_0x0135
        L_0x018d:
            if (r8 == 0) goto L_0x0192
            r8.close()
        L_0x0192:
            if (r6 == 0) goto L_0x0197
            r6.close()
        L_0x0197:
            x.g[] r0 = new x.g[r4]
            java.lang.Object[] r0 = r3.toArray(r0)
            x.g[] r0 = (x.g[]) r0
            F0.y r1 = new F0.y
            r1.<init>((int) r4, (java.lang.Object[]) r0)
            return r1
        L_0x01a5:
            if (r8 == 0) goto L_0x01aa
            r8.close()
        L_0x01aa:
            if (r6 == 0) goto L_0x01af
            r6.close()
        L_0x01af:
            throw r0
        L_0x01b0:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Found content provider "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ", but package was not "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01cc:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r1 = "No package found for authority: "
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x.b.a(android.content.Context, s1.z):F0.y");
    }
}
