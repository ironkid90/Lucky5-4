package a1;

import L.k;
import android.os.Build;
import android.os.StrictMode;
import b1.C0126a;
import b1.g;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import d2.C0152a;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import l1.C0313a;

public final /* synthetic */ class e implements C0313a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2005a;

    public /* synthetic */ e(int i3) {
        this.f2005a = i3;
    }

    public final Object get() {
        switch (this.f2005a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case k.FLOAT_FIELD_NUMBER:
                m mVar = ExecutorsRegistrar.f2853a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i3 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i3 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new g(Executors.newFixedThreadPool(4, new C0126a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f2856d.get());
            case k.INTEGER_FIELD_NUMBER:
                m mVar2 = ExecutorsRegistrar.f2853a;
                return new g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new C0126a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f2856d.get());
            case k.LONG_FIELD_NUMBER:
                m mVar3 = ExecutorsRegistrar.f2853a;
                return new g(Executors.newCachedThreadPool(new C0126a("Firebase Blocking", 11, (StrictMode.ThreadPolicy) null)), (ScheduledExecutorService) ExecutorsRegistrar.f2856d.get());
            case k.STRING_FIELD_NUMBER:
                m mVar4 = ExecutorsRegistrar.f2853a;
                return Executors.newSingleThreadScheduledExecutor(new C0126a("Firebase Scheduler", 0, (StrictMode.ThreadPolicy) null));
            default:
                C0152a aVar = FirebaseMessaging.f2860l;
                return null;
        }
    }
}
