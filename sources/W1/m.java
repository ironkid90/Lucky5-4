package w1;

import E1.c;
import java.io.IOException;
import java.io.StringWriter;
import z1.k;
import z1.r;
import z1.u;

public abstract class m {
    public boolean a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final p b() {
        if (this instanceof p) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.f248j = true;
            r rVar = u.f4940a;
            k.d(cVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
