package j$.time.chrono;

import j$.time.d;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;

public interface m extends TemporalAccessor, n {
    int p();

    boolean f(r rVar) {
        if (rVar instanceof a) {
            if (rVar == a.ERA) {
                return true;
            }
            return false;
        } else if (rVar == null || !rVar.W(this)) {
            return false;
        } else {
            return true;
        }
    }

    int i(r rVar) {
        if (rVar == a.ERA) {
            return p();
        }
        return super.i(rVar);
    }

    long g(r rVar) {
        if (rVar == a.ERA) {
            return (long) p();
        }
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    Object a(t tVar) {
        if (tVar == s.e()) {
            return b.ERAS;
        }
        return super.a(tVar);
    }

    j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.b((long) p(), a.ERA);
    }
}
