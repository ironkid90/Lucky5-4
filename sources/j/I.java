package j;

import A.A;
import F.k;
import G.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.C0153a;
import f.C0159a;
import i.C0209k;
import i.C0215q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class I implements C0215q {

    /* renamed from: B  reason: collision with root package name */
    public static final Method f3597B;

    /* renamed from: C  reason: collision with root package name */
    public static final Method f3598C;

    /* renamed from: A  reason: collision with root package name */
    public final r f3599A;

    /* renamed from: f  reason: collision with root package name */
    public final Context f3600f;

    /* renamed from: g  reason: collision with root package name */
    public ListAdapter f3601g;

    /* renamed from: h  reason: collision with root package name */
    public K f3602h;

    /* renamed from: i  reason: collision with root package name */
    public int f3603i = -2;

    /* renamed from: j  reason: collision with root package name */
    public int f3604j;

    /* renamed from: k  reason: collision with root package name */
    public int f3605k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3606l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3607m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3608n;

    /* renamed from: o  reason: collision with root package name */
    public int f3609o = 0;

    /* renamed from: p  reason: collision with root package name */
    public b f3610p;

    /* renamed from: q  reason: collision with root package name */
    public View f3611q;

    /* renamed from: r  reason: collision with root package name */
    public C0209k f3612r;

    /* renamed from: s  reason: collision with root package name */
    public final F f3613s = new F(this, 1);

    /* renamed from: t  reason: collision with root package name */
    public final H f3614t = new H(this);

    /* renamed from: u  reason: collision with root package name */
    public final G f3615u = new G(this);
    public final F v = new F(this, 0);

    /* renamed from: w  reason: collision with root package name */
    public final Handler f3616w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f3617x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public Rect f3618y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3619z;

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3597B = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3598C = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.widget.PopupWindow, j.r] */
    public I(Context context, int i3) {
        Drawable drawable;
        int resourceId;
        this.f3600f = context;
        this.f3616w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0153a.f2927k, i3, 0);
        this.f3604j = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3605k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3606l = true;
        }
        obtainStyledAttributes.recycle();
        ? popupWindow = new PopupWindow(context, (AttributeSet) null, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes((AttributeSet) null, C0153a.f2931o, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            k.c(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes2.getDrawable(0);
        } else {
            drawable = C0159a.a(context, resourceId);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f3599A = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final void c() {
        int i3;
        boolean z3;
        int i4;
        K k3;
        int i5;
        int i6;
        int i7 = 0;
        K k4 = this.f3602h;
        r rVar = this.f3599A;
        Context context = this.f3600f;
        if (k4 == null) {
            K k5 = new K(context, !this.f3619z);
            k5.setHoverListener((L) this);
            this.f3602h = k5;
            k5.setAdapter(this.f3601g);
            this.f3602h.setOnItemClickListener(this.f3612r);
            this.f3602h.setFocusable(true);
            this.f3602h.setFocusableInTouchMode(true);
            this.f3602h.setOnItemSelectedListener(new E(0, this));
            this.f3602h.setOnScrollListener(this.f3615u);
            rVar.setContentView(this.f3602h);
        } else {
            ViewGroup viewGroup = (ViewGroup) rVar.getContentView();
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f3617x;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i3 = rect.bottom + i8;
            if (!this.f3606l) {
                this.f3605k = -i8;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        if (rVar.getInputMethodMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f3611q, this.f3605k, z3);
        int i9 = this.f3603i;
        if (i9 == -2) {
            i4 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        } else if (i9 != -1) {
            i4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        }
        int a2 = this.f3602h.a(i4, maxAvailableHeight);
        if (a2 > 0) {
            i7 = this.f3602h.getPaddingBottom() + this.f3602h.getPaddingTop() + i3;
        }
        int i10 = a2 + i7;
        this.f3599A.getInputMethodMode();
        k.d(rVar, 1002);
        if (rVar.isShowing()) {
            View view = this.f3611q;
            Field field = A.f0a;
            if (view.isAttachedToWindow()) {
                int i11 = this.f3603i;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = this.f3611q.getWidth();
                }
                rVar.setOutsideTouchable(true);
                View view2 = this.f3611q;
                int i12 = this.f3604j;
                int i13 = this.f3605k;
                if (i11 < 0) {
                    i5 = -1;
                } else {
                    i5 = i11;
                }
                if (i10 < 0) {
                    i6 = -1;
                } else {
                    i6 = i10;
                }
                rVar.update(view2, i12, i13, i5, i6);
                return;
            }
            return;
        }
        int i14 = this.f3603i;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.f3611q.getWidth();
        }
        rVar.setWidth(i14);
        rVar.setHeight(i10);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3597B;
            if (method != null) {
                try {
                    method.invoke(rVar, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rVar.setIsClippedToScreen(true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f3614t);
        if (this.f3608n) {
            k.c(rVar, this.f3607m);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3598C;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, new Object[]{this.f3618y});
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f3618y);
        }
        rVar.showAsDropDown(this.f3611q, this.f3604j, this.f3605k, this.f3609o);
        this.f3602h.setSelection(-1);
        if ((!this.f3619z || this.f3602h.isInTouchMode()) && (k3 = this.f3602h) != null) {
            k3.setListSelectionHidden(true);
            k3.requestLayout();
        }
        if (!this.f3619z) {
            this.f3616w.post(this.v);
        }
    }

    public final void d(ListAdapter listAdapter) {
        b bVar = this.f3610p;
        if (bVar == null) {
            this.f3610p = new b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f3601g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f3601g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3610p);
        }
        K k3 = this.f3602h;
        if (k3 != null) {
            k3.setAdapter(this.f3601g);
        }
    }

    public final void dismiss() {
        r rVar = this.f3599A;
        rVar.dismiss();
        rVar.setContentView((View) null);
        this.f3602h = null;
        this.f3616w.removeCallbacks(this.f3613s);
    }

    public final boolean i() {
        return this.f3599A.isShowing();
    }

    public final ListView j() {
        return this.f3602h;
    }
}
