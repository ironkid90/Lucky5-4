package U1;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class i implements e {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f1781a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue f1782b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f1783c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f1781a = executorService;
    }

    public final void a(c cVar) {
        this.f1782b.add(cVar);
        this.f1781a.execute(new h(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f1781a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f1782b;
        AtomicBoolean atomicBoolean = this.f1783c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new h(this, 1));
                }
            }
        }
    }
}
