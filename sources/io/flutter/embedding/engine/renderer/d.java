package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;

public final /* synthetic */ class d implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f3284a;

    public /* synthetic */ d(e eVar) {
        this.f3284a = eVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        e eVar = this.f3284a;
        eVar.getClass();
        try {
            image = imageReader.acquireLatestImage();
        } catch (IllegalStateException e2) {
            Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e2);
            image = null;
        }
        if (image != null) {
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = eVar.f3288d;
            if (flutterRenderer$ImageReaderSurfaceProducer.released || eVar.f3287c) {
                image.close();
            } else {
                flutterRenderer$ImageReaderSurfaceProducer.onImage(imageReader, image);
            }
        }
    }
}
