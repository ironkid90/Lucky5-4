package s1;

import W0.p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.session.a;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* renamed from: s1.r  reason: case insensitive filesystem */
public final class C0457r implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public final URL f4586f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Future f4587g;

    /* renamed from: h  reason: collision with root package name */
    public p f4588h;

    public C0457r(URL url) {
        this.f4586f = url;
    }

    public final Bitmap a() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f4586f;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] D3 = a.D(new C0443d(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + D3.length + " bytes from " + url);
                }
                if (D3.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(D3, 0, D3.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public final void close() {
        this.f4587g.cancel(true);
    }
}
