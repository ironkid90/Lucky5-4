package i2;

import C0.f;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import io.flutter.plugins.firebase.messaging.a;

/* renamed from: i2.n  reason: case insensitive filesystem */
public final class C0233n extends JobServiceEngine {

    /* renamed from: a  reason: collision with root package name */
    public final a f3270a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3271b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public JobParameters f3272c;

    public C0233n(a aVar) {
        super(aVar);
        this.f3270a = aVar;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.f3272c = jobParameters;
        this.f3270a.a(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        f fVar = this.f3270a.f3433h;
        if (fVar != null) {
            ((a) fVar.f129i).c();
        }
        synchronized (this.f3271b) {
            this.f3272c = null;
        }
        return true;
    }
}
