package F0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: j  reason: collision with root package name */
    public static final c f298j = new c();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f299f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f300g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f301h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f302i = false;

    public static void a(Application application) {
        c cVar = f298j;
        synchronized (cVar) {
            try {
                if (!cVar.f302i) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f302i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z3) {
        synchronized (f298j) {
            try {
                Iterator it = this.f301h.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f300g;
        boolean compareAndSet = this.f299f.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f300g;
        boolean compareAndSet = this.f299f.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onTrimMemory(int i3) {
        if (i3 == 20 && this.f299f.compareAndSet(false, true)) {
            this.f300g.set(true);
            b(true);
        }
    }

    public final void onLowMemory() {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
