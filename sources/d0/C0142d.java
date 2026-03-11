package d0;

import A2.i;
import A2.j;
import A2.r;
import L.k;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import z2.a;

/* renamed from: d0.d  reason: case insensitive filesystem */
public final class C0142d extends j implements a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f2892g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0143e f2893h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0142d(C0143e eVar, int i3) {
        super(0);
        this.f2892g = i3;
        this.f2893h = eVar;
    }

    public final Object a() {
        boolean z3;
        Class cls;
        boolean z4;
        boolean z5;
        boolean z6;
        switch (this.f2892g) {
            case 0:
                Class<?> loadClass = this.f2893h.f2894a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                i.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", (Class[]) null);
                Method method2 = loadClass.getMethod("getType", (Class[]) null);
                Method method3 = loadClass.getMethod("getState", (Class[]) null);
                i.d(method, "getBoundsMethod");
                if (M0.a.n(method, r.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    i.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (M0.a.n(method2, r.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        i.d(method3, "getStateMethod");
                        if (M0.a.n(method3, r.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z3 = true;
                            return Boolean.valueOf(z3);
                        }
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case 1:
                C0143e eVar = this.f2893h;
                try {
                    cls = eVar.f2895b.z();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f2894a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                i.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, cls});
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", new Class[]{cls});
                i.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    i.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            case k.FLOAT_FIELD_NUMBER:
                Class<?> loadClass3 = this.f2893h.f2894a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                i.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Class<Consumer> cls3 = Consumer.class;
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", new Class[]{Context.class, cls3});
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", new Class[]{cls3});
                i.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    i.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z5 = true;
                        return Boolean.valueOf(z5);
                    }
                }
                z5 = false;
                return Boolean.valueOf(z5);
            default:
                C0143e eVar2 = this.f2893h;
                Class<?> loadClass4 = ((ClassLoader) eVar2.f2896c.f100g).loadClass("androidx.window.extensions.WindowExtensions");
                i.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", (Class[]) null);
                Class<?> loadClass5 = eVar2.f2894a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                i.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                i.d(method8, "getWindowLayoutComponentMethod");
                if (!Modifier.isPublic(method8.getModifiers()) || !method8.getReturnType().equals(loadClass5)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
        }
    }
}
