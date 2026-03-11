package T;

import A.C0001b;
import B.l;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

public final class G extends C0001b {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f1566d;

    public G(RecyclerView recyclerView) {
        this.f1566d = recyclerView;
        new F(this);
    }

    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.f1566d.l()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().A(accessibilityEvent);
            }
        }
    }

    public final void b(View view, l lVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f37a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f98a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f1566d;
        if (!recyclerView.l() && recyclerView.getLayoutManager() != null) {
            t layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f1660b;
            z zVar = recyclerView2.f2613f;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f1660b.canScrollHorizontally(-1)) {
                accessibilityNodeInfo.addAction(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.f1660b.canScrollVertically(1) || layoutManager.f1660b.canScrollHorizontally(1)) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            C c3 = recyclerView2.c0;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(zVar, c3), layoutManager.q(zVar, c3), false, 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.c(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0008
            return r6
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f1566d
            boolean r0 = r4.l()
            r1 = 0
            if (r0 != 0) goto L_0x008d
            T.t r0 = r4.getLayoutManager()
            if (r0 == 0) goto L_0x008d
            T.t r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1660b
            T.z r2 = r0.f2613f
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L_0x0058
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L_0x002a
            r5 = r1
            r0 = r5
            goto L_0x0081
        L_0x002a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L_0x003f
            int r0 = r4.f1665g
            int r2 = r4.u()
            int r0 = r0 - r2
            int r2 = r4.r()
            int r0 = r0 - r2
            int r0 = -r0
            goto L_0x0040
        L_0x003f:
            r0 = r1
        L_0x0040:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f1660b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L_0x0056
            int r5 = r4.f1664f
            int r2 = r4.s()
            int r5 = r5 - r2
            int r2 = r4.t()
            int r5 = r5 - r2
            int r5 = -r5
            goto L_0x0081
        L_0x0056:
            r5 = r1
            goto L_0x0081
        L_0x0058:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L_0x006c
            int r5 = r4.f1665g
            int r0 = r4.u()
            int r5 = r5 - r0
            int r0 = r4.r()
            int r5 = r5 - r0
            r0 = r5
            goto L_0x006d
        L_0x006c:
            r0 = r1
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f1660b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L_0x0056
            int r5 = r4.f1664f
            int r2 = r4.s()
            int r5 = r5 - r2
            int r2 = r4.t()
            int r5 = r5 - r2
        L_0x0081:
            if (r0 != 0) goto L_0x0087
            if (r5 != 0) goto L_0x0087
            r6 = r1
            goto L_0x008c
        L_0x0087:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f1660b
            r4.r(r5, r0)
        L_0x008c:
            return r6
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T.G.c(android.view.View, int, android.os.Bundle):boolean");
    }
}
