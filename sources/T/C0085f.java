package T;

import android.animation.ValueAnimator;

/* renamed from: T.f  reason: case insensitive filesystem */
public final class C0085f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0086g f1607a;

    public C0085f(C0086g gVar) {
        this.f1607a = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0086g gVar = this.f1607a;
        gVar.f1611b.setAlpha(floatValue);
        gVar.f1612c.setAlpha(floatValue);
        gVar.f1623n.invalidate();
    }
}
