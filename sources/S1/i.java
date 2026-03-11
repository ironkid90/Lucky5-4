package S1;

import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.h;

public final class i implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f1467a;

    public i(j jVar) {
        this.f1467a = jVar;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        j jVar = this.f1467a;
        h hVar = jVar.f1470h;
        if (hVar != null && !jVar.f1469g) {
            if (hVar != null) {
                hVar.f3309a.onSurfaceChanged(i4, i5);
                return;
            }
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j jVar = this.f1467a;
        boolean z3 = true;
        jVar.f1468f = true;
        if (jVar.f1470h == null || jVar.f1469g) {
            z3 = false;
        }
        if (z3) {
            jVar.e();
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j jVar = this.f1467a;
        boolean z3 = false;
        jVar.f1468f = false;
        h hVar = jVar.f1470h;
        if (hVar != null && !jVar.f1469g) {
            z3 = true;
        }
        if (!z3) {
            return;
        }
        if (hVar != null) {
            hVar.e();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }
}
