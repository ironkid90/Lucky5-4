package A;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: A.q  reason: case insensitive filesystem */
public abstract class C0016q {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
