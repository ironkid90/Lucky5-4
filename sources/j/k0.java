package j;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import h.C0182a;
import i.C0207i;
import i.C0208j;
import i.C0213o;
import i.C0217s;
import java.util.ArrayList;

public final class k0 implements C0213o {

    /* renamed from: f  reason: collision with root package name */
    public C0207i f3724f;

    /* renamed from: g  reason: collision with root package name */
    public C0208j f3725g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Toolbar f3726h;

    public k0(Toolbar toolbar) {
        this.f3726h = toolbar;
    }

    public final boolean b(C0208j jVar) {
        Toolbar toolbar = this.f3726h;
        View view = toolbar.f2268n;
        if (view instanceof C0182a) {
            SearchView searchView = (SearchView) ((C0182a) view);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f2198u;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f2192d0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f2194f0);
            searchView.f2193e0 = false;
        }
        toolbar.removeView(toolbar.f2268n);
        toolbar.removeView(toolbar.f2267m);
        toolbar.f2268n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3725g = null;
        toolbar.requestLayout();
        jVar.f3172B = false;
        jVar.f3186n.o(false);
        return true;
    }

    public final boolean d() {
        return false;
    }

    public final void e(Context context, C0207i iVar) {
        C0208j jVar;
        C0207i iVar2 = this.f3724f;
        if (!(iVar2 == null || (jVar = this.f3725g) == null)) {
            iVar2.d(jVar);
        }
        this.f3724f = iVar;
    }

    public final boolean g(C0208j jVar) {
        Toolbar toolbar = this.f3726h;
        toolbar.c();
        ViewParent parent = toolbar.f2267m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2267m);
            }
            toolbar.addView(toolbar.f2267m);
        }
        View view = jVar.f3197z;
        if (view == null) {
            view = null;
        }
        toolbar.f2268n = view;
        this.f3725g = jVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2268n);
            }
            l0 g2 = Toolbar.g();
            g2.f3727a = (toolbar.f2273s & 112) | 8388611;
            g2.f3728b = 2;
            toolbar.f2268n.setLayoutParams(g2);
            toolbar.addView(toolbar.f2268n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (!(((l0) childAt.getLayoutParams()).f3728b == 2 || childAt == toolbar.f2260f)) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        jVar.f3172B = true;
        jVar.f3186n.o(false);
        View view2 = toolbar.f2268n;
        if (view2 instanceof C0182a) {
            SearchView searchView = (SearchView) ((C0182a) view2);
            if (!searchView.f2193e0) {
                searchView.f2193e0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f2198u;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f2194f0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    public final void h() {
        if (this.f3725g != null) {
            C0207i iVar = this.f3724f;
            if (iVar != null) {
                int size = iVar.f3156f.size();
                int i3 = 0;
                while (i3 < size) {
                    if (this.f3724f.getItem(i3) != this.f3725g) {
                        i3++;
                    } else {
                        return;
                    }
                }
            }
            b(this.f3725g);
        }
    }

    public final boolean k(C0217s sVar) {
        return false;
    }

    public final void a(C0207i iVar, boolean z3) {
    }
}
