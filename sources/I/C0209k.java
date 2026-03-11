package i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: i.k  reason: case insensitive filesystem */
public abstract class C0209k implements C0215q, C0213o, AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public Rect f3198f;

    public static int m(ListAdapter listAdapter, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i5 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = listAdapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i6, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    public static boolean u(C0207i iVar) {
        int size = iVar.f3156f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = iVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(C0208j jVar) {
        return false;
    }

    public final boolean g(C0208j jVar) {
        return false;
    }

    public abstract void l(C0207i iVar);

    public abstract void n(View view);

    public abstract void o(boolean z3);

    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        C0205g gVar;
        int i4;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            gVar = (C0205g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            gVar = (C0205g) listAdapter;
        }
        C0207i iVar = gVar.f3144f;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i3);
        if (!(this instanceof C0204f)) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        iVar.p(menuItem, this, i4);
    }

    public abstract void p(int i3);

    public abstract void q(int i3);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z3);

    public abstract void t(int i3);

    public final void e(Context context, C0207i iVar) {
    }
}
