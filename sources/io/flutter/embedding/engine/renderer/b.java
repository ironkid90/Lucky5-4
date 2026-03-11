package io.flutter.embedding.engine.renderer;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f3281f;

    public /* synthetic */ b(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer) {
        this.f3281f = flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final void run() {
        this.f3281f.lambda$dequeueImage$0();
    }
}
