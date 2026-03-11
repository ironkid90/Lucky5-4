package b1;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.C0350a;
import o.h;

public final class i extends h implements ScheduledFuture {

    /* renamed from: m  reason: collision with root package name */
    public final ScheduledFuture f2692m;

    public i(h hVar) {
        this.f2692m = hVar.a(new F0.h(16, (Object) this));
    }

    public final void b() {
        boolean z3;
        ScheduledFuture scheduledFuture = this.f2692m;
        Object obj = this.f4135f;
        if (!(obj instanceof C0350a) || !((C0350a) obj).f4118a) {
            z3 = false;
        } else {
            z3 = true;
        }
        scheduledFuture.cancel(z3);
    }

    public final int compareTo(Object obj) {
        return this.f2692m.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f2692m.getDelay(timeUnit);
    }
}
