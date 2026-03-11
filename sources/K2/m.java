package K2;

import A2.r;
import H0.b;
import I2.m0;
import N2.a;
import p2.C0368h;
import r2.C0420d;
import z2.l;

public final class m extends b {

    /* renamed from: q  reason: collision with root package name */
    public final int f905q;

    public m(int i3, int i4, l lVar) {
        super(i3, lVar);
        this.f905q = i4;
        if (i4 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + r.a(b.class).b() + " instead").toString());
        } else if (i3 < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i3 + " was specified").toString());
        }
    }

    public final Object D(Object obj, boolean z3) {
        j jVar;
        m0 m0Var;
        l lVar;
        b b3;
        C0368h hVar = C0368h.f4194a;
        if (this.f905q == 3) {
            Object i3 = super.i(obj);
            if (!(i3 instanceof h) || (i3 instanceof g)) {
                return i3;
            }
            if (!z3 || (lVar = this.f876g) == null || (b3 = a.b(lVar, obj, (b) null)) == null) {
                return hVar;
            }
            throw b3;
        }
        Object obj2 = obj;
        B.m mVar = d.f881d;
        j jVar2 = (j) b.f870l.get(this);
        while (true) {
            long andIncrement = b.f866h.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean r3 = r(andIncrement, false);
            int i4 = d.f879b;
            long j4 = (long) i4;
            long j5 = j3 / j4;
            int i5 = (int) (j3 % j4);
            if (jVar2.f1221h != j5) {
                j b4 = b.b(this, j5, jVar2);
                if (b4 != null) {
                    jVar = b4;
                } else if (r3) {
                    return new g(o());
                } else {
                    Object obj3 = obj;
                }
            } else {
                jVar = jVar2;
            }
            long j6 = j4;
            int i6 = i4;
            int d3 = b.d(this, jVar, i5, obj, j3, mVar, r3);
            if (d3 == 0) {
                jVar.a();
                return hVar;
            } else if (d3 == 1) {
                return hVar;
            } else {
                if (d3 != 2) {
                    if (d3 == 3) {
                        throw new IllegalStateException("unexpected");
                    } else if (d3 != 4) {
                        if (d3 == 5) {
                            jVar.a();
                        }
                        Object obj4 = obj;
                        jVar2 = jVar;
                    } else {
                        if (j3 < b.f867i.get(this)) {
                            jVar.a();
                        }
                        return new g(o());
                    }
                } else if (r3) {
                    jVar.h();
                    return new g(o());
                } else {
                    if (mVar instanceof m0) {
                        m0Var = (m0) mVar;
                    } else {
                        m0Var = null;
                    }
                    if (m0Var != null) {
                        m0Var.a(jVar, i5 + i6);
                    }
                    h((jVar.f1221h * j6) + ((long) i5));
                    return hVar;
                }
            }
        }
    }

    public final Object i(Object obj) {
        return D(obj, false);
    }

    public final Object l(Object obj, C0420d dVar) {
        b b3;
        if (!(D(obj, true) instanceof g)) {
            return C0368h.f4194a;
        }
        l lVar = this.f876g;
        if (lVar == null || (b3 = a.b(lVar, obj, (b) null)) == null) {
            throw o();
        }
        android.support.v4.media.session.a.c(b3, o());
        throw b3;
    }

    public final boolean t() {
        if (this.f905q == 2) {
            return true;
        }
        return false;
    }
}
