package P0;

import android.os.Build;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f1240a;

    static {
        int i3;
        if (Build.VERSION.SDK_INT >= 31) {
            i3 = 33554432;
        } else {
            i3 = 0;
        }
        f1240a = i3;
    }
}
