package U1;

import c2.C0137e;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g implements C0137e {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f1776a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1777b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f1778c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i3) {
        this.f1776a = flutterJNI;
        this.f1777b = i3;
    }

    public final void a(ByteBuffer byteBuffer) {
        if (!this.f1778c.getAndSet(true)) {
            int i3 = this.f1777b;
            FlutterJNI flutterJNI = this.f1776a;
            if (byteBuffer == null) {
                flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
            } else {
                flutterJNI.invokePlatformMessageResponseCallback(i3, byteBuffer, byteBuffer.position());
            }
        } else {
            throw new IllegalStateException("Reply already submitted");
        }
    }
}
