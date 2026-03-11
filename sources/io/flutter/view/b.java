package io.flutter.view;

import C0.f;
import F0.h;
import S1.o;
import T1.k;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f3442a;

    public b(g gVar) {
        this.f3442a = gVar;
    }

    public final void onAccessibilityStateChanged(boolean z3) {
        g gVar = this.f3442a;
        if (!gVar.f3546t) {
            boolean z4 = false;
            f fVar = gVar.f3528b;
            if (z3) {
                a aVar = gVar.f3547u;
                fVar.f129i = aVar;
                ((FlutterJNI) fVar.f127g).setAccessibilityDelegate(aVar);
                ((FlutterJNI) fVar.f127g).setSemanticsEnabled(true);
            } else {
                gVar.i(false);
                fVar.f129i = null;
                ((FlutterJNI) fVar.f127g).setAccessibilityDelegate((k) null);
                ((FlutterJNI) fVar.f127g).setSemanticsEnabled(false);
            }
            h hVar = gVar.f3544r;
            if (hVar != null) {
                boolean isTouchExplorationEnabled = gVar.f3529c.isTouchExplorationEnabled();
                o oVar = (o) hVar.f322g;
                if (!oVar.f1492m.f1681b.f3309a.getIsSoftwareRenderingEnabled()) {
                    if (!z3 && !isTouchExplorationEnabled) {
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
