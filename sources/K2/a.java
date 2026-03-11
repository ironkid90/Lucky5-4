package K2;

import A2.i;
import B.m;
import I2.C0055f;
import I2.C0071w;
import I2.m0;
import L2.f;
import N2.p;
import N2.u;
import N2.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r2.C0425i;
import z2.l;

public final class a implements m0 {

    /* renamed from: f  reason: collision with root package name */
    public Object f863f = d.f893p;

    /* renamed from: g  reason: collision with root package name */
    public C0055f f864g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f865h;

    public a(b bVar) {
        this.f865h = bVar;
    }

    public final void a(u uVar, int i3) {
        C0055f fVar = this.f864g;
        if (fVar != null) {
            fVar.a(uVar, i3);
        }
    }

    public final Object b(f fVar) {
        C0055f fVar2;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f871m;
        b bVar = this.f865h;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f866h.get(bVar), true)) {
                this.f863f = d.f889l;
                Throwable m3 = bVar.m();
                if (m3 == null) {
                    return Boolean.FALSE;
                }
                int i3 = v.f1222a;
                throw m3;
            }
            long andIncrement = b.f867i.getAndIncrement(bVar);
            long j3 = (long) d.f879b;
            long j4 = andIncrement / j3;
            int i4 = (int) (andIncrement % j3);
            if (jVar.f1221h != j4) {
                j k3 = bVar.k(j4, jVar);
                if (k3 == null) {
                    continue;
                } else {
                    jVar = k3;
                }
            }
            Object A3 = bVar.A(jVar, i4, andIncrement, (Object) null);
            m mVar = d.f890m;
            if (A3 != mVar) {
                m mVar2 = d.f892o;
                if (A3 == mVar2) {
                    if (andIncrement < bVar.p()) {
                        jVar.a();
                    }
                } else if (A3 == d.f891n) {
                    b bVar2 = this.f865h;
                    C0055f d3 = C0071w.d(M0.a.y(fVar));
                    try {
                        this.f864g = d3;
                        fVar2 = d3;
                        try {
                            Object A4 = bVar2.A(jVar, i4, andIncrement, this);
                            if (A4 == mVar) {
                                a(jVar, i4);
                            } else {
                                p pVar = null;
                                C0425i iVar = fVar2.f761j;
                                l lVar = bVar2.f876g;
                                if (A4 == mVar2) {
                                    if (andIncrement < bVar2.p()) {
                                        jVar.a();
                                    }
                                    j jVar2 = (j) b.f871m.get(bVar2);
                                    while (true) {
                                        if (bVar2.r(b.f866h.get(bVar2), true)) {
                                            C0055f fVar3 = this.f864g;
                                            i.b(fVar3);
                                            this.f864g = null;
                                            this.f863f = d.f889l;
                                            Throwable m4 = bVar.m();
                                            if (m4 == null) {
                                                fVar3.m(Boolean.FALSE);
                                            } else {
                                                fVar3.m(M0.a.h(m4));
                                            }
                                        } else {
                                            long andIncrement2 = b.f867i.getAndIncrement(bVar2);
                                            long j5 = (long) d.f879b;
                                            long j6 = andIncrement2 / j5;
                                            int i5 = (int) (andIncrement2 % j5);
                                            if (jVar2.f1221h != j6) {
                                                j k4 = bVar2.k(j6, jVar2);
                                                if (k4 != null) {
                                                    jVar2 = k4;
                                                }
                                            }
                                            l lVar2 = lVar;
                                            Object A5 = bVar2.A(jVar2, i5, andIncrement2, this);
                                            if (A5 == d.f890m) {
                                                a(jVar2, i5);
                                                break;
                                            } else if (A5 == d.f892o) {
                                                if (andIncrement2 < bVar2.p()) {
                                                    jVar2.a();
                                                }
                                                lVar = lVar2;
                                            } else if (A5 != d.f891n) {
                                                jVar2.a();
                                                this.f863f = A5;
                                                this.f864g = null;
                                                bool = Boolean.TRUE;
                                                if (lVar2 != null) {
                                                    pVar = new p(lVar2, A5, iVar);
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected");
                                            }
                                        }
                                    }
                                } else {
                                    l lVar3 = lVar;
                                    jVar.a();
                                    this.f863f = A4;
                                    this.f864g = null;
                                    bool = Boolean.TRUE;
                                    if (lVar3 != null) {
                                        pVar = new p(lVar3, A4, iVar);
                                    }
                                }
                                fVar2.f(bool, pVar);
                            }
                            return fVar2.u();
                        } catch (Throwable th) {
                            th = th;
                            fVar2.B();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fVar2 = d3;
                        fVar2.B();
                        throw th;
                    }
                } else {
                    jVar.a();
                    this.f863f = A3;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
    }
}
