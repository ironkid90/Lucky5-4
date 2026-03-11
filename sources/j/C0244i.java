package j;

import C0.n;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import b2.h;
import com.ai9poker.app.R;
import i.C0207i;
import i.C0208j;
import i.C0209k;
import i.C0212n;
import i.C0213o;
import i.C0214p;
import i.C0217s;
import java.util.ArrayList;

/* renamed from: j.i  reason: case insensitive filesystem */
public final class C0244i implements C0213o {

    /* renamed from: A  reason: collision with root package name */
    public final h f3695A = new h(9, this);

    /* renamed from: f  reason: collision with root package name */
    public final Context f3696f;

    /* renamed from: g  reason: collision with root package name */
    public Context f3697g;

    /* renamed from: h  reason: collision with root package name */
    public C0207i f3698h;

    /* renamed from: i  reason: collision with root package name */
    public final LayoutInflater f3699i;

    /* renamed from: j  reason: collision with root package name */
    public C0212n f3700j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3701k = R.layout.abc_action_menu_item_layout;

    /* renamed from: l  reason: collision with root package name */
    public ActionMenuView f3702l;

    /* renamed from: m  reason: collision with root package name */
    public C0243h f3703m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f3704n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3705o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3706p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3707q;

    /* renamed from: r  reason: collision with root package name */
    public int f3708r;

    /* renamed from: s  reason: collision with root package name */
    public int f3709s;

    /* renamed from: t  reason: collision with root package name */
    public int f3710t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3711u;
    public final SparseBooleanArray v = new SparseBooleanArray();

    /* renamed from: w  reason: collision with root package name */
    public C0241f f3712w;

    /* renamed from: x  reason: collision with root package name */
    public C0241f f3713x;

    /* renamed from: y  reason: collision with root package name */
    public n f3714y;

    /* renamed from: z  reason: collision with root package name */
    public C0242g f3715z;

    public C0244i(Context context) {
        this.f3696f = context;
        this.f3699i = LayoutInflater.from(context);
    }

    public final void a(C0207i iVar, boolean z3) {
        i();
        C0241f fVar = this.f3713x;
        if (fVar != null && fVar.b()) {
            fVar.f3208i.dismiss();
        }
        C0212n nVar = this.f3700j;
        if (nVar != null) {
            nVar.a(iVar, z3);
        }
    }

    public final boolean b(C0208j jVar) {
        return false;
    }

