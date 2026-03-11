package q;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;

/* renamed from: q.t  reason: case insensitive filesystem */
public abstract class C0389t {
    public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }

    public static Notification.CallStyle d(Notification.CallStyle callStyle, int i3) {
        return callStyle.setAnswerButtonColorHint(i3);
    }

    public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z3) {
        return builder.setAuthenticationRequired(z3);
    }

    public static Notification.CallStyle f(Notification.CallStyle callStyle, int i3) {
        return callStyle.setDeclineButtonColorHint(i3);
    }

    public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z3) {
        return callStyle.setIsVideo(z3);
    }

    public static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    public static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }
}
