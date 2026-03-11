package h;

import A.C0007h;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import i.C0208j;
import java.lang.reflect.Constructor;

/* renamed from: h.c  reason: case insensitive filesystem */
public final class C0184c {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f3000A;

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f3001B = null;

    /* renamed from: C  reason: collision with root package name */
    public PorterDuff.Mode f3002C = null;

    /* renamed from: D  reason: collision with root package name */
    public final /* synthetic */ d f3003D;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f3004a;

    /* renamed from: b  reason: collision with root package name */
    public int f3005b;

    /* renamed from: c  reason: collision with root package name */
    public int f3006c;

    /* renamed from: d  reason: collision with root package name */
    public int f3007d;

    /* renamed from: e  reason: collision with root package name */
    public int f3008e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3009f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3010g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3011h;

    /* renamed from: i  reason: collision with root package name */
    public int f3012i;

    /* renamed from: j  reason: collision with root package name */
    public int f3013j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f3014k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f3015l;

    /* renamed from: m  reason: collision with root package name */
    public int f3016m;

    /* renamed from: n  reason: collision with root package name */
    public char f3017n;

    /* renamed from: o  reason: collision with root package name */
    public int f3018o;

    /* renamed from: p  reason: collision with root package name */
    public char f3019p;

    /* renamed from: q  reason: collision with root package name */
    public int f3020q;

    /* renamed from: r  reason: collision with root package name */
    public int f3021r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3022s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3023t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3024u;
    public int v;

    /* renamed from: w  reason: collision with root package name */
    public int f3025w;

    /* renamed from: x  reason: collision with root package name */
    public String f3026x;

    /* renamed from: y  reason: collision with root package name */
    public String f3027y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f3028z;

    public C0184c(d dVar, Menu menu) {
        this.f3003D = dVar;
        this.f3004a = menu;
        this.f3005b = 0;
        this.f3006c = 0;
        this.f3007d = 0;
        this.f3008e = 0;
        this.f3009f = true;
        this.f3010g = true;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3003D.f3033c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [android.view.MenuItem$OnMenuItemClickListener, java.lang.Object, h.b] */
    public final void b(MenuItem menuItem) {
        boolean z3;
        MenuItem enabled = menuItem.setChecked(this.f3022s).setVisible(this.f3023t).setEnabled(this.f3024u);
        boolean z4 = false;
        if (this.f3021r >= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        enabled.setCheckable(z3).setTitleCondensed(this.f3015l).setIcon(this.f3016m);
        int i3 = this.v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.f3027y;
        d dVar = this.f3003D;
        if (str != null) {
            if (!dVar.f3033c.isRestricted()) {
                if (dVar.f3034d == null) {
                    dVar.f3034d = d.a(dVar.f3033c);
                }
                Object obj = dVar.f3034d;
                String str2 = this.f3027y;
                ? obj2 = new Object();
                obj2.f2998a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f2999b = cls.getMethod(str2, C0183b.f2997c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e2) {
                    InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                    inflateException.initCause(e2);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        boolean z5 = menuItem instanceof C0208j;
        if (z5) {
            C0208j jVar = (C0208j) menuItem;
        }
        if (this.f3021r >= 2 && z5) {
            C0208j jVar2 = (C0208j) menuItem;
            jVar2.f3195x = (jVar2.f3195x & -5) | 4;
        }
        String str3 = this.f3026x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f3029e, dVar.f3031a));
            z4 = true;
        }
        int i4 = this.f3025w;
        if (i4 > 0) {
            if (!z4) {
                menuItem.setActionView(i4);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        CharSequence charSequence = this.f3028z;
        boolean z6 = menuItem instanceof C0208j;
        if (z6) {
            ((C0208j) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0007h.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3000A;
        if (z6) {
            ((C0208j) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0007h.m(menuItem, charSequence2);
        }
        char c3 = this.f3017n;
        int i5 = this.f3018o;
        if (z6) {
            ((C0208j) menuItem).setAlphabeticShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0007h.g(menuItem, c3, i5);
        }
        char c4 = this.f3019p;
        int i6 = this.f3020q;
        if (z6) {
            ((C0208j) menuItem).setNumericShortcut(c4, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0007h.k(menuItem, c4, i6);
        }
        PorterDuff.Mode mode = this.f3002C;
        if (mode != null) {
            if (z6) {
                ((C0208j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0007h.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3001B;
        if (colorStateList == null) {
            return;
        }
        if (z6) {
            ((C0208j) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0007h.i(menuItem, colorStateList);
        }
    }
}
