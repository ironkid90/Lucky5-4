package com.dexterous.flutterlocalnotifications;

import D1.a;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import q.T;

@Keep
public class ScheduledNotificationReceiver extends BroadcastReceiver {
    private static final String TAG = "ScheduledNotifReceiver";

    public void onReceive(Context context, Intent intent) {
        Notification notification;
        String stringExtra = intent.getStringExtra(FlutterLocalNotificationsPlugin.NOTIFICATION_DETAILS);
        if (StringUtils.isNullOrEmpty(stringExtra).booleanValue()) {
            int intExtra = intent.getIntExtra("notification_id", 0);
            if (Build.VERSION.SDK_INT >= 33) {
                notification = (Notification) intent.getParcelableExtra("notification", Notification.class);
            } else {
                notification = (Notification) intent.getParcelableExtra("notification");
            }
            if (notification == null) {
                FlutterLocalNotificationsPlugin.removeNotificationFromCache(context, Integer.valueOf(intExtra));
                Log.e(TAG, "Failed to parse a notification from  Intent. ID: " + intExtra);
                return;
            }
            notification.when = System.currentTimeMillis();
            new T(context).b((String) null, intExtra, notification);
            if (!intent.getBooleanExtra("repeat", false)) {
                FlutterLocalNotificationsPlugin.removeNotificationFromCache(context, Integer.valueOf(intExtra));
                return;
            }
            return;
        }
        NotificationDetails notificationDetails = (NotificationDetails) FlutterLocalNotificationsPlugin.buildGson().b(stringExtra, new a().f221b);
        FlutterLocalNotificationsPlugin.showNotification(context, notificationDetails);
        FlutterLocalNotificationsPlugin.scheduleNextNotification(context, notificationDetails);
    }
}
