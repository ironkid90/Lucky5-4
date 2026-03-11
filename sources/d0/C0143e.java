package d0;

import A2.i;
import B.m;
import F0.h;
import M.d;
import M0.a;
import a0.e;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* renamed from: d0.e  reason: case insensitive filesystem */
public final class C0143e {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f2894a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2895b;

    /* renamed from: c  reason: collision with root package name */
    public final m f2896c;

    public C0143e(ClassLoader classLoader, h hVar) {
        this.f2894a = classLoader;
        this.f2895b = hVar;
        this.f2896c = new m(19, (Object) classLoader);
    }

    public final WindowLayoutComponent a() {
        m mVar = this.f2896c;
        mVar.getClass();
        boolean z3 = false;
        try {
            i.d(((ClassLoader) mVar.f100g).loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (a.Y("WindowExtensionsProvider#getWindowExtensions is not valid", new d(2, mVar)) && a.Y("WindowExtensions#getWindowLayoutComponent is not valid", new C0142d(this, 3)) && a.Y("FoldingFeature class is not valid", new C0142d(this, 0))) {
                int a2 = e.a();
                if (a2 == 1) {
                    z3 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (a.Y("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C0142d(this, 2))) {
                        z3 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z3) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return a.Y("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C0142d(this, 1));
    }
}
