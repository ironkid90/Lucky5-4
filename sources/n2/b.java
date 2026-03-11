package N2;

import B.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b extends q {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1185a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f1179a;

    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1185a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        m mVar = a.f1179a;
        if (obj2 == mVar) {
            m c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == mVar) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(this) != mVar) {
                            obj2 = atomicReferenceFieldUpdater.get(this);
                            break;
                        }
                    } else {
                        obj2 = c3;
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract m c(Object obj);
}
