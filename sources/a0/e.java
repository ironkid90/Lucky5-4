package a0;

import A2.r;
import androidx.window.extensions.WindowExtensionsProvider;

public abstract class e {
    static {
        r.a(e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
