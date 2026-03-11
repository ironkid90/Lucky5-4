package i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: i.g  reason: case insensitive filesystem */
public final class C0205g extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    public final C0207i f3144f;

    /* renamed from: g  reason: collision with root package name */
    public int f3145g = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3146h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3147i;

    /* renamed from: j  reason: collision with root package name */
    public final LayoutInflater f3148j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3149k;

    public C0205g(C0207i iVar, LayoutInflater layoutInflater, boolean z3, int i3) {
        this.f3147i = z3;
        this.f3148j = layoutInflater;
        this.f3144f = iVar;
        this.f3149k = i3;
        a();
    }

    public final void a() {
        C0207i iVar = this.f3144f;
        C0208j jVar = iVar.f3169s;
        if (jVar != null) {
            iVar.i();
            ArrayList arrayList = iVar.f3160j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((C0208j) arrayList.get(i3)) == jVar) {
                    this.f3145g = i3;
                    return;
                }
            }
        }
        this.f3145g = -1;
    }

    /* renamed from: b */
    public final C0208j getItem(int i3) {
        ArrayList arrayList;
        C0207i iVar = this.f3144f;
        if (this.f3147i) {
            iVar.i();
            arrayList = iVar.f3160j;
        } else {
            arrayList = iVar.k();
        }
        int i4 = this.f3145g;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (C0208j) arrayList.get(i3);
    }

    public final int getCount() {
        ArrayList arrayList;
        C0207i iVar = this.f3144f;
        if (this.f3147i) {
            iVar.i();
            arrayList = iVar.f3160j;
        } else {
            arrayList = iVar.k();
        }
        if (this.f3145g < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int i3) {
        return (long) i3;
    }

    public final View getView(int i3, View view, ViewGroup viewGroup) {
        int i4;
        boolean z3 = false;
        if (view == null) {
            view = this.f3148j.inflate(this.f3149k, viewGroup, false);
        }
        int i5 = getItem(i3).f3174b;
        int i6 = i3 - 1;
        if (i6 >= 0) {
            i4 = getItem(i6).f3174b;
        } else {
            i4 = i5;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3144f.l() && i5 != i4) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        C0214p pVar = (C0214p) view;
        if (this.f3146h) {
            listMenuItemView.setForceShowIcon(true);
        }
        pVar.c(getItem(i3));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
