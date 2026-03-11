package D0;

import K0.b;
import M0.c;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f201a = 12451000;

    static {
        AtomicBoolean atomicBoolean = f.f202a;
    }

    public Intent a(int i3, Context context, String str) {
        if (i3 == 1 || i3 == 2) {
            if (context == null || !b.c(context)) {
                StringBuilder sb = new StringBuilder("gcore_");
                sb.append(f201a);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        M0.b a2 = c.a(context);
                        sb.append(a2.f1087a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i3 != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x023c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x023d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(android.content.Context r13, int r14) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r2 = D0.f.f202a
            android.content.res.Resources r2 = r13.getResources()     // Catch:{ all -> 0x000f }
            r3 = 2131623980(0x7f0e002c, float:1.8875127E38)
            r2.getString(r3)     // Catch:{ all -> 0x000f }
            goto L_0x0016
        L_0x000f:
            java.lang.String r2 = "GooglePlayServicesUtil"
            java.lang.String r3 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r2, r3)
        L_0x0016:
            java.lang.String r2 = r13.getPackageName()
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x009f
            java.util.concurrent.atomic.AtomicBoolean r2 = D0.f.f203b
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x002c
            goto L_0x009f
        L_0x002c:
            java.lang.Object r2 = G0.o.f433a
            monitor-enter(r2)
            boolean r3 = G0.o.f434b     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0037
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x006a
        L_0x0035:
            r13 = move-exception
            goto L_0x009d
        L_0x0037:
            G0.o.f434b = r0     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = r13.getPackageName()     // Catch:{ all -> 0x0035 }
            M0.b r4 = M0.c.a(r13)     // Catch:{ all -> 0x0035 }
            android.content.Context r4 = r4.f1087a     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0061 }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo(r3, r5)     // Catch:{ NameNotFoundException -> 0x0061 }
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r3 != 0) goto L_0x0053
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x006a
        L_0x0053:
            java.lang.String r4 = "com.google.app.id"
            r3.getString(r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = "com.google.android.gms.version"
            int r3 = r3.getInt(r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            G0.o.f435c = r3     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r3 = move-exception
            java.lang.String r4 = "MetadataValueReader"
            java.lang.String r5 = "This should never happen."
            android.util.Log.wtf(r4, r5, r3)     // Catch:{ all -> 0x0035 }
        L_0x0069:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
        L_0x006a:
            int r2 = G0.o.f435c
            if (r2 == 0) goto L_0x0097
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r2 != r3) goto L_0x0074
            goto L_0x009f
        L_0x0074:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r13 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            int r14 = f201a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = " but found "
            r0.append(r14)
            r0.append(r2)
            java.lang.String r14 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        L_0x0097:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r13 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r13.<init>()
            throw r13
        L_0x009d:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r13
        L_0x009f:
            boolean r2 = K0.b.c(r13)
            if (r2 != 0) goto L_0x00d4
            java.lang.Boolean r2 = K0.b.f855d
            if (r2 != 0) goto L_0x00ca
            android.content.pm.PackageManager r2 = r13.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 != 0) goto L_0x00c1
            android.content.pm.PackageManager r2 = r13.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L_0x00c3
        L_0x00c1:
            r2 = r0
            goto L_0x00c4
        L_0x00c3:
            r2 = r1
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            K0.b.f855d = r2
        L_0x00ca:
            java.lang.Boolean r2 = K0.b.f855d
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x00d4
            r2 = r0
            goto L_0x00d5
        L_0x00d4:
            r2 = r1
        L_0x00d5:
            if (r14 < 0) goto L_0x023e
            java.lang.String r3 = r13.getPackageName()
            android.content.pm.PackageManager r4 = r13.getPackageManager()
            r5 = 9
            if (r2 == 0) goto L_0x00fd
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00ec }
            goto L_0x00fe
        L_0x00ec:
            java.lang.String r14 = java.lang.String.valueOf(r3)
            java.lang.String r2 = " requires the Google Play Store, but it is missing."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r14 = r14.concat(r2)
            android.util.Log.w(r3, r14)
            goto L_0x01fb
        L_0x00fd:
            r6 = 0
        L_0x00fe:
            java.lang.String r7 = "com.google.android.gms"
            r8 = 64
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x01eb }
            java.lang.Class<D0.g> r8 = D0.g.class
            monitor-enter(r8)
            D0.g r9 = D0.g.f205g     // Catch:{ all -> 0x0133 }
            if (r9 != 0) goto L_0x0138
            D0.k r9 = D0.o.f217a     // Catch:{ all -> 0x0133 }
            java.lang.Class<D0.o> r9 = D0.o.class
            monitor-enter(r9)     // Catch:{ all -> 0x0133 }
            android.content.Context r10 = D0.o.f219c     // Catch:{ all -> 0x011e }
            if (r10 != 0) goto L_0x0120
            android.content.Context r10 = r13.getApplicationContext()     // Catch:{ all -> 0x011e }
            D0.o.f219c = r10     // Catch:{ all -> 0x011e }
            monitor-exit(r9)     // Catch:{ all -> 0x0133 }
            goto L_0x0128
        L_0x011e:
            r13 = move-exception
            goto L_0x0136
        L_0x0120:
            java.lang.String r10 = "GoogleCertificates"
            java.lang.String r11 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x011e }
            monitor-exit(r9)     // Catch:{ all -> 0x0133 }
        L_0x0128:
            D0.g r9 = new D0.g     // Catch:{ all -> 0x0133 }
            r9.<init>(r1, r1)     // Catch:{ all -> 0x0133 }
            r13.getApplicationContext()     // Catch:{ all -> 0x0133 }
            D0.g.f205g = r9     // Catch:{ all -> 0x0133 }
            goto L_0x0138
        L_0x0133:
            r13 = move-exception
            goto L_0x01e9
        L_0x0136:
            monitor-exit(r9)     // Catch:{ all -> 0x011e }
            throw r13     // Catch:{ all -> 0x0133 }
        L_0x0138:
            monitor-exit(r8)     // Catch:{ all -> 0x0133 }
            boolean r8 = D0.g.q(r7)
            if (r8 != 0) goto L_0x0150
            java.lang.String r14 = java.lang.String.valueOf(r3)
            java.lang.String r2 = " requires Google Play services, but their signature is invalid."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r14 = r14.concat(r2)
            android.util.Log.w(r3, r14)
            goto L_0x01fb
        L_0x0150:
            if (r2 == 0) goto L_0x016c
            G0.o.e(r6)
            boolean r8 = D0.g.q(r6)
            if (r8 != 0) goto L_0x016c
            java.lang.String r14 = java.lang.String.valueOf(r3)
            java.lang.String r2 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r14 = r14.concat(r2)
            android.util.Log.w(r3, r14)
            goto L_0x01fb
        L_0x016c:
            if (r2 == 0) goto L_0x018f
            if (r6 == 0) goto L_0x018f
            android.content.pm.Signature[] r2 = r6.signatures
            r2 = r2[r1]
            android.content.pm.Signature[] r6 = r7.signatures
            r6 = r6[r1]
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x018f
            java.lang.String r14 = java.lang.String.valueOf(r3)
            java.lang.String r2 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r14 = r14.concat(r2)
            android.util.Log.w(r3, r14)
            goto L_0x01fb
        L_0x018f:
            int r2 = r7.versionCode
            r5 = -1
            if (r2 != r5) goto L_0x0196
            r6 = r5
            goto L_0x0198
        L_0x0196:
            int r6 = r2 / 1000
        L_0x0198:
            if (r14 != r5) goto L_0x019b
            goto L_0x019d
        L_0x019b:
            int r5 = r14 / 1000
        L_0x019d:
            if (r6 >= r5) goto L_0x01c4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Google Play services out of date for "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = ".  Requires "
            r4.append(r3)
            r4.append(r14)
            java.lang.String r14 = " but found "
            r4.append(r14)
            r4.append(r2)
            java.lang.String r14 = r4.toString()
            java.lang.String r2 = "GooglePlayServicesUtil"
            android.util.Log.w(r2, r14)
            r5 = 2
            goto L_0x01fb
        L_0x01c4:
            android.content.pm.ApplicationInfo r14 = r7.applicationInfo
            if (r14 != 0) goto L_0x01e1
            java.lang.String r14 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r14 = r4.getApplicationInfo(r14, r1)     // Catch:{ NameNotFoundException -> 0x01cf }
            goto L_0x01e1
        L_0x01cf:
            r14 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r4 = "GooglePlayServicesUtil"
            java.lang.String r2 = r2.concat(r3)
            android.util.Log.wtf(r4, r2, r14)
        L_0x01df:
            r5 = r0
            goto L_0x01fb
        L_0x01e1:
            boolean r14 = r14.enabled
            if (r14 != 0) goto L_0x01e7
            r5 = 3
            goto L_0x01fb
        L_0x01e7:
            r5 = r1
            goto L_0x01fb
        L_0x01e9:
            monitor-exit(r8)     // Catch:{ all -> 0x0133 }
            throw r13
        L_0x01eb:
            java.lang.String r14 = java.lang.String.valueOf(r3)
            java.lang.String r2 = " requires Google Play services, but they are missing."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r14 = r14.concat(r2)
            android.util.Log.w(r3, r14)
            goto L_0x01df
        L_0x01fb:
            r14 = 18
            if (r5 != r14) goto L_0x0200
            goto L_0x023a
        L_0x0200:
            if (r5 != r0) goto L_0x0239
            android.content.pm.PackageManager r2 = r13.getPackageManager()     // Catch:{ Exception -> 0x0239 }
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch:{ Exception -> 0x0239 }
            java.util.List r2 = r2.getAllSessions()     // Catch:{ Exception -> 0x0239 }
            java.util.Iterator r2 = r2.iterator()
        L_0x0212:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "com.google.android.gms"
            if (r3 == 0) goto L_0x022b
            java.lang.Object r3 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0212
            goto L_0x023a
        L_0x022b:
            android.content.pm.PackageManager r13 = r13.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r13 = r13.getApplicationInfo(r4, r0)     // Catch:{  }
            boolean r13 = r13.enabled     // Catch:{  }
            r0 = r13
            goto L_0x023a
        L_0x0239:
            r0 = r1
        L_0x023a:
            if (r0 == 0) goto L_0x023d
            return r14
        L_0x023d:
            return r5
        L_0x023e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.e.b(android.content.Context, int):int");
    }
}
