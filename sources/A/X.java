package A;

import android.view.View;
import android.view.Window;

public final class X extends W {
    public final void N(boolean z3) {
        Window window = this.f32d;
        if (z3) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
    }
}
