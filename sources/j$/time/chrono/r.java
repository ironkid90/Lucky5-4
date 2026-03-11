package j$.time.chrono;

import j$.time.temporal.a;
import j$.time.temporal.w;

public enum r implements m {
    ;

    public final int p() {
        return 1;
    }

    public final w l(j$.time.temporal.r rVar) {
        if (rVar == a.ERA) {
            return w.j(1, 1);
        }
        return super.l(rVar);
    }
}
