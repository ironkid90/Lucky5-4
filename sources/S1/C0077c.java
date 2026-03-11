package S1;

import F0.h;
import T1.c;
import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import c2.p;
import c2.q;

/* renamed from: S1.c  reason: case insensitive filesystem */
public final class C0077c implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0078d f1439a;

    public C0077c(C0078d dVar) {
        this.f1439a = dVar;
    }

    public final void onBackCancelled() {
        C0078d dVar = this.f1439a;
        if (dVar.l("cancelBackGesture")) {
            g gVar = dVar.f1442g;
            gVar.c();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                ((q) cVar.f1689j.f322g).a("cancelBackGesture", (Object) null, (p) null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        C0078d dVar = this.f1439a;
        if (dVar.l("commitBackGesture")) {
            g gVar = dVar.f1442g;
            gVar.c();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                ((q) cVar.f1689j.f322g).a("commitBackGesture", (Object) null, (p) null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        C0078d dVar = this.f1439a;
        if (dVar.l("updateBackGestureProgress")) {
            g gVar = dVar.f1442g;
            gVar.c();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                h hVar = cVar.f1689j;
                hVar.getClass();
                ((q) hVar.f322g).a("updateBackGestureProgress", h.u(backEvent), (p) null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        C0078d dVar = this.f1439a;
        if (dVar.l("startBackGesture")) {
            g gVar = dVar.f1442g;
            gVar.c();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                h hVar = cVar.f1689j;
                hVar.getClass();
                ((q) hVar.f322g).a("startBackGesture", h.u(backEvent), (p) null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }
}
