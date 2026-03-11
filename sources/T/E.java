package T;

import A.A;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

public final class E implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public int f1558f;

    /* renamed from: g  reason: collision with root package name */
    public int f1559g;

    /* renamed from: h  reason: collision with root package name */
    public OverScroller f1560h;

    /* renamed from: i  reason: collision with root package name */
    public Interpolator f1561i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1562j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1563k = false;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1564l;

    public E(RecyclerView recyclerView) {
        this.f1564l = recyclerView;
        o oVar = RecyclerView.f2586p0;
        this.f1561i = oVar;
        this.f1560h = new OverScroller(recyclerView.getContext(), oVar);
    }

    public final void a() {
        if (this.f1562j) {
            this.f1563k = true;
            return;
        }
        RecyclerView recyclerView = this.f1564l;
        recyclerView.removeCallbacks(this);
        Field field = A.f0a;
        recyclerView.postOnAnimation(this);
    }

    public final void run() {
        boolean z3;
        boolean z4;
        boolean z5;
        RecyclerView recyclerView = this.f1564l;
        if (recyclerView.f2626n == null) {
            recyclerView.removeCallbacks(this);
            this.f1560h.abortAnimation();
            return;
        }
        this.f1563k = false;
        this.f1562j = true;
        recyclerView.d();
        OverScroller overScroller = this.f1560h;
        recyclerView.f2626n.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.f1558f;
            int i4 = currY - this.f1559g;
            this.f1558f = currX;
            this.f1559g = currY;
            RecyclerView recyclerView2 = this.f1564l;
            int[] iArr = recyclerView.i0;
            if (recyclerView2.f(i3, i4, iArr, (int[]) null, 1)) {
                i3 -= iArr[0];
                i4 -= iArr[1];
            }
            if (!recyclerView.f2627o.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i3, i4);
            }
            recyclerView.g((int[]) null, 1);
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            if (i4 == 0 || !recyclerView.f2626n.c() || i4 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i3 == 0 || !recyclerView.f2626n.b() || i3 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!(i3 == 0 && i4 == 0) && !z4 && !z3) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (overScroller.isFinished() || (!z5 && !recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0087h hVar = recyclerView.f2610b0;
                hVar.getClass();
                hVar.f1634c = 0;
                recyclerView.s(1);
            } else {
                a();
                C0089j jVar = recyclerView.f2609a0;
                if (jVar != null) {
                    jVar.a(recyclerView, i3, i4);
                }
            }
        }
        this.f1562j = false;
        if (this.f1563k) {
            a();
        }
    }
}
