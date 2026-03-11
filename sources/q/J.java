package q;

import android.app.Notification;
import android.app.Person;

public abstract class J {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i3) {
        return builder.setSemanticAction(i3);
    }
}
