package I2;

import A2.i;
import B.m;
import J2.b;
import N2.a;
import N2.e;
import N2.h;
import N2.t;
import P2.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p2.C0365e;
import r2.C0420d;
import r2.C0421e;
import r2.C0425i;
import r2.C0426j;
import s2.C0466a;
import t2.C0484b;
import t2.C0485c;
import t2.C0488f;
import z2.p;

/* renamed from: I2.w  reason: case insensitive filesystem */
public abstract class C0071w {

    /* renamed from: a  reason: collision with root package name */
    public static final m f787a = new m(11, (Object) "RESUME_TOKEN");

    /* renamed from: b  reason: collision with root package name */
    public static final m f788b = new m(11, (Object) "CLOSED_EMPTY");

    /* renamed from: c  reason: collision with root package name */
    public static final m f789c = new m(11, (Object) "COMPLETING_ALREADY");

    /* renamed from: d  reason: collision with root package name */
    public static final m f790d = new m(11, (Object) "COMPLETING_WAITING_CHILDREN");

    /* renamed from: e  reason: collision with root package name */
    public static final m f791e = new m(11, (Object) "COMPLETING_RETRY");

    /* renamed from: f  reason: collision with root package name */
    public static final m f792f = new m(11, (Object) "TOO_LATE_TO_CANCEL");

    /* renamed from: g  reason: collision with root package name */
    public static final m f793g = new m(11, (Object) "SEALED");

    /* renamed from: h  reason: collision with root package name */
    public static final F f794h = new F(false);

    /* renamed from: i  reason: collision with root package name */
    public static final F f795i = new F(true);

    public static final e a(C0425i iVar) {
        if (iVar.n(C0068t.f786g) == null) {
            iVar = iVar.d(new U((Q) null));
        }
        return new e(iVar);
    }

