package androidx.appcompat.widget;

import D0.g;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import d2.C0152a;
import i.C0206h;
import i.C0207i;
import i.C0208j;
import i.C0209k;
import j.C;
import j.C0241f;
import j.C0243h;
import j.C0244i;
import j.C0245j;
import j.C0246k;
import j.C0247l;
import j.D;
import j.u0;

public class ActionMenuView extends D implements C0206h {

    /* renamed from: A  reason: collision with root package name */
    public final int f2149A;

    /* renamed from: B  reason: collision with root package name */
    public final int f2150B;

    /* renamed from: C  reason: collision with root package name */
    public C0247l f2151C;

    /* renamed from: u  reason: collision with root package name */
    public C0207i f2152u;
    public Context v;

    /* renamed from: w  reason: collision with root package name */
    public int f2153w = 0;

    /* renamed from: x  reason: collision with root package name */
    public C0244i f2154x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2155y;

    /* renamed from: z  reason: collision with root package name */
    public int f2156z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f2149A = (int) (56.0f * f3);
        this.f2150B = (int) (f3 * 4.0f);
        this.v = context;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [j.k, j.C] */
    public static C0246k h() {
        ? c3 = new C(-2);
        c3.f3718c = false;
        c3.f3575b = 16;
        return c3;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [j.C] */
    /* JADX WARNING: type inference failed for: r0v3, types: [j.k, j.C] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j.C0246k i(android.view.ViewGroup.LayoutParams r1) {
        /*
            if (r1 == 0) goto L_0x0020
            boolean r0 = r1 instanceof j.C0246k
            if (r0 == 0) goto L_0x0012
            j.k r0 = new j.k
            j.k r1 = (j.C0246k) r1
            r0.<init>((android.view.ViewGroup.LayoutParams) r1)
            boolean r1 = r1.f3718c
            r0.f3718c = r1
            goto L_0x0017
        L_0x0012:
            j.k r0 = new j.k
            r0.<init>((android.view.ViewGroup.LayoutParams) r1)
        L_0x0017:
            int r1 = r0.f3575b
            if (r1 > 0) goto L_0x001f
            r1 = 16
            r0.f3575b = r1
        L_0x001f:
            return r0
        L_0x0020:
            j.k r1 = h()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.i(android.view.ViewGroup$LayoutParams):j.k");
    }

    public final boolean a(C0208j jVar) {
        return this.f2152u.p(jVar, (C0209k) null, 0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0246k;
    }

    public final /* bridge */ /* synthetic */ C d() {
        return h();
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final C e(AttributeSet attributeSet) {
        return new C(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ C f(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f2152u == null) {
            Context context = getContext();
            C0207i iVar = new C0207i(context);
            this.f2152u = iVar;
            iVar.f3155e = new C0152a(7, this);
            C0244i iVar2 = new C0244i(context);
            this.f2154x = iVar2;
            iVar2.f3706p = true;
            iVar2.f3707q = true;
            iVar2.f3700j = new g(12, false);
            this.f2152u.b(iVar2, this.v);
            C0244i iVar3 = this.f2154x;
            iVar3.f3702l = this;
            this.f2152u = iVar3.f3698h;
        }
        return this.f2152u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0244i iVar = this.f2154x;
        C0243h hVar = iVar.f3703m;
        if (hVar != null) {
            return hVar.getDrawable();
        }
        if (iVar.f3705o) {
            return iVar.f3704n;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2153w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i3) {
        boolean z3 = false;
        if (i3 == 0) {
            return false;
        }
        View childAt = getChildAt(i3 - 1);
        View childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof C0245j)) {
            z3 = ((C0245j) childAt).a();
        }
        if (i3 <= 0 || !(childAt2 instanceof C0245j)) {
            return z3;
        }
        return z3 | ((C0245j) childAt2).b();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0244i iVar = this.f2154x;
        if (iVar != null) {
            iVar.h();
            C0241f fVar = this.f2154x.f3712w;
            if (fVar != null && fVar.b()) {
                this.f2154x.i();
                this.f2154x.j();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0244i iVar = this.f2154x;
        if (iVar != null) {
            iVar.i();
            C0241f fVar = iVar.f3713x;
            if (fVar != null && fVar.b()) {
                fVar.f3208i.dismiss();
            }
        }
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        if (!this.f2155y) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i5 - i3;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = u0.a(this);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0246k kVar = (C0246k) childAt.getLayoutParams();
                if (kVar.f3718c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i8 = getPaddingLeft() + kVar.leftMargin;
                        i9 = i8 + measuredWidth;
                    } else {
                        i9 = (getWidth() - getPaddingRight()) - kVar.rightMargin;
                        i8 = i9 - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(i8, i15, i9, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + kVar.leftMargin) + kVar.rightMargin;
                    j(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i7 = paddingRight / i18;
        } else {
            i7 = 0;
        }
        int max = Math.max(0, i7);
        if (a2) {
            int width = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                C0246k kVar2 = (C0246k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !kVar2.f3718c) {
                    int i20 = width - kVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width = i20 - ((measuredWidth3 + kVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            C0246k kVar3 = (C0246k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !kVar3.f3718c) {
                int i23 = paddingLeft + kVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft = measuredWidth4 + kVar3.rightMargin + max + i23;
            }
        }
    }

    public final void onMeasure(int i3, int i4) {
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z8;
        int i11;
        int i12;
        boolean z9;
        int i13;
        ActionMenuItemView actionMenuItemView;
        boolean z10;
        int i14;
        boolean z11;
        C0207i iVar;
        boolean z12 = this.f2155y;
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f2155y = z3;
        if (z12 != z3) {
            this.f2156z = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (!(!this.f2155y || (iVar = this.f2152u) == null || size == this.f2156z)) {
            this.f2156z = size;
            iVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f2155y || childCount <= 0) {
            int i15 = i4;
            for (int i16 = 0; i16 < childCount; i16++) {
                C0246k kVar = (C0246k) getChildAt(i16).getLayoutParams();
                kVar.rightMargin = 0;
                kVar.leftMargin = 0;
            }
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f2149A;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z13 = false;
        int i26 = 0;
        long j3 = 0;
        while (true) {
            i5 = this.f2150B;
            if (i25 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i25);
            int i27 = size3;
            int i28 = i17;
            if (childAt.getVisibility() == 8) {
                i11 = mode;
                i12 = paddingBottom;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i29 = i23 + 1;
                if (z14) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C0246k kVar2 = (C0246k) childAt.getLayoutParams();
                kVar2.f3723h = false;
                kVar2.f3720e = 0;
                kVar2.f3719d = 0;
                kVar2.f3721f = false;
                kVar2.leftMargin = 0;
                kVar2.rightMargin = 0;
                if (!z14 || TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                kVar2.f3722g = z9;
                if (kVar2.f3718c) {
                    i13 = 1;
                } else {
                    i13 = i19;
                }
                int i30 = i29;
                C0246k kVar3 = (C0246k) childAt.getLayoutParams();
                i11 = mode;
                i12 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                if (z14) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i13 <= 0 || (z10 && i13 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i21, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i21;
                    if (measuredWidth % i21 != 0) {
                        i14++;
                    }
                    if (z10 && i14 < 2) {
                        i14 = 2;
                    }
                }
                if (kVar3.f3718c || !z10) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                kVar3.f3721f = z11;
                kVar3.f3719d = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i21, 1073741824), makeMeasureSpec);
                i24 = Math.max(i24, i14);
                if (kVar2.f3721f) {
                    i26++;
                }
                if (kVar2.f3718c) {
                    z13 = true;
                }
                i19 -= i14;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j3 |= (long) (1 << i25);
                }
                i23 = i30;
            }
            i25++;
            size3 = i27;
            i17 = i28;
            paddingBottom = i12;
            mode = i11;
        }
        int i31 = mode;
        int i32 = i17;
        int i33 = size3;
        if (!z13 || i23 != 2) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z15 = false;
        while (true) {
            if (i26 <= 0 || i19 <= 0) {
                z5 = z15;
            } else {
                int i34 = Integer.MAX_VALUE;
                int i35 = 0;
                int i36 = 0;
                long j4 = 0;
                while (i36 < childCount2) {
                    C0246k kVar4 = (C0246k) getChildAt(i36).getLayoutParams();
                    boolean z16 = z15;
                    if (kVar4.f3721f) {
                        int i37 = kVar4.f3719d;
                        if (i37 < i34) {
                            j4 = 1 << i36;
                            i34 = i37;
                            i35 = 1;
                        } else if (i37 == i34) {
                            j4 |= 1 << i36;
                            i35++;
                        }
                    }
                    i36++;
                    z15 = z16;
                }
                z5 = z15;
                j3 |= j4;
                if (i35 > i19) {
                    break;
                }
                int i38 = i34 + 1;
                int i39 = 0;
                while (i39 < childCount2) {
                    View childAt2 = getChildAt(i39);
                    C0246k kVar5 = (C0246k) childAt2.getLayoutParams();
                    int i40 = i22;
                    int i41 = childMeasureSpec;
                    int i42 = childCount2;
                    long j5 = (long) (1 << i39);
                    if ((j4 & j5) != 0) {
                        if (!z4 || !kVar5.f3722g) {
                            z8 = true;
                        } else {
                            z8 = true;
                            if (i19 == 1) {
                                childAt2.setPadding(i5 + i21, 0, i5, 0);
                            }
                        }
                        kVar5.f3719d += z8 ? 1 : 0;
                        kVar5.f3723h = z8;
                        i19--;
                    } else if (kVar5.f3719d == i38) {
                        j3 |= j5;
                    }
                    i39++;
                    childMeasureSpec = i41;
                    i22 = i40;
                    childCount2 = i42;
                }
                z15 = true;
            }
        }
        z5 = z15;
        int i43 = i22;
        int i44 = childMeasureSpec;
        int i45 = childCount2;
        if (z13 || i23 != 1) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (i19 <= 0 || j3 == 0 || (i19 >= i23 - 1 && !z6 && i24 <= 1)) {
            i6 = i45;
            z7 = z5;
        } else {
            float bitCount = (float) Long.bitCount(j3);
            if (!z6) {
                if ((j3 & 1) != 0 && !((C0246k) getChildAt(0).getLayoutParams()).f3722g) {
                    bitCount -= 0.5f;
                }
                int i46 = i45 - 1;
                if ((j3 & ((long) (1 << i46))) != 0 && !((C0246k) getChildAt(i46).getLayoutParams()).f3722g) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i10 = (int) (((float) (i19 * i21)) / bitCount);
            } else {
                i10 = 0;
            }
            boolean z17 = z5;
            i6 = i45;
            for (int i47 = 0; i47 < i6; i47++) {
                if ((j3 & ((long) (1 << i47))) != 0) {
                    View childAt3 = getChildAt(i47);
                    C0246k kVar6 = (C0246k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        kVar6.f3720e = i10;
                        kVar6.f3723h = true;
                        if (i47 == 0 && !kVar6.f3722g) {
                            kVar6.leftMargin = (-i10) / 2;
                        }
                        z17 = true;
                    } else {
                        if (kVar6.f3718c) {
                            kVar6.f3720e = i10;
                            kVar6.f3723h = true;
                            kVar6.rightMargin = (-i10) / 2;
                            z17 = true;
                        } else {
                            if (i47 != 0) {
                                kVar6.leftMargin = i10 / 2;
                            }
                            if (i47 != i6 - 1) {
                                kVar6.rightMargin = i10 / 2;
                            }
                        }
                    }
                }
            }
            z7 = z17;
        }
        if (z7) {
            int i48 = 0;
            while (i48 < i6) {
                View childAt4 = getChildAt(i48);
                C0246k kVar7 = (C0246k) childAt4.getLayoutParams();
                if (!kVar7.f3723h) {
                    i9 = i44;
                } else {
                    i9 = i44;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((kVar7.f3719d * i21) + kVar7.f3720e, 1073741824), i9);
                }
                i48++;
                i44 = i9;
            }
        }
        if (i31 != 1073741824) {
            i8 = i32;
            i7 = i43;
        } else {
            i7 = i33;
            i8 = i32;
        }
        setMeasuredDimension(i8, i7);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f2154x.f3711u = z3;
    }

    public void setOnMenuItemClickListener(C0247l lVar) {
        this.f2151C = lVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0244i iVar = this.f2154x;
        C0243h hVar = iVar.f3703m;
        if (hVar != null) {
            hVar.setImageDrawable(drawable);
            return;
        }
        iVar.f3705o = true;
        iVar.f3704n = drawable;
    }

    public void setOverflowReserved(boolean z3) {
    }

    public void setPopupTheme(int i3) {
        if (this.f2153w != i3) {
            this.f2153w = i3;
            if (i3 == 0) {
                this.v = getContext();
            } else {
                this.v = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C0244i iVar) {
        this.f2154x = iVar;
        iVar.f3702l = this;
        this.f2152u = iVar.f3698h;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C(getContext(), attributeSet);
    }
}
