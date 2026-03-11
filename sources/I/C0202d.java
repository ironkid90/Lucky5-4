package i;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: i.d  reason: case insensitive filesystem */
public final class C0202d implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3115a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0209k f3116b;

    public /* synthetic */ C0202d(C0209k kVar, int i3) {
        this.f3115a = i3;
        this.f3116b = kVar;
    }

    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f3115a;
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3115a) {
            case 0:
                C0204f fVar = (C0204f) this.f3116b;
                ViewTreeObserver viewTreeObserver = fVar.f3122C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f3122C = view.getViewTreeObserver();
                    }
                    fVar.f3122C.removeGlobalOnLayoutListener(fVar.f3132n);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                C0216r rVar = (C0216r) this.f3116b;
                ViewTreeObserver viewTreeObserver2 = rVar.f3224t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        rVar.f3224t = view.getViewTreeObserver();
                    }
                    rVar.f3224t.removeGlobalOnLayoutListener(rVar.f3218n);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
