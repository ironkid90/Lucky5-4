package T;

import A2.h;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1670a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1671b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f1672c;

    /* renamed from: d  reason: collision with root package name */
    public int f1673d;

    /* renamed from: e  reason: collision with root package name */
    public y f1674e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1675f;

    public z(RecyclerView recyclerView) {
        this.f1675f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1670a = arrayList;
        Collections.unmodifiableList(arrayList);
        this.f1672c = 2;
        this.f1673d = 2;
    }

    public final void a(int i3) {
        RecyclerView recyclerView = this.f1675f;
        if (i3 < 0 || i3 >= recyclerView.c0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i3 + "(" + i3 + "). Item count:" + recyclerView.c0.a() + recyclerView.h());
        }
        C c3 = recyclerView.c0;
        boolean z3 = c3.f1555c;
        ArrayList arrayList = this.f1670a;
        if (arrayList.size() <= 0) {
            ArrayList arrayList2 = (ArrayList) recyclerView.f2619i.f129i;
            if (arrayList2.size() <= 0) {
                ArrayList arrayList3 = this.f1671b;
                if (arrayList3.size() <= 0) {
                    int G3 = recyclerView.f2617h.G(i3, 0);
                    if (G3 >= 0) {
                        throw null;
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + G3 + ").state:" + c3.a() + recyclerView.h());
                }
                arrayList3.get(0).getClass();
                throw new ClassCastException();
            }
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void b() {
        t tVar = this.f1675f.f2626n;
        this.f1673d = this.f1672c;
        ArrayList arrayList = this.f1671b;
        int size = arrayList.size() - 1;
        if (size >= 0 && arrayList.size() > this.f1673d) {
            h.j(arrayList.get(size));
            int[] iArr = RecyclerView.m0;
            throw null;
        }
    }
}
