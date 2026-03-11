package L1;

import android.os.Handler;
import android.os.HandlerThread;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f951a;

    /* renamed from: b  reason: collision with root package name */
    public final int f952b;

    /* renamed from: c  reason: collision with root package name */
    public HandlerThread f953c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f954d;

    /* renamed from: e  reason: collision with root package name */
    public h f955e;

    /* renamed from: f  reason: collision with root package name */
    public g f956f;

    public i(String str, int i3) {
        this.f951a = str;
        this.f952b = i3;
    }

    public final synchronized void a(h hVar) {
        HandlerThread handlerThread = new HandlerThread(this.f951a, this.f952b);
        this.f953c = handlerThread;
        handlerThread.start();
        this.f954d = new Handler(this.f953c.getLooper());
        this.f955e = hVar;
    }
}
