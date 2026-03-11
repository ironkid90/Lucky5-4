package s1;

import L1.h;
import X0.g;
import Y0.a;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;

/* renamed from: s1.k  reason: case insensitive filesystem */
public final class C0450k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f4571f = new ArrayDeque(10);

    public final void a(Intent intent) {
        boolean z3;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = this.f4571f;
                    if (!arrayDeque.contains(string)) {
                        arrayDeque.add(string);
                    } else {
                        return;
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e2) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e2);
        }
        if (bundle == null) {
            z3 = false;
        } else {
            z3 = "1".equals(bundle.getString("google.c.a.e"));
        }
        if (z3) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    g d3 = g.d();
                    d3.a();
                    if (d3.f1939d.a(a.class) == null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    } else {
                        throw new ClassCastException();
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            M0.a.C("_no", bundle);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new h(11, this, intent));
            } else {
                a(intent);
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
