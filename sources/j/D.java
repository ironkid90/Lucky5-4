package j;

import C0.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import e.C0153a;

public abstract class D extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public boolean f3576f = true;

    /* renamed from: g  reason: collision with root package name */
    public int f3577g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f3578h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f3579i;

    /* renamed from: j  reason: collision with root package name */
    public int f3580j = 8388659;

    /* renamed from: k  reason: collision with root package name */
    public int f3581k;

    /* renamed from: l  reason: collision with root package name */
    public float f3582l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3583m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f3584n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f3585o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f3586p;

    /* renamed from: q  reason: collision with root package name */
    public int f3587q;

    /* renamed from: r  reason: collision with root package name */
    public int f3588r;

    /* renamed from: s  reason: collision with root package name */
    public int f3589s;

    /* renamed from: t  reason: collision with root package name */
    public int f3590t;

    public D(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        f P3 = f.P(context, attributeSet, C0153a.f2925i, i3);
        TypedArray typedArray = (TypedArray) P3.f127g;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f3582l = typedArray.getFloat(4, -1.0f);
        this.f3577g = typedArray.getInt(3, -1);
        this.f3583m = typedArray.getBoolean(7, false);
        setDividerDrawable(P3.I(5));
        this.f3589s = typedArray.getInt(8, 0);
        this.f3590t = typedArray.getDimensionPixelSize(6, 0);
        P3.T();
    }

    public final void b(Canvas canvas, int i3) {
        this.f3586p.setBounds(getPaddingLeft() + this.f3590t, i3, (getWidth() - getPaddingRight()) - this.f3590t, this.f3588r + i3);
        this.f3586p.draw(canvas);
    }

    public final void c(Canvas canvas, int i3) {
        this.f3586p.setBounds(i3, getPaddingTop() + this.f3590t, this.f3587q + i3, (getHeight() - getPaddingBottom()) - this.f3590t);
        this.f3586p.draw(canvas);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C;
    }

    /* renamed from: d */
    public C generateDefaultLayoutParams() {
        int i3 = this.f3579i;
        if (i3 == 0) {
            return new C(-2);
        }
        if (i3 == 1) {
            return new C(-1);
        }
        return null;
    }

    /* renamed from: e */
    public C generateLayoutParams(AttributeSet attributeSet) {
        return new C(getContext(), attributeSet);
    }

    /* renamed from: f */
    public C generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C(layoutParams);
    }

    public final boolean g(int i3) {
        if (i3 == 0) {
            if ((this.f3589s & 1) != 0) {
                return true;
            }
            return false;
        } else if (i3 == getChildCount()) {
            if ((this.f3589s & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f3589s & 2) == 0) {
            return false;
        } else {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public int getBaseline() {
        int i3;
        if (this.f3577g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f3577g;
        if (childCount > i4) {
            View childAt = getChildAt(i4);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i5 = this.f3578h;
                if (this.f3579i == 1 && (i3 = this.f3580j & 112) != 48) {
                    if (i3 == 16) {
                        i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3581k) / 2;
                    } else if (i3 == 80) {
                        i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3581k;
                    }
                }
                return i5 + ((C) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f3577g == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3577g;
    }

    public Drawable getDividerDrawable() {
        return this.f3586p;
    }

    public int getDividerPadding() {
        return this.f3590t;
    }

    public int getDividerWidth() {
        return this.f3587q;
    }

    public int getGravity() {
        return this.f3580j;
    }

    public int getOrientation() {
        return this.f3579i;
    }

    public int getShowDividers() {
        return this.f3589s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3582l;
    }

    public final void onDraw(Canvas canvas) {
        int i3;
        int left;
        int i4;
        int i5;
        int i6;
        if (this.f3586p != null) {
            int i7 = 0;
            if (this.f3579i == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i7 < virtualChildCount) {
                    View childAt = getChildAt(i7);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !g(i7))) {
                        b(canvas, (childAt.getTop() - ((C) childAt.getLayoutParams()).topMargin) - this.f3588r);
                    }
                    i7++;
                }
                if (g(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i6 = (getHeight() - getPaddingBottom()) - this.f3588r;
                    } else {
                        i6 = childAt2.getBottom() + ((C) childAt2.getLayoutParams()).bottomMargin;
                    }
                    b(canvas, i6);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a2 = u0.a(this);
            while (i7 < virtualChildCount2) {
                View childAt3 = getChildAt(i7);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !g(i7))) {
                    C c3 = (C) childAt3.getLayoutParams();
                    if (a2) {
                        i5 = childAt3.getRight() + c3.rightMargin;
                    } else {
                        i5 = (childAt3.getLeft() - c3.leftMargin) - this.f3587q;
                    }
                    c(canvas, i5);
                }
                i7++;
            }
            if (g(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    C c4 = (C) childAt4.getLayoutParams();
                    if (a2) {
                        left = childAt4.getLeft() - c4.leftMargin;
                        i4 = this.f3587q;
                    } else {
                        i3 = childAt4.getRight() + c4.rightMargin;
                        c(canvas, i3);
                    }
                } else if (a2) {
                    i3 = getPaddingLeft();
                    c(canvas, i3);
                } else {
                    left = getWidth() - getPaddingRight();
                    i4 = this.f3587q;
                }
                i3 = left - i4;
                c(canvas, i3);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f3579i
            r2 = 5
            r3 = 8
            r5 = 80
            r6 = 2
            r7 = 16
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r9 = 1
            if (r1 != r9) goto L_0x00b1
            int r1 = r23.getPaddingLeft()
            int r10 = r27 - r25
            int r11 = r23.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r23.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r23.getVirtualChildCount()
            int r13 = r0.f3580j
            r14 = r13 & 112(0x70, float:1.57E-43)
            r8 = r8 & r13
            if (r14 == r7) goto L_0x0042
            if (r14 == r5) goto L_0x0036
            int r5 = r23.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r5 = r23.getPaddingTop()
            int r5 = r5 + r28
            int r5 = r5 - r26
            int r7 = r0.f3581k
            int r5 = r5 - r7
            goto L_0x004d
        L_0x0042:
            int r5 = r23.getPaddingTop()
            int r7 = r28 - r26
            int r13 = r0.f3581k
            int r7 = r7 - r13
            int r7 = r7 / r6
            int r5 = r5 + r7
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 >= r12) goto L_0x01c9
            android.view.View r7 = r0.getChildAt(r4)
            if (r7 != 0) goto L_0x0057
            goto L_0x00ac
        L_0x0057:
            int r13 = r7.getVisibility()
            if (r13 == r3) goto L_0x00ac
            int r13 = r7.getMeasuredWidth()
            int r14 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r7.getLayoutParams()
            j.C r15 = (j.C) r15
            int r3 = r15.f3575b
            if (r3 >= 0) goto L_0x0070
            r3 = r8
        L_0x0070:
            java.lang.reflect.Field r16 = A.A.f0a
            int r6 = r23.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r6)
            r3 = r3 & 7
            if (r3 == r9) goto L_0x008a
            if (r3 == r2) goto L_0x0084
            int r3 = r15.leftMargin
            int r3 = r3 + r1
            goto L_0x0095
        L_0x0084:
            int r3 = r11 - r13
            int r6 = r15.rightMargin
        L_0x0088:
            int r3 = r3 - r6
            goto L_0x0095
        L_0x008a:
            int r3 = r10 - r13
            r6 = 2
            int r3 = r3 / r6
            int r3 = r3 + r1
            int r6 = r15.leftMargin
            int r3 = r3 + r6
            int r6 = r15.rightMargin
            goto L_0x0088
        L_0x0095:
            boolean r6 = r0.g(r4)
            if (r6 == 0) goto L_0x009e
            int r6 = r0.f3588r
            int r5 = r5 + r6
        L_0x009e:
            int r6 = r15.topMargin
            int r5 = r5 + r6
            int r13 = r13 + r3
            int r6 = r5 + r14
            r7.layout(r3, r5, r13, r6)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r14 = r14 + r5
            r5 = r14
        L_0x00ac:
            int r4 = r4 + r9
            r3 = 8
            r6 = 2
            goto L_0x004e
        L_0x00b1:
            boolean r1 = j.u0.a(r23)
            int r3 = r23.getPaddingTop()
            int r6 = r28 - r26
            int r10 = r23.getPaddingBottom()
            int r10 = r6 - r10
            int r6 = r6 - r3
            int r11 = r23.getPaddingBottom()
            int r6 = r6 - r11
            int r11 = r23.getVirtualChildCount()
            int r12 = r0.f3580j
            r8 = r8 & r12
            r12 = r12 & 112(0x70, float:1.57E-43)
            boolean r13 = r0.f3576f
            int[] r14 = r0.f3584n
            int[] r15 = r0.f3585o
            java.lang.reflect.Field r17 = A.A.f0a
            int r4 = r23.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r8, r4)
            if (r4 == r9) goto L_0x00f5
            if (r4 == r2) goto L_0x00e9
            int r2 = r23.getPaddingLeft()
            goto L_0x0101
        L_0x00e9:
            int r2 = r23.getPaddingLeft()
            int r2 = r2 + r27
            int r2 = r2 - r25
            int r4 = r0.f3581k
            int r2 = r2 - r4
            goto L_0x0101
        L_0x00f5:
            int r2 = r23.getPaddingLeft()
            int r4 = r27 - r25
            int r8 = r0.f3581k
            int r4 = r4 - r8
            r8 = 2
            int r4 = r4 / r8
            int r2 = r2 + r4
        L_0x0101:
            if (r1 == 0) goto L_0x0107
            int r1 = r11 + -1
            r8 = -1
            goto L_0x0109
        L_0x0107:
            r8 = r9
            r1 = 0
        L_0x0109:
            r9 = 0
        L_0x010a:
            if (r9 >= r11) goto L_0x01c9
            int r18 = r8 * r9
            int r5 = r18 + r1
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 != 0) goto L_0x0122
            r26 = r1
            r27 = r8
            r28 = r11
            r20 = r12
            r1 = 1
            r12 = -1
            goto L_0x01ba
        L_0x0122:
            int r4 = r7.getVisibility()
            r26 = r1
            r1 = 8
            if (r4 == r1) goto L_0x01b2
            int r4 = r7.getMeasuredWidth()
            int r19 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r20 = r7.getLayoutParams()
            r1 = r20
            j.C r1 = (j.C) r1
            r27 = r8
            if (r13 == 0) goto L_0x014c
            int r8 = r1.height
            r28 = r11
            r11 = -1
            if (r8 == r11) goto L_0x014e
            int r11 = r7.getBaseline()
            goto L_0x014f
        L_0x014c:
            r28 = r11
        L_0x014e:
            r11 = -1
        L_0x014f:
            int r8 = r1.f3575b
            if (r8 >= 0) goto L_0x0154
            r8 = r12
        L_0x0154:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r20 = r12
            r12 = 16
            if (r8 == r12) goto L_0x018c
            r12 = 48
            if (r8 == r12) goto L_0x017d
            r12 = 80
            if (r8 == r12) goto L_0x0167
            r8 = r3
            r12 = -1
            goto L_0x0198
        L_0x0167:
            int r8 = r10 - r19
            int r12 = r1.bottomMargin
            int r8 = r8 - r12
            r12 = -1
            if (r11 == r12) goto L_0x0198
            int r21 = r7.getMeasuredHeight()
            int r21 = r21 - r11
            r11 = 2
            r22 = r15[r11]
            int r22 = r22 - r21
            int r8 = r8 - r22
            goto L_0x0198
        L_0x017d:
            r12 = -1
            int r8 = r1.topMargin
            int r8 = r8 + r3
            if (r11 == r12) goto L_0x0198
            r17 = 1
            r21 = r14[r17]
            int r21 = r21 - r11
            int r8 = r21 + r8
            goto L_0x0198
        L_0x018c:
            r12 = -1
            int r8 = r6 - r19
            r11 = 2
            int r8 = r8 / r11
            int r8 = r8 + r3
            int r11 = r1.topMargin
            int r8 = r8 + r11
            int r11 = r1.bottomMargin
            int r8 = r8 - r11
        L_0x0198:
            boolean r5 = r0.g(r5)
            if (r5 == 0) goto L_0x01a1
            int r5 = r0.f3587q
            int r2 = r2 + r5
        L_0x01a1:
            int r5 = r1.leftMargin
            int r2 = r2 + r5
            int r5 = r2 + r4
            int r11 = r8 + r19
            r7.layout(r2, r8, r5, r11)
            int r1 = r1.rightMargin
            int r4 = r4 + r1
            int r4 = r4 + r2
            r2 = r4
        L_0x01b0:
            r1 = 1
            goto L_0x01ba
        L_0x01b2:
            r27 = r8
            r28 = r11
            r20 = r12
            r12 = -1
            goto L_0x01b0
        L_0x01ba:
            int r9 = r9 + r1
            r1 = r26
            r8 = r27
            r11 = r28
            r12 = r20
            r5 = 80
            r7 = 16
            goto L_0x010a
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.D.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02dc, code lost:
        if (r9.width == -1) goto L_0x02e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x06b1  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x07a4  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x07c8  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x07fb  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0803  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x085d  */
    /* JADX WARNING: Removed duplicated region for block: B:425:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
            r37 = this;
            r6 = r37
            r7 = r38
            r8 = r39
            int r0 = r6.f3579i
            r10 = -2
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 8
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 0
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x037f
            r6.f3581k = r5
            int r3 = r37.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r38)
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r0 = r6.f3577g
            boolean r9 = r6.f3583m
            r24 = r4
            r13 = r5
            r18 = r13
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r25 = r23
            r17 = r15
        L_0x0039:
            if (r13 >= r3) goto L_0x0172
            android.view.View r26 = r6.getChildAt(r13)
            if (r26 != 0) goto L_0x0050
            int r4 = r6.f3581k
            r6.f3581k = r4
        L_0x0045:
            r10 = r0
            r29 = r1
            r31 = r3
            r11 = r22
            r27 = 1
            goto L_0x015c
        L_0x0050:
            int r4 = r26.getVisibility()
            if (r4 != r12) goto L_0x0057
            goto L_0x0045
        L_0x0057:
            boolean r4 = r6.g(r13)
            if (r4 == 0) goto L_0x0064
            int r4 = r6.f3581k
            int r5 = r6.f3588r
            int r4 = r4 + r5
            r6.f3581k = r4
        L_0x0064:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            j.C r5 = (j.C) r5
            float r4 = r5.f3574a
            float r17 = r17 + r4
            if (r1 != r11) goto L_0x0093
            int r12 = r5.height
            if (r12 != 0) goto L_0x0093
            int r12 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x0093
            int r4 = r6.f3581k
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r11 = r5.bottomMargin
            int r12 = r12 + r11
            int r4 = java.lang.Math.max(r4, r12)
            r6.f3581k = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r15 = r5
            r4 = 1
            r27 = 1
            goto L_0x00e3
        L_0x0093:
            int r11 = r5.height
            if (r11 != 0) goto L_0x009f
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x009f
            r5.height = r10
            r11 = 0
            goto L_0x00a0
        L_0x009f:
            r11 = r14
        L_0x00a0:
            int r4 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r4 != 0) goto L_0x00a8
            int r4 = r6.f3581k
            r12 = r4
            goto L_0x00a9
        L_0x00a8:
            r12 = 0
        L_0x00a9:
            r4 = 0
            r10 = r0
            r0 = r37
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r38
            r31 = r3
            r3 = r4
            r27 = 1
            r4 = r39
            r15 = r5
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r11 == r14) goto L_0x00c5
            r15.height = r11
        L_0x00c5:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f3581k
            int r2 = r1 + r0
            int r3 = r15.topMargin
            int r2 = r2 + r3
            int r3 = r15.bottomMargin
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f3581k = r1
            r5 = r21
            if (r9 == 0) goto L_0x00e1
            int r21 = java.lang.Math.max(r0, r5)
        L_0x00e1:
            r4 = r20
        L_0x00e3:
            if (r10 < 0) goto L_0x00ed
            int r0 = r13 + 1
            if (r10 != r0) goto L_0x00ed
            int r0 = r6.f3581k
            r6.f3578h = r0
        L_0x00ed:
            float r0 = r15.f3574a
            if (r13 >= r10) goto L_0x00f6
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x00fb
        L_0x00f6:
            r2 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0103
        L_0x00fb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0103:
            if (r2 == r1) goto L_0x010f
            int r1 = r15.width
            r3 = -1
            if (r1 != r3) goto L_0x010f
            r5 = r27
            r25 = r5
            goto L_0x0110
        L_0x010f:
            r5 = 0
        L_0x0110:
            int r1 = r15.leftMargin
            int r3 = r15.rightMargin
            int r1 = r1 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r1
            r11 = r22
            int r11 = java.lang.Math.max(r11, r3)
            int r12 = r26.getMeasuredState()
            r14 = r23
            int r12 = android.view.View.combineMeasuredStates(r14, r12)
            if (r24 == 0) goto L_0x0135
            int r14 = r15.width
            r15 = -1
            if (r14 != r15) goto L_0x0135
            r14 = r27
        L_0x0133:
            r15 = 0
            goto L_0x0137
        L_0x0135:
            r14 = 0
            goto L_0x0133
        L_0x0137:
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0147
            if (r5 == 0) goto L_0x0140
        L_0x013d:
            r0 = r19
            goto L_0x0142
        L_0x0140:
            r1 = r3
            goto L_0x013d
        L_0x0142:
            int r19 = java.lang.Math.max(r0, r1)
            goto L_0x0156
        L_0x0147:
            r0 = r19
            if (r5 == 0) goto L_0x014e
        L_0x014b:
            r3 = r18
            goto L_0x0150
        L_0x014e:
            r1 = r3
            goto L_0x014b
        L_0x0150:
            int r18 = java.lang.Math.max(r3, r1)
            r19 = r0
        L_0x0156:
            r20 = r4
            r23 = r12
            r24 = r14
        L_0x015c:
            int r13 = r13 + 1
            r0 = r10
            r22 = r11
            r4 = r27
            r1 = r29
            r3 = r31
            r5 = 0
            r10 = -2
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 8
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 0
            goto L_0x0039
        L_0x0172:
            r29 = r1
            r31 = r3
            r27 = r4
            r3 = r18
            r0 = r19
            r5 = r21
            r11 = r22
            r14 = r23
            int r1 = r6.f3581k
            r10 = r31
            if (r1 <= 0) goto L_0x0195
            boolean r1 = r6.g(r10)
            if (r1 == 0) goto L_0x0195
            int r1 = r6.f3581k
            int r4 = r6.f3588r
            int r1 = r1 + r4
            r6.f3581k = r1
        L_0x0195:
            r4 = r29
            if (r9 == 0) goto L_0x01d5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r1) goto L_0x019f
            if (r4 != 0) goto L_0x01d5
        L_0x019f:
            r12 = 0
            r6.f3581k = r12
            r1 = r12
        L_0x01a3:
            if (r1 >= r10) goto L_0x01d5
            android.view.View r13 = r6.getChildAt(r1)
            if (r13 != 0) goto L_0x01b0
            int r13 = r6.f3581k
            r6.f3581k = r13
            goto L_0x01d1
        L_0x01b0:
            int r15 = r13.getVisibility()
            r12 = 8
            if (r15 != r12) goto L_0x01b9
            goto L_0x01d1
        L_0x01b9:
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            j.C r12 = (j.C) r12
            int r13 = r6.f3581k
            int r21 = r13 + r5
            int r15 = r12.topMargin
            int r21 = r21 + r15
            int r12 = r12.bottomMargin
            int r12 = r21 + r12
            int r12 = java.lang.Math.max(r13, r12)
            r6.f3581k = r12
        L_0x01d1:
            int r1 = r1 + 1
            r12 = 0
            goto L_0x01a3
        L_0x01d5:
            int r1 = r6.f3581k
            int r12 = r37.getPaddingTop()
            int r13 = r37.getPaddingBottom()
            int r13 = r13 + r12
            int r13 = r13 + r1
            r6.f3581k = r13
            int r1 = r37.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r13, r1)
            r12 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r12)
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r1
            int r13 = r6.f3581k
            int r12 = r12 - r13
            if (r20 != 0) goto L_0x0242
            if (r12 == 0) goto L_0x0201
            r13 = 0
            int r15 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0201
            goto L_0x0242
        L_0x0201:
            int r0 = java.lang.Math.max(r3, r0)
            if (r9 == 0) goto L_0x023e
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == r3) goto L_0x023e
            r3 = 0
        L_0x020c:
            if (r3 >= r10) goto L_0x023e
            android.view.View r4 = r6.getChildAt(r3)
            if (r4 == 0) goto L_0x023b
            int r9 = r4.getVisibility()
            r12 = 8
            if (r9 != r12) goto L_0x021d
            goto L_0x023b
        L_0x021d:
            android.view.ViewGroup$LayoutParams r9 = r4.getLayoutParams()
            j.C r9 = (j.C) r9
            float r9 = r9.f3574a
            r12 = 0
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x023b
            int r9 = r4.getMeasuredWidth()
            r12 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r12)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r12)
            r4.measure(r9, r13)
        L_0x023b:
            int r3 = r3 + 1
            goto L_0x020c
        L_0x023e:
            r22 = r11
            goto L_0x031f
        L_0x0242:
            float r0 = r6.f3582l
            r5 = 0
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x024b
            r17 = r0
        L_0x024b:
            r0 = 0
            r6.f3581k = r0
            r5 = 0
        L_0x024f:
            if (r5 >= r10) goto L_0x030e
            android.view.View r0 = r6.getChildAt(r5)
            int r9 = r0.getVisibility()
            r13 = 8
            if (r9 != r13) goto L_0x0261
            r29 = r4
            goto L_0x0308
        L_0x0261:
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            j.C r9 = (j.C) r9
            float r13 = r9.f3574a
            r15 = 0
            int r16 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x02c3
            float r15 = (float) r12
            float r15 = r15 * r13
            float r15 = r15 / r17
            int r15 = (int) r15
            float r17 = r17 - r13
            int r12 = r12 - r15
            int r13 = r37.getPaddingLeft()
            int r16 = r37.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r9.leftMargin
            int r16 = r16 + r13
            int r13 = r9.rightMargin
            int r13 = r16 + r13
            r16 = r12
            int r12 = r9.width
            int r12 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r12)
            int r13 = r9.height
            if (r13 != 0) goto L_0x02a5
            r13 = 1073741824(0x40000000, float:2.0)
            if (r4 == r13) goto L_0x0299
            goto L_0x02a7
        L_0x0299:
            if (r15 <= 0) goto L_0x029c
            goto L_0x029d
        L_0x029c:
            r15 = 0
        L_0x029d:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r13)
            r0.measure(r12, r15)
            goto L_0x02b7
        L_0x02a5:
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x02a7:
            int r18 = r0.getMeasuredHeight()
            int r15 = r18 + r15
            if (r15 >= 0) goto L_0x02b0
            r15 = 0
        L_0x02b0:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r13)
            r0.measure(r12, r15)
        L_0x02b7:
            int r12 = r0.getMeasuredState()
            r12 = r12 & -256(0xffffffffffffff00, float:NaN)
            int r14 = android.view.View.combineMeasuredStates(r14, r12)
            r12 = r16
        L_0x02c3:
            int r13 = r9.leftMargin
            int r15 = r9.rightMargin
            int r13 = r13 + r15
            int r15 = r0.getMeasuredWidth()
            int r15 = r15 + r13
            int r11 = java.lang.Math.max(r11, r15)
            r29 = r4
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 == r4) goto L_0x02df
            int r4 = r9.width
            r16 = r11
            r11 = -1
            if (r4 != r11) goto L_0x02e2
            goto L_0x02e3
        L_0x02df:
            r16 = r11
            r11 = -1
        L_0x02e2:
            r13 = r15
        L_0x02e3:
            int r3 = java.lang.Math.max(r3, r13)
            if (r24 == 0) goto L_0x02f0
            int r4 = r9.width
            if (r4 != r11) goto L_0x02f0
            r4 = r27
            goto L_0x02f1
        L_0x02f0:
            r4 = 0
        L_0x02f1:
            int r11 = r6.f3581k
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 + r11
            int r13 = r9.topMargin
            int r0 = r0 + r13
            int r9 = r9.bottomMargin
            int r0 = r0 + r9
            int r0 = java.lang.Math.max(r11, r0)
            r6.f3581k = r0
            r24 = r4
            r11 = r16
        L_0x0308:
            int r5 = r5 + 1
            r4 = r29
            goto L_0x024f
        L_0x030e:
            int r0 = r6.f3581k
            int r4 = r37.getPaddingTop()
            int r5 = r37.getPaddingBottom()
            int r5 = r5 + r4
            int r5 = r5 + r0
            r6.f3581k = r5
            r0 = r3
            goto L_0x023e
        L_0x031f:
            if (r24 != 0) goto L_0x0326
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 == r3) goto L_0x0326
            goto L_0x0328
        L_0x0326:
            r0 = r22
        L_0x0328:
            int r2 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r3 = r3 + r2
            int r3 = r3 + r0
            int r0 = r37.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r14)
            r6.setMeasuredDimension(r0, r1)
            if (r25 == 0) goto L_0x089c
            int r0 = r37.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x034e:
            if (r9 >= r10) goto L_0x089c
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x037c
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            j.C r11 = (j.C) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x037c
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r7
            r4 = r39
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x037c:
            int r9 = r9 + 1
            goto L_0x034e
        L_0x037f:
            r27 = r4
            r0 = r5
            r6.f3581k = r0
            int r9 = r37.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r6.f3584n
            r12 = 4
            if (r0 == 0) goto L_0x0399
            int[] r0 = r6.f3585o
            if (r0 != 0) goto L_0x03a1
        L_0x0399:
            int[] r0 = new int[r12]
            r6.f3584n = r0
            int[] r0 = new int[r12]
            r6.f3585o = r0
        L_0x03a1:
            int[] r13 = r6.f3584n
            int[] r14 = r6.f3585o
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f3576f
            boolean r4 = r6.f3583m
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03c5
            r18 = r27
            goto L_0x03c7
        L_0x03c5:
            r18 = 0
        L_0x03c7:
            r19 = r27
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r21 = 0
            r24 = 0
        L_0x03d4:
            if (r3 >= r9) goto L_0x0574
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x03e8
            int r7 = r6.f3581k
            r6.f3581k = r7
            r25 = r3
            r26 = r4
            r30 = r5
            goto L_0x056a
        L_0x03e8:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x0400
            r30 = r5
            r0 = r25
            r2 = r26
            r25 = r3
            r26 = r4
            goto L_0x056a
        L_0x0400:
            boolean r0 = r6.g(r3)
            if (r0 == 0) goto L_0x040d
            int r0 = r6.f3581k
            int r2 = r6.f3587q
            int r0 = r0 + r2
            r6.f3581k = r0
        L_0x040d:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            j.C r2 = (j.C) r2
            float r0 = r2.f3574a
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x046c
            int r1 = r2.width
            if (r1 != 0) goto L_0x046c
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x046c
            if (r18 == 0) goto L_0x0434
            int r0 = r6.f3581k
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f3581k = r1
            goto L_0x0444
        L_0x0434:
            r30 = r3
            int r0 = r6.f3581k
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f3581k = r0
        L_0x0444:
            if (r5 == 0) goto L_0x045b
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r0 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x04df
        L_0x045b:
            r0 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r4 = r27
            goto L_0x04e3
        L_0x046c:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x047c
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x047d
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x047f
        L_0x047c:
            r1 = 0
        L_0x047d:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x047f:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0488
            int r0 = r6.f3581k
            r31 = r0
            goto L_0x048a
        L_0x0488:
            r31 = 0
        L_0x048a:
            r32 = 0
            r1 = r25
            r0 = r37
            r33 = r1
            r1 = r7
            r35 = r2
            r34 = r26
            r2 = r38
            r36 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r39
            r30 = r5
            r5 = r32
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r1 = r36
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x04b5
            r0 = r35
            r0.width = r1
            goto L_0x04b7
        L_0x04b5:
            r0 = r35
        L_0x04b7:
            int r1 = r7.getMeasuredWidth()
            if (r18 == 0) goto L_0x04c9
            int r2 = r6.f3581k
            int r3 = r0.leftMargin
            int r3 = r3 + r1
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.f3581k = r3
            goto L_0x04d9
        L_0x04c9:
            int r2 = r6.f3581k
            int r3 = r2 + r1
            int r4 = r0.leftMargin
            int r3 = r3 + r4
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f3581k = r2
        L_0x04d9:
            if (r26 == 0) goto L_0x04df
            int r12 = java.lang.Math.max(r1, r12)
        L_0x04df:
            r4 = r21
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x04e3:
            if (r11 == r1) goto L_0x04ef
            int r1 = r0.height
            r2 = -1
            if (r1 != r2) goto L_0x04ef
            r5 = r27
            r24 = r5
            goto L_0x04f0
        L_0x04ef:
            r5 = 0
        L_0x04f0:
            int r1 = r0.topMargin
            int r2 = r0.bottomMargin
            int r1 = r1 + r2
            int r2 = r7.getMeasuredHeight()
            int r2 = r2 + r1
            int r3 = r7.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r8, r3)
            if (r30 == 0) goto L_0x0534
            int r7 = r7.getBaseline()
            r8 = -1
            if (r7 == r8) goto L_0x0534
            int r8 = r0.f3575b
            if (r8 >= 0) goto L_0x0511
            int r8 = r6.f3580j
        L_0x0511:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r8 = r8 >> 4
            r21 = -2
            r8 = r8 & -2
            int r8 = r8 >> 1
            r21 = r1
            r1 = r13[r8]
            int r1 = java.lang.Math.max(r1, r7)
            r13[r8] = r1
            r1 = r14[r8]
            int r7 = r2 - r7
            int r1 = java.lang.Math.max(r1, r7)
            r14[r8] = r1
        L_0x0531:
            r7 = r34
            goto L_0x0537
        L_0x0534:
            r21 = r1
            goto L_0x0531
        L_0x0537:
            int r1 = java.lang.Math.max(r7, r2)
            if (r19 == 0) goto L_0x0545
            int r7 = r0.height
            r8 = -1
            if (r7 != r8) goto L_0x0545
            r7 = r27
            goto L_0x0546
        L_0x0545:
            r7 = 0
        L_0x0546:
            float r0 = r0.f3574a
            r8 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0558
            if (r5 == 0) goto L_0x0551
            r2 = r21
        L_0x0551:
            int r15 = java.lang.Math.max(r15, r2)
            r0 = r33
            goto L_0x0562
        L_0x0558:
            if (r5 == 0) goto L_0x055c
            r2 = r21
        L_0x055c:
            r0 = r33
            int r0 = java.lang.Math.max(r0, r2)
        L_0x0562:
            r2 = r1
            r8 = r3
            r21 = r4
            r19 = r7
            r1 = r29
        L_0x056a:
            int r3 = r25 + 1
            r7 = r38
            r4 = r26
            r5 = r30
            goto L_0x03d4
        L_0x0574:
            r7 = r2
            r26 = r4
            r30 = r5
            int r2 = r6.f3581k
            if (r2 <= 0) goto L_0x058a
            boolean r2 = r6.g(r9)
            if (r2 == 0) goto L_0x058a
            int r2 = r6.f3581k
            int r3 = r6.f3587q
            int r2 = r2 + r3
            r6.f3581k = r2
        L_0x058a:
            r2 = r13[r27]
            r3 = -1
            if (r2 != r3) goto L_0x05a2
            r4 = 0
            r5 = r13[r4]
            if (r5 != r3) goto L_0x05a2
            r4 = r13[r17]
            if (r4 != r3) goto L_0x05a2
            r4 = 3
            r5 = r13[r4]
            if (r5 == r3) goto L_0x059e
            goto L_0x05a3
        L_0x059e:
            r2 = r7
            r25 = r8
            goto L_0x05d3
        L_0x05a2:
            r4 = 3
        L_0x05a3:
            r3 = r13[r4]
            r5 = 0
            r4 = r13[r5]
            r5 = r13[r17]
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r2 = java.lang.Math.max(r3, r2)
            r3 = 3
            r4 = r14[r3]
            r3 = 0
            r5 = r14[r3]
            r3 = r14[r27]
            r25 = r8
            r8 = r14[r17]
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r4, r3)
            int r3 = r3 + r2
            int r2 = java.lang.Math.max(r7, r3)
        L_0x05d3:
            if (r26 == 0) goto L_0x061c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x05db
            if (r10 != 0) goto L_0x061c
        L_0x05db:
            r3 = 0
            r6.f3581k = r3
            r5 = 0
        L_0x05df:
            if (r5 >= r9) goto L_0x061c
            android.view.View r3 = r6.getChildAt(r5)
            if (r3 != 0) goto L_0x05ec
            int r3 = r6.f3581k
            r6.f3581k = r3
            goto L_0x0619
        L_0x05ec:
            int r4 = r3.getVisibility()
            r7 = 8
            if (r4 != r7) goto L_0x05f5
            goto L_0x0619
        L_0x05f5:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            j.C r3 = (j.C) r3
            if (r18 == 0) goto L_0x0609
            int r4 = r6.f3581k
            int r7 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r7 = r7 + r4
            r6.f3581k = r7
            goto L_0x0619
        L_0x0609:
            int r4 = r6.f3581k
            int r7 = r4 + r12
            int r8 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r3 = java.lang.Math.max(r4, r7)
            r6.f3581k = r3
        L_0x0619:
            int r5 = r5 + 1
            goto L_0x05df
        L_0x061c:
            int r3 = r6.f3581k
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f3581k = r5
            int r3 = r37.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r7 = r38
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.f3581k
            int r4 = r4 - r5
            if (r21 != 0) goto L_0x068e
            if (r4 == 0) goto L_0x064a
            r8 = 0
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 <= 0) goto L_0x064a
            goto L_0x068e
        L_0x064a:
            int r0 = java.lang.Math.max(r0, r15)
            if (r26 == 0) goto L_0x0687
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x0687
            r1 = 0
        L_0x0655:
            if (r1 >= r9) goto L_0x0687
            android.view.View r4 = r6.getChildAt(r1)
            if (r4 == 0) goto L_0x0684
            int r8 = r4.getVisibility()
            r10 = 8
            if (r8 != r10) goto L_0x0666
            goto L_0x0684
        L_0x0666:
            android.view.ViewGroup$LayoutParams r8 = r4.getLayoutParams()
            j.C r8 = (j.C) r8
            float r8 = r8.f3574a
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0684
            r8 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r8)
            int r13 = r4.getMeasuredHeight()
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r8)
            r4.measure(r10, r13)
        L_0x0684:
            int r1 = r1 + 1
            goto L_0x0655
        L_0x0687:
            r4 = r39
            r22 = r9
            r8 = 0
            goto L_0x0833
        L_0x068e:
            float r2 = r6.f3582l
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0696
            r1 = r2
        L_0x0696:
            r2 = -1
            r8 = 3
            r13[r8] = r2
            r13[r17] = r2
            r13[r27] = r2
            r12 = 0
            r13[r12] = r2
            r14[r8] = r2
            r14[r17] = r2
            r14[r27] = r2
            r14[r12] = r2
            r6.f3581k = r12
            r12 = r25
            r2 = -1
            r8 = 0
        L_0x06af:
            if (r8 >= r9) goto L_0x07db
            android.view.View r15 = r6.getChildAt(r8)
            if (r15 == 0) goto L_0x06bf
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x06cc
        L_0x06bf:
            r7 = r4
            r22 = r9
            r21 = 0
            r23 = 4
            r28 = -2
            r4 = r39
            goto L_0x07d2
        L_0x06cc:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            j.C r5 = (j.C) r5
            float r7 = r5.f3574a
            r21 = 0
            int r22 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r22 <= 0) goto L_0x0737
            r22 = r9
            float r9 = (float) r4
            float r9 = r9 * r7
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r7
            int r4 = r4 - r9
            int r7 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            int r25 = r25 + r7
            int r7 = r5.topMargin
            int r25 = r25 + r7
            int r7 = r5.bottomMargin
            int r7 = r25 + r7
            r25 = r1
            int r1 = r5.height
            r26 = r4
            r4 = r39
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r7, r1)
            int r7 = r5.width
            if (r7 != 0) goto L_0x0715
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x0709
            goto L_0x0717
        L_0x0709:
            if (r9 <= 0) goto L_0x070c
            goto L_0x070d
        L_0x070c:
            r9 = 0
        L_0x070d:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
            goto L_0x0727
        L_0x0715:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x0717:
            int r28 = r15.getMeasuredWidth()
            int r9 = r28 + r9
            if (r9 >= 0) goto L_0x0720
            r9 = 0
        L_0x0720:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
        L_0x0727:
            int r1 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r7 = r26
            goto L_0x073c
        L_0x0737:
            r7 = r4
            r22 = r9
            r4 = r39
        L_0x073c:
            if (r18 == 0) goto L_0x0757
            int r9 = r6.f3581k
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            int r1 = r25 + r9
            r6.f3581k = r1
            r25 = r7
        L_0x0754:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x076f
        L_0x0757:
            r26 = r1
            int r1 = r6.f3581k
            int r9 = r15.getMeasuredWidth()
            int r9 = r9 + r1
            r25 = r7
            int r7 = r5.leftMargin
            int r9 = r9 + r7
            int r7 = r5.rightMargin
            int r9 = r9 + r7
            int r1 = java.lang.Math.max(r1, r9)
            r6.f3581k = r1
            goto L_0x0754
        L_0x076f:
            if (r11 == r1) goto L_0x0779
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x0779
            r1 = r27
            goto L_0x077a
        L_0x0779:
            r1 = 0
        L_0x077a:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x078b
            goto L_0x078c
        L_0x078b:
            r7 = r9
        L_0x078c:
            int r0 = java.lang.Math.max(r0, r7)
            if (r19 == 0) goto L_0x079a
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x079b
            r1 = r27
            goto L_0x079c
        L_0x079a:
            r7 = -1
        L_0x079b:
            r1 = 0
        L_0x079c:
            if (r30 == 0) goto L_0x07c8
            int r15 = r15.getBaseline()
            if (r15 == r7) goto L_0x07c8
            int r5 = r5.f3575b
            if (r5 >= 0) goto L_0x07aa
            int r5 = r6.f3580j
        L_0x07aa:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r23 = 4
            int r5 = r5 >> 4
            r28 = -2
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r5] = r7
            r7 = r14[r5]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r5] = r7
            goto L_0x07cc
        L_0x07c8:
            r23 = 4
            r28 = -2
        L_0x07cc:
            r19 = r1
            r7 = r25
            r1 = r26
        L_0x07d2:
            int r8 = r8 + 1
            r4 = r7
            r9 = r22
            r7 = r38
            goto L_0x06af
        L_0x07db:
            r4 = r39
            r22 = r9
            int r1 = r6.f3581k
            int r5 = r37.getPaddingLeft()
            int r7 = r37.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r6.f3581k = r7
            r1 = r13[r27]
            r5 = -1
            if (r1 != r5) goto L_0x0803
            r7 = 0
            r8 = r13[r7]
            if (r8 != r5) goto L_0x0803
            r7 = r13[r17]
            if (r7 != r5) goto L_0x0803
            r7 = 3
            r8 = r13[r7]
            if (r8 == r5) goto L_0x0801
            goto L_0x0804
        L_0x0801:
            r8 = 0
            goto L_0x0831
        L_0x0803:
            r7 = 3
        L_0x0804:
            r5 = r13[r7]
            r8 = 0
            r9 = r13[r8]
            r10 = r13[r17]
            int r1 = java.lang.Math.max(r1, r10)
            int r1 = java.lang.Math.max(r9, r1)
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r14[r7]
            r7 = r14[r8]
            r9 = r14[r27]
            r10 = r14[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r2, r5)
            r2 = r1
        L_0x0831:
            r25 = r12
        L_0x0833:
            if (r19 != 0) goto L_0x083a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x083a
            goto L_0x083b
        L_0x083a:
            r0 = r2
        L_0x083b:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r25 & r1
            r1 = r1 | r3
            int r2 = r25 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x089c
            int r0 = r37.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r22
        L_0x0869:
            if (r8 >= r9) goto L_0x089c
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x0898
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            j.C r11 = (j.C) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x0899
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r38
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x0899
        L_0x0898:
            r12 = -1
        L_0x0899:
            int r8 = r8 + 1
            goto L_0x0869
        L_0x089c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.D.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z3) {
        this.f3576f = z3;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 < 0 || i3 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f3577g = i3;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f3586p) {
            this.f3586p = drawable;
            boolean z3 = false;
            if (drawable != null) {
                this.f3587q = drawable.getIntrinsicWidth();
                this.f3588r = drawable.getIntrinsicHeight();
            } else {
                this.f3587q = 0;
                this.f3588r = 0;
            }
            if (drawable == null) {
                z3 = true;
            }
            setWillNotDraw(z3);
            requestLayout();
        }
    }

    public void setDividerPadding(int i3) {
        this.f3590t = i3;
    }

    public void setGravity(int i3) {
        if (this.f3580j != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f3580j = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f3580j;
        if ((8388615 & i5) != i4) {
            this.f3580j = i4 | (-8388616 & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f3583m = z3;
    }

    public void setOrientation(int i3) {
        if (this.f3579i != i3) {
            this.f3579i = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f3589s) {
            requestLayout();
        }
        this.f3589s = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f3580j;
        if ((i5 & 112) != i4) {
            this.f3580j = i4 | (i5 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f3582l = Math.max(0.0f, f3);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
