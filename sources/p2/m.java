package P2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1281b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1282c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1283d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1284e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f1285a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<m> cls = m.class;
        f1281b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f1282c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f1283d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f1284e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1282c;
        if (atomicIntegerFieldUpdater.get(this) - f1283d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f1269g.f1270a == 1) {
            f1284e.incrementAndGet(this);
        }
        int i3 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f1285a;
            if (atomicReferenceArray.get(i3) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i3, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1283d;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 - f1282c.get(this) == 0) {
                return null;
            }
            int i4 = i3 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 + 1) && (hVar = (h) this.f1285a.getAndSet(i4, (Object) null)) != null) {
                if (hVar.f1269g.f1270a == 1) {
                    f1284e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i3, boolean z3) {
        int i4 = i3 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1285a;
        h hVar = (h) atomicReferenceArray.get(i4);
        if (hVar != null) {
            boolean z4 = true;
            if (hVar.f1269g.f1270a != 1) {
                z4 = false;
            }
            if (z4 == z3) {
                while (!atomicReferenceArray.compareAndSet(i4, hVar, (Object) null)) {
                    if (atomicReferenceArray.get(i4) != hVar) {
                    }
                }
                if (z3) {
                    f1284e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
