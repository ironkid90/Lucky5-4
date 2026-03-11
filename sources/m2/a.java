package M2;

import L2.e;
import java.util.concurrent.CancellationException;

public final class a extends CancellationException {

    /* renamed from: f  reason: collision with root package name */
    public final transient e f1098f;

    public a(e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f1098f = eVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
