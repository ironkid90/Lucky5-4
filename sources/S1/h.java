package S1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.j;
import java.nio.ByteBuffer;
import java.util.Locale;

public class h extends View implements j {

    /* renamed from: f  reason: collision with root package name */
    public ImageReader f1461f;

    /* renamed from: g  reason: collision with root package name */
    public Image f1462g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f1463h;

    /* renamed from: i  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1464i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1465j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1466k = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, int i3, int i4, int i5) {
        super(context, (AttributeSet) null);
        ImageReader f3 = f(i3, i4);
        this.f1461f = f3;
        this.f1465j = i5;
        setAlpha(0.0f);
    }

    public static ImageReader f(int i3, int i4) {
        if (i3 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i3 + ", set width=1");
            i3 = 1;
        }
        if (i4 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i4 + ", set height=1");
            i4 = 1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return ImageReader.newInstance(i3, i4, 1, 3, 768);
        }
        return ImageReader.newInstance(i3, i4, 1, 3);
    }

    public final void b(io.flutter.embedding.engine.renderer.h hVar) {
        if (L.j.b(this.f1465j) == 0) {
            Surface surface = this.f1461f.getSurface();
            hVar.f3310b = surface;
            hVar.f3309a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f1464i = hVar;
        this.f1466k = true;
    }

    public final void c() {
        if (this.f1466k) {
            setAlpha(0.0f);
            e();
            this.f1463h = null;
            Image image = this.f1462g;
            if (image != null) {
                image.close();
                this.f1462g = null;
            }
            invalidate();
            this.f1466k = false;
        }
    }

    public final boolean e() {
        if (!this.f1466k) {
            return false;
        }
        Image acquireLatestImage = this.f1461f.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f1462g;
            if (image != null) {
                image.close();
                this.f1462g = null;
            }
            this.f1462g = acquireLatestImage;
            invalidate();
        }
        if (acquireLatestImage != null) {
            return true;
        }
        return false;
    }

    public final void g(int i3, int i4) {
        if (this.f1464i != null) {
            if (i3 != this.f1461f.getWidth() || i4 != this.f1461f.getHeight()) {
                Image image = this.f1462g;
                if (image != null) {
                    image.close();
                    this.f1462g = null;
                }
                this.f1461f.close();
                this.f1461f = f(i3, i4);
            }
        }
    }

    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1464i;
    }

    public ImageReader getImageReader() {
        return this.f1461f;
    }

    public Surface getSurface() {
        return this.f1461f.getSurface();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f1462g;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer f3 = image.getHardwareBuffer();
                this.f1463h = Bitmap.wrapHardwareBuffer(f3, ColorSpace.get(ColorSpace.Named.SRGB));
                f3.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f1462g.getHeight();
                    Bitmap bitmap = this.f1463h;
                    if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f1463h.getHeight() == height)) {
                        this.f1463h = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f1463h.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f1463h;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        if (!(i3 == this.f1461f.getWidth() && i4 == this.f1461f.getHeight()) && this.f1465j == 1 && this.f1466k) {
            g(i3, i4);
            io.flutter.embedding.engine.renderer.h hVar = this.f1464i;
            Surface surface = this.f1461f.getSurface();
            hVar.f3310b = surface;
            hVar.f3309a.onSurfaceWindowChanged(surface);
        }
    }

    public final void a() {
    }

    public final void d() {
    }
}
