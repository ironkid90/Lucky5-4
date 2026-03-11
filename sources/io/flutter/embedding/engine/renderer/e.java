package io.flutter.embedding.engine.renderer;

import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ImageReader f3285a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f3286b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public boolean f3287c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f3288d;

    public e(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f3288d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f3285a = imageReader;
        imageReader.setOnImageAvailableListener(new d(this), new Handler(Looper.getMainLooper()));
    }
}
