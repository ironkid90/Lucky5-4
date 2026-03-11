package j$.time.temporal;

import j$.time.d;
import java.util.Objects;

public interface TemporalAccessor {
    boolean f(r rVar);

    long g(r rVar);

    w l(r rVar) {
        if (!(rVar instanceof a)) {
            Objects.requireNonNull(rVar, "field");
            return rVar.J(this);
        } else if (f(rVar)) {
            return ((a) rVar).C();
        } else {
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    int i(r rVar) {
        w l3 = l(rVar);
        if (l3.h()) {
            long g2 = g(rVar);
            if (l3.i(g2)) {
                return (int) g2;
            }
            throw new RuntimeException("Invalid value for " + rVar + " (valid values " + l3 + "): " + g2);
        }
        throw new RuntimeException("Invalid field " + rVar + " for get() method, use getLong() instead");
    }

    Object a(t tVar) {
        if (tVar == s.f5180a || tVar == s.f5181b || tVar == s.f5182c) {
            return null;
        }
        return tVar.j(this);
    }
}
