package i2;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.util.Log;

/* renamed from: i2.m  reason: case insensitive filesystem */
public final class C0232m implements C0230k {

    /* renamed from: a  reason: collision with root package name */
    public final JobWorkItem f3268a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0233n f3269b;

    public C0232m(C0233n nVar, JobWorkItem jobWorkItem) {
        this.f3269b = nVar;
        this.f3268a = jobWorkItem;
    }

    public final void a() {
        synchronized (this.f3269b.f3271b) {
            JobParameters jobParameters = this.f3269b.f3272c;
            if (jobParameters != null) {
                try {
                    jobParameters.completeWork(this.f3268a);
                } catch (SecurityException e2) {
                    Log.e("JobServiceEngineImpl", "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e2);
                } catch (IllegalArgumentException e3) {
                    Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e3);
                }
            }
        }
    }

    public final Intent getIntent() {
        return this.f3268a.getIntent();
    }
}
