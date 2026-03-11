package androidx.recyclerview.widget;

import A2.h;
import G0.f;
import O.b;
import T.C;
import T.C0091l;
import T.C0092m;
import T.t;
import T.u;
import a.C0094a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class LinearLayoutManager extends t {

    /* renamed from: h  reason: collision with root package name */
    public final int f2576h = 1;

    /* renamed from: i  reason: collision with root package name */
    public f f2577i;

    /* renamed from: j  reason: collision with root package name */
    public final b f2578j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2579k = false;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2580l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2581m = false;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2582n = true;

    /* renamed from: o  reason: collision with root package name */
    public C0092m f2583o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0091l lVar = new C0091l(0);
        lVar.f1647b = -1;
        lVar.f1648c = Integer.MIN_VALUE;
        lVar.f1649d = false;
        lVar.f1650e = false;
        C0091l w3 = t.w(context, attributeSet, i3, i4);
        int i5 = w3.f1647b;
        if (i5 == 0 || i5 == 1) {
            a((String) null);
            if (i5 != this.f2576h || this.f2578j == null) {
                this.f2578j = b.a(this, i5);
                this.f2576h = i5;
                H();
            }
            boolean z3 = w3.f1649d;
            a((String) null);
            if (z3 != this.f2579k) {
                this.f2579k = z3;
                H();
            }
            Q(w3.f1650e);
            return;
        }
        throw new IllegalArgumentException(h.e("invalid orientation:", i5));
    }

    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P3 = P(0, p(), false);
            if (P3 == null) {
                accessibilityEvent.setFromIndex(-1);
                View P4 = P(p() - 1, -1, false);
                if (P4 == null) {
                    accessibilityEvent.setToIndex(-1);
                } else {
                    ((u) P4.getLayoutParams()).getClass();
                    throw null;
                }
            } else {
                ((u) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0092m) {
            this.f2583o = (C0092m) parcelable;
            H();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [T.m, android.os.Parcelable, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [T.m, android.os.Parcelable, java.lang.Object] */
    public final Parcelable C() {
        C0092m mVar = this.f2583o;
        if (mVar != null) {
            ? obj = new Object();
            obj.f1651a = mVar.f1651a;
            obj.f1652b = mVar.f1652b;
            obj.f1653c = mVar.f1653c;
            return obj;
        }
        ? obj2 = new Object();
        if (p() > 0) {
            M();
            boolean z3 = this.f2580l;
            obj2.f1653c = z3;
            int i3 = 0;
            if (z3) {
                if (!z3) {
                    i3 = p() - 1;
                }
                View o3 = o(i3);
                obj2.f1652b = this.f2578j.d() - this.f2578j.b(o3);
                t.v(o3);
                throw null;
            }
            if (z3) {
                i3 = p() - 1;
            }
            t.v(o(i3));
            throw null;
        }
        obj2.f1651a = -1;
        return obj2;
    }

    public final int J(C c3) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.f2578j;
        boolean z3 = !this.f2582n;
        return C0094a.f(c3, bVar, O(z3), N(z3), this, this.f2582n);
    }

    public final void K(C c3) {
        if (p() != 0) {
            M();
            boolean z3 = !this.f2582n;
            View O2 = O(z3);
            View N3 = N(z3);
            if (p() != 0 && c3.a() != 0 && O2 != null && N3 != null) {
                ((u) O2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    public final int L(C c3) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.f2578j;
        boolean z3 = !this.f2582n;
        return C0094a.g(c3, bVar, O(z3), N(z3), this, this.f2582n);
    }

    public final void M() {
        if (this.f2577i == null) {
            this.f2577i = new f(7);
        }
    }

    public final View N(boolean z3) {
        if (this.f2580l) {
            return P(0, p(), z3);
        }
        return P(p() - 1, -1, z3);
    }

    public final View O(boolean z3) {
        if (this.f2580l) {
            return P(p() - 1, -1, z3);
        }
        return P(0, p(), z3);
    }

    public final View P(int i3, int i4, boolean z3) {
        int i5;
        M();
        if (z3) {
            i5 = 24579;
        } else {
            i5 = 320;
        }
        if (this.f2576h == 0) {
            return this.f1661c.G(i3, i4, i5, 320);
        }
        return this.f1662d.G(i3, i4, i5, 320);
    }

    public void Q(boolean z3) {
        a((String) null);
        if (this.f2581m != z3) {
            this.f2581m = z3;
            H();
        }
    }

    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2583o == null && (recyclerView = this.f1660b) != null) {
            recyclerView.b(str);
        }
    }

    public final boolean b() {
        if (this.f2576h == 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f2576h == 1) {
            return true;
        }
        return false;
    }

    public final int f(C c3) {
        return J(c3);
    }

    public final void g(C c3) {
        K(c3);
    }

    public final int h(C c3) {
        return L(c3);
    }

    public final int i(C c3) {
        return J(c3);
    }

    public final void j(C c3) {
        K(c3);
    }

    public final int k(C c3) {
        return L(c3);
    }

    public u l() {
        return new u(-2, -2);
    }

    public final boolean y() {
        return true;
    }

    public final void z(RecyclerView recyclerView) {
    }
}
