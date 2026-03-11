package F1;

import A2.i;
import Y1.b;
import android.content.Context;
import c2.o;
import c2.q;

public final class a implements b, o {

    /* renamed from: f  reason: collision with root package name */
    public q f363f;

    /* renamed from: g  reason: collision with root package name */
    public Context f364g;

    public final void onAttachedToEngine(Y1.a aVar) {
        i.e(aVar, "flutterPluginBinding");
        q qVar = new q(aVar.f1965b, "nb_utils");
        this.f363f = qVar;
        qVar.b(this);
        this.f364g = aVar.f1964a;
    }

    public final void onDetachedFromEngine(Y1.a aVar) {
        i.e(aVar, "binding");
        q qVar = this.f363f;
        if (qVar != null) {
            qVar.b((o) null);
        } else {
            i.g("channel");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r4 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMethodCall(c2.m r68, c2.p r69) {
        /*
            r67 = this;
            r0 = r67
            r1 = r68
            java.lang.String r2 = "call"
            A2.i.e(r1, r2)
            java.lang.String r1 = r1.f2785a
            if (r1 == 0) goto L_0x0017
            int r2 = r1.hashCode()
            r3 = 31
            r4 = 0
            switch(r2) {
                case -1196932856: goto L_0x00fc;
                case -800923529: goto L_0x00e0;
                case 908622356: goto L_0x0035;
                case 1385449135: goto L_0x001a;
                default: goto L_0x0017;
            }
        L_0x0017:
            r4 = r0
            goto L_0x057c
        L_0x001a:
            java.lang.String r2 = "getPlatformVersion"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0023
            goto L_0x0017
        L_0x0023:
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r2 = "Android "
            java.lang.String r1 = A2.h.g(r2, r1)
            r2 = r69
            b2.f r2 = (b2.f) r2
            r2.b(r1)
        L_0x0032:
            r4 = r0
            goto L_0x0583
        L_0x0035:
            java.lang.String r2 = "packageInfo"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003e
            goto L_0x0017
        L_0x003e:
            android.content.Context r1 = r0.f364g
            A2.i.b(r1)
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L_0x0062
            android.content.Context r3 = r0.f364g
            A2.i.b(r3)
            java.lang.String r3 = r3.getPackageName()
            android.content.pm.PackageManager$PackageInfoFlags r4 = android.content.pm.PackageManager.PackageInfoFlags.of(0)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r4)
            A2.i.b(r1)
            goto L_0x0072
        L_0x0062:
            android.content.Context r3 = r0.f364g
            A2.i.b(r3)
            java.lang.String r3 = r3.getPackageName()
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r4)
            A2.i.b(r1)
        L_0x0072:
            android.content.pm.ApplicationInfo r3 = r1.applicationInfo
            int r4 = r3.labelRes
            if (r4 != 0) goto L_0x007f
            java.lang.CharSequence r3 = r3.nonLocalizedLabel
            java.lang.String r3 = r3.toString()
            goto L_0x008b
        L_0x007f:
            android.content.Context r3 = r0.f364g
            A2.i.b(r3)
            java.lang.String r3 = r3.getString(r4)
            A2.i.b(r3)
        L_0x008b:
            p2.c r4 = new p2.c
            java.lang.String r5 = "appName"
            r4.<init>(r5, r3)
            java.lang.String r3 = r1.packageName
            p2.c r5 = new p2.c
            java.lang.String r6 = "packageName"
            r5.<init>(r6, r3)
            java.lang.String r3 = r1.versionName
            p2.c r6 = new p2.c
            java.lang.String r7 = "versionName"
            r6.<init>(r7, r3)
            r3 = 28
            if (r2 < r3) goto L_0x00ad
            long r7 = r1.getLongVersionCode()
            goto L_0x00b0
        L_0x00ad:
            int r1 = r1.versionCode
            long r7 = (long) r1
        L_0x00b0:
            java.lang.String r1 = java.lang.String.valueOf(r7)
            p2.c r3 = new p2.c
            java.lang.String r7 = "versionCode"
            r3.<init>(r7, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            p2.c r2 = new p2.c
            java.lang.String r7 = "androidSDKVersion"
            r2.<init>(r7, r1)
            p2.c[] r1 = new p2.C0363c[]{r4, r5, r6, r3, r2}
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 5
            int r3 = q2.o.a0(r3)
            r2.<init>(r3)
            q2.o.b0(r2, r1)
            r1 = r69
            b2.f r1 = (b2.f) r1
            r1.b(r2)
            goto L_0x0032
        L_0x00e0:
            java.lang.String r2 = "isAndroid12Above"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ea
            goto L_0x0017
        L_0x00ea:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r3) goto L_0x00ef
            r4 = 1
        L_0x00ef:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r2 = r69
            b2.f r2 = (b2.f) r2
            r2.b(r1)
            goto L_0x0032
        L_0x00fc:
            java.lang.String r2 = "materialYouColors"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0106
            goto L_0x0017
        L_0x0106:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 >= r3) goto L_0x010e
            r1 = 0
            r4 = r0
            goto L_0x0574
        L_0x010e:
            r1 = 17170487(0x1060037, float:2.4612067E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r2 = new p2.c
            java.lang.String r3 = "system_accent1_0"
            r2.<init>(r3, r1)
            r1 = 17170488(0x1060038, float:2.461207E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r3 = new p2.c
            java.lang.String r4 = "system_accent1_10"
            r3.<init>(r4, r1)
            r1 = 17170489(0x1060039, float:2.4612073E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r4 = new p2.c
            java.lang.String r5 = "system_accent1_50"
            r4.<init>(r5, r1)
            r1 = 17170490(0x106003a, float:2.4612076E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r5 = new p2.c
            java.lang.String r6 = "system_accent1_100"
            r5.<init>(r6, r1)
            r1 = 17170491(0x106003b, float:2.4612078E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r6 = new p2.c
            java.lang.String r7 = "system_accent1_200"
            r6.<init>(r7, r1)
            r1 = 17170492(0x106003c, float:2.461208E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r7 = new p2.c
            java.lang.String r8 = "system_accent1_300"
            r7.<init>(r8, r1)
            r1 = 17170493(0x106003d, float:2.4612084E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r8 = new p2.c
            java.lang.String r9 = "system_accent1_400"
            r8.<init>(r9, r1)
            r1 = 17170494(0x106003e, float:2.4612087E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r9 = new p2.c
            java.lang.String r10 = "system_accent1_500"
            r9.<init>(r10, r1)
            r1 = 17170495(0x106003f, float:2.461209E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r10 = new p2.c
            java.lang.String r11 = "system_accent1_600"
            r10.<init>(r11, r1)
            r1 = 17170496(0x1060040, float:2.4612092E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r11 = new p2.c
            java.lang.String r12 = "system_accent1_700"
            r11.<init>(r12, r1)
            r1 = 17170497(0x1060041, float:2.4612095E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r12 = new p2.c
            java.lang.String r13 = "system_accent1_800"
            r12.<init>(r13, r1)
            r1 = 17170498(0x1060042, float:2.4612098E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r13 = new p2.c
            java.lang.String r14 = "system_accent1_900"
            r13.<init>(r14, r1)
            r1 = 17170499(0x1060043, float:2.46121E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r14 = new p2.c
            java.lang.String r15 = "system_accent1_1000"
            r14.<init>(r15, r1)
            r1 = 17170500(0x1060044, float:2.4612104E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p2.c r15 = new p2.c
            java.lang.String r0 = "system_accent2_0"
            r15.<init>(r0, r1)
            r0 = 17170501(0x1060045, float:2.4612106E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r68 = r15
            java.lang.String r15 = "system_accent2_10"
            r1.<init>(r15, r0)
            r0 = 17170502(0x1060046, float:2.461211E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r16 = r1
            java.lang.String r1 = "system_accent2_50"
            r15.<init>(r1, r0)
            r0 = 17170503(0x1060047, float:2.4612112E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r17 = r15
            java.lang.String r15 = "system_accent2_100"
            r1.<init>(r15, r0)
            r0 = 17170504(0x1060048, float:2.4612115E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r18 = r1
            java.lang.String r1 = "system_accent2_200"
            r15.<init>(r1, r0)
            r0 = 17170505(0x1060049, float:2.4612118E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r19 = r15
            java.lang.String r15 = "system_accent2_300"
            r1.<init>(r15, r0)
            r0 = 17170506(0x106004a, float:2.461212E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r20 = r1
            java.lang.String r1 = "system_accent2_400"
            r15.<init>(r1, r0)
            r0 = 17170507(0x106004b, float:2.4612123E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r21 = r15
            java.lang.String r15 = "system_accent2_500"
            r1.<init>(r15, r0)
            r0 = 17170508(0x106004c, float:2.4612126E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r22 = r1
            java.lang.String r1 = "system_accent2_600"
            r15.<init>(r1, r0)
            r0 = 17170509(0x106004d, float:2.461213E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r23 = r15
            java.lang.String r15 = "system_accent2_700"
            r1.<init>(r15, r0)
            r0 = 17170510(0x106004e, float:2.4612132E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r24 = r1
            java.lang.String r1 = "system_accent2_800"
            r15.<init>(r1, r0)
            r0 = 17170511(0x106004f, float:2.4612134E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r25 = r15
            java.lang.String r15 = "system_accent2_900"
            r1.<init>(r15, r0)
            r0 = 17170512(0x1060050, float:2.4612137E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r26 = r1
            java.lang.String r1 = "system_accent2_1000"
            r15.<init>(r1, r0)
            r0 = 17170513(0x1060051, float:2.461214E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r27 = r15
            java.lang.String r15 = "system_accent3_0"
            r1.<init>(r15, r0)
            r0 = 17170514(0x1060052, float:2.4612143E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r28 = r1
            java.lang.String r1 = "system_accent3_10"
            r15.<init>(r1, r0)
            r0 = 17170515(0x1060053, float:2.4612146E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r29 = r15
            java.lang.String r15 = "system_accent3_50"
            r1.<init>(r15, r0)
            r0 = 17170516(0x1060054, float:2.4612148E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r30 = r1
            java.lang.String r1 = "system_accent3_100"
            r15.<init>(r1, r0)
            r0 = 17170517(0x1060055, float:2.461215E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r31 = r15
            java.lang.String r15 = "system_accent3_200"
            r1.<init>(r15, r0)
            r0 = 17170518(0x1060056, float:2.4612154E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r32 = r1
            java.lang.String r1 = "system_accent3_300"
            r15.<init>(r1, r0)
            r0 = 17170519(0x1060057, float:2.4612157E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r33 = r15
            java.lang.String r15 = "system_accent3_400"
            r1.<init>(r15, r0)
            r0 = 17170520(0x1060058, float:2.461216E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r34 = r1
            java.lang.String r1 = "system_accent3_500"
            r15.<init>(r1, r0)
            r0 = 17170521(0x1060059, float:2.4612162E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r35 = r15
            java.lang.String r15 = "system_accent3_600"
            r1.<init>(r15, r0)
            r0 = 17170522(0x106005a, float:2.4612165E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r36 = r1
            java.lang.String r1 = "system_accent3_700"
            r15.<init>(r1, r0)
            r0 = 17170523(0x106005b, float:2.4612168E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r37 = r15
            java.lang.String r15 = "system_accent3_800"
            r1.<init>(r15, r0)
            r0 = 17170524(0x106005c, float:2.461217E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r38 = r1
            java.lang.String r1 = "system_accent3_900"
            r15.<init>(r1, r0)
            r0 = 17170525(0x106005d, float:2.4612174E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r39 = r15
            java.lang.String r15 = "system_accent3_1000"
            r1.<init>(r15, r0)
            r0 = 17170461(0x106001d, float:2.4611994E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r40 = r1
            java.lang.String r1 = "system_neutral1_0"
            r15.<init>(r1, r0)
            r0 = 17170462(0x106001e, float:2.4611997E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r41 = r15
            java.lang.String r15 = "system_neutral1_10"
            r1.<init>(r15, r0)
            r0 = 17170463(0x106001f, float:2.4612E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r42 = r1
            java.lang.String r1 = "system_neutral1_50"
            r15.<init>(r1, r0)
            r0 = 17170464(0x1060020, float:2.4612003E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r43 = r15
            java.lang.String r15 = "system_neutral1_100"
            r1.<init>(r15, r0)
            r0 = 17170465(0x1060021, float:2.4612005E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r44 = r1
            java.lang.String r1 = "system_neutral1_200"
            r15.<init>(r1, r0)
            r0 = 17170466(0x1060022, float:2.4612008E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r45 = r15
            java.lang.String r15 = "system_neutral1_300"
            r1.<init>(r15, r0)
            r0 = 17170467(0x1060023, float:2.461201E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r46 = r1
            java.lang.String r1 = "system_neutral1_400"
            r15.<init>(r1, r0)
            r0 = 17170468(0x1060024, float:2.4612014E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r47 = r15
            java.lang.String r15 = "system_neutral1_500"
            r1.<init>(r15, r0)
            r0 = 17170469(0x1060025, float:2.4612017E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r48 = r1
            java.lang.String r1 = "system_neutral1_600"
            r15.<init>(r1, r0)
            r0 = 17170470(0x1060026, float:2.461202E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r49 = r15
            java.lang.String r15 = "system_neutral1_700"
            r1.<init>(r15, r0)
            r0 = 17170471(0x1060027, float:2.4612022E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r50 = r1
            java.lang.String r1 = "system_neutral1_800"
            r15.<init>(r1, r0)
            r0 = 17170472(0x1060028, float:2.4612025E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r51 = r15
            java.lang.String r15 = "system_neutral1_900"
            r1.<init>(r15, r0)
            r0 = 17170473(0x1060029, float:2.4612028E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r52 = r1
            java.lang.String r1 = "system_neutral1_1000"
            r15.<init>(r1, r0)
            r0 = 17170474(0x106002a, float:2.461203E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r53 = r15
            java.lang.String r15 = "system_neutral2_0"
            r1.<init>(r15, r0)
            r0 = 17170475(0x106002b, float:2.4612033E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r54 = r1
            java.lang.String r1 = "system_neutral2_10"
            r15.<init>(r1, r0)
            r0 = 17170476(0x106002c, float:2.4612036E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r55 = r15
            java.lang.String r15 = "system_neutral2_50"
            r1.<init>(r15, r0)
            r0 = 17170477(0x106002d, float:2.461204E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r56 = r1
            java.lang.String r1 = "system_neutral2_100"
            r15.<init>(r1, r0)
            r0 = 17170478(0x106002e, float:2.4612042E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r57 = r15
            java.lang.String r15 = "system_neutral2_200"
            r1.<init>(r15, r0)
            r0 = 17170479(0x106002f, float:2.4612045E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r58 = r1
            java.lang.String r1 = "system_neutral2_300"
            r15.<init>(r1, r0)
            r0 = 17170480(0x1060030, float:2.4612047E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r59 = r15
            java.lang.String r15 = "system_neutral2_400"
            r1.<init>(r15, r0)
            r0 = 17170481(0x1060031, float:2.461205E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r60 = r1
            java.lang.String r1 = "system_neutral2_500"
            r15.<init>(r1, r0)
            r0 = 17170482(0x1060032, float:2.4612053E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r61 = r15
            java.lang.String r15 = "system_neutral2_600"
            r1.<init>(r15, r0)
            r0 = 17170483(0x1060033, float:2.4612056E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r62 = r1
            java.lang.String r1 = "system_neutral2_700"
            r15.<init>(r1, r0)
            r0 = 17170484(0x1060034, float:2.461206E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r63 = r15
            java.lang.String r15 = "system_neutral2_800"
            r1.<init>(r15, r0)
            r0 = 17170485(0x1060035, float:2.4612062E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r15 = new p2.c
            r64 = r1
            java.lang.String r1 = "system_neutral2_900"
            r15.<init>(r1, r0)
            r0 = 17170486(0x1060036, float:2.4612064E-38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            p2.c r1 = new p2.c
            r65 = r15
            java.lang.String r15 = "system_neutral2_1000"
            r1.<init>(r15, r0)
            r0 = r17
            r15 = r68
            r66 = r1
            p2.c[] r0 = new p2.C0363c[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 65
            int r2 = q2.o.a0(r2)
            r1.<init>(r2)
            q2.o.b0(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r1.size()
            r0.<init>(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x052b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x056e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4 = r67
            android.content.Context r5 = r4.f364g
            A2.i.b(r5)
            android.content.res.Resources r5 = r5.getResources()
            android.content.Context r6 = r4.f364g
            A2.i.b(r6)
            android.content.res.Resources$Theme r6 = r6.getTheme()
            java.lang.Object r7 = s.g.f4469a
            int r2 = s.f.a(r5, r2, r6)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            p2.c r5 = new p2.c
            r5.<init>(r3, r2)
            r0.add(r5)
            goto L_0x052b
        L_0x056e:
            r4 = r67
            java.util.Map r1 = q2.o.c0(r0)
        L_0x0574:
            r0 = r69
            b2.f r0 = (b2.f) r0
            r0.b(r1)
            goto L_0x0583
        L_0x057c:
            r0 = r69
            b2.f r0 = (b2.f) r0
            r0.c()
        L_0x0583:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.a.onMethodCall(c2.m, c2.p):void");
    }
}