    public static final C0425i b(C0425i iVar, C0425i iVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        C0065p pVar = C0065p.f779i;
        boolean booleanValue = ((Boolean) iVar.e(bool, pVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.e(bool, pVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.d(iVar2);
        }
        C0426j jVar = C0426j.f4457f;
        C0425i iVar3 = (C0425i) iVar.e(jVar, new C0065p(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.e(jVar, C0065p.f778h);
        }
        return iVar3.d((C0425i) obj);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0055f d(C0420d dVar) {
        C0055f fVar;
        C0055f fVar2;
        if (!(dVar instanceof h)) {
            return new C0055f(1, dVar);
        }
        h hVar = (h) dVar;
        loop0:
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1192m;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = a.f1182d;
            fVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, mVar);
                fVar2 = null;
                break;
            } else if (obj instanceof C0055f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                    }
                }
                fVar2 = (C0055f) obj;
                break loop0;
            } else if (obj != mVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (fVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0055f.f758l;
            Object obj2 = atomicReferenceFieldUpdater2.get(fVar2);
            if (!(obj2 instanceof C0062m) || ((C0062m) obj2).f772d == null) {
                C0055f.f757k.set(fVar2, 536870911);
                atomicReferenceFieldUpdater2.set(fVar2, C0051b.f752f);
                fVar = fVar2;
            } else {
                fVar2.r();
            }
            if (fVar != null) {
                return fVar;
            }
        }
        return new C0055f(2, dVar);
    }

    public static final void e(Throwable th, C0425i iVar) {
        try {
            b bVar = (b) iVar.n(C0068t.f785f);
            if (bVar != null) {
                bVar.g(th, iVar);
            } else {
                a.e(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                android.support.v4.media.session.a.c(runtimeException, th);
                th = runtimeException;
            }
            a.e(th, iVar);
        }
    }

    public static /* synthetic */ D f(Q q3, boolean z3, V v, int i3) {
        boolean z4 = false;
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        if ((i3 & 2) != 0) {
            z4 = true;
        }
        return ((a0) q3).I(z3, z4, v);
    }

    public static final boolean g(int i3) {
        if (i3 == 1 || i3 == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [I2.f0, I2.a] */
    public static f0 h(C0069u uVar, C0067s sVar, p pVar, int i3) {
        C0425i iVar = sVar;
        if ((i3 & 1) != 0) {
            iVar = C0426j.f4457f;
        }
        C0425i b3 = b(uVar.j(), iVar, true);
        C0425i iVar2 = C.f715a;
        if (b3 != iVar2 && b3.n(C0421e.f4456f) == null) {
            b3 = b3.d(iVar2);
        }
        ? aVar = new C0050a(b3, true);
        aVar.W(1, aVar, pVar);
        return aVar;
    }

    public static final Object i(Object obj) {
        if (obj instanceof C0063n) {
            return M0.a.h(((C0063n) obj).f775a);
        }
        return obj;
    }

    public static final void j(C0055f fVar, C0420d dVar, boolean z3) {
        Object obj;
        k0 k0Var;
        Object obj2 = C0055f.f758l.get(fVar);
        Throwable d3 = fVar.d(obj2);
        if (d3 != null) {
            obj = M0.a.h(d3);
        } else {
            obj = fVar.e(obj2);
        }
        if (z3) {
            i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            h hVar = (h) dVar;
            C0484b bVar = hVar.f1194j;
            C0425i h3 = bVar.h();
            Object m3 = a.m(h3, hVar.f1196l);
            if (m3 != a.f1184f) {
                k0Var = n(bVar, h3, m3);
            } else {
                k0Var = null;
            }
            try {
                bVar.m(obj);
            } finally {
                if (k0Var == null || k0Var.X()) {
                    a.h(h3, m3);
                }
            }
        } else {
            dVar.m(obj);
        }
    }

    public static Object k(p pVar) {
        long j3;
        C0063n nVar;
        C0426j jVar = C0426j.f4457f;
        Thread currentThread = Thread.currentThread();
        C0421e eVar = C0421e.f4456f;
        I a2 = i0.a();
        C0425i b3 = b(jVar, a2, true);
        d dVar = C.f715a;
        if (b3 != dVar && b3.n(eVar) == null) {
            b3 = b3.d(dVar);
        }
        C0052c cVar = new C0052c(b3, currentThread, a2);
        cVar.W(1, cVar, pVar);
        I i3 = cVar.f754j;
        if (i3 != null) {
            int i4 = I.f722k;
            i3.k(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (i3 != null) {
                    j3 = i3.l();
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (cVar.E() instanceof M) {
                    LockSupport.parkNanos(cVar, j3);
                } else {
                    if (i3 != null) {
                        int i5 = I.f722k;
                        i3.i(false);
                    }
                    Object m3 = m(cVar.E());
                    if (m3 instanceof C0063n) {
                        nVar = (C0063n) m3;
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        return m3;
                    }
                    throw nVar.f775a;
                }
            } catch (Throwable th) {
                if (i3 != null) {
                    int i6 = I.f722k;
                    i3.i(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        cVar.s(interruptedException);
        throw interruptedException;
    }

    public static final String l(C0420d dVar) {
        String str;
        if (dVar instanceof h) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + c(dVar);
        } catch (Throwable th) {
            str = M0.a.h(th);
        }
        Throwable a2 = C0365e.a(str);
        String str2 = str;
        if (a2 != null) {
            str2 = dVar.getClass().getName() + '@' + c(dVar);
        }
        return (String) str2;
    }

    public static final Object m(Object obj) {
        N n3;
        M m3;
        if (obj instanceof N) {
            n3 = (N) obj;
        } else {
            n3 = null;
        }
        if (n3 == null || (m3 = n3.f728a) == null) {
            return obj;
        }
        return m3;
    }

    public static final k0 n(C0420d dVar, C0425i iVar, Object obj) {
        k0 k0Var = null;
        if (!(dVar instanceof C0485c)) {
            return null;
        }
        if (iVar.n(l0.f768f) != null) {
            C0485c cVar = (C0485c) dVar;
            while (true) {
                if (!(cVar instanceof A) && (cVar = cVar.g()) != null) {
                    if (cVar instanceof k0) {
                        k0Var = (k0) cVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (k0Var != null) {
                k0Var.Y(iVar, obj);
            }
        }
        return k0Var;
    }

    /* JADX INFO: finally extract failed */
    public static final Object o(C0425i iVar, p pVar, C0488f fVar) {
        C0425i iVar2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        C0425i iVar3 = fVar.f4684g;
        i.b(iVar3);
        if (!((Boolean) iVar.e(Boolean.FALSE, C0065p.f779i)).booleanValue()) {
            iVar2 = iVar3.d(iVar);
        } else {
            iVar2 = b(iVar3, iVar, false);
        }
        Q q3 = (Q) iVar2.n(C0068t.f786g);
        if (q3 != null && !q3.b()) {
            throw ((a0) q3).A();
        } else if (iVar2 == iVar3) {
            t tVar = new t(fVar, iVar2);
            return M0.a.U(tVar, tVar, pVar);
        } else {
            C0421e eVar = C0421e.f4456f;
            if (i.a(iVar2.n(eVar), iVar3.n(eVar))) {
                k0 k0Var = new k0(iVar2, fVar);
                C0425i iVar4 = k0Var.f749h;
                Object m3 = a.m(iVar4, (Object) null);
                try {
                    Object U3 = M0.a.U(k0Var, k0Var, pVar);
                    a.h(iVar4, m3);
                    return U3;
                } catch (Throwable th) {
                    a.h(iVar4, m3);
                    throw th;
                }
            } else {
                t tVar2 = new t(fVar, iVar2);
                android.support.v4.media.session.a.C(pVar, tVar2, tVar2);
                do {
                    atomicIntegerFieldUpdater = A.f713j;
                    int i3 = atomicIntegerFieldUpdater.get(tVar2);
                    if (i3 != 0) {
                        if (i3 == 2) {
                            Object m4 = m(tVar2.E());
                            if (!(m4 instanceof C0063n)) {
                                return m4;
                            }
                            throw ((C0063n) m4).f775a;
                        }
                        throw new IllegalStateException("Already suspended");
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1));
                return C0466a.f4632f;
            }
        }
    }
}
