package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B0.a;
import C0.f;
import L1.h;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import r0.i;
import r0.o;
import x0.C0514f;
import x0.j;

public class JobInfoSchedulerService extends JobService {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f2821f = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i3 = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        o.b(getApplicationContext());
        f a2 = i.a();
        a2.W(string);
        a2.f129i = a.b(i3);
        if (string2 != null) {
            a2.f128h = Base64.decode(string2, 0);
        }
        j jVar = o.a().f4446d;
        i u3 = a2.u();
        h hVar = new h(13, this, jobParameters);
        jVar.getClass();
        jVar.f4796e.execute(new C0514f(jVar, u3, i4, hVar));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
