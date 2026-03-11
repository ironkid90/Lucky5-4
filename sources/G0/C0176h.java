package g0;

import A2.i;
import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: g0.h  reason: case insensitive filesystem */
public final class C0176h implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0177i f2966a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f2967b;

    public C0176h(C0177i iVar, Activity activity) {
        i.e(iVar, "sidecarCompat");
        this.f2966a = iVar;
        this.f2967b = new WeakReference(activity);
    }

    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        i.e(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f2967b.get();
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            iBinder = null;
        } else {
            iBinder = attributes.token;
        }
        if (activity != null && iBinder != null) {
            this.f2966a.g(iBinder, activity);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        i.e(view, "view");
    }
}
