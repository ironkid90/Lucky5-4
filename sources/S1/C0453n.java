package s1;

import W0.g;
import W0.p;
import com.google.firebase.messaging.FirebaseMessaging;
import d2.C0152a;

/* renamed from: s1.n  reason: case insensitive filesystem */
public final /* synthetic */ class C0453n implements g {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4576f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f4577g;

    public /* synthetic */ C0453n(String str, int i3) {
        this.f4576f = i3;
        this.f4577g = str;
    }

    public final p a(Object obj) {
        String str = this.f4577g;
        C0433F f3 = (C0433F) obj;
        switch (this.f4576f) {
            case 0:
                C0152a aVar = FirebaseMessaging.f2860l;
                f3.getClass();
                p d3 = f3.d(new C0430C("S", str));
                f3.f();
                return d3;
            default:
                C0152a aVar2 = FirebaseMessaging.f2860l;
                f3.getClass();
                p d4 = f3.d(new C0430C("U", str));
                f3.f();
                return d4;
        }
    }
}
