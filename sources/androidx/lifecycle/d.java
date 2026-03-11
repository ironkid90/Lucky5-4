package androidx.lifecycle;

import L.k;

public enum d {
    ;
    
    public static final b Companion = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.d] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.d] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.d] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.d] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.d] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.d] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.d] */
    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.lifecycle.b, java.lang.Object] */
    static {
        Companion = new Object();
    }

    public final e a() {
        switch (c.f2499a[ordinal()]) {
            case 1:
            case k.FLOAT_FIELD_NUMBER:
                return e.f2502h;
            case k.INTEGER_FIELD_NUMBER:
            case k.LONG_FIELD_NUMBER:
                return e.f2503i;
            case k.STRING_FIELD_NUMBER:
                return e.f2504j;
            case k.STRING_SET_FIELD_NUMBER:
                return e.f2500f;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
