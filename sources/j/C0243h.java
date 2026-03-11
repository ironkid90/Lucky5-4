package j;

import M0.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ai9poker.app.R;
import i.C0199a;
import u.C0489a;

/* renamed from: j.h  reason: case insensitive filesystem */
public final class C0243h extends C0252q implements C0245j {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0244i f3693h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0243h(C0244i iVar, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f3693h = iVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a.Q(this, getContentDescription());
        setOnTouchListener(new C0199a(this, this));
    }

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3693h.j();
        return true;
    }

    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C0489a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
