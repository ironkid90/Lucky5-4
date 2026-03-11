package androidx.lifecycle;

import A2.i;

public final class b {
    public static d a(e eVar) {
        i.e(eVar, "state");
        int ordinal = eVar.ordinal();
        if (ordinal == 1) {
            return d.ON_CREATE;
        }
        if (ordinal == 2) {
            return d.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return d.ON_RESUME;
    }
}
