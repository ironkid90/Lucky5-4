package A;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static Field f0a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0001b bVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        C0000a aVar = null;
        if (bVar == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = C0022x.a(viewGroup);
            } else {
                if (!f1b) {
                    if (f0a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f0a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f1b = true;
                        }
                    }
                    try {
                        Object obj = f0a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f1b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0000a) {
                bVar = new C0001b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        if (bVar != null) {
            aVar = bVar.f38b;
        }
        viewGroup.setAccessibilityDelegate(aVar);
    }
}
