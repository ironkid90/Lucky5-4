package A;

import android.view.ViewConfiguration;

public abstract class D {
    public static int a(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i3, i4, i5);
    }

    public static int b(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i3, i4, i5);
    }
}
