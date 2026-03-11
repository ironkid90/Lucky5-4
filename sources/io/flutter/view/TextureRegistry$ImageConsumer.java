package io.flutter.view;

import android.media.Image;
import androidx.annotation.Keep;

@Keep
public interface TextureRegistry$ImageConsumer {
    Image acquireLatestImage();
}
