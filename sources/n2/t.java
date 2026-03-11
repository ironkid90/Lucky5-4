package N2;

import I2.C0050a;
import I2.C0071w;
import M0.a;
import r2.C0420d;
import r2.C0425i;
import t2.C0485c;
import z2.l;

public class t extends C0050a implements C0485c {

    /* renamed from: i  reason: collision with root package name */
    public final C0420d f1219i;

    public t(C0420d dVar, C0425i iVar) {
        super(iVar, true);
        this.f1219i = dVar;
    }

    public final boolean J() {
        return true;
    }

    public final C0485c g() {
        C0420d dVar = this.f1219i;
        if (dVar instanceof C0485c) {
            return (C0485c) dVar;
        }
        return null;
    }

    public void q(Object obj) {
        a.i(a.y(this.f1219i), C0071w.i(obj), (l) null);
    }

    public void r(Object obj) {
        this.f1219i.m(C0071w.i(obj));
    }
}
