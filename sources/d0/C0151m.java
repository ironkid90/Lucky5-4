package d0;

import A.C0004e;
import A.H;
import A.J;
import A.K;
import A.L;
import A.V;
import A2.i;
import a0.b;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import h0.C0185a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import q2.C0398a;

/* renamed from: d0.m  reason: case insensitive filesystem */
public final class C0151m implements C0150l {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2910b = 0;

    static {
        new ArrayList(new C0398a(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static C0149k a(Activity activity) {
        Rect rect;
        V v;
        L l3;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            i.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i4 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
                i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (NoSuchFieldException e2) {
                Log.w("m", e2);
                rect = b(activity);
            } catch (NoSuchMethodException e3) {
                Log.w("m", e3);
                rect = b(activity);
            } catch (IllegalAccessException e4) {
                Log.w("m", e4);
                rect = b(activity);
            } catch (InvocationTargetException e5) {
                Log.w("m", e5);
                rect = b(activity);
            }
        } else if (i4 >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i3 = resources.getDimensionPixelSize(identifier);
                } else {
                    i3 = 0;
                }
                int i5 = rect.bottom + i3;
                if (i5 == point.y) {
                    rect.bottom = i5;
                } else {
                    int i6 = rect.right + i3;
                    if (i6 == point.x) {
                        rect.right = i6;
                    }
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            if (i7 >= 30) {
                l3 = new K();
            } else if (i7 >= 29) {
                l3 = new J();
            } else {
                l3 = new H();
            }
            v = l3.b();
            i.d(v, "{\n            WindowInse…ilder().build()\n        }");
        } else if (i7 >= 30) {
            v = C0185a.f3035a.a(activity);
        } else {
            throw new Exception("Incompatible SDK version");
        }
        return new C0149k(new b(rect), v);
    }

    public static Rect b(Activity activity) {
        int i3;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
                i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", (Class[]) null).invoke(obj, (Object[]) null);
                i.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (NoSuchFieldException e2) {
            Log.w("m", e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e3) {
            Log.w("m", e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (IllegalAccessException e4) {
            Log.w("m", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e5) {
            Log.w("m", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        i.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i3 = resources.getDimensionPixelSize(identifier);
            } else {
                i3 = 0;
            }
            int i4 = rect.bottom + i3;
            if (i4 == point.y) {
                rect.bottom = i4;
            } else {
                int i5 = rect.right + i3;
                if (i5 == point.x) {
                    rect.right = i5;
                } else if (rect.left == i3) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class[]) null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance((Object[]) null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{newInstance.getClass()});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, new Object[]{newInstance});
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (C0004e.v(obj2)) {
                    displayCutout = C0004e.j(obj2);
                }
            } catch (ClassNotFoundException e6) {
                Log.w("m", e6);
            } catch (NoSuchMethodException e7) {
                Log.w("m", e7);
            } catch (NoSuchFieldException e8) {
                Log.w("m", e8);
            } catch (IllegalAccessException e9) {
                Log.w("m", e9);
            } catch (InvocationTargetException e10) {
                Log.w("m", e10);
            } catch (InstantiationException e11) {
                Log.w("m", e11);
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}
