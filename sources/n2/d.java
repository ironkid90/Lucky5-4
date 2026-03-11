package N2;

import A2.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class d {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1187f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1188g;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        Class<d> cls = d.class;
        Class<Object> cls2 = Object.class;
        f1187f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f1188g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public d(u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        f1188g.lazySet(this, (Object) null);
    }

    public final d b() {
        Object obj = f1187f.get(this);
        if (obj == a.f1180b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d dVar;
        d b3;
        if (b() != null) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1188g;
                d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
                while (dVar2 != null && dVar2.c()) {
                    dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
                }
                d b4 = b();
                i.b(b4);
                while (b4.c() && (b3 = b4.b()) != null) {
                    b4 = b3;
                }
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(b4);
                    if (((d) obj) == null) {
                        dVar = null;
                    } else {
                        dVar = dVar2;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(b4, obj, dVar)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(b4) != obj) {
                        }
                    }
                }
                if (dVar2 != null) {
                    f1187f.set(dVar2, b4);
                }
                if ((!b4.c() || b4.b() == null) && (dVar2 == null || !dVar2.c())) {
                    return;
                }
            }
        }
    }
}
