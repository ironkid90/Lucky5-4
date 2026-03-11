package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static r f3566e;

    /* renamed from: f  reason: collision with root package name */
    public static p f3567f;

    /* renamed from: a  reason: collision with root package name */
    public long f3568a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f3569b;

    /* renamed from: c  reason: collision with root package name */
    public q f3570c = new q(this, 0);

    /* renamed from: d  reason: collision with root package name */
    public final a f3571d = new a(this);

    public r(FlutterJNI flutterJNI) {
        this.f3569b = flutterJNI;
    }

    public static r a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f3566e == null) {
            f3566e = new r(flutterJNI);
        }
        if (f3567f == null) {
            r rVar = f3566e;
            Objects.requireNonNull(rVar);
            p pVar = new p(rVar, displayManager);
            f3567f = pVar;
            displayManager.registerDisplayListener(pVar, (Handler) null);
        }
        if (f3566e.f3568a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f3566e.f3568a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f3566e;
    }
}
