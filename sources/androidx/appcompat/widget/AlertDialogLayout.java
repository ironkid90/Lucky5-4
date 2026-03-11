package androidx.appcompat.widget;

import A.A;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ai9poker.app.R;
import j.C;
import j.D;
import java.lang.reflect.Field;

public class AlertDialogLayout extends D {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int h(View view) {
        Field field = A.f0a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return h(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            r11 = 1
            int r0 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r10.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r10.getMeasuredHeight()
            int r2 = r10.getChildCount()
            int r3 = r10.getGravity()
            r4 = r3 & 112(0x70, float:1.57E-43)
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r5
            r5 = 16
            if (r4 == r5) goto L_0x003a
            r5 = 80
            if (r4 == r5) goto L_0x0031
            int r13 = r10.getPaddingTop()
            goto L_0x0044
        L_0x0031:
            int r4 = r10.getPaddingTop()
            int r4 = r4 + r15
            int r4 = r4 - r13
            int r13 = r4 - r1
            goto L_0x0044
        L_0x003a:
            int r4 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r1
            int r15 = r15 / 2
            int r13 = r15 + r4
        L_0x0044:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r1 = 0
            if (r15 != 0) goto L_0x004d
            r15 = r1
            goto L_0x0051
        L_0x004d:
            int r15 = r15.getIntrinsicHeight()
        L_0x0051:
            if (r1 >= r2) goto L_0x00b1
            android.view.View r4 = r10.getChildAt(r1)
            if (r4 == 0) goto L_0x00af
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L_0x00af
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            j.C r7 = (j.C) r7
            int r8 = r7.f3575b
            if (r8 >= 0) goto L_0x0074
            r8 = r3
        L_0x0074:
            java.lang.reflect.Field r9 = A.A.f0a
            int r9 = r10.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            if (r8 == r11) goto L_0x008f
            r9 = 5
            if (r8 == r9) goto L_0x0089
            int r8 = r7.leftMargin
            int r8 = r8 + r0
            goto L_0x009a
        L_0x0089:
            int r8 = r12 - r5
            int r9 = r7.rightMargin
        L_0x008d:
            int r8 = r8 - r9
            goto L_0x009a
        L_0x008f:
            int r8 = r14 - r5
            int r8 = r8 / 2
            int r8 = r8 + r0
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L_0x008d
        L_0x009a:
            boolean r9 = r10.g(r1)
            if (r9 == 0) goto L_0x00a1
            int r13 = r13 + r15
        L_0x00a1:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r5 = r5 + r8
            int r9 = r13 + r6
            r4.layout(r8, r13, r5, r9)
            int r4 = r7.bottomMargin
            int r6 = r6 + r4
            int r6 = r6 + r13
            r13 = r6
        L_0x00af:
            int r1 = r1 + r11
            goto L_0x0051
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i3;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i3, i4);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i3);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i10, 0);
            paddingBottom += view.getMeasuredHeight();
            i5 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i5 = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            i7 = h(view2);
            i6 = view2.getMeasuredHeight() - i7;
            paddingBottom += i7;
            i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                i9 = 0;
            } else {
                i9 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view3.measure(i10, i9);
            i8 = view3.getMeasuredHeight();
            paddingBottom += i8;
            i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
        } else {
            i8 = 0;
        }
        int i12 = size - paddingBottom;
        if (view2 != null) {
            int i13 = paddingBottom - i7;
            int min = Math.min(i12, i6);
            if (min > 0) {
                i12 -= min;
                i7 += min;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            paddingBottom = i13 + view2.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
        }
        if (view3 != null && i12 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(i8 + i12, mode));
            paddingBottom = (paddingBottom - i8) + view3.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                i14 = Math.max(i14, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i14, i10, i5), View.resolveSizeAndState(paddingBottom, i4, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                if (childAt3.getVisibility() != 8) {
                    C c3 = (C) childAt3.getLayoutParams();
                    if (c3.width == -1) {
                        int i17 = c3.height;
                        c3.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i4, 0);
                        c3.height = i17;
                    }
                }
            }
        }
    }
}
