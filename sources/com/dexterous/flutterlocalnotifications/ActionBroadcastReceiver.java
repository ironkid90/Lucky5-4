package com.dexterous.flutterlocalnotifications;

import M0.b;
import T1.c;
import W1.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import c2.g;
import c2.n;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.Map;
import q.T;

public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static n f2801b;

    /* renamed from: c  reason: collision with root package name */
    public static c f2802c;

    /* renamed from: a  reason: collision with root package name */
    public b f2803a;

    public final void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            b bVar = this.f2803a;
            if (bVar == null) {
                bVar = new b(context);
            }
            this.f2803a = bVar;
            Map<String, Object> extractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                int intValue = ((Integer) extractNotificationResponseMap.get("notificationId")).intValue();
                Object obj = extractNotificationResponseMap.get("notificationTag");
                if (obj instanceof String) {
                    new T(context).a((String) obj, intValue);
                } else {
                    new T(context).a((String) null, intValue);
                }
            }
            if (f2801b == null) {
                f2801b = new n();
            }
            n nVar = f2801b;
            g gVar = (g) nVar.f2790h;
            if (gVar != null) {
                gVar.a(extractNotificationResponseMap);
            } else {
                ((ArrayList) nVar.f2789g).add(extractNotificationResponseMap);
            }
            if (f2802c != null) {
                Log.e("ActionBroadcastReceiver", "Engine is already initialised");
                return;
            }
            f fVar = (f) C0.f.O().f128h;
            fVar.d(context);
            fVar.a(context, (String[]) null);
            f2802c = new c(context, (String[]) null);
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f2803a.f1087a.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", -1));
            if (lookupCallbackInformation == null) {
                Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
                return;
            }
            U1.b bVar2 = f2802c.f1682c;
            new C0.f((c2.f) bVar2.f1763j, "dexterous.com/flutter/local_notifications/actions").X(f2801b);
            bVar2.a(new C0.f((Object) context.getAssets(), (Object) (String) fVar.f1915d.f1900c, (Object) lookupCallbackInformation, 9));
        }
    }
}
