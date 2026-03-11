package androidx.lifecycle;

import A2.i;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public final class s extends a {
    final /* synthetic */ t this$0;

    public s(t tVar) {
        this.this$0 = tVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = w.f2545g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((w) findFragmentByTag).f2546f = this.this$0.f2544m;
        }
    }

    public void onActivityPaused(Activity activity) {
        i.e(activity, "activity");
        t tVar = this.this$0;
        int i3 = tVar.f2538g - 1;
        tVar.f2538g = i3;
        if (i3 == 0) {
            Handler handler = tVar.f2541j;
            i.b(handler);
            handler.postDelayed(tVar.f2543l, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        q.a(activity, new r(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        i.e(activity, "activity");
        t tVar = this.this$0;
        int i3 = tVar.f2537f - 1;
        tVar.f2537f = i3;
        if (i3 == 0 && tVar.f2539h) {
            tVar.f2542k.d(d.ON_STOP);
            tVar.f2540i = true;
        }
    }
}
