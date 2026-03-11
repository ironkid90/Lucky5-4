package i2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: i2.o  reason: case insensitive filesystem */
public final class C0234o extends C0235p {

    /* renamed from: d  reason: collision with root package name */
    public final JobInfo f3273d;

    /* renamed from: e  reason: collision with root package name */
    public final JobScheduler f3274e;

    public C0234o(Context context, ComponentName componentName, int i3) {
        super(componentName);
        b(i3);
        this.f3273d = new JobInfo.Builder(i3, componentName).setOverrideDeadline(0).build();
        this.f3274e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    public final void a(Intent intent) {
        this.f3274e.enqueue(this.f3273d, C0231l.d(intent));
    }
}
