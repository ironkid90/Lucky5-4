package I2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p2.C0368h;
import z2.l;

public final class O extends T {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f729k = AtomicIntegerFieldUpdater.newUpdater(O.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: j  reason: collision with root package name */
    public final l f730j;

    public O(l lVar) {
        this.f730j = lVar;
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        o((Throwable) obj);
        return C0368h.f4194a;
    }

    public final void o(Throwable th) {
        if (f729k.compareAndSet(this, 0, 1)) {
            this.f730j.j(th);
        }
    }
}
