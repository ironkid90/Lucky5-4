package r;

import android.content.Context;

/* renamed from: r.b  reason: case insensitive filesystem */
public abstract class C0409b {
    public static int a(Context context, int i3) {
        return context.getColor(i3);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
