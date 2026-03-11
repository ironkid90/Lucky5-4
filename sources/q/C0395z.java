package q;

import android.app.Notification;
import android.net.Uri;

/* renamed from: q.z  reason: case insensitive filesystem */
public abstract class C0395z {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j3, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j3, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
