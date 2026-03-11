package j$.time.format;

enum m implements f {
    ;

    public final boolean p(t tVar, StringBuilder sb) {
        return true;
    }

    public final int r(q qVar, CharSequence charSequence, int i3) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            qVar.l(true);
        } else if (ordinal == 1) {
            qVar.l(false);
        } else if (ordinal == 2) {
            qVar.p(true);
        } else if (ordinal == 3) {
            qVar.p(false);
        }
        return i3;
    }

    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
