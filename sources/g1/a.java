package G1;

import A2.i;
import D0.g;
import L2.p;
import S1.C0078d;
import T1.d;
import Y1.b;
import android.content.Context;
import android.content.Intent;
import c2.f;
import c2.o;
import c2.q;
import c2.t;
import java.util.HashSet;

public final class a implements b, Z1.a, t {

    /* renamed from: f  reason: collision with root package name */
    public J1.b f470f;

    /* renamed from: g  reason: collision with root package name */
    public g f471g;

    /* renamed from: h  reason: collision with root package name */
    public Z1.b f472h;

    /* renamed from: i  reason: collision with root package name */
    public b f473i;

    public final g a() {
        g gVar = this.f471g;
        if (gVar != null) {
            return gVar;
        }
        i.g("foregroundServiceManager");
        throw null;
    }

    public final void onAttachedToActivity(Z1.b bVar) {
        i.e(bVar, "binding");
        b bVar2 = this.f473i;
        if (bVar2 != null) {
            d dVar = (d) bVar;
            C0078d dVar2 = (C0078d) dVar.f1703a;
            bVar2.f477i = dVar2;
            J1.b bVar3 = this.f470f;
            if (bVar3 != null) {
                ((HashSet) dVar.f1704b).add(bVar3);
                b bVar4 = this.f473i;
                if (bVar4 != null) {
                    dVar.g(bVar4);
                    ((HashSet) dVar.f1706d).add(this);
                    this.f472h = bVar;
                    Intent intent = dVar2.getIntent();
                    p pVar = J1.a.f802f;
                    android.support.v4.media.session.a.x(intent);
                    return;
                }
                i.g("methodCallHandler");
                throw null;
            }
            i.g("notificationPermissionManager");
            throw null;
        }
        i.g("methodCallHandler");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [J1.b, java.lang.Object] */
    public final void onAttachedToEngine(Y1.a aVar) {
        i.e(aVar, "binding");
        this.f470f = new Object();
        this.f471g = new g(3, false);
        Context context = aVar.f1964a;
        i.d(context, "getApplicationContext(...)");
        b bVar = new b(context, this);
        this.f473i = bVar;
        f fVar = aVar.f1965b;
        i.d(fVar, "getBinaryMessenger(...)");
        q qVar = new q(fVar, "flutter_foreground_task/methods");
        bVar.f476h = qVar;
        qVar.b(bVar);
    }

    public final void onDetachedFromActivity() {
        Z1.b bVar = this.f472h;
        if (bVar != null) {
            J1.b bVar2 = this.f470f;
            if (bVar2 != null) {
                ((HashSet) ((d) bVar).f1704b).remove(bVar2);
            } else {
                i.g("notificationPermissionManager");
                throw null;
            }
        }
        Z1.b bVar3 = this.f472h;
        if (bVar3 != null) {
            b bVar4 = this.f473i;
            if (bVar4 != null) {
                ((HashSet) ((d) bVar3).f1705c).remove(bVar4);
            } else {
                i.g("methodCallHandler");
                throw null;
            }
        }
        Z1.b bVar5 = this.f472h;
        if (bVar5 != null) {
            ((HashSet) ((d) bVar5).f1706d).remove(this);
        }
        this.f472h = null;
        b bVar6 = this.f473i;
        if (bVar6 != null) {
            bVar6.f477i = null;
        } else {
            i.g("methodCallHandler");
            throw null;
        }
    }

    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public final void onDetachedFromEngine(Y1.a aVar) {
        i.e(aVar, "binding");
        b bVar = this.f473i;
        if (bVar == null) {
            return;
        }
        if (bVar != null) {
            q qVar = bVar.f476h;
            if (qVar != null) {
                qVar.b((o) null);
                return;
            }
            return;
        }
        i.g("methodCallHandler");
        throw null;
    }

    public final boolean onNewIntent(Intent intent) {
        i.e(intent, "intent");
        p pVar = J1.a.f802f;
        android.support.v4.media.session.a.x(intent);
        return true;
    }

    public final void onReattachedToActivityForConfigChanges(Z1.b bVar) {
        i.e(bVar, "binding");
        onAttachedToActivity(bVar);
    }
}
