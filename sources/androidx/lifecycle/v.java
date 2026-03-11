package androidx.lifecycle;

import A2.i;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v4.media.session.a;

public final class v implements Application.ActivityLifecycleCallbacks {
    public static final u Companion = new Object();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        i.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new v());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        i.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        i.e(activity, "activity");
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        int i3 = w.f2545g;
        a.o(activity, d.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        i.e(activity, "activity");
        int i3 = w.f2545g;
        a.o(activity, d.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        i.e(activity, "activity");
        int i3 = w.f2545g;
        a.o(activity, d.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        i.e(activity, "activity");
        int i3 = w.f2545g;
        a.o(activity, d.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        i.e(activity, "activity");
        int i3 = w.f2545g;
        a.o(activity, d.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        i.e(activity, "activity");
        int i3 = w.f2545g;
        a.o(activity, d.ON_STOP);
    }

    public void onActivityResumed(Activity activity) {
        i.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        i.e(bundle, "bundle");
    }

    public void onActivityStarted(Activity activity) {
        i.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        i.e(activity, "activity");
    }
}
