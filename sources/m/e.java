package M;

import A2.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f1078a;

    public e(String str) {
        i.e(str, "name");
        this.f1078a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return i.a(this.f1078a, ((e) obj).f1078a);
    }

    public final int hashCode() {
        return this.f1078a.hashCode();
    }

    public final String toString() {
        return this.f1078a;
    }
}
