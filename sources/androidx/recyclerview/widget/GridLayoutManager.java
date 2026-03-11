package androidx.recyclerview.widget;

import F0.h;
import T.C;
import T.C0090k;
import T.t;
import T.u;
import T.z;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p  reason: collision with root package name */
    public final int f2574p = -1;

    /* renamed from: q  reason: collision with root package name */
    public final h f2575q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        new SparseIntArray();
        new SparseIntArray();
        h hVar = new h();
        this.f2575q = hVar;
        new Rect();
        int i5 = t.w(context, attributeSet, i3, i4).f1648c;
        if (i5 != this.f2574p) {
            if (i5 >= 1) {
                this.f2574p = i5;
                ((SparseIntArray) hVar.f322g).clear();
                H();
                return;
            }
            throw new IllegalArgumentException(A2.h.e("Span count should be at least 1. Provided ", i5));
        }
    }

    public final void Q(boolean z3) {
        if (!z3) {
            super.Q(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int R(z zVar, C c3, int i3) {
        int i4;
        boolean z3 = c3.f1555c;
        h hVar = this.f2575q;
        if (!z3) {
            int i5 = this.f2574p;
            hVar.getClass();
            return h.w(i3, i5);
        }
        RecyclerView recyclerView = zVar.f1675f;
        if (i3 < 0 || i3 >= recyclerView.c0.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + recyclerView.c0.a() + recyclerView.h());
        }
        if (!recyclerView.c0.f1555c) {
            i4 = i3;
        } else {
            i4 = recyclerView.f2617h.G(i3, 0);
        }
        if (i4 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
            return 0;
        }
        int i6 = this.f2574p;
        hVar.getClass();
        return h.w(i4, i6);
    }

    public final boolean d(u uVar) {
        return uVar instanceof C0090k;
    }

    public final u l() {
        if (this.f2576h == 0) {
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
        if (this.f2576h == 1) {
            return this.f2574p;
        }
        if (c3.a() < 1) {
            return 0;
        }
        return R(zVar, c3, c3.a() - 1) + 1;
    }

    public final int x(z zVar, C c3) {
        if (this.f2576h == 0) {
            return this.f2574p;
        }
        if (c3.a() < 1) {
            return 0;
        }
        return R(zVar, c3, c3.a() - 1) + 1;
    }
}
