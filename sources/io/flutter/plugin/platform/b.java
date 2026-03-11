package io.flutter.plugin.platform;

import S1.h;
import android.view.MotionEvent;
import io.flutter.view.g;

public final class b extends h {

    /* renamed from: l  reason: collision with root package name */
    public a f3373l;

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z3;
        a aVar = this.f3373l;
        if (aVar != null) {
            g gVar = aVar.f3372a;
            if (gVar == null) {
                z3 = false;
            } else {
                z3 = gVar.e(motionEvent, true);
            }
            if (z3) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
