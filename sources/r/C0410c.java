package r;

import android.content.Context;
import java.io.File;

/* renamed from: r.c  reason: case insensitive filesystem */
public abstract class C0410c {
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static File b(Context context) {
        return context.getDataDir();
    }

    public static boolean c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
