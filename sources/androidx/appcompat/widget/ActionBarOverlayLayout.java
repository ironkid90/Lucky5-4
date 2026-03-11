package androidx.appcompat.widget;

import A.A;
import A.C0009j;
import A.C0010k;
import A.C0011l;
import A.C0016q;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.ai9poker.app.R;
import f.C0159a;
import j.C0237b;
import j.C0238c;
import j.C0239d;
import j.C0240e;
import j.C0257w;
import j.o0;
import j.u0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ActionBarOverlayLayout extends ViewGroup implements C0009j, C0010k {

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f2125D = {R.attr.actionBarSize, 16842841};

    /* renamed from: A  reason: collision with root package name */
    public final C0238c f2126A = new C0238c(this, 0);

    /* renamed from: B  reason: collision with root package name */
    public final C0238c f2127B = new C0238c(this, 1);

    /* renamed from: C  reason: collision with root package name */
    public final C0011l f2128C;

    /* renamed from: f  reason: collision with root package name */
    public int f2129f;

    /* renamed from: g  reason: collision with root package name */
    public ContentFrameLayout f2130g;

    /* renamed from: h  reason: collision with root package name */
    public ActionBarContainer f2131h;

    /* renamed from: i  reason: collision with root package name */
    public C0257w f2132i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f2133j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2134k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2135l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2136m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2137n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2138o;

    /* renamed from: p  reason: collision with root package name */
    public int f2139p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f2140q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public final Rect f2141r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public final Rect f2142s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public final Rect f2143t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final Rect f2144u = new Rect();
    public final Rect v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    public final Rect f2145w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public OverScroller f2146x;

    /* renamed from: y  reason: collision with root package name */
    public ViewPropertyAnimator f2147y;

    /* renamed from: z  reason: collision with root package name */
    public final C0237b f2148z = new C0237b(this);

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i(context);
        this.f2128C = new C0011l(0);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        int i3;
        C0240e eVar = (C0240e) view.getLayoutParams();
        int i4 = eVar.leftMargin;
        int i5 = rect.left;
        if (i4 != i5) {
            eVar.leftMargin = i5;
            z4 = true;
        } else {
            z4 = false;
        }
        int i6 = eVar.topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            eVar.topMargin = i7;
            z4 = true;
        }
        int i8 = eVar.rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            eVar.rightMargin = i9;
            z4 = true;
        }
        if (!z3 || eVar.bottomMargin == (i3 = rect.bottom)) {
            return z4;
        }
        eVar.bottomMargin = i3;
        return true;
    }

    public final void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(viewGroup, i3, i4, i5, i6);
        }
    }

    public final void c(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0240e;
    }

    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f2133j != null && !this.f2134k) {
            if (this.f2131h.getVisibility() == 0) {
                i3 = (int) (this.f2131h.getTranslationY() + ((float) this.f2131h.getBottom()) + 0.5f);
            } else {
                i3 = 0;
            }
            this.f2133j.setBounds(0, i3, getWidth(), this.f2133j.getIntrinsicHeight() + i3);
            this.f2133j.draw(canvas);
        }
    }

    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        b(viewGroup, i3, i4, i5, i6, i7);
    }

    public final boolean f(View view, View view2, int i3, int i4) {
        if (i4 != 0 || !onStartNestedScroll(view, view2, i3)) {
            return false;
        }
        return true;
    }

    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = A.f0a;
        getWindowSystemUiVisibility();
        boolean g2 = g(this.f2131h, rect, false);
        Rect rect2 = this.f2143t;
        rect2.set(rect);
        Method method = u0.f3810a;
        Rect rect3 = this.f2140q;
        if (method != null) {
            try {
                method.invoke(this, new Object[]{rect2, rect3});
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.f2144u;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g2 = true;
        }
        Rect rect5 = this.f2141r;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g2 = true;
        }
        if (g2) {
            requestLayout();
        }
        return true;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2131h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C0011l lVar = this.f2128C;
        return lVar.f56c | lVar.f55b;
    }

    public CharSequence getTitle() {
        j();
        return ((o0) this.f2132i).f3743a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f2126A);
        removeCallbacks(this.f2127B);
        ViewPropertyAnimator viewPropertyAnimator = this.f2147y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        boolean z3;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2125D);
        boolean z4 = false;
        this.f2129f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2133j = drawable;
        if (drawable == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        setWillNotDraw(z3);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z4 = true;
        }
        this.f2134k = z4;
        this.f2146x = new OverScroller(context);
    }

    public final void j() {
        C0257w wVar;
        if (this.f2130g == null) {
            this.f2130g = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2131h = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C0257w) {
                wVar = (C0257w) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wVar = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f2132i = wVar;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = A.f0a;
        C0016q.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0240e eVar = (C0240e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = eVar.leftMargin + paddingLeft;
                int i9 = eVar.topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    public final void onMeasure(int i3, int i4) {
        boolean z3;
        j();
        measureChildWithMargins(this.f2131h, i3, 0, i4, 0);
        C0240e eVar = (C0240e) this.f2131h.getLayoutParams();
        int i5 = 0;
        int max = Math.max(0, this.f2131h.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f2131h.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2131h.getMeasuredState());
        Field field = A.f0a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i5 = this.f2129f;
            if (this.f2136m && this.f2131h.getTabContainer() != null) {
                i5 += this.f2129f;
            }
        } else if (this.f2131h.getVisibility() != 8) {
            i5 = this.f2131h.getMeasuredHeight();
        }
        Rect rect = this.f2140q;
        Rect rect2 = this.f2142s;
        rect2.set(rect);
        Rect rect3 = this.v;
        rect3.set(this.f2143t);
        if (this.f2135l || z3) {
            rect3.top += i5;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i5;
            rect2.bottom = rect2.bottom;
        }
        g(this.f2130g, rect2, true);
        Rect rect4 = this.f2145w;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f2130g.a(rect3);
        }
        measureChildWithMargins(this.f2130g, i3, 0, i4, 0);
        C0240e eVar2 = (C0240e) this.f2130g.getLayoutParams();
        int max3 = Math.max(max, this.f2130g.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f2130g.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2130g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (!this.f2137n || !z3) {
            return false;
        }
        this.f2146x.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2146x.getFinalY() > this.f2131h.getHeight()) {
            h();
            this.f2127B.run();
        } else {
            h();
            this.f2126A.run();
        }
        this.f2138o = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f2139p + i4;
        this.f2139p = i7;
        setActionBarHideOffset(i7);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f2128C.f55b = i3;
        this.f2139p = getActionBarHideOffset();
        h();
    }

    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f2131h.getVisibility() != 0) {
            return false;
        }
        return this.f2137n;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f2137n && !this.f2138o) {
            if (this.f2139p <= this.f2131h.getHeight()) {
                h();
                postDelayed(this.f2126A, 600);
                return;
            }
            h();
            postDelayed(this.f2127B, 600);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        j();
    }

    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f2131h.setTranslationY((float) (-Math.max(0, Math.min(i3, this.f2131h.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0239d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f2136m = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f2137n) {
            this.f2137n = z3;
            if (!z3) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i3) {
        j();
        o0 o0Var = (o0) this.f2132i;
        o0Var.f3746d = i3 != 0 ? C0159a.a(o0Var.f3743a.getContext(), i3) : null;
        o0Var.c();
    }

    public void setLogo(int i3) {
        Drawable drawable;
        j();
        o0 o0Var = (o0) this.f2132i;
        if (i3 != 0) {
            drawable = C0159a.a(o0Var.f3743a.getContext(), i3);
        } else {
            drawable = null;
        }
        o0Var.f3747e = drawable;
        o0Var.c();
    }

    public void setOverlayMode(boolean z3) {
        boolean z4;
        this.f2135l = z3;
        if (!z3 || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f2134k = z4;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i3) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((o0) this.f2132i).f3753k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        o0 o0Var = (o0) this.f2132i;
        if (!o0Var.f3749g) {
            o0Var.f3750h = charSequence;
            if ((o0Var.f3744b & 8) != 0) {
                o0Var.f3743a.setTitle(charSequence);
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        o0 o0Var = (o0) this.f2132i;
        o0Var.f3746d = drawable;
        o0Var.c();
    }

    public final void d(int i3, int i4, int[] iArr, int i5) {
    }
}
