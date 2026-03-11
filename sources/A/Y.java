package A;

import M0.a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class Y extends a {

    /* renamed from: d  reason: collision with root package name */
    public final WindowInsetsController f33d;

    /* renamed from: e  reason: collision with root package name */
    public final Window f34e;

    public Y(Window window) {
        this.f33d = window.getInsetsController();
        this.f34e = window;
    }

    public final void N(boolean z3) {
        Window window = this.f34e;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f33d.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.f33d.setSystemBarsAppearance(0, 16);
    }

    public final void O(boolean z3) {
        Window window = this.f34e;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f33d.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.f33d.setSystemBarsAppearance(0, 8);
    }
}
