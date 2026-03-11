package j;

import A.A;
import java.lang.reflect.Field;

public final class F implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3593f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ I f3594g;

    public /* synthetic */ F(I i3, int i4) {
        this.f3593f = i4;
        this.f3594g = i3;
    }

    public final void run() {
        I i3 = this.f3594g;
        switch (this.f3593f) {
            case 0:
                K k3 = i3.f3602h;
                if (k3 != null) {
                    k3.setListSelectionHidden(true);
                    k3.requestLayout();
                    return;
                }
                return;
            default:
                K k4 = i3.f3602h;
                if (k4 != null) {
                    Field field = A.f0a;
                    if (k4.isAttachedToWindow() && i3.f3602h.getCount() > i3.f3602h.getChildCount() && i3.f3602h.getChildCount() <= Integer.MAX_VALUE) {
                        i3.f3599A.setInputMethodMode(2);
                        i3.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
