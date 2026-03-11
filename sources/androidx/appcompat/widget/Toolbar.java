package androidx.appcompat.widget;

import A.A;
import C0.e;
import C0.f;
import H.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b2.h;
import com.ai9poker.app.R;
import e.C0153a;
import f.C0159a;
import h.d;
import i.C0207i;
import i.C0208j;
import j.C0241f;
import j.C0244i;
import j.C0251p;
import j.C0252q;
import j.C0254t;
import j.C0257w;
import j.O;
import j.j0;
import j.k0;
import j.l0;
import j.m0;
import j.n0;
import j.o0;
import j.u0;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Toolbar extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public int f2245A;

    /* renamed from: B  reason: collision with root package name */
    public final int f2246B = 8388627;

    /* renamed from: C  reason: collision with root package name */
    public CharSequence f2247C;

    /* renamed from: D  reason: collision with root package name */
    public CharSequence f2248D;

    /* renamed from: E  reason: collision with root package name */
    public ColorStateList f2249E;

    /* renamed from: F  reason: collision with root package name */
    public ColorStateList f2250F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f2251G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f2252H;

    /* renamed from: I  reason: collision with root package name */
    public final ArrayList f2253I = new ArrayList();
    public final ArrayList J = new ArrayList();

    /* renamed from: K  reason: collision with root package name */
    public final int[] f2254K = new int[2];

    /* renamed from: L  reason: collision with root package name */
    public final h f2255L = new h(10, this);

    /* renamed from: M  reason: collision with root package name */
    public o0 f2256M;

    /* renamed from: N  reason: collision with root package name */
    public k0 f2257N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f2258O;

    /* renamed from: P  reason: collision with root package name */
    public final e f2259P = new e(14, (Object) this);

    /* renamed from: f  reason: collision with root package name */
    public ActionMenuView f2260f;

    /* renamed from: g  reason: collision with root package name */
    public C0254t f2261g;

    /* renamed from: h  reason: collision with root package name */
    public C0254t f2262h;

    /* renamed from: i  reason: collision with root package name */
    public C0251p f2263i;

    /* renamed from: j  reason: collision with root package name */
    public C0252q f2264j;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable f2265k;

    /* renamed from: l  reason: collision with root package name */
    public final CharSequence f2266l;

    /* renamed from: m  reason: collision with root package name */
    public C0251p f2267m;

    /* renamed from: n  reason: collision with root package name */
    public View f2268n;

    /* renamed from: o  reason: collision with root package name */
    public Context f2269o;

    /* renamed from: p  reason: collision with root package name */
    public int f2270p;

    /* renamed from: q  reason: collision with root package name */
    public int f2271q;

    /* renamed from: r  reason: collision with root package name */
    public int f2272r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2273s;

    /* renamed from: t  reason: collision with root package name */
    public final int f2274t;

    /* renamed from: u  reason: collision with root package name */
    public int f2275u;
    public int v;

    /* renamed from: w  reason: collision with root package name */
    public int f2276w;

    /* renamed from: x  reason: collision with root package name */
    public int f2277x;

    /* renamed from: y  reason: collision with root package name */
    public O f2278y;

    /* renamed from: z  reason: collision with root package name */
    public int f2279z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        f P3 = f.P(getContext(), attributeSet, C0153a.f2936t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) P3.f127g;
        this.f2271q = typedArray.getResourceId(28, 0);
        this.f2272r = typedArray.getResourceId(19, 0);
        this.f2246B = typedArray.getInteger(0, 8388627);
        this.f2273s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2277x = dimensionPixelOffset;
        this.f2276w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.f2275u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2275u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2276w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2277x = dimensionPixelOffset5;
        }
        this.f2274t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        O o3 = this.f2278y;
        o3.f3640h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            o3.f3637e = dimensionPixelSize;
            o3.f3633a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            o3.f3638f = dimensionPixelSize2;
            o3.f3634b = dimensionPixelSize2;
        }
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            o3.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2279z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f2245A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f2265k = P3.I(4);
        this.f2266l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2269o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable I3 = P3.I(16);
        if (I3 != null) {
            setNavigationIcon(I3);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable I4 = P3.I(11);
        if (I4 != null) {
            setLogo(I4);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(P3.H(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(P3.H(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        P3.T();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, j.l0] */
    public static l0 g() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f3728b = 0;
        marginLayoutParams.f3727a = 8388627;
        return marginLayoutParams;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static l0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof l0;
        if (z3) {
            l0 l0Var = (l0) layoutParams;
            l0 l0Var2 = new l0(l0Var);
            l0Var2.f3728b = 0;
            l0Var2.f3728b = l0Var.f3728b;
            return l0Var2;
        } else if (z3) {
            l0 l0Var3 = new l0((l0) layoutParams);
            l0Var3.f3728b = 0;
            return l0Var3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            l0 l0Var4 = new l0((ViewGroup.LayoutParams) marginLayoutParams);
            l0Var4.f3728b = 0;
            l0Var4.leftMargin = marginLayoutParams.leftMargin;
            l0Var4.topMargin = marginLayoutParams.topMargin;
            l0Var4.rightMargin = marginLayoutParams.rightMargin;
            l0Var4.bottomMargin = marginLayoutParams.bottomMargin;
            return l0Var4;
        } else {
            l0 l0Var5 = new l0(layoutParams);
            l0Var5.f3728b = 0;
            return l0Var5;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i3) {
        boolean z3;
        Field field = A.f0a;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (z3) {
            for (int i4 = childCount - 1; i4 >= 0; i4--) {
                View childAt = getChildAt(i4);
                l0 l0Var = (l0) childAt.getLayoutParams();
                if (l0Var.f3728b == 0 && r(childAt) && i(l0Var.f3727a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            l0 l0Var2 = (l0) childAt2.getLayoutParams();
            if (l0Var2.f3728b == 0 && r(childAt2) && i(l0Var2.f3727a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z3) {
        l0 l0Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            l0Var = g();
        } else if (!checkLayoutParams(layoutParams)) {
            l0Var = h(layoutParams);
        } else {
            l0Var = (l0) layoutParams;
        }
        l0Var.f3728b = 1;
        if (!z3 || this.f2268n == null) {
            addView(view, l0Var);
            return;
        }
        view.setLayoutParams(l0Var);
        this.J.add(view);
    }

    public final void c() {
        if (this.f2267m == null) {
            C0251p pVar = new C0251p(getContext());
            this.f2267m = pVar;
            pVar.setImageDrawable(this.f2265k);
            this.f2267m.setContentDescription(this.f2266l);
            l0 g2 = g();
            g2.f3727a = (this.f2273s & 112) | 8388611;
            g2.f3728b = 2;
            this.f2267m.setLayoutParams(g2);
            this.f2267m.setOnClickListener(new j0(this));
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof l0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, j.O] */
    public final void d() {
        if (this.f2278y == null) {
            ? obj = new Object();
            obj.f3633a = 0;
            obj.f3634b = 0;
            obj.f3635c = Integer.MIN_VALUE;
            obj.f3636d = Integer.MIN_VALUE;
            obj.f3637e = 0;
            obj.f3638f = 0;
            obj.f3639g = false;
            obj.f3640h = false;
            this.f2278y = obj;
        }
    }

    public final void e() {
        if (this.f2260f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f2260f = actionMenuView;
            actionMenuView.setPopupTheme(this.f2270p);
            this.f2260f.setOnMenuItemClickListener(this.f2255L);
            this.f2260f.getClass();
            l0 g2 = g();
            g2.f3727a = (this.f2273s & 112) | 8388613;
            this.f2260f.setLayoutParams(g2);
            b(this.f2260f, false);
        }
        ActionMenuView actionMenuView2 = this.f2260f;
        if (actionMenuView2.f2152u == null) {
            C0207i iVar = (C0207i) actionMenuView2.getMenu();
            if (this.f2257N == null) {
                this.f2257N = new k0(this);
            }
            this.f2260f.setExpandedActionViewsExclusive(true);
            iVar.b(this.f2257N, this.f2269o);
        }
    }

    public final void f() {
        if (this.f2263i == null) {
            this.f2263i = new C0251p(getContext());
            l0 g2 = g();
            g2.f3727a = (this.f2273s & 112) | 8388611;
            this.f2263i.setLayoutParams(g2);
        }
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0251p pVar = this.f2267m;
        if (pVar != null) {
            return pVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0251p pVar = this.f2267m;
        if (pVar != null) {
            return pVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        O o3 = this.f2278y;
        if (o3 == null) {
            return 0;
        }
        if (o3.f3639g) {
            return o3.f3633a;
        }
        return o3.f3634b;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f2245A;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        O o3 = this.f2278y;
        if (o3 != null) {
            return o3.f3633a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        O o3 = this.f2278y;
        if (o3 != null) {
            return o3.f3634b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        O o3 = this.f2278y;
        if (o3 == null) {
            return 0;
        }
        if (o3.f3639g) {
            return o3.f3634b;
        }
        return o3.f3633a;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f2279z;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0207i iVar;
        ActionMenuView actionMenuView = this.f2260f;
        if (actionMenuView == null || (iVar = actionMenuView.f2152u) == null || !iVar.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.f2245A, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = A.f0a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = A.f0a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f2279z, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        C0252q qVar = this.f2264j;
        if (qVar != null) {
            return qVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0252q qVar = this.f2264j;
        if (qVar != null) {
            return qVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f2260f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0251p pVar = this.f2263i;
        if (pVar != null) {
            return pVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0251p pVar = this.f2263i;
        if (pVar != null) {
            return pVar.getDrawable();
        }
        return null;
    }

    public C0244i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f2260f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2269o;
    }

    public int getPopupTheme() {
        return this.f2270p;
    }

    public CharSequence getSubtitle() {
        return this.f2248D;
    }

    public final TextView getSubtitleTextView() {
        return this.f2262h;
    }

    public CharSequence getTitle() {
        return this.f2247C;
    }

    public int getTitleMarginBottom() {
        return this.f2277x;
    }

    public int getTitleMarginEnd() {
        return this.v;
    }

    public int getTitleMarginStart() {
        return this.f2275u;
    }

    public int getTitleMarginTop() {
        return this.f2276w;
    }

    public final TextView getTitleTextView() {
        return this.f2261g;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [j.o0, java.lang.Object] */
    public C0257w getWrapper() {
        boolean z3;
        Drawable drawable;
        if (this.f2256M == null) {
            ? obj = new Object();
            obj.f3754l = 0;
            obj.f3743a = this;
            obj.f3750h = getTitle();
            obj.f3751i = getSubtitle();
            if (obj.f3750h != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            obj.f3749g = z3;
            obj.f3748f = getNavigationIcon();
            String str = null;
            f P3 = f.P(getContext(), (AttributeSet) null, C0153a.f2917a, R.attr.actionBarStyle);
            obj.f3755m = P3.I(15);
            TypedArray typedArray = (TypedArray) P3.f127g;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f3749g = true;
                obj.f3750h = text;
                if ((obj.f3744b & 8) != 0) {
                    obj.f3743a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f3751i = text2;
                if ((obj.f3744b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable I3 = P3.I(20);
            if (I3 != null) {
                obj.f3747e = I3;
                obj.c();
            }
            Drawable I4 = P3.I(17);
            if (I4 != null) {
                obj.f3746d = I4;
                obj.c();
            }
            if (obj.f3748f == null && (drawable = obj.f3755m) != null) {
                obj.f3748f = drawable;
                int i3 = obj.f3744b & 4;
                Toolbar toolbar = obj.f3743a;
                if (i3 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, this, false);
                View view = obj.f3745c;
                if (!(view == null || (obj.f3744b & 16) == 0)) {
                    removeView(view);
                }
                obj.f3745c = inflate;
                if (!(inflate == null || (obj.f3744b & 16) == 0)) {
                    addView(inflate);
                }
                obj.a(obj.f3744b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f2278y.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f2271q = resourceId2;
                C0254t tVar = this.f2261g;
                if (tVar != null) {
                    tVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f2272r = resourceId3;
                C0254t tVar2 = this.f2262h;
                if (tVar2 != null) {
                    tVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            P3.T();
            if (R.string.abc_action_bar_up_description != obj.f3754l) {
                obj.f3754l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = obj.f3754l;
                    if (i4 != 0) {
                        str = getContext().getString(i4);
                    }
                    obj.f3752j = str;
                    obj.b();
                }
            }
            obj.f3752j = getNavigationContentDescription();
            setNavigationOnClickListener(new j0((o0) obj));
            this.f2256M = obj;
        }
        return this.f2256M;
    }

    public final int i(int i3) {
        Field field = A.f0a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        if (layoutDirection == 1) {
            return 5;
        }
        return 3;
    }

    public final int j(View view, int i3) {
        int i4;
        l0 l0Var = (l0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 > 0) {
            i4 = (measuredHeight - i3) / 2;
        } else {
            i4 = 0;
        }
        int i5 = l0Var.f3727a & 112;
        if (!(i5 == 16 || i5 == 48 || i5 == 80)) {
            i5 = this.f2246B & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - l0Var.bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = l0Var.topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = l0Var.bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    public final boolean m(View view) {
        if (view.getParent() == this || this.J.contains(view)) {
            return true;
        }
        return false;
    }

    public final int n(View view, int i3, int i4, int[] iArr) {
        l0 l0Var = (l0) view.getLayoutParams();
        int i5 = l0Var.leftMargin - iArr[0];
        int max = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int j3 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j3, max + measuredWidth, view.getMeasuredHeight() + j3);
        return measuredWidth + l0Var.rightMargin + max;
    }

    public final int o(View view, int i3, int i4, int[] iArr) {
        l0 l0Var = (l0) view.getLayoutParams();
        int i5 = l0Var.rightMargin - iArr[1];
        int max = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int j3 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j3, max, view.getMeasuredHeight() + j3);
        return max - (measuredWidth + l0Var.leftMargin);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2259P);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2252H = false;
        }
        if (!this.f2252H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2252H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2252H = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x029b A[LOOP:0: B:103:0x0299->B:104:0x029b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02b8 A[LOOP:1: B:106:0x02b6->B:107:0x02b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02d6 A[LOOP:2: B:109:0x02d4->B:110:0x02d6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0325 A[LOOP:3: B:117:0x0323->B:118:0x0325, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = 1
            java.lang.reflect.Field r2 = A.A.f0a
            int r2 = r18.getLayoutDirection()
            r3 = 0
            if (r2 != r1) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r3
        L_0x000f:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f2254K
            r11[r1] = r3
            r11[r3] = r3
            int r12 = r18.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            j.p r13 = r0.f2263i
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x0050
            j.p r13 = r0.f2263i
            int r13 = r0.o(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x005a
        L_0x0050:
            j.p r13 = r0.f2263i
            int r13 = r0.n(r13, r6, r12, r11)
        L_0x0056:
            r14 = r10
            goto L_0x005a
        L_0x0058:
            r13 = r6
            goto L_0x0056
        L_0x005a:
            j.p r15 = r0.f2267m
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x0071
            if (r2 == 0) goto L_0x006b
            j.p r15 = r0.f2267m
            int r14 = r0.o(r15, r14, r12, r11)
            goto L_0x0071
        L_0x006b:
            j.p r15 = r0.f2267m
            int r13 = r0.n(r15, r13, r12, r11)
        L_0x0071:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f2260f
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x0088
            if (r2 == 0) goto L_0x0082
            androidx.appcompat.widget.ActionMenuView r15 = r0.f2260f
            int r13 = r0.n(r15, r13, r12, r11)
            goto L_0x0088
        L_0x0082:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f2260f
            int r14 = r0.o(r15, r14, r12, r11)
        L_0x0088:
            int r15 = r18.getCurrentContentInsetLeft()
            int r16 = r18.getCurrentContentInsetRight()
            int r1 = r15 - r13
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            int r1 = r10 - r14
            int r1 = r16 - r1
            int r1 = java.lang.Math.max(r3, r1)
            r17 = 1
            r11[r17] = r1
            int r1 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f2268n
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00c5
            if (r2 == 0) goto L_0x00bf
            android.view.View r13 = r0.f2268n
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00c5
        L_0x00bf:
            android.view.View r13 = r0.f2268n
            int r1 = r0.n(r13, r1, r12, r11)
        L_0x00c5:
            j.q r13 = r0.f2264j
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00dc
            if (r2 == 0) goto L_0x00d6
            j.q r13 = r0.f2264j
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00dc
        L_0x00d6:
            j.q r13 = r0.f2264j
            int r1 = r0.n(r13, r1, r12, r11)
        L_0x00dc:
            j.t r13 = r0.f2261g
            boolean r13 = r0.r(r13)
            j.t r14 = r0.f2262h
            boolean r14 = r0.r(r14)
            if (r13 == 0) goto L_0x0101
            j.t r15 = r0.f2261g
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            j.l0 r15 = (j.l0) r15
            int r3 = r15.topMargin
            r22 = r7
            j.t r7 = r0.f2261g
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r3 = r3 + r7
            goto L_0x0104
        L_0x0101:
            r22 = r7
            r3 = 0
        L_0x0104:
            if (r14 == 0) goto L_0x011e
            j.t r7 = r0.f2262h
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            j.l0 r7 = (j.l0) r7
            int r15 = r7.topMargin
            r16 = r4
            j.t r4 = r0.f2262h
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r7 = r7.bottomMargin
            int r4 = r4 + r7
            int r3 = r3 + r4
            goto L_0x0120
        L_0x011e:
            r16 = r4
        L_0x0120:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            r17 = r6
            r21 = r12
            goto L_0x028d
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            j.t r4 = r0.f2261g
            goto L_0x0132
        L_0x0130:
            j.t r4 = r0.f2262h
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            j.t r7 = r0.f2262h
            goto L_0x0139
        L_0x0137:
            j.t r7 = r0.f2261g
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            j.l0 r4 = (j.l0) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            j.l0 r7 = (j.l0) r7
            if (r13 == 0) goto L_0x014f
            j.t r15 = r0.f2261g
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            j.t r15 = r0.f2262h
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f2246B
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a2
            r12 = 80
            if (r6 == r12) goto L_0x0196
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r1
            int r1 = r0.f2276w
            int r12 = r12 + r1
            if (r6 >= r12) goto L_0x017f
            r6 = r12
            goto L_0x0194
        L_0x017f:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r1 = r4.bottomMargin
            int r3 = r0.f2277x
            int r1 = r1 + r3
            if (r5 >= r1) goto L_0x0194
            int r1 = r7.bottomMargin
            int r1 = r1 + r3
            int r1 = r1 - r5
            int r6 = r6 - r1
            r1 = 0
            int r6 = java.lang.Math.max(r1, r6)
        L_0x0194:
            int r8 = r8 + r6
            goto L_0x01af
        L_0x0196:
            r23 = r1
            int r5 = r5 - r9
            int r1 = r7.bottomMargin
            int r5 = r5 - r1
            int r1 = r0.f2277x
            int r5 = r5 - r1
            int r8 = r5 - r3
            goto L_0x01af
        L_0x01a2:
            r23 = r1
            int r1 = r18.getPaddingTop()
            int r3 = r4.topMargin
            int r1 = r1 + r3
            int r3 = r0.f2276w
            int r8 = r1 + r3
        L_0x01af:
            if (r2 == 0) goto L_0x0222
            if (r15 == 0) goto L_0x01b7
            int r1 = r0.f2275u
        L_0x01b5:
            r2 = 1
            goto L_0x01b9
        L_0x01b7:
            r1 = 0
            goto L_0x01b5
        L_0x01b9:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ef
            j.t r1 = r0.f2261g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            j.l0 r1 = (j.l0) r1
            j.t r2 = r0.f2261g
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            j.t r3 = r0.f2261g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            j.t r4 = r0.f2261g
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.v
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f0
        L_0x01ef:
            r2 = r10
        L_0x01f0:
            if (r14 == 0) goto L_0x0216
            j.t r1 = r0.f2262h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            j.l0 r1 = (j.l0) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            j.t r1 = r0.f2262h
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            j.t r3 = r0.f2262h
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            j.t r4 = r0.f2262h
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.v
            int r1 = r10 - r1
            goto L_0x0217
        L_0x0216:
            r1 = r10
        L_0x0217:
            if (r15 == 0) goto L_0x021e
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x021e:
            r1 = r23
            goto L_0x028d
        L_0x0222:
            if (r15 == 0) goto L_0x0228
            int r1 = r0.f2275u
        L_0x0226:
            r2 = 0
            goto L_0x022a
        L_0x0228:
            r1 = 0
            goto L_0x0226
        L_0x022a:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r23
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x025f
            j.t r1 = r0.f2261g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            j.l0 r1 = (j.l0) r1
            j.t r2 = r0.f2261g
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            j.t r4 = r0.f2261g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            j.t r5 = r0.f2261g
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.v
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0260
        L_0x025f:
            r2 = r3
        L_0x0260:
            if (r14 == 0) goto L_0x0284
            j.t r1 = r0.f2262h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            j.l0 r1 = (j.l0) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            j.t r1 = r0.f2262h
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            j.t r4 = r0.f2262h
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            j.t r5 = r0.f2262h
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.v
            int r1 = r1 + r4
            goto L_0x0285
        L_0x0284:
            r1 = r3
        L_0x0285:
            if (r15 == 0) goto L_0x028c
            int r1 = java.lang.Math.max(r2, r1)
            goto L_0x028d
        L_0x028c:
            r1 = r3
        L_0x028d:
            java.util.ArrayList r2 = r0.f2253I
            r3 = 3
            r0.a(r2, r3)
            int r3 = r2.size()
            r4 = r1
            r1 = 0
        L_0x0299:
            if (r1 >= r3) goto L_0x02aa
            java.lang.Object r5 = r2.get(r1)
            android.view.View r5 = (android.view.View) r5
            r12 = r21
            int r4 = r0.n(r5, r4, r12, r11)
            r5 = 1
            int r1 = r1 + r5
            goto L_0x0299
        L_0x02aa:
            r12 = r21
            r5 = 1
            r1 = 5
            r0.a(r2, r1)
            int r1 = r2.size()
            r3 = 0
        L_0x02b6:
            if (r3 >= r1) goto L_0x02c4
            java.lang.Object r6 = r2.get(r3)
            android.view.View r6 = (android.view.View) r6
            int r10 = r0.o(r6, r10, r12, r11)
            int r3 = r3 + r5
            goto L_0x02b6
        L_0x02c4:
            r0.a(r2, r5)
            r1 = 0
            r3 = r11[r1]
            r1 = r11[r5]
            int r5 = r2.size()
            r6 = r1
            r7 = r3
            r1 = 0
            r3 = 0
        L_0x02d4:
            if (r1 >= r5) goto L_0x0307
            java.lang.Object r8 = r2.get(r1)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            j.l0 r9 = (j.l0) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r6
            r6 = 0
            int r9 = java.lang.Math.max(r6, r13)
            int r14 = java.lang.Math.max(r6, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r6, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r6, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r3 = r3 + r8
            r8 = 1
            int r1 = r1 + r8
            r6 = r7
            r7 = r13
            goto L_0x02d4
        L_0x0307:
            r6 = 0
            int r1 = r16 - r17
            int r1 = r1 - r22
            int r1 = r1 / 2
            int r1 = r1 + r17
            int r5 = r3 / 2
            int r1 = r1 - r5
            int r3 = r3 + r1
            if (r1 >= r4) goto L_0x0317
            goto L_0x031e
        L_0x0317:
            if (r3 <= r10) goto L_0x031d
            int r3 = r3 - r10
            int r4 = r1 - r3
            goto L_0x031e
        L_0x031d:
            r4 = r1
        L_0x031e:
            int r1 = r2.size()
            r3 = r6
        L_0x0323:
            if (r3 >= r1) goto L_0x0332
            java.lang.Object r5 = r2.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r4 = r0.n(r5, r4, r12, r11)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x0323
        L_0x0332:
            r2.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char a2 = u0.a(this);
        char c3 = a2 ^ 1;
        int i12 = 0;
        if (r(this.f2263i)) {
            q(this.f2263i, i3, 0, i4, this.f2274t);
            i7 = k(this.f2263i) + this.f2263i.getMeasuredWidth();
            i6 = Math.max(0, l(this.f2263i) + this.f2263i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.f2263i.getMeasuredState());
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
        }
        if (r(this.f2267m)) {
            q(this.f2267m, i3, 0, i4, this.f2274t);
            i7 = k(this.f2267m) + this.f2267m.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f2267m) + this.f2267m.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f2267m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i7);
        int max2 = Math.max(0, currentContentInsetStart - i7);
        int[] iArr = this.f2254K;
        iArr[a2] = max2;
        if (r(this.f2260f)) {
            q(this.f2260f, i3, max, i4, this.f2274t);
            i8 = k(this.f2260f) + this.f2260f.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f2260f) + this.f2260f.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f2260f.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i8);
        if (r(this.f2268n)) {
            max3 += p(this.f2268n, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f2268n) + this.f2268n.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f2268n.getMeasuredState());
        }
        if (r(this.f2264j)) {
            max3 += p(this.f2264j, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f2264j) + this.f2264j.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f2264j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((l0) childAt.getLayoutParams()).f3728b == 0 && r(childAt)) {
                max3 += p(childAt, i3, max3, i4, 0, iArr);
                i6 = Math.max(i6, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i14 = this.f2276w + this.f2277x;
        int i15 = this.f2275u + this.v;
        if (r(this.f2261g)) {
            p(this.f2261g, i3, max3 + i15, i4, i14, iArr);
            int k3 = k(this.f2261g) + this.f2261g.getMeasuredWidth();
            i9 = l(this.f2261g) + this.f2261g.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i5, this.f2261g.getMeasuredState());
            i10 = k3;
        } else {
            i9 = 0;
            i11 = i5;
            i10 = 0;
        }
        if (r(this.f2262h)) {
            i10 = Math.max(i10, p(this.f2262h, i3, max3 + i15, i4, i9 + i14, iArr));
            i9 += l(this.f2262h) + this.f2262h.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, this.f2262h.getMeasuredState());
        } else {
            int i16 = i11;
        }
        int max4 = Math.max(i6, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i10, getSuggestedMinimumWidth()), i3, -16777216 & i11);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i11 << 16);
        if (this.f2258O) {
            int childCount2 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i17);
                if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i17++;
            }
        }
        i12 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0207i iVar;
        MenuItem findItem;
        if (!(parcelable instanceof n0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n0 n0Var = (n0) parcelable;
        super.onRestoreInstanceState(n0Var.f484a);
        ActionMenuView actionMenuView = this.f2260f;
        if (actionMenuView != null) {
            iVar = actionMenuView.f2152u;
        } else {
            iVar = null;
        }
        int i3 = n0Var.f3738c;
        if (!(i3 == 0 || this.f2257N == null || iVar == null || (findItem = iVar.findItem(i3)) == null)) {
            findItem.expandActionView();
        }
        if (n0Var.f3739d) {
            e eVar = this.f2259P;
            removeCallbacks(eVar);
            post(eVar);
        }
    }

    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        O o3 = this.f2278y;
        boolean z3 = true;
        if (i3 != 1) {
            z3 = false;
        }
        if (z3 != o3.f3639g) {
            o3.f3639g = z3;
            if (!o3.f3640h) {
                o3.f3633a = o3.f3637e;
                o3.f3634b = o3.f3638f;
            } else if (z3) {
                int i4 = o3.f3636d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = o3.f3637e;
                }
                o3.f3633a = i4;
                int i5 = o3.f3635c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = o3.f3638f;
                }
                o3.f3634b = i5;
            } else {
                int i6 = o3.f3635c;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = o3.f3637e;
                }
                o3.f3633a = i6;
                int i7 = o3.f3636d;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = o3.f3638f;
                }
                o3.f3634b = i7;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, j.n0, H.c] */
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        C0244i iVar;
        C0241f fVar;
        C0208j jVar;
        ? cVar = new c(super.onSaveInstanceState());
        k0 k0Var = this.f2257N;
        if (!(k0Var == null || (jVar = k0Var.f3725g) == null)) {
            cVar.f3738c = jVar.f3173a;
        }
        ActionMenuView actionMenuView = this.f2260f;
        if (actionMenuView == null || (iVar = actionMenuView.f2154x) == null || (fVar = iVar.f3712w) == null || !fVar.b()) {
            z3 = false;
        } else {
            z3 = true;
        }
        cVar.f3739d = z3;
        return cVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2251G = false;
        }
        if (!this.f2251G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2251G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2251G = false;
        }
        return true;
    }

    public final int p(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(C0159a.a(getContext(), i3));
    }

    public void setCollapsible(boolean z3) {
        this.f2258O = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f2245A) {
            this.f2245A = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f2279z) {
            this.f2279z = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(C0159a.a(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(C0159a.a(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f2263i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f2260f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f2270p != i3) {
            this.f2270p = i3;
            if (i3 == 0) {
                this.f2269o = getContext();
            } else {
                this.f2269o = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f2277x = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.v = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f2275u = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f2276w = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, j.l0] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f3727a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0153a.f2918b);
        marginLayoutParams.f3727a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f3728b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0251p pVar = this.f2267m;
        if (pVar != null) {
            pVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2267m.setImageDrawable(drawable);
            return;
        }
        C0251p pVar = this.f2267m;
        if (pVar != null) {
            pVar.setImageDrawable(this.f2265k);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2264j == null) {
                this.f2264j = new C0252q(getContext(), 0);
            }
            if (!m(this.f2264j)) {
                b(this.f2264j, true);
            }
        } else {
            C0252q qVar = this.f2264j;
            if (qVar != null && m(qVar)) {
                removeView(this.f2264j);
                this.J.remove(this.f2264j);
            }
        }
        C0252q qVar2 = this.f2264j;
        if (qVar2 != null) {
            qVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2264j == null) {
            this.f2264j = new C0252q(getContext(), 0);
        }
        C0252q qVar = this.f2264j;
        if (qVar != null) {
            qVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0251p pVar = this.f2263i;
        if (pVar != null) {
            pVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f2263i)) {
                b(this.f2263i, true);
            }
        } else {
            C0251p pVar = this.f2263i;
            if (pVar != null && m(pVar)) {
                removeView(this.f2263i);
                this.J.remove(this.f2263i);
            }
        }
        C0251p pVar2 = this.f2263i;
        if (pVar2 != null) {
            pVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2262h == null) {
                Context context = getContext();
                C0254t tVar = new C0254t(context, (AttributeSet) null);
                this.f2262h = tVar;
                tVar.setSingleLine();
                this.f2262h.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f2272r;
                if (i3 != 0) {
                    this.f2262h.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f2250F;
                if (colorStateList != null) {
                    this.f2262h.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2262h)) {
                b(this.f2262h, true);
            }
        } else {
            C0254t tVar2 = this.f2262h;
            if (tVar2 != null && m(tVar2)) {
                removeView(this.f2262h);
                this.J.remove(this.f2262h);
            }
        }
        C0254t tVar3 = this.f2262h;
        if (tVar3 != null) {
            tVar3.setText(charSequence);
        }
        this.f2248D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2250F = colorStateList;
        C0254t tVar = this.f2262h;
        if (tVar != null) {
            tVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2261g == null) {
                Context context = getContext();
                C0254t tVar = new C0254t(context, (AttributeSet) null);
                this.f2261g = tVar;
                tVar.setSingleLine();
                this.f2261g.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f2271q;
                if (i3 != 0) {
                    this.f2261g.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f2249E;
                if (colorStateList != null) {
                    this.f2261g.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2261g)) {
                b(this.f2261g, true);
            }
        } else {
            C0254t tVar2 = this.f2261g;
            if (tVar2 != null && m(tVar2)) {
                removeView(this.f2261g);
                this.J.remove(this.f2261g);
            }
        }
        C0254t tVar3 = this.f2261g;
        if (tVar3 != null) {
            tVar3.setText(charSequence);
        }
        this.f2247C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2249E = colorStateList;
        C0254t tVar = this.f2261g;
        if (tVar != null) {
            tVar.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(m0 m0Var) {
    }
}
