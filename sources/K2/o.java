package K2;

import B.m;
import I.K;
import I2.C0050a;
import I2.C0063n;
import I2.C0071w;
import I2.S;
import I2.Y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.C0368h;
import r2.C0420d;
import r2.C0425i;

public final class o extends C0050a implements p, f {

    /* renamed from: i  reason: collision with root package name */
    public final b f909i;

    public o(C0425i iVar, b bVar) {
        super(iVar, true);
        this.f909i = bVar;
    }

    public final void U(Throwable th, boolean z3) {
        if (!this.f909i.f(th, false) && !z3) {
            C0071w.e(th, this.f749h);
        }
    }

    public final void V(Object obj) {
        C0368h hVar = (C0368h) obj;
        this.f909i.f((Throwable) null, false);
    }

    public final void X(K k3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f909i;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f874p;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, (Object) null, k3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            m mVar = d.f894q;
            if (obj == mVar) {
                m mVar2 = d.f895r;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, mVar, mVar2)) {
                        k3.j(bVar.m());
                        return;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != mVar) {
                    }
                }
            } else if (obj == d.f895r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            } else {
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        }
    }

    public final void a(CancellationException cancellationException) {
        Object E3 = E();
        if (E3 instanceof C0063n) {
            return;
        }
        if (!(E3 instanceof Y) || !((Y) E3).d()) {
            if (cancellationException == null) {
                cancellationException = new S(v(), (Throwable) null, this);
            }
            t(cancellationException);
        }
    }

    public final Object i(Object obj) {
        return this.f909i.i(obj);
    }

    public final Object l(Object obj, C0420d dVar) {
        return this.f909i.l(obj, dVar);
    }

    public final void t(CancellationException cancellationException) {
        this.f909i.f(cancellationException, true);
        s(cancellationException);
    }
}
