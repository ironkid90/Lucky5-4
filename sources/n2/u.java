package N2;

import I2.d0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r2.C0425i;

public abstract class u extends d implements d0 {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1220i = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: h  reason: collision with root package name */
    public final long f1221h;

    public u(long j3, u uVar, int i3) {
        super(uVar);
        this.f1221h = j3;
        this.cleanedAndPointers = i3 << 16;
    }

    public final boolean c() {
        if (f1220i.get(this) != f() || b() == null) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (f1220i.addAndGet(this, -65536) != f() || b() == null) {
            return false;
        }
        return true;
    }

    public abstract int f();

    public abstract void g(int i3, C0425i iVar);

    public final void h() {
        if (f1220i.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f1220i;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
