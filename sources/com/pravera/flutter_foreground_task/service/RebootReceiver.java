package com.pravera.flutter_foreground_task.service;

import A2.i;
import J1.a;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import org.json.JSONObject;
import r.C0414g;

public final class RebootReceiver extends BroadcastReceiver {
    public static void a(Context context) {
        Intent intent = new Intent(context, a.class);
        i.e(context, "context");
        SharedPreferences.Editor edit = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
        edit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.reboot");
        edit.commit();
        C0414g.b(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            try {
                if ((context.getPackageManager().getServiceInfo(new ComponentName(context, a.class), 128).flags & 1) != 1) {
                    String string = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).getString("foregroundServiceAction", (String) null);
                    if (string == null) {
                        string = "com.pravera.flutter_foreground_task.action.api_stop";
                    }
                    if (!i.a(string, "com.pravera.flutter_foreground_task.action.api_stop")) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0);
                        String string2 = sharedPreferences.getString("taskEventAction", (String) null);
                        if (string2 != null) {
                            JSONObject jSONObject = new JSONObject(string2);
                            if (!jSONObject.isNull("taskEventType")) {
                                int i3 = jSONObject.getInt("taskEventType");
                                I1.a.f706g.getClass();
                                I1.a[] values = I1.a.values();
                                int length = values.length;
                                int i4 = 0;
                                while (i4 < length && values[i4].f708f != i3) {
                                    i4++;
                                }
                            }
                            if (!jSONObject.isNull("taskEventInterval")) {
                                jSONObject.getInt("taskEventInterval");
                            }
                        } else {
                            sharedPreferences.getBoolean("isOnceEvent", false);
                            sharedPreferences.getLong("interval", 5000);
                        }
                        boolean z3 = sharedPreferences.getBoolean("autoRunOnBoot", false);
                        boolean z4 = sharedPreferences.getBoolean("autoRunOnMyPackageReplaced", false);
                        sharedPreferences.getBoolean("allowWakeLock", true);
                        sharedPreferences.getBoolean("allowWifiLock", false);
                        if ((i.a(intent.getAction(), "android.intent.action.BOOT_COMPLETED") || i.a(intent.getAction(), "android.intent.action.QUICKBOOT_POWERON")) && z3) {
                            a(context);
                        } else if (i.a(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED") && z4) {
                            a(context);
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("a", "isSetStopWithTaskFlag >> The service component cannot be found on the system.");
            } catch (Exception e2) {
                Log.e("a", "isSetStopWithTaskFlag >> " + e2);
            }
        }
    }
}
