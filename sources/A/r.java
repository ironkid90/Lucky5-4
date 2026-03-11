package A;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

public final class r implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public V f63a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f64b;

    public r(View view, C0012m mVar) {
        this.f64b = view;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        V a2 = V.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            C0017s.a(windowInsets, this.f64b);
            if (a2.equals(this.f63a)) {
                throw null;
            }
        }
        this.f63a = a2;
        throw null;
    }
}
