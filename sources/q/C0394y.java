package q;

import android.app.Notification;
import android.app.Person;

/* renamed from: q.y  reason: case insensitive filesystem */
public abstract class C0394y {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z3) {
        return messagingStyle.setGroupConversation(z3);
    }
}
