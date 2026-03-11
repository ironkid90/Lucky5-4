package androidx.core.widget;

import A.A;
import A.C0001b;
import A.C0003d;
import A.C0008i;
import A.C0010k;
import A.C0011l;
import A.C0017s;
import B.m;
import F.d;
import F.g;
import F.h;
import F.i;
import F.j;
import M0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.ai9poker.app.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements C0010k {

    /* renamed from: G  reason: collision with root package name */
    public static final float f2306G = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: H  reason: collision with root package name */
    public static final g f2307H = new C0001b();

    /* renamed from: I  reason: collision with root package name */
    public static final int[] f2308I = {16843130};

    /* renamed from: A  reason: collision with root package name */
    public int f2309A;

    /* renamed from: B  reason: collision with root package name */
    public j f2310B;

    /* renamed from: C  reason: collision with root package name */
    public final C0011l f2311C;

    /* renamed from: D  reason: collision with root package name */
    public final C0008i f2312D;

    /* renamed from: E  reason: collision with root package name */
    public float f2313E;

    /* renamed from: F  reason: collision with root package name */
    public final C0003d f2314F = new C0003d(getContext(), new m(1, (Object) this));

    /* renamed from: f  reason: collision with root package name */
    public final float f2315f;

    /* renamed from: g  reason: collision with root package name */
    public long f2316g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f2317h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public final OverScroller f2318i;

    /* renamed from: j  reason: collision with root package name */
    public final EdgeEffect f2319j;

    /* renamed from: k  reason: collision with root package name */
    public final EdgeEffect f2320k;

    /* renamed from: l  reason: collision with root package name */
    public int f2321l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2322m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2323n = false;

    /* renamed from: o  reason: collision with root package name */
    public View f2324o = null;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2325p = false;

    /* renamed from: q  reason: collision with root package name */
    public VelocityTracker f2326q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2327r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2328s = true;

    /* renamed from: t  reason: collision with root package name */
    public final int f2329t;

    /* renamed from: u  reason: collision with root package name */
    public final int f2330u;
    public final int v;

    /* renamed from: w  reason: collision with root package name */
    public int f2331w = -1;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f2332x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f2333y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public int f2334z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            edgeEffect = d.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f2319j = edgeEffect;
        if (i3 >= 31) {
            edgeEffect2 = d.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f2320k = edgeEffect2;
        this.f2315f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2318i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2329t = viewConfiguration.getScaledTouchSlop();
        this.f2330u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2308I, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2311C = new C0011l(0);
        this.f2312D = new C0008i(this);
        setNestedScrollingEnabled(true);
        A.a(this, f2307H);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !k((View) parent, nestedScrollView)) {
            return false;
        }
        return true;
    }

    public final void a(View view, View view2, int i3, int i4) {
        C0011l lVar = this.f2311C;
        if (i4 == 1) {
            lVar.f56c = i3;
        } else {
            lVar.f55b = i3;
        }
        u(2, i4);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        m(i6, i7, (int[]) null);
    }

    public final void c(View view, int i3) {
        C0011l lVar = this.f2311C;
        if (i3 == 1) {
            lVar.f56c = 0;
        } else {
            lVar.f55b = 0;
        }
        w(i3);
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r14 = this;
            android.widget.OverScroller r0 = r14.f2318i
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r14.f2318i
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r14.f2318i
            int r0 = r0.getCurrY()
            int r1 = r14.f2309A
            int r1 = r0 - r1
            int r2 = r14.getHeight()
            android.widget.EdgeEffect r3 = r14.f2320k
            android.widget.EdgeEffect r4 = r14.f2319j
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x0047
            float r8 = M0.a.r(r4)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0047
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r8 = (float) r2
            float r6 = r6 / r8
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r7
            float r5 = M0.a.D(r4, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0045
            r4.finish()
        L_0x0045:
            int r1 = r1 - r2
            goto L_0x0065
        L_0x0047:
            if (r1 >= 0) goto L_0x0065
            float r8 = M0.a.r(r3)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0065
            float r6 = (float) r1
            float r6 = r6 * r7
            float r2 = (float) r2
            float r6 = r6 / r2
            float r2 = r2 / r7
            float r5 = M0.a.D(r3, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0045
            r3.finish()
            goto L_0x0045
        L_0x0065:
            r14.f2309A = r0
            int[] r0 = r14.f2333y
            r2 = 1
            r11 = 0
            r0[r2] = r11
            r9 = 0
            A.i r5 = r14.f2312D
            r6 = 0
            r10 = 1
            r7 = r1
            r8 = r0
            r5.c(r6, r7, r8, r9, r10)
            r5 = r0[r2]
            int r1 = r1 - r5
            int r13 = r14.getScrollRange()
            if (r1 == 0) goto L_0x00a3
            int r5 = r14.getScrollY()
            int r6 = r14.getScrollX()
            r14.o(r1, r6, r5, r13)
            int r6 = r14.getScrollY()
            int r7 = r6 - r5
            int r1 = r1 - r7
            r0[r2] = r11
            r6 = 0
            r8 = 0
            A.i r5 = r14.f2312D
            int[] r10 = r14.f2332x
            r11 = 1
            r9 = r1
            r12 = r0
            r5.d(r6, r7, r8, r9, r10, r11, r12)
            r0 = r0[r2]
            int r1 = r1 - r0
        L_0x00a3:
            if (r1 == 0) goto L_0x00da
            int r0 = r14.getOverScrollMode()
            if (r0 == 0) goto L_0x00af
            if (r0 != r2) goto L_0x00d2
            if (r13 <= 0) goto L_0x00d2
        L_0x00af:
            if (r1 >= 0) goto L_0x00c2
            boolean r0 = r4.isFinished()
            if (r0 == 0) goto L_0x00d2
            android.widget.OverScroller r0 = r14.f2318i
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r4.onAbsorb(r0)
            goto L_0x00d2
        L_0x00c2:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L_0x00d2
            android.widget.OverScroller r0 = r14.f2318i
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L_0x00d2:
            android.widget.OverScroller r0 = r14.f2318i
            r0.abortAnimation()
            r14.w(r2)
        L_0x00da:
            android.widget.OverScroller r0 = r14.f2318i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00e6
            r14.postInvalidateOnAnimation()
            goto L_0x00e9
        L_0x00e6:
            r14.w(r2)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public final void d(int i3, int i4, int[] iArr, int i5) {
        this.f2312D.c(i3, i4, iArr, (int[]) null, i5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyEvent(r7)
            r1 = 1
            if (r0 != 0) goto L_0x00ce
            android.graphics.Rect r0 = r6.f2317h
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r2 = 0
            r3 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto L_0x00a1
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r0 = r0.getHeight()
            int r5 = r4.topMargin
            int r0 = r0 + r5
            int r4 = r4.bottomMargin
            int r0 = r0 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            if (r0 <= r4) goto L_0x00a1
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00c9
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x0091
            r4 = 20
            if (r0 == r4) goto L_0x0081
            r4 = 62
            if (r0 == r4) goto L_0x0076
            r7 = 92
            if (r0 == r7) goto L_0x0071
            r7 = 93
            if (r0 == r7) goto L_0x006c
            r7 = 122(0x7a, float:1.71E-43)
            if (r0 == r7) goto L_0x0068
            r7 = 123(0x7b, float:1.72E-43)
            if (r0 == r7) goto L_0x0063
            goto L_0x00c9
        L_0x0063:
            r6.p(r3)
            goto L_0x00c9
        L_0x0068:
            r6.p(r5)
            goto L_0x00c9
        L_0x006c:
            boolean r7 = r6.j(r3)
            goto L_0x00ca
        L_0x0071:
            boolean r7 = r6.j(r5)
            goto L_0x00ca
        L_0x0076:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x007d
            r3 = r5
        L_0x007d:
            r6.p(r3)
            goto L_0x00c9
        L_0x0081:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L_0x008c
            boolean r7 = r6.j(r3)
            goto L_0x00ca
        L_0x008c:
            boolean r7 = r6.g(r3)
            goto L_0x00ca
        L_0x0091:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L_0x009c
            boolean r7 = r6.j(r5)
            goto L_0x00ca
        L_0x009c:
            boolean r7 = r6.g(r5)
            goto L_0x00ca
        L_0x00a1:
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x00c9
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x00c9
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x00b5
            r7 = 0
        L_0x00b5:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x00c9
            if (r7 == r6) goto L_0x00c9
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x00c9
            r7 = r1
            goto L_0x00ca
        L_0x00c9:
            r7 = r2
        L_0x00ca:
            if (r7 == 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r1 = r2
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return this.f2312D.a(f3, f4, z3);
    }

    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f2312D.b(f3, f4);
    }

    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.f2312D.c(i3, i4, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f2312D.d(i3, i4, i5, i6, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2319j;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (h.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            } else {
                i3 = 0;
            }
            if (h.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i3, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f2320k;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (h.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i4 = getPaddingLeft();
            }
            if (h.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i4 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        m(i6, i7, iArr);
    }

    public final boolean f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    public final boolean g(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f2317h;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i3);
        }
        if (findFocus != null && findFocus.isFocused() && !l(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        C0011l lVar = this.f2311C;
        return lVar.f56c | lVar.f55b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2313E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2313E = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2313E;
    }

    public final int h(Rect rect) {
        int i3;
        int i4;
        int i5;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i3 = i6 - verticalFadingEdgeLength;
        } else {
            i3 = i6;
        }
        int i7 = rect.bottom;
        if (i7 > i3 && rect.top > scrollY) {
            if (rect.height() > height) {
                i5 = rect.top - scrollY;
            } else {
                i5 = rect.bottom - i3;
            }
            return Math.min(i5, (childAt.getBottom() + layoutParams.bottomMargin) - i6);
        } else if (rect.top >= scrollY || i7 >= i3) {
            return 0;
        } else {
            if (rect.height() > height) {
                i4 = 0 - (i3 - rect.bottom);
            } else {
                i4 = 0 - (scrollY - rect.top);
            }
            return Math.max(i4, -getScrollY());
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.f2312D.f(0);
    }

    public final void i(int i3) {
        if (getChildCount() > 0) {
            this.f2318i.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f2309A = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f2312D.f52d;
    }

    public final boolean j(int i3) {
        boolean z3;
        int childCount;
        if (i3 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f2317h;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i3, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i3, int i4) {
        Rect rect = this.f2317h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i3 < getScrollY() || rect.top - i3 > getScrollY() + i4) {
            return false;
        }
        return true;
    }

    public final void m(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2312D.d(0, scrollY2, 0, i3 - scrollY2, (int[]) null, i4, iArr);
    }

    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int i3;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2331w) {
            if (actionIndex == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.f2321l = (int) motionEvent.getY(i3);
            this.f2331w = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f2326q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i3, int i4, int i5, int i6) {
        boolean z3;
        boolean z4;
        int overScrollMode = getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i5 + i3;
        if (i4 <= 0 && i4 >= 0) {
            z3 = false;
        } else {
            i4 = 0;
            z3 = true;
        }
        if (i7 <= i6) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z4 = false;
                if (z4 && !this.f2312D.f(1)) {
                    this.f2318i.springBack(i4, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i4, i6);
                if (z3 && !z4) {
                    return false;
                }
            }
        }
        z4 = true;
        this.f2318i.springBack(i4, i6, 0, 0, 0, getScrollRange());
        super.scrollTo(i4, i6);
        return z3 ? true : true;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2323n = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = 1
            int r4 = r27.getAction()
            r5 = 8
            if (r4 != r5) goto L_0x0351
            boolean r4 = r0.f2325p
            if (r4 != 0) goto L_0x0351
            int r4 = r27.getSource()
            r5 = 2
            r4 = r4 & r5
            if (r4 != r5) goto L_0x001b
            r4 = r3
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r7 = 0
            r8 = 4194304(0x400000, float:5.877472E-39)
            r9 = 26
            if (r4 == 0) goto L_0x002f
            r4 = 9
            float r10 = r1.getAxisValue(r4)
            float r11 = r27.getX()
            int r11 = (int) r11
            goto L_0x0045
        L_0x002f:
            int r4 = r27.getSource()
            r4 = r4 & r8
            if (r4 != r8) goto L_0x0042
            float r10 = r1.getAxisValue(r9)
            int r4 = r26.getWidth()
            int r11 = r4 / 2
            r4 = r9
            goto L_0x0045
        L_0x0042:
            r10 = r7
            r4 = 0
            r11 = 0
        L_0x0045:
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0351
            float r12 = r26.getVerticalScrollFactorCompat()
            float r12 = r12 * r10
            int r10 = (int) r12
            int r12 = r27.getSource()
            r13 = 8194(0x2002, float:1.1482E-41)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x005a
            r12 = r3
            goto L_0x005b
        L_0x005a:
            r12 = 0
        L_0x005b:
            int r10 = -r10
            r0.r(r10, r11, r3, r12)
            if (r4 == 0) goto L_0x034f
            A.d r10 = r0.f2314F
            r10.getClass()
            int r11 = r27.getSource()
            int r12 = r27.getDeviceId()
            int r13 = r10.f45f
            int[] r14 = r10.f47h
            r5 = 34
            if (r13 != r11) goto L_0x0083
            int r13 = r10.f46g
            if (r13 != r12) goto L_0x0083
            int r13 = r10.f44e
            if (r13 == r4) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            r2 = 0
            r6 = 0
            goto L_0x013f
        L_0x0083:
            android.content.Context r13 = r10.f40a
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r13)
            int r7 = r27.getDeviceId()
            int r15 = r27.getSource()
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = "android"
            java.lang.String r9 = "dimen"
            r8 = -1
            if (r3 < r5) goto L_0x00a2
            java.lang.reflect.Method r21 = A.E.f2a
            int r7 = A.D.b(r2, r7, r4, r15)
        L_0x00a0:
            r5 = 0
            goto L_0x00e3
        L_0x00a2:
            java.lang.reflect.Method r21 = A.E.f2a
            android.view.InputDevice r7 = android.view.InputDevice.getDevice(r7)
            if (r7 == 0) goto L_0x00df
            android.view.InputDevice$MotionRange r7 = r7.getMotionRange(r4, r15)
            if (r7 == 0) goto L_0x00df
            android.content.res.Resources r7 = r13.getResources()
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r15 != r5) goto L_0x00c3
            r5 = 26
            if (r4 != r5) goto L_0x00c3
            java.lang.String r5 = "config_viewMinRotaryEncoderFlingVelocity"
            int r5 = r7.getIdentifier(r5, r9, r6)
            goto L_0x00c4
        L_0x00c3:
            r5 = r8
        L_0x00c4:
            java.util.Objects.requireNonNull(r2)
            if (r5 == r8) goto L_0x00da
            if (r5 == 0) goto L_0x00d6
            int r5 = r7.getDimensionPixelSize(r5)
            if (r5 >= 0) goto L_0x00d4
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d4:
            r7 = r5
            goto L_0x00a0
        L_0x00d6:
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00a0
        L_0x00da:
            int r5 = r2.getScaledMinimumFlingVelocity()
            goto L_0x00d4
        L_0x00df:
            r5 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x00e3:
            r14[r5] = r7
            int r5 = r27.getDeviceId()
            int r7 = r27.getSource()
            r15 = 34
            if (r3 < r15) goto L_0x00f7
            int r2 = A.D.a(r2, r5, r4, r7)
        L_0x00f5:
            r3 = 1
            goto L_0x0135
        L_0x00f7:
            android.view.InputDevice r3 = android.view.InputDevice.getDevice(r5)
            if (r3 == 0) goto L_0x0105
            android.view.InputDevice$MotionRange r3 = r3.getMotionRange(r4, r7)
            if (r3 == 0) goto L_0x0105
            r3 = 1
            goto L_0x0106
        L_0x0105:
            r3 = 0
        L_0x0106:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L_0x010c
        L_0x010a:
            r2 = r5
            goto L_0x00f5
        L_0x010c:
            android.content.res.Resources r3 = r13.getResources()
            r13 = 4194304(0x400000, float:5.877472E-39)
            if (r7 != r13) goto L_0x011f
            r7 = 26
            if (r4 != r7) goto L_0x011f
            java.lang.String r7 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r6 = r3.getIdentifier(r7, r9, r6)
            goto L_0x0120
        L_0x011f:
            r6 = r8
        L_0x0120:
            java.util.Objects.requireNonNull(r2)
            if (r6 == r8) goto L_0x0130
            if (r6 == 0) goto L_0x010a
            int r2 = r3.getDimensionPixelSize(r6)
            if (r2 >= 0) goto L_0x012e
            goto L_0x010a
        L_0x012e:
            r5 = r2
            goto L_0x010a
        L_0x0130:
            int r2 = r2.getScaledMaximumFlingVelocity()
            goto L_0x00f5
        L_0x0135:
            r14[r3] = r2
            r10.f45f = r11
            r10.f46g = r12
            r10.f44e = r4
            r2 = 0
            r6 = 1
        L_0x013f:
            r3 = r14[r2]
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x0152
            android.view.VelocityTracker r1 = r10.f42c
            if (r1 == 0) goto L_0x034d
            r1.recycle()
            r1 = 0
            r10.f42c = r1
            goto L_0x034d
        L_0x0152:
            android.view.VelocityTracker r2 = r10.f42c
            if (r2 != 0) goto L_0x015c
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r10.f42c = r2
        L_0x015c:
            android.view.VelocityTracker r2 = r10.f42c
            java.util.Map r3 = A.C0014o.f57a
            r2.addMovement(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r3 < r5) goto L_0x016a
            goto L_0x01c5
        L_0x016a:
            int r3 = r27.getSource()
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r5) goto L_0x01c5
            java.util.Map r3 = A.C0014o.f57a
            boolean r5 = r3.containsKey(r2)
            if (r5 != 0) goto L_0x0182
            A.p r5 = new A.p
            r5.<init>()
            r3.put(r2, r5)
        L_0x0182:
            java.lang.Object r3 = r3.get(r2)
            A.p r3 = (A.C0015p) r3
            r3.getClass()
            long r7 = r27.getEventTime()
            int r5 = r3.f61d
            long[] r9 = r3.f59b
            if (r5 == 0) goto L_0x01a7
            int r5 = r3.f62e
            r11 = r9[r5]
            long r11 = r7 - r11
            r22 = 40
            int r5 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r5 <= 0) goto L_0x01a7
            r5 = 0
            r3.f61d = r5
            r5 = 0
            r3.f60c = r5
        L_0x01a7:
            int r5 = r3.f62e
            r11 = 1
            int r5 = r5 + r11
            r12 = 20
            int r5 = r5 % r12
            r3.f62e = r5
            int r13 = r3.f61d
            if (r13 == r12) goto L_0x01b7
            int r13 = r13 + r11
            r3.f61d = r13
        L_0x01b7:
            r11 = 26
            float r1 = r1.getAxisValue(r11)
            float[] r11 = r3.f58a
            r11[r5] = r1
            int r1 = r3.f62e
            r9[r1] = r7
        L_0x01c5:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.computeCurrentVelocity(r1, r3)
            java.util.Map r5 = A.C0014o.f57a
            java.lang.Object r5 = r5.get(r2)
            A.p r5 = (A.C0015p) r5
            if (r5 == 0) goto L_0x02c6
            int r7 = r5.f61d
            r8 = 2
            if (r7 >= r8) goto L_0x01e2
        L_0x01dc:
            r24 = r2
            r2 = r1
            r1 = 0
            goto L_0x029d
        L_0x01e2:
            int r8 = r5.f62e
            r9 = 20
            int r11 = r8 + 20
            r12 = 1
            int r7 = r7 - r12
            int r11 = r11 - r7
            int r11 = r11 % r9
            long[] r7 = r5.f59b
            r8 = r7[r8]
        L_0x01f0:
            r12 = r7[r11]
            long r22 = r8 - r12
            r24 = 100
            int r15 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r15 <= 0) goto L_0x0206
            int r12 = r5.f61d
            r15 = 1
            int r12 = r12 - r15
            r5.f61d = r12
            int r11 = r11 + r15
            r17 = 20
            int r11 = r11 % 20
            goto L_0x01f0
        L_0x0206:
            r15 = 1
            r17 = 20
            int r8 = r5.f61d
            r9 = 2
            if (r8 >= r9) goto L_0x020f
            goto L_0x01dc
        L_0x020f:
            float[] r3 = r5.f58a
            if (r8 != r9) goto L_0x0228
            int r11 = r11 + r15
            int r11 = r11 % 20
            r8 = r7[r11]
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x021d
            goto L_0x01dc
        L_0x021d:
            r3 = r3[r11]
            long r8 = r8 - r12
            float r7 = (float) r8
            float r3 = r3 / r7
            r24 = r2
            r2 = r1
            r1 = r3
            goto L_0x029d
        L_0x0228:
            r8 = 0
            r9 = 0
            r12 = 0
        L_0x022b:
            int r13 = r5.f61d
            r15 = 1
            int r13 = r13 - r15
            r16 = 1073741824(0x40000000, float:2.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 >= r13) goto L_0x0284
            int r13 = r9 + r11
            r17 = 20
            int r19 = r13 % 20
            r22 = r7[r19]
            int r13 = r13 + r15
            int r13 = r13 % 20
            r24 = r7[r13]
            int r19 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r19 != 0) goto L_0x024d
            r24 = r2
            r13 = r3
            r2 = r15
            goto L_0x027d
        L_0x024d:
            int r12 = r12 + r15
            r15 = 0
            int r24 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r24 >= 0) goto L_0x0255
            r18 = r20
        L_0x0255:
            float r15 = java.lang.Math.abs(r8)
            float r15 = r15 * r16
            r24 = r2
            double r1 = (double) r15
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r18 = r18 * r1
            r1 = r3[r13]
            r15 = r7[r13]
            r13 = r3
            long r2 = r15 - r22
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r1 - r18
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 * r2
            float r1 = r1 + r8
            r2 = 1
            if (r12 != r2) goto L_0x027c
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
        L_0x027c:
            r8 = r1
        L_0x027d:
            int r9 = r9 + r2
            r3 = r13
            r2 = r24
            r1 = 1000(0x3e8, float:1.401E-42)
            goto L_0x022b
        L_0x0284:
            r24 = r2
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x028d
            r18 = r20
        L_0x028d:
            float r1 = java.lang.Math.abs(r8)
            float r1 = r1 * r16
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r1 = r1 * r18
            r2 = 1000(0x3e8, float:1.401E-42)
        L_0x029d:
            float r2 = (float) r2
            float r1 = r1 * r2
            r5.f60c = r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r3 = java.lang.Math.abs(r2)
            float r3 = -r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x02b5
            float r1 = java.lang.Math.abs(r2)
            float r1 = -r1
            r5.f60c = r1
            goto L_0x02c8
        L_0x02b5:
            float r1 = r5.f60c
            float r3 = java.lang.Math.abs(r2)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x02c8
            float r1 = java.lang.Math.abs(r2)
            r5.f60c = r1
            goto L_0x02c8
        L_0x02c6:
            r24 = r2
        L_0x02c8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L_0x02d5
            r1 = r24
            float r1 = A.C0013n.a(r1, r4)
            goto L_0x02f9
        L_0x02d5:
            r1 = r24
            if (r4 != 0) goto L_0x02de
            float r1 = r1.getXVelocity()
            goto L_0x02f9
        L_0x02de:
            r2 = 1
            if (r4 != r2) goto L_0x02e6
            float r1 = r1.getYVelocity()
            goto L_0x02f9
        L_0x02e6:
            java.util.Map r2 = A.C0014o.f57a
            java.lang.Object r1 = r2.get(r1)
            A.p r1 = (A.C0015p) r1
            if (r1 == 0) goto L_0x02f8
            r2 = 26
            if (r4 == r2) goto L_0x02f5
            goto L_0x02f8
        L_0x02f5:
            float r1 = r1.f60c
            goto L_0x02f9
        L_0x02f8:
            r1 = 0
        L_0x02f9:
            B.m r2 = r10.f41b
            java.lang.Object r2 = r2.f100g
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            float r3 = r2.getVerticalScrollFactorCompat()
            float r3 = -r3
            float r1 = r1 * r3
            float r3 = java.lang.Math.signum(r1)
            if (r6 != 0) goto L_0x031a
            float r4 = r10.f43d
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x031f
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x031f
        L_0x031a:
            android.widget.OverScroller r3 = r2.f2318i
            r3.abortAnimation()
        L_0x031f:
            float r3 = java.lang.Math.abs(r1)
            r4 = 0
            r4 = r14[r4]
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x032c
            goto L_0x034d
        L_0x032c:
            r3 = 1
            r4 = r14[r3]
            int r3 = -r4
            float r3 = (float) r3
            float r4 = (float) r4
            float r1 = java.lang.Math.min(r1, r4)
            float r1 = java.lang.Math.max(r3, r1)
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0341
            r7 = r3
            goto L_0x034b
        L_0x0341:
            android.widget.OverScroller r3 = r2.f2318i
            r3.abortAnimation()
            int r3 = (int) r1
            r2.i(r3)
            r7 = r1
        L_0x034b:
            r10.f43d = r7
        L_0x034d:
            r1 = 1
            goto L_0x0350
        L_0x034f:
            r1 = r3
        L_0x0350:
            return r1
        L_0x0351:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f2325p) {
            return true;
        }
        int i3 = action & 255;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = this.f2331w;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f2321l) > this.f2329t && (2 & getNestedScrollAxes()) == 0) {
                                this.f2325p = true;
                                this.f2321l = y2;
                                if (this.f2326q == null) {
                                    this.f2326q = VelocityTracker.obtain();
                                }
                                this.f2326q.addMovement(motionEvent);
                                this.f2334z = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i3 != 3) {
                    if (i3 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f2325p = false;
            this.f2331w = -1;
            VelocityTracker velocityTracker = this.f2326q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2326q = null;
            }
            if (this.f2318i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f2321l = y3;
                    this.f2331w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f2326q;
                    if (velocityTracker2 == null) {
                        this.f2326q = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f2326q.addMovement(motionEvent);
                    this.f2318i.computeScrollOffset();
                    if (!v(motionEvent) && this.f2318i.isFinished()) {
                        z3 = false;
                    }
                    this.f2325p = z3;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f2318i.isFinished()) {
                z3 = false;
            }
            this.f2325p = z3;
            VelocityTracker velocityTracker3 = this.f2326q;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f2326q = null;
            }
        }
        return this.f2325p;
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z3, i3, i4, i5, i6);
        int i8 = 0;
        this.f2322m = false;
        View view = this.f2324o;
        if (view != null && k(view, this)) {
            View view2 = this.f2324o;
            Rect rect = this.f2317h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        this.f2324o = null;
        if (!this.f2323n) {
            if (this.f2310B != null) {
                scrollTo(getScrollX(), this.f2310B.f288a);
                this.f2310B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i7 = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i7 && scrollY >= 0) {
                i8 = paddingTop + scrollY > i7 ? i7 - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2323n = true;
    }

    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f2327r && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        i((int) f4);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return this.f2312D.b(f3, f4);
    }

    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.f2312D.c(i3, i4, iArr, (int[]) null, 0);
    }

    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        m(i6, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    public final void onOverScrolled(int i3, int i4, boolean z3, boolean z4) {
        super.scrollTo(i3, i4);
    }

    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        View view;
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i3);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        }
        if (view != null && l(view, 0, getHeight())) {
            return view.requestFocus(i3, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f2310B = jVar;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, F.j, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f288a = getScrollY();
        return baseSavedState;
    }

    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && l(findFocus, 0, i6)) {
            Rect rect = this.f2317h;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h3 = h(rect);
            if (h3 == 0) {
                return;
            }
            if (this.f2328s) {
                t(0, h3, false);
            } else {
                scrollBy(0, h3);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f2326q == null) {
            this.f2326q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2334z = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        obtain.offsetLocation(0.0f, (float) this.f2334z);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f2320k;
            EdgeEffect edgeEffect2 = this.f2319j;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2326q;
                velocityTracker.computeCurrentVelocity(1000, (float) this.v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2331w);
                if (Math.abs(yVelocity) >= this.f2330u) {
                    if (a.r(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (a.r(edgeEffect) != 0.0f) {
                        int i3 = -yVelocity;
                        if (s(edgeEffect, i3)) {
                            edgeEffect.onAbsorb(i3);
                        } else {
                            i(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f4 = (float) i4;
                        if (!this.f2312D.b(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            i(i4);
                        }
                    }
                } else if (this.f2318i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2331w = -1;
                this.f2325p = false;
                VelocityTracker velocityTracker2 = this.f2326q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2326q = null;
                }
                w(0);
                this.f2319j.onRelease();
                this.f2320k.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f2331w);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2331w + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i5 = this.f2321l - y2;
                    float x2 = motionEvent2.getX(findPointerIndex) / ((float) getWidth());
                    float height = ((float) i5) / ((float) getHeight());
                    if (a.r(edgeEffect2) != 0.0f) {
                        float f5 = -a.D(edgeEffect2, -height, x2);
                        if (a.r(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f3 = f5;
                    } else if (a.r(edgeEffect) != 0.0f) {
                        float D3 = a.D(edgeEffect, height, 1.0f - x2);
                        if (a.r(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f3 = D3;
                    }
                    int round = Math.round(f3 * ((float) getHeight()));
                    if (round != 0) {
                        invalidate();
                    }
                    int i6 = i5 - round;
                    if (!this.f2325p && Math.abs(i6) > this.f2329t) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2325p = true;
                        i6 = i6 > 0 ? i6 - this.f2329t : i6 + this.f2329t;
                    }
                    if (this.f2325p) {
                        int r3 = r(i6, (int) motionEvent2.getX(findPointerIndex), 0, false);
                        this.f2321l = y2 - r3;
                        this.f2334z += r3;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2325p && getChildCount() > 0 && this.f2318i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2331w = -1;
                this.f2325p = false;
                VelocityTracker velocityTracker3 = this.f2326q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2326q = null;
                }
                w(0);
                this.f2319j.onRelease();
                this.f2320k.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2321l = (int) motionEvent2.getY(actionIndex);
                this.f2331w = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f2321l = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f2331w));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f2325p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2318i.isFinished()) {
                this.f2318i.abortAnimation();
                w(1);
            }
            int pointerId = motionEvent2.getPointerId(0);
            this.f2321l = (int) motionEvent.getY();
            this.f2331w = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f2326q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i3) {
        boolean z3;
        if (i3 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f2317h;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        q(i3, i4, i5);
    }

    public final boolean q(int i3, int i4, int i5) {
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        boolean z6;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        if (i7 == 33) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = focusables.get(i11);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i8 < bottom && top < i9) {
                if (i8 >= top || bottom >= i9) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (view == null) {
                    view = view2;
                    z7 = z5;
                } else {
                    if ((!z3 || top >= view.getTop()) && (z3 || bottom <= view.getBottom())) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z7) {
                        if (z5) {
                            if (!z6) {
                            }
                        }
                    } else if (z5) {
                        view = view2;
                        z7 = true;
                    } else if (!z6) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i8 < scrollY || i9 > i10) {
            if (z3) {
                i6 = i8 - scrollY;
            } else {
                i6 = i9 - i10;
            }
            r(i6, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i7);
        }
        return z4;
    }

    public final int r(int i3, int i4, int i5, boolean z3) {
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker;
        int i8 = i4;
        int i9 = i5;
        if (i9 == 1) {
            u(2, i9);
        }
        boolean c3 = this.f2312D.c(0, i3, this.f2333y, this.f2332x, i5);
        int[] iArr = this.f2333y;
        int[] iArr2 = this.f2332x;
        if (c3) {
            i7 = i3 - iArr[1];
            i6 = iArr2[1];
        } else {
            i7 = i3;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!o(i7, 0, scrollY, scrollRange) || this.f2312D.f(i9)) {
            z5 = false;
        } else {
            z5 = true;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        int i10 = scrollRange;
        this.f2312D.d(0, scrollY2, 0, i7 - scrollY2, this.f2332x, i5, iArr);
        int i11 = i6 + iArr2[1];
        int i12 = i7 - iArr[1];
        int i13 = scrollY + i12;
        EdgeEffect edgeEffect = this.f2320k;
        EdgeEffect edgeEffect2 = this.f2319j;
        if (i13 < 0) {
            if (z4) {
                a.D(edgeEffect2, ((float) (-i12)) / ((float) getHeight()), ((float) i8) / ((float) getWidth()));
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i13 > i10 && z4) {
            a.D(edgeEffect, ((float) i12) / ((float) getHeight()), 1.0f - (((float) i8) / ((float) getWidth())));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z6 = false;
        } else {
            z6 = z5;
        }
        if (z6 && i9 == 0 && (velocityTracker = this.f2326q) != null) {
            velocityTracker.clear();
        }
        if (i9 == 1) {
            w(i9);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i11;
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f2322m) {
            Rect rect = this.f2317h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        } else {
            this.f2324o = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        boolean z4;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h3 = h(rect);
        if (h3 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (z3) {
                scrollBy(0, h3);
            } else {
                t(0, h3, false);
            }
        }
        return z4;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f2326q) != null) {
            velocityTracker.recycle();
            this.f2326q = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public final void requestLayout() {
        this.f2322m = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float r3 = a.r(edgeEffect) * ((float) getHeight());
        float f3 = this.f2315f * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i3)) * 0.35f) / f3));
        double d3 = (double) f2306G;
        if (((float) (Math.exp((d3 / (d3 - 1.0d)) * log) * ((double) f3))) < r3) {
            return true;
        }
        return false;
    }

    public final void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i3 != getScrollX() || i4 != getScrollY()) {
                super.scrollTo(i3, i4);
            }
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f2327r) {
            this.f2327r = z3;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z3) {
        C0008i iVar = this.f2312D;
        if (iVar.f52d) {
            Field field = A.f0a;
            C0017s.z(iVar.f51c);
        }
        iVar.f52d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f2328s = z3;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i3) {
        return this.f2312D.g(i3, 0);
    }

    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i3, int i4, boolean z3) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2316g > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2318i;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z3) {
                    u(2, 1);
                } else {
                    w(1);
                }
                this.f2309A = getScrollY();
                postInvalidateOnAnimation();
            } else {
                if (!this.f2318i.isFinished()) {
                    this.f2318i.abortAnimation();
                    w(1);
                }
                scrollBy(i3, i4);
            }
            this.f2316g = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void u(int i3, int i4) {
        this.f2312D.g(2, i4);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f2319j;
        if (a.r(edgeEffect) != 0.0f) {
            a.D(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f2320k;
        if (a.r(edgeEffect2) == 0.0f) {
            return z3;
        }
        a.D(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void w(int i3) {
        this.f2312D.h(i3);
    }

    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(i iVar) {
    }
}
