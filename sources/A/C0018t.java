package A;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: A.t  reason: case insensitive filesystem */
public abstract class C0018t {
    public static V a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        V a2 = V.a(rootWindowInsets, (View) null);
        T t3 = a2.f31a;
        t3.o(a2);
        t3.d(view.getRootView());
        return a2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i3) {
        view.setScrollIndicators(i3);
    }

    public static void d(View view, int i3, int i4) {
        view.setScrollIndicators(i3, i4);
    }
}
