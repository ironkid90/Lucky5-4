package io.flutter.view;

import android.view.Choreographer;

public final class q implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public long f3564a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f3565b;

    public q(r rVar, long j3) {
        this.f3565b = rVar;
        this.f3564a = j3;
    }

    public final void doFrame(long j3) {
        long j4;
        long nanoTime = System.nanoTime() - j3;
        if (nanoTime < 0) {
            j4 = 0;
        } else {
            j4 = nanoTime;
        }
        r rVar = this.f3565b;
        rVar.f3569b.onVsync(j4, rVar.f3568a, this.f3564a);
        rVar.f3570c = this;
    }
}
