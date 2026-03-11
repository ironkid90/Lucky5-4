package L1;

import S1.C0078d;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import o1.b;

public final class l implements j {

    /* renamed from: a  reason: collision with root package name */
    public int f964a;

    /* renamed from: b  reason: collision with root package name */
    public Object f965b;

    /* renamed from: c  reason: collision with root package name */
    public Object f966c;

    public b a() {
        String str;
        if (((Long) this.f966c) == null) {
            str = " tokenExpirationTimestamp";
        } else {
            str = "";
        }
        if (str.isEmpty()) {
            return new b(((Long) this.f966c).longValue(), (String) this.f965b, this.f964a);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void b() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f964a);
        this.f965b = handlerThread;
        handlerThread.start();
        this.f966c = new Handler(((HandlerThread) this.f965b).getLooper());
    }

    public void c(g gVar) {
        ((Handler) this.f966c).post(gVar.f947b);
    }

    public void e() {
        HandlerThread handlerThread = (HandlerThread) this.f965b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f965b = null;
            this.f966c = null;
        }
    }

    public int f() {
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        int i3 = this.f964a;
        View findViewById = ((C0078d) this.f965b).findViewById(i3);
        if (findViewById != null) {
            return findViewById.getContentSensitivity();
        }
        throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
    }

    public void g(int i3) {
        if (Build.VERSION.SDK_INT >= 35) {
            int i4 = this.f964a;
            View findViewById = ((C0078d) this.f965b).findViewById(i4);
            if (findViewById == null) {
                throw new IllegalArgumentException("FlutterView with ID " + i4 + "not found");
            } else if (findViewById.getContentSensitivity() != i3) {
                findViewById.setContentSensitivity(i3);
                findViewById.invalidate();
            }
        } else {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
    }
}
