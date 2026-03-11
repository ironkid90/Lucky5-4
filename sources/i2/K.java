package I2;

import N2.c;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import r2.C0425i;

public final class K extends J implements C0074z {

    /* renamed from: h  reason: collision with root package name */
    public final Executor f726h;

    public K(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.f726h = executor;
        Method method = c.f1186a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = c.f1186a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f726h;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K) || ((K) obj).f726h != this.f726h) {
            return false;
        }
        return true;
    }

    public final void g(C0425i iVar, Runnable runnable) {
        try {
            this.f726h.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            Q q3 = (Q) iVar.n(C0068t.f786g);
            if (q3 != null) {
                q3.a(cancellationException);
            }
            C.f716b.g(iVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f726h);
    }

    public final String toString() {
        return this.f726h.toString();
    }
}
