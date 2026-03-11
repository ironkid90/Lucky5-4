package A;

import android.view.VelocityTracker;

/* renamed from: A.n  reason: case insensitive filesystem */
public abstract class C0013n {
    public static float a(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.getAxisVelocity(i3);
    }

    public static float b(VelocityTracker velocityTracker, int i3, int i4) {
        return velocityTracker.getAxisVelocity(i3, i4);
    }

    public static boolean c(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.isAxisSupported(i3);
    }
}
