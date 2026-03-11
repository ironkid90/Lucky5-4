package I;

import A2.j;
import K.d;
import K.e;
import K.h;
import R2.l;
import java.util.LinkedHashSet;
import z2.a;

/* renamed from: I.m  reason: case insensitive filesystem */
public final class C0037m extends j implements a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f653g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ P f654h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0037m(P p3, int i3) {
        super(0);
        this.f653g = i3;
        this.f654h = p3;
    }

    public final Object a() {
        switch (this.f653g) {
            case 0:
                return ((h) this.f654h.f577o.a()).f841c;
            default:
                e eVar = this.f654h.f568f;
                String n3 = ((l) eVar.f825d.a()).f1394f.n();
                synchronized (e.f821f) {
                    LinkedHashSet linkedHashSet = e.f820e;
                    if (!linkedHashSet.contains(n3)) {
                        linkedHashSet.add(n3);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + n3 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new h(eVar.f822a, (l) eVar.f825d.a(), (Z) eVar.f823b.i((l) eVar.f825d.a(), eVar.f822a), new d(eVar, 1));
        }
    }
}
