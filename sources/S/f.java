package s;

import android.content.res.ColorStateList;
import android.content.res.Resources;

public abstract class f {
    public static int a(Resources resources, int i3, Resources.Theme theme) {
        return resources.getColor(i3, theme);
    }

    public static ColorStateList b(Resources resources, int i3, Resources.Theme theme) {
        return resources.getColorStateList(i3, theme);
    }
}
