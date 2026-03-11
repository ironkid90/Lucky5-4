package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

@Keep
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    void setOnFrameConsumedListener(m mVar) {
    }

    void setOnTrimMemoryListener(n nVar) {
    }

    SurfaceTexture surfaceTexture();
}
