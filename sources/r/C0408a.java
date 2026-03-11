package r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: r.a  reason: case insensitive filesystem */
public abstract class C0408a {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i3) {
        return context.getDrawable(i3);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
