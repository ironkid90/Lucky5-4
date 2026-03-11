package A;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import t.C0469c;

public final class H extends L {

    /* renamed from: c  reason: collision with root package name */
    public static Field f7c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f8d = false;

    /* renamed from: e  reason: collision with root package name */
    public static Constructor f9e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f10f = false;

    /* renamed from: a  reason: collision with root package name */
    public WindowInsets f11a = e();

    /* renamed from: b  reason: collision with root package name */
    public C0469c f12b;

    private static WindowInsets e() {
        Class<WindowInsets> cls = WindowInsets.class;
        if (!f8d) {
            try {
                f7c = cls.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f8d = true;
        }
        Field field = f7c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f10f) {
            try {
                f9e = cls.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f10f = true;
        }
        Constructor constructor = f9e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    public V b() {
        a();
        V a2 = V.a(this.f11a, (View) null);
        T t3 = a2.f31a;
        t3.n((C0469c[]) null);
        t3.p(this.f12b);
        return a2;
    }

    public void c(C0469c cVar) {
        this.f12b = cVar;
    }

    public void d(C0469c cVar) {
        WindowInsets windowInsets = this.f11a;
        if (windowInsets != null) {
            this.f11a = windowInsets.replaceSystemWindowInsets(cVar.f4636a, cVar.f4637b, cVar.f4638c, cVar.f4639d);
        }
    }
}
