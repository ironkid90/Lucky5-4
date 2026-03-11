package androidx.lifecycle;

import A2.i;
import V.a;
import V.b;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import q2.l;

public final class ProcessLifecycleInitializer implements b {
    public final List a() {
        return l.f4396f;
    }

    public final Object b(Context context) {
        i.e(context, "context");
        a c3 = a.c(context);
        i.d(c3, "getInstance(context)");
        if (c3.f1852b.contains(ProcessLifecycleInitializer.class)) {
            if (!h.f2506a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new g());
            }
            t tVar = t.f2536n;
            tVar.getClass();
            tVar.f2541j = new Handler();
            tVar.f2542k.d(d.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new s(tVar));
            return tVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
