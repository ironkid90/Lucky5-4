package I2;

import A2.i;
import N2.k;
import N2.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z2.l;

public abstract class V extends k implements D, M, l {

    /* renamed from: i  reason: collision with root package name */
    public a0 f735i;

    public final boolean b() {
        return true;
    }

    public final void c() {
        a0 n3 = n();
        while (true) {
            Object E3 = n3.E();
            if (E3 instanceof V) {
                if (E3 == this) {
                    F f3 = C0071w.f795i;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a0.f750f;
                        if (!atomicReferenceFieldUpdater.compareAndSet(n3, E3, f3)) {
                            if (atomicReferenceFieldUpdater.get(n3) != E3) {
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else if ((E3 instanceof M) && ((M) E3).f() != null) {
                while (true) {
                    Object k3 = k();
                    if (k3 instanceof r) {
                        k kVar = ((r) k3).f1218a;
                        return;
                    } else if (k3 == this) {
                        k kVar2 = (k) k3;
                        return;
                    } else {
                        i.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        k kVar3 = (k) k3;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f1204h;
                        r rVar = (r) atomicReferenceFieldUpdater2.get(kVar3);
                        if (rVar == null) {
                            rVar = new r(kVar3);
                            atomicReferenceFieldUpdater2.lazySet(kVar3, rVar);
                        }
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = k.f1202f;
                            if (atomicReferenceFieldUpdater3.compareAndSet(this, k3, rVar)) {
                                kVar3.g();
                                return;
                            } else if (atomicReferenceFieldUpdater3.get(this) != k3) {
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public final b0 f() {
        return null;
    }

    public Q getParent() {
        return n();
    }

    public final a0 n() {
        a0 a0Var = this.f735i;
        if (a0Var != null) {
            return a0Var;
        }
        i.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    public final String toString() {
        return getClass().getSimpleName() + '@' + C0071w.c(this) + "[job@" + C0071w.c(n()) + ']';
    }
}
