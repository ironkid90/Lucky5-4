package A2;

public final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Class f81a;

    public k(Class cls) {
        this.f81a = cls;
    }

    public final Class a() {
        return this.f81a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f81a, ((k) obj).f81a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f81a.hashCode();
    }

    public final String toString() {
        return this.f81a + " (Kotlin reflection is not available)";
    }
}
