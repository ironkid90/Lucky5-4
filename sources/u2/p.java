package U2;

import A2.i;
import C0.r;
import T2.a;
import T2.d;
import T2.e;
import T2.f;
import V2.c;
import android.os.Build;
import p2.C0363c;
import p2.C0364d;
import q2.o;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final d f1833a;

    /* renamed from: b  reason: collision with root package name */
    public final r f1834b;

    /* renamed from: c  reason: collision with root package name */
    public a f1835c;

    /* renamed from: d  reason: collision with root package name */
    public final r f1836d;

    /* renamed from: e  reason: collision with root package name */
    public h f1837e;

    /* renamed from: f  reason: collision with root package name */
    public c f1838f;

    /* renamed from: g  reason: collision with root package name */
    public float f1839g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f1840h;

    /* renamed from: i  reason: collision with root package name */
    public float f1841i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public f f1842j = f.f1746f;

    /* renamed from: k  reason: collision with root package name */
    public e f1843k = e.f1744f;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1844l = true;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1845m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1846n;

    /* renamed from: o  reason: collision with root package name */
    public int f1847o = -1;

    /* renamed from: p  reason: collision with root package name */
    public final M0.a f1848p;

    public p(d dVar, r rVar, a aVar, r rVar2) {
        b bVar;
        i.e(dVar, "ref");
        i.e(rVar2, "soundPoolManager");
        this.f1833a = dVar;
        this.f1834b = rVar;
        this.f1835c = aVar;
        this.f1836d = rVar2;
        n nVar = new n(this);
        o oVar = new o(this);
        if (Build.VERSION.SDK_INT >= 26) {
            bVar = new b(this, nVar, oVar, 1);
        } else {
            bVar = new b(this, nVar, oVar, 0);
        }
        this.f1848p = bVar;
    }

    public static void j(h hVar, float f3, float f4) {
        hVar.u(Math.min(1.0f, 1.0f - f4) * f3, Math.min(1.0f, f4 + 1.0f) * f3);
    }

    public final void a(h hVar) {
        boolean z3;
        j(hVar, this.f1839g, this.f1840h);
        if (this.f1842j == f.f1747g) {
            z3 = true;
        } else {
            z3 = false;
        }
        hVar.c(z3);
        hVar.s();
    }

    public final h b() {
        int ordinal = this.f1843k.ordinal();
        if (ordinal == 0) {
            return new r(this);
        }
        if (ordinal == 1) {
            return new l(this, this.f1836d);
        }
        throw new RuntimeException();
    }

    public final void c(String str) {
        i.e(str, "message");
        this.f1833a.getClass();
        this.f1834b.J("audio.onLog", o.Z(new C0363c("value", str)));
    }

    public final void d() {
        h hVar;
        if (this.f1846n) {
            this.f1846n = false;
            if (this.f1845m && (hVar = this.f1837e) != null) {
                hVar.a();
            }
        }
    }

    public final void e() {
        h hVar;
        this.f1848p.w();
        if (!this.f1844l) {
            if (this.f1846n && (hVar = this.f1837e) != null) {
                hVar.e();
            }
            i((c) null);
            this.f1837e = null;
        }
    }

    public final void f() {
        M0.a aVar = this.f1848p;
        if (!i.a(aVar.q(), aVar.u().f1835c)) {
            aVar.P(aVar.u().f1835c);
            aVar.W();
        }
        if (aVar.x()) {
            aVar.M();
        } else {
            aVar.s().a();
        }
    }

    public final void g(e eVar) {
        Object obj;
        int i3;
        if (this.f1843k != eVar) {
            this.f1843k = eVar;
            h hVar = this.f1837e;
            if (hVar != null) {
                Object obj2 = null;
                try {
                    Integer v = hVar.v();
                    if (v == null) {
                        obj = v;
                    } else {
                        int intValue = v.intValue();
                        obj = v;
                        if (intValue == 0) {
                            obj = null;
                        }
                    }
                } catch (Throwable th) {
                    obj = M0.a.h(th);
                }
                if (!(obj instanceof C0364d)) {
                    obj2 = obj;
                }
                Integer num = (Integer) obj2;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = -1;
                }
                this.f1847o = i3;
                h(false);
                hVar.release();
            }
            h b3 = b();
            this.f1837e = b3;
            c cVar = this.f1838f;
            if (cVar != null) {
                b3.k(cVar);
                a(b3);
            }
        }
    }

    public final void h(boolean z3) {
        if (this.f1845m != z3) {
            this.f1845m = z3;
            this.f1833a.getClass();
            d.c(this, z3);
        }
    }

    public final void i(c cVar) {
        if (!i.a(this.f1838f, cVar)) {
            if (cVar != null) {
                h hVar = this.f1837e;
                if (this.f1844l || hVar == null) {
                    hVar = b();
                    this.f1837e = hVar;
                    this.f1844l = false;
                } else if (this.f1845m) {
                    hVar.w();
                    h(false);
                }
                hVar.k(cVar);
                a(hVar);
            } else {
                this.f1844l = true;
                h(false);
                this.f1846n = false;
                h hVar2 = this.f1837e;
                if (hVar2 != null) {
                    hVar2.release();
                }
            }
            this.f1838f = cVar;
            return;
        }
        this.f1833a.getClass();
        d.c(this, true);
    }

    public final void k() {
        h hVar;
        this.f1848p.w();
        if (!this.f1844l) {
            if (this.f1842j != f.f1746f) {
                d();
                if (this.f1845m) {
                    h hVar2 = this.f1837e;
                    int i3 = 0;
                    if (hVar2 == null || !hVar2.j()) {
                        if (this.f1845m && ((hVar = this.f1837e) == null || !hVar.j())) {
                            h hVar3 = this.f1837e;
                            if (hVar3 != null) {
                                hVar3.n(0);
                            }
                            i3 = -1;
                        }
                        this.f1847o = i3;
                        return;
                    }
                    h hVar4 = this.f1837e;
                    if (hVar4 != null) {
                        hVar4.e();
                    }
                    h(false);
                    h hVar5 = this.f1837e;
                    if (hVar5 != null) {
                        hVar5.s();
                        return;
                    }
                    return;
                }
                return;
            }
            e();
        }
    }

    public final void l(a aVar) {
        if (!this.f1835c.equals(aVar)) {
            if (this.f1835c.f1733e != 0 && aVar.f1733e == 0) {
                this.f1848p.w();
            }
            this.f1835c = a.b(aVar);
            d dVar = this.f1833a;
            dVar.a().setMode(this.f1835c.f1734f);
            dVar.a().setSpeakerphoneOn(this.f1835c.f1729a);
            h hVar = this.f1837e;
            if (hVar != null) {
                hVar.e();
                h(false);
                hVar.t(this.f1835c);
                c cVar = this.f1838f;
                if (cVar != null) {
                    hVar.k(cVar);
                    a(hVar);
                }
            }
        }
    }
}
