package a1;

import java.util.Set;
import l1.C0313a;

public interface b {
    Object a(Class cls) {
        return d(q.a(cls));
    }

    C0313a b(Class cls) {
        return c(q.a(cls));
    }

    C0313a c(q qVar);

    Object d(q qVar) {
        C0313a c3 = c(qVar);
        if (c3 == null) {
            return null;
        }
        return c3.get();
    }

    Set e(q qVar) {
        return (Set) f(qVar).get();
    }

    C0313a f(q qVar);
}
