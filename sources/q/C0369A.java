package q;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* renamed from: q.A  reason: case insensitive filesystem */
public abstract class C0369A {
    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j3, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j3, person);
    }

    public static Parcelable a(Person person) {
        return person;
    }
}
