package I2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class Y implements M {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f741g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f742h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f743i;
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f744f;

    static {
        Class<Y> cls = Y.class;
        f741g = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting");
        Class<Object> cls2 = Object.class;
        f742h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause");
        f743i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder");
    }

    public Y(b0 b0Var, Throwable th) {
        this.f744f = b0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable c3 = c();
        if (c3 == null) {
            f742h.set(this, th);
        } else if (th != c3) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f743i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
            } else if (obj instanceof Throwable) {
                if (th != obj) {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    atomicReferenceFieldUpdater.set(this, arrayList);
                }
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final boolean b() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final Throwable c() {
        return (Throwable) f742h.get(this);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f741g.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final b0 f() {
        return this.f744f;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f743i;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c3 = c();
        if (c3 != null) {
            arrayList.add(0, c3);
        }
        if (th != null && !th.equals(c3)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, C0071w.f793g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f743i.get(this) + ", list=" + this.f744f + ']';
    }
}
