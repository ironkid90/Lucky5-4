package A;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    public final T f31a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i3 = S.f28q;
        } else {
            int i4 = T.f29b;
        }
    }

    public V(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f31a = new S(this, windowInsets);
        } else if (i3 >= 29) {
            this.f31a = new P(this, windowInsets);
        } else if (i3 >= 28) {
            this.f31a = new O(this, windowInsets);
        } else {
            this.f31a = new N(this, windowInsets);
        }
    }

    public static V a(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        V v = new V(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = A.f0a;
            V a2 = C0018t.a(view);
            T t3 = v.f31a;
            t3.o(a2);
            t3.d(view.getRootView());
        }
        return v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        return Objects.equals(this.f31a, ((V) obj).f31a);
    }

    public final int hashCode() {
        T t3 = this.f31a;
        if (t3 == null) {
            return 0;
        }
        return t3.hashCode();
    }

    public V() {
        this.f31a = new T(this);
    }
}
