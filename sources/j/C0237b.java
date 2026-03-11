package j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: j.b  reason: case insensitive filesystem */
public final class C0237b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3652a;

    public C0237b(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f3652a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3652a;
        actionBarOverlayLayout.f2147y = null;
        actionBarOverlayLayout.f2138o = false;
    }

    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3652a;
        actionBarOverlayLayout.f2147y = null;
        actionBarOverlayLayout.f2138o = false;
    }
}
