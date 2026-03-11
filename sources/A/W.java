package A;

import M0.a;
import android.view.View;
import android.view.Window;

public class W extends a {

    /* renamed from: d  reason: collision with root package name */
    public final Window f32d;

    public W(Window window) {
        this.f32d = window;
    }

    public final void O(boolean z3) {
        Window window = this.f32d;
        if (z3) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
    }
}
