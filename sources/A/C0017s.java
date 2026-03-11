package A;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.ai9poker.app.R;
import t.C0469c;

/* renamed from: A.s  reason: case insensitive filesystem */
public abstract class C0017s {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static V b(View view, V v, Rect rect) {
        WindowInsets windowInsets;
        T t3 = v.f31a;
        if (t3 instanceof M) {
            windowInsets = ((M) t3).f19c;
        } else {
            windowInsets = null;
        }
        if (windowInsets != null) {
            return V.a(view.computeSystemWindowInsets(windowInsets, rect), view);
        }
        rect.setEmpty();
        return v;
    }

    public static boolean c(View view, float f3, float f4, boolean z3) {
        return view.dispatchNestedFling(f3, f4, z3);
    }

    public static boolean d(View view, float f3, float f4) {
        return view.dispatchNestedPreFling(f3, f4);
    }

    public static boolean e(View view, int i3, int i4, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i3, i4, iArr, iArr2);
    }

    public static boolean f(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        return view.dispatchNestedScroll(i3, i4, i5, i6, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static V j(View view) {
        L l3;
        if (!G.f6d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = G.f3a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) G.f4b.get(obj);
            Rect rect2 = (Rect) G.f5c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                l3 = new K();
            } else if (i3 >= 29) {
                l3 = new J();
            } else {
                l3 = new H();
            }
            l3.c(C0469c.a(rect.left, rect.top, rect.right, rect.bottom));
            l3.d(C0469c.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            V b3 = l3.b();
            b3.f31a.o(b3);
            b3.f31a.d(view.getRootView());
            return b3;
        } catch (IllegalAccessException e2) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f3) {
        view.setElevation(f3);
    }

    public static void t(View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    public static void u(View view, C0012m mVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, mVar);
        }
        if (mVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new r(view, mVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f3) {
        view.setTranslationZ(f3);
    }

    public static void x(View view, float f3) {
        view.setZ(f3);
    }

    public static boolean y(View view, int i3) {
        return view.startNestedScroll(i3);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
