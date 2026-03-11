package Q2;

import B.m;
import I2.C0055f;
import I2.C0071w;
import M0.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.C0368h;
import s2.C0466a;
import t2.C0484b;

public final class d extends h implements a {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1304g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z3) {
        super(z3 ? 1 : 0);
        m mVar;
        if (z3) {
            mVar = null;
        } else {
            mVar = e.f1305a;
        }
        this.owner = mVar;
    }

    public final Object c(C0484b bVar) {
        boolean d3 = d((Object) null);
        C0368h hVar = C0368h.f4194a;
        if (d3) {
            return hVar;
        }
        C0055f d4 = C0071w.d(a.y(bVar));
        try {
            a(new c(this, d4));
            Object u3 = d4.u();
            C0466a aVar = C0466a.f4632f;
            if (u3 != aVar) {
                u3 = hVar;
            }
            if (u3 == aVar) {
                return u3;
            }
            return hVar;
        } catch (Throwable th) {
            d4.B();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        boolean z3;
        boolean z4;
        int i3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f1312f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= 1) {
                        break;
                    }
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1304g;
                if (i4 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                z4 = false;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f1305a) {
                                if (obj2 == obj) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                            }
                        }
                        if (!z4) {
                            if (z4) {
                                break;
                            }
                        } else {
                            z3 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        if (!z3) {
            return true;
        }
        if (z3) {
            return false;
        }
        if (!z3) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f1312f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1304g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            m mVar = e.f1305a;
            if (obj2 != mVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(C0071w.c(this));
        sb.append("[isLocked=");
        boolean z3 = false;
        if (Math.max(h.f1312f.get(this), 0) == 0) {
            z3 = true;
        }
        sb.append(z3);
        sb.append(",owner=");
        sb.append(f1304g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
