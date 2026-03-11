package s1;

import a.C0094a;
import android.content.Context;
import android.support.v4.media.session.a;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: s1.l  reason: case insensitive filesystem */
public final /* synthetic */ class C0451l implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4572f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f4573g;

    public /* synthetic */ C0451l(FirebaseMessaging firebaseMessaging, int i3) {
        this.f4572f = i3;
        this.f4573g = firebaseMessaging;
    }

    public final void run() {
        switch (this.f4572f) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.f4573g;
                if (firebaseMessaging.f2867e.b()) {
                    firebaseMessaging.k();
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging2 = this.f4573g;
                Context context = firebaseMessaging2.f2864b;
                C0094a.G(context);
                a.B(context, firebaseMessaging2.f2865c, firebaseMessaging2.j());
                if (firebaseMessaging2.j()) {
                    firebaseMessaging2.g();
                    return;
                }
                return;
        }
    }
}
