package j;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: j.a  reason: case insensitive filesystem */
public final class C0236a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f3651a;

    public C0236a(ActionBarContainer actionBarContainer) {
        this.f3651a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3651a;
        if (actionBarContainer.f2110l) {
            Drawable drawable = actionBarContainer.f2109k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2107i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f2108j;
        if (drawable3 != null && actionBarContainer.f2111m) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3651a;
        if (actionBarContainer.f2110l) {
            Drawable drawable = actionBarContainer.f2109k;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2107i;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public final void setAlpha(int i3) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
