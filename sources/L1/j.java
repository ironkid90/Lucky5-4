package L1;

import F0.h;

public interface j {
    void b();

    void c(g gVar);

    void d(f fVar, Runnable runnable) {
        h hVar;
        if (fVar == null) {
            hVar = null;
        } else {
            hVar = new h(5, (Object) fVar);
        }
        c(new g(hVar, runnable));
    }

    void e();
}
