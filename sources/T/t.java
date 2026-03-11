package T;

import A.A;
import B.m;
import C0.f;
import C0.r;
import F0.h;
import S.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public f f1659a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f1660b;

    /* renamed from: c  reason: collision with root package name */
    public final r f1661c;

    /* renamed from: d  reason: collision with root package name */
    public final r f1662d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1663e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f1664f;

    /* renamed from: g  reason: collision with root package name */
    public int f1665g;

    public t() {
        h hVar = new h(13, (Object) this);
        m mVar = new m(16, (Object) this);
        this.f1661c = new r((M) hVar);
        this.f1662d = new r((M) mVar);
    }

    public static int e(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i4, i5));
        }
        if (mode != 1073741824) {
            return Math.max(i4, i5);
        }
        return size;
    }

    public static void v(View view) {
        ((u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0091l w(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0091l lVar = new C0091l(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1419a, i3, i4);
        lVar.f1647b = obtainStyledAttributes.getInt(0, 1);
        lVar.f1648c = obtainStyledAttributes.getInt(9, 1);
        lVar.f1649d = obtainStyledAttributes.getBoolean(8, false);
        lVar.f1650e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return lVar;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1660b;
        z zVar = recyclerView.f2613f;
        C c3 = recyclerView.c0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z3 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1660b.canScrollVertically(-1) && !this.f1660b.canScrollHorizontally(-1) && !this.f1660b.canScrollHorizontally(1)) {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            this.f1660b.getClass();
        }
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p3 = p() - 1;
        if (p3 >= 0) {
            RecyclerView.j(o(p3));
            throw null;
        }
    }

    public final void F(z zVar) {
        int size = zVar.f1670a.size();
        int i3 = size - 1;
        ArrayList arrayList = zVar.f1670a;
        if (i3 < 0) {
            arrayList.clear();
            if (size > 0) {
                this.f1660b.invalidate();
                return;
            }
            return;
        }
        A2.h.j(arrayList.get(i3));
        throw null;
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        RecyclerView recyclerView2 = recyclerView;
        Rect rect2 = rect;
        int s3 = s();
        int u3 = u();
        int t3 = this.f1664f - t();
        int r3 = this.f1665g - r();
        int left = (view.getLeft() + rect2.left) - view.getScrollX();
        int top = (view.getTop() + rect2.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i3 = left - s3;
        int min = Math.min(0, i3);
        int i4 = top - u3;
        int min2 = Math.min(0, i4);
        int i5 = width - t3;
        int max = Math.max(0, i5);
        int max2 = Math.max(0, height - r3);
        RecyclerView recyclerView3 = this.f1660b;
        Field field = A.f0a;
        if (recyclerView3.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i3, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i5);
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        int[] iArr = {max, min2};
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s4 = s();
            int u4 = u();
            int t4 = this.f1664f - t();
            int r4 = this.f1665g - r();
            Rect rect3 = this.f1660b.f2623l;
            int[] iArr2 = RecyclerView.m0;
            u uVar = (u) focusedChild.getLayoutParams();
            Rect rect4 = uVar.f1666a;
            rect3.set((focusedChild.getLeft() - rect4.left) - uVar.leftMargin, (focusedChild.getTop() - rect4.top) - uVar.topMargin, focusedChild.getRight() + rect4.right + uVar.rightMargin, focusedChild.getBottom() + rect4.bottom + uVar.bottomMargin);
            if (rect3.left - i6 >= t4 || rect3.right - i6 <= s4 || rect3.top - i7 >= r4 || rect3.bottom - i7 <= u4) {
                return false;
            }
        }
        if (i6 == 0 && i7 == 0) {
            return false;
        }
        if (z3) {
            recyclerView2.scrollBy(i6, i7);
            return true;
        }
        recyclerView2.r(i6, i7);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f1660b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1660b = null;
            this.f1659a = null;
            this.f1664f = 0;
            this.f1665g = 0;
            return;
        }
        this.f1660b = recyclerView;
        this.f1659a = recyclerView.f2619i;
        this.f1664f = recyclerView.getWidth();
        this.f1665g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(u uVar) {
        if (uVar != null) {
            return true;
        }
        return false;
    }

    public abstract int f(C c3);

    public abstract void g(C c3);

    public abstract int h(C c3);

    public abstract int i(C c3);

    public abstract void j(C c3);

    public abstract int k(C c3);

    public abstract u l();

    public u m(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public u n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof u) {
            return new u((u) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new u((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new u(layoutParams);
    }

    public final View o(int i3) {
        f fVar = this.f1659a;
        if (fVar == null) {
            return null;
        }
        int i4 = -1;
        if (i3 >= 0) {
            int childCount = ((RecyclerView) ((m) fVar.f128h).f100g).getChildCount();
            int i5 = i3;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                C0081b bVar = (C0081b) fVar.f127g;
                int a2 = i3 - (i5 - bVar.a(i5));
                if (a2 == 0) {
                    i4 = i5;
                    while (bVar.b(i4)) {
                        i4++;
                    }
                } else {
                    i5 += a2;
                }
            }
        }
        return ((RecyclerView) ((m) fVar.f128h).f100g).getChildAt(i4);
    }

    public final int p() {
        f fVar = this.f1659a;
        if (fVar != null) {
            return ((RecyclerView) ((m) fVar.f128h).f100g).getChildCount() - ((ArrayList) fVar.f129i).size();
        }
        return 0;
    }

    public int q(z zVar, C c3) {
        RecyclerView recyclerView = this.f1660b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f1660b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f1660b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f1660b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f1660b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(z zVar, C c3) {
        RecyclerView recyclerView = this.f1660b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i3) {
    }
}
