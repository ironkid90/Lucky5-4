package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

final class a extends b implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    static final a f4989b = new a(ZoneOffset.UTC);
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a  reason: collision with root package name */
    private final ZoneId f4990a;

    static {
        System.currentTimeMillis();
    }

    a(ZoneId zoneId) {
        this.f4990a = zoneId;
    }

    public final ZoneId a() {
        return this.f4990a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f4990a.equals(((a) obj).f4990a);
    }

    public final int hashCode() {
        return this.f4990a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f4990a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
