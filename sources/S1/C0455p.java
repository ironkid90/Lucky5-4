package s1;

import T1.d;
import W0.i;
import X0.g;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.media.session.a;
import com.google.firebase.messaging.FirebaseMessaging;
import d2.C0152a;

/* renamed from: s1.p  reason: case insensitive filesystem */
public final /* synthetic */ class C0455p implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4582f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f4583g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f4584h;

    public /* synthetic */ C0455p(FirebaseMessaging firebaseMessaging, i iVar, int i3) {
        this.f4582f = i3;
        this.f4583g = firebaseMessaging;
        this.f4584h = iVar;
    }

    public final void run() {
        switch (this.f4582f) {
            case 0:
                i iVar = this.f4584h;
                C0152a aVar = FirebaseMessaging.f2860l;
                try {
                    iVar.b(this.f4583g.a());
                    return;
                } catch (Exception e2) {
                    iVar.a(e2);
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging = this.f4583g;
                i iVar2 = this.f4584h;
                C0152a aVar2 = FirebaseMessaging.f2860l;
                try {
                    d dVar = firebaseMessaging.f2865c;
                    dVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    a.d(dVar.l(dVar.p(C0458s.b((g) dVar.f1703a), "*", bundle)));
                    C0152a d3 = FirebaseMessaging.d(firebaseMessaging.f2864b);
                    String e3 = firebaseMessaging.e();
                    String b3 = C0458s.b(firebaseMessaging.f2863a);
                    synchronized (d3) {
                        String c3 = C0152a.c(e3, b3);
                        SharedPreferences.Editor edit = ((SharedPreferences) d3.f2912g).edit();
                        edit.remove(c3);
                        edit.commit();
                    }
                    iVar2.b((Object) null);
                    return;
                } catch (Exception e4) {
                    iVar2.a(e4);
                    return;
                }
        }
    }
}
