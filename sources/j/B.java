package j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import i.C0199a;

public final class B implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3572f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0199a f3573g;

    public /* synthetic */ B(C0199a aVar, int i3) {
        this.f3572f = i3;
        this.f3573g = aVar;
    }

    public final void run() {
        switch (this.f3572f) {
            case 0:
                ViewParent parent = this.f3573g.f3105d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                C0199a aVar = this.f3573g;
                aVar.a();
                View view = aVar.f3105d;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    aVar.f3108g = true;
                    return;
                }
                return;
        }
    }
}
