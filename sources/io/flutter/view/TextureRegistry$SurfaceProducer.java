package io.flutter.view;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
public interface TextureRegistry$SurfaceProducer {
    Surface getForcedNewSurface();

    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(o oVar);

    void setSize(int i3, int i4);
}
