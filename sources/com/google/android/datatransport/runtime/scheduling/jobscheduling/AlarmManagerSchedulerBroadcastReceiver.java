package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B0.a;
import C0.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import r0.i;
import r0.o;
import x0.C0514f;
import x0.j;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2820a = 0;

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i3 = intent.getExtras().getInt("attemptNumber");
        o.b(context);
        f a2 = i.a();
        a2.W(queryParameter);
        a2.f129i = a.b(intValue);
        if (queryParameter2 != null) {
            a2.f128h = Base64.decode(queryParameter2, 0);
        }
        j jVar = o.a().f4446d;
        i u3 = a2.u();
        ? obj = new Object();
        jVar.getClass();
        jVar.f4796e.execute(new C0514f(jVar, u3, i3, obj));
    }
}
