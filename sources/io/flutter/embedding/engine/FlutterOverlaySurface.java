package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    public FlutterOverlaySurface(int i3, Surface surface2) {
        this.id = i3;
        this.surface = surface2;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
