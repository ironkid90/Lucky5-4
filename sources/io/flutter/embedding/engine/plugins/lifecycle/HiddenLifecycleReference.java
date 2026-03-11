package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.f;

@Keep
public class HiddenLifecycleReference {
    private final f lifecycle;

    public HiddenLifecycleReference(f fVar) {
        this.lifecycle = fVar;
    }

    public f getLifecycle() {
        return this.lifecycle;
    }
}
