package Q1;

import A2.i;
import F0.h;
import S1.C0078d;
import T1.d;
import Y1.b;
import c2.f;

public final class a implements b, f, Z1.a {

    /* renamed from: f  reason: collision with root package name */
    public h f1298f;

    public final void a(b bVar) {
        boolean z3;
        h hVar = this.f1298f;
        i.b(hVar);
        C0078d dVar = (C0078d) hVar.f322g;
        if (dVar != null) {
            i.b(dVar);
            if ((dVar.getWindow().getAttributes().flags & 128) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Boolean bool = bVar.f2657a;
            i.b(bool);
            if (bool.booleanValue()) {
                if (!z3) {
                    dVar.getWindow().addFlags(128);
                }
            } else if (z3) {
                dVar.getWindow().clearFlags(128);
            }
        } else {
            throw new H1.a(7);
        }
    }

    public final void onAttachedToActivity(Z1.b bVar) {
        i.e(bVar, "binding");
        h hVar = this.f1298f;
        if (hVar != null) {
            hVar.f322g = (C0078d) ((d) bVar).f1703a;
        }
    }

    public final void onAttachedToEngine(Y1.a aVar) {
        i.e(aVar, "flutterPluginBinding");
        f fVar = aVar.f1965b;
        i.d(fVar, "getBinaryMessenger(...)");
        e.a(f.f2940c, fVar, this);
        this.f1298f = new h(9);
    }

    public final void onDetachedFromActivity() {
        h hVar = this.f1298f;
        if (hVar != null) {
            hVar.f322g = null;
        }
    }

    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public final void onDetachedFromEngine(Y1.a aVar) {
        i.e(aVar, "binding");
        f fVar = aVar.f1965b;
        i.d(fVar, "getBinaryMessenger(...)");
        e.a(f.f2940c, fVar, (a) null);
        this.f1298f = null;
    }

    public final void onReattachedToActivityForConfigChanges(Z1.b bVar) {
        i.e(bVar, "binding");
        onAttachedToActivity(bVar);
    }
}
