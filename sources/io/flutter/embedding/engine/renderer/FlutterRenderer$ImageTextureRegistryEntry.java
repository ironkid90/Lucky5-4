package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.io.IOException;

@Keep
final class FlutterRenderer$ImageTextureRegistryEntry implements TextureRegistry$ImageTextureEntry, TextureRegistry$ImageConsumer {
    private static final String TAG = "ImageTextureRegistryEntry";
    private final long id;
    private boolean ignoringFence = false;
    private Image image;
    private boolean released;
    final /* synthetic */ h this$0;

    public FlutterRenderer$ImageTextureRegistryEntry(h hVar, long j3) {
        this.this$0 = hVar;
        this.id = j3;
    }

    private void maybeWaitOnFence(Image image2) {
        if (image2 == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image2);
        } else {
            this.ignoringFence = true;
        }
    }

    private void waitOnFence(Image image2) {
        try {
            image2.getFence().awaitForever();
        } catch (IOException unused) {
        }
    }

    public Image acquireLatestImage() {
        Image image2;
        synchronized (this) {
            image2 = this.image;
            this.image = null;
        }
        maybeWaitOnFence(image2);
        return image2;
    }

    public void finalize() {
        try {
            if (this.released) {
                super.finalize();
                return;
            }
            Image image2 = this.image;
            if (image2 != null) {
                image2.close();
                this.image = null;
            }
            this.released = true;
            h hVar = this.this$0;
            hVar.f3312d.post(new f(this.id, hVar.f3309a));
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public long id() {
        return this.id;
    }

    public void pushImage(Image image2) {
        Image image3;
        if (!this.released) {
            synchronized (this) {
                image3 = this.image;
                this.image = image2;
            }
            if (image3 != null) {
                Log.e(TAG, "Dropping PlatformView Frame");
                image3.close();
            }
            if (image2 != null) {
                this.this$0.f3309a.scheduleFrame();
            }
        }
    }

    public void release() {
        if (!this.released) {
            this.released = true;
            Image image2 = this.image;
            if (image2 != null) {
                image2.close();
                this.image = null;
            }
            h hVar = this.this$0;
            hVar.f3309a.unregisterTexture(this.id);
        }
    }
}
