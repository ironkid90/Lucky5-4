package I2;

import N2.a;
import N2.t;
import p2.C0363c;
import r2.C0420d;
import r2.C0425i;

public final class k0 extends t {

    /* renamed from: j  reason: collision with root package name */
    public final ThreadLocal f767j;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k0(r2.C0425i r3, t2.C0488f r4) {
        /*
            r2 = this;
            I2.l0 r0 = I2.l0.f768f
            r2.g r1 = r3.n(r0)
            if (r1 != 0) goto L_0x000d
            r2.i r0 = r3.d(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r4, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f767j = r0
            r2.i r4 = r4.f4684g
            A2.i.b(r4)
            r2.e r0 = r2.C0421e.f4456f
            r2.g r4 = r4.n(r0)
            boolean r4 = r4 instanceof I2.C0067s
            if (r4 != 0) goto L_0x0032
            r4 = 0
            java.lang.Object r4 = N2.a.m(r3, r4)
            N2.a.h(r3, r4)
            r2.Y(r3, r4)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.k0.<init>(r2.i, t2.f):void");
    }

    public final boolean X() {
        boolean z3;
        if (!this.threadLocalIsSet || this.f767j.get() != null) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f767j.remove();
        return !z3;
    }

    public final void Y(C0425i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f767j.set(new C0363c(iVar, obj));
    }

    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            C0363c cVar = (C0363c) this.f767j.get();
            if (cVar != null) {
                a.h((C0425i) cVar.f4187f, cVar.f4188g);
            }
            this.f767j.remove();
        }
        Object i3 = C0071w.i(obj);
        C0420d dVar = this.f1219i;
        C0425i h3 = dVar.h();
        k0 k0Var = null;
        Object m3 = a.m(h3, k0Var);
        if (m3 != a.f1184f) {
            k0Var = C0071w.n(dVar, h3, m3);
        }
        try {
            this.f1219i.m(i3);
        } finally {
            if (k0Var == null || k0Var.X()) {
                a.h(h3, m3);
            }
        }
    }
}
