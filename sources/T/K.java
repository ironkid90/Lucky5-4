package T;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1581a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f1582b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f1583c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public final int f1584d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f1585e;

    public K(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f1585e = staggeredGridLayoutManager;
        this.f1584d = i3;
    }

    public final int a(int i3) {
        int i4 = this.f1583c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f1581a.size() == 0) {
            return i3;
        }
        ArrayList arrayList = this.f1581a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f1583c = this.f1585e.f2640j.b(view);
        ((H) view.getLayoutParams()).getClass();
        return this.f1583c;
    }
}
