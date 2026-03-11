package A;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import t.C0469c;

public abstract class M extends T {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f14h = false;

    /* renamed from: i  reason: collision with root package name */
    public static Method f15i;

    /* renamed from: j  reason: collision with root package name */
    public static Class f16j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f17k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f18l;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f19c;

    /* renamed from: d  reason: collision with root package name */
    public C0469c[] f20d;

    /* renamed from: e  reason: collision with root package name */
    public C0469c f21e = null;

    /* renamed from: f  reason: collision with root package name */
    public V f22f;

    /* renamed from: g  reason: collision with root package name */
    public C0469c f23g;

    public M(V v, WindowInsets windowInsets) {
        super(v);
        this.f19c = windowInsets;
    }

    private C0469c r() {
        V v = this.f22f;
        if (v != null) {
            return v.f31a.g();
        }
        return C0469c.f4635e;
    }

    private C0469c s(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f14h) {
                u();
            }
            Method method = f15i;
            if (!(method == null || f16j == null || f17k == null)) {
                try {
                    Object invoke = method.invoke(view, (Object[]) null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f17k.get(f18l.get(invoke));
                    if (rect != null) {
                        return C0469c.a(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void u() {
        try {
            f15i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f16j = cls;
            f17k = cls.getDeclaredField("mVisibleInsets");
            f18l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f17k.setAccessible(true);
            f18l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f14h = true;
    }

    public void d(View view) {
        C0469c s3 = s(view);
        if (s3 == null) {
            s3 = C0469c.f4635e;
        }
        v(s3);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f23g, ((M) obj).f23g);
    }

    public final C0469c i() {
        if (this.f21e == null) {
            WindowInsets windowInsets = this.f19c;
            this.f21e = C0469c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f21e;
    }

    public boolean l() {
        return this.f19c.isRound();
    }

    @SuppressLint({"WrongConstant"})
    public boolean m(int i3) {
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0 && !t(i4)) {
                return false;
            }
        }
        return true;
    }

    public void n(C0469c[] cVarArr) {
        this.f20d = cVarArr;
    }

    public void o(V v) {
        this.f22f = v;
    }

    public C0469c q(int i3, boolean z3) {
        int i4;
        C0006g gVar;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (i3 != 1) {
            C0469c cVar = null;
            if (i3 != 2) {
                C0469c cVar2 = C0469c.f4635e;
                if (i3 == 8) {
                    C0469c[] cVarArr = this.f20d;
                    if (cVarArr != null) {
                        cVar = cVarArr[3];
                    }
                    if (cVar != null) {
                        return cVar;
                    }
                    C0469c i9 = i();
                    C0469c r3 = r();
                    int i10 = i9.f4639d;
                    if (i10 > r3.f4639d) {
                        return C0469c.a(0, 0, 0, i10);
                    }
                    C0469c cVar3 = this.f23g;
                    if (cVar3 == null || cVar3.equals(cVar2) || (i4 = this.f23g.f4639d) <= r3.f4639d) {
                        return cVar2;
                    }
                    return C0469c.a(0, 0, 0, i4);
                } else if (i3 == 16) {
                    return h();
                } else {
                    if (i3 == 32) {
                        return f();
                    }
                    if (i3 == 64) {
                        return j();
                    }
                    if (i3 != 128) {
                        return cVar2;
                    }
                    V v = this.f22f;
                    if (v != null) {
                        gVar = v.f31a.e();
                    } else {
                        gVar = e();
                    }
                    if (gVar == null) {
                        return cVar2;
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 28) {
                        i5 = C0005f.d(gVar.f48a);
                    } else {
                        i5 = 0;
                    }
                    if (i11 >= 28) {
                        i6 = C0005f.f(gVar.f48a);
                    } else {
                        i6 = 0;
                    }
                    if (i11 >= 28) {
                        i7 = C0005f.e(gVar.f48a);
                    } else {
                        i7 = 0;
                    }
                    if (i11 >= 28) {
                        i8 = C0005f.c(gVar.f48a);
                    }
                    return C0469c.a(i5, i6, i7, i8);
                }
            } else if (z3) {
                C0469c r4 = r();
                C0469c g2 = g();
                return C0469c.a(Math.max(r4.f4636a, g2.f4636a), 0, Math.max(r4.f4638c, g2.f4638c), Math.max(r4.f4639d, g2.f4639d));
            } else {
                C0469c i12 = i();
                V v3 = this.f22f;
                if (v3 != null) {
                    cVar = v3.f31a.g();
                }
                int i13 = i12.f4639d;
                if (cVar != null) {
                    i13 = Math.min(i13, cVar.f4639d);
                }
                return C0469c.a(i12.f4636a, 0, i12.f4638c, i13);
            }
        } else if (z3) {
            return C0469c.a(0, Math.max(r().f4637b, i().f4637b), 0, 0);
        } else {
            return C0469c.a(0, i().f4637b, 0, 0);
        }
    }

    public boolean t(int i3) {
        if (!(i3 == 1 || i3 == 2)) {
            if (i3 == 4) {
                return false;
            }
            if (!(i3 == 8 || i3 == 128)) {
                return true;
            }
        }
        return !q(i3, false).equals(C0469c.f4635e);
    }

    public void v(C0469c cVar) {
        this.f23g = cVar;
    }
}
