package T;

import A.C0001b;
import B.l;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class F extends C0001b {

    /* renamed from: d  reason: collision with root package name */
    public final G f1565d;

    public F(G g2) {
        this.f1565d = g2;
    }

    public final void b(View view, l lVar) {
        this.f37a.onInitializeAccessibilityNodeInfo(view, lVar.f98a);
        G g2 = this.f1565d;
        if (!g2.f1566d.l()) {
            RecyclerView recyclerView = g2.f1566d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().getClass();
                RecyclerView.j(view);
            }
        }
    }

    public final boolean c(View view, int i3, Bundle bundle) {
        if (super.c(view, i3, bundle)) {
            return true;
        }
        G g2 = this.f1565d;
        if (!g2.f1566d.l()) {
            RecyclerView recyclerView = g2.f1566d;
            if (recyclerView.getLayoutManager() != null) {
                z zVar = recyclerView.getLayoutManager().f1660b.f2613f;
            }
        }
        return false;
    }
}
