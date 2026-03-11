package I2;

import A2.i;
import B.m;
import N2.a;
import N2.h;
import N2.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.C0365e;
import q2.C0399b;
import r2.C0420d;
import r2.C0425i;
import s2.C0466a;
import t2.C0485c;
import z2.l;

/* renamed from: I2.f  reason: case insensitive filesystem */
public class C0055f extends B implements C0054e, C0485c, m0 {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f757k;

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f758l;

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f759m;
    private volatile int _decisionAndIndex = 536870911;
    private volatile Object _parentHandle;
    private volatile Object _state = C0051b.f752f;

    /* renamed from: i  reason: collision with root package name */
    public final C0420d f760i;

    /* renamed from: j  reason: collision with root package name */
    public final C0425i f761j;

    static {
        Class<C0055f> cls = C0055f.class;
        f757k = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex");
        Class<Object> cls2 = Object.class;
        f758l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f759m = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public C0055f(int i3, C0420d dVar) {
        super(i3);
        this.f760i = dVar;
        this.f761j = dVar.h();
    }

    public static Object D(d0 d0Var, Object obj, int i3, l lVar) {
        E e2;
        if ((obj instanceof C0063n) || !C0071w.g(i3)) {
            return obj;
        }
        if (lVar == null && !(d0Var instanceof E)) {
            return obj;
        }
        if (d0Var instanceof E) {
            e2 = (E) d0Var;
        } else {
            e2 = null;
        }
        return new C0062m(obj, e2, lVar, (CancellationException) null, 16);
    }

    public static void z(d0 d0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + d0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        h hVar;
        C0420d dVar = this.f760i;
        Throwable th = null;
        if (dVar instanceof h) {
            hVar = (h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            loop0:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1192m;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                m mVar = a.f1182d;
                if (obj == mVar) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, mVar, this)) {
                            break loop0;
                        } else if (atomicReferenceFieldUpdater.get(hVar) != mVar) {
                        }
                    }
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                r();
                q(th);
            }
        }
    }

    public final void C(Object obj, int i3, l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f758l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d0) {
                Object D3 = D((d0) obj2, obj, i3, lVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, D3)) {
                        if (!y()) {
                            r();
                        }
                        s(i3);
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                if (obj2 instanceof C0056g) {
                    C0056g gVar = (C0056g) obj2;
                    gVar.getClass();
                    if (C0056g.f762c.compareAndSet(gVar, 0, 1)) {
                        if (lVar != null) {
                            n(lVar, gVar.f775a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        }
    }

    public final void a(u uVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f757k;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        x(uVar);
    }

    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f758l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d0) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof C0063n)) {
                if (obj2 instanceof C0062m) {
                    C0062m mVar = (C0062m) obj2;
                    if (mVar.f773e == null) {
                        C0062m a2 = C0062m.a(mVar, (E) null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            }
                        }
                        E e2 = mVar.f770b;
                        if (e2 != null) {
                            l(e2, cancellationException);
                        }
                        l lVar = mVar.f771c;
                        if (lVar != null) {
                            n(lVar, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once");
                }
                C0062m mVar2 = new C0062m(obj2, (E) null, (l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, mVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    public final C0420d c() {
        return this.f760i;
    }

    public final Throwable d(Object obj) {
        Throwable d3 = super.d(obj);
        if (d3 != null) {
            return d3;
        }
        return null;
    }

    public final Object e(Object obj) {
        if (obj instanceof C0062m) {
            return ((C0062m) obj).f769a;
        }
        return obj;
    }

    public final void f(Object obj, l lVar) {
        C(obj, this.f714h, lVar);
    }

    public final C0485c g() {
        C0420d dVar = this.f760i;
        if (dVar instanceof C0485c) {
            return (C0485c) dVar;
        }
        return null;
    }

    public final C0425i h() {
        return this.f761j;
    }

    public final Object j() {
        return f758l.get(this);
    }

    public final m k(Object obj, l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f758l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof d0;
            m mVar = C0071w.f787a;
            if (z3) {
                Object D3 = D((d0) obj2, obj, this.f714h, lVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, D3)) {
                        if (y()) {
                            return mVar;
                        }
                        r();
                        return mVar;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                boolean z4 = obj2 instanceof C0062m;
                return null;
            }
        }
    }

    public final void l(E e2, Throwable th) {
        try {
            e2.b(th);
        } catch (Throwable th2) {
            C0071w.e(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), this.f761j);
        }
    }

    public final void m(Object obj) {
        Throwable a2 = C0365e.a(obj);
        if (a2 != null) {
            obj = new C0063n(a2, false);
        }
        C(obj, this.f714h, (l) null);
    }

    public final void n(l lVar, Throwable th) {
        try {
            lVar.j(th);
        } catch (Throwable th2) {
            C0071w.e(new RuntimeException("Exception in resume onCancellation handler for " + this, th2), this.f761j);
        }
    }

    public final void o(Object obj) {
        s(this.f714h);
    }

    public final void p(u uVar, Throwable th) {
        C0425i iVar = this.f761j;
        int i3 = f757k.get(this) & 536870911;
        if (i3 != 536870911) {
            try {
                uVar.g(i3, iVar);
            } catch (Throwable th2) {
                C0071w.e(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), iVar);
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    public final void q(Throwable th) {
        boolean z3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f758l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d0) {
                if ((obj instanceof E) || (obj instanceof u)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C0056g gVar = new C0056g(this, th, z3);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, gVar)) {
                        d0 d0Var = (d0) obj;
                        if (d0Var instanceof E) {
                            l((E) obj, th);
                        } else if (d0Var instanceof u) {
                            p((u) obj, th);
                        }
                        if (!y()) {
                            r();
                        }
                        s(this.f714h);
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f759m;
        D d3 = (D) atomicReferenceFieldUpdater.get(this);
        if (d3 != null) {
            d3.c();
            atomicReferenceFieldUpdater.set(this, c0.f755f);
        }
    }

    public final void s(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        boolean z3;
        do {
            atomicIntegerFieldUpdater = f757k;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 1) {
                    if (i3 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C0420d dVar = this.f760i;
                    if (z3 || !(dVar instanceof h) || C0071w.g(i3) != C0071w.g(this.f714h)) {
                        C0071w.j(this, dVar, z3);
                        return;
                    }
                    C0067s sVar = ((h) dVar).f1193i;
                    C0425i h3 = ((h) dVar).f1194j.h();
                    if (sVar.h()) {
                        sVar.g(h3, this);
                        return;
                    }
                    I a2 = i0.a();
                    if (a2.f723h >= 4294967296L) {
                        C0399b bVar = a2.f725j;
                        if (bVar == null) {
                            bVar = new C0399b();
                            a2.f725j = bVar;
                        }
                        bVar.addLast(this);
                        return;
                    }
                    a2.k(true);
                    try {
                        C0071w.j(this, dVar, true);
                        do {
                        } while (a2.m());
                    } catch (Throwable th) {
                        a2.i(true);
                        throw th;
                    }
                    a2.i(true);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable t(a0 a0Var) {
        return a0Var.A();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(C0071w.l(this.f760i));
        sb.append("){");
        Object obj = f758l.get(this);
        if (obj instanceof d0) {
            str = "Active";
        } else if (obj instanceof C0056g) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C0071w.c(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean y2 = y();
        do {
            atomicIntegerFieldUpdater = f757k;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 2) {
                    if (y2) {
                        B();
                    }
                    Object obj = f758l.get(this);
                    if (!(obj instanceof C0063n)) {
                        if (C0071w.g(this.f714h)) {
                            Q q3 = (Q) this.f761j.n(C0068t.f786g);
                            if (q3 != null && !q3.b()) {
                                CancellationException A3 = ((a0) q3).A();
                                b(obj, A3);
                                throw A3;
                            }
                        }
                        return e(obj);
                    }
                    throw ((C0063n) obj).f775a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((D) f759m.get(this)) == null) {
            w();
        }
        if (y2) {
            B();
        }
        return C0466a.f4632f;
    }

    public final void v() {
        D w3 = w();
        if (w3 != null && !(f758l.get(this) instanceof d0)) {
            w3.c();
            f759m.set(this, c0.f755f);
        }
    }

    public final D w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Q q3 = (Q) this.f761j.n(C0068t.f786g);
        if (q3 == null) {
            return null;
        }
        D f3 = C0071w.f(q3, true, new C0057h(this), 2);
        do {
            atomicReferenceFieldUpdater = f759m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, f3) || atomicReferenceFieldUpdater.get(this) != null) {
                return f3;
            }
            atomicReferenceFieldUpdater = f759m;
            break;
        } while (atomicReferenceFieldUpdater.get(this) != null);
        return f3;
    }

    public final void x(d0 d0Var) {
        boolean z3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f758l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0051b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof E) {
                z3 = true;
            } else {
                z3 = obj instanceof u;
            }
            Throwable th = null;
            if (z3) {
                z(d0Var, obj);
                throw null;
            } else if (obj instanceof C0063n) {
                C0063n nVar = (C0063n) obj;
                nVar.getClass();
                if (!C0063n.f774b.compareAndSet(nVar, 0, 1)) {
                    z(d0Var, obj);
                    throw null;
                } else if (obj instanceof C0056g) {
                    if (!(obj instanceof C0063n)) {
                        nVar = null;
                    }
                    if (nVar != null) {
                        th = nVar.f775a;
                    }
                    if (d0Var instanceof E) {
                        l((E) d0Var, th);
                        return;
                    }
                    i.c(d0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                    p((u) d0Var, th);
                    return;
                } else {
                    return;
                }
            } else if (obj instanceof C0062m) {
                C0062m mVar = (C0062m) obj;
                if (mVar.f770b != null) {
                    z(d0Var, obj);
                    throw null;
                } else if (!(d0Var instanceof u)) {
                    i.c(d0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    E e2 = (E) d0Var;
                    Throwable th2 = mVar.f773e;
                    if (th2 != null) {
                        l(e2, th2);
                        return;
                    }
                    C0062m a2 = C0062m.a(mVar, e2, (CancellationException) null, 29);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    return;
                } else {
                    return;
                }
            } else if (!(d0Var instanceof u)) {
                i.c(d0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0062m mVar2 = new C0062m(obj, (E) d0Var, (l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    public final boolean y() {
        if (this.f714h == 2) {
            C0420d dVar = this.f760i;
            i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (h.f1192m.get((h) dVar) != null) {
                return true;
            }
        }
        return false;
    }
}
