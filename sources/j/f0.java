package j;

import android.util.Property;
import androidx.appcompat.widget.SwitchCompat;

public final class f0 extends Property {
    public final Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).f2211C);
    }

    public final void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
    }
}
