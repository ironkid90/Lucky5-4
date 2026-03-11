package P1;

import A2.i;
import Y1.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import c2.o;
import c2.q;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import q2.C0400c;

public final class a implements o, b {

    /* renamed from: f  reason: collision with root package name */
    public Context f1241f;

    /* renamed from: g  reason: collision with root package name */
    public q f1242g;

    public static String b(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(bArr);
        byte[] digest = instance.digest();
        i.b(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(digest.length * 2)];
        int length = digest.length;
        for (int i3 = 0; i3 < length; i3++) {
            byte b3 = digest[i3];
            int i4 = i3 * 2;
            cArr2[i4] = cArr[(b3 & 255) >>> 4];
            cArr2[i4 + 1] = cArr[b3 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f1241f;
                i.b(context);
                SigningInfo c3 = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (c3 == null) {
                    return null;
                }
                if (c3.hasMultipleSigners()) {
                    Signature[] w3 = c3.getApkContentsSigners();
                    i.d(w3, "getApkContentsSigners(...)");
                    byte[] byteArray = ((Signature) C0400c.K(w3)).toByteArray();
                    i.d(byteArray, "toByteArray(...)");
                    return b(byteArray);
                }
                Signature[] A3 = c3.getSigningCertificateHistory();
                i.d(A3, "getSigningCertificateHistory(...)");
                byte[] byteArray2 = ((Signature) C0400c.K(A3)).toByteArray();
                i.d(byteArray2, "toByteArray(...)");
                return b(byteArray2);
            }
            Context context2 = this.f1241f;
            i.b(context2);
            Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return null;
            }
            if (signatureArr.length == 0) {
                return null;
            }
            if (C0400c.K(signatureArr) == null) {
                return null;
            }
            byte[] byteArray3 = ((Signature) C0400c.K(signatureArr)).toByteArray();
            i.d(byteArray3, "toByteArray(...)");
            return b(byteArray3);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final void onAttachedToEngine(Y1.a aVar) {
        i.e(aVar, "binding");
        this.f1241f = aVar.f1964a;
        q qVar = new q(aVar.f1965b, "dev.fluttercommunity.plus/package_info");
        this.f1242g = qVar;
        qVar.b(this);
    }

    public final void onDetachedFromEngine(Y1.a aVar) {
        i.e(aVar, "binding");
        this.f1241f = null;
        q qVar = this.f1242g;
        i.b(qVar);
        qVar.b((o) null);
        this.f1242g = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087 A[Catch:{ NameNotFoundException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088 A[Catch:{ NameNotFoundException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092 A[Catch:{ NameNotFoundException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097 A[Catch:{ NameNotFoundException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3 A[Catch:{ NameNotFoundException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[Catch:{ NameNotFoundException -> 0x006d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMethodCall(c2.m r13, c2.p r14) {
        /*
            r12 = this;
            java.lang.String r0 = "call"
            A2.i.e(r13, r0)
            java.lang.String r13 = r13.f2785a     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r0 = "getAll"
            boolean r13 = A2.i.a(r13, r0)     // Catch:{ NameNotFoundException -> 0x006d }
            if (r13 == 0) goto L_0x00c8
            android.content.Context r13 = r12.f1241f     // Catch:{ NameNotFoundException -> 0x006d }
            A2.i.b(r13)     // Catch:{ NameNotFoundException -> 0x006d }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006d }
            android.content.Context r0 = r12.f1241f     // Catch:{ NameNotFoundException -> 0x006d }
            A2.i.b(r0)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x006d }
            r1 = 0
            android.content.pm.PackageInfo r0 = r13.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r1 = r12.a(r13)     // Catch:{ NameNotFoundException -> 0x006d }
            android.content.Context r2 = r12.f1241f     // Catch:{ NameNotFoundException -> 0x006d }
            A2.i.b(r2)     // Catch:{ NameNotFoundException -> 0x006d }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006d }
            android.content.Context r3 = r12.f1241f     // Catch:{ NameNotFoundException -> 0x006d }
            A2.i.b(r3)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x006d }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x006d }
            r5 = 30
            if (r4 < r5) goto L_0x004b
            android.content.pm.InstallSourceInfo r2 = r2.getInstallSourceInfo(r3)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r2 = r2.getInitiatingPackageName()     // Catch:{ NameNotFoundException -> 0x006d }
            goto L_0x004f
        L_0x004b:
            java.lang.String r2 = r2.getInstallerPackageName(r3)     // Catch:{ NameNotFoundException -> 0x006d }
        L_0x004f:
            long r5 = r0.firstInstallTime     // Catch:{ NameNotFoundException -> 0x006d }
            long r7 = r0.lastUpdateTime     // Catch:{ NameNotFoundException -> 0x006d }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ NameNotFoundException -> 0x006d }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r9 = "appName"
            android.content.pm.ApplicationInfo r10 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x006f
            java.lang.CharSequence r13 = r10.loadLabel(r13)     // Catch:{ NameNotFoundException -> 0x006d }
            if (r13 == 0) goto L_0x006f
            java.lang.String r13 = r13.toString()     // Catch:{ NameNotFoundException -> 0x006d }
            if (r13 != 0) goto L_0x0070
            goto L_0x006f
        L_0x006d:
            r13 = move-exception
            goto L_0x00cf
        L_0x006f:
            r13 = r11
        L_0x0070:
            r3.put(r9, r13)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r13 = "packageName"
            android.content.Context r9 = r12.f1241f     // Catch:{ NameNotFoundException -> 0x006d }
            A2.i.b(r9)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r9 = r9.getPackageName()     // Catch:{ NameNotFoundException -> 0x006d }
            r3.put(r13, r9)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r13 = "version"
            java.lang.String r9 = r0.versionName     // Catch:{ NameNotFoundException -> 0x006d }
            if (r9 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r11 = r9
        L_0x0089:
            r3.put(r13, r11)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r13 = "buildNumber"
            r9 = 28
            if (r4 < r9) goto L_0x0097
            long r9 = r0.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x006d }
            goto L_0x009a
        L_0x0097:
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x006d }
            long r9 = (long) r0     // Catch:{ NameNotFoundException -> 0x006d }
        L_0x009a:
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ NameNotFoundException -> 0x006d }
            r3.put(r13, r0)     // Catch:{ NameNotFoundException -> 0x006d }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r13 = "buildSignature"
            r3.put(r13, r1)     // Catch:{ NameNotFoundException -> 0x006d }
        L_0x00a8:
            if (r2 == 0) goto L_0x00af
            java.lang.String r13 = "installerStore"
            r3.put(r13, r2)     // Catch:{ NameNotFoundException -> 0x006d }
        L_0x00af:
            java.lang.String r13 = "installTime"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ NameNotFoundException -> 0x006d }
            r3.put(r13, r0)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r13 = "updateTime"
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ NameNotFoundException -> 0x006d }
            r3.put(r13, r0)     // Catch:{ NameNotFoundException -> 0x006d }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ NameNotFoundException -> 0x006d }
            r13.b(r3)     // Catch:{ NameNotFoundException -> 0x006d }
            goto L_0x00db
        L_0x00c8:
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ NameNotFoundException -> 0x006d }
            r13.c()     // Catch:{ NameNotFoundException -> 0x006d }
            goto L_0x00db
        L_0x00cf:
            java.lang.String r13 = r13.getMessage()
            java.lang.String r0 = "Name not found"
            b2.f r14 = (b2.f) r14
            r1 = 0
            r14.a(r0, r13, r1)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.a.onMethodCall(c2.m, c2.p):void");
    }
}
