package i;

import A.A;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.transition.Transition;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ai9poker.app.R;
import d2.C0152a;
import j.I;
import j.K;
import j.L;
import j.r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: i.f  reason: case insensitive filesystem */
public final class C0204f extends C0209k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3120A;

    /* renamed from: B  reason: collision with root package name */
    public C0212n f3121B;

    /* renamed from: C  reason: collision with root package name */
    public ViewTreeObserver f3122C;

    /* renamed from: D  reason: collision with root package name */
    public C0210l f3123D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f3124E;

    /* renamed from: g  reason: collision with root package name */
    public final Context f3125g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3126h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3127i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3128j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f3129k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f3130l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f3131m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final C0201c f3132n = new C0201c(this, 0);

    /* renamed from: o  reason: collision with root package name */
    public final C0202d f3133o = new C0202d(this, 0);

    /* renamed from: p  reason: collision with root package name */
    public final C0152a f3134p = new C0152a(2, this);

    /* renamed from: q  reason: collision with root package name */
    public int f3135q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f3136r = 0;

    /* renamed from: s  reason: collision with root package name */
    public View f3137s;

    /* renamed from: t  reason: collision with root package name */
    public View f3138t;

    /* renamed from: u  reason: collision with root package name */
    public int f3139u;
    public boolean v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3140w;

    /* renamed from: x  reason: collision with root package name */
    public int f3141x;

    /* renamed from: y  reason: collision with root package name */
    public int f3142y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3143z;

    public C0204f(Context context, View view, int i3, boolean z3) {
        int i4 = 0;
        this.f3125g = context;
        this.f3137s = view;
        this.f3127i = i3;
        this.f3128j = z3;
        this.f3143z = false;
        Field field = A.f0a;
        this.f3139u = view.getLayoutDirection() != 1 ? 1 : i4;
        Resources resources = context.getResources();
        this.f3126h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3129k = new Handler();
    }

    public final void a(C0207i iVar, boolean z3) {
        int i3;
        ArrayList arrayList = this.f3131m;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (iVar == ((C0203e) arrayList.get(i4)).f3118b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int i5 = i4 + 1;
            if (i5 < arrayList.size()) {
                ((C0203e) arrayList.get(i5)).f3118b.c(false);
            }
            C0203e eVar = (C0203e) arrayList.remove(i4);
            CopyOnWriteArrayList copyOnWriteArrayList = eVar.f3118b.f3168r;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0213o oVar = (C0213o) weakReference.get();
                if (oVar == null || oVar == this) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            boolean z4 = this.f3124E;
            L l3 = eVar.f3117a;
            if (z4) {
                l3.f3599A.setExitTransition((Transition) null);
                l3.f3599A.setAnimationStyle(0);
            }
            l3.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f3139u = ((C0203e) arrayList.get(size2 - 1)).f3119c;
            } else {
                View view = this.f3137s;
                Field field = A.f0a;
                if (view.getLayoutDirection() == 1) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                this.f3139u = i3;
            }
            if (size2 == 0) {
                dismiss();
                C0212n nVar = this.f3121B;
                if (nVar != null) {
                    nVar.a(iVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f3122C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f3122C.removeGlobalOnLayoutListener(this.f3132n);
                    }
                    this.f3122C = null;
                }
                this.f3138t.removeOnAttachStateChangeListener(this.f3133o);
                this.f3123D.onDismiss();
            } else if (z3) {
                ((C0203e) arrayList.get(0)).f3118b.c(false);
            }
        }
    }

    public final void c() {
        boolean z3;
        if (!i()) {
            ArrayList arrayList = this.f3130l;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v((C0207i) it.next());
            }
            arrayList.clear();
            View view = this.f3137s;
            this.f3138t = view;
            if (view != null) {
                if (this.f3122C == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f3122C = viewTreeObserver;
                if (z3) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f3132n);
                }
                this.f3138t.addOnAttachStateChangeListener(this.f3133o);
            }
        }
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        ArrayList arrayList = this.f3131m;
        int size = arrayList.size();
        if (size > 0) {
            C0203e[] eVarArr = (C0203e[]) arrayList.toArray(new C0203e[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C0203e eVar = eVarArr[i3];
                if (eVar.f3117a.f3599A.isShowing()) {
                    eVar.f3117a.dismiss();
                }
            }
        }
    }

    public final void f(C0212n nVar) {
        this.f3121B = nVar;
    }

    public final void h() {
        Iterator it = this.f3131m.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0203e) it.next()).f3117a.f3602h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0205g) adapter).notifyDataSetChanged();
        }
    }

    public final boolean i() {
        ArrayList arrayList = this.f3131m;
        if (arrayList.size() <= 0 || !((C0203e) arrayList.get(0)).f3117a.f3599A.isShowing()) {
            return false;
        }
        return true;
    }

    public final ListView j() {
        ArrayList arrayList = this.f3131m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0203e) arrayList.get(arrayList.size() - 1)).f3117a.f3602h;
    }

    public final boolean k(C0217s sVar) {
        Iterator it = this.f3131m.iterator();
        while (it.hasNext()) {
            C0203e eVar = (C0203e) it.next();
            if (sVar == eVar.f3118b) {
                eVar.f3117a.f3602h.requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        l(sVar);
        C0212n nVar = this.f3121B;
        if (nVar != null) {
            nVar.b(sVar);
        }
        return true;
    }

    public final void l(C0207i iVar) {
        iVar.b(this, this.f3125g);
        if (i()) {
            v(iVar);
        } else {
            this.f3130l.add(iVar);
        }
    }

    public final void n(View view) {
        if (this.f3137s != view) {
            this.f3137s = view;
            int i3 = this.f3135q;
            Field field = A.f0a;
            this.f3136r = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    public final void o(boolean z3) {
        this.f3143z = z3;
    }

    public final void onDismiss() {
        C0203e eVar;
        ArrayList arrayList = this.f3131m;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                eVar = null;
                break;
            }
            eVar = (C0203e) arrayList.get(i3);
            if (!eVar.f3117a.f3599A.isShowing()) {
                break;
            }
            i3++;
        }
        if (eVar != null) {
            eVar.f3118b.c(false);
        }
    }

    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i3) {
        if (this.f3135q != i3) {
            this.f3135q = i3;
            View view = this.f3137s;
            Field field = A.f0a;
            this.f3136r = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    public final void q(int i3) {
        this.v = true;
        this.f3141x = i3;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3123D = (C0210l) onDismissListener;
    }

    public final void s(boolean z3) {
        this.f3120A = z3;
    }

    public final void t(int i3) {
        this.f3140w = true;
        this.f3142y = i3;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [j.I, j.L] */
    public final void v(C0207i iVar) {
        View view;
        C0203e eVar;
        Rect rect;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        char c3;
        MenuItem menuItem;
        int i7;
        C0205g gVar;
        int firstVisiblePosition;
        C0207i iVar2 = iVar;
        Context context = this.f3125g;
        LayoutInflater from = LayoutInflater.from(context);
        C0205g gVar2 = new C0205g(iVar2, from, this.f3128j, R.layout.abc_cascading_menu_item_layout);
        if (!i() && this.f3143z) {
            gVar2.f3146h = true;
        } else if (i()) {
            gVar2.f3146h = C0209k.u(iVar);
        }
        int m3 = C0209k.m(gVar2, context, this.f3126h);
        ? i8 = new I(context, this.f3127i);
        i8.f3624D = this.f3134p;
        i8.f3612r = this;
        i8.f3599A.setOnDismissListener(this);
        i8.f3611q = this.f3137s;
        i8.f3609o = this.f3136r;
        i8.f3619z = true;
        i8.f3599A.setFocusable(true);
        i8.f3599A.setInputMethodMode(2);
        i8.d(gVar2);
        Drawable background = i8.f3599A.getBackground();
        if (background != null) {
            Rect rect2 = i8.f3617x;
            background.getPadding(rect2);
            i8.f3603i = rect2.left + rect2.right + m3;
        } else {
            i8.f3603i = m3;
        }
        i8.f3609o = this.f3136r;
        ArrayList arrayList = this.f3131m;
        if (arrayList.size() > 0) {
            eVar = (C0203e) arrayList.get(arrayList.size() - 1);
            C0207i iVar3 = eVar.f3118b;
            int size = iVar3.f3156f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = iVar3.getItem(i9);
                if (menuItem.hasSubMenu() && iVar2 == menuItem.getSubMenu()) {
                    break;
                }
                i9++;
            }
            if (menuItem != null) {
                K k3 = eVar.f3117a.f3602h;
                ListAdapter adapter = k3.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    gVar = (C0205g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (C0205g) adapter;
                    i7 = 0;
                }
                int count = gVar.getCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= count) {
                        i10 = -1;
                        break;
                    } else if (menuItem == gVar.getItem(i10)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1 && (firstVisiblePosition = (i10 + i7) - k3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < k3.getChildCount()) {
                    view = k3.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            eVar = null;
            view = null;
        }
        if (view != null) {
            int i11 = Build.VERSION.SDK_INT;
            r rVar = i8.f3599A;
            if (i11 <= 28) {
                Method method = L.f3623E;
                if (method != null) {
                    try {
                        method.invoke(rVar, new Object[]{Boolean.FALSE});
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                rVar.setTouchModal(false);
            }
            i8.f3599A.setEnterTransition((Transition) null);
            K k4 = ((C0203e) arrayList.get(arrayList.size() - 1)).f3117a.f3602h;
            int[] iArr = new int[2];
            k4.getLocationOnScreen(iArr);
            Rect rect3 = new Rect();
            this.f3138t.getWindowVisibleDisplayFrame(rect3);
            if (this.f3139u == 1) {
                if (k4.getWidth() + iArr[0] + m3 > rect3.right) {
                    i3 = 0;
                }
                i3 = 1;
            } else {
                if (iArr[0] - m3 >= 0) {
                    i3 = 0;
                }
                i3 = 1;
            }
            if (i3 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f3139u = i3;
            if (Build.VERSION.SDK_INT >= 26) {
                i8.f3611q = view;
                i5 = 0;
                i4 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f3137s.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f3136r & 7) == 5) {
                    c3 = 0;
                    iArr2[0] = this.f3137s.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                } else {
                    c3 = 0;
                }
                i4 = iArr3[c3] - iArr2[c3];
                i5 = iArr3[1] - iArr2[1];
            }
            if ((this.f3136r & 5) == 5) {
                if (z3) {
                    i6 = i4 + m3;
                    i8.f3604j = i6;
                    i8.f3608n = true;
                    i8.f3607m = true;
                    i8.f3605k = i5;
                    i8.f3606l = true;
                } else {
                    m3 = view.getWidth();
                }
            } else if (z3) {
                i6 = i4 + view.getWidth();
                i8.f3604j = i6;
                i8.f3608n = true;
                i8.f3607m = true;
                i8.f3605k = i5;
                i8.f3606l = true;
            }
            i6 = i4 - m3;
            i8.f3604j = i6;
            i8.f3608n = true;
            i8.f3607m = true;
            i8.f3605k = i5;
            i8.f3606l = true;
        } else {
            if (this.v) {
                i8.f3604j = this.f3141x;
            }
            if (this.f3140w) {
                i8.f3605k = this.f3142y;
                i8.f3606l = true;
            }
            Rect rect4 = this.f3198f;
            if (rect4 != null) {
                rect = new Rect(rect4);
            } else {
                rect = null;
            }
            i8.f3618y = rect;
        }
        arrayList.add(new C0203e(i8, iVar2, this.f3139u));
        i8.c();
        K k5 = i8.f3602h;
        k5.setOnKeyListener(this);
        if (eVar == null && this.f3120A && iVar2.f3162l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, k5, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(iVar2.f3162l);
            k5.addHeaderView(frameLayout, (Object) null, false);
            i8.c();
        }
    }
}
