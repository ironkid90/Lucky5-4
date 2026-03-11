package j;

import android.os.Handler;
import android.widget.AbsListView;

public final class G implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ I f3595a;

    public G(I i3) {
        this.f3595a = i3;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        if (i3 == 1) {
            I i4 = this.f3595a;
            if (i4.f3599A.getInputMethodMode() != 2 && i4.f3599A.getContentView() != null) {
                Handler handler = i4.f3616w;
                F f3 = i4.f3613s;
                handler.removeCallbacks(f3);
                f3.run();
            }
        }
    }

    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
    }
}
