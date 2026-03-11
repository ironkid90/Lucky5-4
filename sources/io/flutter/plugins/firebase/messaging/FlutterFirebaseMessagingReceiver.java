package io.flutter.plugins.firebase.messaging;

import a.C0094a;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.session.a;
import android.util.Log;
import androidx.lifecycle.o;
import b2.h;
import i2.C0235p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import s1.C0463x;

public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f3428a = new HashMap();

    public final void onReceive(Context context, Intent intent) {
        boolean z3;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Context context2;
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (C0094a.f1971k == null) {
            if (context.getApplicationContext() != null) {
                context2 = context.getApplicationContext();
            } else {
                context2 = context;
            }
            Log.d("FLTFireContextHolder", "received application context.");
            C0094a.f1971k = context2;
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        C0463x xVar = new C0463x(intent.getExtras());
        if (xVar.c() != null) {
            f3428a.put(xVar.b(), xVar);
            h m3 = h.m();
            m3.getClass();
            m3.v().edit().putString(xVar.b(), new JSONObject(a.A(xVar)).toString()).apply();
            String str = m3.v().getString("notification_ids", "") + xVar.b() + ",";
            ArrayList arrayList = new ArrayList(Arrays.asList(str.split(",")));
            if (arrayList.size() > 100) {
                String str2 = (String) arrayList.get(0);
                m3.v().edit().remove(str2).apply();
                str = str.replace(str2 + ",", "");
            }
            m3.v().edit().putString("notification_ids", str).apply();
        }
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (!((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.importance == 100 && next.processName.equals(packageName)) {
                    if (o.f2524l == null) {
                        o.f2524l = new o();
                    }
                    o.f2524l.d(xVar);
                    return;
                }
            }
        }
        Intent intent2 = new Intent(context, FlutterFirebaseMessagingBackgroundService.class);
        Parcel obtain = Parcel.obtain();
        xVar.writeToParcel(obtain, 0);
        intent2.putExtra("notification", obtain.marshall());
        Bundle bundle = xVar.f4618a;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            z3 = true;
        } else {
            "normal".equals(string);
            z3 = false;
        }
        List list = FlutterFirebaseMessagingBackgroundService.f3426m;
        ComponentName componentName = new ComponentName(context, FlutterFirebaseMessagingBackgroundService.class);
        synchronized (a.f3429k) {
            C0235p b3 = a.b(context, componentName, true, 2020, z3);
            b3.b(2020);
            try {
                b3.a(intent2);
            } catch (IllegalStateException e2) {
                if (z3) {
                    a.b(context, componentName, true, 2020, false).a(intent2);
                } else {
                    throw e2;
                }
            }
        }
    }
}
