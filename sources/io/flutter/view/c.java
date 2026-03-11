package io.flutter.view;

import F0.h;
import S1.o;
import android.view.accessibility.AccessibilityManager;

public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f3443a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f3444b;

    public c(g gVar, AccessibilityManager accessibilityManager) {
        this.f3444b = gVar;
        this.f3443a = accessibilityManager;
    }

    public final void onTouchExplorationStateChanged(boolean z3) {
        g gVar = this.f3444b;
        if (!gVar.f3546t) {
            boolean z4 = false;
            if (!z3) {
                gVar.i(false);
                f fVar = gVar.f3541o;
                if (fVar != null) {
                    gVar.g(fVar.f3501b, 256);
                    gVar.f3541o = null;
                }
            }
            h hVar = gVar.f3544r;
            if (hVar != null) {
                boolean isEnabled = this.f3443a.isEnabled();
                o oVar = (o) hVar.f322g;
                if (!oVar.f1492m.f1681b.f3309a.getIsSoftwareRenderingEnabled()) {
                    if (!isEnabled && !z3) {
                        z4 = true;
                    }
                    oVar.setWillNotDraw(z4);
                    return;
                }
                oVar.setWillNotDraw(false);
            }
        }
    }
}
