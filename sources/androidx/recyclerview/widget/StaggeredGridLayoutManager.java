package androidx.recyclerview.widget;

import A.A;
import A.C0011l;
import C0.e;
import N.h;
import O.b;
import T.C;
import T.C0091l;
import T.H;
import T.J;
import T.K;
import T.t;
import T.u;
import T.z;
import a.C0094a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.BitSet;

public class StaggeredGridLayoutManager extends t {

    /* renamed from: h  reason: collision with root package name */
    public final int f2638h = -1;

    /* renamed from: i  reason: collision with root package name */
    public final K[] f2639i;

    /* renamed from: j  reason: collision with root package name */
    public final b f2640j;

    /* renamed from: k  reason: collision with root package name */
    public final b f2641k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2642l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2643m = false;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2644n = false;

    /* renamed from: o  reason: collision with root package name */
    public final h f2645o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2646p;

    /* renamed from: q  reason: collision with root package name */
    public J f2647q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f2648r;

    /* renamed from: s  reason: collision with root package name */
    public final e f2649s;

    /* JADX WARNING: type inference failed for: r1v0, types: [N.h, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        ? obj = new Object();
        this.f2645o = obj;
        this.f2646p = 2;
        new Rect();
        new j1.e(8, this);
        this.f2648r = true;
        this.f2649s = new e(8, (Object) this);
        C0091l w3 = t.w(context, attributeSet, i3, i4);
        int i5 = w3.f1647b;
        if (i5 == 0 || i5 == 1) {
            a((String) null);
            if (i5 != this.f2642l) {
                this.f2642l = i5;
                b bVar = this.f2640j;
                this.f2640j = this.f2641k;
                this.f2641k = bVar;
                H();
            }
            int i6 = w3.f1648c;
            a((String) null);
            if (i6 != this.f2638h) {
                obj.f1161a = null;
                H();
                this.f2638h = i6;
                new BitSet(this.f2638h);
                this.f2639i = new K[this.f2638h];
                for (int i7 = 0; i7 < this.f2638h; i7++) {
                    this.f2639i[i7] = new K(this, i7);
                }
                H();
            }
            boolean z3 = w3.f1649d;
            a((String) null);
            J j3 = this.f2647q;
            if (!(j3 == null || j3.f1578h == z3)) {
                j3.f1578h = z3;
            }
            this.f2643m = z3;
            H();
            C0011l lVar = new C0011l(1);
            lVar.f55b = 0;
            lVar.f56c = 0;
            this.f2640j = b.a(this, this.f2642l);
            this.f2641k = b.a(this, 1 - this.f2642l);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O2 = O(false);
            View N3 = N(false);
            if (O2 != null && N3 != null) {
                ((u) O2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    public final void B(Parcelable parcelable) {
        if (parcelable instanceof J) {
            this.f2647q = (J) parcelable;
            H();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [T.J, android.os.Parcelable, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [T.J, android.os.Parcelable, java.lang.Object] */
    public final Parcelable C() {
        View view;
        J j3 = this.f2647q;
        if (j3 != null) {
            ? obj = new Object();
            obj.f1573c = j3.f1573c;
            obj.f1571a = j3.f1571a;
            obj.f1572b = j3.f1572b;
            obj.f1574d = j3.f1574d;
            obj.f1575e = j3.f1575e;
            obj.f1576f = j3.f1576f;
            obj.f1578h = j3.f1578h;
            obj.f1579i = j3.f1579i;
            obj.f1580j = j3.f1580j;
            obj.f1577g = j3.f1577g;
            return obj;
        }
        ? obj2 = new Object();
        obj2.f1578h = this.f2643m;
        obj2.f1579i = false;
        obj2.f1580j = false;
        obj2.f1575e = 0;
        if (p() > 0) {
            P();
            obj2.f1571a = 0;
            if (this.f2644n) {
                view = N(true);
            } else {
                view = O(true);
            }
            if (view == null) {
                obj2.f1572b = -1;
                int i3 = this.f2638h;
                obj2.f1573c = i3;
                obj2.f1574d = new int[i3];
                for (int i4 = 0; i4 < this.f2638h; i4++) {
                    K k3 = this.f2639i[i4];
                    int i5 = k3.f1582b;
                    if (i5 == Integer.MIN_VALUE) {
                        if (k3.f1581a.size() == 0) {
                            i5 = Integer.MIN_VALUE;
                        } else {
                            View view2 = (View) k3.f1581a.get(0);
                            k3.f1582b = k3.f1585e.f2640j.c(view2);
                            ((H) view2.getLayoutParams()).getClass();
                            i5 = k3.f1582b;
                        }
                    }
                    if (i5 != Integer.MIN_VALUE) {
                        i5 -= this.f2640j.e();
                    }
                    obj2.f1574d[i4] = i5;
                }
            } else {
                ((u) view.getLayoutParams()).getClass();
                throw null;
            }
        } else {
            obj2.f1571a = -1;
            obj2.f1572b = -1;
            obj2.f1573c = 0;
        }
        return obj2;
    }

