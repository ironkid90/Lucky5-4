package j1;

import X0.g;
import a1.d;
import a1.q;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
import u1.C0495b;

/* renamed from: j1.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0263b implements d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3838f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q f3839g;

    public /* synthetic */ C0263b(q qVar, int i3) {
        this.f3838f = i3;
        this.f3839g = qVar;
    }

    public final Object a(T1.d dVar) {
        switch (this.f3838f) {
            case 0:
                return new d((Context) dVar.a(Context.class), ((g) dVar.a(g.class)).f(), dVar.e(q.a(e.class)), dVar.b(C0495b.class), (Executor) dVar.d(this.f3839g));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f3839g, dVar);
        }
    }
}
