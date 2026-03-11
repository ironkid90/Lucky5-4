package K2;

import A2.i;

public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f900a;

    public g(Throwable th) {
        this.f900a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (i.a(this.f900a, ((g) obj).f900a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f900a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Closed(" + this.f900a + ')';
    }
}
