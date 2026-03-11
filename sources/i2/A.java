package I2;

import N2.a;
import N2.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z2.l;

public final class A extends t {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f713j = AtomicIntegerFieldUpdater.newUpdater(A.class, "_decision");
    private volatile int _decision;

    public final void q(Object obj) {
        r(obj);
    }

    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f713j;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 1) {
                    a.i(M0.a.y(this.f1219i), C0071w.i(obj), (l) null);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
