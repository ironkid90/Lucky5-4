package q;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: q.e  reason: case insensitive filesystem */
public abstract class C0375e {
    public static AlarmManager.AlarmClockInfo a(long j3, PendingIntent pendingIntent) {
        return new AlarmManager.AlarmClockInfo(j3, pendingIntent);
    }

    public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
        alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
    }
}
