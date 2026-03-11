package T;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: T.e  reason: case insensitive filesystem */
public final class C0084e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1605a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0086g f1606b;

    public C0084e(C0086g gVar) {
        this.f1606b = gVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1605a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f1605a) {
            this.f1605a = false;
            return;
        }
        C0086g gVar = this.f1606b;
        if (((Float) gVar.f1630u.getAnimatedValue()).floatValue() == 0.0f) {
            gVar.v = 0;
            gVar.e(0);
            return;
        }
        gVar.v = 2;
        gVar.f1623n.invalidate();
    }
}
