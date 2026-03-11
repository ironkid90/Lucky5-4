package androidx.lifecycle;

import A2.i;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public abstract class a implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        i.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        i.e(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        i.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        i.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        i.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        i.e(activity, "activity");
    }
}
