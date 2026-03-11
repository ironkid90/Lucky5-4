package A;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f3a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f4b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f5c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f6d = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f3a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f4b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f5c = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
