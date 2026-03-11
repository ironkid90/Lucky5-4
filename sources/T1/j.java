package T1;

import android.graphics.ImageDecoder;
import io.flutter.embedding.engine.FlutterJNI;

public final /* synthetic */ class j implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f1728a;

    public /* synthetic */ j(long j3) {
        this.f1728a = j3;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$1(this.f1728a, imageDecoder, imageInfo, source);
    }
}
