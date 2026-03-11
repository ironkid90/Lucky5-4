package I2;

import A2.i;
import B.m;
import N2.a;
import N2.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.C0368h;
import r2.C0420d;

/* renamed from: I2.h  reason: case insensitive filesystem */
public final class C0057h extends T {

    /* renamed from: j  reason: collision with root package name */
    public final C0055f f763j;

    public C0057h(C0055f fVar) {
        this.f763j = fVar;
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        o((Throwable) obj);
        return C0368h.f4194a;
    }

    public final void o(Throwable th) {
        a0 n3 = n();
        C0055f fVar = this.f763j;
        Throwable t3 = fVar.t(n3);
        if (fVar.y()) {
            C0420d dVar = fVar.f760i;
            i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            h hVar = (h) dVar;
            loop0:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1192m;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                m mVar = a.f1182d;
                if (!i.a(obj, mVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, mVar, t3)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != mVar) {
                    }
                }
                return;
            }
        }
        fVar.q(t3);
        if (!fVar.y()) {
            fVar.r();
        }
    }
}
