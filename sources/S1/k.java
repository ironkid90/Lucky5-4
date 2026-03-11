package S1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.h;

public final class k implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f1472a;

    public k(l lVar) {
        this.f1472a = lVar;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
        l lVar = this.f1472a;
        boolean z3 = true;
        lVar.f1473f = true;
        if (lVar.f1475h == null || lVar.f1474g) {
            z3 = false;
        }
        if (z3) {
            lVar.e();
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l lVar = this.f1472a;
        boolean z3 = false;
        lVar.f1473f = false;
        h hVar = lVar.f1475h;
        if (hVar != null && !lVar.f1474g) {
            z3 = true;
        }
        if (z3) {
            if (hVar != null) {
                hVar.e();
                Surface surface = lVar.f1476i;
                if (surface != null) {
                    surface.release();
                    lVar.f1476i = null;
                }
            } else {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
        }
        Surface surface2 = lVar.f1476i;
        if (surface2 != null) {
            surface2.release();
            lVar.f1476i = null;
        }
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
        l lVar = this.f1472a;
        h hVar = lVar.f1475h;
        if (hVar != null && !lVar.f1474g) {
            if (hVar != null) {
                hVar.f3309a.onSurfaceChanged(i3, i4);
                return;
            }
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
