package io.flutter.plugins.firebase.messaging;

import C0.f;
import a.C0094a;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import u1.C0496c;

public class FlutterFirebaseMessagingBackgroundService extends a {

    /* renamed from: m  reason: collision with root package name */
    public static final List f3426m = Collections.synchronizedList(new LinkedList());

    /* renamed from: n  reason: collision with root package name */
    public static f f3427n;

    public final void onCreate() {
        super.onCreate();
        if (f3427n == null) {
            f3427n = new f(16);
        }
        f fVar = f3427n;
        if (!((AtomicBoolean) fVar.f128h).get()) {
            long j3 = C0094a.f1971k.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0);
            if (j3 != 0) {
                fVar.Z(j3, (C0496c) null);
            }
        }
    }
}
