package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public final class m extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f3416f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final Rect f3417g = new Rect();

    public m(Context context) {
        super(context);
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f3416f.set(i3, i4, i5, i6);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f3416f, layoutParams.x, layoutParams.y, this.f3417g);
            Rect rect = this.f3417g;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public final void onMeasure(int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), Integer.MIN_VALUE));
        }
        super.onMeasure(i3, i4);
    }
}
