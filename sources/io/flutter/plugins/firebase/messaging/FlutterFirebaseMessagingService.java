package io.flutter.plugins.firebase.messaging;

import androidx.lifecycle.o;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    public final void c(String str) {
        if (o.f2525m == null) {
            o.f2525m = new o();
        }
        o.f2525m.d(str);
    }
}
