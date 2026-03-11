package I2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: I2.n  reason: case insensitive filesystem */
public class C0063n {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f774b = AtomicIntegerFieldUpdater.newUpdater(C0063n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f775a;

    public C0063n(Throwable th, boolean z3) {
        this.f775a = th;
        this._handled = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f775a + ']';
    }
}
