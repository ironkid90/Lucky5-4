package I2;

import A2.i;
import android.support.v4.media.session.a;
import r2.C0418b;
import r2.C0423g;
import r2.C0424h;
import r2.C0425i;
import r2.C0426j;
import z2.p;

public final class l0 implements C0423g, C0424h {

    /* renamed from: f  reason: collision with root package name */
    public static final l0 f768f = new Object();

    public final C0425i c(C0424h hVar) {
        return a.y(this, hVar);
    }

    public final C0425i d(C0425i iVar) {
        i.e(iVar, "context");
        if (iVar == C0426j.f4457f) {
            return this;
        }
        return (C0425i) iVar.e(this, new C0418b(1));
    }

    public final Object e(Object obj, p pVar) {
        return pVar.i(obj, this);
    }

    public final C0423g n(C0424h hVar) {
        return a.s(this, hVar);
    }

    public final C0424h getKey() {
        return this;
    }
}
