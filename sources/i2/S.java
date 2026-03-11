package I2;

import A2.i;
import java.util.concurrent.CancellationException;

public final class S extends CancellationException {

    /* renamed from: f  reason: collision with root package name */
    public final transient a0 f733f;

    public S(String str, Throwable th, a0 a0Var) {
        super(str);
        this.f733f = a0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof S) {
                S s3 = (S) obj;
                if (!i.a(s3.getMessage(), getMessage()) || !i.a(s3.f733f, this.f733f) || !i.a(s3.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i3;
        String message = getMessage();
        i.b(message);
        int hashCode = (this.f733f.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i3 = cause.hashCode();
        } else {
            i3 = 0;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f733f;
    }
}
