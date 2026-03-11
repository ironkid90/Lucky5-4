package S1;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.embedding.engine.renderer.j;

public final class l extends TextureView implements j {

    /* renamed from: f  reason: collision with root package name */
    public boolean f1473f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1474g;

    /* renamed from: h  reason: collision with root package name */
    public h f1475h;

    /* renamed from: i  reason: collision with root package name */
    public Surface f1476i;

    public final void a() {
        if (this.f1475h == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1474g = true;
        }
    }

    public final void b(h hVar) {
        h hVar2 = this.f1475h;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f1475h = hVar;
        d();
    }

    public final void c() {
        if (this.f1475h != null) {
            if (getWindowToken() != null) {
                h hVar = this.f1475h;
                if (hVar != null) {
                    hVar.e();
                    Surface surface = this.f1476i;
                    if (surface != null) {
                        surface.release();
                        this.f1476i = null;
                    }
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            this.f1475h = null;
            return;
        }
        Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public final void d() {
        if (this.f1475h == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f1473f) {
            e();
        }
        this.f1474g = false;
    }

    public final void e() {
        if (this.f1475h == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f1476i;
        if (surface != null) {
            surface.release();
            this.f1476i = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f1476i = surface2;
        h hVar = this.f1475h;
        boolean z3 = this.f1474g;
        if (!z3) {
            hVar.e();
        }
        hVar.f3310b = surface2;
        FlutterJNI flutterJNI = hVar.f3309a;
        if (z3) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    public h getAttachedRenderer() {
        return this.f1475h;
    }

    public void setRenderSurface(Surface surface) {
        this.f1476i = surface;
    }
}
