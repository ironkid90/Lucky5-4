package q;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* renamed from: q.l  reason: case insensitive filesystem */
public abstract class C0382l {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z3) {
        bigPictureStyle.showBigPictureWhenCollapsed(z3);
    }
}
