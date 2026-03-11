package G1;

import A2.i;
import S1.C0078d;
import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import c2.o;
import c2.p;
import c2.q;
import c2.s;
import java.util.LinkedHashMap;

public final class b implements o, s {

    /* renamed from: f  reason: collision with root package name */
    public final Context f474f;

    /* renamed from: g  reason: collision with root package name */
    public final a f475g;

    /* renamed from: h  reason: collision with root package name */
    public q f476h;

    /* renamed from: i  reason: collision with root package name */
    public C0078d f477i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f478j = new LinkedHashMap();

    public b(Context context, a aVar) {
        i.e(context, "context");
        this.f474f = context;
        this.f475g = aVar;
    }

    public final Activity a() {
        C0078d dVar = this.f477i;
        if (dVar != null) {
            return dVar;
        }
        throw new Exception("Cannot call method because Activity is not attached to FlutterEngine.");
    }

    public final boolean onActivityResult(int i3, int i4, Intent intent) {
        boolean z3;
        p pVar = (p) this.f478j.get(Integer.valueOf(i3));
        if (pVar == null) {
            return true;
        }
        Context context = this.f474f;
        switch (i3) {
            case 200:
                i.e(context, "context");
                Object systemService = context.getSystemService("power");
                i.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                pVar.b(Boolean.valueOf(((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName())));
                break;
            case 201:
                i.e(context, "context");
                Object systemService2 = context.getSystemService("power");
                i.c(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
                pVar.b(Boolean.valueOf(((PowerManager) systemService2).isIgnoringBatteryOptimizations(context.getPackageName())));
                break;
            case 202:
                i.e(context, "context");
                pVar.b(Boolean.valueOf(Settings.canDrawOverlays(context)));
                break;
            case 203:
                i.e(context, "context");
                if (Build.VERSION.SDK_INT >= 31) {
                    Object systemService3 = context.getSystemService("alarm");
                    i.c(systemService3, "null cannot be cast to non-null type android.app.AlarmManager");
                    z3 = ((AlarmManager) systemService3).canScheduleExactAlarms();
                } else {
                    z3 = true;
                }
                pVar.b(Boolean.valueOf(z3));
                break;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0290 A[Catch:{ Exception -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0291 A[Catch:{ Exception -> 0x005a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMethodCall(c2.m r17, c2.p r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "activity"
            java.lang.String r4 = "call"
            A2.i.e(r0, r4)
            java.lang.String r5 = r0.f2785a     // Catch:{ Exception -> 0x005a }
            if (r5 == 0) goto L_0x03ed
            int r6 = r5.hashCode()     // Catch:{ Exception -> 0x005a }
            java.util.LinkedHashMap r7 = r1.f478j
            G1.a r8 = r1.f475g
            java.lang.String r9 = "notificationPermissionManager"
            java.lang.String r12 = "android.permission.POST_NOTIFICATIONS"
            r14 = 31
            java.lang.String r15 = "null cannot be cast to non-null type android.os.PowerManager"
            java.lang.String r11 = "power"
            java.lang.String r4 = "package:"
            java.lang.String r13 = "context"
            android.content.Context r10 = r1.f474f
            java.lang.Object r0 = r0.f2786b
            switch(r6) {
                case -2070189206: goto L_0x03b4;
                case -1401626951: goto L_0x0364;
                case -958428903: goto L_0x032d;
                case -917901449: goto L_0x0310;
                case -843699029: goto L_0x02e7;
                case -830276983: goto L_0x02a8;
                case -802694078: goto L_0x024b;
                case -675127954: goto L_0x01fe;
                case -386121002: goto L_0x01c7;
                case 310881216: goto L_0x01aa;
                case 481665446: goto L_0x0190;
                case 488202668: goto L_0x0176;
                case 677170851: goto L_0x0162;
                case 699379795: goto L_0x0148;
                case 827196186: goto L_0x0118;
                case 1246965586: goto L_0x00fa;
                case 1263333587: goto L_0x00dd;
                case 1465118721: goto L_0x00ba;
                case 1616958905: goto L_0x0077;
                case 1849706483: goto L_0x005d;
                case 2079768210: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x03ed
        L_0x0030:
            java.lang.String r0 = "isIgnoringBatteryOptimizations"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x003a
            goto L_0x03ed
        L_0x003a:
            A2.i.e(r10, r13)     // Catch:{ Exception -> 0x005a }
            java.lang.Object r0 = r10.getSystemService(r11)     // Catch:{ Exception -> 0x005a }
            A2.i.c(r0, r15)     // Catch:{ Exception -> 0x005a }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = r10.getPackageName()     // Catch:{ Exception -> 0x005a }
            boolean r0 = r0.isIgnoringBatteryOptimizations(r3)     // Catch:{ Exception -> 0x005a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x005a:
            r0 = move-exception
            goto L_0x03f4
        L_0x005d:
            java.lang.String r3 = "startService"
            boolean r3 = r5.equals(r3)     // Catch:{ Exception -> 0x005a }
            if (r3 != 0) goto L_0x0067
            goto L_0x03ed
        L_0x0067:
            r8.a()     // Catch:{ Exception -> 0x005a }
            D0.g.m(r10, r0)     // Catch:{ Exception -> 0x005a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x0077:
            java.lang.String r0 = "openAlarmsAndRemindersSettings"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0081
            goto L_0x03ed
        L_0x0081:
            android.app.Activity r0 = r16.a()     // Catch:{ Exception -> 0x005a }
            r3 = 203(0xcb, float:2.84E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x005a }
            r7.put(r5, r2)     // Catch:{ Exception -> 0x005a }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005a }
            if (r5 < r14) goto L_0x00b2
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            r6.<init>(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r0.getPackageName()     // Catch:{ Exception -> 0x005a }
            r6.append(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x005a }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM"
            r5.<init>(r6, r4)     // Catch:{ Exception -> 0x005a }
            r0.startActivityForResult(r5, r3)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x00b2:
            H1.a r0 = new H1.a     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = "only supports Android 12.0+"
            r0.<init>(r3)     // Catch:{ Exception -> 0x005a }
            throw r0     // Catch:{ Exception -> 0x005a }
        L_0x00ba:
            java.lang.String r0 = "openIgnoreBatteryOptimizationSettings"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x00c4
            goto L_0x03ed
        L_0x00c4:
            android.app.Activity r0 = r16.a()     // Catch:{ Exception -> 0x005a }
            r3 = 201(0xc9, float:2.82E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x005a }
            r7.put(r4, r2)     // Catch:{ Exception -> 0x005a }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x005a }
            java.lang.String r5 = "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"
            r4.<init>(r5)     // Catch:{ Exception -> 0x005a }
            r0.startActivityForResult(r4, r3)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x00dd:
            java.lang.String r0 = "attachedActivity"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x00e7
            goto L_0x03ed
        L_0x00e7:
            S1.d r0 = r1.f477i     // Catch:{ Exception -> 0x005a }
            if (r0 == 0) goto L_0x00ed
            r10 = 1
            goto L_0x00ee
        L_0x00ed:
            r10 = 0
        L_0x00ee:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x00fa:
            java.lang.String r3 = "sendData"
            boolean r3 = r5.equals(r3)     // Catch:{ Exception -> 0x005a }
            if (r3 != 0) goto L_0x0104
            goto L_0x03ed
        L_0x0104:
            r8.a()     // Catch:{ Exception -> 0x005a }
            if (r0 == 0) goto L_0x0406
            L2.p r0 = J1.a.f802f     // Catch:{ Exception -> 0x005a }
            L2.s r0 = r0.f1055f     // Catch:{ Exception -> 0x005a }
            java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x005a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x005a }
            r0.getClass()     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x0118:
            java.lang.String r0 = "canScheduleExactAlarms"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0122
            goto L_0x03ed
        L_0x0122:
            A2.i.e(r10, r13)     // Catch:{ Exception -> 0x005a }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005a }
            if (r0 < r14) goto L_0x013b
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r10.getSystemService(r0)     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = "null cannot be cast to non-null type android.app.AlarmManager"
            A2.i.c(r0, r3)     // Catch:{ Exception -> 0x005a }
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0     // Catch:{ Exception -> 0x005a }
            boolean r10 = r0.canScheduleExactAlarms()     // Catch:{ Exception -> 0x005a }
            goto L_0x013c
        L_0x013b:
            r10 = 1
        L_0x013c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x0148:
            java.lang.String r0 = "stopService"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0152
            goto L_0x03ed
        L_0x0152:
            r8.a()     // Catch:{ Exception -> 0x005a }
            D0.g.n(r10)     // Catch:{ Exception -> 0x005a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x0162:
            java.lang.String r0 = "minimizeApp"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x016c
            goto L_0x03ed
        L_0x016c:
            android.app.Activity r0 = r16.a()     // Catch:{ Exception -> 0x005a }
            r4 = 1
            r0.moveTaskToBack(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x0176:
            java.lang.String r3 = "updateService"
            boolean r3 = r5.equals(r3)     // Catch:{ Exception -> 0x005a }
            if (r3 != 0) goto L_0x0180
            goto L_0x03ed
        L_0x0180:
            r8.a()     // Catch:{ Exception -> 0x005a }
            D0.g.o(r10, r0)     // Catch:{ Exception -> 0x005a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x0190:
            java.lang.String r0 = "restartService"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x019a
            goto L_0x03ed
        L_0x019a:
            r8.a()     // Catch:{ Exception -> 0x005a }
            D0.g.k(r10)     // Catch:{ Exception -> 0x005a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x01aa:
            java.lang.String r0 = "isRunningService"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x01b4
            goto L_0x03ed
        L_0x01b4:
            r8.a()     // Catch:{ Exception -> 0x005a }
            boolean r0 = D0.g.j()     // Catch:{ Exception -> 0x005a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x01c7:
            java.lang.String r0 = "openSystemAlertWindowSettings"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x01d1
            goto L_0x03ed
        L_0x01d1:
            android.app.Activity r0 = r16.a()     // Catch:{ Exception -> 0x005a }
            r3 = 202(0xca, float:2.83E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x005a }
            r7.put(r5, r2)     // Catch:{ Exception -> 0x005a }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            r6.<init>(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r0.getPackageName()     // Catch:{ Exception -> 0x005a }
            r6.append(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x005a }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            r5.<init>(r6, r4)     // Catch:{ Exception -> 0x005a }
            r0.startActivityForResult(r5, r3)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x01fe:
            r4 = 1
            java.lang.String r3 = "launchApp"
            boolean r3 = r5.equals(r3)     // Catch:{ Exception -> 0x005a }
            if (r3 != 0) goto L_0x0209
            goto L_0x03ed
        L_0x0209:
            if (r0 != 0) goto L_0x020d
            r3 = r4
            goto L_0x020f
        L_0x020d:
            boolean r3 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x005a }
        L_0x020f:
            if (r3 == 0) goto L_0x0406
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x005a }
            A2.i.e(r10, r13)     // Catch:{ Exception -> 0x005a }
            android.content.pm.PackageManager r3 = r10.getPackageManager()     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r10.getPackageName()     // Catch:{ Exception -> 0x005a }
            android.content.Intent r3 = r3.getLaunchIntentForPackage(r4)     // Catch:{ Exception -> 0x005a }
            if (r3 == 0) goto L_0x0406
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r4)     // Catch:{ Exception -> 0x005a }
            if (r0 == 0) goto L_0x0230
            java.lang.String r4 = "route"
            r3.putExtra(r4, r0)     // Catch:{ Exception -> 0x005a }
        L_0x0230:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005a }
            r4 = 34
            if (r0 < r4) goto L_0x0246
            android.app.ActivityOptions r0 = android.app.ActivityOptions.makeBasic()     // Catch:{ Exception -> 0x005a }
            r0.setPendingIntentBackgroundActivityStartMode(1)     // Catch:{ Exception -> 0x005a }
            android.os.Bundle r0 = r0.toBundle()     // Catch:{ Exception -> 0x005a }
            r10.startActivity(r3, r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x0246:
            r10.startActivity(r3)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x024b:
            java.lang.String r0 = "checkNotificationPermission"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0255
            goto L_0x03ed
        L_0x0255:
            android.app.Activity r0 = r16.a()     // Catch:{ Exception -> 0x005a }
            J1.b r3 = r8.f470f     // Catch:{ Exception -> 0x005a }
            if (r3 == 0) goto L_0x02a3
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005a }
            I1.b r4 = I1.b.f709f
            r5 = 33
            if (r3 >= r5) goto L_0x0266
            goto L_0x0293
        L_0x0266:
            int r3 = r.C0414g.a(r0, r12)     // Catch:{ Exception -> 0x005a }
            if (r3 != 0) goto L_0x026d
            goto L_0x0293
        L_0x026d:
            java.lang.String r3 = "com.pravera.flutter_foreground_task.prefs.NOTIFICATION_PERMISSION_STATUS"
            r4 = 0
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r4)     // Catch:{ Exception -> 0x005a }
            if (r3 != 0) goto L_0x0278
        L_0x0276:
            r3 = 0
            goto L_0x0284
        L_0x0278:
            r4 = 0
            java.lang.String r3 = r3.getString(r12, r4)     // Catch:{ Exception -> 0x005a }
            if (r3 != 0) goto L_0x0280
            goto L_0x0276
        L_0x0280:
            I1.b r3 = I1.b.valueOf(r3)     // Catch:{ Exception -> 0x005a }
        L_0x0284:
            if (r3 == 0) goto L_0x0291
            I1.b r4 = I1.b.f711h     // Catch:{ Exception -> 0x005a }
            if (r3 != r4) goto L_0x0291
            boolean r0 = r0.shouldShowRequestPermissionRationale(r12)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0291
            goto L_0x0293
        L_0x0291:
            I1.b r4 = I1.b.f710g     // Catch:{ Exception -> 0x005a }
        L_0x0293:
            int r0 = r4.ordinal()     // Catch:{ Exception -> 0x005a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x02a3:
            A2.i.g(r9)     // Catch:{ Exception -> 0x005a }
            r3 = 0
            throw r3     // Catch:{ Exception -> 0x005a }
        L_0x02a8:
            java.lang.String r0 = "requestNotificationPermission"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x02b2
            goto L_0x03ed
        L_0x02b2:
            android.app.Activity r0 = r16.a()     // Catch:{ Exception -> 0x005a }
            F0.h r3 = new F0.h     // Catch:{ Exception -> 0x005a }
            r4 = r2
            b2.f r4 = (b2.f) r4     // Catch:{ Exception -> 0x005a }
            r5 = 2
            r3.<init>((int) r5, (java.lang.Object) r4)     // Catch:{ Exception -> 0x005a }
            J1.b r5 = r8.f470f     // Catch:{ Exception -> 0x005a }
            if (r5 == 0) goto L_0x02e2
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005a }
            r7 = 33
            if (r6 >= r7) goto L_0x02d3
            r6 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x005a }
            r4.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x02d3:
            r5.f803f = r0     // Catch:{ Exception -> 0x005a }
            r5.f804g = r3     // Catch:{ Exception -> 0x005a }
            java.lang.String[] r3 = new java.lang.String[]{r12}     // Catch:{ Exception -> 0x005a }
            r4 = 100
            q.C0374d.c(r0, r3, r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x02e2:
            A2.i.g(r9)     // Catch:{ Exception -> 0x005a }
            r3 = 0
            throw r3     // Catch:{ Exception -> 0x005a }
        L_0x02e7:
            java.lang.String r0 = "wakeUpScreen"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x02f1
            goto L_0x03ed
        L_0x02f1:
            A2.i.e(r10, r13)     // Catch:{ Exception -> 0x005a }
            java.lang.Object r0 = r10.getSystemService(r11)     // Catch:{ Exception -> 0x005a }
            A2.i.c(r0, r15)     // Catch:{ Exception -> 0x005a }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = "PluginUtils:WakeLock"
            r4 = 805306378(0x3000000a, float:4.6566184E-10)
            android.os.PowerManager$WakeLock r0 = r0.newWakeLock(r4, r3)     // Catch:{ Exception -> 0x005a }
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.acquire(r3)     // Catch:{ Exception -> 0x005a }
            r0.release()     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x0310:
            java.lang.String r0 = "canDrawOverlays"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x031a
            goto L_0x03ed
        L_0x031a:
            A2.i.e(r10, r13)     // Catch:{ Exception -> 0x005a }
            boolean r0 = android.provider.Settings.canDrawOverlays(r10)     // Catch:{ Exception -> 0x005a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x032d:
            java.lang.String r0 = "requestIgnoreBatteryOptimization"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0337
            goto L_0x03ed
        L_0x0337:
            android.app.Activity r0 = r16.a()     // Catch:{ Exception -> 0x005a }
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x005a }
            r7.put(r5, r2)     // Catch:{ Exception -> 0x005a }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            r6.<init>(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r0.getPackageName()     // Catch:{ Exception -> 0x005a }
            r6.append(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x005a }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            r5.<init>(r6, r4)     // Catch:{ Exception -> 0x005a }
            r0.startActivityForResult(r5, r3)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x0364:
            r4 = 1
            r6 = 0
            java.lang.String r0 = "isAppOnForeground"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0370
            goto L_0x03ed
        L_0x0370:
            A2.i.e(r10, r13)     // Catch:{ Exception -> 0x005a }
            java.lang.Object r0 = r10.getSystemService(r3)     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = "null cannot be cast to non-null type android.app.ActivityManager"
            A2.i.c(r0, r3)     // Catch:{ Exception -> 0x005a }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ Exception -> 0x005a }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0386
        L_0x0384:
            r10 = r6
            goto L_0x03a9
        L_0x0386:
            java.lang.String r3 = r10.getPackageName()     // Catch:{ Exception -> 0x005a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x005a }
        L_0x038e:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x005a }
            if (r5 == 0) goto L_0x0384
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x005a }
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5     // Catch:{ Exception -> 0x005a }
            int r7 = r5.importance     // Catch:{ Exception -> 0x005a }
            r8 = 100
            if (r7 != r8) goto L_0x038e
            java.lang.String r5 = r5.processName     // Catch:{ Exception -> 0x005a }
            boolean r5 = r5.equals(r3)     // Catch:{ Exception -> 0x005a }
            if (r5 == 0) goto L_0x038e
            r10 = r4
        L_0x03a9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x005a }
            r3 = r2
            b2.f r3 = (b2.f) r3     // Catch:{ Exception -> 0x005a }
            r3.b(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x03b4:
            java.lang.String r3 = "setOnLockScreenVisibility"
            boolean r3 = r5.equals(r3)     // Catch:{ Exception -> 0x005a }
            if (r3 != 0) goto L_0x03bd
            goto L_0x03ed
        L_0x03bd:
            android.app.Activity r3 = r16.a()     // Catch:{ Exception -> 0x005a }
            boolean r4 = r0 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0406
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x005a }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x005a }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005a }
            r5 = 27
            if (r4 < r5) goto L_0x03d5
            r3.setShowWhenLocked(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x03d5:
            r4 = 524288(0x80000, float:7.34684E-40)
            if (r0 == 0) goto L_0x03e3
            android.view.Window r0 = r3.getWindow()     // Catch:{ Exception -> 0x005a }
            if (r0 == 0) goto L_0x0406
            r0.addFlags(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x03e3:
            android.view.Window r0 = r3.getWindow()     // Catch:{ Exception -> 0x005a }
            if (r0 == 0) goto L_0x0406
            r0.clearFlags(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x03ed:
            r0 = r2
            b2.f r0 = (b2.f) r0     // Catch:{ Exception -> 0x005a }
            r0.c()     // Catch:{ Exception -> 0x005a }
            goto L_0x0406
        L_0x03f4:
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r0 = r0.getMessage()
            b2.f r2 = (b2.f) r2
            r4 = 0
            r2.a(r3, r0, r4)
        L_0x0406:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.b.onMethodCall(c2.m, c2.p):void");
    }
}
