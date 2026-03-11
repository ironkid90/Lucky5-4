package i;

import A.A;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ai9poker.app.R;
import j.I;
import j.K;
import j.L;
import java.lang.reflect.Field;

/* renamed from: i.r  reason: case insensitive filesystem */
public final class C0216r extends C0209k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: g  reason: collision with root package name */
    public final Context f3211g;

    /* renamed from: h  reason: collision with root package name */
    public final C0207i f3212h;

    /* renamed from: i  reason: collision with root package name */
    public final C0205g f3213i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3214j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3215k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3216l;

    /* renamed from: m  reason: collision with root package name */
    public final L f3217m;

    /* renamed from: n  reason: collision with root package name */
    public final C0201c f3218n = new C0201c(this, 1);

    /* renamed from: o  reason: collision with root package name */
    public final C0202d f3219o = new C0202d(this, 1);

    /* renamed from: p  reason: collision with root package name */
    public C0210l f3220p;

    /* renamed from: q  reason: collision with root package name */
    public View f3221q;

    /* renamed from: r  reason: collision with root package name */
    public View f3222r;

    /* renamed from: s  reason: collision with root package name */
    public C0212n f3223s;

    /* renamed from: t  reason: collision with root package name */
    public ViewTreeObserver f3224t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3225u;
    public boolean v;

    /* renamed from: w  reason: collision with root package name */
    public int f3226w;

    /* renamed from: x  reason: collision with root package name */
    public int f3227x = 0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3228y;

    /* JADX WARNING: type inference failed for: r6v1, types: [j.I, j.L] */
    public C0216r(int i3, Context context, View view, C0207i iVar, boolean z3) {
        this.f3211g = context;
        this.f3212h = iVar;
        this.f3214j = z3;
        this.f3213i = new C0205g(iVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f3216l = i3;
        Resources resources = context.getResources();
        this.f3215k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3221q = view;
        this.f3217m = new I(context, i3);
        iVar.b(this, context);
    }

    public final void a(C0207i iVar, boolean z3) {
        if (iVar == this.f3212h) {
            dismiss();
            C0212n nVar = this.f3223s;
            if (nVar != null) {
                nVar.a(iVar, z3);
            }
        }
    }

    public final void c() {
        View view;
        boolean z3;
        Rect rect;
        if (!i()) {
            if (this.f3225u || (view = this.f3221q) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.f3222r = view;
            L l3 = this.f3217m;
            l3.f3599A.setOnDismissListener(this);
            l3.f3612r = this;
            l3.f3619z = true;
            l3.f3599A.setFocusable(true);
            View view2 = this.f3222r;
            if (this.f3224t == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f3224t = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3218n);
            }
            view2.addOnAttachStateChangeListener(this.f3219o);
            l3.f3611q = view2;
            l3.f3609o = this.f3227x;
            boolean z4 = this.v;
            Context context = this.f3211g;
            C0205g gVar = this.f3213i;
            if (!z4) {
                this.f3226w = C0209k.m(gVar, context, this.f3215k);
                this.v = true;
            }
            int i3 = this.f3226w;
            Drawable background = l3.f3599A.getBackground();
            if (background != null) {
                Rect rect2 = l3.f3617x;
                background.getPadding(rect2);
                l3.f3603i = rect2.left + rect2.right + i3;
            } else {
                l3.f3603i = i3;
            }
            l3.f3599A.setInputMethodMode(2);
            Rect rect3 = this.f3198f;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            l3.f3618y = rect;
            l3.c();
            K k3 = l3.f3602h;
            k3.setOnKeyListener(this);
            if (this.f3228y) {
                C0207i iVar = this.f3212h;
                if (iVar.f3162l != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, k3, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(iVar.f3162l);
                    }
                    frameLayout.setEnabled(false);
                    k3.addHeaderView(frameLayout, (Object) null, false);
                }
            }
            l3.d(gVar);
            l3.c();
        }
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        if (i()) {
            this.f3217m.dismiss();
        }
    }

    public final void f(C0212n nVar) {
        this.f3223s = nVar;
    }

    public final void h() {
        this.v = false;
        C0205g gVar = this.f3213i;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    public final boolean i() {
        if (this.f3225u || !this.f3217m.f3599A.isShowing()) {
            return false;
        }
        return true;
    }

    public final ListView j() {
        return this.f3217m.f3602h;
    }

    public final boolean k(C0217s sVar) {
        int i3;
        if (sVar.hasVisibleItems()) {
            C0211m mVar = new C0211m(this.f3216l, this.f3211g, this.f3222r, sVar, this.f3214j);
            C0212n nVar = this.f3223s;
            mVar.f3207h = nVar;
            C0209k kVar = mVar.f3208i;
            if (kVar != null) {
                kVar.f(nVar);
            }
            boolean u3 = C0209k.u(sVar);
            mVar.f3206g = u3;
            C0209k kVar2 = mVar.f3208i;
            if (kVar2 != null) {
                kVar2.o(u3);
            }
            mVar.f3209j = this.f3220p;
            this.f3220p = null;
            this.f3212h.c(false);
            L l3 = this.f3217m;
            int i4 = l3.f3604j;
            if (!l3.f3606l) {
                i3 = 0;
            } else {
                i3 = l3.f3605k;
            }
            int i5 = this.f3227x;
            View view = this.f3221q;
            Field field = A.f0a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i4 += this.f3221q.getWidth();
            }
            if (!mVar.b()) {
                if (mVar.f3204e != null) {
                    mVar.d(i4, i3, true, true);
                }
            }
            C0212n nVar2 = this.f3223s;
            if (nVar2 != null) {
                nVar2.b(sVar);
            }
            return true;
        }
        return false;
    }

    public final void n(View view) {
        this.f3221q = view;
    }

    public final void o(boolean z3) {
        this.f3213i.f3146h = z3;
    }

    public final void onDismiss() {
        this.f3225u = true;
        this.f3212h.c(true);
        ViewTreeObserver viewTreeObserver = this.f3224t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3224t = this.f3222r.getViewTreeObserver();
            }
            this.f3224t.removeGlobalOnLayoutListener(this.f3218n);
            this.f3224t = null;
        }
        this.f3222r.removeOnAttachStateChangeListener(this.f3219o);
        C0210l lVar = this.f3220p;
        if (lVar != null) {
            lVar.onDismiss();
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
        this.f3227x = i3;
    }

    public final void q(int i3) {
        this.f3217m.f3604j = i3;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3220p = (C0210l) onDismissListener;
    }

    public final void s(boolean z3) {
        this.f3228y = z3;
    }

    public final void t(int i3) {
        L l3 = this.f3217m;
        l3.f3605k = i3;
        l3.f3606l = true;
    }

    public final void l(C0207i iVar) {
    }
}
