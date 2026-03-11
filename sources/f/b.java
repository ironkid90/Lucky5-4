package F;

import android.os.Build;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f269a;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 27) {
            z3 = true;
        } else {
            z3 = false;
        }
        f269a = z3;
    }
}
