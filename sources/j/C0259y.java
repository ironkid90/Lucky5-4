package j;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import u.C0489a;

/* renamed from: j.y  reason: case insensitive filesystem */
public final class C0259y extends Drawable implements Drawable.Callback {

    /* renamed from: f  reason: collision with root package name */
    public Drawable f3813f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3814g;

    public final void a(Canvas canvas) {
        this.f3813f.draw(canvas);
    }

    public final void b(float f3, float f4) {
        C0489a.e(this.f3813f, f3, f4);
    }

    public final void c(int i3, int i4, int i5, int i6) {
        C0489a.f(this.f3813f, i3, i4, i5, i6);
    }

    public final boolean d(boolean z3, boolean z4) {
        if (super.setVisible(z3, z4) || this.f3813f.setVisible(z3, z4)) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        if (this.f3814g) {
            a(canvas);
        }
    }

    public final int getChangingConfigurations() {
        return this.f3813f.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f3813f.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f3813f.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f3813f.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f3813f.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f3813f.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f3813f.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f3813f.getPadding(rect);
    }

    public final int[] getState() {
        return this.f3813f.getState();
    }

    public final Region getTransparentRegion() {
        return this.f3813f.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f3813f.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.f3813f.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f3813f.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f3813f.setBounds(rect);
    }

    public final boolean onLevelChange(int i3) {
        return this.f3813f.setLevel(i3);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    public final void setAlpha(int i3) {
        this.f3813f.setAlpha(i3);
    }

    public final void setAutoMirrored(boolean z3) {
        this.f3813f.setAutoMirrored(z3);
    }

    public final void setChangingConfigurations(int i3) {
        this.f3813f.setChangingConfigurations(i3);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3813f.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z3) {
        this.f3813f.setDither(z3);
    }

    public final void setFilterBitmap(boolean z3) {
        this.f3813f.setFilterBitmap(z3);
    }

    public final void setHotspot(float f3, float f4) {
        if (this.f3814g) {
            b(f3, f4);
        }
    }

    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        if (this.f3814g) {
            c(i3, i4, i5, i6);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.f3814g) {
            return this.f3813f.setState(iArr);
        }
        return false;
    }

    public final void setTint(int i3) {
        C0489a.g(this.f3813f, i3);
    }

    public final void setTintList(ColorStateList colorStateList) {
        C0489a.h(this.f3813f, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        C0489a.i(this.f3813f, mode);
    }

    public final boolean setVisible(boolean z3, boolean z4) {
        if (this.f3814g) {
            return d(z3, z4);
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
