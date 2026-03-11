package io.flutter.plugins.firebase.messaging;

import M0.a;
import a1.C0096a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

@Keep
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    public List<C0096a> getComponents() {
        return Collections.singletonList(a.f("flutter-fire-fcm", "15.2.10"));
    }
}
