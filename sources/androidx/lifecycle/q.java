package androidx.lifecycle;

import A2.i;
import android.app.Activity;
import android.app.Application;

public abstract class q {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        i.e(activity, "activity");
        i.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
