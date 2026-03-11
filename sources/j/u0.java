package j;

import A.A;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f3810a;

    static {
        Class<Rect> cls = Rect.class;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            f3810a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        Field field = A.f0a;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