    public final View c(C0208j jVar, View view, ActionMenuView actionMenuView) {
        C0214p pVar;
        View view2 = jVar.f3197z;
        if (view2 == null) {
            view2 = null;
        }
        int i3 = 0;
        if (view2 == null || jVar.c()) {
            if (view instanceof C0214p) {
                pVar = (C0214p) view;
            } else {
                pVar = (C0214p) this.f3699i.inflate(this.f3701k, actionMenuView, false);
            }
            pVar.c(jVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) pVar;
            actionMenuItemView.setItemInvoker(this.f3702l);
            if (this.f3715z == null) {
                this.f3715z = new C0242g(this);
            }
            actionMenuItemView.setPopupCallback(this.f3715z);
            view2 = (View) pVar;
        }
        if (jVar.f3172B) {
            i3 = 8;
        }
        view2.setVisibility(i3);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0246k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    public final boolean d() {
        int i3;
        ArrayList arrayList;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C0207i iVar = this.f3698h;
        if (iVar != null) {
            arrayList = iVar.k();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i5 = this.f3710t;
        int i6 = this.f3709s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f3702l;
        int i7 = 0;
        boolean z7 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z3 = true;
            if (i7 >= i3) {
                break;
            }
            C0208j jVar = (C0208j) arrayList.get(i7);
            int i10 = jVar.f3196y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z7 = true;
            }
            if (this.f3711u && jVar.f3172B) {
                i5 = 0;
            }
            i7++;
        }
        if (this.f3706p && (z7 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = this.v;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            C0208j jVar2 = (C0208j) arrayList.get(i12);
            int i14 = jVar2.f3196y;
            if ((i14 & 2) == i4) {
                z4 = z3;
            } else {
                z4 = false;
            }
            int i15 = jVar2.f3174b;
            if (z4) {
                View c3 = c(jVar2, (View) null, actionMenuView);
                c3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c3.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z3);
                }
                jVar2.f(z3);
            } else if ((i14 & true) == z3) {
                boolean z8 = sparseBooleanArray.get(i15);
                if ((i11 > 0 || z8) && i6 > 0) {
                    z5 = z3;
                } else {
                    z5 = false;
                }
                if (z5) {
                    View c4 = c(jVar2, (View) null, actionMenuView);
                    c4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = c4.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    if (i6 + i13 > 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z5 &= z6;
                }
                if (z5 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z8) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        C0208j jVar3 = (C0208j) arrayList.get(i16);
                        if (jVar3.f3174b == i15) {
                            if (jVar3.d()) {
                                i11++;
                            }
                            jVar3.f(false);
                        }
                    }
                }
                if (z5) {
                    i11--;
                }
                jVar2.f(z5);
            } else {
                jVar2.f(false);
                i12++;
                i4 = 2;
                z3 = true;
            }
            i12++;
            i4 = 2;
            z3 = true;
        }
        return z3;
    }

    public final void e(Context context, C0207i iVar) {
        this.f3697g = context;
        LayoutInflater.from(context);
        this.f3698h = iVar;
        Resources resources = context.getResources();
        if (!this.f3707q) {
            this.f3706p = true;
        }
        int i3 = 2;
        this.f3708r = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i3 = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i3 = 4;
        } else if (i4 >= 360) {
            i3 = 3;
        }
        this.f3710t = i3;
        int i6 = this.f3708r;
        if (this.f3706p) {
            if (this.f3703m == null) {
                C0243h hVar = new C0243h(this, this.f3696f);
                this.f3703m = hVar;
                if (this.f3705o) {
                    hVar.setImageDrawable(this.f3704n);
                    this.f3704n = null;
                    this.f3705o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3703m.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f3703m.getMeasuredWidth();
        } else {
            this.f3703m = null;
        }
        this.f3709s = i6;
        float f3 = resources.getDisplayMetrics().density;
    }

    public final void f(C0212n nVar) {
        throw null;
    }

    public final boolean g(C0208j jVar) {
        return false;
    }

    public final void h() {
        ActionMenuView actionMenuView;
        int i3;
        C0208j jVar;
        ActionMenuView actionMenuView2 = this.f3702l;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (actionMenuView2 != null) {
            C0207i iVar = this.f3698h;
            if (iVar != null) {
                iVar.i();
                ArrayList k3 = this.f3698h.k();
                int size = k3.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C0208j jVar2 = (C0208j) k3.get(i4);
                    if (jVar2.d()) {
                        View childAt = actionMenuView2.getChildAt(i3);
                        if (childAt instanceof C0214p) {
                            jVar = ((C0214p) childAt).getItemData();
                        } else {
                            jVar = null;
                        }
                        View c3 = c(jVar2, childAt, actionMenuView2);
                        if (jVar2 != jVar) {
                            c3.setPressed(false);
                            c3.jumpDrawablesToCurrentState();
                        }
                        if (c3 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) c3.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(c3);
                            }
                            this.f3702l.addView(c3, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < actionMenuView2.getChildCount()) {
                if (actionMenuView2.getChildAt(i3) == this.f3703m) {
                    i3++;
                } else {
                    actionMenuView2.removeViewAt(i3);
                }
            }
        }
        this.f3702l.requestLayout();
        C0207i iVar2 = this.f3698h;
        if (iVar2 != null) {
            iVar2.i();
            ArrayList arrayList2 = iVar2.f3159i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((C0208j) arrayList2.get(i5)).getClass();
            }
        }
        C0207i iVar3 = this.f3698h;
        if (iVar3 != null) {
            iVar3.i();
            arrayList = iVar3.f3160j;
        }
        if (this.f3706p && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((C0208j) arrayList.get(0)).f3172B;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f3703m == null) {
                this.f3703m = new C0243h(this, this.f3696f);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f3703m.getParent();
            if (viewGroup2 != this.f3702l) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f3703m);
                }
                ActionMenuView actionMenuView3 = this.f3702l;
                C0243h hVar = this.f3703m;
                actionMenuView3.getClass();
                C0246k h3 = ActionMenuView.h();
                h3.f3718c = true;
                actionMenuView3.addView(hVar, h3);
            }
        } else {
            C0243h hVar2 = this.f3703m;
            if (hVar2 != null && hVar2.getParent() == (actionMenuView = this.f3702l)) {
                actionMenuView.removeView(this.f3703m);
            }
        }
        this.f3702l.setOverflowReserved(this.f3706p);
    }

    public final boolean i() {
        ActionMenuView actionMenuView;
        n nVar = this.f3714y;
        if (nVar == null || (actionMenuView = this.f3702l) == null) {
            C0241f fVar = this.f3712w;
            if (fVar == null) {
                return false;
            }
            if (fVar.b()) {
                fVar.f3208i.dismiss();
            }
            return true;
        }
        actionMenuView.removeCallbacks(nVar);
        this.f3714y = null;
        return true;
    }

    public final boolean j() {
        C0207i iVar;
        if (!this.f3706p) {
            return false;
        }
        C0241f fVar = this.f3712w;
        if ((fVar != null && fVar.b()) || (iVar = this.f3698h) == null || this.f3702l == null || this.f3714y != null) {
            return false;
        }
        iVar.i();
        if (iVar.f3160j.isEmpty()) {
            return false;
        }
        n nVar = new n(this, new C0241f(this, this.f3697g, this.f3698h, (View) this.f3703m), 11, false);
        this.f3714y = nVar;
        this.f3702l.post(nVar);
        C0212n nVar2 = this.f3700j;
        if (nVar2 == null) {
            return true;
        }
        nVar2.b((C0217s) null);
        return true;
    }

    public final boolean k(C0217s sVar) {
        boolean z3;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        C0217s sVar2 = sVar;
        while (true) {
            C0207i iVar = sVar2.v;
            if (iVar == this.f3698h) {
                break;
            }
            sVar2 = iVar;
        }
        ActionMenuView actionMenuView = this.f3702l;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i3);
                if ((childAt instanceof C0214p) && ((C0214p) childAt).getItemData() == sVar2.f3229w) {
                    view = childAt;
                    break;
                }
                i3++;
            }
        }
        if (view == null) {
            return false;
        }
        sVar.f3229w.getClass();
        int size = sVar.f3156f.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = false;
                break;
            }
            MenuItem item = sVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z3 = true;
                break;
            }
            i4++;
        }
        C0241f fVar = new C0241f(this, this.f3697g, sVar, view);
        this.f3713x = fVar;
        fVar.f3206g = z3;
        C0209k kVar = fVar.f3208i;
        if (kVar != null) {
            kVar.o(z3);
        }
        C0241f fVar2 = this.f3713x;
        if (!fVar2.b()) {
            if (fVar2.f3204e != null) {
                fVar2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        C0212n nVar = this.f3700j;
        if (nVar != null) {
            nVar.b(sVar);
        }
        return true;
    }
}
