package q;

import android.app.Notification;

public abstract class L {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z3) {
        return builder.setAuthenticationRequired(z3);
    }

    public static Notification.Builder b(Notification.Builder builder, int i3) {
        return builder.setForegroundServiceBehavior(i3);
    }
}
