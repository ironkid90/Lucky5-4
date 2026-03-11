package q;

import android.app.RemoteInput;

public abstract class Y {
    public static int a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static RemoteInput.Builder b(RemoteInput.Builder builder, int i3) {
        return builder.setEditChoicesBeforeSending(i3);
    }
}
