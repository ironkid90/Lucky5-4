package q;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* renamed from: q.s  reason: case insensitive filesystem */
public abstract class C0388s {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Parcelable b(Person person) {
        return person;
    }
}
