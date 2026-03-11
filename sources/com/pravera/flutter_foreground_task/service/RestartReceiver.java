package com.pravera.flutter_foreground_task.service;

import A2.i;
import J1.a;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.List;
import r.C0414g;

public final class RestartReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (context != null) {
            String string = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).getString("foregroundServiceAction", (String) null);
            if (string == null) {
                string = "com.pravera.flutter_foreground_task.action.api_stop";
            }
            if (!i.a(string, "com.pravera.flutter_foreground_task.action.api_stop")) {
                Object systemService = context.getSystemService("activity");
                i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE);
                i.d(runningServices, "getRunningServices(...)");
                Class<a> cls = a.class;
                if (!runningServices.isEmpty()) {
                    for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                        if (i.a(runningServiceInfo.service.getClassName(), cls.getName())) {
                            return;
                        }
                    }
                }
                Object systemService2 = context.getSystemService("power");
                i.c(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
                boolean isIgnoringBatteryOptimizations = ((PowerManager) systemService2).isIgnoringBatteryOptimizations(context.getPackageName());
                if (Build.VERSION.SDK_INT >= 31 && !isIgnoringBatteryOptimizations) {
                    Log.w("RestartReceiver", "Turn off battery optimization to restart service in the background.");
                }
                Intent intent2 = new Intent(context, cls);
                SharedPreferences.Editor edit = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
                edit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.restart");
                edit.commit();
                C0414g.b(context, intent2);
            }
        }
    }
}
