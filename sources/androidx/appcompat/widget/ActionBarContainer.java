package androidx.appcompat.widget;

import A.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ai9poker.app.R;
import e.C0153a;
import j.C0236a;
import j.P;
import java.lang.reflect.Field;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public boolean f2104f;

    /* renamed from: g  reason: collision with root package name */
    public View f2105g;

    /* renamed from: h  reason: collision with root package name */
    public View f2106h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f2107i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f2108j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f2109k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2110l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2111m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2112n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0236a aVar = new C0236a(this);
        Field field = A.f0a;
        setBackground(aVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0153a.f2917a);
        boolean z3 = false;
        this.f2107i = obtainStyledAttributes.getDrawable(0);
        this.f2108j = obtainStyledAttributes.getDrawable(2);
        this.f2112n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f2110l = true;
            this.f2109k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f2110l ? this.f2107i == null && this.f2108j == null : this.f2109k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2107i;
        if (drawable != null && drawable.isStateful()) {
            this.f2107i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2108j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2108j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2109k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f2109k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2107i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2108j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2109k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2105g = findViewById(R.id.action_bar);
        this.f2106h = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2104f || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        boolean z4 = true;
        if (this.f2110l) {
            Drawable drawable = this.f2109k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f2107i == null) {
                z4 = false;
            } else if (this.f2105g.getVisibility() == 0) {
                this.f2107i.setBounds(this.f2105g.getLeft(), this.f2105g.getTop(), this.f2105g.getRight(), this.f2105g.getBottom());
            } else {
                View view = this.f2106h;
                if (view == null || view.getVisibility() != 0) {
                    this.f2107i.setBounds(0, 0, 0, 0);
                } else {
                    this.f2107i.setBounds(this.f2106h.getLeft(), this.f2106h.getTop(), this.f2106h.getRight(), this.f2106h.getBottom());
                }
            }
            this.f2111m = false;
        }
        if (z4) {
            invalidate();
        }
    }

    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f2105g == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f2112n) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f2105g != null) {
            View.MeasureSpec.getMode(i4);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2107i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2107i);
        }
        this.f2107i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2105g;
            if (view != null) {
                this.f2107i.setBounds(view.getLeft(), this.f2105g.getTop(), this.f2105g.getRight(), this.f2105g.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f2110l ? this.f2107i == null && this.f2108j == null : this.f2109k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2109k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2109k);
        }
        this.f2109k = drawable;
        boolean z3 = this.f2110l;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f2109k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? this.f2107i == null && this.f2108j == null : this.f2109k == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f2108j;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2108j);
        }
        this.f2108j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2111m && this.f2108j != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f2110l ? this.f2107i == null && this.f2108j == null : this.f2109k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        int i3;
        this.f2104f = z3;
        if (z3) {
            i3 = 393216;
        } else {
            i3 = 262144;
        }
        setDescendantFocusability(i3);
    }

    public void setVisibility(int i3) {
        boolean z3;
        super.setVisibility(i3);
        if (i3 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.f2107i;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f2108j;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f2109k;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2107i;
        boolean z3 = this.f2110l;
        if ((drawable != drawable2 || z3) && ((drawable != this.f2108j || !this.f2111m) && ((drawable != this.f2109k || !z3) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    public void setTabContainer(P p3) {
    }
}
