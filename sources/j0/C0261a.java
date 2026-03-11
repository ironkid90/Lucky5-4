package j0;

import G0.f;
import S1.C0078d;
import T1.d;
import Y1.b;
import Z1.a;
import android.content.Context;
import c2.n;
import c2.o;
import c2.q;
import j1.e;
import java.util.HashSet;

/* renamed from: j0.a  reason: case insensitive filesystem */
public final class C0261a implements b, a {

    /* renamed from: f  reason: collision with root package name */
    public b f3828f;

    /* renamed from: g  reason: collision with root package name */
    public q f3829g;

    /* renamed from: h  reason: collision with root package name */
    public Z1.b f3830h;

    public final void onAttachedToActivity(Z1.b bVar) {
        d dVar = (d) bVar;
        C0078d dVar2 = (C0078d) dVar.f1703a;
        b bVar2 = this.f3828f;
        if (bVar2 != null) {
            bVar2.f3833h = dVar2;
        }
        this.f3830h = bVar;
        dVar.g(bVar2);
        Z1.b bVar3 = this.f3830h;
        ((HashSet) ((d) bVar3).f1704b).add(this.f3828f);
    }

    public final void onAttachedToEngine(Y1.a aVar) {
        Context context = aVar.f1964a;
        this.f3828f = new b(context);
        q qVar = new q(aVar.f1965b, "flutter.baseflow.com/permissions/methods");
        this.f3829g = qVar;
        qVar.b(new n(context, new f(12), this.f3828f, new e(12)));
    }

    public final void onDetachedFromActivity() {
        b bVar = this.f3828f;
        if (bVar != null) {
            bVar.f3833h = null;
        }
        Z1.b bVar2 = this.f3830h;
        if (bVar2 != null) {
            ((HashSet) ((d) bVar2).f1705c).remove(bVar);
            Z1.b bVar3 = this.f3830h;
            ((HashSet) ((d) bVar3).f1704b).remove(this.f3828f);
        }
        this.f3830h = null;
    }

    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public final void onDetachedFromEngine(Y1.a aVar) {
        this.f3829g.b((o) null);
        this.f3829g = null;
    }

    public final void onReattachedToActivityForConfigChanges(Z1.b bVar) {
        onAttachedToActivity(bVar);
    }
}
