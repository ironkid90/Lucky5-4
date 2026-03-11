package androidx.appcompat.widget;

import A.A;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ai9poker.app.R;
import e.C0153a;
import f.C0159a;
import j.u0;
import java.lang.reflect.Field;

public class ActionBarContextView extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public int f2113f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2114g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2115h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f2116i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f2117j;

    /* renamed from: k  reason: collision with root package name */
    public View f2118k;

    /* renamed from: l  reason: collision with root package name */
    public LinearLayout f2119l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f2120m;

    /* renamed from: n  reason: collision with root package name */
    public TextView f2121n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2122o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2123p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2124q;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0153a.f2920d, R.attr.actionModeStyle, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = C0159a.a(context, resourceId);
        }
        Field field = A.f0a;
        setBackground(drawable);
        this.f2122o = obtainStyledAttributes.getResourceId(5, 0);
        this.f2123p = obtainStyledAttributes.getResourceId(4, 0);
        this.f2113f = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i3, int i4, int i5, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z3) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        if (z3) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void a() {
        int i3;
        if (this.f2119l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2119l = linearLayout;
            this.f2120m = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2121n = (TextView) this.f2119l.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f2122o;
            if (i4 != 0) {
                this.f2120m.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f2123p;
            if (i5 != 0) {
                this.f2121n.setTextAppearance(getContext(), i5);
            }
        }
        this.f2120m.setText(this.f2116i);
        this.f2121n.setText(this.f2117j);
        boolean isEmpty = TextUtils.isEmpty(this.f2116i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f2117j);
        TextView textView = this.f2121n;
        int i6 = 8;
        if (!isEmpty2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        LinearLayout linearLayout2 = this.f2119l;
        if (!isEmpty || !isEmpty2) {
            i6 = 0;
        }
        linearLayout2.setVisibility(i6);
        if (this.f2119l.getParent() == null) {
            addView(this.f2119l);
        }
    }

    /* renamed from: c */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            super.setVisibility(i3);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f2113f;
    }

    public CharSequence getSubtitle() {
        return this.f2117j;
    }

    public CharSequence getTitle() {
        return this.f2116i;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0153a.f2917a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2115h = false;
        }
        if (!this.f2115h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2115h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2115h = false;
        }
        return true;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f2116i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        boolean a2 = u0.a(this);
        if (a2) {
            i7 = (i5 - i3) - getPaddingRight();
        } else {
            i7 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f2119l;
        if (!(linearLayout == null || this.f2118k != null || linearLayout.getVisibility() == 8)) {
            i7 += b(this.f2119l, i7, paddingTop, paddingTop2, a2);
        }
        View view = this.f2118k;
        if (view != null) {
            b(view, i7, paddingTop, paddingTop2, a2);
        }
        if (a2) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z3;
        int i6;
        int i7 = 1073741824;
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i4) != 0) {
            int size = View.MeasureSpec.getSize(i3);
            int i8 = this.f2113f;
            if (i8 <= 0) {
                i8 = View.MeasureSpec.getSize(i4);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i9 = i8 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
            LinearLayout linearLayout = this.f2119l;
            if (linearLayout != null && this.f2118k == null) {
                if (this.f2124q) {
                    this.f2119l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f2119l.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f2119l;
                    if (z3) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    linearLayout2.setVisibility(i6);
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                    paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                }
            }
            View view = this.f2118k;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int i10 = layoutParams.width;
                if (i10 != -2) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                if (i10 >= 0) {
                    paddingLeft = Math.min(i10, paddingLeft);
                }
                int i11 = layoutParams.height;
                if (i11 == -2) {
                    i7 = Integer.MIN_VALUE;
                }
                if (i11 >= 0) {
                    i9 = Math.min(i11, i9);
                }
                this.f2118k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i9, i7));
            }
            if (this.f2113f <= 0) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i12) {
                        i12 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i12);
                return;
            }
            setMeasuredDimension(size, i8);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2114g = false;
        }
        if (!this.f2114g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2114g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2114g = false;
        }
        return true;
    }

    public void setContentHeight(int i3) {
        this.f2113f = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2118k;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2118k = view;
        if (!(view == null || (linearLayout = this.f2119l) == null)) {
            removeView(linearLayout);
            this.f2119l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2117j = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2116i = charSequence;
        a();
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f2124q) {
            requestLayout();
        }
        this.f2124q = z3;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
