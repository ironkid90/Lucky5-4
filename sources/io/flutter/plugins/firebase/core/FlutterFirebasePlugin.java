package io.flutter.plugins.firebase.core;

import W0.h;
import X0.g;
import androidx.annotation.Keep;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Keep
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    h didReinitializeFirebaseCore();

    h getPluginConstantsForFirebaseApp(g gVar);
}
