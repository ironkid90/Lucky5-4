package I2;

import A2.t;
import H0.b;
import L.j;
import android.support.v4.media.session.a;
import p2.C0365e;
import p2.C0368h;
import r2.C0420d;
import r2.C0425i;
import s2.C0466a;
import t2.C0484b;
import z2.p;

/* renamed from: I2.a  reason: case insensitive filesystem */
public abstract class C0050a extends a0 implements C0420d, C0069u {

    /* renamed from: h  reason: collision with root package name */
    public final C0425i f749h;

    public C0050a(C0425i iVar, boolean z3) {
        super(z3);
        H((Q) iVar.n(C0068t.f786g));
        this.f749h = iVar.d(this);
    }

    public final void G(b bVar) {
        C0071w.e(bVar, this.f749h);
    }

    public final void O(Object obj) {
        boolean z3;
        if (obj instanceof C0063n) {
            C0063n nVar = (C0063n) obj;
            Throwable th = nVar.f775a;
            nVar.getClass();
            if (C0063n.f774b.get(nVar) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            U(th, z3);
            return;
        }
        V(obj);
    }

    public final void W(int i3, C0050a aVar, p pVar) {
        C0425i iVar;
        Object m3;
        int b3 = j.b(i3);
        if (b3 == 0) {
            a.C(pVar, aVar, this);
        } else if (b3 == 1) {
        } else {
            if (b3 == 2) {
                M0.a.y(((C0484b) pVar).c(aVar, this)).m(C0368h.f4194a);
            } else if (b3 == 3) {
                try {
                    iVar = this.f749h;
                    m3 = N2.a.m(iVar, (Object) null);
                    t.a(2, pVar);
                    Object i4 = pVar.i(aVar, this);
                    N2.a.h(iVar, m3);
                    if (i4 != C0466a.f4632f) {
                        m(i4);
                    }
                } catch (Throwable th) {
                    m(M0.a.h(th));
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    public final C0425i h() {
        return this.f749h;
    }

    public final C0425i j() {
        return this.f749h;
    }

    public final void m(Object obj) {
        Throwable a2 = C0365e.a(obj);
        if (a2 != null) {
            obj = new C0063n(a2, false);
        }
        Object L3 = L(obj);
        if (L3 != C0071w.f790d) {
            r(L3);
        }
    }

    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z3) {
    }
}
