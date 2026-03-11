package A;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

public class O extends N {
    public O(V v, WindowInsets windowInsets) {
        super(v, windowInsets);
    }

    public V a() {
        return V.a(this.f19c.consumeDisplayCutout(), (View) null);
    }

    public C0006g e() {
        DisplayCutout i3 = this.f19c.getDisplayCutout();
        if (i3 == null) {
            return null;
        }
        return new C0006g(i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o3 = (O) obj;
        if (!Objects.equals(this.f19c, o3.f19c) || !Objects.equals(this.f23g, o3.f23g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f19c.hashCode();
    }
}
