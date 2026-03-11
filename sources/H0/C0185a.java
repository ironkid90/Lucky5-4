package h0;

import A.V;
import A2.i;
import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;

/* renamed from: h0.a  reason: case insensitive filesystem */
public final class C0185a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0185a f3035a = new Object();

    public final V a(Context context) {
        i.e(context, "context");
        WindowInsets h3 = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        i.d(h3, "context.getSystemService…indowMetrics.windowInsets");
        return V.a(h3, (View) null);
    }
}
