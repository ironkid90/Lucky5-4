package s1;

import C0.a;
import W0.e;
import com.google.firebase.messaging.FirebaseMessaging;
import d2.C0152a;

/* renamed from: s1.m  reason: case insensitive filesystem */
public final /* synthetic */ class C0452m implements e {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4574f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f4575g;

    public /* synthetic */ C0452m(FirebaseMessaging firebaseMessaging, int i3) {
        this.f4574f = i3;
        this.f4575g = firebaseMessaging;
    }

    public final void d(Object obj) {
        FirebaseMessaging firebaseMessaging = this.f4575g;
        switch (this.f4574f) {
            case 0:
                C0433F f3 = (C0433F) obj;
                if (firebaseMessaging.f2867e.b()) {
                    f3.f();
                    return;
                }
                return;
            default:
                a aVar = (a) obj;
                C0152a aVar2 = FirebaseMessaging.f2860l;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    M0.a.B(aVar.f107a);
                    firebaseMessaging.g();
                    return;
                }
                return;
        }
    }
}