    public final void D(int i3) {
        if (i3 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i3 = this.f2638h;
        boolean z3 = this.f2644n;
        if (p() == 0 || this.f2646p == 0 || !this.f1663e) {
            return false;
        }
        if (z3) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p3 = p();
        int i4 = p3 - 1;
        new BitSet(i3).set(0, i3, true);
        if (this.f2642l == 1) {
            RecyclerView recyclerView = this.f1660b;
            Field field = A.f0a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z3) {
            p3 = -1;
        } else {
            i4 = 0;
        }
        if (i4 == p3) {
            return false;
        }
        ((H) o(i4).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(C c3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2640j;
        boolean z3 = !this.f2648r;
        return C0094a.f(c3, bVar, O(z3), N(z3), this, this.f2648r);
    }

    public final void L(C c3) {
        if (p() != 0) {
            boolean z3 = !this.f2648r;
            View O2 = O(z3);
            View N3 = N(z3);
            if (p() != 0 && c3.a() != 0 && O2 != null && N3 != null) {
                ((u) O2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    public final int M(C c3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2640j;
        boolean z3 = !this.f2648r;
        return C0094a.g(c3, bVar, O(z3), N(z3), this, this.f2648r);
    }

    public final View N(boolean z3) {
        int e2 = this.f2640j.e();
        int d3 = this.f2640j.d();
        View view = null;
        for (int p3 = p() - 1; p3 >= 0; p3--) {
            View o3 = o(p3);
            int c3 = this.f2640j.c(o3);
            int b3 = this.f2640j.b(o3);
            if (b3 > e2 && c3 < d3) {
                if (b3 <= d3 || !z3) {
                    return o3;
                }
                if (view == null) {
                    view = o3;
                }
            }
        }
        return view;
    }

    public final View O(boolean z3) {
        int e2 = this.f2640j.e();
        int d3 = this.f2640j.d();
        int p3 = p();
        View view = null;
        for (int i3 = 0; i3 < p3; i3++) {
            View o3 = o(i3);
            int c3 = this.f2640j.c(o3);
            if (this.f2640j.b(o3) > e2 && c3 < d3) {
                if (c3 >= e2 || !z3) {
                    return o3;
                }
                if (view == null) {
                    view = o3;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() != 0) {
            t.v(o(0));
            throw null;
        }
    }

    public final void Q() {
        int p3 = p();
        if (p3 != 0) {
            t.v(o(p3 - 1));
            throw null;
        }
    }

    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2647q == null && (recyclerView = this.f1660b) != null) {
            recyclerView.b(str);
        }
    }

    public final boolean b() {
        if (this.f2642l == 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f2642l == 1) {
            return true;
        }
        return false;
    }

    public final boolean d(u uVar) {
        return uVar instanceof H;
    }

    public final int f(C c3) {
        return K(c3);
    }

    public final void g(C c3) {
        L(c3);
    }

    public final int h(C c3) {
        return M(c3);
    }

    public final int i(C c3) {
        return K(c3);
    }

    public final void j(C c3) {
        L(c3);
    }

    public final int k(C c3) {
        return M(c3);
    }

    public final u l() {
        if (this.f2642l == 0) {
            return new u(-2, -1);
        }
        return new u(-1, -2);
    }

    public final u m(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public final u n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new u((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new u(layoutParams);
    }

    public final int q(z zVar, C c3) {
        if (this.f2642l == 1) {
            return this.f2638h;
        }
        super.q(zVar, c3);
        return 1;
    }

    public final int x(z zVar, C c3) {
        if (this.f2642l == 0) {
            return this.f2638h;
        }
        super.x(zVar, c3);
        return 1;
    }

    public final boolean y() {
        if (this.f2646p != 0) {
            return true;
        }
        return false;
    }

    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1660b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2649s);
        }
        for (int i3 = 0; i3 < this.f2638h; i3++) {
            K k3 = this.f2639i[i3];
            k3.f1581a.clear();
            k3.f1582b = Integer.MIN_VALUE;
            k3.f1583c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
