package S1;

import B.m;
import android.os.Build;
import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.h;

public final class E implements SurfaceHolder.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    public final j f1427a;

    /* renamed from: b  reason: collision with root package name */
    public h f1428b;

    /* renamed from: c  reason: collision with root package name */
    public final i f1429c;

    /* renamed from: d  reason: collision with root package name */
    public final C0079e f1430d = new C0079e(2, this);

    /* renamed from: e  reason: collision with root package name */
    public final D f1431e;

    public E(i iVar, j jVar, h hVar) {
        boolean z3;
        D d3;
        if (Build.VERSION.SDK_INT < 26) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            d3 = new F0.h(11, (Object) this);
        } else {
            d3 = new m(13, (Object) this);
        }
        this.f1431e = d3;
        this.f1429c = iVar;
        this.f1428b = hVar;
        this.f1427a = jVar;
        if (z3) {
            jVar.setAlpha(0.0f);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        i iVar = this.f1429c;
        if (iVar != null) {
            iVar.surfaceChanged(surfaceHolder, i3, i4, i5);
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        i iVar = this.f1429c;
        if (iVar != null) {
            iVar.surfaceCreated(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i iVar = this.f1429c;
        if (iVar != null) {
            iVar.surfaceDestroyed(surfaceHolder);
        }
    }

    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        h hVar = this.f1428b;
        if (hVar != null) {
            hVar.a(new C(this, runnable));
        }
    }

    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
