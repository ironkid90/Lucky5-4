package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

public final class f implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final long f3289f;

    /* renamed from: g  reason: collision with root package name */
    public final FlutterJNI f3290g;

    public f(long j3, FlutterJNI flutterJNI) {
        this.f3289f = j3;
        this.f3290g = flutterJNI;
    }

    public final void run() {
        FlutterJNI flutterJNI = this.f3290g;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f3289f);
        }
    }
}
