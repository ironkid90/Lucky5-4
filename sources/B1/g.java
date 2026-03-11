package b1;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class g implements ScheduledExecutorService {

    /* renamed from: f  reason: collision with root package name */
    public final ExecutorService f2690f;

    /* renamed from: g  reason: collision with root package name */
    public final ScheduledExecutorService f2691g;

    public g(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f2690f = executorService;
        this.f2691g = scheduledExecutorService;
    }

    public final boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return this.f2690f.awaitTermination(j3, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f2690f.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f2690f.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f2690f.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f2690f.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f2690f.isTerminated();
    }

    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        return new i(new C0127b(this, runnable, j3, timeUnit, 0));
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
        return new i(new d(this, runnable, j3, j4, timeUnit, 0));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
        return new i(new d(this, runnable, j3, j4, timeUnit, 1));
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final Future submit(Callable callable) {
        return this.f2690f.submit(callable);
    }

    public final List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f2690f.invokeAll(collection, j3, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f2690f.invokeAny(collection, j3, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        return new i(new C0127b(this, callable, j3, timeUnit, 1));
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f2690f.submit(runnable, obj);
    }

    public final Future submit(Runnable runnable) {
        return this.f2690f.submit(runnable);
    }
}
