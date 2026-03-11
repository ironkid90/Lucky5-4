package l2;

import C0.f;
import S1.C0078d;
import T1.d;
import Y1.b;
import Z1.a;
import android.util.Log;

/* renamed from: l2.f  reason: case insensitive filesystem */
public final class C0319f implements b, a {

    /* renamed from: f  reason: collision with root package name */
    public f f4014f;

    public final void onAttachedToActivity(Z1.b bVar) {
        f fVar = this.f4014f;
        if (fVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            fVar.f129i = (C0078d) ((d) bVar).f1703a;
        }
    }

    public final void onAttachedToEngine(Y1.a aVar) {
        f fVar = new f(aVar.f1964a);
        this.f4014f = fVar;
        f.Y(aVar.f1965b, fVar);
    }

    public final void onDetachedFromActivity() {
        f fVar = this.f4014f;
        if (fVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            fVar.f129i = null;
        }
    }

    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public final void onDetachedFromEngine(Y1.a aVar) {
        if (this.f4014f == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        f.Y(aVar.f1965b, (f) null);
        this.f4014f = null;
    }

    public final void onReattachedToActivityForConfigChanges(Z1.b bVar) {
        onAttachedToActivity(bVar);
    }
}
