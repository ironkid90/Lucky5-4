package N2;

import r2.C0425i;

public final class g extends RuntimeException {

    /* renamed from: f  reason: collision with root package name */
    public final transient C0425i f1191f;

    public g(C0425i iVar) {
        this.f1191f = iVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f1191f.toString();
    }
}
