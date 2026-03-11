package j$.time.format;

import java.util.concurrent.ConcurrentHashMap;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f5115a = new Object();

    /* access modifiers changed from: package-private */
    public final int a(char c3) {
        int i3 = c3 - '0';
        if (i3 < 0 || i3 > 9) {
            return -1;
        }
        return i3;
    }

    public final int hashCode() {
        return 182;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [j$.time.format.w, java.lang.Object] */
    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        ((w) obj).getClass();
        return true;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
