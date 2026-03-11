package io.flutter.view;

import android.hardware.display.DisplayManager;

public final class p implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f3562a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f3563b;

    public p(r rVar, DisplayManager displayManager) {
        this.f3563b = rVar;
        this.f3562a = displayManager;
    }

    public final void onDisplayAdded(int i3) {
    }

    public final void onDisplayChanged(int i3) {
        if (i3 == 0) {
            float refreshRate = this.f3562a.getDisplay(0).getRefreshRate();
            r rVar = this.f3563b;
            rVar.f3568a = (long) (1.0E9d / ((double) refreshRate));
            rVar.f3569b.setRefreshRateFPS(refreshRate);
        }
    }

    public final void onDisplayRemoved(int i3) {
    }
}
