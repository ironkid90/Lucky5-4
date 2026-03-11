package j0;

import L.k;
import S1.C0078d;
import S1.r;
import a.C0094a;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import b2.f;
import c2.s;
import c2.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q.M;
import q.T;
import r.C0414g;

public final class b implements s, u {

    /* renamed from: f  reason: collision with root package name */
    public final Context f3831f;

    /* renamed from: g  reason: collision with root package name */
    public r f3832g;

    /* renamed from: h  reason: collision with root package name */
    public C0078d f3833h;

    /* renamed from: i  reason: collision with root package name */
    public int f3834i;

    /* renamed from: j  reason: collision with root package name */
    public HashMap f3835j;

    public b(Context context) {
        this.f3831f = context;
    }

    public final int a(int i3) {
        int i4;
        int i5 = i3;
        int i6 = 0;
        Context context = this.f3831f;
        if (i5 == 17) {
            if (Build.VERSION.SDK_INT < 33) {
                if (M.a(new T(context).f4231b)) {
                    return 1;
                }
                return 0;
            } else if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                return 1;
            } else {
                return C0094a.p(this.f3833h, "android.permission.POST_NOTIFICATIONS");
            }
        } else if (i5 == 21) {
            ArrayList w3 = C0094a.w(context, 21);
            if (w3 != null && !w3.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        } else if ((i5 == 30 || i5 == 28 || i5 == 29) && Build.VERSION.SDK_INT < 31) {
            ArrayList w4 = C0094a.w(context, 21);
            if (w4 != null && !w4.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        } else if ((i5 == 37 || i5 == 0) && !b()) {
            return 0;
        } else {
            ArrayList w5 = C0094a.w(context, i5);
            if (w5 == null) {
                Log.d("permissions_handler", "No android specific permissions needed for: " + i5);
                return 1;
            } else if (w5.size() == 0) {
                Log.d("permissions_handler", "No permissions found in manifest for: " + w5 + i5);
                if (i5 != 22 || Build.VERSION.SDK_INT >= 30) {
                    return 0;
                }
                return 2;
            } else {
                if (context.getApplicationInfo().targetSdkVersion >= 23) {
                    HashSet hashSet = new HashSet();
                    Iterator it = w5.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (i5 == 16) {
                            String packageName = context.getPackageName();
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                                hashSet.add(Integer.valueOf(i6));
                            } else {
                                hashSet.add(1);
                            }
                        } else if (i5 == 22) {
                            if (Build.VERSION.SDK_INT < 30) {
                                hashSet.add(2);
                            }
                            hashSet.add(Integer.valueOf(Environment.isExternalStorageManager() ? 1 : 0));
                        } else if (i5 == 23) {
                            hashSet.add(Integer.valueOf(Settings.canDrawOverlays(context) ? 1 : 0));
                        } else if (i5 == 24) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                hashSet.add(Integer.valueOf(context.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                            }
                        } else if (i5 == 27) {
                            hashSet.add(Integer.valueOf(((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                        } else if (i5 == 34) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                hashSet.add(Integer.valueOf(((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms() ? 1 : 0));
                            } else {
                                hashSet.add(1);
                            }
                        } else if (i5 == 9 || i5 == 32) {
                            int a2 = C0414g.a(context, str);
                            if (Build.VERSION.SDK_INT >= 34) {
                                i4 = C0414g.a(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                            } else {
                                i4 = a2;
                            }
                            if (i4 == 0 && a2 == -1) {
                                hashSet.add(3);
                            } else if (a2 == 0) {
                                hashSet.add(1);
                            } else {
                                hashSet.add(Integer.valueOf(C0094a.p(this.f3833h, str)));
                            }
                        } else if (C0414g.a(context, str) != 0) {
                            hashSet.add(Integer.valueOf(C0094a.p(this.f3833h, str)));
                        }
                        i6 = 0;
                    }
                    if (!hashSet.isEmpty()) {
                        return C0094a.L(hashSet).intValue();
                    }
                }
                return 1;
            }
        }
    }

    public final boolean b() {
        boolean z3;
        boolean z4;
        ArrayList w3 = C0094a.w(this.f3831f, 37);
        if (w3 == null || !w3.contains("android.permission.WRITE_CALENDAR")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (w3 == null || !w3.contains("android.permission.READ_CALENDAR")) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 && z4) {
            return true;
        }
        if (!z3) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z4) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void c(String str, int i3) {
        if (this.f3833h != null) {
            Intent intent = new Intent(str);
            if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
                intent.setData(Uri.parse("package:" + this.f3833h.getPackageName()));
            }
            this.f3833h.startActivityForResult(intent, i3);
            this.f3834i++;
        }
    }

    public final boolean onActivityResult(int i3, int i4, Intent intent) {
        boolean z3;
        int i5;
        C0078d dVar = this.f3833h;
        boolean z4 = false;
        if (dVar == null) {
            return false;
        }
        if (this.f3835j == null) {
            this.f3834i = 0;
            return false;
        }
        if (i3 == 209) {
            Context context = this.f3831f;
            String packageName = context.getPackageName();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                z4 = true;
            }
            i5 = 16;
        } else if (i3 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            z3 = Environment.isExternalStorageManager();
            i5 = 22;
        } else if (i3 == 211) {
            z3 = Settings.canDrawOverlays(dVar);
            i5 = 23;
        } else if (i3 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            z3 = dVar.getPackageManager().canRequestPackageInstalls();
            i5 = 24;
        } else if (i3 == 213) {
            z3 = ((NotificationManager) dVar.getSystemService("notification")).isNotificationPolicyAccessGranted();
            i5 = 27;
        } else if (i3 != 214) {
            return false;
        } else {
            AlarmManager alarmManager = (AlarmManager) dVar.getSystemService("alarm");
            if (Build.VERSION.SDK_INT >= 31) {
                z3 = alarmManager.canScheduleExactAlarms();
            } else {
                z3 = true;
            }
            i5 = 34;
        }
        this.f3835j.put(Integer.valueOf(i5), Integer.valueOf(z3 ? 1 : 0));
        int i6 = this.f3834i - 1;
        this.f3834i = i6;
        r rVar = this.f3832g;
        if (rVar != null && i6 == 0) {
            ((f) rVar.f1506g).b(this.f3835j);
        }
        return true;
    }

    public final boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        int i4;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        int i5 = 14;
        int i6 = 0;
        if (i3 != 24) {
            this.f3834i = 0;
            return false;
        } else if (this.f3835j == null) {
            return false;
        } else {
            if (strArr2.length == 0 && iArr2.length == 0) {
                Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
                return false;
            }
            List asList = Arrays.asList(strArr);
            int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
            if (indexOf >= 0) {
                int M3 = C0094a.M(this.f3833h, "android.permission.WRITE_CALENDAR", iArr2[indexOf]);
                this.f3835j.put(36, Integer.valueOf(M3));
                int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
                if (indexOf2 >= 0) {
                    int M4 = C0094a.M(this.f3833h, "android.permission.READ_CALENDAR", iArr2[indexOf2]);
                    Integer valueOf = Integer.valueOf(M3);
                    Integer valueOf2 = Integer.valueOf(M4);
                    HashSet hashSet = new HashSet();
                    hashSet.add(valueOf);
                    hashSet.add(valueOf2);
                    Integer L3 = C0094a.L(hashSet);
                    this.f3835j.put(37, L3);
                    this.f3835j.put(0, L3);
                }
            }
            int i7 = 0;
            while (i7 < strArr2.length) {
                String str = strArr2[i7];
                if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                    int i8 = -1;
                    switch (str.hashCode()) {
                        case -2062386608:
                            if (str.equals("android.permission.READ_SMS")) {
                                i8 = i6;
                                break;
                            }
                            break;
                        case -1928411001:
                            if (str.equals("android.permission.READ_CALENDAR")) {
                                i8 = 1;
                                break;
                            }
                            break;
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                i8 = 2;
                                break;
                            }
                            break;
                        case -1921431796:
                            if (str.equals("android.permission.READ_CALL_LOG")) {
                                i8 = 3;
                                break;
                            }
                            break;
                        case -1888586689:
                            if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                i8 = 4;
                                break;
                            }
                            break;
                        case -1813079487:
                            if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                                i8 = 5;
                                break;
                            }
                            break;
                        case -1783097621:
                            if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                                i8 = 6;
                                break;
                            }
                            break;
                        case -1561629405:
                            if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                                i8 = 7;
                                break;
                            }
                            break;
                        case -1479758289:
                            if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                                i8 = 8;
                                break;
                            }
                            break;
                        case -1238066820:
                            if (str.equals("android.permission.BODY_SENSORS")) {
                                i8 = 9;
                                break;
                            }
                            break;
                        case -1164582768:
                            if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                                i8 = 10;
                                break;
                            }
                            break;
                        case -909527021:
                            if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                                i8 = 11;
                                break;
                            }
                            break;
                        case -895679497:
                            if (str.equals("android.permission.RECEIVE_MMS")) {
                                i8 = 12;
                                break;
                            }
                            break;
                        case -895673731:
                            if (str.equals("android.permission.RECEIVE_SMS")) {
                                i8 = 13;
                                break;
                            }
                            break;
                        case -798669607:
                            if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                                i8 = i5;
                                break;
                            }
                            break;
                        case -406040016:
                            if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                                i8 = 15;
                                break;
                            }
                            break;
                        case -63024214:
                            if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                                i8 = 16;
                                break;
                            }
                            break;
                        case -5573545:
                            if (str.equals("android.permission.READ_PHONE_STATE")) {
                                i8 = 17;
                                break;
                            }
                            break;
                        case 52602690:
                            if (str.equals("android.permission.SEND_SMS")) {
                                i8 = 18;
                                break;
                            }
                            break;
                        case 112197485:
                            if (str.equals("android.permission.CALL_PHONE")) {
                                i8 = 19;
                                break;
                            }
                            break;
                        case 175802396:
                            if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                                i8 = 20;
                                break;
                            }
                            break;
                        case 214526995:
                            if (str.equals("android.permission.WRITE_CONTACTS")) {
                                i8 = 21;
                                break;
                            }
                            break;
                        case 361658321:
                            if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                                i8 = 22;
                                break;
                            }
                            break;
                        case 463403621:
                            if (str.equals("android.permission.CAMERA")) {
                                i8 = 23;
                                break;
                            }
                            break;
                        case 603653886:
                            if (str.equals("android.permission.WRITE_CALENDAR")) {
                                i8 = 24;
                                break;
                            }
                            break;
                        case 610633091:
                            if (str.equals("android.permission.WRITE_CALL_LOG")) {
                                i8 = 25;
                                break;
                            }
                            break;
                        case 691260818:
                            if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                                i8 = 26;
                                break;
                            }
                            break;
                        case 710297143:
                            if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                                i8 = 27;
                                break;
                            }
                            break;
                        case 784519842:
                            if (str.equals("android.permission.USE_SIP")) {
                                i8 = 28;
                                break;
                            }
                            break;
                        case 970694249:
                            if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                                i8 = 29;
                                break;
                            }
                            break;
                        case 1166454870:
                            if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                                i8 = 30;
                                break;
                            }
                            break;
                        case 1271781903:
                            if (str.equals("android.permission.GET_ACCOUNTS")) {
                                i8 = 31;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                i8 = 32;
                                break;
                            }
                            break;
                        case 1777263169:
                            if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                                i8 = 33;
                                break;
                            }
                            break;
                        case 1780337063:
                            if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                                i8 = 34;
                                break;
                            }
                            break;
                        case 1831139720:
                            if (str.equals("android.permission.RECORD_AUDIO")) {
                                i8 = 35;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                i8 = 36;
                                break;
                            }
                            break;
                        case 2024715147:
                            if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                                i8 = 37;
                                break;
                            }
                            break;
                        case 2062356686:
                            if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                                i8 = 38;
                                break;
                            }
                            break;
                        case 2114579147:
                            if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                                i8 = 39;
                                break;
                            }
                            break;
                        case 2133799037:
                            if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                                i8 = 40;
                                break;
                            }
                            break;
                    }
                    switch (i8) {
                        case 0:
                        case k.BYTES_FIELD_NUMBER:
                        case 12:
                        case 13:
                        case 18:
                            i4 = 13;
                            break;
                        case 1:
                        case 24:
                            i4 = i6;
                            break;
                        case k.FLOAT_FIELD_NUMBER:
                            i4 = 17;
                            break;
                        case k.INTEGER_FIELD_NUMBER:
                        case 10:
                        case 17:
                        case 19:
                        case 25:
                        case 28:
                        case 40:
                            i4 = 8;
                            break;
                        case k.LONG_FIELD_NUMBER:
                        case 16:
                            i4 = 3;
                            break;
                        case k.STRING_FIELD_NUMBER:
                            i4 = 22;
                            break;
                        case k.STRING_SET_FIELD_NUMBER:
                            i4 = 27;
                            break;
                        case k.DOUBLE_FIELD_NUMBER:
                            i4 = 23;
                            break;
                        case 9:
                            i4 = 12;
                            break;
                        case 11:
                            i4 = 31;
                            break;
                        case 14:
                            i4 = 30;
                            break;
                        case 15:
                        case 32:
                            i4 = 15;
                            break;
                        case 20:
                            i4 = 9;
                            break;
                        case 21:
                        case 31:
                        case 36:
                            i4 = 2;
                            break;
                        case 22:
                            i4 = 35;
                            break;
                        case 23:
                            i4 = 1;
                            break;
                        case 26:
                            i4 = 33;
                            break;
                        case 27:
                            i4 = 32;
                            break;
                        case 29:
                            i4 = 34;
                            break;
                        case 30:
                            i4 = 29;
                            break;
                        case 33:
                            i4 = 24;
                            break;
                        case 34:
                            i4 = 19;
                            break;
                        case 35:
                            i4 = 7;
                            break;
                        case 37:
                            i4 = 4;
                            break;
                        case 38:
                            i4 = 28;
                            break;
                        case 39:
                            i4 = 18;
                            break;
                        default:
                            i4 = 20;
                            break;
                    }
                    if (i4 != 20) {
                        int i9 = iArr2[i7];
                        if (i4 == 8) {
                            Integer valueOf3 = Integer.valueOf(C0094a.M(this.f3833h, str, i9));
                            HashSet hashSet2 = new HashSet();
                            hashSet2.add((Integer) this.f3835j.get(8));
                            hashSet2.add(valueOf3);
                            this.f3835j.put(8, C0094a.L(hashSet2));
                        } else if (i4 == 7) {
                            if (!this.f3835j.containsKey(7)) {
                                this.f3835j.put(7, Integer.valueOf(C0094a.M(this.f3833h, str, i9)));
                            }
                            if (!this.f3835j.containsKey(Integer.valueOf(i5))) {
                                this.f3835j.put(Integer.valueOf(i5), Integer.valueOf(C0094a.M(this.f3833h, str, i9)));
                            }
                        } else if (i4 == 4) {
                            int M5 = C0094a.M(this.f3833h, str, i9);
                            if (!this.f3835j.containsKey(4)) {
                                this.f3835j.put(4, Integer.valueOf(M5));
                            }
                        } else {
                            if (i4 == 3) {
                                int M6 = C0094a.M(this.f3833h, str, i9);
                                if (Build.VERSION.SDK_INT < 29 && !this.f3835j.containsKey(4)) {
                                    this.f3835j.put(4, Integer.valueOf(M6));
                                }
                                if (!this.f3835j.containsKey(5)) {
                                    this.f3835j.put(5, Integer.valueOf(M6));
                                }
                                this.f3835j.put(Integer.valueOf(i4), Integer.valueOf(M6));
                            } else if (i4 == 9 || i4 == 32) {
                                this.f3835j.put(Integer.valueOf(i4), Integer.valueOf(a(i4)));
                            } else if (!this.f3835j.containsKey(Integer.valueOf(i4))) {
                                this.f3835j.put(Integer.valueOf(i4), Integer.valueOf(C0094a.M(this.f3833h, str, i9)));
                            }
                            i7++;
                            i5 = 14;
                            i6 = 0;
                        }
                    }
                }
                i7++;
                i5 = 14;
                i6 = 0;
            }
            int length = this.f3834i - iArr2.length;
            this.f3834i = length;
            r rVar = this.f3832g;
            if (rVar != null && length == 0) {
                ((f) rVar.f1506g).b(this.f3835j);
            }
            return true;
        }
    }
}
