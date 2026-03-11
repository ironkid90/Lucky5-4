package j;

import A.A;
import A.C0017s;
import C0.f;
import U.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e.C0153a;
import java.lang.reflect.Field;

/* renamed from: j.n  reason: case insensitive filesystem */
public final class C0249n {

    /* renamed from: a  reason: collision with root package name */
    public final View f3732a;

    /* renamed from: b  reason: collision with root package name */
    public final C0250o f3733b;

    /* renamed from: c  reason: collision with root package name */
    public int f3734c = -1;

    /* renamed from: d  reason: collision with root package name */
    public d f3735d;

    /* renamed from: e  reason: collision with root package name */
    public d f3736e;

    /* renamed from: f  reason: collision with root package name */
    public d f3737f;

    public C0249n(View view) {
        C0250o oVar;
        this.f3732a = view;
        PorterDuff.Mode mode = C0250o.f3740b;
        synchronized (C0250o.class) {
            try {
                if (C0250o.f3741c == null) {
                    C0250o.b();
                }
                oVar = C0250o.f3741c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f3733b = oVar;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, U.d] */
    public final void a() {
        View view = this.f3732a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3735d != null) {
                if (this.f3737f == null) {
                    this.f3737f = new Object();
                }
                d dVar = this.f3737f;
                dVar.f1754c = null;
                dVar.f1753b = false;
                dVar.f1755d = null;
                dVar.f1752a = false;
                Field field = A.f0a;
                ColorStateList g2 = C0017s.g(view);
                if (g2 != null) {
                    dVar.f1753b = true;
                    dVar.f1754c = g2;
                }
                PorterDuff.Mode h3 = C0017s.h(view);
                if (h3 != null) {
                    dVar.f1752a = true;
                    dVar.f1755d = h3;
                }
                if (dVar.f1753b || dVar.f1752a) {
                    C0250o.c(background, dVar, view.getDrawableState());
                    return;
                }
            }
            d dVar2 = this.f3736e;
            if (dVar2 != null) {
                C0250o.c(background, dVar2, view.getDrawableState());
                return;
            }
            d dVar3 = this.f3735d;
            if (dVar3 != null) {
                C0250o.c(background, dVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i3) {
        ColorStateList f3;
        View view = this.f3732a;
        f P3 = f.P(view.getContext(), attributeSet, C0153a.f2937u, i3);
        TypedArray typedArray = (TypedArray) P3.f127g;
        try {
            if (typedArray.hasValue(0)) {
                this.f3734c = typedArray.getResourceId(0, -1);
                C0250o oVar = this.f3733b;
                Context context = view.getContext();
                int i4 = this.f3734c;
                synchronized (oVar) {
                    f3 = oVar.f3742a.f(context, i4);
                }
                if (f3 != null) {
                    d(f3);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList H3 = P3.H(1);
                Field field = A.f0a;
                C0017s.q(view, H3);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c3 = C0258x.c(typedArray.getInt(2, -1), (PorterDuff.Mode) null);
                Field field2 = A.f0a;
                C0017s.r(view, c3);
            }
            P3.T();
        } catch (Throwable th) {
            P3.T();
            throw th;
        }
    }

    public final void c(int i3) {
        ColorStateList colorStateList;
        this.f3734c = i3;
        C0250o oVar = this.f3733b;
        if (oVar != null) {
            Context context = this.f3732a.getContext();
            synchronized (oVar) {
                colorStateList = oVar.f3742a.f(context, i3);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, U.d] */
    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3735d == null) {
                this.f3735d = new Object();
            }
            d dVar = this.f3735d;
            dVar.f1754c = colorStateList;
            dVar.f1753b = true;
        } else {
            this.f3735d = null;
        }
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, U.d] */
    public final void e(ColorStateList colorStateList) {
        if (this.f3736e == null) {
            this.f3736e = new Object();
        }
        d dVar = this.f3736e;
        dVar.f1754c = colorStateList;
        dVar.f1753b = true;
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, U.d] */
    public final void f(PorterDuff.Mode mode) {
        if (this.f3736e == null) {
            this.f3736e = new Object();
        }
        d dVar = this.f3736e;
        dVar.f1755d = mode;
        dVar.f1752a = true;
        a();
    }
}
