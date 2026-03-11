package q;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: q.f  reason: case insensitive filesystem */
public abstract class C0376f {
    public static void a(AlarmManager alarmManager, int i3, long j3, PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i3, j3, pendingIntent);
    }

    public static void b(AlarmManager alarmManager, int i3, long j3, PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i3, j3, pendingIntent);
    }
}
