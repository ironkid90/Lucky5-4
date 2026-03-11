package j;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: j.c  reason: case insensitive filesystem */
public final class C0238c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3654f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3655g;

    public /* synthetic */ C0238c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f3654f = i3;
        this.f3655g = actionBarOverlayLayout;
    }

    public final void run() {
        switch (this.f3654f) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3655g;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f2147y = actionBarOverlayLayout.f2131h.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2148z);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3655g;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f2147y = actionBarOverlayLayout2.f2131h.animate().translationY((float) (-actionBarOverlayLayout2.f2131h.getHeight())).setListener(actionBarOverlayLayout2.f2148z);
                return;
        }
    }
}
