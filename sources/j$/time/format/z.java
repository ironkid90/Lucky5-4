package j$.time.format;

public enum z {
    ;

    /* access modifiers changed from: package-private */
    public final boolean p(boolean z3, boolean z4, boolean z5) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return !z3 || !z4;
        }
        if (ordinal == 1 || ordinal == 4) {
            return true;
        }
        return !z4 && !z5;
    }
}
