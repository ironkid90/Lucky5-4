package androidx.lifecycle;

import A2.i;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

public final class g extends a {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        int i3 = w.f2545g;
        if (Build.VERSION.SDK_INT >= 29) {
            v.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new v());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
